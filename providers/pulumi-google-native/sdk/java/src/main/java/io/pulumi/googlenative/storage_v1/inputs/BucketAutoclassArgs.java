// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * A date and time in RFC 3339 format representing the instant at which "enabled" was last toggled.
     * 
     */
    @InputImport(name="toggleTime")
    private final @Nullable Input<String> toggleTime;

    public Input<String> getToggleTime() {
        return this.toggleTime == null ? Input.empty() : this.toggleTime;
    }

    public BucketAutoclassArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> toggleTime) {
        this.enabled = enabled;
        this.toggleTime = toggleTime;
    }

    private BucketAutoclassArgs() {
        this.enabled = Input.empty();
        this.toggleTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAutoclassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> toggleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAutoclassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.toggleTime = defaults.toggleTime;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setToggleTime(@Nullable Input<String> toggleTime) {
            this.toggleTime = toggleTime;
            return this;
        }

        public Builder setToggleTime(@Nullable String toggleTime) {
            this.toggleTime = Input.ofNullable(toggleTime);
            return this;
        }

        public BucketAutoclassArgs build() {
            return new BucketAutoclassArgs(enabled, toggleTime);
        }
    }
}
