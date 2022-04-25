// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs Empty = new BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs();

    /**
     * Time in minutes. Valid values: `15`.
     * 
     */
    @Import(name="minutes", required=true)
    private Output<Integer> minutes;

    /**
     * @return Time in minutes. Valid values: `15`.
     * 
     */
    public Output<Integer> minutes() {
        return this.minutes;
    }

    private BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs() {}

    private BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs(BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs $) {
        this.minutes = $.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs();
        }

        public Builder(BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs defaults) {
            $ = new BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minutes Time in minutes. Valid values: `15`.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes Time in minutes. Valid values: `15`.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        public BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs build() {
            $.minutes = Objects.requireNonNull($.minutes, "expected parameter 'minutes' to be non-null");
            return $;
        }
    }

}
