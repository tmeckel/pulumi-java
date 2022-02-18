// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.AggregationResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.PickTimeSeriesFilterResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.RatioPartResponse;
import java.util.Objects;

@OutputCustomType
public final class TimeSeriesFilterRatioResponse {
    /**
     * The denominator of the ratio.
     * 
     */
    private final RatioPartResponse denominator;
    /**
     * The numerator of the ratio.
     * 
     */
    private final RatioPartResponse numerator;
    /**
     * Ranking based time series filter.
     * 
     */
    private final PickTimeSeriesFilterResponse pickTimeSeriesFilter;
    /**
     * Apply a second aggregation after the ratio is computed.
     * 
     */
    private final AggregationResponse secondaryAggregation;

    @OutputCustomType.Constructor({"denominator","numerator","pickTimeSeriesFilter","secondaryAggregation"})
    private TimeSeriesFilterRatioResponse(
        RatioPartResponse denominator,
        RatioPartResponse numerator,
        PickTimeSeriesFilterResponse pickTimeSeriesFilter,
        AggregationResponse secondaryAggregation) {
        this.denominator = Objects.requireNonNull(denominator);
        this.numerator = Objects.requireNonNull(numerator);
        this.pickTimeSeriesFilter = Objects.requireNonNull(pickTimeSeriesFilter);
        this.secondaryAggregation = Objects.requireNonNull(secondaryAggregation);
    }

    /**
     * The denominator of the ratio.
     * 
     */
    public RatioPartResponse getDenominator() {
        return this.denominator;
    }
    /**
     * The numerator of the ratio.
     * 
     */
    public RatioPartResponse getNumerator() {
        return this.numerator;
    }
    /**
     * Ranking based time series filter.
     * 
     */
    public PickTimeSeriesFilterResponse getPickTimeSeriesFilter() {
        return this.pickTimeSeriesFilter;
    }
    /**
     * Apply a second aggregation after the ratio is computed.
     * 
     */
    public AggregationResponse getSecondaryAggregation() {
        return this.secondaryAggregation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesFilterRatioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RatioPartResponse denominator;
        private RatioPartResponse numerator;
        private PickTimeSeriesFilterResponse pickTimeSeriesFilter;
        private AggregationResponse secondaryAggregation;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesFilterRatioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.denominator = defaults.denominator;
    	      this.numerator = defaults.numerator;
    	      this.pickTimeSeriesFilter = defaults.pickTimeSeriesFilter;
    	      this.secondaryAggregation = defaults.secondaryAggregation;
        }

        public Builder setDenominator(RatioPartResponse denominator) {
            this.denominator = Objects.requireNonNull(denominator);
            return this;
        }

        public Builder setNumerator(RatioPartResponse numerator) {
            this.numerator = Objects.requireNonNull(numerator);
            return this;
        }

        public Builder setPickTimeSeriesFilter(PickTimeSeriesFilterResponse pickTimeSeriesFilter) {
            this.pickTimeSeriesFilter = Objects.requireNonNull(pickTimeSeriesFilter);
            return this;
        }

        public Builder setSecondaryAggregation(AggregationResponse secondaryAggregation) {
            this.secondaryAggregation = Objects.requireNonNull(secondaryAggregation);
            return this;
        }

        public TimeSeriesFilterRatioResponse build() {
            return new TimeSeriesFilterRatioResponse(denominator, numerator, pickTimeSeriesFilter, secondaryAggregation);
        }
    }
}
