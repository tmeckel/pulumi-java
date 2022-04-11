// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enabled configuration.
 * 
 */
public final class EnabledConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnabledConfigArgs Empty = new EnabledConfigArgs();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public EnabledConfigArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private EnabledConfigArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnabledConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EnabledConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public EnabledConfigArgs build() {
            return new EnabledConfigArgs(enabled);
        }
    }
}
