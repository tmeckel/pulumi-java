// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigEphemeralStorageConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigGcfsConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigGuestAccelerator;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigKubeletConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigLinuxNodeConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigSandboxConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigShieldedInstanceConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigTaint;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigWorkloadMetadataConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodePoolNodeConfig {
    private final String bootDiskKmsKey;
    private final Integer diskSizeGb;
    private final String diskType;
    private final List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs;
    private final List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs;
    private final List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators;
    private final String imageType;
    private final List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs;
    private final Map<String,String> labels;
    private final List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs;
    private final Integer localSsdCount;
    private final String machineType;
    private final Map<String,String> metadata;
    private final String minCpuPlatform;
    private final String nodeGroup;
    private final List<String> oauthScopes;
    private final Boolean preemptible;
    private final List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs;
    private final String serviceAccount;
    private final List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs;
    private final Boolean spot;
    private final List<String> tags;
    private final List<GetClusterNodePoolNodeConfigTaint> taints;
    private final List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs;

    @OutputCustomType.Constructor
    private GetClusterNodePoolNodeConfig(
        @OutputCustomType.Parameter("bootDiskKmsKey") String bootDiskKmsKey,
        @OutputCustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @OutputCustomType.Parameter("diskType") String diskType,
        @OutputCustomType.Parameter("ephemeralStorageConfigs") List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs,
        @OutputCustomType.Parameter("gcfsConfigs") List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs,
        @OutputCustomType.Parameter("guestAccelerators") List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators,
        @OutputCustomType.Parameter("imageType") String imageType,
        @OutputCustomType.Parameter("kubeletConfigs") List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("linuxNodeConfigs") List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs,
        @OutputCustomType.Parameter("localSsdCount") Integer localSsdCount,
        @OutputCustomType.Parameter("machineType") String machineType,
        @OutputCustomType.Parameter("metadata") Map<String,String> metadata,
        @OutputCustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @OutputCustomType.Parameter("nodeGroup") String nodeGroup,
        @OutputCustomType.Parameter("oauthScopes") List<String> oauthScopes,
        @OutputCustomType.Parameter("preemptible") Boolean preemptible,
        @OutputCustomType.Parameter("sandboxConfigs") List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs,
        @OutputCustomType.Parameter("serviceAccount") String serviceAccount,
        @OutputCustomType.Parameter("shieldedInstanceConfigs") List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs,
        @OutputCustomType.Parameter("spot") Boolean spot,
        @OutputCustomType.Parameter("tags") List<String> tags,
        @OutputCustomType.Parameter("taints") List<GetClusterNodePoolNodeConfigTaint> taints,
        @OutputCustomType.Parameter("workloadMetadataConfigs") List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs) {
        this.bootDiskKmsKey = bootDiskKmsKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.ephemeralStorageConfigs = ephemeralStorageConfigs;
        this.gcfsConfigs = gcfsConfigs;
        this.guestAccelerators = guestAccelerators;
        this.imageType = imageType;
        this.kubeletConfigs = kubeletConfigs;
        this.labels = labels;
        this.linuxNodeConfigs = linuxNodeConfigs;
        this.localSsdCount = localSsdCount;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.nodeGroup = nodeGroup;
        this.oauthScopes = oauthScopes;
        this.preemptible = preemptible;
        this.sandboxConfigs = sandboxConfigs;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfigs = shieldedInstanceConfigs;
        this.spot = spot;
        this.tags = tags;
        this.taints = taints;
        this.workloadMetadataConfigs = workloadMetadataConfigs;
    }

    public String getBootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    public String getDiskType() {
        return this.diskType;
    }
    public List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> getEphemeralStorageConfigs() {
        return this.ephemeralStorageConfigs;
    }
    public List<GetClusterNodePoolNodeConfigGcfsConfig> getGcfsConfigs() {
        return this.gcfsConfigs;
    }
    public List<GetClusterNodePoolNodeConfigGuestAccelerator> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    public String getImageType() {
        return this.imageType;
    }
    public List<GetClusterNodePoolNodeConfigKubeletConfig> getKubeletConfigs() {
        return this.kubeletConfigs;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public List<GetClusterNodePoolNodeConfigLinuxNodeConfig> getLinuxNodeConfigs() {
        return this.linuxNodeConfigs;
    }
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }
    public String getMachineType() {
        return this.machineType;
    }
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    public List<GetClusterNodePoolNodeConfigSandboxConfig> getSandboxConfigs() {
        return this.sandboxConfigs;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    public List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> getShieldedInstanceConfigs() {
        return this.shieldedInstanceConfigs;
    }
    public Boolean getSpot() {
        return this.spot;
    }
    public List<String> getTags() {
        return this.tags;
    }
    public List<GetClusterNodePoolNodeConfigTaint> getTaints() {
        return this.taints;
    }
    public List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> getWorkloadMetadataConfigs() {
        return this.workloadMetadataConfigs;
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
