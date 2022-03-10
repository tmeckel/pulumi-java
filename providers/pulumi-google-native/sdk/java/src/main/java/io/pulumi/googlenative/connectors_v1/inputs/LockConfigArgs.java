// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Determines whether or no a connection is locked. If locked, a reason must be specified.
 * 
 */
public final class LockConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LockConfigArgs Empty = new LockConfigArgs();

    /**
     * Indicates whether or not the connection is locked.
     * 
     */
    @InputImport(name="locked")
      private final @Nullable Input<Boolean> locked;

    public Input<Boolean> getLocked() {
        return this.locked == null ? Input.empty() : this.locked;
    }

    /**
     * Describes why a connection is locked.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public LockConfigArgs(
        @Nullable Input<Boolean> locked,
        @Nullable Input<String> reason) {
        this.locked = locked;
        this.reason = reason;
    }

    private LockConfigArgs() {
        this.locked = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LockConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> locked;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(LockConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.reason = defaults.reason;
        }

        public Builder locked(@Nullable Input<Boolean> locked) {
            this.locked = locked;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            this.locked = Input.ofNullable(locked);
            return this;
        }

        public Builder reason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder reason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }
        public LockConfigArgs build() {
            return new LockConfigArgs(locked, reason);
        }
    }
}
