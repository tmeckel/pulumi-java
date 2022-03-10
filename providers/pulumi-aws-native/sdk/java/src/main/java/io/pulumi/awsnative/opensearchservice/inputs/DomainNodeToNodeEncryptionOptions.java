// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainNodeToNodeEncryptionOptions extends io.pulumi.resources.InvokeArgs {

    public static final DomainNodeToNodeEncryptionOptions Empty = new DomainNodeToNodeEncryptionOptions();

    @InputImport(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public DomainNodeToNodeEncryptionOptions(@Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    private DomainNodeToNodeEncryptionOptions() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNodeToNodeEncryptionOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNodeToNodeEncryptionOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public DomainNodeToNodeEncryptionOptions build() {
            return new DomainNodeToNodeEncryptionOptions(enabled);
        }
    }
}
