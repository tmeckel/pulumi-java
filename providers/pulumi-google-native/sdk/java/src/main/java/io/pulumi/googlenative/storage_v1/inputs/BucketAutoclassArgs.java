// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The bucket's Autoclass configuration.
 * 
 */
public final class BucketAutoclassArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketAutoclassArgs Empty = new BucketAutoclassArgs();

    /**
     * Whether or not Autoclass is enabled on this bucket
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * A date and time in RFC 3339 format representing the instant at which "enabled" was last toggled.
     * 
     */
    @Import(name="toggleTime")
      private final @Nullable Output<String> toggleTime;

    public Output<String> getToggleTime() {
        return this.toggleTime == null ? Codegen.empty() : this.toggleTime;
    }

    public BucketAutoclassArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> toggleTime) {
        this.enabled = enabled;
        this.toggleTime = toggleTime;
    }

    private BucketAutoclassArgs() {
        this.enabled = Codegen.empty();
        this.toggleTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAutoclassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> toggleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAutoclassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.toggleTime = defaults.toggleTime;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder toggleTime(@Nullable Output<String> toggleTime) {
            this.toggleTime = toggleTime;
            return this;
        }
        public Builder toggleTime(@Nullable String toggleTime) {
            this.toggleTime = Codegen.ofNullable(toggleTime);
            return this;
        }        public BucketAutoclassArgs build() {
            return new BucketAutoclassArgs(enabled, toggleTime);
        }
    }
}
