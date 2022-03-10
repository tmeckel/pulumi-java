// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetNetworkInterfaceCountRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetNetworkInterfaceCountRequestArgs Empty = new EC2FleetNetworkInterfaceCountRequestArgs();

    @InputImport(name="max")
      private final @Nullable Input<Integer> max;

    public Input<Integer> getMax() {
        return this.max == null ? Input.empty() : this.max;
    }

    @InputImport(name="min")
      private final @Nullable Input<Integer> min;

    public Input<Integer> getMin() {
        return this.min == null ? Input.empty() : this.min;
    }

    public EC2FleetNetworkInterfaceCountRequestArgs(
        @Nullable Input<Integer> max,
        @Nullable Input<Integer> min) {
        this.max = max;
        this.min = min;
    }

    private EC2FleetNetworkInterfaceCountRequestArgs() {
        this.max = Input.empty();
        this.min = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetNetworkInterfaceCountRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> max;
        private @Nullable Input<Integer> min;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetNetworkInterfaceCountRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Input<Integer> max) {
            this.max = max;
            return this;
        }

        public Builder max(@Nullable Integer max) {
            this.max = Input.ofNullable(max);
            return this;
        }

        public Builder min(@Nullable Input<Integer> min) {
            this.min = min;
            return this;
        }

        public Builder min(@Nullable Integer min) {
            this.min = Input.ofNullable(min);
            return this;
        }
        public EC2FleetNetworkInterfaceCountRequestArgs build() {
            return new EC2FleetNetworkInterfaceCountRequestArgs(max, min);
        }
    }
}
