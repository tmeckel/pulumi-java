// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContentKeyPolicyRsaTokenKeyResponse {
    /**
     * The RSA Parameter exponent
     * 
     */
    private final String exponent;
    /**
     * The RSA Parameter modulus
     * 
     */
    private final String modulus;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyRsaTokenKey'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor
    private ContentKeyPolicyRsaTokenKeyResponse(
        @OutputCustomType.Parameter("exponent") String exponent,
        @OutputCustomType.Parameter("modulus") String modulus,
        @OutputCustomType.Parameter("odataType") String odataType) {
        this.exponent = exponent;
        this.modulus = modulus;
        this.odataType = odataType;
    }

    /**
     * The RSA Parameter exponent
     * 
    */
    public String getExponent() {
        return this.exponent;
    }
    /**
     * The RSA Parameter modulus
     * 
    */
    public String getModulus() {
        return this.modulus;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyRsaTokenKey'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyRsaTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exponent;
        private String modulus;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyRsaTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exponent = defaults.exponent;
    	      this.modulus = defaults.modulus;
    	      this.odataType = defaults.odataType;
        }

        public Builder exponent(String exponent) {
            this.exponent = Objects.requireNonNull(exponent);
            return this;
        }

        public Builder modulus(String modulus) {
            this.modulus = Objects.requireNonNull(modulus);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public ContentKeyPolicyRsaTokenKeyResponse build() {
            return new ContentKeyPolicyRsaTokenKeyResponse(exponent, modulus, odataType);
        }
    }
}
