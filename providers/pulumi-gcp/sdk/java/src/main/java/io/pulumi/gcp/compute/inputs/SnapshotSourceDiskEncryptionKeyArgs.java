// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotSourceDiskEncryptionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotSourceDiskEncryptionKeyArgs Empty = new SnapshotSourceDiskEncryptionKeyArgs();

    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    @InputImport(name="kmsKeyServiceAccount")
      private final @Nullable Input<String> kmsKeyServiceAccount;

    public Input<String> getKmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount == null ? Input.empty() : this.kmsKeyServiceAccount;
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="rawKey")
      private final @Nullable Input<String> rawKey;

    public Input<String> getRawKey() {
        return this.rawKey == null ? Input.empty() : this.rawKey;
    }

    public SnapshotSourceDiskEncryptionKeyArgs(
        @Nullable Input<String> kmsKeyServiceAccount,
        @Nullable Input<String> rawKey) {
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
    }

    private SnapshotSourceDiskEncryptionKeyArgs() {
        this.kmsKeyServiceAccount = Input.empty();
        this.rawKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSourceDiskEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyServiceAccount;
        private @Nullable Input<String> rawKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotSourceDiskEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
        }

        public Builder kmsKeyServiceAccount(@Nullable Input<String> kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        public Builder kmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = Input.ofNullable(kmsKeyServiceAccount);
            return this;
        }

        public Builder rawKey(@Nullable Input<String> rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public Builder rawKey(@Nullable String rawKey) {
            this.rawKey = Input.ofNullable(rawKey);
            return this;
        }
        public SnapshotSourceDiskEncryptionKeyArgs build() {
            return new SnapshotSourceDiskEncryptionKeyArgs(kmsKeyServiceAccount, rawKey);
        }
    }
}
