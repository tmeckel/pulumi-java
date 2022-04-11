// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType;
import io.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetTargetCapacitySpecificationRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetTargetCapacitySpecificationRequestArgs Empty = new EC2FleetTargetCapacitySpecificationRequestArgs();

    @Import(name="defaultTargetCapacityType")
      private final @Nullable Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> defaultTargetCapacityType;

    public Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType == null ? Codegen.empty() : this.defaultTargetCapacityType;
    }

    @Import(name="onDemandTargetCapacity")
      private final @Nullable Output<Integer> onDemandTargetCapacity;

    public Output<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Codegen.empty() : this.onDemandTargetCapacity;
    }

    @Import(name="spotTargetCapacity")
      private final @Nullable Output<Integer> spotTargetCapacity;

    public Output<Integer> getSpotTargetCapacity() {
        return this.spotTargetCapacity == null ? Codegen.empty() : this.spotTargetCapacity;
    }

    @Import(name="targetCapacityUnitType")
      private final @Nullable Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> targetCapacityUnitType;

    public Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> getTargetCapacityUnitType() {
        return this.targetCapacityUnitType == null ? Codegen.empty() : this.targetCapacityUnitType;
    }

    @Import(name="totalTargetCapacity", required=true)
      private final Output<Integer> totalTargetCapacity;

    public Output<Integer> getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public EC2FleetTargetCapacitySpecificationRequestArgs(
        @Nullable Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> defaultTargetCapacityType,
        @Nullable Output<Integer> onDemandTargetCapacity,
        @Nullable Output<Integer> spotTargetCapacity,
        @Nullable Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> targetCapacityUnitType,
        Output<Integer> totalTargetCapacity) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.spotTargetCapacity = spotTargetCapacity;
        this.targetCapacityUnitType = targetCapacityUnitType;
        this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity, "expected parameter 'totalTargetCapacity' to be non-null");
    }

    private EC2FleetTargetCapacitySpecificationRequestArgs() {
        this.defaultTargetCapacityType = Codegen.empty();
        this.onDemandTargetCapacity = Codegen.empty();
        this.spotTargetCapacity = Codegen.empty();
        this.targetCapacityUnitType = Codegen.empty();
        this.totalTargetCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetTargetCapacitySpecificationRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> defaultTargetCapacityType;
        private @Nullable Output<Integer> onDemandTargetCapacity;
        private @Nullable Output<Integer> spotTargetCapacity;
        private @Nullable Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> targetCapacityUnitType;
        private Output<Integer> totalTargetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetTargetCapacitySpecificationRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetCapacityType = defaults.defaultTargetCapacityType;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.spotTargetCapacity = defaults.spotTargetCapacity;
    	      this.targetCapacityUnitType = defaults.targetCapacityUnitType;
    	      this.totalTargetCapacity = defaults.totalTargetCapacity;
        }

        public Builder defaultTargetCapacityType(@Nullable Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> defaultTargetCapacityType) {
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }
        public Builder defaultTargetCapacityType(@Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType) {
            this.defaultTargetCapacityType = Codegen.ofNullable(defaultTargetCapacityType);
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
        public Builder targetCapacityUnitType(@Nullable Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> targetCapacityUnitType) {
            this.targetCapacityUnitType = targetCapacityUnitType;
            return this;
        }
        public Builder targetCapacityUnitType(@Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType) {
            this.targetCapacityUnitType = Codegen.ofNullable(targetCapacityUnitType);
            return this;
        }
        public Builder totalTargetCapacity(Output<Integer> totalTargetCapacity) {
            this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity);
            return this;
        }
        public Builder totalTargetCapacity(Integer totalTargetCapacity) {
            this.totalTargetCapacity = Output.of(Objects.requireNonNull(totalTargetCapacity));
            return this;
        }        public EC2FleetTargetCapacitySpecificationRequestArgs build() {
            return new EC2FleetTargetCapacitySpecificationRequestArgs(defaultTargetCapacityType, onDemandTargetCapacity, spotTargetCapacity, targetCapacityUnitType, totalTargetCapacity);
        }
    }
}
