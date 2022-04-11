// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.eks.ClusterArgs;
import io.pulumi.aws.eks.inputs.ClusterState;
import io.pulumi.aws.eks.outputs.ClusterCertificateAuthority;
import io.pulumi.aws.eks.outputs.ClusterEncryptionConfig;
import io.pulumi.aws.eks.outputs.ClusterIdentity;
import io.pulumi.aws.eks.outputs.ClusterKubernetesNetworkConfig;
import io.pulumi.aws.eks.outputs.ClusterVpcConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EKS Cluster.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EKS Clusters can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:eks/cluster:Cluster my_cluster my_cluster
 * ```
 * 
 */
@ResourceType(type="aws:eks/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the cluster.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the cluster.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
     * 
     */
    @Export(name="certificateAuthority", type=ClusterCertificateAuthority.class, parameters={})
    private Output<ClusterCertificateAuthority> certificateAuthority;

    /**
     * @return Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
     * 
     */
    public Output<ClusterCertificateAuthority> getCertificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * Unix epoch timestamp in seconds for when the cluster was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Unix epoch timestamp in seconds for when the cluster was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
     * 
     */
    @Export(name="enabledClusterLogTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> enabledClusterLogTypes;

    /**
     * @return List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
     * 
     */
    public Output</* @Nullable */ List<String>> getEnabledClusterLogTypes() {
        return this.enabledClusterLogTypes;
    }
    /**
     * Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
     * 
     */
    @Export(name="encryptionConfig", type=ClusterEncryptionConfig.class, parameters={})
    private Output</* @Nullable */ ClusterEncryptionConfig> encryptionConfig;

    /**
     * @return Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
     * 
     */
    public Output</* @Nullable */ ClusterEncryptionConfig> getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * Endpoint for your Kubernetes API server.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return Endpoint for your Kubernetes API server.
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
     * 
     */
    @Export(name="identities", type=List.class, parameters={ClusterIdentity.class})
    private Output<List<ClusterIdentity>> identities;

    /**
     * @return Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
     * 
     */
    public Output<List<ClusterIdentity>> getIdentities() {
        return this.identities;
    }
    /**
     * Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Export(name="kubernetesNetworkConfig", type=ClusterKubernetesNetworkConfig.class, parameters={})
    private Output<ClusterKubernetesNetworkConfig> kubernetesNetworkConfig;

    /**
     * @return Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Output<ClusterKubernetesNetworkConfig> getKubernetesNetworkConfig() {
        return this.kubernetesNetworkConfig;
    }
    /**
     * Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Platform version for the cluster.
     * 
     */
    @Export(name="platformVersion", type=String.class, parameters={})
    private Output<String> platformVersion;

    /**
     * @return Platform version for the cluster.
     * 
     */
    public Output<String> getPlatformVersion() {
        return this.platformVersion;
    }
    /**
     * ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Key-value map of resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }
    /**
     * Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
     * 
     */
    @Export(name="vpcConfig", type=ClusterVpcConfig.class, parameters={})
    private Output<ClusterVpcConfig> vpcConfig;

    /**
     * @return Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
     * 
     */
    public Output<ClusterVpcConfig> getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
