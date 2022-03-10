// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The key attributes.
 * 
 */
public final class KeyVaultKeyResponseAttributes extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultKeyResponseAttributes Empty = new KeyVaultKeyResponseAttributes();

    /**
     * When the key was created.
     * 
     */
    @InputImport(name="created")
      private final @Nullable Double created;

    public Optional<Double> getCreated() {
        return this.created == null ? Optional.empty() : Optional.ofNullable(this.created);
    }

    /**
     * Whether the key is enabled or not.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * When the key was updated.
     * 
     */
    @InputImport(name="updated")
      private final @Nullable Double updated;

    public Optional<Double> getUpdated() {
        return this.updated == null ? Optional.empty() : Optional.ofNullable(this.updated);
    }

    public KeyVaultKeyResponseAttributes(
        @Nullable Double created,
        @Nullable Boolean enabled,
        @Nullable Double updated) {
        this.created = created;
        this.enabled = enabled;
        this.updated = updated;
    }

    private KeyVaultKeyResponseAttributes() {
        this.created = null;
        this.enabled = null;
        this.updated = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyResponseAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double created;
        private @Nullable Boolean enabled;
        private @Nullable Double updated;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyResponseAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.updated = defaults.updated;
        }

        public Builder created(@Nullable Double created) {
            this.created = created;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder updated(@Nullable Double updated) {
            this.updated = updated;
            return this;
        }
        public KeyVaultKeyResponseAttributes build() {
            return new KeyVaultKeyResponseAttributes(created, enabled, updated);
        }
    }
}
