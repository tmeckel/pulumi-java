// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse {
    /**
     * The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    private final String cryptoKeyName;
    /**
     * The wrapped data crypto key.
     * 
     */
    private final String wrappedKey;

    @OutputCustomType.Constructor({"cryptoKeyName","wrappedKey"})
    private GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse(
        String cryptoKeyName,
        String wrappedKey) {
        this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName);
        this.wrappedKey = Objects.requireNonNull(wrappedKey);
    }

    /**
     * The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    public String getCryptoKeyName() {
        return this.cryptoKeyName;
    }
    /**
     * The wrapped data crypto key.
     * 
     */
    public String getWrappedKey() {
        return this.wrappedKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cryptoKeyName;
        private String wrappedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyName = defaults.cryptoKeyName;
    	      this.wrappedKey = defaults.wrappedKey;
        }

        public Builder setCryptoKeyName(String cryptoKeyName) {
            this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName);
            return this;
        }

        public Builder setWrappedKey(String wrappedKey) {
            this.wrappedKey = Objects.requireNonNull(wrappedKey);
            return this;
        }

        public GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse build() {
            return new GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse(cryptoKeyName, wrappedKey);
        }
    }
}
