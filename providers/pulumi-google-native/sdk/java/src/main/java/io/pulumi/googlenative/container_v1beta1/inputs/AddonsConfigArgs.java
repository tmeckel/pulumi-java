// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.CloudRunConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.ConfigConnectorConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.DnsCacheConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.GcePersistentDiskCsiDriverConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.GcpFilestoreCsiDriverConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.GkeBackupAgentConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.HorizontalPodAutoscalingArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.HttpLoadBalancingArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.IstioConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.KalmConfigArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.KubernetesDashboardArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.NetworkPolicyConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the addons that can be automatically spun up in the cluster, enabling additional functionality.
 * 
 */
public final class AddonsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddonsConfigArgs Empty = new AddonsConfigArgs();

    /**
     * Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
     * 
     */
    @InputImport(name="cloudRunConfig")
    private final @Nullable Input<CloudRunConfigArgs> cloudRunConfig;

    public Input<CloudRunConfigArgs> getCloudRunConfig() {
        return this.cloudRunConfig == null ? Input.empty() : this.cloudRunConfig;
    }

    /**
     * Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
     * 
     */
    @InputImport(name="configConnectorConfig")
    private final @Nullable Input<ConfigConnectorConfigArgs> configConnectorConfig;

    public Input<ConfigConnectorConfigArgs> getConfigConnectorConfig() {
        return this.configConnectorConfig == null ? Input.empty() : this.configConnectorConfig;
    }

    /**
     * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
     * 
     */
    @InputImport(name="dnsCacheConfig")
    private final @Nullable Input<DnsCacheConfigArgs> dnsCacheConfig;

    public Input<DnsCacheConfigArgs> getDnsCacheConfig() {
        return this.dnsCacheConfig == null ? Input.empty() : this.dnsCacheConfig;
    }

    /**
     * Configuration for the Compute Engine Persistent Disk CSI driver.
     * 
     */
    @InputImport(name="gcePersistentDiskCsiDriverConfig")
    private final @Nullable Input<GcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig;

    public Input<GcePersistentDiskCsiDriverConfigArgs> getGcePersistentDiskCsiDriverConfig() {
        return this.gcePersistentDiskCsiDriverConfig == null ? Input.empty() : this.gcePersistentDiskCsiDriverConfig;
    }

    /**
     * Configuration for the GCP Filestore CSI driver.
     * 
     */
    @InputImport(name="gcpFilestoreCsiDriverConfig")
    private final @Nullable Input<GcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig;

    public Input<GcpFilestoreCsiDriverConfigArgs> getGcpFilestoreCsiDriverConfig() {
        return this.gcpFilestoreCsiDriverConfig == null ? Input.empty() : this.gcpFilestoreCsiDriverConfig;
    }

    /**
     * Configuration for the Backup for GKE agent addon.
     * 
     */
    @InputImport(name="gkeBackupAgentConfig")
    private final @Nullable Input<GkeBackupAgentConfigArgs> gkeBackupAgentConfig;

    public Input<GkeBackupAgentConfigArgs> getGkeBackupAgentConfig() {
        return this.gkeBackupAgentConfig == null ? Input.empty() : this.gkeBackupAgentConfig;
    }

    /**
     * Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
     * 
     */
    @InputImport(name="horizontalPodAutoscaling")
    private final @Nullable Input<HorizontalPodAutoscalingArgs> horizontalPodAutoscaling;

    public Input<HorizontalPodAutoscalingArgs> getHorizontalPodAutoscaling() {
        return this.horizontalPodAutoscaling == null ? Input.empty() : this.horizontalPodAutoscaling;
    }

    /**
     * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
     * 
     */
    @InputImport(name="httpLoadBalancing")
    private final @Nullable Input<HttpLoadBalancingArgs> httpLoadBalancing;

    public Input<HttpLoadBalancingArgs> getHttpLoadBalancing() {
        return this.httpLoadBalancing == null ? Input.empty() : this.httpLoadBalancing;
    }

    /**
     * Configuration for Istio, an open platform to connect, manage, and secure microservices.
     * 
     */
    @InputImport(name="istioConfig")
    private final @Nullable Input<IstioConfigArgs> istioConfig;

    public Input<IstioConfigArgs> getIstioConfig() {
        return this.istioConfig == null ? Input.empty() : this.istioConfig;
    }

    /**
     * Configuration for the KALM addon, which manages the lifecycle of k8s applications.
     * 
     */
    @InputImport(name="kalmConfig")
    private final @Nullable Input<KalmConfigArgs> kalmConfig;

    public Input<KalmConfigArgs> getKalmConfig() {
        return this.kalmConfig == null ? Input.empty() : this.kalmConfig;
    }

    /**
     * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
     * 
     */
    @InputImport(name="kubernetesDashboard")
    private final @Nullable Input<KubernetesDashboardArgs> kubernetesDashboard;

    public Input<KubernetesDashboardArgs> getKubernetesDashboard() {
        return this.kubernetesDashboard == null ? Input.empty() : this.kubernetesDashboard;
    }

    /**
     * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
     * 
     */
    @InputImport(name="networkPolicyConfig")
    private final @Nullable Input<NetworkPolicyConfigArgs> networkPolicyConfig;

    public Input<NetworkPolicyConfigArgs> getNetworkPolicyConfig() {
        return this.networkPolicyConfig == null ? Input.empty() : this.networkPolicyConfig;
    }

    public AddonsConfigArgs(
        @Nullable Input<CloudRunConfigArgs> cloudRunConfig,
        @Nullable Input<ConfigConnectorConfigArgs> configConnectorConfig,
        @Nullable Input<DnsCacheConfigArgs> dnsCacheConfig,
        @Nullable Input<GcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig,
        @Nullable Input<GcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig,
        @Nullable Input<GkeBackupAgentConfigArgs> gkeBackupAgentConfig,
        @Nullable Input<HorizontalPodAutoscalingArgs> horizontalPodAutoscaling,
        @Nullable Input<HttpLoadBalancingArgs> httpLoadBalancing,
        @Nullable Input<IstioConfigArgs> istioConfig,
        @Nullable Input<KalmConfigArgs> kalmConfig,
        @Nullable Input<KubernetesDashboardArgs> kubernetesDashboard,
        @Nullable Input<NetworkPolicyConfigArgs> networkPolicyConfig) {
        this.cloudRunConfig = cloudRunConfig;
        this.configConnectorConfig = configConnectorConfig;
        this.dnsCacheConfig = dnsCacheConfig;
        this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
        this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
        this.gkeBackupAgentConfig = gkeBackupAgentConfig;
        this.horizontalPodAutoscaling = horizontalPodAutoscaling;
        this.httpLoadBalancing = httpLoadBalancing;
        this.istioConfig = istioConfig;
        this.kalmConfig = kalmConfig;
        this.kubernetesDashboard = kubernetesDashboard;
        this.networkPolicyConfig = networkPolicyConfig;
    }

    private AddonsConfigArgs() {
        this.cloudRunConfig = Input.empty();
        this.configConnectorConfig = Input.empty();
        this.dnsCacheConfig = Input.empty();
        this.gcePersistentDiskCsiDriverConfig = Input.empty();
        this.gcpFilestoreCsiDriverConfig = Input.empty();
        this.gkeBackupAgentConfig = Input.empty();
        this.horizontalPodAutoscaling = Input.empty();
        this.httpLoadBalancing = Input.empty();
        this.istioConfig = Input.empty();
        this.kalmConfig = Input.empty();
        this.kubernetesDashboard = Input.empty();
        this.networkPolicyConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CloudRunConfigArgs> cloudRunConfig;
        private @Nullable Input<ConfigConnectorConfigArgs> configConnectorConfig;
        private @Nullable Input<DnsCacheConfigArgs> dnsCacheConfig;
        private @Nullable Input<GcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig;
        private @Nullable Input<GcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig;
        private @Nullable Input<GkeBackupAgentConfigArgs> gkeBackupAgentConfig;
        private @Nullable Input<HorizontalPodAutoscalingArgs> horizontalPodAutoscaling;
        private @Nullable Input<HttpLoadBalancingArgs> httpLoadBalancing;
        private @Nullable Input<IstioConfigArgs> istioConfig;
        private @Nullable Input<KalmConfigArgs> kalmConfig;
        private @Nullable Input<KubernetesDashboardArgs> kubernetesDashboard;
        private @Nullable Input<NetworkPolicyConfigArgs> networkPolicyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AddonsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRunConfig = defaults.cloudRunConfig;
    	      this.configConnectorConfig = defaults.configConnectorConfig;
    	      this.dnsCacheConfig = defaults.dnsCacheConfig;
    	      this.gcePersistentDiskCsiDriverConfig = defaults.gcePersistentDiskCsiDriverConfig;
    	      this.gcpFilestoreCsiDriverConfig = defaults.gcpFilestoreCsiDriverConfig;
    	      this.gkeBackupAgentConfig = defaults.gkeBackupAgentConfig;
    	      this.horizontalPodAutoscaling = defaults.horizontalPodAutoscaling;
    	      this.httpLoadBalancing = defaults.httpLoadBalancing;
    	      this.istioConfig = defaults.istioConfig;
    	      this.kalmConfig = defaults.kalmConfig;
    	      this.kubernetesDashboard = defaults.kubernetesDashboard;
    	      this.networkPolicyConfig = defaults.networkPolicyConfig;
        }

        public Builder setCloudRunConfig(@Nullable Input<CloudRunConfigArgs> cloudRunConfig) {
            this.cloudRunConfig = cloudRunConfig;
            return this;
        }

        public Builder setCloudRunConfig(@Nullable CloudRunConfigArgs cloudRunConfig) {
            this.cloudRunConfig = Input.ofNullable(cloudRunConfig);
            return this;
        }

        public Builder setConfigConnectorConfig(@Nullable Input<ConfigConnectorConfigArgs> configConnectorConfig) {
            this.configConnectorConfig = configConnectorConfig;
            return this;
        }

        public Builder setConfigConnectorConfig(@Nullable ConfigConnectorConfigArgs configConnectorConfig) {
            this.configConnectorConfig = Input.ofNullable(configConnectorConfig);
            return this;
        }

        public Builder setDnsCacheConfig(@Nullable Input<DnsCacheConfigArgs> dnsCacheConfig) {
            this.dnsCacheConfig = dnsCacheConfig;
            return this;
        }

        public Builder setDnsCacheConfig(@Nullable DnsCacheConfigArgs dnsCacheConfig) {
            this.dnsCacheConfig = Input.ofNullable(dnsCacheConfig);
            return this;
        }

        public Builder setGcePersistentDiskCsiDriverConfig(@Nullable Input<GcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig) {
            this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
            return this;
        }

        public Builder setGcePersistentDiskCsiDriverConfig(@Nullable GcePersistentDiskCsiDriverConfigArgs gcePersistentDiskCsiDriverConfig) {
            this.gcePersistentDiskCsiDriverConfig = Input.ofNullable(gcePersistentDiskCsiDriverConfig);
            return this;
        }

        public Builder setGcpFilestoreCsiDriverConfig(@Nullable Input<GcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig) {
            this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
            return this;
        }

        public Builder setGcpFilestoreCsiDriverConfig(@Nullable GcpFilestoreCsiDriverConfigArgs gcpFilestoreCsiDriverConfig) {
            this.gcpFilestoreCsiDriverConfig = Input.ofNullable(gcpFilestoreCsiDriverConfig);
            return this;
        }

        public Builder setGkeBackupAgentConfig(@Nullable Input<GkeBackupAgentConfigArgs> gkeBackupAgentConfig) {
            this.gkeBackupAgentConfig = gkeBackupAgentConfig;
            return this;
        }

        public Builder setGkeBackupAgentConfig(@Nullable GkeBackupAgentConfigArgs gkeBackupAgentConfig) {
            this.gkeBackupAgentConfig = Input.ofNullable(gkeBackupAgentConfig);
            return this;
        }

        public Builder setHorizontalPodAutoscaling(@Nullable Input<HorizontalPodAutoscalingArgs> horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = horizontalPodAutoscaling;
            return this;
        }

        public Builder setHorizontalPodAutoscaling(@Nullable HorizontalPodAutoscalingArgs horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = Input.ofNullable(horizontalPodAutoscaling);
            return this;
        }

        public Builder setHttpLoadBalancing(@Nullable Input<HttpLoadBalancingArgs> httpLoadBalancing) {
            this.httpLoadBalancing = httpLoadBalancing;
            return this;
        }

        public Builder setHttpLoadBalancing(@Nullable HttpLoadBalancingArgs httpLoadBalancing) {
            this.httpLoadBalancing = Input.ofNullable(httpLoadBalancing);
            return this;
        }

        public Builder setIstioConfig(@Nullable Input<IstioConfigArgs> istioConfig) {
            this.istioConfig = istioConfig;
            return this;
        }

        public Builder setIstioConfig(@Nullable IstioConfigArgs istioConfig) {
            this.istioConfig = Input.ofNullable(istioConfig);
            return this;
        }

        public Builder setKalmConfig(@Nullable Input<KalmConfigArgs> kalmConfig) {
            this.kalmConfig = kalmConfig;
            return this;
        }

        public Builder setKalmConfig(@Nullable KalmConfigArgs kalmConfig) {
            this.kalmConfig = Input.ofNullable(kalmConfig);
            return this;
        }

        public Builder setKubernetesDashboard(@Nullable Input<KubernetesDashboardArgs> kubernetesDashboard) {
            this.kubernetesDashboard = kubernetesDashboard;
            return this;
        }

        public Builder setKubernetesDashboard(@Nullable KubernetesDashboardArgs kubernetesDashboard) {
            this.kubernetesDashboard = Input.ofNullable(kubernetesDashboard);
            return this;
        }

        public Builder setNetworkPolicyConfig(@Nullable Input<NetworkPolicyConfigArgs> networkPolicyConfig) {
            this.networkPolicyConfig = networkPolicyConfig;
            return this;
        }

        public Builder setNetworkPolicyConfig(@Nullable NetworkPolicyConfigArgs networkPolicyConfig) {
            this.networkPolicyConfig = Input.ofNullable(networkPolicyConfig);
            return this;
        }

        public AddonsConfigArgs build() {
            return new AddonsConfigArgs(cloudRunConfig, configConnectorConfig, dnsCacheConfig, gcePersistentDiskCsiDriverConfig, gcpFilestoreCsiDriverConfig, gkeBackupAgentConfig, horizontalPodAutoscaling, httpLoadBalancing, istioConfig, kalmConfig, kubernetesDashboard, networkPolicyConfig);
        }
    }
}
