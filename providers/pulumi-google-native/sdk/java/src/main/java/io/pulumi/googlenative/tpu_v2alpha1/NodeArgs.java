// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.tpu_v2alpha1.enums.NodeHealth;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.AttachedDiskArgs;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.NetworkConfigArgs;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.SchedulingConfigArgs;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.ServiceAccountArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeArgs Empty = new NodeArgs();

    /**
     * The type of hardware accelerators associated with this node.
     * 
     */
    @InputImport(name="acceleratorType", required=true)
    private final Input<String> acceleratorType;

    public Input<String> getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    @InputImport(name="cidrBlock")
    private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * The additional data disks for the Node.
     * 
     */
    @InputImport(name="dataDisks")
    private final @Nullable Input<List<AttachedDiskArgs>> dataDisks;

    public Input<List<AttachedDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Input.empty() : this.dataDisks;
    }

    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The health status of the TPU node.
     * 
     */
    @InputImport(name="health")
    private final @Nullable Input<NodeHealth> health;

    public Input<NodeHealth> getHealth() {
        return this.health == null ? Input.empty() : this.health;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Custom metadata to apply to the TPU Node. Can set startup-script and shutdown-script
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Network configurations for the TPU node.
     * 
     */
    @InputImport(name="networkConfig")
    private final @Nullable Input<NetworkConfigArgs> networkConfig;

    public Input<NetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    @InputImport(name="nodeId")
    private final @Nullable Input<String> nodeId;

    public Input<String> getNodeId() {
        return this.nodeId == null ? Input.empty() : this.nodeId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The runtime version running in the Node.
     * 
     */
    @InputImport(name="runtimeVersion", required=true)
    private final Input<String> runtimeVersion;

    public Input<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * The scheduling options for this node.
     * 
     */
    @InputImport(name="schedulingConfig")
    private final @Nullable Input<SchedulingConfigArgs> schedulingConfig;

    public Input<SchedulingConfigArgs> getSchedulingConfig() {
        return this.schedulingConfig == null ? Input.empty() : this.schedulingConfig;
    }

    /**
     * The Google Cloud Platform Service Account to be used by the TPU node VMs. If None is specified, the default compute service account will be used.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<ServiceAccountArgs> serviceAccount;

    public Input<ServiceAccountArgs> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Tags to apply to the TPU Node. Tags are used to identify valid sources or targets for network firewalls.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public NodeArgs(
        Input<String> acceleratorType,
        @Nullable Input<String> cidrBlock,
        @Nullable Input<List<AttachedDiskArgs>> dataDisks,
        @Nullable Input<String> description,
        @Nullable Input<NodeHealth> health,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<NetworkConfigArgs> networkConfig,
        @Nullable Input<String> nodeId,
        @Nullable Input<String> project,
        Input<String> runtimeVersion,
        @Nullable Input<SchedulingConfigArgs> schedulingConfig,
        @Nullable Input<ServiceAccountArgs> serviceAccount,
        @Nullable Input<List<String>> tags) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
        this.cidrBlock = cidrBlock;
        this.dataDisks = dataDisks;
        this.description = description;
        this.health = health;
        this.labels = labels;
        this.location = location;
        this.metadata = metadata;
        this.networkConfig = networkConfig;
        this.nodeId = nodeId;
        this.project = project;
        this.runtimeVersion = Objects.requireNonNull(runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
        this.schedulingConfig = schedulingConfig;
        this.serviceAccount = serviceAccount;
        this.tags = tags;
    }

    private NodeArgs() {
        this.acceleratorType = Input.empty();
        this.cidrBlock = Input.empty();
        this.dataDisks = Input.empty();
        this.description = Input.empty();
        this.health = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.networkConfig = Input.empty();
        this.nodeId = Input.empty();
        this.project = Input.empty();
        this.runtimeVersion = Input.empty();
        this.schedulingConfig = Input.empty();
        this.serviceAccount = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> acceleratorType;
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<List<AttachedDiskArgs>> dataDisks;
        private @Nullable Input<String> description;
        private @Nullable Input<NodeHealth> health;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<NetworkConfigArgs> networkConfig;
        private @Nullable Input<String> nodeId;
        private @Nullable Input<String> project;
        private Input<String> runtimeVersion;
        private @Nullable Input<SchedulingConfigArgs> schedulingConfig;
        private @Nullable Input<ServiceAccountArgs> serviceAccount;
        private @Nullable Input<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.dataDisks = defaults.dataDisks;
    	      this.description = defaults.description;
    	      this.health = defaults.health;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.networkConfig = defaults.networkConfig;
    	      this.nodeId = defaults.nodeId;
    	      this.project = defaults.project;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.schedulingConfig = defaults.schedulingConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.tags = defaults.tags;
        }

        public Builder setAcceleratorType(Input<String> acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Input.of(Objects.requireNonNull(acceleratorType));
            return this;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder setDataDisks(@Nullable Input<List<AttachedDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setDataDisks(@Nullable List<AttachedDiskArgs> dataDisks) {
            this.dataDisks = Input.ofNullable(dataDisks);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHealth(@Nullable Input<NodeHealth> health) {
            this.health = health;
            return this;
        }

        public Builder setHealth(@Nullable NodeHealth health) {
            this.health = Input.ofNullable(health);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<NetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable NetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setNodeId(@Nullable Input<String> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        public Builder setNodeId(@Nullable String nodeId) {
            this.nodeId = Input.ofNullable(nodeId);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRuntimeVersion(Input<String> runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public Builder setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = Input.of(Objects.requireNonNull(runtimeVersion));
            return this;
        }

        public Builder setSchedulingConfig(@Nullable Input<SchedulingConfigArgs> schedulingConfig) {
            this.schedulingConfig = schedulingConfig;
            return this;
        }

        public Builder setSchedulingConfig(@Nullable SchedulingConfigArgs schedulingConfig) {
            this.schedulingConfig = Input.ofNullable(schedulingConfig);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<ServiceAccountArgs> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable ServiceAccountArgs serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public NodeArgs build() {
            return new NodeArgs(acceleratorType, cidrBlock, dataDisks, description, health, labels, location, metadata, networkConfig, nodeId, project, runtimeVersion, schedulingConfig, serviceAccount, tags);
        }
    }
}
