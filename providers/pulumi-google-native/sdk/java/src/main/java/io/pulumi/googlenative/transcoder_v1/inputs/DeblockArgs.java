// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deblock preprocessing configuration.
 * 
 */
public final class DeblockArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeblockArgs Empty = new DeblockArgs();

    /**
     * Enable deblocker. The default is `false`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
     * 
     */
    @InputImport(name="strength")
      private final @Nullable Input<Double> strength;

    public Input<Double> getStrength() {
        return this.strength == null ? Input.empty() : this.strength;
    }

    public DeblockArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Double> strength) {
        this.enabled = enabled;
        this.strength = strength;
    }

    private DeblockArgs() {
        this.enabled = Input.empty();
        this.strength = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeblockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Double> strength;

        public Builder() {
    	      // Empty
        }

        public Builder(DeblockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.strength = defaults.strength;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder strength(@Nullable Input<Double> strength) {
            this.strength = strength;
            return this;
        }

        public Builder strength(@Nullable Double strength) {
            this.strength = Input.ofNullable(strength);
            return this;
        }
        public DeblockArgs build() {
            return new DeblockArgs(enabled, strength);
        }
    }
}
