// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.AdvancedMachineFeaturesResponse;
import io.pulumi.googlenative.container_v1.outputs.GcfsConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.LinuxNodeConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.NodeKubeletConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.NodeTaintResponse;
import io.pulumi.googlenative.container_v1.outputs.ReservationAffinityResponse;
import io.pulumi.googlenative.container_v1.outputs.SandboxConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.ShieldedInstanceConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.VirtualNICResponse;
import io.pulumi.googlenative.container_v1.outputs.WorkloadMetadataConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class NodeConfigResponse {
    /**
     * A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
     * 
     */
    private final List<AcceleratorConfigResponse> accelerators;
    /**
     * Advanced features for the Compute Engine VM.
     * 
     */
    private final AdvancedMachineFeaturesResponse advancedMachineFeatures;
    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    private final String bootDiskKmsKey;
    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
     */
    private final String diskType;
    /**
     * Google Container File System (image streaming) configs.
     * 
     */
    private final GcfsConfigResponse gcfsConfig;
    /**
     * Enable or disable gvnic in the node pool.
     * 
     */
    private final VirtualNICResponse gvnic;
    /**
     * The image type to use for this node. Note that for a given image type, the latest version of it will be used.
     * 
     */
    private final String imageType;
    /**
     * Node kubelet configs.
     * 
     */
    private final NodeKubeletConfigResponse kubeletConfig;
    /**
     * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * 
     */
    private final Map<String,String> labels;
    /**
     * Parameters that can be configured on Linux nodes.
     * 
     */
    private final LinuxNodeConfigResponse linuxNodeConfig;
    /**
     * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd for more information.
     * 
     */
    private final Integer localSsdCount;
    /**
     * The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types) If unspecified, the default machine type is `e2-medium`.
     * 
     */
    private final String machineType;
    /**
     * The metadata key/value pairs assigned to instances in the cluster. Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes in length. These are reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project or be one of the reserved keys: - "cluster-location" - "cluster-name" - "cluster-uid" - "configure-sh" - "containerd-configure-sh" - "enable-os-login" - "gci-ensure-gke-docker" - "gci-metrics-enabled" - "gci-update-strategy" - "instance-template" - "kube-env" - "startup-script" - "user-data" - "disable-address-manager" - "windows-startup-script-ps1" - "common-psm1" - "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" Values are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on them is that each value's size must be less than or equal to 32 KB. The total size of all keys and values must be less than 512 KB.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * 
     */
    private final String minCpuPlatform;
    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    private final String nodeGroup;
    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
     */
    private final List<String> oauthScopes;
    /**
     * Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more information about preemptible VM instances.
     * 
     */
    private final Boolean preemptible;
    /**
     * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this node pool.
     * 
     */
    private final ReservationAffinityResponse reservationAffinity;
    /**
     * Sandbox configuration for this node.
     * 
     */
    private final SandboxConfigResponse sandboxConfig;
    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
     */
    private final String serviceAccount;
    /**
     * Shielded Instance options.
     * 
     */
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool creation. Each tag within the list must comply with RFC1035.
     * 
     */
    private final List<String> tags;
    /**
     * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
     * 
     */
    private final List<NodeTaintResponse> taints;
    /**
     * The workload metadata configuration for this node.
     * 
     */
    private final WorkloadMetadataConfigResponse workloadMetadataConfig;

    @OutputCustomType.Constructor({"accelerators","advancedMachineFeatures","bootDiskKmsKey","diskSizeGb","diskType","gcfsConfig","gvnic","imageType","kubeletConfig","labels","linuxNodeConfig","localSsdCount","machineType","metadata","minCpuPlatform","nodeGroup","oauthScopes","preemptible","reservationAffinity","sandboxConfig","serviceAccount","shieldedInstanceConfig","tags","taints","workloadMetadataConfig"})
    private NodeConfigResponse(
        List<AcceleratorConfigResponse> accelerators,
        AdvancedMachineFeaturesResponse advancedMachineFeatures,
        String bootDiskKmsKey,
        Integer diskSizeGb,
        String diskType,
        GcfsConfigResponse gcfsConfig,
        VirtualNICResponse gvnic,
        String imageType,
        NodeKubeletConfigResponse kubeletConfig,
        Map<String,String> labels,
        LinuxNodeConfigResponse linuxNodeConfig,
        Integer localSsdCount,
        String machineType,
        Map<String,String> metadata,
        String minCpuPlatform,
        String nodeGroup,
        List<String> oauthScopes,
        Boolean preemptible,
        ReservationAffinityResponse reservationAffinity,
        SandboxConfigResponse sandboxConfig,
        String serviceAccount,
        ShieldedInstanceConfigResponse shieldedInstanceConfig,
        List<String> tags,
        List<NodeTaintResponse> taints,
        WorkloadMetadataConfigResponse workloadMetadataConfig) {
        this.accelerators = Objects.requireNonNull(accelerators);
        this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
        this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.diskType = Objects.requireNonNull(diskType);
        this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
        this.gvnic = Objects.requireNonNull(gvnic);
        this.imageType = Objects.requireNonNull(imageType);
        this.kubeletConfig = Objects.requireNonNull(kubeletConfig);
        this.labels = Objects.requireNonNull(labels);
        this.linuxNodeConfig = Objects.requireNonNull(linuxNodeConfig);
        this.localSsdCount = Objects.requireNonNull(localSsdCount);
        this.machineType = Objects.requireNonNull(machineType);
        this.metadata = Objects.requireNonNull(metadata);
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
        this.nodeGroup = Objects.requireNonNull(nodeGroup);
        this.oauthScopes = Objects.requireNonNull(oauthScopes);
        this.preemptible = Objects.requireNonNull(preemptible);
        this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
        this.sandboxConfig = Objects.requireNonNull(sandboxConfig);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
        this.tags = Objects.requireNonNull(tags);
        this.taints = Objects.requireNonNull(taints);
        this.workloadMetadataConfig = Objects.requireNonNull(workloadMetadataConfig);
    }

    /**
     * A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
     * 
     */
    public List<AcceleratorConfigResponse> getAccelerators() {
        return this.accelerators;
    }
    /**
     * Advanced features for the Compute Engine VM.
     * 
     */
    public AdvancedMachineFeaturesResponse getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    public String getBootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }
    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
     */
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
     */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * Google Container File System (image streaming) configs.
     * 
     */
    public GcfsConfigResponse getGcfsConfig() {
        return this.gcfsConfig;
    }
    /**
     * Enable or disable gvnic in the node pool.
     * 
     */
    public VirtualNICResponse getGvnic() {
        return this.gvnic;
    }
    /**
     * The image type to use for this node. Note that for a given image type, the latest version of it will be used.
     * 
     */
    public String getImageType() {
        return this.imageType;
    }
    /**
     * Node kubelet configs.
     * 
     */
    public NodeKubeletConfigResponse getKubeletConfig() {
        return this.kubeletConfig;
    }
    /**
     * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Parameters that can be configured on Linux nodes.
     * 
     */
    public LinuxNodeConfigResponse getLinuxNodeConfig() {
        return this.linuxNodeConfig;
    }
    /**
     * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd for more information.
     * 
     */
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }
    /**
     * The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types) If unspecified, the default machine type is `e2-medium`.
     * 
     */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * The metadata key/value pairs assigned to instances in the cluster. Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes in length. These are reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project or be one of the reserved keys: - "cluster-location" - "cluster-name" - "cluster-uid" - "configure-sh" - "containerd-configure-sh" - "enable-os-login" - "gci-ensure-gke-docker" - "gci-metrics-enabled" - "gci-update-strategy" - "instance-template" - "kube-env" - "startup-script" - "user-data" - "disable-address-manager" - "windows-startup-script-ps1" - "common-psm1" - "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" Values are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on them is that each value's size must be less than or equal to 32 KB. The total size of all keys and values must be less than 512 KB.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * 
     */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    public String getNodeGroup() {
        return this.nodeGroup;
    }
    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
     */
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    /**
     * Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more information about preemptible VM instances.
     * 
     */
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    /**
     * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this node pool.
     * 
     */
    public ReservationAffinityResponse getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * Sandbox configuration for this node.
     * 
     */
    public SandboxConfigResponse getSandboxConfig() {
        return this.sandboxConfig;
    }
    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Shielded Instance options.
     * 
     */
    public ShieldedInstanceConfigResponse getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool creation. Each tag within the list must comply with RFC1035.
     * 
     */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
     * 
     */
    public List<NodeTaintResponse> getTaints() {
        return this.taints;
    }
    /**
     * The workload metadata configuration for this node.
     * 
     */
    public WorkloadMetadataConfigResponse getWorkloadMetadataConfig() {
        return this.workloadMetadataConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> accelerators;
        private AdvancedMachineFeaturesResponse advancedMachineFeatures;
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private GcfsConfigResponse gcfsConfig;
        private VirtualNICResponse gvnic;
        private String imageType;
        private NodeKubeletConfigResponse kubeletConfig;
        private Map<String,String> labels;
        private LinuxNodeConfigResponse linuxNodeConfig;
        private Integer localSsdCount;
        private String machineType;
        private Map<String,String> metadata;
        private String minCpuPlatform;
        private String nodeGroup;
        private List<String> oauthScopes;
        private Boolean preemptible;
        private ReservationAffinityResponse reservationAffinity;
        private SandboxConfigResponse sandboxConfig;
        private String serviceAccount;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private List<String> tags;
        private List<NodeTaintResponse> taints;
        private WorkloadMetadataConfigResponse workloadMetadataConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.gcfsConfig = defaults.gcfsConfig;
    	      this.gvnic = defaults.gvnic;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfig = defaults.linuxNodeConfig;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.sandboxConfig = defaults.sandboxConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfig = defaults.workloadMetadataConfig;
        }

        public Builder setAccelerators(List<AcceleratorConfigResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }

        public Builder setAdvancedMachineFeatures(AdvancedMachineFeaturesResponse advancedMachineFeatures) {
            this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
            return this;
        }

        public Builder setBootDiskKmsKey(String bootDiskKmsKey) {
            this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
            return this;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setGcfsConfig(GcfsConfigResponse gcfsConfig) {
            this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
            return this;
        }

        public Builder setGvnic(VirtualNICResponse gvnic) {
            this.gvnic = Objects.requireNonNull(gvnic);
            return this;
        }

        public Builder setImageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder setKubeletConfig(NodeKubeletConfigResponse kubeletConfig) {
            this.kubeletConfig = Objects.requireNonNull(kubeletConfig);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLinuxNodeConfig(LinuxNodeConfigResponse linuxNodeConfig) {
            this.linuxNodeConfig = Objects.requireNonNull(linuxNodeConfig);
            return this;
        }

        public Builder setLocalSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }

        public Builder setOauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder setReservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }

        public Builder setSandboxConfig(SandboxConfigResponse sandboxConfig) {
            this.sandboxConfig = Objects.requireNonNull(sandboxConfig);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setShieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTaints(List<NodeTaintResponse> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }

        public Builder setWorkloadMetadataConfig(WorkloadMetadataConfigResponse workloadMetadataConfig) {
            this.workloadMetadataConfig = Objects.requireNonNull(workloadMetadataConfig);
            return this;
        }

        public NodeConfigResponse build() {
            return new NodeConfigResponse(accelerators, advancedMachineFeatures, bootDiskKmsKey, diskSizeGb, diskType, gcfsConfig, gvnic, imageType, kubeletConfig, labels, linuxNodeConfig, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, reservationAffinity, sandboxConfig, serviceAccount, shieldedInstanceConfig, tags, taints, workloadMetadataConfig);
        }
    }
}
