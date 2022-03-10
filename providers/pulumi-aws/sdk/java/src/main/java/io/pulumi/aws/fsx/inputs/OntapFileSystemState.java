// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OntapFileSystemDiskIopsConfigurationGetArgs;
import io.pulumi.aws.fsx.inputs.OntapFileSystemEndpointGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OntapFileSystemState extends io.pulumi.resources.ResourceArgs {

    public static final OntapFileSystemState Empty = new OntapFileSystemState();

    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @InputImport(name="automaticBackupRetentionDays")
      private final @Nullable Input<Integer> automaticBackupRetentionDays;

    public Input<Integer> getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays == null ? Input.empty() : this.automaticBackupRetentionDays;
    }

    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @InputImport(name="dailyAutomaticBackupStartTime")
      private final @Nullable Input<String> dailyAutomaticBackupStartTime;

    public Input<String> getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime == null ? Input.empty() : this.dailyAutomaticBackupStartTime;
    }

    /**
     * - The filesystem deployment type. Only `MULTI_AZ_1` is supported.
     * 
     */
    @InputImport(name="deploymentType")
      private final @Nullable Input<String> deploymentType;

    public Input<String> getDeploymentType() {
        return this.deploymentType == null ? Input.empty() : this.deploymentType;
    }

    /**
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
     * 
     */
    @InputImport(name="diskIopsConfiguration")
      private final @Nullable Input<OntapFileSystemDiskIopsConfigurationGetArgs> diskIopsConfiguration;

    public Input<OntapFileSystemDiskIopsConfigurationGetArgs> getDiskIopsConfiguration() {
        return this.diskIopsConfiguration == null ? Input.empty() : this.diskIopsConfiguration;
    }

    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    @InputImport(name="dnsName")
      private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    /**
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * 
     */
    @InputImport(name="endpointIpAddressRange")
      private final @Nullable Input<String> endpointIpAddressRange;

    public Input<String> getEndpointIpAddressRange() {
        return this.endpointIpAddressRange == null ? Input.empty() : this.endpointIpAddressRange;
    }

    /**
     * The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    @InputImport(name="endpoints")
      private final @Nullable Input<List<OntapFileSystemEndpointGetArgs>> endpoints;

    public Input<List<OntapFileSystemEndpointGetArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    /**
     * The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
     * 
     */
    @InputImport(name="fsxAdminPassword")
      private final @Nullable Input<String> fsxAdminPassword;

    public Input<String> getFsxAdminPassword() {
        return this.fsxAdminPassword == null ? Input.empty() : this.fsxAdminPassword;
    }

    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
     * 
     */
    @InputImport(name="networkInterfaceIds")
      private final @Nullable Input<List<String>> networkInterfaceIds;

    public Input<List<String>> getNetworkInterfaceIds() {
        return this.networkInterfaceIds == null ? Input.empty() : this.networkInterfaceIds;
    }

    /**
     * AWS account identifier that created the file system.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
     * 
     */
    @InputImport(name="preferredSubnetId")
      private final @Nullable Input<String> preferredSubnetId;

    public Input<String> getPreferredSubnetId() {
        return this.preferredSubnetId == null ? Input.empty() : this.preferredSubnetId;
    }

    /**
     * Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
     * 
     */
    @InputImport(name="routeTableIds")
      private final @Nullable Input<List<String>> routeTableIds;

    public Input<List<String>> getRouteTableIds() {
        return this.routeTableIds == null ? Input.empty() : this.routeTableIds;
    }

    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
     * 
     */
    @InputImport(name="storageCapacity")
      private final @Nullable Input<Integer> storageCapacity;

    public Input<Integer> getStorageCapacity() {
        return this.storageCapacity == null ? Input.empty() : this.storageCapacity;
    }

    /**
     * - The filesystem storage type. defaults to `SSD`.
     * 
     */
    @InputImport(name="storageType")
      private final @Nullable Input<String> storageType;

    public Input<String> getStorageType() {
        return this.storageType == null ? Input.empty() : this.storageType;
    }

    /**
     * A list of IDs for the subnets that the file system will be accessible from. Exactly 2 subnets need to be provided.
     * 
     */
    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    @InputImport(name="throughputCapacity")
      private final @Nullable Input<Integer> throughputCapacity;

    public Input<Integer> getThroughputCapacity() {
        return this.throughputCapacity == null ? Input.empty() : this.throughputCapacity;
    }

    /**
     * Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @InputImport(name="weeklyMaintenanceStartTime")
      private final @Nullable Input<String> weeklyMaintenanceStartTime;

    public Input<String> getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime == null ? Input.empty() : this.weeklyMaintenanceStartTime;
    }

    public OntapFileSystemState(
        @Nullable Input<String> arn,
        @Nullable Input<Integer> automaticBackupRetentionDays,
        @Nullable Input<String> dailyAutomaticBackupStartTime,
        @Nullable Input<String> deploymentType,
        @Nullable Input<OntapFileSystemDiskIopsConfigurationGetArgs> diskIopsConfiguration,
        @Nullable Input<String> dnsName,
        @Nullable Input<String> endpointIpAddressRange,
        @Nullable Input<List<OntapFileSystemEndpointGetArgs>> endpoints,
        @Nullable Input<String> fsxAdminPassword,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<List<String>> networkInterfaceIds,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> preferredSubnetId,
        @Nullable Input<List<String>> routeTableIds,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<Integer> storageCapacity,
        @Nullable Input<String> storageType,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Integer> throughputCapacity,
        @Nullable Input<String> vpcId,
        @Nullable Input<String> weeklyMaintenanceStartTime) {
        this.arn = arn;
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        this.deploymentType = deploymentType;
        this.diskIopsConfiguration = diskIopsConfiguration;
        this.dnsName = dnsName;
        this.endpointIpAddressRange = endpointIpAddressRange;
        this.endpoints = endpoints;
        this.fsxAdminPassword = fsxAdminPassword;
        this.kmsKeyId = kmsKeyId;
        this.networkInterfaceIds = networkInterfaceIds;
        this.ownerId = ownerId;
        this.preferredSubnetId = preferredSubnetId;
        this.routeTableIds = routeTableIds;
        this.securityGroupIds = securityGroupIds;
        this.storageCapacity = storageCapacity;
        this.storageType = storageType;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.throughputCapacity = throughputCapacity;
        this.vpcId = vpcId;
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    private OntapFileSystemState() {
        this.arn = Input.empty();
        this.automaticBackupRetentionDays = Input.empty();
        this.dailyAutomaticBackupStartTime = Input.empty();
        this.deploymentType = Input.empty();
        this.diskIopsConfiguration = Input.empty();
        this.dnsName = Input.empty();
        this.endpointIpAddressRange = Input.empty();
        this.endpoints = Input.empty();
        this.fsxAdminPassword = Input.empty();
        this.kmsKeyId = Input.empty();
        this.networkInterfaceIds = Input.empty();
        this.ownerId = Input.empty();
        this.preferredSubnetId = Input.empty();
        this.routeTableIds = Input.empty();
        this.securityGroupIds = Input.empty();
        this.storageCapacity = Input.empty();
        this.storageType = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.throughputCapacity = Input.empty();
        this.vpcId = Input.empty();
        this.weeklyMaintenanceStartTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Integer> automaticBackupRetentionDays;
        private @Nullable Input<String> dailyAutomaticBackupStartTime;
        private @Nullable Input<String> deploymentType;
        private @Nullable Input<OntapFileSystemDiskIopsConfigurationGetArgs> diskIopsConfiguration;
        private @Nullable Input<String> dnsName;
        private @Nullable Input<String> endpointIpAddressRange;
        private @Nullable Input<List<OntapFileSystemEndpointGetArgs>> endpoints;
        private @Nullable Input<String> fsxAdminPassword;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<List<String>> networkInterfaceIds;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> preferredSubnetId;
        private @Nullable Input<List<String>> routeTableIds;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<Integer> storageCapacity;
        private @Nullable Input<String> storageType;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Integer> throughputCapacity;
        private @Nullable Input<String> vpcId;
        private @Nullable Input<String> weeklyMaintenanceStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.automaticBackupRetentionDays = defaults.automaticBackupRetentionDays;
    	      this.dailyAutomaticBackupStartTime = defaults.dailyAutomaticBackupStartTime;
    	      this.deploymentType = defaults.deploymentType;
    	      this.diskIopsConfiguration = defaults.diskIopsConfiguration;
    	      this.dnsName = defaults.dnsName;
    	      this.endpointIpAddressRange = defaults.endpointIpAddressRange;
    	      this.endpoints = defaults.endpoints;
    	      this.fsxAdminPassword = defaults.fsxAdminPassword;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.networkInterfaceIds = defaults.networkInterfaceIds;
    	      this.ownerId = defaults.ownerId;
    	      this.preferredSubnetId = defaults.preferredSubnetId;
    	      this.routeTableIds = defaults.routeTableIds;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.storageType = defaults.storageType;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.throughputCapacity = defaults.throughputCapacity;
    	      this.vpcId = defaults.vpcId;
    	      this.weeklyMaintenanceStartTime = defaults.weeklyMaintenanceStartTime;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder automaticBackupRetentionDays(@Nullable Input<Integer> automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        public Builder automaticBackupRetentionDays(@Nullable Integer automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = Input.ofNullable(automaticBackupRetentionDays);
            return this;
        }

        public Builder dailyAutomaticBackupStartTime(@Nullable Input<String> dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            return this;
        }

        public Builder dailyAutomaticBackupStartTime(@Nullable String dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = Input.ofNullable(dailyAutomaticBackupStartTime);
            return this;
        }

        public Builder deploymentType(@Nullable Input<String> deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = Input.ofNullable(deploymentType);
            return this;
        }

        public Builder diskIopsConfiguration(@Nullable Input<OntapFileSystemDiskIopsConfigurationGetArgs> diskIopsConfiguration) {
            this.diskIopsConfiguration = diskIopsConfiguration;
            return this;
        }

        public Builder diskIopsConfiguration(@Nullable OntapFileSystemDiskIopsConfigurationGetArgs diskIopsConfiguration) {
            this.diskIopsConfiguration = Input.ofNullable(diskIopsConfiguration);
            return this;
        }

        public Builder dnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder endpointIpAddressRange(@Nullable Input<String> endpointIpAddressRange) {
            this.endpointIpAddressRange = endpointIpAddressRange;
            return this;
        }

        public Builder endpointIpAddressRange(@Nullable String endpointIpAddressRange) {
            this.endpointIpAddressRange = Input.ofNullable(endpointIpAddressRange);
            return this;
        }

        public Builder endpoints(@Nullable Input<List<OntapFileSystemEndpointGetArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(@Nullable List<OntapFileSystemEndpointGetArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder fsxAdminPassword(@Nullable Input<String> fsxAdminPassword) {
            this.fsxAdminPassword = fsxAdminPassword;
            return this;
        }

        public Builder fsxAdminPassword(@Nullable String fsxAdminPassword) {
            this.fsxAdminPassword = Input.ofNullable(fsxAdminPassword);
            return this;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder networkInterfaceIds(@Nullable Input<List<String>> networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        public Builder networkInterfaceIds(@Nullable List<String> networkInterfaceIds) {
            this.networkInterfaceIds = Input.ofNullable(networkInterfaceIds);
            return this;
        }

        public Builder ownerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder preferredSubnetId(@Nullable Input<String> preferredSubnetId) {
            this.preferredSubnetId = preferredSubnetId;
            return this;
        }

        public Builder preferredSubnetId(@Nullable String preferredSubnetId) {
            this.preferredSubnetId = Input.ofNullable(preferredSubnetId);
            return this;
        }

        public Builder routeTableIds(@Nullable Input<List<String>> routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }

        public Builder routeTableIds(@Nullable List<String> routeTableIds) {
            this.routeTableIds = Input.ofNullable(routeTableIds);
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

        public Builder storageCapacity(@Nullable Input<Integer> storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Builder storageCapacity(@Nullable Integer storageCapacity) {
            this.storageCapacity = Input.ofNullable(storageCapacity);
            return this;
        }

        public Builder storageType(@Nullable Input<String> storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder storageType(@Nullable String storageType) {
            this.storageType = Input.ofNullable(storageType);
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

        public Builder throughputCapacity(@Nullable Input<Integer> throughputCapacity) {
            this.throughputCapacity = throughputCapacity;
            return this;
        }

        public Builder throughputCapacity(@Nullable Integer throughputCapacity) {
            this.throughputCapacity = Input.ofNullable(throughputCapacity);
            return this;
        }

        public Builder vpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }

        public Builder weeklyMaintenanceStartTime(@Nullable Input<String> weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            return this;
        }

        public Builder weeklyMaintenanceStartTime(@Nullable String weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = Input.ofNullable(weeklyMaintenanceStartTime);
            return this;
        }
        public OntapFileSystemState build() {
            return new OntapFileSystemState(arn, automaticBackupRetentionDays, dailyAutomaticBackupStartTime, deploymentType, diskIopsConfiguration, dnsName, endpointIpAddressRange, endpoints, fsxAdminPassword, kmsKeyId, networkInterfaceIds, ownerId, preferredSubnetId, routeTableIds, securityGroupIds, storageCapacity, storageType, subnetIds, tags, tagsAll, throughputCapacity, vpcId, weeklyMaintenanceStartTime);
        }
    }
}
