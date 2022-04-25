// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.inputs.GoogleMonitoringV3RangeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A DistributionCut defines a TimeSeries and thresholds used for measuring good service and total service. The TimeSeries must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE. The computed good_service will be the estimated count of values in the Distribution that fall within the specified min and max.
 * 
 */
public final class DistributionCutArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionCutArgs Empty = new DistributionCutArgs();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="distributionFilter")
    private @Nullable Output<String> distributionFilter;

    /**
     * @return A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Optional<Output<String>> distributionFilter() {
        return Optional.ofNullable(this.distributionFilter);
    }

    /**
     * Range of values considered &#34;good.&#34; For a one-sided range, set one bound to an infinite value.
     * 
     */
    @Import(name="range")
    private @Nullable Output<GoogleMonitoringV3RangeArgs> range;

    /**
     * @return Range of values considered &#34;good.&#34; For a one-sided range, set one bound to an infinite value.
     * 
     */
    public Optional<Output<GoogleMonitoringV3RangeArgs>> range() {
        return Optional.ofNullable(this.range);
    }

    private DistributionCutArgs() {}

    private DistributionCutArgs(DistributionCutArgs $) {
        this.distributionFilter = $.distributionFilter;
        this.range = $.range;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionCutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionCutArgs $;

        public Builder() {
            $ = new DistributionCutArgs();
        }

        public Builder(DistributionCutArgs defaults) {
            $ = new DistributionCutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distributionFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder distributionFilter(@Nullable Output<String> distributionFilter) {
            $.distributionFilter = distributionFilter;
            return this;
        }

        /**
         * @param distributionFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder distributionFilter(String distributionFilter) {
            return distributionFilter(Output.of(distributionFilter));
        }

        /**
         * @param range Range of values considered &#34;good.&#34; For a one-sided range, set one bound to an infinite value.
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<GoogleMonitoringV3RangeArgs> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range Range of values considered &#34;good.&#34; For a one-sided range, set one bound to an infinite value.
         * 
         * @return builder
         * 
         */
        public Builder range(GoogleMonitoringV3RangeArgs range) {
            return range(Output.of(range));
        }

        public DistributionCutArgs build() {
            return $;
        }
    }

}
