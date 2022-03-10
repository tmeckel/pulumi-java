// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigConfigEncryptionGetArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigRootVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigSshConfigGetArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigTaintGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsNodePoolConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigGetArgs Empty = new AwsNodePoolConfigGetArgs();

    /**
     * Required. The ARN of the AWS KMS key used to encrypt node pool configuration.
     * 
     */
    @InputImport(name="configEncryption", required=true)
      private final Input<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption;

    public Input<AwsNodePoolConfigConfigEncryptionGetArgs> getConfigEncryption() {
        return this.configEncryption;
    }

    /**
     * Required. The name of the AWS IAM role assigned to nodes in the pool.
     * 
     */
    @InputImport(name="iamInstanceProfile", required=true)
      private final Input<String> iamInstanceProfile;

    public Input<String> getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * Optional. The initial labels assigned to nodes of this node pool. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Optional. Template for the root volume provisioned for node pool nodes. Volumes will be provisioned in the availability zone assigned to the node pool subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    @InputImport(name="rootVolume")
      private final @Nullable Input<AwsNodePoolConfigRootVolumeGetArgs> rootVolume;

    public Input<AwsNodePoolConfigRootVolumeGetArgs> getRootVolume() {
        return this.rootVolume == null ? Input.empty() : this.rootVolume;
    }

    /**
     * Optional. The IDs of additional security groups to add to nodes in this pool. The manager will automatically create security groups with minimum rules needed for a functioning cluster.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * Optional. The SSH configuration.
     * 
     */
    @InputImport(name="sshConfig")
      private final @Nullable Input<AwsNodePoolConfigSshConfigGetArgs> sshConfig;

    public Input<AwsNodePoolConfigSshConfigGetArgs> getSshConfig() {
        return this.sshConfig == null ? Input.empty() : this.sshConfig;
    }

    /**
     * Optional. Key/value metadata to assign to each underlying AWS resource. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Optional. The initial taints assigned to nodes of this node pool.
     * 
     */
    @InputImport(name="taints")
      private final @Nullable Input<List<AwsNodePoolConfigTaintGetArgs>> taints;

    public Input<List<AwsNodePoolConfigTaintGetArgs>> getTaints() {
        return this.taints == null ? Input.empty() : this.taints;
    }

    public AwsNodePoolConfigGetArgs(
        Input<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption,
        Input<String> iamInstanceProfile,
        @Nullable Input<String> instanceType,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<AwsNodePoolConfigRootVolumeGetArgs> rootVolume,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<AwsNodePoolConfigSshConfigGetArgs> sshConfig,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<AwsNodePoolConfigTaintGetArgs>> taints) {
        this.configEncryption = Objects.requireNonNull(configEncryption, "expected parameter 'configEncryption' to be non-null");
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile, "expected parameter 'iamInstanceProfile' to be non-null");
        this.instanceType = instanceType;
        this.labels = labels;
        this.rootVolume = rootVolume;
        this.securityGroupIds = securityGroupIds;
        this.sshConfig = sshConfig;
        this.tags = tags;
        this.taints = taints;
    }

    private AwsNodePoolConfigGetArgs() {
        this.configEncryption = Input.empty();
        this.iamInstanceProfile = Input.empty();
        this.instanceType = Input.empty();
        this.labels = Input.empty();
        this.rootVolume = Input.empty();
        this.securityGroupIds = Input.empty();
        this.sshConfig = Input.empty();
        this.tags = Input.empty();
        this.taints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption;
        private Input<String> iamInstanceProfile;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<AwsNodePoolConfigRootVolumeGetArgs> rootVolume;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<AwsNodePoolConfigSshConfigGetArgs> sshConfig;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<AwsNodePoolConfigTaintGetArgs>> taints;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configEncryption = defaults.configEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.labels = defaults.labels;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
        }

        public Builder configEncryption(Input<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
            return this;
        }

        public Builder configEncryption(AwsNodePoolConfigConfigEncryptionGetArgs configEncryption) {
            this.configEncryption = Input.of(Objects.requireNonNull(configEncryption));
            return this;
        }

        public Builder iamInstanceProfile(Input<String> iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }

        public Builder iamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Input.of(Objects.requireNonNull(iamInstanceProfile));
            return this;
        }

        public Builder instanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
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

        public Builder rootVolume(@Nullable Input<AwsNodePoolConfigRootVolumeGetArgs> rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder rootVolume(@Nullable AwsNodePoolConfigRootVolumeGetArgs rootVolume) {
            this.rootVolume = Input.ofNullable(rootVolume);
            return this;
        }

        public Builder securityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder sshConfig(@Nullable Input<AwsNodePoolConfigSshConfigGetArgs> sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }

        public Builder sshConfig(@Nullable AwsNodePoolConfigSshConfigGetArgs sshConfig) {
            this.sshConfig = Input.ofNullable(sshConfig);
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

        public Builder taints(@Nullable Input<List<AwsNodePoolConfigTaintGetArgs>> taints) {
            this.taints = taints;
            return this;
        }

        public Builder taints(@Nullable List<AwsNodePoolConfigTaintGetArgs> taints) {
            this.taints = Input.ofNullable(taints);
            return this;
        }
        public AwsNodePoolConfigGetArgs build() {
            return new AwsNodePoolConfigGetArgs(configEncryption, iamInstanceProfile, instanceType, labels, rootVolume, securityGroupIds, sshConfig, tags, taints);
        }
    }
}
