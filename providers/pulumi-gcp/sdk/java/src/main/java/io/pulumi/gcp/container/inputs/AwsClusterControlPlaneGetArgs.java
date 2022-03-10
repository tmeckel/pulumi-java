// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneAwsServicesAuthenticationGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneConfigEncryptionGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneDatabaseEncryptionGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneMainVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneProxyConfigGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneRootVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneSshConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsClusterControlPlaneGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneGetArgs Empty = new AwsClusterControlPlaneGetArgs();

    /**
     * Required. Authentication configuration for management of AWS resources.
     * 
     */
    @InputImport(name="awsServicesAuthentication", required=true)
      private final Input<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication;

    public Input<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> getAwsServicesAuthentication() {
        return this.awsServicesAuthentication;
    }

    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    @InputImport(name="configEncryption", required=true)
      private final Input<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption;

    public Input<AwsClusterControlPlaneConfigEncryptionGetArgs> getConfigEncryption() {
        return this.configEncryption;
    }

    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    @InputImport(name="databaseEncryption", required=true)
      private final Input<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption;

    public Input<AwsClusterControlPlaneDatabaseEncryptionGetArgs> getDatabaseEncryption() {
        return this.databaseEncryption;
    }

    /**
     * Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
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
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster's etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    @InputImport(name="mainVolume")
      private final @Nullable Input<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume;

    public Input<AwsClusterControlPlaneMainVolumeGetArgs> getMainVolume() {
        return this.mainVolume == null ? Input.empty() : this.mainVolume;
    }

    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    @InputImport(name="proxyConfig")
      private final @Nullable Input<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig;

    public Input<AwsClusterControlPlaneProxyConfigGetArgs> getProxyConfig() {
        return this.proxyConfig == null ? Input.empty() : this.proxyConfig;
    }

    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    @InputImport(name="rootVolume")
      private final @Nullable Input<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume;

    public Input<AwsClusterControlPlaneRootVolumeGetArgs> getRootVolume() {
        return this.rootVolume == null ? Input.empty() : this.rootVolume;
    }

    /**
     * Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    @InputImport(name="sshConfig")
      private final @Nullable Input<AwsClusterControlPlaneSshConfigGetArgs> sshConfig;

    public Input<AwsClusterControlPlaneSshConfigGetArgs> getSshConfig() {
        return this.sshConfig == null ? Input.empty() : this.sshConfig;
    }

    /**
     * Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    @InputImport(name="subnetIds", required=true)
      private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    @InputImport(name="version", required=true)
      private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    public AwsClusterControlPlaneGetArgs(
        Input<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication,
        Input<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption,
        Input<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption,
        Input<String> iamInstanceProfile,
        @Nullable Input<String> instanceType,
        @Nullable Input<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume,
        @Nullable Input<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig,
        @Nullable Input<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<AwsClusterControlPlaneSshConfigGetArgs> sshConfig,
        Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        Input<String> version) {
        this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication, "expected parameter 'awsServicesAuthentication' to be non-null");
        this.configEncryption = Objects.requireNonNull(configEncryption, "expected parameter 'configEncryption' to be non-null");
        this.databaseEncryption = Objects.requireNonNull(databaseEncryption, "expected parameter 'databaseEncryption' to be non-null");
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile, "expected parameter 'iamInstanceProfile' to be non-null");
        this.instanceType = instanceType;
        this.mainVolume = mainVolume;
        this.proxyConfig = proxyConfig;
        this.rootVolume = rootVolume;
        this.securityGroupIds = securityGroupIds;
        this.sshConfig = sshConfig;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private AwsClusterControlPlaneGetArgs() {
        this.awsServicesAuthentication = Input.empty();
        this.configEncryption = Input.empty();
        this.databaseEncryption = Input.empty();
        this.iamInstanceProfile = Input.empty();
        this.instanceType = Input.empty();
        this.mainVolume = Input.empty();
        this.proxyConfig = Input.empty();
        this.rootVolume = Input.empty();
        this.securityGroupIds = Input.empty();
        this.sshConfig = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication;
        private Input<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption;
        private Input<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption;
        private Input<String> iamInstanceProfile;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume;
        private @Nullable Input<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig;
        private @Nullable Input<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<AwsClusterControlPlaneSshConfigGetArgs> sshConfig;
        private Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsServicesAuthentication = defaults.awsServicesAuthentication;
    	      this.configEncryption = defaults.configEncryption;
    	      this.databaseEncryption = defaults.databaseEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.mainVolume = defaults.mainVolume;
    	      this.proxyConfig = defaults.proxyConfig;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder awsServicesAuthentication(Input<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication) {
            this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication);
            return this;
        }

        public Builder awsServicesAuthentication(AwsClusterControlPlaneAwsServicesAuthenticationGetArgs awsServicesAuthentication) {
            this.awsServicesAuthentication = Input.of(Objects.requireNonNull(awsServicesAuthentication));
            return this;
        }

        public Builder configEncryption(Input<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
            return this;
        }

        public Builder configEncryption(AwsClusterControlPlaneConfigEncryptionGetArgs configEncryption) {
            this.configEncryption = Input.of(Objects.requireNonNull(configEncryption));
            return this;
        }

        public Builder databaseEncryption(Input<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption) {
            this.databaseEncryption = Objects.requireNonNull(databaseEncryption);
            return this;
        }

        public Builder databaseEncryption(AwsClusterControlPlaneDatabaseEncryptionGetArgs databaseEncryption) {
            this.databaseEncryption = Input.of(Objects.requireNonNull(databaseEncryption));
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

        public Builder mainVolume(@Nullable Input<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume) {
            this.mainVolume = mainVolume;
            return this;
        }

        public Builder mainVolume(@Nullable AwsClusterControlPlaneMainVolumeGetArgs mainVolume) {
            this.mainVolume = Input.ofNullable(mainVolume);
            return this;
        }

        public Builder proxyConfig(@Nullable Input<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        public Builder proxyConfig(@Nullable AwsClusterControlPlaneProxyConfigGetArgs proxyConfig) {
            this.proxyConfig = Input.ofNullable(proxyConfig);
            return this;
        }

        public Builder rootVolume(@Nullable Input<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder rootVolume(@Nullable AwsClusterControlPlaneRootVolumeGetArgs rootVolume) {
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

        public Builder sshConfig(@Nullable Input<AwsClusterControlPlaneSshConfigGetArgs> sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }

        public Builder sshConfig(@Nullable AwsClusterControlPlaneSshConfigGetArgs sshConfig) {
            this.sshConfig = Input.ofNullable(sshConfig);
            return this;
        }

        public Builder subnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
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

        public Builder version(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder version(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }
        public AwsClusterControlPlaneGetArgs build() {
            return new AwsClusterControlPlaneGetArgs(awsServicesAuthentication, configEncryption, databaseEncryption, iamInstanceProfile, instanceType, mainVolume, proxyConfig, rootVolume, securityGroupIds, sshConfig, subnetIds, tags, version);
        }
    }
}
