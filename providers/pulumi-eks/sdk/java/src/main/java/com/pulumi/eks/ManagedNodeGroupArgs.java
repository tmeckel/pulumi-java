// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks;

import com.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs;
import com.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs;
import com.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs;
import com.pulumi.aws.eks.inputs.NodeGroupTaintArgs;
import com.pulumi.aws.iam.Role;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.eks.inputs.CoreDataArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedNodeGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedNodeGroupArgs Empty = new ManagedNodeGroupArgs();

    /**
     * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="amiType")
    private @Nullable Output<String> amiType;

    /**
     * @return Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Optional<Output<String>> amiType() {
        return Optional.ofNullable(this.amiType);
    }

    /**
     * Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="capacityType")
    private @Nullable Output<String> capacityType;

    /**
     * @return Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Optional<Output<String>> capacityType() {
        return Optional.ofNullable(this.capacityType);
    }

    /**
     * The target EKS cluster.
     * 
     */
    @Import(name="cluster", required=true)
    private Output<CoreDataArgs> cluster;

    /**
     * @return The target EKS cluster.
     * 
     */
    public Output<CoreDataArgs> cluster() {
        return this.cluster;
    }

    /**
     * Name of the EKS Cluster.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Name of the EKS Cluster.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
     * 
     */
    @Import(name="forceUpdateVersion")
    private @Nullable Output<Boolean> forceUpdateVersion;

    /**
     * @return Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
     * 
     */
    public Optional<Output<Boolean>> forceUpdateVersion() {
        return Optional.ofNullable(this.forceUpdateVersion);
    }

    /**
     * Set of instance types associated with the EKS Node Group. Defaults to `[&#34;t3.medium&#34;]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
     * 
     */
    @Import(name="instanceTypes")
    private @Nullable Output<List<String>> instanceTypes;

    /**
     * @return Set of instance types associated with the EKS Node Group. Defaults to `[&#34;t3.medium&#34;]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
     * 
     */
    public Optional<Output<List<String>>> instanceTypes() {
        return Optional.ofNullable(this.instanceTypes);
    }

    /**
     * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Launch Template settings.
     * 
     */
    @Import(name="launchTemplate")
    private @Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate;

    /**
     * @return Launch Template settings.
     * 
     */
    public Optional<Output<NodeGroupLaunchTemplateArgs>> launchTemplate() {
        return Optional.ofNullable(this.launchTemplate);
    }

    /**
     * Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `nodeGroupNamePrefix`.
     * 
     */
    @Import(name="nodeGroupName")
    private @Nullable Output<String> nodeGroupName;

    /**
     * @return Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `nodeGroupNamePrefix`.
     * 
     */
    public Optional<Output<String>> nodeGroupName() {
        return Optional.ofNullable(this.nodeGroupName);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `nodeGroupName`.
     * 
     */
    @Import(name="nodeGroupNamePrefix")
    private @Nullable Output<String> nodeGroupNamePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `nodeGroupName`.
     * 
     */
    public Optional<Output<String>> nodeGroupNamePrefix() {
        return Optional.ofNullable(this.nodeGroupNamePrefix);
    }

    /**
     * The IAM Role that provides permissions for the EKS Node Group.
     * 
     * Note, `nodeRole` and `nodeRoleArn` are mutually exclusive, and a single option must be used.
     * 
     */
    @Import(name="nodeRole")
    private @Nullable Output<Role> nodeRole;

    /**
     * @return The IAM Role that provides permissions for the EKS Node Group.
     * 
     * Note, `nodeRole` and `nodeRoleArn` are mutually exclusive, and a single option must be used.
     * 
     */
    public Optional<Output<Role>> nodeRole() {
        return Optional.ofNullable(this.nodeRole);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
     * Note, `nodeRoleArn` and `nodeRole` are mutually exclusive, and a single option must be used.
     * 
     */
    @Import(name="nodeRoleArn")
    private @Nullable Output<String> nodeRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
     * Note, `nodeRoleArn` and `nodeRole` are mutually exclusive, and a single option must be used.
     * 
     */
    public Optional<Output<String>> nodeRoleArn() {
        return Optional.ofNullable(this.nodeRoleArn);
    }

    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     * 
     */
    @Import(name="releaseVersion")
    private @Nullable Output<String> releaseVersion;

    /**
     * @return AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     * 
     */
    public Optional<Output<String>> releaseVersion() {
        return Optional.ofNullable(this.releaseVersion);
    }

    /**
     * Remote access settings.
     * 
     */
    @Import(name="remoteAccess")
    private @Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess;

    /**
     * @return Remote access settings.
     * 
     */
    public Optional<Output<NodeGroupRemoteAccessArgs>> remoteAccess() {
        return Optional.ofNullable(this.remoteAccess);
    }

    /**
     * Scaling settings.
     * 
     * Default scaling amounts of the node group autoscaling group are:
     *   - desiredSize: 2
     *   - minSize: 1
     *   - maxSize: 2
     * 
     */
    @Import(name="scalingConfig")
    private @Nullable Output<NodeGroupScalingConfigArgs> scalingConfig;

    /**
     * @return Scaling settings.
     * 
     * Default scaling amounts of the node group autoscaling group are:
     *   - desiredSize: 2
     *   - minSize: 1
     *   - maxSize: 2
     * 
     */
    public Optional<Output<NodeGroupScalingConfigArgs>> scalingConfig() {
        return Optional.ofNullable(this.scalingConfig);
    }

    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     * Default subnetIds is chosen from the following list, in order, if subnetIds arg is not set:
     *   - core.subnetIds
     *   - core.privateIds
     *   - core.publicSubnetIds
     * 
     * This default logic is based on the existing subnet IDs logic of this package: https://git.io/JeM11
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     * Default subnetIds is chosen from the following list, in order, if subnetIds arg is not set:
     *   - core.subnetIds
     *   - core.privateIds
     *   - core.publicSubnetIds
     * 
     * This default logic is based on the existing subnet IDs logic of this package: https://git.io/JeM11
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * Key-value mapping of resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group.
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<NodeGroupTaintArgs>> taints;

    /**
     * @return The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group.
     * 
     */
    public Optional<Output<List<NodeGroupTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ManagedNodeGroupArgs() {}

    private ManagedNodeGroupArgs(ManagedNodeGroupArgs $) {
        this.amiType = $.amiType;
        this.capacityType = $.capacityType;
        this.cluster = $.cluster;
        this.clusterName = $.clusterName;
        this.diskSize = $.diskSize;
        this.forceUpdateVersion = $.forceUpdateVersion;
        this.instanceTypes = $.instanceTypes;
        this.labels = $.labels;
        this.launchTemplate = $.launchTemplate;
        this.nodeGroupName = $.nodeGroupName;
        this.nodeGroupNamePrefix = $.nodeGroupNamePrefix;
        this.nodeRole = $.nodeRole;
        this.nodeRoleArn = $.nodeRoleArn;
        this.releaseVersion = $.releaseVersion;
        this.remoteAccess = $.remoteAccess;
        this.scalingConfig = $.scalingConfig;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.taints = $.taints;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedNodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedNodeGroupArgs $;

        public Builder() {
            $ = new ManagedNodeGroupArgs();
        }

        public Builder(ManagedNodeGroupArgs defaults) {
            $ = new ManagedNodeGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amiType Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder amiType(@Nullable Output<String> amiType) {
            $.amiType = amiType;
            return this;
        }

        /**
         * @param amiType Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder amiType(String amiType) {
            return amiType(Output.of(amiType));
        }

        /**
         * @param capacityType Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder capacityType(@Nullable Output<String> capacityType) {
            $.capacityType = capacityType;
            return this;
        }

        /**
         * @param capacityType Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder capacityType(String capacityType) {
            return capacityType(Output.of(capacityType));
        }

        /**
         * @param cluster The target EKS cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<CoreDataArgs> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The target EKS cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(CoreDataArgs cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param clusterName Name of the EKS Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the EKS Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param diskSize Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param forceUpdateVersion Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateVersion(@Nullable Output<Boolean> forceUpdateVersion) {
            $.forceUpdateVersion = forceUpdateVersion;
            return this;
        }

        /**
         * @param forceUpdateVersion Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateVersion(Boolean forceUpdateVersion) {
            return forceUpdateVersion(Output.of(forceUpdateVersion));
        }

        /**
         * @param instanceTypes Set of instance types associated with the EKS Node Group. Defaults to `[&#34;t3.medium&#34;]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(@Nullable Output<List<String>> instanceTypes) {
            $.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * @param instanceTypes Set of instance types associated with the EKS Node Group. Defaults to `[&#34;t3.medium&#34;]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(List<String> instanceTypes) {
            return instanceTypes(Output.of(instanceTypes));
        }

        /**
         * @param instanceTypes Set of instance types associated with the EKS Node Group. Defaults to `[&#34;t3.medium&#34;]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }

        /**
         * @param labels Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param launchTemplate Launch Template settings.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplate(@Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate) {
            $.launchTemplate = launchTemplate;
            return this;
        }

        /**
         * @param launchTemplate Launch Template settings.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplate(NodeGroupLaunchTemplateArgs launchTemplate) {
            return launchTemplate(Output.of(launchTemplate));
        }

        /**
         * @param nodeGroupName Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `nodeGroupNamePrefix`.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupName(@Nullable Output<String> nodeGroupName) {
            $.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * @param nodeGroupName Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `nodeGroupNamePrefix`.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupName(String nodeGroupName) {
            return nodeGroupName(Output.of(nodeGroupName));
        }

        /**
         * @param nodeGroupNamePrefix Creates a unique name beginning with the specified prefix. Conflicts with `nodeGroupName`.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupNamePrefix(@Nullable Output<String> nodeGroupNamePrefix) {
            $.nodeGroupNamePrefix = nodeGroupNamePrefix;
            return this;
        }

        /**
         * @param nodeGroupNamePrefix Creates a unique name beginning with the specified prefix. Conflicts with `nodeGroupName`.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupNamePrefix(String nodeGroupNamePrefix) {
            return nodeGroupNamePrefix(Output.of(nodeGroupNamePrefix));
        }

        /**
         * @param nodeRole The IAM Role that provides permissions for the EKS Node Group.
         * 
         * Note, `nodeRole` and `nodeRoleArn` are mutually exclusive, and a single option must be used.
         * 
         * @return builder
         * 
         */
        public Builder nodeRole(@Nullable Output<Role> nodeRole) {
            $.nodeRole = nodeRole;
            return this;
        }

        /**
         * @param nodeRole The IAM Role that provides permissions for the EKS Node Group.
         * 
         * Note, `nodeRole` and `nodeRoleArn` are mutually exclusive, and a single option must be used.
         * 
         * @return builder
         * 
         */
        public Builder nodeRole(Role nodeRole) {
            return nodeRole(Output.of(nodeRole));
        }

        /**
         * @param nodeRoleArn Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
         * 
         * Note, `nodeRoleArn` and `nodeRole` are mutually exclusive, and a single option must be used.
         * 
         * @return builder
         * 
         */
        public Builder nodeRoleArn(@Nullable Output<String> nodeRoleArn) {
            $.nodeRoleArn = nodeRoleArn;
            return this;
        }

        /**
         * @param nodeRoleArn Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
         * 
         * Note, `nodeRoleArn` and `nodeRole` are mutually exclusive, and a single option must be used.
         * 
         * @return builder
         * 
         */
        public Builder nodeRoleArn(String nodeRoleArn) {
            return nodeRoleArn(Output.of(nodeRoleArn));
        }

        /**
         * @param releaseVersion AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
         * 
         * @return builder
         * 
         */
        public Builder releaseVersion(@Nullable Output<String> releaseVersion) {
            $.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * @param releaseVersion AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
         * 
         * @return builder
         * 
         */
        public Builder releaseVersion(String releaseVersion) {
            return releaseVersion(Output.of(releaseVersion));
        }

        /**
         * @param remoteAccess Remote access settings.
         * 
         * @return builder
         * 
         */
        public Builder remoteAccess(@Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess) {
            $.remoteAccess = remoteAccess;
            return this;
        }

        /**
         * @param remoteAccess Remote access settings.
         * 
         * @return builder
         * 
         */
        public Builder remoteAccess(NodeGroupRemoteAccessArgs remoteAccess) {
            return remoteAccess(Output.of(remoteAccess));
        }

        /**
         * @param scalingConfig Scaling settings.
         * 
         * Default scaling amounts of the node group autoscaling group are:
         *   - desiredSize: 2
         *   - minSize: 1
         *   - maxSize: 2
         * 
         * @return builder
         * 
         */
        public Builder scalingConfig(@Nullable Output<NodeGroupScalingConfigArgs> scalingConfig) {
            $.scalingConfig = scalingConfig;
            return this;
        }

        /**
         * @param scalingConfig Scaling settings.
         * 
         * Default scaling amounts of the node group autoscaling group are:
         *   - desiredSize: 2
         *   - minSize: 1
         *   - maxSize: 2
         * 
         * @return builder
         * 
         */
        public Builder scalingConfig(NodeGroupScalingConfigArgs scalingConfig) {
            return scalingConfig(Output.of(scalingConfig));
        }

        /**
         * @param subnetIds Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
         * 
         * Default subnetIds is chosen from the following list, in order, if subnetIds arg is not set:
         *   - core.subnetIds
         *   - core.privateIds
         *   - core.publicSubnetIds
         * 
         * This default logic is based on the existing subnet IDs logic of this package: https://git.io/JeM11
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
         * 
         * Default subnetIds is chosen from the following list, in order, if subnetIds arg is not set:
         *   - core.subnetIds
         *   - core.privateIds
         *   - core.publicSubnetIds
         * 
         * This default logic is based on the existing subnet IDs logic of this package: https://git.io/JeM11
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
         * 
         * Default subnetIds is chosen from the following list, in order, if subnetIds arg is not set:
         *   - core.subnetIds
         *   - core.privateIds
         *   - core.publicSubnetIds
         * 
         * This default logic is based on the existing subnet IDs logic of this package: https://git.io/JeM11
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags Key-value mapping of resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param taints The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group.
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<List<NodeGroupTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group.
         * 
         * @return builder
         * 
         */
        public Builder taints(List<NodeGroupTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param taints The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group.
         * 
         * @return builder
         * 
         */
        public Builder taints(NodeGroupTaintArgs... taints) {
            return taints(List.of(taints));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ManagedNodeGroupArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            return $;
        }
    }

}
