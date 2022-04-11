// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoKeyArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pseudonymization method that generates surrogates via cryptographic hashing. Uses SHA-256. The key size must be either 32 or 64 bytes. Outputs a base64 encoded representation of the hashed output (for example, L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=). Currently, only string and integer values can be hashed. See https://cloud.google.com/dlp/docs/pseudonymization to learn more.
 * 
 */
public final class GooglePrivacyDlpV2CryptoHashConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CryptoHashConfigArgs Empty = new GooglePrivacyDlpV2CryptoHashConfigArgs();

    /**
     * The key used by the hash function.
     * 
     */
    @Import(name="cryptoKey")
      private final @Nullable Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;

    public Output<GooglePrivacyDlpV2CryptoKeyArgs> getCryptoKey() {
        return this.cryptoKey == null ? Codegen.empty() : this.cryptoKey;
    }

    public GooglePrivacyDlpV2CryptoHashConfigArgs(@Nullable Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey) {
        this.cryptoKey = cryptoKey;
    }

    private GooglePrivacyDlpV2CryptoHashConfigArgs() {
        this.cryptoKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoHashConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoHashConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKey = defaults.cryptoKey;
        }

        public Builder cryptoKey(@Nullable Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey) {
            this.cryptoKey = cryptoKey;
            return this;
        }
        public Builder cryptoKey(@Nullable GooglePrivacyDlpV2CryptoKeyArgs cryptoKey) {
            this.cryptoKey = Codegen.ofNullable(cryptoKey);
            return this;
        }        public GooglePrivacyDlpV2CryptoHashConfigArgs build() {
            return new GooglePrivacyDlpV2CryptoHashConfigArgs(cryptoKey);
        }
    }
}
