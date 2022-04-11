// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.storagegateway.CachesIscsiVolumeArgs;
import io.pulumi.aws.storagegateway.inputs.CachesIscsiVolumeState;
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
 * Manages an AWS Storage Gateway cached iSCSI volume.
 * 
 * > **NOTE:** The gateway must have cache added (e.g. via the `aws.storagegateway.Cache` resource) before creating volumes otherwise the Storage Gateway API will return an error.
 * 
 * > **NOTE:** The gateway must have an upload buffer added (e.g. via the `aws.storagegateway.UploadBuffer` resource) before the volume is operational to clients, however the Storage Gateway API will allow volume creation without error in that case and return volume status as `UPLOAD BUFFER NOT CONFIGURED`.
 * 
 * ## Example Usage
 * 
 * > **NOTE:** These examples are referencing the `aws.storagegateway.Cache` resource `gateway_arn` attribute to ensure this provider properly adds cache before creating the volume. If you are not using this method, you may need to declare an expicit dependency (e.g. via `depends_on = [aws_storagegateway_cache.example]`) to ensure proper ordering.
 * 
 * ## Import
 * 
 * `aws_storagegateway_cached_iscsi_volume` can be imported by using the volume Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678
 * ```
 * 
 */
@ResourceType(type="aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume")
public class CachesIscsiVolume extends io.pulumi.resources.CustomResource {
    /**
     * Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether mutual CHAP is enabled for the iSCSI target.
     * 
     */
    @Export(name="chapEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> chapEnabled;

    /**
     * @return Whether mutual CHAP is enabled for the iSCSI target.
     * 
     */
    public Output<Boolean> getChapEnabled() {
        return this.chapEnabled;
    }
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Export(name="gatewayArn", type=String.class, parameters={})
    private Output<String> gatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    public Output<String> getGatewayArn() {
        return this.gatewayArn;
    }
    /**
     * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
     * 
     */
    @Export(name="kmsEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> kmsEncrypted;

    /**
     * @return Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
     * 
     */
    public Output</* @Nullable */ Boolean> getKmsEncrypted() {
        return this.kmsEncrypted;
    }
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kms_encrypted` is set.
     * 
     */
    @Export(name="kmsKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKey;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kms_encrypted` is set.
     * 
     */
    public Output</* @Nullable */ String> getKmsKey() {
        return this.kmsKey;
    }
    /**
     * Logical disk number.
     * 
     */
    @Export(name="lunNumber", type=Integer.class, parameters={})
    private Output<Integer> lunNumber;

    /**
     * @return Logical disk number.
     * 
     */
    public Output<Integer> getLunNumber() {
        return this.lunNumber;
    }
    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The port used to communicate with iSCSI targets.
     * 
     */
    @Export(name="networkInterfacePort", type=Integer.class, parameters={})
    private Output<Integer> networkInterfacePort;

    /**
     * @return The port used to communicate with iSCSI targets.
     * 
     */
    public Output<Integer> getNetworkInterfacePort() {
        return this.networkInterfacePort;
    }
    /**
     * The snapshot ID of the snapshot to restore as the new cached volumeE.g., `snap-1122aabb`.
     * 
     */
    @Export(name="snapshotId", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return The snapshot ID of the snapshot to restore as the new cached volumeE.g., `snap-1122aabb`.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotId() {
        return this.snapshotId;
    }
    /**
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
     * 
     */
    @Export(name="sourceVolumeArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceVolumeArn;

    /**
     * @return The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
     * 
     */
    public Output</* @Nullable */ String> getSourceVolumeArn() {
        return this.sourceVolumeArn;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     * 
     */
    @Export(name="targetArn", type=String.class, parameters={})
    private Output<String> targetArn;

    /**
     * @return Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     * 
     */
    public Output<String> getTargetArn() {
        return this.targetArn;
    }
    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    @Export(name="targetName", type=String.class, parameters={})
    private Output<String> targetName;

    /**
     * @return The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    public Output<String> getTargetName() {
        return this.targetName;
    }
    /**
     * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @Export(name="volumeArn", type=String.class, parameters={})
    private Output<String> volumeArn;

    /**
     * @return Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    public Output<String> getVolumeArn() {
        return this.volumeArn;
    }
    /**
     * Volume ID, e.g. `vol-12345678`.
     * 
     */
    @Export(name="volumeId", type=String.class, parameters={})
    private Output<String> volumeId;

    /**
     * @return Volume ID, e.g. `vol-12345678`.
     * 
     */
    public Output<String> getVolumeId() {
        return this.volumeId;
    }
    /**
     * The size of the volume in bytes.
     * 
     */
    @Export(name="volumeSizeInBytes", type=Integer.class, parameters={})
    private Output<Integer> volumeSizeInBytes;

    /**
     * @return The size of the volume in bytes.
     * 
     */
    public Output<Integer> getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CachesIscsiVolume(String name) {
        this(name, CachesIscsiVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CachesIscsiVolume(String name, CachesIscsiVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CachesIscsiVolume(String name, CachesIscsiVolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume", name, args == null ? CachesIscsiVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CachesIscsiVolume(String name, Output<String> id, @Nullable CachesIscsiVolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume", name, state, makeResourceOptions(options, id));
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
    public static CachesIscsiVolume get(String name, Output<String> id, @Nullable CachesIscsiVolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CachesIscsiVolume(name, id, state, options);
    }
}
