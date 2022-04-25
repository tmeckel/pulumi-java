// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.azurenative.batch.outputs.KeyVaultPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionPropertiesResponse {
    /**
     * @return Type of the key source.
     * 
     */
    private final @Nullable String keySource;
    /**
     * @return Additional details when using Microsoft.KeyVault
     * 
     */
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    @CustomType.Constructor
    private EncryptionPropertiesResponse(
        @CustomType.Parameter("keySource") @Nullable String keySource,
        @CustomType.Parameter("keyVaultProperties") @Nullable KeyVaultPropertiesResponse keyVaultProperties) {
        this.keySource = keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    /**
     * @return Type of the key source.
     * 
     */
    public Optional<String> keySource() {
        return Optional.ofNullable(this.keySource);
    }
    /**
     * @return Additional details when using Microsoft.KeyVault
     * 
     */
    public Optional<KeyVaultPropertiesResponse> keyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keySource;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder keySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }
        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }        public EncryptionPropertiesResponse build() {
            return new EncryptionPropertiesResponse(keySource, keyVaultProperties);
        }
    }
}
