// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.StatefulPolicyPreservedStateArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StatefulPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulPolicyArgs Empty = new StatefulPolicyArgs();

    @InputImport(name="preservedState")
      private final @Nullable Input<StatefulPolicyPreservedStateArgs> preservedState;

    public Input<StatefulPolicyPreservedStateArgs> getPreservedState() {
        return this.preservedState == null ? Input.empty() : this.preservedState;
    }

    public StatefulPolicyArgs(@Nullable Input<StatefulPolicyPreservedStateArgs> preservedState) {
        this.preservedState = preservedState;
    }

    private StatefulPolicyArgs() {
        this.preservedState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StatefulPolicyPreservedStateArgs> preservedState;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preservedState = defaults.preservedState;
        }

        public Builder preservedState(@Nullable Input<StatefulPolicyPreservedStateArgs> preservedState) {
            this.preservedState = preservedState;
            return this;
        }

        public Builder preservedState(@Nullable StatefulPolicyPreservedStateArgs preservedState) {
            this.preservedState = Input.ofNullable(preservedState);
            return this;
        }
        public StatefulPolicyArgs build() {
            return new StatefulPolicyArgs(preservedState);
        }
    }
}
