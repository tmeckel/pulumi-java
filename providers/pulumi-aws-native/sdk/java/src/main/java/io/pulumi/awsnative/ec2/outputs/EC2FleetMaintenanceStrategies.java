// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.EC2FleetCapacityRebalance;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EC2FleetMaintenanceStrategies {
    private final @Nullable EC2FleetCapacityRebalance capacityRebalance;

    @OutputCustomType.Constructor
    private EC2FleetMaintenanceStrategies(@OutputCustomType.Parameter("capacityRebalance") @Nullable EC2FleetCapacityRebalance capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    public Optional<EC2FleetCapacityRebalance> getCapacityRebalance() {
        return Optional.ofNullable(this.capacityRebalance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetMaintenanceStrategies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EC2FleetCapacityRebalance capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetMaintenanceStrategies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder capacityRebalance(@Nullable EC2FleetCapacityRebalance capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }
        public EC2FleetMaintenanceStrategies build() {
            return new EC2FleetMaintenanceStrategies(capacityRebalance);
        }
    }
}
