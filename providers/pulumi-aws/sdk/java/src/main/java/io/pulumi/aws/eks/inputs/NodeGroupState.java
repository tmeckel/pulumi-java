// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateGetArgs;
import io.pulumi.aws.eks.inputs.NodeGroupRemoteAccessGetArgs;
import io.pulumi.aws.eks.inputs.NodeGroupResourceGetArgs;
import io.pulumi.aws.eks.inputs.NodeGroupScalingConfigGetArgs;
import io.pulumi.aws.eks.inputs.NodeGroupTaintGetArgs;
import io.pulumi.aws.eks.inputs.NodeGroupUpdateConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupState extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupState Empty = new NodeGroupState();

    /**
     * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. See the [AWS documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_Nodegroup.html#AmazonEKS-Type-Nodegroup-amiType) for valid values. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="amiType")
      private final @Nullable Input<String> amiType;

    public Input<String> getAmiType() {
        return this.amiType == null ? Input.empty() : this.amiType;
    }

    /**
     * Amazon Resource Name (ARN) of the EKS Node Group.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="capacityType")
      private final @Nullable Input<String> capacityType;

    public Input<String> getCapacityType() {
        return this.capacityType == null ? Input.empty() : this.capacityType;
    }

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="diskSize")
      private final @Nullable Input<Integer> diskSize;

    public Input<Integer> getDiskSize() {
        return this.diskSize == null ? Input.empty() : this.diskSize;
    }

    /**
     * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
     * 
     */
    @InputImport(name="forceUpdateVersion")
      private final @Nullable Input<Boolean> forceUpdateVersion;

    public Input<Boolean> getForceUpdateVersion() {
        return this.forceUpdateVersion == null ? Input.empty() : this.forceUpdateVersion;
    }

    /**
     * List of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="instanceTypes")
      private final @Nullable Input<List<String>> instanceTypes;

    public Input<List<String>> getInstanceTypes() {
        return this.instanceTypes == null ? Input.empty() : this.instanceTypes;
    }

    /**
     * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Configuration block with Launch Template settings. Detailed below.
     * 
     */
    @InputImport(name="launchTemplate")
      private final @Nullable Input<NodeGroupLaunchTemplateGetArgs> launchTemplate;

    public Input<NodeGroupLaunchTemplateGetArgs> getLaunchTemplate() {
        return this.launchTemplate == null ? Input.empty() : this.launchTemplate;
    }

    /**
     * Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `node_group_name_prefix`.
     * 
     */
    @InputImport(name="nodeGroupName")
      private final @Nullable Input<String> nodeGroupName;

    public Input<String> getNodeGroupName() {
        return this.nodeGroupName == null ? Input.empty() : this.nodeGroupName;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `node_group_name`.
     * 
     */
    @InputImport(name="nodeGroupNamePrefix")
      private final @Nullable Input<String> nodeGroupNamePrefix;

    public Input<String> getNodeGroupNamePrefix() {
        return this.nodeGroupNamePrefix == null ? Input.empty() : this.nodeGroupNamePrefix;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    @InputImport(name="nodeRoleArn")
      private final @Nullable Input<String> nodeRoleArn;

    public Input<String> getNodeRoleArn() {
        return this.nodeRoleArn == null ? Input.empty() : this.nodeRoleArn;
    }

    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     * 
     */
    @InputImport(name="releaseVersion")
      private final @Nullable Input<String> releaseVersion;

    public Input<String> getReleaseVersion() {
        return this.releaseVersion == null ? Input.empty() : this.releaseVersion;
    }

    /**
     * Configuration block with remote access settings. Detailed below.
     * 
     */
    @InputImport(name="remoteAccess")
      private final @Nullable Input<NodeGroupRemoteAccessGetArgs> remoteAccess;

    public Input<NodeGroupRemoteAccessGetArgs> getRemoteAccess() {
        return this.remoteAccess == null ? Input.empty() : this.remoteAccess;
    }

    /**
     * List of objects containing information about underlying resources.
     * 
     */
    @InputImport(name="resources")
      private final @Nullable Input<List<NodeGroupResourceGetArgs>> resources;

    public Input<List<NodeGroupResourceGetArgs>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    /**
     * Configuration block with scaling settings. Detailed below.
     * 
     */
    @InputImport(name="scalingConfig")
      private final @Nullable Input<NodeGroupScalingConfigGetArgs> scalingConfig;

    public Input<NodeGroupScalingConfigGetArgs> getScalingConfig() {
        return this.scalingConfig == null ? Input.empty() : this.scalingConfig;
    }

    /**
     * Status of the EKS Node Group.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     */
    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    /**
     * Key-value map of resource tags. If configured with a provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group. Detailed below.
     * 
     */
    @InputImport(name="taints")
      private final @Nullable Input<List<NodeGroupTaintGetArgs>> taints;

    public Input<List<NodeGroupTaintGetArgs>> getTaints() {
        return this.taints == null ? Input.empty() : this.taints;
    }

    @InputImport(name="updateConfig")
      private final @Nullable Input<NodeGroupUpdateConfigGetArgs> updateConfig;

    public Input<NodeGroupUpdateConfigGetArgs> getUpdateConfig() {
        return this.updateConfig == null ? Input.empty() : this.updateConfig;
    }

    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g. `1`) on read and This provider will show a difference on next plan. Using the `default_version` or `latest_version` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public NodeGroupState(
        @Nullable Input<String> amiType,
        @Nullable Input<String> arn,
        @Nullable Input<String> capacityType,
        @Nullable Input<String> clusterName,
        @Nullable Input<Integer> diskSize,
        @Nullable Input<Boolean> forceUpdateVersion,
        @Nullable Input<List<String>> instanceTypes,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<NodeGroupLaunchTemplateGetArgs> launchTemplate,
        @Nullable Input<String> nodeGroupName,
        @Nullable Input<String> nodeGroupNamePrefix,
        @Nullable Input<String> nodeRoleArn,
        @Nullable Input<String> releaseVersion,
        @Nullable Input<NodeGroupRemoteAccessGetArgs> remoteAccess,
        @Nullable Input<List<NodeGroupResourceGetArgs>> resources,
        @Nullable Input<NodeGroupScalingConfigGetArgs> scalingConfig,
        @Nullable Input<String> status,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<List<NodeGroupTaintGetArgs>> taints,
        @Nullable Input<NodeGroupUpdateConfigGetArgs> updateConfig,
        @Nullable Input<String> version) {
        this.amiType = amiType;
        this.arn = arn;
        this.capacityType = capacityType;
        this.clusterName = clusterName;
        this.diskSize = diskSize;
        this.forceUpdateVersion = forceUpdateVersion;
        this.instanceTypes = instanceTypes;
        this.labels = labels;
        this.launchTemplate = launchTemplate;
        this.nodeGroupName = nodeGroupName;
        this.nodeGroupNamePrefix = nodeGroupNamePrefix;
        this.nodeRoleArn = nodeRoleArn;
        this.releaseVersion = releaseVersion;
        this.remoteAccess = remoteAccess;
        this.resources = resources;
        this.scalingConfig = scalingConfig;
        this.status = status;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.taints = taints;
        this.updateConfig = updateConfig;
        this.version = version;
    }

    private NodeGroupState() {
        this.amiType = Input.empty();
        this.arn = Input.empty();
        this.capacityType = Input.empty();
        this.clusterName = Input.empty();
        this.diskSize = Input.empty();
        this.forceUpdateVersion = Input.empty();
        this.instanceTypes = Input.empty();
        this.labels = Input.empty();
        this.launchTemplate = Input.empty();
        this.nodeGroupName = Input.empty();
        this.nodeGroupNamePrefix = Input.empty();
        this.nodeRoleArn = Input.empty();
        this.releaseVersion = Input.empty();
        this.remoteAccess = Input.empty();
        this.resources = Input.empty();
        this.scalingConfig = Input.empty();
        this.status = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.taints = Input.empty();
        this.updateConfig = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> amiType;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> capacityType;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<Integer> diskSize;
        private @Nullable Input<Boolean> forceUpdateVersion;
        private @Nullable Input<List<String>> instanceTypes;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<NodeGroupLaunchTemplateGetArgs> launchTemplate;
        private @Nullable Input<String> nodeGroupName;
        private @Nullable Input<String> nodeGroupNamePrefix;
        private @Nullable Input<String> nodeRoleArn;
        private @Nullable Input<String> releaseVersion;
        private @Nullable Input<NodeGroupRemoteAccessGetArgs> remoteAccess;
        private @Nullable Input<List<NodeGroupResourceGetArgs>> resources;
        private @Nullable Input<NodeGroupScalingConfigGetArgs> scalingConfig;
        private @Nullable Input<String> status;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<List<NodeGroupTaintGetArgs>> taints;
        private @Nullable Input<NodeGroupUpdateConfigGetArgs> updateConfig;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiType = defaults.amiType;
    	      this.arn = defaults.arn;
    	      this.capacityType = defaults.capacityType;
    	      this.clusterName = defaults.clusterName;
    	      this.diskSize = defaults.diskSize;
    	      this.forceUpdateVersion = defaults.forceUpdateVersion;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.labels = defaults.labels;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeGroupNamePrefix = defaults.nodeGroupNamePrefix;
    	      this.nodeRoleArn = defaults.nodeRoleArn;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.remoteAccess = defaults.remoteAccess;
    	      this.resources = defaults.resources;
    	      this.scalingConfig = defaults.scalingConfig;
    	      this.status = defaults.status;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.taints = defaults.taints;
    	      this.updateConfig = defaults.updateConfig;
    	      this.version = defaults.version;
        }

        public Builder amiType(@Nullable Input<String> amiType) {
            this.amiType = amiType;
            return this;
        }

        public Builder amiType(@Nullable String amiType) {
            this.amiType = Input.ofNullable(amiType);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder capacityType(@Nullable Input<String> capacityType) {
            this.capacityType = capacityType;
            return this;
        }

        public Builder capacityType(@Nullable String capacityType) {
            this.capacityType = Input.ofNullable(capacityType);
            return this;
        }

        public Builder clusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder diskSize(@Nullable Input<Integer> diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public Builder diskSize(@Nullable Integer diskSize) {
            this.diskSize = Input.ofNullable(diskSize);
            return this;
        }

        public Builder forceUpdateVersion(@Nullable Input<Boolean> forceUpdateVersion) {
            this.forceUpdateVersion = forceUpdateVersion;
            return this;
        }

        public Builder forceUpdateVersion(@Nullable Boolean forceUpdateVersion) {
            this.forceUpdateVersion = Input.ofNullable(forceUpdateVersion);
            return this;
        }

        public Builder instanceTypes(@Nullable Input<List<String>> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public Builder instanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = Input.ofNullable(instanceTypes);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder launchTemplate(@Nullable Input<NodeGroupLaunchTemplateGetArgs> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        public Builder launchTemplate(@Nullable NodeGroupLaunchTemplateGetArgs launchTemplate) {
            this.launchTemplate = Input.ofNullable(launchTemplate);
            return this;
        }

        public Builder nodeGroupName(@Nullable Input<String> nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        public Builder nodeGroupName(@Nullable String nodeGroupName) {
            this.nodeGroupName = Input.ofNullable(nodeGroupName);
            return this;
        }

        public Builder nodeGroupNamePrefix(@Nullable Input<String> nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = nodeGroupNamePrefix;
            return this;
        }

        public Builder nodeGroupNamePrefix(@Nullable String nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = Input.ofNullable(nodeGroupNamePrefix);
            return this;
        }

        public Builder nodeRoleArn(@Nullable Input<String> nodeRoleArn) {
            this.nodeRoleArn = nodeRoleArn;
            return this;
        }

        public Builder nodeRoleArn(@Nullable String nodeRoleArn) {
            this.nodeRoleArn = Input.ofNullable(nodeRoleArn);
            return this;
        }

        public Builder releaseVersion(@Nullable Input<String> releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        public Builder releaseVersion(@Nullable String releaseVersion) {
            this.releaseVersion = Input.ofNullable(releaseVersion);
            return this;
        }

        public Builder remoteAccess(@Nullable Input<NodeGroupRemoteAccessGetArgs> remoteAccess) {
            this.remoteAccess = remoteAccess;
            return this;
        }

        public Builder remoteAccess(@Nullable NodeGroupRemoteAccessGetArgs remoteAccess) {
            this.remoteAccess = Input.ofNullable(remoteAccess);
            return this;
        }

        public Builder resources(@Nullable Input<List<NodeGroupResourceGetArgs>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable List<NodeGroupResourceGetArgs> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder scalingConfig(@Nullable Input<NodeGroupScalingConfigGetArgs> scalingConfig) {
            this.scalingConfig = scalingConfig;
            return this;
        }

        public Builder scalingConfig(@Nullable NodeGroupScalingConfigGetArgs scalingConfig) {
            this.scalingConfig = Input.ofNullable(scalingConfig);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder subnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder taints(@Nullable Input<List<NodeGroupTaintGetArgs>> taints) {
            this.taints = taints;
            return this;
        }

        public Builder taints(@Nullable List<NodeGroupTaintGetArgs> taints) {
            this.taints = Input.ofNullable(taints);
            return this;
        }

        public Builder updateConfig(@Nullable Input<NodeGroupUpdateConfigGetArgs> updateConfig) {
            this.updateConfig = updateConfig;
            return this;
        }

        public Builder updateConfig(@Nullable NodeGroupUpdateConfigGetArgs updateConfig) {
            this.updateConfig = Input.ofNullable(updateConfig);
            return this;
        }

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public NodeGroupState build() {
            return new NodeGroupState(amiType, arn, capacityType, clusterName, diskSize, forceUpdateVersion, instanceTypes, labels, launchTemplate, nodeGroupName, nodeGroupNamePrefix, nodeRoleArn, releaseVersion, remoteAccess, resources, scalingConfig, status, subnetIds, tags, tagsAll, taints, updateConfig, version);
        }
    }
}
