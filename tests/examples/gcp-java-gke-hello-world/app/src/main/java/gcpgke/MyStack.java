package gcpgke;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

import io.pulumi.Config;
import io.pulumi.Stack;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.container.ClusterArgs;
import io.pulumi.gcp.container.GetEngineVersions;
import io.pulumi.gcp.container.NodePool;
import io.pulumi.gcp.container.NodePoolArgs;
import io.pulumi.gcp.container.inputs.GetEngineVersionsArgs;
import io.pulumi.gcp.container.inputs.NodePoolManagementArgs;
import io.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs;
import io.pulumi.kubernetes.Provider;
import io.pulumi.kubernetes.ProviderArgs;
import io.pulumi.kubernetes.apps_v1.Deployment;
import io.pulumi.kubernetes.apps_v1.DeploymentArgs;
import io.pulumi.kubernetes.apps_v1.inputs.DeploymentSpecArgs;
import io.pulumi.kubernetes.core_v1.Namespace;
import io.pulumi.kubernetes.core_v1.NamespaceArgs;
import io.pulumi.kubernetes.core_v1.Service;
import io.pulumi.kubernetes.core_v1.ServiceArgs;
import io.pulumi.kubernetes.core_v1.enums.ServiceSpecType;
import io.pulumi.kubernetes.core_v1.inputs.ContainerArgs;
import io.pulumi.kubernetes.core_v1.inputs.ContainerPortArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.core_v1.inputs.ServicePortArgs;
import io.pulumi.kubernetes.core_v1.inputs.ServiceSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import io.pulumi.gcp.container.Cluster;
import io.pulumi.resources.CustomResourceOptions;

public final class MyStack extends Stack {

