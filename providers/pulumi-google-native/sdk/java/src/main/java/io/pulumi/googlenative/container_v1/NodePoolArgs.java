// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.MaxPodsConstraintArgs;
import io.pulumi.googlenative.container_v1.inputs.NodeConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.NodeManagementArgs;
import io.pulumi.googlenative.container_v1.inputs.NodeNetworkConfigArgs;
import io.pulumi.googlenative.container_v1.inputs.NodePoolAutoscalingArgs;
import io.pulumi.googlenative.container_v1.inputs.StatusConditionArgs;
import io.pulumi.googlenative.container_v1.inputs.UpgradeSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodePoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolArgs Empty = new NodePoolArgs();

    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    @InputImport(name="autoscaling")
    private final @Nullable Input<NodePoolAutoscalingArgs> autoscaling;

    public Input<NodePoolAutoscalingArgs> getAutoscaling() {
        return this.autoscaling == null ? Input.empty() : this.autoscaling;
    }

    @InputImport(name="clusterId", required=true)
    private final Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId;
    }

    /**
     * Which conditions caused the current node pool state.
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<StatusConditionArgs>> conditions;

    public Input<List<StatusConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The node configuration of the pool.
     * 
     */
    @InputImport(name="config")
    private final @Nullable Input<NodeConfigArgs> config;

    public Input<NodeConfigArgs> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    @InputImport(name="initialNodeCount")
    private final @Nullable Input<Integer> initialNodeCount;

    public Input<Integer> getInitialNodeCount() {
        return this.initialNodeCount == null ? Input.empty() : this.initialNodeCount;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    @InputImport(name="locations")
    private final @Nullable Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations == null ? Input.empty() : this.locations;
    }

    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    @InputImport(name="management")
    private final @Nullable Input<NodeManagementArgs> management;

    public Input<NodeManagementArgs> getManagement() {
        return this.management == null ? Input.empty() : this.management;
    }

    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @InputImport(name="maxPodsConstraint")
    private final @Nullable Input<MaxPodsConstraintArgs> maxPodsConstraint;

    public Input<MaxPodsConstraintArgs> getMaxPodsConstraint() {
        return this.maxPodsConstraint == null ? Input.empty() : this.maxPodsConstraint;
    }

    /**
     * The name of the node pool.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    @InputImport(name="networkConfig")
    private final @Nullable Input<NodeNetworkConfigArgs> networkConfig;

    public Input<NodeNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * The parent (project, location, cluster id) where the node pool will be created. Specified in the format `projects/*{@literal /}locations/*{@literal /}clusters/*`.
     * 
     */
    @InputImport(name="parent")
    private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    @InputImport(name="upgradeSettings")
    private final @Nullable Input<UpgradeSettingsArgs> upgradeSettings;

    public Input<UpgradeSettingsArgs> getUpgradeSettings() {
        return this.upgradeSettings == null ? Input.empty() : this.upgradeSettings;
    }

    /**
     * The version of the Kubernetes of this node.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public NodePoolArgs(
        @Nullable Input<NodePoolAutoscalingArgs> autoscaling,
        Input<String> clusterId,
        @Nullable Input<List<StatusConditionArgs>> conditions,
        @Nullable Input<NodeConfigArgs> config,
        @Nullable Input<Integer> initialNodeCount,
        @Nullable Input<String> location,
        @Nullable Input<List<String>> locations,
        @Nullable Input<NodeManagementArgs> management,
        @Nullable Input<MaxPodsConstraintArgs> maxPodsConstraint,
        @Nullable Input<String> name,
        @Nullable Input<NodeNetworkConfigArgs> networkConfig,
        @Nullable Input<String> parent,
        @Nullable Input<String> project,
        @Nullable Input<UpgradeSettingsArgs> upgradeSettings,
        @Nullable Input<String> version) {
        this.autoscaling = autoscaling;
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.conditions = conditions;
        this.config = config;
        this.initialNodeCount = initialNodeCount;
        this.location = location;
        this.locations = locations;
        this.management = management;
        this.maxPodsConstraint = maxPodsConstraint;
        this.name = name;
        this.networkConfig = networkConfig;
        this.parent = parent;
        this.project = project;
        this.upgradeSettings = upgradeSettings;
        this.version = version;
    }

    private NodePoolArgs() {
        this.autoscaling = Input.empty();
        this.clusterId = Input.empty();
        this.conditions = Input.empty();
        this.config = Input.empty();
        this.initialNodeCount = Input.empty();
        this.location = Input.empty();
        this.locations = Input.empty();
        this.management = Input.empty();
        this.maxPodsConstraint = Input.empty();
        this.name = Input.empty();
        this.networkConfig = Input.empty();
        this.parent = Input.empty();
        this.project = Input.empty();
        this.upgradeSettings = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodePoolAutoscalingArgs> autoscaling;
        private Input<String> clusterId;
        private @Nullable Input<List<StatusConditionArgs>> conditions;
        private @Nullable Input<NodeConfigArgs> config;
        private @Nullable Input<Integer> initialNodeCount;
        private @Nullable Input<String> location;
        private @Nullable Input<List<String>> locations;
        private @Nullable Input<NodeManagementArgs> management;
        private @Nullable Input<MaxPodsConstraintArgs> maxPodsConstraint;
        private @Nullable Input<String> name;
        private @Nullable Input<NodeNetworkConfigArgs> networkConfig;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> project;
        private @Nullable Input<UpgradeSettingsArgs> upgradeSettings;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.clusterId = defaults.clusterId;
    	      this.conditions = defaults.conditions;
    	      this.config = defaults.config;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.management = defaults.management;
    	      this.maxPodsConstraint = defaults.maxPodsConstraint;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.parent = defaults.parent;
    	      this.project = defaults.project;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.version = defaults.version;
        }

        public Builder setAutoscaling(@Nullable Input<NodePoolAutoscalingArgs> autoscaling) {
            this.autoscaling = autoscaling;
            return this;
        }

        public Builder setAutoscaling(@Nullable NodePoolAutoscalingArgs autoscaling) {
            this.autoscaling = Input.ofNullable(autoscaling);
            return this;
        }

        public Builder setClusterId(Input<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Input.of(Objects.requireNonNull(clusterId));
            return this;
        }

        public Builder setConditions(@Nullable Input<List<StatusConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<StatusConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setConfig(@Nullable Input<NodeConfigArgs> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable NodeConfigArgs config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setInitialNodeCount(@Nullable Input<Integer> initialNodeCount) {
            this.initialNodeCount = initialNodeCount;
            return this;
        }

        public Builder setInitialNodeCount(@Nullable Integer initialNodeCount) {
            this.initialNodeCount = Input.ofNullable(initialNodeCount);
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

        public Builder setLocations(@Nullable Input<List<String>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = Input.ofNullable(locations);
            return this;
        }

        public Builder setManagement(@Nullable Input<NodeManagementArgs> management) {
            this.management = management;
            return this;
        }

        public Builder setManagement(@Nullable NodeManagementArgs management) {
            this.management = Input.ofNullable(management);
            return this;
        }

        public Builder setMaxPodsConstraint(@Nullable Input<MaxPodsConstraintArgs> maxPodsConstraint) {
            this.maxPodsConstraint = maxPodsConstraint;
            return this;
        }

        public Builder setMaxPodsConstraint(@Nullable MaxPodsConstraintArgs maxPodsConstraint) {
            this.maxPodsConstraint = Input.ofNullable(maxPodsConstraint);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<NodeNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable NodeNetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
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

        public Builder setUpgradeSettings(@Nullable Input<UpgradeSettingsArgs> upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }

        public Builder setUpgradeSettings(@Nullable UpgradeSettingsArgs upgradeSettings) {
            this.upgradeSettings = Input.ofNullable(upgradeSettings);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public NodePoolArgs build() {
            return new NodePoolArgs(autoscaling, clusterId, conditions, config, initialNodeCount, location, locations, management, maxPodsConstraint, name, networkConfig, parent, project, upgradeSettings, version);
        }
    }
}
