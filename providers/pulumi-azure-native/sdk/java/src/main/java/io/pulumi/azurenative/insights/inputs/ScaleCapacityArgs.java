// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The number of instances that can be used during this profile.
 * 
 */
public final class ScaleCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleCapacityArgs Empty = new ScaleCapacityArgs();

    /**
     * the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
     */
    @InputImport(name="default", required=true)
      private final Input<String> $default;

    public Input<String> get$default() {
        return this.$default;
    }

    /**
     * the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
     */
    @InputImport(name="maximum", required=true)
      private final Input<String> maximum;

    public Input<String> getMaximum() {
        return this.maximum;
    }

    /**
     * the minimum number of instances for the resource.
     * 
     */
    @InputImport(name="minimum", required=true)
      private final Input<String> minimum;

    public Input<String> getMinimum() {
        return this.minimum;
    }

    public ScaleCapacityArgs(
        Input<String> $default,
        Input<String> maximum,
        Input<String> minimum) {
        this.$default = Objects.requireNonNull($default, "expected parameter '$default' to be non-null");
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
    }

    private ScaleCapacityArgs() {
        this.$default = Input.empty();
        this.maximum = Input.empty();
        this.minimum = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> $default;
        private Input<String> maximum;
        private Input<String> minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder $default(Input<String> $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }

        public Builder $default(String $default) {
            this.$default = Input.of(Objects.requireNonNull($default));
            return this;
        }

        public Builder maximum(Input<String> maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }

        public Builder maximum(String maximum) {
            this.maximum = Input.of(Objects.requireNonNull(maximum));
            return this;
        }

        public Builder minimum(Input<String> minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }

        public Builder minimum(String minimum) {
            this.minimum = Input.of(Objects.requireNonNull(minimum));
            return this;
        }
        public ScaleCapacityArgs build() {
            return new ScaleCapacityArgs($default, maximum, minimum);
        }
    }
}
