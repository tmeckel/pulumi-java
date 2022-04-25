// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.KeyVaultSigningKeyParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UrlSigningKeyResponse {
    /**
     * @return Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    private final String keyId;
    /**
     * @return Defines the parameters for using customer key vault for Url Signing Key.
     * 
     */
    private final KeyVaultSigningKeyParametersResponse keySourceParameters;

    @CustomType.Constructor
    private UrlSigningKeyResponse(
        @CustomType.Parameter("keyId") String keyId,
        @CustomType.Parameter("keySourceParameters") KeyVaultSigningKeyParametersResponse keySourceParameters) {
        this.keyId = keyId;
        this.keySourceParameters = keySourceParameters;
    }

    /**
     * @return Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return Defines the parameters for using customer key vault for Url Signing Key.
     * 
     */
    public KeyVaultSigningKeyParametersResponse keySourceParameters() {
        return this.keySourceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private KeyVaultSigningKeyParametersResponse keySourceParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keySourceParameters = defaults.keySourceParameters;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keySourceParameters(KeyVaultSigningKeyParametersResponse keySourceParameters) {
            this.keySourceParameters = Objects.requireNonNull(keySourceParameters);
            return this;
        }        public UrlSigningKeyResponse build() {
            return new UrlSigningKeyResponse(keyId, keySourceParameters);
        }
    }
}
