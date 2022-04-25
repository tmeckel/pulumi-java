// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryScheduleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CanaryScheduleGetArgs Empty = new CanaryScheduleGetArgs();

    /**
     * Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
     * 
     */
    @Import(name="durationInSeconds")
    private @Nullable Output<Integer> durationInSeconds;

    /**
     * @return Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
     * 
     */
    public Optional<Output<Integer>> durationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }

    /**
     * Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    private CanaryScheduleGetArgs() {}

    private CanaryScheduleGetArgs(CanaryScheduleGetArgs $) {
        this.durationInSeconds = $.durationInSeconds;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CanaryScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CanaryScheduleGetArgs $;

        public Builder() {
            $ = new CanaryScheduleGetArgs();
        }

        public Builder(CanaryScheduleGetArgs defaults) {
            $ = new CanaryScheduleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param durationInSeconds Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
         * 
         * @return builder
         * 
         */
        public Builder durationInSeconds(@Nullable Output<Integer> durationInSeconds) {
            $.durationInSeconds = durationInSeconds;
            return this;
        }

        /**
         * @param durationInSeconds Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
         * 
         * @return builder
         * 
         */
        public Builder durationInSeconds(Integer durationInSeconds) {
            return durationInSeconds(Output.of(durationInSeconds));
        }

        /**
         * @param expression Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public CanaryScheduleGetArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