    @OutputExport(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    @OutputExport(name="servicePublicIP", type=String.class, parameters={})
    private Output<String> servicePublicIP;

    @OutputExport(name="deploymentName", type=String.class, parameters={})
    private Output<String> deploymentName;

    @OutputExport(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    @OutputExport(name="kubeconfig", type=String.class, parameters={})
    private Output<String> kubeconfig;

    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    @OutputExport(name="masterVersion", type=String.class, parameters={})
    private Output<String> masterVersion;

    public MyStack() throws Exception {
        final String name = "helloworld";

        final var config = io.pulumi.Config.of();
        final var masterVersion = config.get("masterVersion").orElse(
            GetEngineVersions.invokeAsync(
                GetEngineVersionsArgs.Empty,
                InvokeOptions.Empty
            ).thenApply(thing -> thing.getLatestMasterVersion()).get());
        
        this.masterVersion = Output.of(masterVersion);

        // Create a GKE cluster
        // We can't create a cluster with no node pool defined, but we want to only use
        // separately managed node pools. So we create the smallest possible default
        // node pool and immediately delete it.
        final var cluster = new Cluster(name,
            $ -> $.initialNodeCount(1)
            .removeDefaultNodePool(true)
            .minMasterVersion(masterVersion)
        );

        final var nodePool = new NodePool("primary-node-pool",
            NodePoolArgs.builder()
            .cluster(cluster.getName().toInput())
            .location(cluster.getLocation().toInput())
            .version(masterVersion)
            .initialNodeCount(2)
            .nodeConfig(NodePoolNodeConfigArgs.builder()
                .preemptible(true)
                .machineType("n1-standard-1")
                .oauthScopes(List.of(
                    "https://www.googleapis.com/auth/compute",
                    "https://www.googleapis.com/auth/devstorage.read_only",
                    "https://www.googleapis.com/auth/logging.write",
                    "https://www.googleapis.com/auth/monitoring"
                ))
                .build()
            )
            .management(NodePoolManagementArgs.builder()
                .autoRepair(true)
                .build()
            )
            .build(),
            CustomResourceOptions.builder()
            .setDependsOn(List.of(cluster))
            .build());
        this.clusterName = cluster.getName();
    
        // Manufacture a GKE-style kubeconfig. Note that this is slightly "different"
        // because of the way GKE requires gcloud to be in the picture for cluster
        // authentication (rather than using the client cert/key directly).
        final var gcpConfig = new io.pulumi.gcp.Config();
        var clusterName = gcpConfig.project().get() + "_" + gcpConfig.zone().get() + "_" + name;

        var masterAuthClusterCaCertificate = cluster.getMasterAuth().applyOptional(args -> args.getClusterCaCertificate());
        this.kubeconfig = cluster.getEndpoint()
            .apply(endpoint -> masterAuthClusterCaCertificate.applyValue(
                caCert -> {
                    var retval = MessageFormat.format(String.join("\n",
                        "apiVersion: v1",
                        "clusters:",
                        "- cluster:",
                        "    certificate-authority-data: {2}",
                        "    server: https://{1}",
                        "  name: {0}",
                        "contexts:",
                        "- context:",
                        "    cluster: {0}",
                        "    user: {0}",
                        "  name: {0}",
                        "current-context: {0}",
                        "kind: Config",
                        "preferences: '{}'",
                        "users:",
                        "- name: {0}",
                        "  user:",
                        "    auth-provider:",
                        "      config:",
                        "        cmd-args: config config-helper --format=json",
                        "        cmd-path: gcloud",
                        "        expiry-key: \"'{.credential.token_expiry}'\"",
                        "        token-key: \"'{.credential.access_token}'\"",
                        "      name: gcp"
                    ), clusterName, endpoint, caCert);
                    return retval;
                }
            ));

        // Create a Kubernetes provider instance that uses our cluster from above.
        final var clusterProvider = new Provider(name,
            ProviderArgs.builder()
                .kubeconfig(this.kubeconfig.toInput())
                .build(),
            CustomResourceOptions.builder()
                .setDependsOn(List.of(nodePool, cluster))
                .build());
        final var clusterResourceOptions = CustomResourceOptions.builder()
            .setProvider(clusterProvider)
            .build();

        // Create a Kubernetes Namespace
        final var ns = new Namespace(name,
            NamespaceArgs.Empty,
            clusterResourceOptions
        );

        // Export the Namespace name
        this.namespaceName = ns.getMetadata().applyOptional(arg0 -> arg0.getName());

        final var appLabels = Map.of("appClass", name);
        
        final var metadata = ObjectMetaArgs.builder()
                .namespace(namespaceName.toInput())
                .labels(appLabels)
                .build();

        // Create a NGINX Deployment
        final var deployment = new Deployment(name, DeploymentArgs.builder()
            .metadata(metadata)
            .spec(DeploymentSpecArgs.builder()
                .replicas(1)
                .selector(LabelSelectorArgs.builder()
                    .matchLabels(appLabels)
                    .build())
                .template(PodTemplateSpecArgs.builder()
                    .metadata(metadata)
                    .spec(PodSpecArgs.builder()
                        .containers(List.of(ContainerArgs.builder()
                            .name(name)
                            .image("nginx:latest")
                            .ports(List.of(ContainerPortArgs.builder()
                                .name("http")
                                .containerPort(80)
                                .build()))
                            .build()))
                        .build())
                    .build())
                .build())
            .build(), clusterResourceOptions);

        // Export the Deployment name
        this.deploymentName = deployment.getMetadata().applyOptional(arg0 -> arg0.getName());

        // Create a LoadBalancer Service for the NGINX Deployment
        final var service = new Service(name, ServiceArgs.builder()
            .metadata(metadata)
            .spec(ServiceSpecArgs.builder()
                .type(Input.ofRight(ServiceSpecType.LoadBalancer))
                .ports(List.of(ServicePortArgs.builder()
                    .port(80)
                    .targetPort(Input.ofRight("http"))
                    .build()))
                .selector(appLabels)
                .build())
            .build(), clusterResourceOptions);

        // Export the Service name and public LoadBalancer endpoint
        this.serviceName = service.getMetadata().applyOptional(arg0 -> arg0.getName());
        this.servicePublicIP = service.getStatus()
            .applyOptional(arg0 -> arg0.getLoadBalancer())
            .applyOptional(arg0 -> arg0.getIngress().get(0).getIp());
    }
}
