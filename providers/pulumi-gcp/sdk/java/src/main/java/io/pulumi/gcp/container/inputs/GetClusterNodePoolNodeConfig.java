// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigEphemeralStorageConfig;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigGcfsConfig;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigGuestAccelerator;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigKubeletConfig;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigLinuxNodeConfig;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigSandboxConfig;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigShieldedInstanceConfig;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigTaint;
import io.pulumi.gcp.container.inputs.GetClusterNodePoolNodeConfigWorkloadMetadataConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetClusterNodePoolNodeConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolNodeConfig Empty = new GetClusterNodePoolNodeConfig();

    @InputImport(name="bootDiskKmsKey", required=true)
      private final String bootDiskKmsKey;

    public String getBootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }

    @InputImport(name="diskSizeGb", required=true)
      private final Integer diskSizeGb;

    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }

    @InputImport(name="diskType", required=true)
      private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    @InputImport(name="ephemeralStorageConfigs", required=true)
      private final List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs;

    public List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> getEphemeralStorageConfigs() {
        return this.ephemeralStorageConfigs;
    }

    @InputImport(name="gcfsConfigs", required=true)
      private final List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs;

    public List<GetClusterNodePoolNodeConfigGcfsConfig> getGcfsConfigs() {
        return this.gcfsConfigs;
    }

    @InputImport(name="guestAccelerators", required=true)
      private final List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators;

    public List<GetClusterNodePoolNodeConfigGuestAccelerator> getGuestAccelerators() {
        return this.guestAccelerators;
    }

    @InputImport(name="imageType", required=true)
      private final String imageType;

    public String getImageType() {
        return this.imageType;
    }

    @InputImport(name="kubeletConfigs", required=true)
      private final List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs;

    public List<GetClusterNodePoolNodeConfigKubeletConfig> getKubeletConfigs() {
        return this.kubeletConfigs;
    }

    @InputImport(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    @InputImport(name="linuxNodeConfigs", required=true)
      private final List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs;

    public List<GetClusterNodePoolNodeConfigLinuxNodeConfig> getLinuxNodeConfigs() {
        return this.linuxNodeConfigs;
    }

    @InputImport(name="localSsdCount", required=true)
      private final Integer localSsdCount;

    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }

    @InputImport(name="machineType", required=true)
      private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    @InputImport(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    @InputImport(name="minCpuPlatform", required=true)
      private final String minCpuPlatform;

    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }

    @InputImport(name="nodeGroup", required=true)
      private final String nodeGroup;

    public String getNodeGroup() {
        return this.nodeGroup;
    }

    @InputImport(name="oauthScopes", required=true)
      private final List<String> oauthScopes;

    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }

    @InputImport(name="preemptible", required=true)
      private final Boolean preemptible;

    public Boolean getPreemptible() {
        return this.preemptible;
    }

    @InputImport(name="sandboxConfigs", required=true)
      private final List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs;

    public List<GetClusterNodePoolNodeConfigSandboxConfig> getSandboxConfigs() {
        return this.sandboxConfigs;
    }

    @InputImport(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    @InputImport(name="shieldedInstanceConfigs", required=true)
      private final List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs;

    public List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> getShieldedInstanceConfigs() {
        return this.shieldedInstanceConfigs;
    }

    @InputImport(name="spot", required=true)
      private final Boolean spot;

    public Boolean getSpot() {
        return this.spot;
    }

    @InputImport(name="tags", required=true)
      private final List<String> tags;

    public List<String> getTags() {
        return this.tags;
    }

    @InputImport(name="taints", required=true)
      private final List<GetClusterNodePoolNodeConfigTaint> taints;

    public List<GetClusterNodePoolNodeConfigTaint> getTaints() {
        return this.taints;
    }

    @InputImport(name="workloadMetadataConfigs", required=true)
      private final List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs;

    public List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> getWorkloadMetadataConfigs() {
        return this.workloadMetadataConfigs;
    }

    public GetClusterNodePoolNodeConfig(
        String bootDiskKmsKey,
        Integer diskSizeGb,
        String diskType,
        List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs,
        List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs,
        List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators,
        String imageType,
        List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs,
        Map<String,String> labels,
        List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs,
        Integer localSsdCount,
        String machineType,
        Map<String,String> metadata,
        String minCpuPlatform,
        String nodeGroup,
        List<String> oauthScopes,
        Boolean preemptible,
        List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs,
        String serviceAccount,
        List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs,
        Boolean spot,
        List<String> tags,
        List<GetClusterNodePoolNodeConfigTaint> taints,
        List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs) {
        this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey, "expected parameter 'bootDiskKmsKey' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.ephemeralStorageConfigs = Objects.requireNonNull(ephemeralStorageConfigs, "expected parameter 'ephemeralStorageConfigs' to be non-null");
        this.gcfsConfigs = Objects.requireNonNull(gcfsConfigs, "expected parameter 'gcfsConfigs' to be non-null");
        this.guestAccelerators = Objects.requireNonNull(guestAccelerators, "expected parameter 'guestAccelerators' to be non-null");
        this.imageType = Objects.requireNonNull(imageType, "expected parameter 'imageType' to be non-null");
        this.kubeletConfigs = Objects.requireNonNull(kubeletConfigs, "expected parameter 'kubeletConfigs' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.linuxNodeConfigs = Objects.requireNonNull(linuxNodeConfigs, "expected parameter 'linuxNodeConfigs' to be non-null");
        this.localSsdCount = Objects.requireNonNull(localSsdCount, "expected parameter 'localSsdCount' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.nodeGroup = Objects.requireNonNull(nodeGroup, "expected parameter 'nodeGroup' to be non-null");
        this.oauthScopes = Objects.requireNonNull(oauthScopes, "expected parameter 'oauthScopes' to be non-null");
        this.preemptible = Objects.requireNonNull(preemptible, "expected parameter 'preemptible' to be non-null");
        this.sandboxConfigs = Objects.requireNonNull(sandboxConfigs, "expected parameter 'sandboxConfigs' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.shieldedInstanceConfigs = Objects.requireNonNull(shieldedInstanceConfigs, "expected parameter 'shieldedInstanceConfigs' to be non-null");
        this.spot = Objects.requireNonNull(spot, "expected parameter 'spot' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
        this.taints = Objects.requireNonNull(taints, "expected parameter 'taints' to be non-null");
        this.workloadMetadataConfigs = Objects.requireNonNull(workloadMetadataConfigs, "expected parameter 'workloadMetadataConfigs' to be non-null");
    }

    private GetClusterNodePoolNodeConfig() {
        this.bootDiskKmsKey = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.ephemeralStorageConfigs = List.of();
        this.gcfsConfigs = List.of();
        this.guestAccelerators = List.of();
        this.imageType = null;
        this.kubeletConfigs = List.of();
        this.labels = Map.of();
        this.linuxNodeConfigs = List.of();
        this.localSsdCount = null;
        this.machineType = null;
        this.metadata = Map.of();
        this.minCpuPlatform = null;
        this.nodeGroup = null;
        this.oauthScopes = List.of();
        this.preemptible = null;
        this.sandboxConfigs = List.of();
        this.serviceAccount = null;
        this.shieldedInstanceConfigs = List.of();
        this.spot = null;
        this.tags = List.of();
        this.taints = List.of();
        this.workloadMetadataConfigs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs;
        private List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs;
        private List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators;
        private String imageType;
        private List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs;
        private Map<String,String> labels;
        private List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs;
        private Integer localSsdCount;
        private String machineType;
        private Map<String,String> metadata;
        private String minCpuPlatform;
        private String nodeGroup;
        private List<String> oauthScopes;
        private Boolean preemptible;
        private List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs;
        private String serviceAccount;
        private List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs;
        private Boolean spot;
        private List<String> tags;
        private List<GetClusterNodePoolNodeConfigTaint> taints;
        private List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfigs = defaults.ephemeralStorageConfigs;
    	      this.gcfsConfigs = defaults.gcfsConfigs;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfigs = defaults.kubeletConfigs;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfigs = defaults.linuxNodeConfigs;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.sandboxConfigs = defaults.sandboxConfigs;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfigs = defaults.shieldedInstanceConfigs;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfigs = defaults.workloadMetadataConfigs;
        }

        public Builder bootDiskKmsKey(String bootDiskKmsKey) {
            this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
            return this;
        }

        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder ephemeralStorageConfigs(List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs) {
            this.ephemeralStorageConfigs = Objects.requireNonNull(ephemeralStorageConfigs);
            return this;
        }

        public Builder gcfsConfigs(List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs) {
            this.gcfsConfigs = Objects.requireNonNull(gcfsConfigs);
            return this;
        }

        public Builder guestAccelerators(List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder kubeletConfigs(List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs) {
            this.kubeletConfigs = Objects.requireNonNull(kubeletConfigs);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder linuxNodeConfigs(List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs) {
            this.linuxNodeConfigs = Objects.requireNonNull(linuxNodeConfigs);
            return this;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder nodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }

        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder sandboxConfigs(List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs) {
            this.sandboxConfigs = Objects.requireNonNull(sandboxConfigs);
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder shieldedInstanceConfigs(List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs) {
            this.shieldedInstanceConfigs = Objects.requireNonNull(shieldedInstanceConfigs);
            return this;
        }

        public Builder spot(Boolean spot) {
            this.spot = Objects.requireNonNull(spot);
            return this;
        }

        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder taints(List<GetClusterNodePoolNodeConfigTaint> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }

        public Builder workloadMetadataConfigs(List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs) {
            this.workloadMetadataConfigs = Objects.requireNonNull(workloadMetadataConfigs);
            return this;
        }
        public GetClusterNodePoolNodeConfig build() {
            return new GetClusterNodePoolNodeConfig(bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfigs, gcfsConfigs, guestAccelerators, imageType, kubeletConfigs, labels, linuxNodeConfigs, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, sandboxConfigs, serviceAccount, shieldedInstanceConfigs, spot, tags, taints, workloadMetadataConfigs);
        }
    }
}
