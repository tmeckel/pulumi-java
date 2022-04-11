// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks.inputs;

import io.pulumi.aws.ec2.SecurityGroup;
import io.pulumi.aws.ec2.SecurityGroupRule;
import io.pulumi.aws.iam.InstanceProfile;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.eks.inputs.TaintArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the configuration options accepted by a cluster to create its own node groups.
 * 
 */
public final class ClusterNodeGroupOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeGroupOptionsArgs Empty = new ClusterNodeGroupOptionsArgs();

    /**
     * The AMI ID to use for the worker nodes.
     * 
     * Defaults to the latest recommended EKS Optimized Linux AMI from the AWS Systems Manager Parameter Store.
     * 
     * Note: `amiId` and `gpu` are mutually exclusive.
     * 
     * See for more details:
     * - https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html.
     * 
     */
    @Import(name="amiId")
      private final @Nullable Output<String> amiId;

    public Output<String> getAmiId() {
        return this.amiId == null ? Codegen.empty() : this.amiId;
    }

    /**
     * The tags to apply to the NodeGroup's AutoScalingGroup in the CloudFormation Stack.
     * 
     * Per AWS, all stack-level tags, including automatically created tags, and the `cloudFormationTags` option are propagated to resources that AWS CloudFormation supports, including the AutoScalingGroup. See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html
     * 
     * Note: Given the inheritance of auto-generated CF tags and `cloudFormationTags`, you should either supply the tag in `autoScalingGroupTags` or `cloudFormationTags`, but not both.
     * 
     */
    @Import(name="autoScalingGroupTags")
      private final @Nullable Output<Map<String,String>> autoScalingGroupTags;

    public Output<Map<String,String>> getAutoScalingGroupTags() {
        return this.autoScalingGroupTags == null ? Codegen.empty() : this.autoScalingGroupTags;
    }

    /**
     * Additional args to pass directly to `/etc/eks/bootstrap.sh`. For details on available options, see: https://github.com/awslabs/amazon-eks-ami/blob/master/files/bootstrap.sh. Note that the `--apiserver-endpoint`, `--b64-cluster-ca` and `--kubelet-extra-args` flags are included automatically based on other configuration parameters.
     * 
     */
    @Import(name="bootstrapExtraArgs")
      private final @Nullable Output<String> bootstrapExtraArgs;

    public Output<String> getBootstrapExtraArgs() {
        return this.bootstrapExtraArgs == null ? Codegen.empty() : this.bootstrapExtraArgs;
    }

    /**
     * The tags to apply to the CloudFormation Stack of the Worker NodeGroup.
     * 
     * Note: Given the inheritance of auto-generated CF tags and `cloudFormationTags`, you should either supply the tag in `autoScalingGroupTags` or `cloudFormationTags`, but not both.
     * 
     */
    @Import(name="cloudFormationTags")
      private final @Nullable Output<Map<String,String>> cloudFormationTags;

    public Output<Map<String,String>> getCloudFormationTags() {
        return this.cloudFormationTags == null ? Codegen.empty() : this.cloudFormationTags;
    }

    /**
     * The ingress rule that gives node group access.
     * 
     */
    @Import(name="clusterIngressRule")
      private final @Nullable Output<SecurityGroupRule> clusterIngressRule;

    public Output<SecurityGroupRule> getClusterIngressRule() {
        return this.clusterIngressRule == null ? Codegen.empty() : this.clusterIngressRule;
    }

    /**
     * The number of worker nodes that should be running in the cluster. Defaults to 2.
     * 
     */
    @Import(name="desiredCapacity")
      private final @Nullable Output<Integer> desiredCapacity;

    public Output<Integer> getDesiredCapacity() {
        return this.desiredCapacity == null ? Codegen.empty() : this.desiredCapacity;
    }

    /**
     * Encrypt the root block device of the nodes in the node group.
     * 
     */
    @Import(name="encryptRootBlockDevice")
      private final @Nullable Output<Boolean> encryptRootBlockDevice;

    public Output<Boolean> getEncryptRootBlockDevice() {
        return this.encryptRootBlockDevice == null ? Codegen.empty() : this.encryptRootBlockDevice;
    }

    /**
     * Extra security groups to attach on all nodes in this worker node group.
     * 
     * This additional set of security groups captures any user application rules that will be needed for the nodes.
     * 
     */
    @Import(name="extraNodeSecurityGroups")
      private final @Nullable Output<List<SecurityGroup>> extraNodeSecurityGroups;

    public Output<List<SecurityGroup>> getExtraNodeSecurityGroups() {
        return this.extraNodeSecurityGroups == null ? Codegen.empty() : this.extraNodeSecurityGroups;
    }

    /**
     * Use the latest recommended EKS Optimized Linux AMI with GPU support for the worker nodes from the AWS Systems Manager Parameter Store.
     * 
     * Defaults to false.
     * 
     * Note: `gpu` and `amiId` are mutually exclusive.
     * 
     * See for more details:
     * - https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html
     * - https://docs.aws.amazon.com/eks/latest/userguide/retrieve-ami-id.html
     * 
     */
    @Import(name="gpu")
      private final @Nullable Output<Boolean> gpu;

    public Output<Boolean> getGpu() {
        return this.gpu == null ? Codegen.empty() : this.gpu;
    }

    /**
     * The ingress rule that gives node group access.
     * 
     */
    @Import(name="instanceProfile")
      private final @Nullable Output<InstanceProfile> instanceProfile;

    public Output<InstanceProfile> getInstanceProfile() {
        return this.instanceProfile == null ? Codegen.empty() : this.instanceProfile;
    }

    /**
     * The instance type to use for the cluster's nodes. Defaults to "t2.medium".
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * Name of the key pair to use for SSH access to worker nodes.
     * 
     */
    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName == null ? Codegen.empty() : this.keyName;
    }

    /**
     * Extra args to pass to the Kubelet. Corresponds to the options passed in the `--kubeletExtraArgs` flag to `/etc/eks/bootstrap.sh`. For example, '--port=10251 --address=0.0.0.0'. Note that the `labels` and `taints` properties will be applied to this list (using `--node-labels` and `--register-with-taints` respectively) after to the explicit `kubeletExtraArgs`.
     * 
     */
    @Import(name="kubeletExtraArgs")
      private final @Nullable Output<String> kubeletExtraArgs;

    public Output<String> getKubeletExtraArgs() {
        return this.kubeletExtraArgs == null ? Codegen.empty() : this.kubeletExtraArgs;
    }

    /**
     * Custom k8s node labels to be attached to each worker node. Adds the given key/value pairs to the `--node-labels` kubelet argument.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The maximum number of worker nodes running in the cluster. Defaults to 2.
     * 
     */
    @Import(name="maxSize")
      private final @Nullable Output<Integer> maxSize;

    public Output<Integer> getMaxSize() {
        return this.maxSize == null ? Codegen.empty() : this.maxSize;
    }

    /**
     * The minimum number of worker nodes running in the cluster. Defaults to 1.
     * 
     */
    @Import(name="minSize")
      private final @Nullable Output<Integer> minSize;

    public Output<Integer> getMinSize() {
        return this.minSize == null ? Codegen.empty() : this.minSize;
    }

    /**
     * Whether or not to auto-assign public IP addresses on the EKS worker nodes. If this toggle is set to true, the EKS workers will be auto-assigned public IPs. If false, they will not be auto-assigned public IPs.
     * 
     */
    @Import(name="nodeAssociatePublicIpAddress")
      private final @Nullable Output<Boolean> nodeAssociatePublicIpAddress;

    public Output<Boolean> getNodeAssociatePublicIpAddress() {
        return this.nodeAssociatePublicIpAddress == null ? Codegen.empty() : this.nodeAssociatePublicIpAddress;
    }

    /**
     * Public key material for SSH access to worker nodes. See allowed formats at:
     * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html
     * If not provided, no SSH access is enabled on VMs.
     * 
     */
    @Import(name="nodePublicKey")
      private final @Nullable Output<String> nodePublicKey;

    public Output<String> getNodePublicKey() {
        return this.nodePublicKey == null ? Codegen.empty() : this.nodePublicKey;
    }

    /**
     * The size in GiB of a cluster node's root volume. Defaults to 20.
     * 
     */
    @Import(name="nodeRootVolumeSize")
      private final @Nullable Output<Integer> nodeRootVolumeSize;

    public Output<Integer> getNodeRootVolumeSize() {
        return this.nodeRootVolumeSize == null ? Codegen.empty() : this.nodeRootVolumeSize;
    }

    /**
     * The security group for the worker node group to communicate with the cluster.
     * 
     * This security group requires specific inbound and outbound rules.
     * 
     * See for more details:
     * https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html
     * 
     * Note: The `nodeSecurityGroup` option and the cluster option`nodeSecurityGroupTags` are mutually exclusive.
     * 
     */
    @Import(name="nodeSecurityGroup")
      private final @Nullable Output<SecurityGroup> nodeSecurityGroup;

    public Output<SecurityGroup> getNodeSecurityGroup() {
        return this.nodeSecurityGroup == null ? Codegen.empty() : this.nodeSecurityGroup;
    }

    /**
     * The set of subnets to override and use for the worker node group.
     * 
     * Setting this option overrides which subnets to use for the worker node group, regardless if the cluster's `subnetIds` is set, or if `publicSubnetIds` and/or `privateSubnetIds` were set.
     * 
     */
    @Import(name="nodeSubnetIds")
      private final @Nullable Output<List<String>> nodeSubnetIds;

    public Output<List<String>> getNodeSubnetIds() {
        return this.nodeSubnetIds == null ? Codegen.empty() : this.nodeSubnetIds;
    }

    /**
     * Extra code to run on node startup. This code will run after the AWS EKS bootstrapping code and before the node signals its readiness to the managing CloudFormation stack. This code must be a typical user data script: critically it must begin with an interpreter directive (i.e. a `#!`).
     * 
     */
    @Import(name="nodeUserData")
      private final @Nullable Output<String> nodeUserData;

    public Output<String> getNodeUserData() {
        return this.nodeUserData == null ? Codegen.empty() : this.nodeUserData;
    }

    /**
     * User specified code to run on node startup. This code is expected to handle the full AWS EKS bootstrapping code and signal node readiness to the managing CloudFormation stack. This code must be a complete and executable user data script in bash (Linux) or powershell (Windows).
     * 
     * See for more details: https://docs.aws.amazon.com/eks/latest/userguide/worker.html
     * 
     */
    @Import(name="nodeUserDataOverride")
      private final @Nullable Output<String> nodeUserDataOverride;

    public Output<String> getNodeUserDataOverride() {
        return this.nodeUserDataOverride == null ? Codegen.empty() : this.nodeUserDataOverride;
    }

    /**
     * Bidding price for spot instance. If set, only spot instances will be added as worker node.
     * 
     */
    @Import(name="spotPrice")
      private final @Nullable Output<String> spotPrice;

    public Output<String> getSpotPrice() {
        return this.spotPrice == null ? Codegen.empty() : this.spotPrice;
    }

    /**
     * Custom k8s node taints to be attached to each worker node. Adds the given taints to the `--register-with-taints` kubelet argument
     * 
     */
    @Import(name="taints")
      private final @Nullable Output<Map<String,TaintArgs>> taints;

    public Output<Map<String,TaintArgs>> getTaints() {
        return this.taints == null ? Codegen.empty() : this.taints;
    }

    /**
     * Desired Kubernetes master / control plane version. If you do not specify a value, the latest available version is used.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ClusterNodeGroupOptionsArgs(
        @Nullable Output<String> amiId,
        @Nullable Output<Map<String,String>> autoScalingGroupTags,
        @Nullable Output<String> bootstrapExtraArgs,
        @Nullable Output<Map<String,String>> cloudFormationTags,
        @Nullable Output<SecurityGroupRule> clusterIngressRule,
        @Nullable Output<Integer> desiredCapacity,
        @Nullable Output<Boolean> encryptRootBlockDevice,
        @Nullable Output<List<SecurityGroup>> extraNodeSecurityGroups,
        @Nullable Output<Boolean> gpu,
        @Nullable Output<InstanceProfile> instanceProfile,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> keyName,
        @Nullable Output<String> kubeletExtraArgs,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<Integer> maxSize,
        @Nullable Output<Integer> minSize,
        @Nullable Output<Boolean> nodeAssociatePublicIpAddress,
        @Nullable Output<String> nodePublicKey,
        @Nullable Output<Integer> nodeRootVolumeSize,
        @Nullable Output<SecurityGroup> nodeSecurityGroup,
        @Nullable Output<List<String>> nodeSubnetIds,
        @Nullable Output<String> nodeUserData,
        @Nullable Output<String> nodeUserDataOverride,
        @Nullable Output<String> spotPrice,
        @Nullable Output<Map<String,TaintArgs>> taints,
        @Nullable Output<String> version) {
        this.amiId = amiId;
        this.autoScalingGroupTags = autoScalingGroupTags;
        this.bootstrapExtraArgs = bootstrapExtraArgs;
        this.cloudFormationTags = cloudFormationTags;
        this.clusterIngressRule = clusterIngressRule;
        this.desiredCapacity = desiredCapacity;
        this.encryptRootBlockDevice = encryptRootBlockDevice;
        this.extraNodeSecurityGroups = extraNodeSecurityGroups;
        this.gpu = gpu;
        this.instanceProfile = instanceProfile;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.kubeletExtraArgs = kubeletExtraArgs;
        this.labels = labels;
        this.maxSize = maxSize;
        this.minSize = minSize;
        this.nodeAssociatePublicIpAddress = nodeAssociatePublicIpAddress;
        this.nodePublicKey = nodePublicKey;
        this.nodeRootVolumeSize = nodeRootVolumeSize;
        this.nodeSecurityGroup = nodeSecurityGroup;
        this.nodeSubnetIds = nodeSubnetIds;
        this.nodeUserData = nodeUserData;
        this.nodeUserDataOverride = nodeUserDataOverride;
        this.spotPrice = spotPrice;
        this.taints = taints;
        this.version = version;
    }

    private ClusterNodeGroupOptionsArgs() {
        this.amiId = Codegen.empty();
        this.autoScalingGroupTags = Codegen.empty();
        this.bootstrapExtraArgs = Codegen.empty();
        this.cloudFormationTags = Codegen.empty();
        this.clusterIngressRule = Codegen.empty();
        this.desiredCapacity = Codegen.empty();
        this.encryptRootBlockDevice = Codegen.empty();
        this.extraNodeSecurityGroups = Codegen.empty();
        this.gpu = Codegen.empty();
        this.instanceProfile = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.keyName = Codegen.empty();
        this.kubeletExtraArgs = Codegen.empty();
        this.labels = Codegen.empty();
        this.maxSize = Codegen.empty();
        this.minSize = Codegen.empty();
        this.nodeAssociatePublicIpAddress = Codegen.empty();
        this.nodePublicKey = Codegen.empty();
        this.nodeRootVolumeSize = Codegen.empty();
        this.nodeSecurityGroup = Codegen.empty();
        this.nodeSubnetIds = Codegen.empty();
        this.nodeUserData = Codegen.empty();
        this.nodeUserDataOverride = Codegen.empty();
        this.spotPrice = Codegen.empty();
        this.taints = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGroupOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> amiId;
        private @Nullable Output<Map<String,String>> autoScalingGroupTags;
        private @Nullable Output<String> bootstrapExtraArgs;
        private @Nullable Output<Map<String,String>> cloudFormationTags;
        private @Nullable Output<SecurityGroupRule> clusterIngressRule;
        private @Nullable Output<Integer> desiredCapacity;
        private @Nullable Output<Boolean> encryptRootBlockDevice;
        private @Nullable Output<List<SecurityGroup>> extraNodeSecurityGroups;
        private @Nullable Output<Boolean> gpu;
        private @Nullable Output<InstanceProfile> instanceProfile;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> keyName;
        private @Nullable Output<String> kubeletExtraArgs;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<Integer> maxSize;
        private @Nullable Output<Integer> minSize;
        private @Nullable Output<Boolean> nodeAssociatePublicIpAddress;
        private @Nullable Output<String> nodePublicKey;
        private @Nullable Output<Integer> nodeRootVolumeSize;
        private @Nullable Output<SecurityGroup> nodeSecurityGroup;
        private @Nullable Output<List<String>> nodeSubnetIds;
        private @Nullable Output<String> nodeUserData;
        private @Nullable Output<String> nodeUserDataOverride;
        private @Nullable Output<String> spotPrice;
        private @Nullable Output<Map<String,TaintArgs>> taints;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeGroupOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiId = defaults.amiId;
    	      this.autoScalingGroupTags = defaults.autoScalingGroupTags;
    	      this.bootstrapExtraArgs = defaults.bootstrapExtraArgs;
    	      this.cloudFormationTags = defaults.cloudFormationTags;
    	      this.clusterIngressRule = defaults.clusterIngressRule;
    	      this.desiredCapacity = defaults.desiredCapacity;
    	      this.encryptRootBlockDevice = defaults.encryptRootBlockDevice;
    	      this.extraNodeSecurityGroups = defaults.extraNodeSecurityGroups;
    	      this.gpu = defaults.gpu;
    	      this.instanceProfile = defaults.instanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.kubeletExtraArgs = defaults.kubeletExtraArgs;
    	      this.labels = defaults.labels;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
    	      this.nodeAssociatePublicIpAddress = defaults.nodeAssociatePublicIpAddress;
    	      this.nodePublicKey = defaults.nodePublicKey;
    	      this.nodeRootVolumeSize = defaults.nodeRootVolumeSize;
    	      this.nodeSecurityGroup = defaults.nodeSecurityGroup;
    	      this.nodeSubnetIds = defaults.nodeSubnetIds;
    	      this.nodeUserData = defaults.nodeUserData;
    	      this.nodeUserDataOverride = defaults.nodeUserDataOverride;
    	      this.spotPrice = defaults.spotPrice;
    	      this.taints = defaults.taints;
    	      this.version = defaults.version;
        }

        public Builder amiId(@Nullable Output<String> amiId) {
            this.amiId = amiId;
            return this;
        }
        public Builder amiId(@Nullable String amiId) {
            this.amiId = Codegen.ofNullable(amiId);
            return this;
        }
        public Builder autoScalingGroupTags(@Nullable Output<Map<String,String>> autoScalingGroupTags) {
            this.autoScalingGroupTags = autoScalingGroupTags;
            return this;
        }
        public Builder autoScalingGroupTags(@Nullable Map<String,String> autoScalingGroupTags) {
            this.autoScalingGroupTags = Codegen.ofNullable(autoScalingGroupTags);
            return this;
        }
        public Builder bootstrapExtraArgs(@Nullable Output<String> bootstrapExtraArgs) {
            this.bootstrapExtraArgs = bootstrapExtraArgs;
            return this;
        }
        public Builder bootstrapExtraArgs(@Nullable String bootstrapExtraArgs) {
            this.bootstrapExtraArgs = Codegen.ofNullable(bootstrapExtraArgs);
            return this;
        }
        public Builder cloudFormationTags(@Nullable Output<Map<String,String>> cloudFormationTags) {
            this.cloudFormationTags = cloudFormationTags;
            return this;
        }
        public Builder cloudFormationTags(@Nullable Map<String,String> cloudFormationTags) {
            this.cloudFormationTags = Codegen.ofNullable(cloudFormationTags);
            return this;
        }
        public Builder clusterIngressRule(@Nullable Output<SecurityGroupRule> clusterIngressRule) {
            this.clusterIngressRule = clusterIngressRule;
            return this;
        }
        public Builder clusterIngressRule(@Nullable SecurityGroupRule clusterIngressRule) {
            this.clusterIngressRule = Codegen.ofNullable(clusterIngressRule);
            return this;
        }
        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }
        public Builder desiredCapacity(@Nullable Integer desiredCapacity) {
            this.desiredCapacity = Codegen.ofNullable(desiredCapacity);
            return this;
        }
        public Builder encryptRootBlockDevice(@Nullable Output<Boolean> encryptRootBlockDevice) {
            this.encryptRootBlockDevice = encryptRootBlockDevice;
            return this;
        }
        public Builder encryptRootBlockDevice(@Nullable Boolean encryptRootBlockDevice) {
            this.encryptRootBlockDevice = Codegen.ofNullable(encryptRootBlockDevice);
            return this;
        }
        public Builder extraNodeSecurityGroups(@Nullable Output<List<SecurityGroup>> extraNodeSecurityGroups) {
            this.extraNodeSecurityGroups = extraNodeSecurityGroups;
            return this;
        }
        public Builder extraNodeSecurityGroups(@Nullable List<SecurityGroup> extraNodeSecurityGroups) {
            this.extraNodeSecurityGroups = Codegen.ofNullable(extraNodeSecurityGroups);
            return this;
        }
        public Builder extraNodeSecurityGroups(SecurityGroup... extraNodeSecurityGroups) {
            return extraNodeSecurityGroups(List.of(extraNodeSecurityGroups));
        }
        public Builder gpu(@Nullable Output<Boolean> gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder gpu(@Nullable Boolean gpu) {
            this.gpu = Codegen.ofNullable(gpu);
            return this;
        }
        public Builder instanceProfile(@Nullable Output<InstanceProfile> instanceProfile) {
            this.instanceProfile = instanceProfile;
            return this;
        }
        public Builder instanceProfile(@Nullable InstanceProfile instanceProfile) {
            this.instanceProfile = Codegen.ofNullable(instanceProfile);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = Codegen.ofNullable(keyName);
            return this;
        }
        public Builder kubeletExtraArgs(@Nullable Output<String> kubeletExtraArgs) {
            this.kubeletExtraArgs = kubeletExtraArgs;
            return this;
        }
        public Builder kubeletExtraArgs(@Nullable String kubeletExtraArgs) {
            this.kubeletExtraArgs = Codegen.ofNullable(kubeletExtraArgs);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Builder maxSize(@Nullable Integer maxSize) {
            this.maxSize = Codegen.ofNullable(maxSize);
            return this;
        }
        public Builder minSize(@Nullable Output<Integer> minSize) {
            this.minSize = minSize;
            return this;
        }
        public Builder minSize(@Nullable Integer minSize) {
            this.minSize = Codegen.ofNullable(minSize);
            return this;
        }
        public Builder nodeAssociatePublicIpAddress(@Nullable Output<Boolean> nodeAssociatePublicIpAddress) {
            this.nodeAssociatePublicIpAddress = nodeAssociatePublicIpAddress;
            return this;
        }
        public Builder nodeAssociatePublicIpAddress(@Nullable Boolean nodeAssociatePublicIpAddress) {
            this.nodeAssociatePublicIpAddress = Codegen.ofNullable(nodeAssociatePublicIpAddress);
            return this;
        }
        public Builder nodePublicKey(@Nullable Output<String> nodePublicKey) {
            this.nodePublicKey = nodePublicKey;
            return this;
        }
        public Builder nodePublicKey(@Nullable String nodePublicKey) {
            this.nodePublicKey = Codegen.ofNullable(nodePublicKey);
            return this;
        }
        public Builder nodeRootVolumeSize(@Nullable Output<Integer> nodeRootVolumeSize) {
            this.nodeRootVolumeSize = nodeRootVolumeSize;
            return this;
        }
        public Builder nodeRootVolumeSize(@Nullable Integer nodeRootVolumeSize) {
            this.nodeRootVolumeSize = Codegen.ofNullable(nodeRootVolumeSize);
            return this;
        }
        public Builder nodeSecurityGroup(@Nullable Output<SecurityGroup> nodeSecurityGroup) {
            this.nodeSecurityGroup = nodeSecurityGroup;
            return this;
        }
        public Builder nodeSecurityGroup(@Nullable SecurityGroup nodeSecurityGroup) {
            this.nodeSecurityGroup = Codegen.ofNullable(nodeSecurityGroup);
            return this;
        }
        public Builder nodeSubnetIds(@Nullable Output<List<String>> nodeSubnetIds) {
            this.nodeSubnetIds = nodeSubnetIds;
            return this;
        }
        public Builder nodeSubnetIds(@Nullable List<String> nodeSubnetIds) {
            this.nodeSubnetIds = Codegen.ofNullable(nodeSubnetIds);
            return this;
        }
        public Builder nodeSubnetIds(String... nodeSubnetIds) {
            return nodeSubnetIds(List.of(nodeSubnetIds));
        }
        public Builder nodeUserData(@Nullable Output<String> nodeUserData) {
            this.nodeUserData = nodeUserData;
            return this;
        }
        public Builder nodeUserData(@Nullable String nodeUserData) {
            this.nodeUserData = Codegen.ofNullable(nodeUserData);
            return this;
        }
        public Builder nodeUserDataOverride(@Nullable Output<String> nodeUserDataOverride) {
            this.nodeUserDataOverride = nodeUserDataOverride;
            return this;
        }
        public Builder nodeUserDataOverride(@Nullable String nodeUserDataOverride) {
            this.nodeUserDataOverride = Codegen.ofNullable(nodeUserDataOverride);
            return this;
        }
        public Builder spotPrice(@Nullable Output<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = Codegen.ofNullable(spotPrice);
            return this;
        }
        public Builder taints(@Nullable Output<Map<String,TaintArgs>> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(@Nullable Map<String,TaintArgs> taints) {
            this.taints = Codegen.ofNullable(taints);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ClusterNodeGroupOptionsArgs build() {
            return new ClusterNodeGroupOptionsArgs(amiId, autoScalingGroupTags, bootstrapExtraArgs, cloudFormationTags, clusterIngressRule, desiredCapacity, encryptRootBlockDevice, extraNodeSecurityGroups, gpu, instanceProfile, instanceType, keyName, kubeletExtraArgs, labels, maxSize, minSize, nodeAssociatePublicIpAddress, nodePublicKey, nodeRootVolumeSize, nodeSecurityGroup, nodeSubnetIds, nodeUserData, nodeUserDataOverride, spotPrice, taints, version);
        }
    }
}
