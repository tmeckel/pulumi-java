// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketObjectCustomerEncryption {
    /**
     * @return Encryption algorithm. Default: AES256
     * 
     */
    private final @Nullable String encryptionAlgorithm;
    /**
     * @return Base64 encoded Customer-Supplied Encryption Key.
     * 
     */
    private final String encryptionKey;

    @CustomType.Constructor
    private BucketObjectCustomerEncryption(
        @CustomType.Parameter("encryptionAlgorithm") @Nullable String encryptionAlgorithm,
        @CustomType.Parameter("encryptionKey") String encryptionKey) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionKey = encryptionKey;
    }

    /**
     * @return Encryption algorithm. Default: AES256
     * 
     */
    public Optional<String> encryptionAlgorithm() {
        return Optional.ofNullable(this.encryptionAlgorithm);
    }
    /**
     * @return Base64 encoded Customer-Supplied Encryption Key.
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectCustomerEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encryptionAlgorithm;
        private String encryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectCustomerEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionKey = defaults.encryptionKey;
        }

        public Builder encryptionAlgorithm(@Nullable String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }        public BucketObjectCustomerEncryption build() {
            return new BucketObjectCustomerEncryption(encryptionAlgorithm, encryptionKey);
        }
    }
}
