// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A CryptoKeyVersionTemplate specifies the properties to use when creating a new CryptoKeyVersion, either manually with CreateCryptoKeyVersion or automatically as a result of auto-rotation.
 * 
 */
public final class CryptoKeyVersionTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final CryptoKeyVersionTemplateResponse Empty = new CryptoKeyVersionTemplateResponse();

    /**
     * Algorithm to use when creating a CryptoKeyVersion based on this template. For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both this field is omitted and CryptoKey.purpose is ENCRYPT_DECRYPT.
     * 
     */
    @InputImport(name="algorithm", required=true)
    private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * ProtectionLevel to use when creating a CryptoKeyVersion based on this template. Immutable. Defaults to SOFTWARE.
     * 
     */
    @InputImport(name="protectionLevel", required=true)
    private final String protectionLevel;

    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    public CryptoKeyVersionTemplateResponse(
        String algorithm,
        String protectionLevel) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.protectionLevel = Objects.requireNonNull(protectionLevel, "expected parameter 'protectionLevel' to be non-null");
    }

    private CryptoKeyVersionTemplateResponse() {
        this.algorithm = null;
        this.protectionLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setProtectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }

        public CryptoKeyVersionTemplateResponse build() {
            return new CryptoKeyVersionTemplateResponse(algorithm, protectionLevel);
        }
    }
}
