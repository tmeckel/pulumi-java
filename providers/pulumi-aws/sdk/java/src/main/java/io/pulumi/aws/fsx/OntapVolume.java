// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.fsx.OntapVolumeArgs;
import io.pulumi.aws.fsx.inputs.OntapVolumeState;
import io.pulumi.aws.fsx.outputs.OntapVolumeTieringPolicy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a FSx ONTAP Volume.
 * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html) for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * FSx ONTAP volume can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:fsx/ontapVolume:OntapVolume example fsvol-12345678abcdef123
 * ```
 * 
 */
@ResourceType(type="aws:fsx/ontapVolume:OntapVolume")
public class OntapVolume extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the volune.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the volune.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Describes the file system for the volume, e.g. `fs-12345679`
     * 
     */
    @Export(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    /**
     * @return Describes the file system for the volume, e.g. `fs-12345679`
     * 
     */
    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }
    /**
     * Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
     * 
     */
    @Export(name="flexcacheEndpointType", type=String.class, parameters={})
    private Output<String> flexcacheEndpointType;

    /**
     * @return Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
     * 
     */
    public Output<String> getFlexcacheEndpointType() {
        return this.flexcacheEndpointType;
    }
    /**
     * Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
     * 
     */
    @Export(name="junctionPath", type=String.class, parameters={})
    private Output<String> junctionPath;

    /**
     * @return Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
     * 
     */
    public Output<String> getJunctionPath() {
        return this.junctionPath;
    }
    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the type of volume, Valid values are `RW`, `DP`,  and `LS`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
     * 
     */
    @Export(name="ontapVolumeType", type=String.class, parameters={})
    private Output<String> ontapVolumeType;

    /**
     * @return Specifies the type of volume, Valid values are `RW`, `DP`,  and `LS`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
     * 
     */
    public Output<String> getOntapVolumeType() {
        return this.ontapVolumeType;
    }
    /**
     * Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     * 
     */
    @Export(name="securityStyle", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityStyle;

    /**
     * @return Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     * 
     */
    public Output</* @Nullable */ String> getSecurityStyle() {
        return this.securityStyle;
    }
    /**
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * 
     */
    @Export(name="sizeInMegabytes", type=Integer.class, parameters={})
    private Output<Integer> sizeInMegabytes;

    /**
     * @return Specifies the size of the volume, in megabytes (MB), that you are creating.
     * 
     */
    public Output<Integer> getSizeInMegabytes() {
        return this.sizeInMegabytes;
    }
    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * 
     */
    @Export(name="storageEfficiencyEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> storageEfficiencyEnabled;

    /**
     * @return Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * 
     */
    public Output<Boolean> getStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }
    /**
     * Specifies the storage virtual machine in which to create the volume.
     * 
     */
    @Export(name="storageVirtualMachineId", type=String.class, parameters={})
    private Output<String> storageVirtualMachineId;

    /**
     * @return Specifies the storage virtual machine in which to create the volume.
     * 
     */
    public Output<String> getStorageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }
    /**
     * A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    @Export(name="tieringPolicy", type=OntapVolumeTieringPolicy.class, parameters={})
    private Output</* @Nullable */ OntapVolumeTieringPolicy> tieringPolicy;

    public Output</* @Nullable */ OntapVolumeTieringPolicy> getTieringPolicy() {
        return this.tieringPolicy;
    }
    /**
     * The Volume's UUID (universally unique identifier).
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return The Volume's UUID (universally unique identifier).
     * 
     */
    public Output<String> getUuid() {
        return this.uuid;
    }
    /**
     * The type of volume, currently the only valid value is `ONTAP`.
     * 
     */
    @Export(name="volumeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> volumeType;

    /**
     * @return The type of volume, currently the only valid value is `ONTAP`.
     * 
     */
    public Output</* @Nullable */ String> getVolumeType() {
        return this.volumeType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OntapVolume(String name) {
        this(name, OntapVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OntapVolume(String name, OntapVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OntapVolume(String name, OntapVolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapVolume:OntapVolume", name, args == null ? OntapVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OntapVolume(String name, Output<String> id, @Nullable OntapVolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapVolume:OntapVolume", name, state, makeResourceOptions(options, id));
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
    public static OntapVolume get(String name, Output<String> id, @Nullable OntapVolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OntapVolume(name, id, state, options);
    }
}
