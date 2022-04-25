// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.SourceVaultResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KeyVaultAndKeyReferenceResponse {
    /**
     * @return Url pointing to a key or secret in KeyVault
     * 
     */
    private final String keyUrl;
    /**
     * @return Resource id of the KeyVault containing the key or secret
     * 
     */
    private final SourceVaultResponse sourceVault;

    @CustomType.Constructor
    private KeyVaultAndKeyReferenceResponse(
        @CustomType.Parameter("keyUrl") String keyUrl,
        @CustomType.Parameter("sourceVault") SourceVaultResponse sourceVault) {
        this.keyUrl = keyUrl;
        this.sourceVault = sourceVault;
    }

    /**
     * @return Url pointing to a key or secret in KeyVault
     * 
     */
    public String keyUrl() {
        return this.keyUrl;
    }
    /**
     * @return Resource id of the KeyVault containing the key or secret
     * 
     */
    public SourceVaultResponse sourceVault() {
        return this.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private SourceVaultResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }
        public Builder sourceVault(SourceVaultResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }        public KeyVaultAndKeyReferenceResponse build() {
            return new KeyVaultAndKeyReferenceResponse(keyUrl, sourceVault);
        }
    }
}
