// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TransientCryptoKeyArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2UnwrappedCryptoKeyArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is a data encryption key (DEK) (as opposed to a key encryption key (KEK) stored by Cloud Key Management Service (Cloud KMS). When using Cloud KMS to wrap or unwrap a DEK, be sure to set an appropriate IAM policy on the KEK to ensure an attacker cannot unwrap the DEK.
 * 
 */
public final class GooglePrivacyDlpV2CryptoKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CryptoKeyArgs Empty = new GooglePrivacyDlpV2CryptoKeyArgs();

    /**
     * Key wrapped using Cloud KMS
     * 
     */
    @InputImport(name="kmsWrapped")
    private final @Nullable Input<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped;

    public Input<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> getKmsWrapped() {
        return this.kmsWrapped == null ? Input.empty() : this.kmsWrapped;
    }

    /**
     * Transient crypto key
     * 
     */
    @InputImport(name="transient")
    private final @Nullable Input<GooglePrivacyDlpV2TransientCryptoKeyArgs> $transient;

    public Input<GooglePrivacyDlpV2TransientCryptoKeyArgs> get$transient() {
        return this.$transient == null ? Input.empty() : this.$transient;
    }

    /**
     * Unwrapped crypto key
     * 
     */
    @InputImport(name="unwrapped")
    private final @Nullable Input<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped;

    public Input<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> getUnwrapped() {
        return this.unwrapped == null ? Input.empty() : this.unwrapped;
    }

    public GooglePrivacyDlpV2CryptoKeyArgs(
        @Nullable Input<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped,
        @Nullable Input<GooglePrivacyDlpV2TransientCryptoKeyArgs> $transient,
        @Nullable Input<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped) {
        this.kmsWrapped = kmsWrapped;
        this.$transient = $transient;
        this.unwrapped = unwrapped;
    }

    private GooglePrivacyDlpV2CryptoKeyArgs() {
        this.kmsWrapped = Input.empty();
        this.$transient = Input.empty();
        this.unwrapped = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped;
        private @Nullable Input<GooglePrivacyDlpV2TransientCryptoKeyArgs> $transient;
        private @Nullable Input<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsWrapped = defaults.kmsWrapped;
    	      this.$transient = defaults.$transient;
    	      this.unwrapped = defaults.unwrapped;
        }

        public Builder setKmsWrapped(@Nullable Input<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped) {
            this.kmsWrapped = kmsWrapped;
            return this;
        }

        public Builder setKmsWrapped(@Nullable GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs kmsWrapped) {
            this.kmsWrapped = Input.ofNullable(kmsWrapped);
            return this;
        }

        public Builder set$transient(@Nullable Input<GooglePrivacyDlpV2TransientCryptoKeyArgs> $transient) {
            this.$transient = $transient;
            return this;
        }

        public Builder set$transient(@Nullable GooglePrivacyDlpV2TransientCryptoKeyArgs $transient) {
            this.$transient = Input.ofNullable($transient);
            return this;
        }

        public Builder setUnwrapped(@Nullable Input<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped) {
            this.unwrapped = unwrapped;
            return this;
        }

        public Builder setUnwrapped(@Nullable GooglePrivacyDlpV2UnwrappedCryptoKeyArgs unwrapped) {
            this.unwrapped = Input.ofNullable(unwrapped);
            return this;
        }

        public GooglePrivacyDlpV2CryptoKeyArgs build() {
            return new GooglePrivacyDlpV2CryptoKeyArgs(kmsWrapped, $transient, unwrapped);
        }
    }
}
