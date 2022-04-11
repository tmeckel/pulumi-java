// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StoredIscsiVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final StoredIscsiVolumeArgs Empty = new StoredIscsiVolumeArgs();

    /**
     * The unique identifier for the gateway local disk that is configured as a stored volume.
     * 
     */
    @Import(name="diskId", required=true)
      private final Output<String> diskId;

    public Output<String> getDiskId() {
        return this.diskId;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="gatewayArn", required=true)
      private final Output<String> gatewayArn;

    public Output<String> getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
     * 
     */
    @Import(name="kmsEncrypted")
      private final @Nullable Output<Boolean> kmsEncrypted;

    public Output<Boolean> getKmsEncrypted() {
        return this.kmsEncrypted == null ? Codegen.empty() : this.kmsEncrypted;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is `true`.
     * 
     */
    @Import(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> getKmsKey() {
        return this.kmsKey == null ? Codegen.empty() : this.kmsKey;
    }

    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
      private final Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
     * 
     */
    @Import(name="preserveExistingData", required=true)
      private final Output<Boolean> preserveExistingData;

    public Output<Boolean> getPreserveExistingData() {
        return this.preserveExistingData;
    }

    /**
     * The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
     * 
     */
    @Import(name="snapshotId")
      private final @Nullable Output<String> snapshotId;

    public Output<String> getSnapshotId() {
        return this.snapshotId == null ? Codegen.empty() : this.snapshotId;
    }

    /**
     * Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    @Import(name="targetName", required=true)
      private final Output<String> targetName;

    public Output<String> getTargetName() {
        return this.targetName;
    }

    public StoredIscsiVolumeArgs(
        Output<String> diskId,
        Output<String> gatewayArn,
        @Nullable Output<Boolean> kmsEncrypted,
        @Nullable Output<String> kmsKey,
        Output<String> networkInterfaceId,
        Output<Boolean> preserveExistingData,
        @Nullable Output<String> snapshotId,
        @Nullable Output<Map<String,String>> tags,
        Output<String> targetName) {
        this.diskId = Objects.requireNonNull(diskId, "expected parameter 'diskId' to be non-null");
        this.gatewayArn = Objects.requireNonNull(gatewayArn, "expected parameter 'gatewayArn' to be non-null");
        this.kmsEncrypted = kmsEncrypted;
        this.kmsKey = kmsKey;
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
        this.preserveExistingData = Objects.requireNonNull(preserveExistingData, "expected parameter 'preserveExistingData' to be non-null");
        this.snapshotId = snapshotId;
        this.tags = tags;
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
    }

    private StoredIscsiVolumeArgs() {
        this.diskId = Codegen.empty();
        this.gatewayArn = Codegen.empty();
        this.kmsEncrypted = Codegen.empty();
        this.kmsKey = Codegen.empty();
        this.networkInterfaceId = Codegen.empty();
        this.preserveExistingData = Codegen.empty();
        this.snapshotId = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoredIscsiVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> diskId;
        private Output<String> gatewayArn;
        private @Nullable Output<Boolean> kmsEncrypted;
        private @Nullable Output<String> kmsKey;
        private Output<String> networkInterfaceId;
        private Output<Boolean> preserveExistingData;
        private @Nullable Output<String> snapshotId;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> targetName;

        public Builder() {
    	      // Empty
        }

        public Builder(StoredIscsiVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.gatewayArn = defaults.gatewayArn;
    	      this.kmsEncrypted = defaults.kmsEncrypted;
    	      this.kmsKey = defaults.kmsKey;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.preserveExistingData = defaults.preserveExistingData;
    	      this.snapshotId = defaults.snapshotId;
    	      this.tags = defaults.tags;
    	      this.targetName = defaults.targetName;
        }

        public Builder diskId(Output<String> diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }
        public Builder diskId(String diskId) {
            this.diskId = Output.of(Objects.requireNonNull(diskId));
            return this;
        }
        public Builder gatewayArn(Output<String> gatewayArn) {
            this.gatewayArn = Objects.requireNonNull(gatewayArn);
            return this;
        }
        public Builder gatewayArn(String gatewayArn) {
            this.gatewayArn = Output.of(Objects.requireNonNull(gatewayArn));
            return this;
        }
        public Builder kmsEncrypted(@Nullable Output<Boolean> kmsEncrypted) {
            this.kmsEncrypted = kmsEncrypted;
            return this;
        }
        public Builder kmsEncrypted(@Nullable Boolean kmsEncrypted) {
            this.kmsEncrypted = Codegen.ofNullable(kmsEncrypted);
            return this;
        }
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Codegen.ofNullable(kmsKey);
            return this;
        }
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Output.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }
        public Builder preserveExistingData(Output<Boolean> preserveExistingData) {
            this.preserveExistingData = Objects.requireNonNull(preserveExistingData);
            return this;
        }
        public Builder preserveExistingData(Boolean preserveExistingData) {
            this.preserveExistingData = Output.of(Objects.requireNonNull(preserveExistingData));
            return this;
        }
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Codegen.ofNullable(snapshotId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetName(Output<String> targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }
        public Builder targetName(String targetName) {
            this.targetName = Output.of(Objects.requireNonNull(targetName));
            return this;
        }        public StoredIscsiVolumeArgs build() {
            return new StoredIscsiVolumeArgs(diskId, gatewayArn, kmsEncrypted, kmsKey, networkInterfaceId, preserveExistingData, snapshotId, tags, targetName);
        }
    }
}
