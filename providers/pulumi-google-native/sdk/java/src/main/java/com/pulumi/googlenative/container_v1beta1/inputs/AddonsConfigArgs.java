// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.CloudRunConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.ConfigConnectorConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.DnsCacheConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.GcePersistentDiskCsiDriverConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.GcpFilestoreCsiDriverConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.GkeBackupAgentConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.HorizontalPodAutoscalingArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.HttpLoadBalancingArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.IstioConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.KalmConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.KubernetesDashboardArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.NetworkPolicyConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for the addons that can be automatically spun up in the cluster, enabling additional functionality.
 * 
 */
public final class AddonsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AddonsConfigArgs Empty = new AddonsConfigArgs();

    /**
     * Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
     * 
     */
    @Import(name="cloudRunConfig")
    private @Nullable Output<CloudRunConfigArgs> cloudRunConfig;

    /**
     * @return Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
     * 
     */
    public Optional<Output<CloudRunConfigArgs>> cloudRunConfig() {
        return Optional.ofNullable(this.cloudRunConfig);
    }

    /**
     * Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
     * 
     */
    @Import(name="configConnectorConfig")
    private @Nullable Output<ConfigConnectorConfigArgs> configConnectorConfig;

    /**
     * @return Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
     * 
     */
    public Optional<Output<ConfigConnectorConfigArgs>> configConnectorConfig() {
        return Optional.ofNullable(this.configConnectorConfig);
    }

    /**
     * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
     * 
     */
    @Import(name="dnsCacheConfig")
    private @Nullable Output<DnsCacheConfigArgs> dnsCacheConfig;

    /**
     * @return Configuration for NodeLocalDNS, a dns cache running on cluster nodes
     * 
     */
    public Optional<Output<DnsCacheConfigArgs>> dnsCacheConfig() {
        return Optional.ofNullable(this.dnsCacheConfig);
    }

    /**
     * Configuration for the Compute Engine Persistent Disk CSI driver.
     * 
     */
    @Import(name="gcePersistentDiskCsiDriverConfig")
    private @Nullable Output<GcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig;

    /**
     * @return Configuration for the Compute Engine Persistent Disk CSI driver.
     * 
     */
    public Optional<Output<GcePersistentDiskCsiDriverConfigArgs>> gcePersistentDiskCsiDriverConfig() {
        return Optional.ofNullable(this.gcePersistentDiskCsiDriverConfig);
    }

    /**
     * Configuration for the GCP Filestore CSI driver.
     * 
     */
    @Import(name="gcpFilestoreCsiDriverConfig")
    private @Nullable Output<GcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig;

    /**
     * @return Configuration for the GCP Filestore CSI driver.
     * 
     */
    public Optional<Output<GcpFilestoreCsiDriverConfigArgs>> gcpFilestoreCsiDriverConfig() {
        return Optional.ofNullable(this.gcpFilestoreCsiDriverConfig);
    }

    /**
     * Configuration for the Backup for GKE agent addon.
     * 
     */
    @Import(name="gkeBackupAgentConfig")
    private @Nullable Output<GkeBackupAgentConfigArgs> gkeBackupAgentConfig;

    /**
     * @return Configuration for the Backup for GKE agent addon.
     * 
     */
    public Optional<Output<GkeBackupAgentConfigArgs>> gkeBackupAgentConfig() {
        return Optional.ofNullable(this.gkeBackupAgentConfig);
    }

    /**
     * Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
     * 
     */
    @Import(name="horizontalPodAutoscaling")
    private @Nullable Output<HorizontalPodAutoscalingArgs> horizontalPodAutoscaling;

    /**
     * @return Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
     * 
     */
    public Optional<Output<HorizontalPodAutoscalingArgs>> horizontalPodAutoscaling() {
        return Optional.ofNullable(this.horizontalPodAutoscaling);
    }

    /**
     * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
     * 
     */
    @Import(name="httpLoadBalancing")
    private @Nullable Output<HttpLoadBalancingArgs> httpLoadBalancing;

    /**
     * @return Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
     * 
     */
    public Optional<Output<HttpLoadBalancingArgs>> httpLoadBalancing() {
        return Optional.ofNullable(this.httpLoadBalancing);
    }

    /**
     * Configuration for Istio, an open platform to connect, manage, and secure microservices.
     * 
     */
    @Import(name="istioConfig")
    private @Nullable Output<IstioConfigArgs> istioConfig;

    /**
     * @return Configuration for Istio, an open platform to connect, manage, and secure microservices.
     * 
     */
    public Optional<Output<IstioConfigArgs>> istioConfig() {
        return Optional.ofNullable(this.istioConfig);
    }

    /**
     * Configuration for the KALM addon, which manages the lifecycle of k8s applications.
     * 
     */
    @Import(name="kalmConfig")
    private @Nullable Output<KalmConfigArgs> kalmConfig;

    /**
     * @return Configuration for the KALM addon, which manages the lifecycle of k8s applications.
     * 
     */
    public Optional<Output<KalmConfigArgs>> kalmConfig() {
        return Optional.ofNullable(this.kalmConfig);
    }

    /**
     * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
     * 
     */
    @Import(name="kubernetesDashboard")
    private @Nullable Output<KubernetesDashboardArgs> kubernetesDashboard;

    /**
     * @return Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
     * 
     */
    public Optional<Output<KubernetesDashboardArgs>> kubernetesDashboard() {
        return Optional.ofNullable(this.kubernetesDashboard);
    }

    /**
     * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
     * 
     */
    @Import(name="networkPolicyConfig")
    private @Nullable Output<NetworkPolicyConfigArgs> networkPolicyConfig;

    /**
     * @return Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
     * 
     */
    public Optional<Output<NetworkPolicyConfigArgs>> networkPolicyConfig() {
        return Optional.ofNullable(this.networkPolicyConfig);
    }

    private AddonsConfigArgs() {}

    private AddonsConfigArgs(AddonsConfigArgs $) {
        this.cloudRunConfig = $.cloudRunConfig;
        this.configConnectorConfig = $.configConnectorConfig;
        this.dnsCacheConfig = $.dnsCacheConfig;
        this.gcePersistentDiskCsiDriverConfig = $.gcePersistentDiskCsiDriverConfig;
        this.gcpFilestoreCsiDriverConfig = $.gcpFilestoreCsiDriverConfig;
        this.gkeBackupAgentConfig = $.gkeBackupAgentConfig;
        this.horizontalPodAutoscaling = $.horizontalPodAutoscaling;
        this.httpLoadBalancing = $.httpLoadBalancing;
        this.istioConfig = $.istioConfig;
        this.kalmConfig = $.kalmConfig;
        this.kubernetesDashboard = $.kubernetesDashboard;
        this.networkPolicyConfig = $.networkPolicyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddonsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddonsConfigArgs $;

        public Builder() {
            $ = new AddonsConfigArgs();
        }

        public Builder(AddonsConfigArgs defaults) {
            $ = new AddonsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudRunConfig Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
         * 
         * @return builder
         * 
         */
        public Builder cloudRunConfig(@Nullable Output<CloudRunConfigArgs> cloudRunConfig) {
            $.cloudRunConfig = cloudRunConfig;
            return this;
        }

        /**
         * @param cloudRunConfig Configuration for the Cloud Run addon. The `IstioConfig` addon must be enabled in order to enable Cloud Run addon. This option can only be enabled at cluster creation time.
         * 
         * @return builder
         * 
         */
        public Builder cloudRunConfig(CloudRunConfigArgs cloudRunConfig) {
            return cloudRunConfig(Output.of(cloudRunConfig));
        }

        /**
         * @param configConnectorConfig Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
         * 
         * @return builder
         * 
         */
        public Builder configConnectorConfig(@Nullable Output<ConfigConnectorConfigArgs> configConnectorConfig) {
            $.configConnectorConfig = configConnectorConfig;
            return this;
        }

        /**
         * @param configConnectorConfig Configuration for the ConfigConnector add-on, a Kubernetes extension to manage hosted GCP services through the Kubernetes API
         * 
         * @return builder
         * 
         */
        public Builder configConnectorConfig(ConfigConnectorConfigArgs configConnectorConfig) {
            return configConnectorConfig(Output.of(configConnectorConfig));
        }

        /**
         * @param dnsCacheConfig Configuration for NodeLocalDNS, a dns cache running on cluster nodes
         * 
         * @return builder
         * 
         */
        public Builder dnsCacheConfig(@Nullable Output<DnsCacheConfigArgs> dnsCacheConfig) {
            $.dnsCacheConfig = dnsCacheConfig;
            return this;
        }

        /**
         * @param dnsCacheConfig Configuration for NodeLocalDNS, a dns cache running on cluster nodes
         * 
         * @return builder
         * 
         */
        public Builder dnsCacheConfig(DnsCacheConfigArgs dnsCacheConfig) {
            return dnsCacheConfig(Output.of(dnsCacheConfig));
        }

        /**
         * @param gcePersistentDiskCsiDriverConfig Configuration for the Compute Engine Persistent Disk CSI driver.
         * 
         * @return builder
         * 
         */
        public Builder gcePersistentDiskCsiDriverConfig(@Nullable Output<GcePersistentDiskCsiDriverConfigArgs> gcePersistentDiskCsiDriverConfig) {
            $.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
            return this;
        }

        /**
         * @param gcePersistentDiskCsiDriverConfig Configuration for the Compute Engine Persistent Disk CSI driver.
         * 
         * @return builder
         * 
         */
        public Builder gcePersistentDiskCsiDriverConfig(GcePersistentDiskCsiDriverConfigArgs gcePersistentDiskCsiDriverConfig) {
            return gcePersistentDiskCsiDriverConfig(Output.of(gcePersistentDiskCsiDriverConfig));
        }

        /**
         * @param gcpFilestoreCsiDriverConfig Configuration for the GCP Filestore CSI driver.
         * 
         * @return builder
         * 
         */
        public Builder gcpFilestoreCsiDriverConfig(@Nullable Output<GcpFilestoreCsiDriverConfigArgs> gcpFilestoreCsiDriverConfig) {
            $.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
            return this;
        }

        /**
         * @param gcpFilestoreCsiDriverConfig Configuration for the GCP Filestore CSI driver.
         * 
         * @return builder
         * 
         */
        public Builder gcpFilestoreCsiDriverConfig(GcpFilestoreCsiDriverConfigArgs gcpFilestoreCsiDriverConfig) {
            return gcpFilestoreCsiDriverConfig(Output.of(gcpFilestoreCsiDriverConfig));
        }

        /**
         * @param gkeBackupAgentConfig Configuration for the Backup for GKE agent addon.
         * 
         * @return builder
         * 
         */
        public Builder gkeBackupAgentConfig(@Nullable Output<GkeBackupAgentConfigArgs> gkeBackupAgentConfig) {
            $.gkeBackupAgentConfig = gkeBackupAgentConfig;
            return this;
        }

        /**
         * @param gkeBackupAgentConfig Configuration for the Backup for GKE agent addon.
         * 
         * @return builder
         * 
         */
        public Builder gkeBackupAgentConfig(GkeBackupAgentConfigArgs gkeBackupAgentConfig) {
            return gkeBackupAgentConfig(Output.of(gkeBackupAgentConfig));
        }

        /**
         * @param horizontalPodAutoscaling Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
         * 
         * @return builder
         * 
         */
        public Builder horizontalPodAutoscaling(@Nullable Output<HorizontalPodAutoscalingArgs> horizontalPodAutoscaling) {
            $.horizontalPodAutoscaling = horizontalPodAutoscaling;
            return this;
        }

        /**
         * @param horizontalPodAutoscaling Configuration for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
         * 
         * @return builder
         * 
         */
        public Builder horizontalPodAutoscaling(HorizontalPodAutoscalingArgs horizontalPodAutoscaling) {
            return horizontalPodAutoscaling(Output.of(horizontalPodAutoscaling));
        }

        /**
         * @param httpLoadBalancing Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpLoadBalancing(@Nullable Output<HttpLoadBalancingArgs> httpLoadBalancing) {
            $.httpLoadBalancing = httpLoadBalancing;
            return this;
        }

        /**
         * @param httpLoadBalancing Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpLoadBalancing(HttpLoadBalancingArgs httpLoadBalancing) {
            return httpLoadBalancing(Output.of(httpLoadBalancing));
        }

        /**
         * @param istioConfig Configuration for Istio, an open platform to connect, manage, and secure microservices.
         * 
         * @return builder
         * 
         */
        public Builder istioConfig(@Nullable Output<IstioConfigArgs> istioConfig) {
            $.istioConfig = istioConfig;
            return this;
        }

        /**
         * @param istioConfig Configuration for Istio, an open platform to connect, manage, and secure microservices.
         * 
         * @return builder
         * 
         */
        public Builder istioConfig(IstioConfigArgs istioConfig) {
            return istioConfig(Output.of(istioConfig));
        }

        /**
         * @param kalmConfig Configuration for the KALM addon, which manages the lifecycle of k8s applications.
         * 
         * @return builder
         * 
         */
        public Builder kalmConfig(@Nullable Output<KalmConfigArgs> kalmConfig) {
            $.kalmConfig = kalmConfig;
            return this;
        }

        /**
         * @param kalmConfig Configuration for the KALM addon, which manages the lifecycle of k8s applications.
         * 
         * @return builder
         * 
         */
        public Builder kalmConfig(KalmConfigArgs kalmConfig) {
            return kalmConfig(Output.of(kalmConfig));
        }

        /**
         * @param kubernetesDashboard Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
         * 
         * @return builder
         * 
         */
        public Builder kubernetesDashboard(@Nullable Output<KubernetesDashboardArgs> kubernetesDashboard) {
            $.kubernetesDashboard = kubernetesDashboard;
            return this;
        }

        /**
         * @param kubernetesDashboard Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes clusters, workloads and applications. For more information, see: https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
         * 
         * @return builder
         * 
         */
        public Builder kubernetesDashboard(KubernetesDashboardArgs kubernetesDashboard) {
            return kubernetesDashboard(Output.of(kubernetesDashboard));
        }

        /**
         * @param networkPolicyConfig Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyConfig(@Nullable Output<NetworkPolicyConfigArgs> networkPolicyConfig) {
            $.networkPolicyConfig = networkPolicyConfig;
            return this;
        }

        /**
         * @param networkPolicyConfig Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyConfig(NetworkPolicyConfigArgs networkPolicyConfig) {
            return networkPolicyConfig(Output.of(networkPolicyConfig));
        }

        public AddonsConfigArgs build() {
            return $;
        }
    }

}
