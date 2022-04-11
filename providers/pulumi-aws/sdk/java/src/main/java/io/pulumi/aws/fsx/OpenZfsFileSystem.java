// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.fsx.OpenZfsFileSystemArgs;
import io.pulumi.aws.fsx.inputs.OpenZfsFileSystemState;
import io.pulumi.aws.fsx.outputs.OpenZfsFileSystemDiskIopsConfiguration;
import io.pulumi.aws.fsx.outputs.OpenZfsFileSystemRootVolumeConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Amazon FSx for OpenZFS file system.
 * See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * FSx File Systems can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:fsx/openZfsFileSystem:OpenZfsFileSystem example fs-543ab12b1ca672f33
 * ```
 * 
 *  Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the Terraform configuration on an imported resource, Terraform will always show a difference. To workaround this behavior, either omit the argument from the Terraform configuration or use [`ignore_changes`](https://www.terraform.io/docs/configuration/meta-arguments/lifecycle.html#ignore_changes) to hide the difference, e.g., terraform resource "aws_fsx_openzfs_file_system" "example" {
 * 
 * # ... other configuration ...
 * 
 *  security_group_ids = [aws_security_group.example.id]
 * 
 * # There is no FSx API for reading security_group_ids
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [security_group_ids]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:fsx/openZfsFileSystem:OpenZfsFileSystem")
public class OpenZfsFileSystem extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the file system.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @Export(name="automaticBackupRetentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> automaticBackupRetentionDays;

    /**
     * @return The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    public Output</* @Nullable */ Integer> getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }
    /**
     * The ID of the source backup to create the filesystem from.
     * 
     */
    @Export(name="backupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupId;

    /**
     * @return The ID of the source backup to create the filesystem from.
     * 
     */
    public Output</* @Nullable */ String> getBackupId() {
        return this.backupId;
    }
    /**
     * A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
     * 
     */
    @Export(name="copyTagsToBackups", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyTagsToBackups;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
     * 
     */
    public Output</* @Nullable */ Boolean> getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }
    /**
     * A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @Export(name="copyTagsToVolumes", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyTagsToVolumes;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    public Output</* @Nullable */ Boolean> getCopyTagsToVolumes() {
        return this.copyTagsToVolumes;
    }
    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Export(name="dailyAutomaticBackupStartTime", type=String.class, parameters={})
    private Output<String> dailyAutomaticBackupStartTime;

    /**
     * @return A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    public Output<String> getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }
    /**
     * - The filesystem deployment type. Only `SINGLE_AZ_1` is supported.
     * 
     */
    @Export(name="deploymentType", type=String.class, parameters={})
    private Output<String> deploymentType;

    /**
     * @return - The filesystem deployment type. Only `SINGLE_AZ_1` is supported.
     * 
     */
    public Output<String> getDeploymentType() {
        return this.deploymentType;
    }
    /**
     * The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration Below.
     * 
     */
    @Export(name="diskIopsConfiguration", type=OpenZfsFileSystemDiskIopsConfiguration.class, parameters={})
    private Output<OpenZfsFileSystemDiskIopsConfiguration> diskIopsConfiguration;

    /**
     * @return The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration Below.
     * 
     */
    public Output<OpenZfsFileSystemDiskIopsConfiguration> getDiskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }
    /**
     * DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
     * 
     */
    public Output<String> getDnsName() {
        return this.dnsName;
    }
    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    public Output<String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
     * 
     */
    @Export(name="networkInterfaceIds", type=List.class, parameters={String.class})
    private Output<List<String>> networkInterfaceIds;

    /**
     * @return Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
     * 
     */
    public Output<List<String>> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }
    /**
     * AWS account identifier that created the file system.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return AWS account identifier that created the file system.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration Below.
     * 
     */
    @Export(name="rootVolumeConfiguration", type=OpenZfsFileSystemRootVolumeConfiguration.class, parameters={})
    private Output<OpenZfsFileSystemRootVolumeConfiguration> rootVolumeConfiguration;

    /**
     * @return The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration Below.
     * 
     */
    public Output<OpenZfsFileSystemRootVolumeConfiguration> getRootVolumeConfiguration() {
        return this.rootVolumeConfiguration;
    }
    /**
     * Identifier of the root volume, e.g., `fsvol-12345678`
     * 
     */
    @Export(name="rootVolumeId", type=String.class, parameters={})
    private Output<String> rootVolumeId;

    /**
     * @return Identifier of the root volume, e.g., `fsvol-12345678`
     * 
     */
    public Output<String> getRootVolumeId() {
        return this.rootVolumeId;
    }
    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
     * 
     */
    @Export(name="storageCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> storageCapacity;

    /**
     * @return The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
     * 
     */
    public Output</* @Nullable */ Integer> getStorageCapacity() {
        return this.storageCapacity;
    }
    /**
     * The filesystem storage type. Only `SSD` is supported.
     * 
     */
    @Export(name="storageType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageType;

    /**
     * @return The filesystem storage type. Only `SSD` is supported.
     * 
     */
    public Output</* @Nullable */ String> getStorageType() {
        return this.storageType;
    }
    /**
     * A list of IDs for the subnets that the file system will be accessible from. Exactly 1 subnet need to be provided.
     * 
     */
    @Export(name="subnetIds", type=String.class, parameters={})
    private Output<String> subnetIds;

    /**
     * @return A list of IDs for the subnets that the file system will be accessible from. Exactly 1 subnet need to be provided.
     * 
     */
    public Output<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `64` and maximum of `4096`.
     * 
     */
    @Export(name="throughputCapacity", type=Integer.class, parameters={})
    private Output<Integer> throughputCapacity;

    /**
     * @return Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `64` and maximum of `4096`.
     * 
     */
    public Output<Integer> getThroughputCapacity() {
        return this.throughputCapacity;
    }
    /**
     * Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }
    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @Export(name="weeklyMaintenanceStartTime", type=String.class, parameters={})
    private Output<String> weeklyMaintenanceStartTime;

    /**
     * @return The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    public Output<String> getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpenZfsFileSystem(String name) {
        this(name, OpenZfsFileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpenZfsFileSystem(String name, OpenZfsFileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpenZfsFileSystem(String name, OpenZfsFileSystemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/openZfsFileSystem:OpenZfsFileSystem", name, args == null ? OpenZfsFileSystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpenZfsFileSystem(String name, Output<String> id, @Nullable OpenZfsFileSystemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/openZfsFileSystem:OpenZfsFileSystem", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OpenZfsFileSystem get(String name, Output<String> id, @Nullable OpenZfsFileSystemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OpenZfsFileSystem(name, id, state, options);
    }
}
