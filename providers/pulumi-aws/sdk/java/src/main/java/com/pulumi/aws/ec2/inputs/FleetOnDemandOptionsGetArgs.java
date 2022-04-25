// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetOnDemandOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetOnDemandOptionsGetArgs Empty = new FleetOnDemandOptionsGetArgs();

    /**
     * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
     * 
     */
    @Import(name="allocationStrategy")
    private @Nullable Output<String> allocationStrategy;

    /**
     * @return How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
     * 
     */
    public Optional<Output<String>> allocationStrategy() {
        return Optional.ofNullable(this.allocationStrategy);
    }

    private FleetOnDemandOptionsGetArgs() {}

    private FleetOnDemandOptionsGetArgs(FleetOnDemandOptionsGetArgs $) {
        this.allocationStrategy = $.allocationStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetOnDemandOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetOnDemandOptionsGetArgs $;

        public Builder() {
            $ = new FleetOnDemandOptionsGetArgs();
        }

        public Builder(FleetOnDemandOptionsGetArgs defaults) {
            $ = new FleetOnDemandOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationStrategy How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
         * 
         * @return builder
         * 
         */
        public Builder allocationStrategy(@Nullable Output<String> allocationStrategy) {
            $.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * @param allocationStrategy How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
         * 
         * @return builder
         * 
         */
        public Builder allocationStrategy(String allocationStrategy) {
            return allocationStrategy(Output.of(allocationStrategy));
        }

        public FleetOnDemandOptionsGetArgs build() {
            return $;
        }
    }

}
