// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestLaunchTemplateConfigOverrideGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestLaunchTemplateConfigOverrideGetArgs Empty = new SpotFleetRequestLaunchTemplateConfigOverrideGetArgs();

    /**
     * The availability zone in which to place the request.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    /**
     * The type of instance to request.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Double> priority;

    public Output<Double> getPriority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * The maximum spot bid for this override request.
     * 
     */
    @Import(name="spotPrice")
      private final @Nullable Output<String> spotPrice;

    public Output<String> getSpotPrice() {
        return this.spotPrice == null ? Codegen.empty() : this.spotPrice;
    }

    /**
     * The subnet in which to launch the requested instance.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
     */
    @Import(name="weightedCapacity")
      private final @Nullable Output<Double> weightedCapacity;

    public Output<Double> getWeightedCapacity() {
        return this.weightedCapacity == null ? Codegen.empty() : this.weightedCapacity;
    }

    public SpotFleetRequestLaunchTemplateConfigOverrideGetArgs(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> instanceType,
        @Nullable Output<Double> priority,
        @Nullable Output<String> spotPrice,
        @Nullable Output<String> subnetId,
        @Nullable Output<Double> weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceType = instanceType;
        this.priority = priority;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    private SpotFleetRequestLaunchTemplateConfigOverrideGetArgs() {
        this.availabilityZone = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.priority = Codegen.empty();
        this.spotPrice = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.weightedCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchTemplateConfigOverrideGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Double> priority;
        private @Nullable Output<String> spotPrice;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Double> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchTemplateConfigOverrideGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceType = defaults.instanceType;
    	      this.priority = defaults.priority;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder priority(@Nullable Output<Double> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Double priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder spotPrice(@Nullable Output<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = Codegen.ofNullable(spotPrice);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }
        public Builder weightedCapacity(@Nullable Output<Double> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = Codegen.ofNullable(weightedCapacity);
            return this;
        }        public SpotFleetRequestLaunchTemplateConfigOverrideGetArgs build() {
            return new SpotFleetRequestLaunchTemplateConfigOverrideGetArgs(availabilityZone, instanceType, priority, spotPrice, subnetId, weightedCapacity);
        }
    }
}
