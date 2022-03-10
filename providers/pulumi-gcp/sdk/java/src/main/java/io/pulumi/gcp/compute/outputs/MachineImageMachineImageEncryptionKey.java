// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MachineImageMachineImageEncryptionKey {
    /**
     * The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    private final @Nullable String kmsKeyName;
    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    private final @Nullable String kmsKeyServiceAccount;
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    private final @Nullable String rawKey;
    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the
     * customer-supplied encryption key that protects this resource.
     * 
     */
    private final @Nullable String sha256;

    @OutputCustomType.Constructor
    private MachineImageMachineImageEncryptionKey(
        @OutputCustomType.Parameter("kmsKeyName") @Nullable String kmsKeyName,
        @OutputCustomType.Parameter("kmsKeyServiceAccount") @Nullable String kmsKeyServiceAccount,
        @OutputCustomType.Parameter("rawKey") @Nullable String rawKey,
        @OutputCustomType.Parameter("sha256") @Nullable String sha256) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.sha256 = sha256;
    }

    /**
     * The name of the encryption key that is stored in Google Cloud KMS.
     * 
    */
    public Optional<String> getKmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }
    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
    */
    public Optional<String> getKmsKeyServiceAccount() {
        return Optional.ofNullable(this.kmsKeyServiceAccount);
    }
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
    */
    public Optional<String> getRawKey() {
        return Optional.ofNullable(this.rawKey);
    }
    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the
     * customer-supplied encryption key that protects this resource.
     * 
    */
    public Optional<String> getSha256() {
        return Optional.ofNullable(this.sha256);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageMachineImageEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyName;
        private @Nullable String kmsKeyServiceAccount;
        private @Nullable String rawKey;
        private @Nullable String sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageMachineImageEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        public Builder rawKey(@Nullable String rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public Builder sha256(@Nullable String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public MachineImageMachineImageEncryptionKey build() {
            return new MachineImageMachineImageEncryptionKey(kmsKeyName, kmsKeyServiceAccount, rawKey, sha256);
        }
    }
}
