// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.inputs.JobTemplateExponentialRolloutRateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Allows you to create a staged rollout of a job.
 * 
 */
public final class JobExecutionsRolloutConfigPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobExecutionsRolloutConfigPropertiesArgs Empty = new JobExecutionsRolloutConfigPropertiesArgs();

    /**
     * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
     * 
     */
    @Import(name="exponentialRolloutRate")
    private @Nullable Output<JobTemplateExponentialRolloutRateArgs> exponentialRolloutRate;

    /**
     * @return The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
     * 
     */
    public Optional<Output<JobTemplateExponentialRolloutRateArgs>> exponentialRolloutRate() {
        return Optional.ofNullable(this.exponentialRolloutRate);
    }

    /**
     * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
     * 
     */
    @Import(name="maximumPerMinute")
    private @Nullable Output<Integer> maximumPerMinute;

    /**
     * @return The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
     * 
     */
    public Optional<Output<Integer>> maximumPerMinute() {
        return Optional.ofNullable(this.maximumPerMinute);
    }

    private JobExecutionsRolloutConfigPropertiesArgs() {}

    private JobExecutionsRolloutConfigPropertiesArgs(JobExecutionsRolloutConfigPropertiesArgs $) {
        this.exponentialRolloutRate = $.exponentialRolloutRate;
        this.maximumPerMinute = $.maximumPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobExecutionsRolloutConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobExecutionsRolloutConfigPropertiesArgs $;

        public Builder() {
            $ = new JobExecutionsRolloutConfigPropertiesArgs();
        }

        public Builder(JobExecutionsRolloutConfigPropertiesArgs defaults) {
            $ = new JobExecutionsRolloutConfigPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exponentialRolloutRate The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
         * 
         * @return builder
         * 
         */
        public Builder exponentialRolloutRate(@Nullable Output<JobTemplateExponentialRolloutRateArgs> exponentialRolloutRate) {
            $.exponentialRolloutRate = exponentialRolloutRate;
            return this;
        }

        /**
         * @param exponentialRolloutRate The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
         * 
         * @return builder
         * 
         */
        public Builder exponentialRolloutRate(JobTemplateExponentialRolloutRateArgs exponentialRolloutRate) {
            return exponentialRolloutRate(Output.of(exponentialRolloutRate));
        }

        /**
         * @param maximumPerMinute The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
         * 
         * @return builder
         * 
         */
        public Builder maximumPerMinute(@Nullable Output<Integer> maximumPerMinute) {
            $.maximumPerMinute = maximumPerMinute;
            return this;
        }

        /**
         * @param maximumPerMinute The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
         * 
         * @return builder
         * 
         */
        public Builder maximumPerMinute(Integer maximumPerMinute) {
            return maximumPerMinute(Output.of(maximumPerMinute));
        }

        public JobExecutionsRolloutConfigPropertiesArgs build() {
            return $;
        }
    }

}
