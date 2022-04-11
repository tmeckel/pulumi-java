// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetTargetCapacitySpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetTargetCapacitySpecificationArgs Empty = new FleetTargetCapacitySpecificationArgs();

    /**
     * Default target capacity type. Valid values: `on-demand`, `spot`.
     * 
     */
    @Import(name="defaultTargetCapacityType", required=true)
      private final Output<String> defaultTargetCapacityType;

    public Output<String> getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * The number of On-Demand units to request.
     * 
     */
    @Import(name="onDemandTargetCapacity")
      private final @Nullable Output<Integer> onDemandTargetCapacity;

    public Output<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Codegen.empty() : this.onDemandTargetCapacity;
    }

    /**
     * The number of Spot units to request.
     * 
     */
    @Import(name="spotTargetCapacity")
      private final @Nullable Output<Integer> spotTargetCapacity;

    public Output<Integer> getSpotTargetCapacity() {
        return this.spotTargetCapacity == null ? Codegen.empty() : this.spotTargetCapacity;
    }

    /**
     * The number of units to request, filled using `default_target_capacity_type`.
     * 
     */
    @Import(name="totalTargetCapacity", required=true)
      private final Output<Integer> totalTargetCapacity;

    public Output<Integer> getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public FleetTargetCapacitySpecificationArgs(
        Output<String> defaultTargetCapacityType,
        @Nullable Output<Integer> onDemandTargetCapacity,
        @Nullable Output<Integer> spotTargetCapacity,
        Output<Integer> totalTargetCapacity) {
        this.defaultTargetCapacityType = Objects.requireNonNull(defaultTargetCapacityType, "expected parameter 'defaultTargetCapacityType' to be non-null");
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.spotTargetCapacity = spotTargetCapacity;
        this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity, "expected parameter 'totalTargetCapacity' to be non-null");
    }

    private FleetTargetCapacitySpecificationArgs() {
        this.defaultTargetCapacityType = Codegen.empty();
        this.onDemandTargetCapacity = Codegen.empty();
        this.spotTargetCapacity = Codegen.empty();
        this.totalTargetCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetTargetCapacitySpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> defaultTargetCapacityType;
        private @Nullable Output<Integer> onDemandTargetCapacity;
        private @Nullable Output<Integer> spotTargetCapacity;
        private Output<Integer> totalTargetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetTargetCapacitySpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetCapacityType = defaults.defaultTargetCapacityType;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.spotTargetCapacity = defaults.spotTargetCapacity;
    	      this.totalTargetCapacity = defaults.totalTargetCapacity;
        }

        public Builder defaultTargetCapacityType(Output<String> defaultTargetCapacityType) {
            this.defaultTargetCapacityType = Objects.requireNonNull(defaultTargetCapacityType);
            return this;
        }
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.defaultTargetCapacityType = Output.of(Objects.requireNonNull(defaultTargetCapacityType));
            return this;
        }
        public Builder onDemandTargetCapacity(@Nullable Output<Integer> onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }
        public Builder onDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = Codegen.ofNullable(onDemandTargetCapacity);
            return this;
        }
        public Builder spotTargetCapacity(@Nullable Output<Integer> spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }
        public Builder spotTargetCapacity(@Nullable Integer spotTargetCapacity) {
            this.spotTargetCapacity = Codegen.ofNullable(spotTargetCapacity);
            return this;
        }
        public Builder totalTargetCapacity(Output<Integer> totalTargetCapacity) {
            this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity);
            return this;
        }
        public Builder totalTargetCapacity(Integer totalTargetCapacity) {
            this.totalTargetCapacity = Output.of(Objects.requireNonNull(totalTargetCapacity));
            return this;
        }        public FleetTargetCapacitySpecificationArgs build() {
            return new FleetTargetCapacitySpecificationArgs(defaultTargetCapacityType, onDemandTargetCapacity, spotTargetCapacity, totalTargetCapacity);
        }
    }
}
