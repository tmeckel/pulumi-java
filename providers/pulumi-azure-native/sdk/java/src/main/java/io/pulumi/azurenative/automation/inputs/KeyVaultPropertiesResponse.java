// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning key vault encryption for a configuration store.
 * 
 */
public final class KeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * The name of key used to encrypt data.
     * 
     */
    @InputImport(name="keyName")
      private final @Nullable String keyName;

    public Optional<String> getKeyName() {
        return this.keyName == null ? Optional.empty() : Optional.ofNullable(this.keyName);
    }

    /**
     * The key version of the key used to encrypt data.
     * 
     */
    @InputImport(name="keyVersion")
      private final @Nullable String keyVersion;

    public Optional<String> getKeyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    @InputImport(name="keyvaultUri")
      private final @Nullable String keyvaultUri;

    public Optional<String> getKeyvaultUri() {
        return this.keyvaultUri == null ? Optional.empty() : Optional.ofNullable(this.keyvaultUri);
    }

    public KeyVaultPropertiesResponse(
        @Nullable String keyName,
        @Nullable String keyVersion,
        @Nullable String keyvaultUri) {
        this.keyName = keyName;
        this.keyVersion = keyVersion;
        this.keyvaultUri = keyvaultUri;
    }

    private KeyVaultPropertiesResponse() {
        this.keyName = null;
        this.keyVersion = null;
        this.keyvaultUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keyVersion;
        private @Nullable String keyvaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.keyvaultUri = defaults.keyvaultUri;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder keyvaultUri(@Nullable String keyvaultUri) {
            this.keyvaultUri = keyvaultUri;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyVersion, keyvaultUri);
        }
    }
}
