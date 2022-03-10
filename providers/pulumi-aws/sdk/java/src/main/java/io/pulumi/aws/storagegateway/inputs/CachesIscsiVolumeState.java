// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachesIscsiVolumeState extends io.pulumi.resources.ResourceArgs {

    public static final CachesIscsiVolumeState Empty = new CachesIscsiVolumeState();

    /**
     * Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Whether mutual CHAP is enabled for the iSCSI target.
     * 
     */
    @InputImport(name="chapEnabled")
      private final @Nullable Input<Boolean> chapEnabled;

    public Input<Boolean> getChapEnabled() {
        return this.chapEnabled == null ? Input.empty() : this.chapEnabled;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @InputImport(name="gatewayArn")
      private final @Nullable Input<String> gatewayArn;

    public Input<String> getGatewayArn() {
        return this.gatewayArn == null ? Input.empty() : this.gatewayArn;
    }

    /**
     * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
     * 
     */
    @InputImport(name="kmsEncrypted")
      private final @Nullable Input<Boolean> kmsEncrypted;

    public Input<Boolean> getKmsEncrypted() {
        return this.kmsEncrypted == null ? Input.empty() : this.kmsEncrypted;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kms_encrypted` is set.
     * 
     */
    @InputImport(name="kmsKey")
      private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    /**
     * Logical disk number.
     * 
     */
    @InputImport(name="lunNumber")
      private final @Nullable Input<Integer> lunNumber;

    public Input<Integer> getLunNumber() {
        return this.lunNumber == null ? Input.empty() : this.lunNumber;
    }

    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    @InputImport(name="networkInterfaceId")
      private final @Nullable Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Input.empty() : this.networkInterfaceId;
    }

    /**
     * The port used to communicate with iSCSI targets.
     * 
     */
    @InputImport(name="networkInterfacePort")
      private final @Nullable Input<Integer> networkInterfacePort;

    public Input<Integer> getNetworkInterfacePort() {
        return this.networkInterfacePort == null ? Input.empty() : this.networkInterfacePort;
    }

    /**
     * The snapshot ID of the snapshot to restore as the new cached volumeE.g., `snap-1122aabb`.
     * 
     */
    @InputImport(name="snapshotId")
      private final @Nullable Input<String> snapshotId;

    public Input<String> getSnapshotId() {
        return this.snapshotId == null ? Input.empty() : this.snapshotId;
    }

    /**
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
     * 
     */
    @InputImport(name="sourceVolumeArn")
      private final @Nullable Input<String> sourceVolumeArn;

    public Input<String> getSourceVolumeArn() {
        return this.sourceVolumeArn == null ? Input.empty() : this.sourceVolumeArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     * 
     */
    @InputImport(name="targetArn")
      private final @Nullable Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn == null ? Input.empty() : this.targetArn;
    }

    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    @InputImport(name="targetName")
      private final @Nullable Input<String> targetName;

    public Input<String> getTargetName() {
        return this.targetName == null ? Input.empty() : this.targetName;
    }

    /**
     * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @InputImport(name="volumeArn")
      private final @Nullable Input<String> volumeArn;

    public Input<String> getVolumeArn() {
        return this.volumeArn == null ? Input.empty() : this.volumeArn;
    }

    /**
     * Volume ID, e.g. `vol-12345678`.
     * 
     */
    @InputImport(name="volumeId")
      private final @Nullable Input<String> volumeId;

    public Input<String> getVolumeId() {
        return this.volumeId == null ? Input.empty() : this.volumeId;
    }

    /**
     * The size of the volume in bytes.
     * 
     */
    @InputImport(name="volumeSizeInBytes")
      private final @Nullable Input<Integer> volumeSizeInBytes;

    public Input<Integer> getVolumeSizeInBytes() {
        return this.volumeSizeInBytes == null ? Input.empty() : this.volumeSizeInBytes;
    }

    public CachesIscsiVolumeState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> chapEnabled,
        @Nullable Input<String> gatewayArn,
        @Nullable Input<Boolean> kmsEncrypted,
        @Nullable Input<String> kmsKey,
        @Nullable Input<Integer> lunNumber,
        @Nullable Input<String> networkInterfaceId,
        @Nullable Input<Integer> networkInterfacePort,
        @Nullable Input<String> snapshotId,
        @Nullable Input<String> sourceVolumeArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> targetArn,
        @Nullable Input<String> targetName,
        @Nullable Input<String> volumeArn,
        @Nullable Input<String> volumeId,
        @Nullable Input<Integer> volumeSizeInBytes) {
        this.arn = arn;
        this.chapEnabled = chapEnabled;
        this.gatewayArn = gatewayArn;
        this.kmsEncrypted = kmsEncrypted;
        this.kmsKey = kmsKey;
        this.lunNumber = lunNumber;
        this.networkInterfaceId = networkInterfaceId;
        this.networkInterfacePort = networkInterfacePort;
        this.snapshotId = snapshotId;
        this.sourceVolumeArn = sourceVolumeArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetArn = targetArn;
        this.targetName = targetName;
        this.volumeArn = volumeArn;
        this.volumeId = volumeId;
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    private CachesIscsiVolumeState() {
        this.arn = Input.empty();
        this.chapEnabled = Input.empty();
        this.gatewayArn = Input.empty();
        this.kmsEncrypted = Input.empty();
        this.kmsKey = Input.empty();
        this.lunNumber = Input.empty();
        this.networkInterfaceId = Input.empty();
        this.networkInterfacePort = Input.empty();
        this.snapshotId = Input.empty();
        this.sourceVolumeArn = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.targetArn = Input.empty();
        this.targetName = Input.empty();
        this.volumeArn = Input.empty();
        this.volumeId = Input.empty();
        this.volumeSizeInBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachesIscsiVolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> chapEnabled;
        private @Nullable Input<String> gatewayArn;
        private @Nullable Input<Boolean> kmsEncrypted;
        private @Nullable Input<String> kmsKey;
        private @Nullable Input<Integer> lunNumber;
        private @Nullable Input<String> networkInterfaceId;
        private @Nullable Input<Integer> networkInterfacePort;
        private @Nullable Input<String> snapshotId;
        private @Nullable Input<String> sourceVolumeArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> targetArn;
        private @Nullable Input<String> targetName;
        private @Nullable Input<String> volumeArn;
        private @Nullable Input<String> volumeId;
        private @Nullable Input<Integer> volumeSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CachesIscsiVolumeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.chapEnabled = defaults.chapEnabled;
    	      this.gatewayArn = defaults.gatewayArn;
    	      this.kmsEncrypted = defaults.kmsEncrypted;
    	      this.kmsKey = defaults.kmsKey;
    	      this.lunNumber = defaults.lunNumber;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfacePort = defaults.networkInterfacePort;
    	      this.snapshotId = defaults.snapshotId;
    	      this.sourceVolumeArn = defaults.sourceVolumeArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetArn = defaults.targetArn;
    	      this.targetName = defaults.targetName;
    	      this.volumeArn = defaults.volumeArn;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSizeInBytes = defaults.volumeSizeInBytes;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder chapEnabled(@Nullable Input<Boolean> chapEnabled) {
            this.chapEnabled = chapEnabled;
            return this;
        }

        public Builder chapEnabled(@Nullable Boolean chapEnabled) {
            this.chapEnabled = Input.ofNullable(chapEnabled);
            return this;
        }

        public Builder gatewayArn(@Nullable Input<String> gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }

        public Builder gatewayArn(@Nullable String gatewayArn) {
            this.gatewayArn = Input.ofNullable(gatewayArn);
            return this;
        }

        public Builder kmsEncrypted(@Nullable Input<Boolean> kmsEncrypted) {
            this.kmsEncrypted = kmsEncrypted;
            return this;
        }

        public Builder kmsEncrypted(@Nullable Boolean kmsEncrypted) {
            this.kmsEncrypted = Input.ofNullable(kmsEncrypted);
            return this;
        }

        public Builder kmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }

        public Builder lunNumber(@Nullable Input<Integer> lunNumber) {
            this.lunNumber = lunNumber;
            return this;
        }

        public Builder lunNumber(@Nullable Integer lunNumber) {
            this.lunNumber = Input.ofNullable(lunNumber);
            return this;
        }

        public Builder networkInterfaceId(@Nullable Input<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Input.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder networkInterfacePort(@Nullable Input<Integer> networkInterfacePort) {
            this.networkInterfacePort = networkInterfacePort;
            return this;
        }

        public Builder networkInterfacePort(@Nullable Integer networkInterfacePort) {
            this.networkInterfacePort = Input.ofNullable(networkInterfacePort);
            return this;
        }

        public Builder snapshotId(@Nullable Input<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Input.ofNullable(snapshotId);
            return this;
        }

        public Builder sourceVolumeArn(@Nullable Input<String> sourceVolumeArn) {
            this.sourceVolumeArn = sourceVolumeArn;
            return this;
        }

        public Builder sourceVolumeArn(@Nullable String sourceVolumeArn) {
            this.sourceVolumeArn = Input.ofNullable(sourceVolumeArn);
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

        public Builder targetArn(@Nullable Input<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = Input.ofNullable(targetArn);
            return this;
        }

        public Builder targetName(@Nullable Input<String> targetName) {
            this.targetName = targetName;
            return this;
        }

        public Builder targetName(@Nullable String targetName) {
            this.targetName = Input.ofNullable(targetName);
            return this;
        }

        public Builder volumeArn(@Nullable Input<String> volumeArn) {
            this.volumeArn = volumeArn;
            return this;
        }

        public Builder volumeArn(@Nullable String volumeArn) {
            this.volumeArn = Input.ofNullable(volumeArn);
            return this;
        }

        public Builder volumeId(@Nullable Input<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Input.ofNullable(volumeId);
            return this;
        }

        public Builder volumeSizeInBytes(@Nullable Input<Integer> volumeSizeInBytes) {
            this.volumeSizeInBytes = volumeSizeInBytes;
            return this;
        }

        public Builder volumeSizeInBytes(@Nullable Integer volumeSizeInBytes) {
            this.volumeSizeInBytes = Input.ofNullable(volumeSizeInBytes);
            return this;
        }
        public CachesIscsiVolumeState build() {
            return new CachesIscsiVolumeState(arn, chapEnabled, gatewayArn, kmsEncrypted, kmsKey, lunNumber, networkInterfaceId, networkInterfacePort, snapshotId, sourceVolumeArn, tags, tagsAll, targetArn, targetName, volumeArn, volumeId, volumeSizeInBytes);
        }
    }
}
