// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudkms_v1.enums.CryptoKeyVersionTemplateAlgorithm;
import io.pulumi.googlenative.cloudkms_v1.enums.CryptoKeyVersionTemplateProtectionLevel;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CryptoKeyVersionTemplate specifies the properties to use when creating a new CryptoKeyVersion, either manually with CreateCryptoKeyVersion or automatically as a result of auto-rotation.
 * 
 */
public final class CryptoKeyVersionTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyVersionTemplateArgs Empty = new CryptoKeyVersionTemplateArgs();

    /**
     * Algorithm to use when creating a CryptoKeyVersion based on this template. For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both this field is omitted and CryptoKey.purpose is ENCRYPT_DECRYPT.
     * 
     */
    @InputImport(name="algorithm", required=true)
      private final Input<CryptoKeyVersionTemplateAlgorithm> algorithm;

    public Input<CryptoKeyVersionTemplateAlgorithm> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * ProtectionLevel to use when creating a CryptoKeyVersion based on this template. Immutable. Defaults to SOFTWARE.
     * 
     */
    @InputImport(name="protectionLevel")
      private final @Nullable Input<CryptoKeyVersionTemplateProtectionLevel> protectionLevel;

    public Input<CryptoKeyVersionTemplateProtectionLevel> getProtectionLevel() {
        return this.protectionLevel == null ? Input.empty() : this.protectionLevel;
    }

    public CryptoKeyVersionTemplateArgs(
        Input<CryptoKeyVersionTemplateAlgorithm> algorithm,
        @Nullable Input<CryptoKeyVersionTemplateProtectionLevel> protectionLevel) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.protectionLevel = protectionLevel;
    }

    private CryptoKeyVersionTemplateArgs() {
        this.algorithm = Input.empty();
        this.protectionLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CryptoKeyVersionTemplateAlgorithm> algorithm;
        private @Nullable Input<CryptoKeyVersionTemplateProtectionLevel> protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder algorithm(Input<CryptoKeyVersionTemplateAlgorithm> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder algorithm(CryptoKeyVersionTemplateAlgorithm algorithm) {
            this.algorithm = Input.of(Objects.requireNonNull(algorithm));
            return this;
        }

        public Builder protectionLevel(@Nullable Input<CryptoKeyVersionTemplateProtectionLevel> protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }

        public Builder protectionLevel(@Nullable CryptoKeyVersionTemplateProtectionLevel protectionLevel) {
            this.protectionLevel = Input.ofNullable(protectionLevel);
            return this;
        }
        public CryptoKeyVersionTemplateArgs build() {
            return new CryptoKeyVersionTemplateArgs(algorithm, protectionLevel);
        }
    }
}
