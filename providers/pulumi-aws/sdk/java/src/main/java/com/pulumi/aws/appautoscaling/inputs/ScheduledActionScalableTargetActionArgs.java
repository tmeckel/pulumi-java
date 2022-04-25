// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledActionScalableTargetActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledActionScalableTargetActionArgs Empty = new ScheduledActionScalableTargetActionArgs();

    /**
     * The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    @Import(name="maxCapacity")
    private @Nullable Output<Integer> maxCapacity;

    /**
     * @return The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    public Optional<Output<Integer>> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }

    /**
     * The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    @Import(name="minCapacity")
    private @Nullable Output<Integer> minCapacity;

    /**
     * @return The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    public Optional<Output<Integer>> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    private ScheduledActionScalableTargetActionArgs() {}

    private ScheduledActionScalableTargetActionArgs(ScheduledActionScalableTargetActionArgs $) {
        this.maxCapacity = $.maxCapacity;
        this.minCapacity = $.minCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledActionScalableTargetActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledActionScalableTargetActionArgs $;

        public Builder() {
            $ = new ScheduledActionScalableTargetActionArgs();
        }

        public Builder(ScheduledActionScalableTargetActionArgs defaults) {
            $ = new ScheduledActionScalableTargetActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxCapacity The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(@Nullable Output<Integer> maxCapacity) {
            $.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * @param maxCapacity The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(Integer maxCapacity) {
            return maxCapacity(Output.of(maxCapacity));
        }

        /**
         * @param minCapacity The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(@Nullable Output<Integer> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        /**
         * @param minCapacity The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(Integer minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        public ScheduledActionScalableTargetActionArgs build() {
            return $;
        }
    }

}
