// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.fsx.inputs.OpenZfsFileSystemDiskIopsConfigurationArgs;
import com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenZfsFileSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemArgs Empty = new OpenZfsFileSystemArgs();

    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @Import(name="automaticBackupRetentionDays")
    private @Nullable Output<Integer> automaticBackupRetentionDays;

    /**
     * @return The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    public Optional<Output<Integer>> automaticBackupRetentionDays() {
        return Optional.ofNullable(this.automaticBackupRetentionDays);
    }

    /**
     * The ID of the source backup to create the filesystem from.
     * 
     */
    @Import(name="backupId")
    private @Nullable Output<String> backupId;

    /**
     * @return The ID of the source backup to create the filesystem from.
     * 
     */
    public Optional<Output<String>> backupId() {
        return Optional.ofNullable(this.backupId);
    }

    /**
     * A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
     * 
     */
    @Import(name="copyTagsToBackups")
    private @Nullable Output<Boolean> copyTagsToBackups;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
     * 
     */
    public Optional<Output<Boolean>> copyTagsToBackups() {
        return Optional.ofNullable(this.copyTagsToBackups);
    }

    /**
     * A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @Import(name="copyTagsToVolumes")
    private @Nullable Output<Boolean> copyTagsToVolumes;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    public Optional<Output<Boolean>> copyTagsToVolumes() {
        return Optional.ofNullable(this.copyTagsToVolumes);
    }

    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Import(name="dailyAutomaticBackupStartTime")
    private @Nullable Output<String> dailyAutomaticBackupStartTime;

    /**
     * @return A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    public Optional<Output<String>> dailyAutomaticBackupStartTime() {
        return Optional.ofNullable(this.dailyAutomaticBackupStartTime);
    }

    /**
     * - The filesystem deployment type. Only `SINGLE_AZ_1` is supported.
     * 
     */
    @Import(name="deploymentType", required=true)
    private Output<String> deploymentType;

    /**
     * @return - The filesystem deployment type. Only `SINGLE_AZ_1` is supported.
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }

    /**
     * The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration Below.
     * 
     */
    @Import(name="diskIopsConfiguration")
    private @Nullable Output<OpenZfsFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration;

    /**
     * @return The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration Below.
     * 
     */
    public Optional<Output<OpenZfsFileSystemDiskIopsConfigurationArgs>> diskIopsConfiguration() {
        return Optional.ofNullable(this.diskIopsConfiguration);
    }

    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration Below.
     * 
     */
    @Import(name="rootVolumeConfiguration")
    private @Nullable Output<OpenZfsFileSystemRootVolumeConfigurationArgs> rootVolumeConfiguration;

    /**
     * @return The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration Below.
     * 
     */
    public Optional<Output<OpenZfsFileSystemRootVolumeConfigurationArgs>> rootVolumeConfiguration() {
        return Optional.ofNullable(this.rootVolumeConfiguration);
    }

    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
     * 
     */
    @Import(name="storageCapacity")
    private @Nullable Output<Integer> storageCapacity;

    /**
     * @return The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
     * 
     */
    public Optional<Output<Integer>> storageCapacity() {
        return Optional.ofNullable(this.storageCapacity);
    }

    /**
     * The filesystem storage type. Only `SSD` is supported.
     * 
     */
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    /**
     * @return The filesystem storage type. Only `SSD` is supported.
     * 
     */
    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * A list of IDs for the subnets that the file system will be accessible from. Exactly 1 subnet need to be provided.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<String> subnetIds;

    /**
     * @return A list of IDs for the subnets that the file system will be accessible from. Exactly 1 subnet need to be provided.
     * 
     */
    public Output<String> subnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `64` and maximum of `4096`.
     * 
     */
    @Import(name="throughputCapacity", required=true)
    private Output<Integer> throughputCapacity;

    /**
     * @return Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `64` and maximum of `4096`.
     * 
     */
    public Output<Integer> throughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @Import(name="weeklyMaintenanceStartTime")
    private @Nullable Output<String> weeklyMaintenanceStartTime;

    /**
     * @return The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    public Optional<Output<String>> weeklyMaintenanceStartTime() {
        return Optional.ofNullable(this.weeklyMaintenanceStartTime);
    }

    private OpenZfsFileSystemArgs() {}

    private OpenZfsFileSystemArgs(OpenZfsFileSystemArgs $) {
        this.automaticBackupRetentionDays = $.automaticBackupRetentionDays;
        this.backupId = $.backupId;
        this.copyTagsToBackups = $.copyTagsToBackups;
        this.copyTagsToVolumes = $.copyTagsToVolumes;
        this.dailyAutomaticBackupStartTime = $.dailyAutomaticBackupStartTime;
        this.deploymentType = $.deploymentType;
        this.diskIopsConfiguration = $.diskIopsConfiguration;
        this.kmsKeyId = $.kmsKeyId;
        this.rootVolumeConfiguration = $.rootVolumeConfiguration;
        this.securityGroupIds = $.securityGroupIds;
        this.storageCapacity = $.storageCapacity;
        this.storageType = $.storageType;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.throughputCapacity = $.throughputCapacity;
        this.weeklyMaintenanceStartTime = $.weeklyMaintenanceStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenZfsFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenZfsFileSystemArgs $;

        public Builder() {
            $ = new OpenZfsFileSystemArgs();
        }

        public Builder(OpenZfsFileSystemArgs defaults) {
            $ = new OpenZfsFileSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automaticBackupRetentionDays The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
         * 
         * @return builder
         * 
         */
        public Builder automaticBackupRetentionDays(@Nullable Output<Integer> automaticBackupRetentionDays) {
            $.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        /**
         * @param automaticBackupRetentionDays The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
         * 
         * @return builder
         * 
         */
        public Builder automaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
            return automaticBackupRetentionDays(Output.of(automaticBackupRetentionDays));
        }

        /**
         * @param backupId The ID of the source backup to create the filesystem from.
         * 
         * @return builder
         * 
         */
        public Builder backupId(@Nullable Output<String> backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param backupId The ID of the source backup to create the filesystem from.
         * 
         * @return builder
         * 
         */
        public Builder backupId(String backupId) {
            return backupId(Output.of(backupId));
        }

        /**
         * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToBackups(@Nullable Output<Boolean> copyTagsToBackups) {
            $.copyTagsToBackups = copyTagsToBackups;
            return this;
        }

        /**
         * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToBackups(Boolean copyTagsToBackups) {
            return copyTagsToBackups(Output.of(copyTagsToBackups));
        }

        /**
         * @param copyTagsToVolumes A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToVolumes(@Nullable Output<Boolean> copyTagsToVolumes) {
            $.copyTagsToVolumes = copyTagsToVolumes;
            return this;
        }

        /**
         * @param copyTagsToVolumes A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToVolumes(Boolean copyTagsToVolumes) {
            return copyTagsToVolumes(Output.of(copyTagsToVolumes));
        }

        /**
         * @param dailyAutomaticBackupStartTime A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
         * 
         * @return builder
         * 
         */
        public Builder dailyAutomaticBackupStartTime(@Nullable Output<String> dailyAutomaticBackupStartTime) {
            $.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            return this;
        }

        /**
         * @param dailyAutomaticBackupStartTime A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
         * 
         * @return builder
         * 
         */
        public Builder dailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
            return dailyAutomaticBackupStartTime(Output.of(dailyAutomaticBackupStartTime));
        }

        /**
         * @param deploymentType - The filesystem deployment type. Only `SINGLE_AZ_1` is supported.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(Output<String> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        /**
         * @param deploymentType - The filesystem deployment type. Only `SINGLE_AZ_1` is supported.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(String deploymentType) {
            return deploymentType(Output.of(deploymentType));
        }

        /**
         * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration Below.
         * 
         * @return builder
         * 
         */
        public Builder diskIopsConfiguration(@Nullable Output<OpenZfsFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration) {
            $.diskIopsConfiguration = diskIopsConfiguration;
            return this;
        }

        /**
         * @param diskIopsConfiguration The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration Below.
         * 
         * @return builder
         * 
         */
        public Builder diskIopsConfiguration(OpenZfsFileSystemDiskIopsConfigurationArgs diskIopsConfiguration) {
            return diskIopsConfiguration(Output.of(diskIopsConfiguration));
        }

        /**
         * @param kmsKeyId ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param rootVolumeConfiguration The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration Below.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeConfiguration(@Nullable Output<OpenZfsFileSystemRootVolumeConfigurationArgs> rootVolumeConfiguration) {
            $.rootVolumeConfiguration = rootVolumeConfiguration;
            return this;
        }

        /**
         * @param rootVolumeConfiguration The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration Below.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeConfiguration(OpenZfsFileSystemRootVolumeConfigurationArgs rootVolumeConfiguration) {
            return rootVolumeConfiguration(Output.of(rootVolumeConfiguration));
        }

        /**
         * @param securityGroupIds A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param storageCapacity The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacity(@Nullable Output<Integer> storageCapacity) {
            $.storageCapacity = storageCapacity;
            return this;
        }

        /**
         * @param storageCapacity The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacity(Integer storageCapacity) {
            return storageCapacity(Output.of(storageCapacity));
        }

        /**
         * @param storageType The filesystem storage type. Only `SSD` is supported.
         * 
         * @return builder
         * 
         */
        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param storageType The filesystem storage type. Only `SSD` is supported.
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        /**
         * @param subnetIds A list of IDs for the subnets that the file system will be accessible from. Exactly 1 subnet need to be provided.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<String> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of IDs for the subnets that the file system will be accessible from. Exactly 1 subnet need to be provided.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param tags A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param throughputCapacity Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `64` and maximum of `4096`.
         * 
         * @return builder
         * 
         */
        public Builder throughputCapacity(Output<Integer> throughputCapacity) {
            $.throughputCapacity = throughputCapacity;
            return this;
        }

        /**
         * @param throughputCapacity Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `64` and maximum of `4096`.
         * 
         * @return builder
         * 
         */
        public Builder throughputCapacity(Integer throughputCapacity) {
            return throughputCapacity(Output.of(throughputCapacity));
        }

        /**
         * @param weeklyMaintenanceStartTime The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
         * 
         * @return builder
         * 
         */
        public Builder weeklyMaintenanceStartTime(@Nullable Output<String> weeklyMaintenanceStartTime) {
            $.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            return this;
        }

        /**
         * @param weeklyMaintenanceStartTime The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
         * 
         * @return builder
         * 
         */
        public Builder weeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
            return weeklyMaintenanceStartTime(Output.of(weeklyMaintenanceStartTime));
        }

        public OpenZfsFileSystemArgs build() {
            $.deploymentType = Objects.requireNonNull($.deploymentType, "expected parameter 'deploymentType' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            $.throughputCapacity = Objects.requireNonNull($.throughputCapacity, "expected parameter 'throughputCapacity' to be non-null");
            return $;
        }
    }

}
