// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs Empty = new LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs();

    /**
     * The required duration in minutes. This value must be a multiple of 60.
     * 
     */
    @InputImport(name="blockDurationMinutes")
      private final @Nullable Input<Integer> blockDurationMinutes;

    public Input<Integer> getBlockDurationMinutes() {
        return this.blockDurationMinutes == null ? Input.empty() : this.blockDurationMinutes;
    }

    /**
     * The behavior when a Spot Instance is interrupted. Can be `hibernate`,
     * `stop`, or `terminate`. (Default: `terminate`).
     * 
     */
    @InputImport(name="instanceInterruptionBehavior")
      private final @Nullable Input<String> instanceInterruptionBehavior;

    public Input<String> getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Input.empty() : this.instanceInterruptionBehavior;
    }

    /**
     * The maximum hourly price you're willing to pay for the Spot Instances.
     * 
     */
    @InputImport(name="maxPrice")
      private final @Nullable Input<String> maxPrice;

    public Input<String> getMaxPrice() {
        return this.maxPrice == null ? Input.empty() : this.maxPrice;
    }

    /**
     * The Spot Instance request type. Can be `one-time`, or `persistent`.
     * 
     */
    @InputImport(name="spotInstanceType")
      private final @Nullable Input<String> spotInstanceType;

    public Input<String> getSpotInstanceType() {
        return this.spotInstanceType == null ? Input.empty() : this.spotInstanceType;
    }

    /**
     * The end date of the request.
     * 
     */
    @InputImport(name="validUntil")
      private final @Nullable Input<String> validUntil;

    public Input<String> getValidUntil() {
        return this.validUntil == null ? Input.empty() : this.validUntil;
    }

    public LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs(
        @Nullable Input<Integer> blockDurationMinutes,
        @Nullable Input<String> instanceInterruptionBehavior,
        @Nullable Input<String> maxPrice,
        @Nullable Input<String> spotInstanceType,
        @Nullable Input<String> validUntil) {
        this.blockDurationMinutes = blockDurationMinutes;
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.maxPrice = maxPrice;
        this.spotInstanceType = spotInstanceType;
        this.validUntil = validUntil;
    }

    private LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs() {
        this.blockDurationMinutes = Input.empty();
        this.instanceInterruptionBehavior = Input.empty();
        this.maxPrice = Input.empty();
        this.spotInstanceType = Input.empty();
        this.validUntil = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> blockDurationMinutes;
        private @Nullable Input<String> instanceInterruptionBehavior;
        private @Nullable Input<String> maxPrice;
        private @Nullable Input<String> spotInstanceType;
        private @Nullable Input<String> validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.maxPrice = defaults.maxPrice;
    	      this.spotInstanceType = defaults.spotInstanceType;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder blockDurationMinutes(@Nullable Input<Integer> blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }

        public Builder blockDurationMinutes(@Nullable Integer blockDurationMinutes) {
            this.blockDurationMinutes = Input.ofNullable(blockDurationMinutes);
            return this;
        }

        public Builder instanceInterruptionBehavior(@Nullable Input<String> instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }

        public Builder instanceInterruptionBehavior(@Nullable String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Input.ofNullable(instanceInterruptionBehavior);
            return this;
        }

        public Builder maxPrice(@Nullable Input<String> maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public Builder maxPrice(@Nullable String maxPrice) {
            this.maxPrice = Input.ofNullable(maxPrice);
            return this;
        }

        public Builder spotInstanceType(@Nullable Input<String> spotInstanceType) {
            this.spotInstanceType = spotInstanceType;
            return this;
        }

        public Builder spotInstanceType(@Nullable String spotInstanceType) {
            this.spotInstanceType = Input.ofNullable(spotInstanceType);
            return this;
        }

        public Builder validUntil(@Nullable Input<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }

        public Builder validUntil(@Nullable String validUntil) {
            this.validUntil = Input.ofNullable(validUntil);
            return this;
        }
        public LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs build() {
            return new LaunchTemplateInstanceMarketOptionsSpotOptionsGetArgs(blockDurationMinutes, instanceInterruptionBehavior, maxPrice, spotInstanceType, validUntil);
        }
    }
}
