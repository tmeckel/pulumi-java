// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetOnDemandOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetOnDemandOptionsArgs Empty = new FleetOnDemandOptionsArgs();

    /**
     * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
     * 
     */
    @InputImport(name="allocationStrategy")
      private final @Nullable Input<String> allocationStrategy;

    public Input<String> getAllocationStrategy() {
        return this.allocationStrategy == null ? Input.empty() : this.allocationStrategy;
    }

    public FleetOnDemandOptionsArgs(@Nullable Input<String> allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    private FleetOnDemandOptionsArgs() {
        this.allocationStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetOnDemandOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allocationStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetOnDemandOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
        }

        public Builder allocationStrategy(@Nullable Input<String> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = Input.ofNullable(allocationStrategy);
            return this;
        }
        public FleetOnDemandOptionsArgs build() {
            return new FleetOnDemandOptionsArgs(allocationStrategy);
        }
    }
}
