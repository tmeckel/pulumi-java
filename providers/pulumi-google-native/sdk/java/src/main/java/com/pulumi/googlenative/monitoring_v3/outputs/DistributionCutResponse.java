// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring_v3.outputs.GoogleMonitoringV3RangeResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DistributionCutResponse {
    /**
     * @return A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    private final String distributionFilter;
    /**
     * @return Range of values considered &#34;good.&#34; For a one-sided range, set one bound to an infinite value.
     * 
     */
    private final GoogleMonitoringV3RangeResponse range;

    @CustomType.Constructor
    private DistributionCutResponse(
        @CustomType.Parameter("distributionFilter") String distributionFilter,
        @CustomType.Parameter("range") GoogleMonitoringV3RangeResponse range) {
        this.distributionFilter = distributionFilter;
        this.range = range;
    }

    /**
     * @return A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public String distributionFilter() {
        return this.distributionFilter;
    }
    /**
     * @return Range of values considered &#34;good.&#34; For a one-sided range, set one bound to an infinite value.
     * 
     */
    public GoogleMonitoringV3RangeResponse range() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionFilter;
        private GoogleMonitoringV3RangeResponse range;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionFilter = defaults.distributionFilter;
    	      this.range = defaults.range;
        }

        public Builder distributionFilter(String distributionFilter) {
            this.distributionFilter = Objects.requireNonNull(distributionFilter);
            return this;
        }
        public Builder range(GoogleMonitoringV3RangeResponse range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }        public DistributionCutResponse build() {
            return new DistributionCutResponse(distributionFilter, range);
        }
    }
}
