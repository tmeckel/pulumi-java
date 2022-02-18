// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.enums.AggregationCrossSeriesReducer;
import io.pulumi.googlenative.monitoring_v1.enums.AggregationPerSeriesAligner;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes how to combine multiple time series to provide a different view of the data. Aggregation of time series is done in two steps. First, each time series in the set is aligned to the same time interval boundaries, then the set of time series is optionally reduced in number.Alignment consists of applying the per_series_aligner operation to each time series after its data has been divided into regular alignment_period time intervals. This process takes all of the data points in an alignment period, applies a mathematical transformation such as averaging, minimum, maximum, delta, etc., and converts them into a single data point per period.Reduction is when the aligned and transformed time series can optionally be combined, reducing the number of time series through similar mathematical transformations. Reduction involves applying a cross_series_reducer to all the time series, optionally sorting the time series into subsets with group_by_fields, and applying the reducer to each subset.The raw time series data can contain a huge amount of information from multiple sources. Alignment and reduction transforms this mass of data into a more manageable and representative collection of data, for example "the 95% latency across the average of all tasks in a cluster". This representative data can be more easily graphed and comprehended, and the individual time series data is still available for later drilldown. For more details, see Filtering and aggregation (https://cloud.google.com/monitoring/api/v3/aggregation).
 * 
 */
public final class AggregationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AggregationArgs Empty = new AggregationArgs();

    /**
     * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 2 years, or 104 weeks.
     * 
     */
    @InputImport(name="alignmentPeriod")
    private final @Nullable Input<String> alignmentPeriod;

    public Input<String> getAlignmentPeriod() {
        return this.alignmentPeriod == null ? Input.empty() : this.alignmentPeriod;
    }

    /**
     * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
     * 
     */
    @InputImport(name="crossSeriesReducer")
    private final @Nullable Input<AggregationCrossSeriesReducer> crossSeriesReducer;

    public Input<AggregationCrossSeriesReducer> getCrossSeriesReducer() {
        return this.crossSeriesReducer == null ? Input.empty() : this.crossSeriesReducer;
    }

    /**
     * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
     * 
     */
    @InputImport(name="groupByFields")
    private final @Nullable Input<List<String>> groupByFields;

    public Input<List<String>> getGroupByFields() {
        return this.groupByFields == null ? Input.empty() : this.groupByFields;
    }

    /**
     * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
     * 
     */
    @InputImport(name="perSeriesAligner")
    private final @Nullable Input<AggregationPerSeriesAligner> perSeriesAligner;

    public Input<AggregationPerSeriesAligner> getPerSeriesAligner() {
        return this.perSeriesAligner == null ? Input.empty() : this.perSeriesAligner;
    }

    public AggregationArgs(
        @Nullable Input<String> alignmentPeriod,
        @Nullable Input<AggregationCrossSeriesReducer> crossSeriesReducer,
        @Nullable Input<List<String>> groupByFields,
        @Nullable Input<AggregationPerSeriesAligner> perSeriesAligner) {
        this.alignmentPeriod = alignmentPeriod;
        this.crossSeriesReducer = crossSeriesReducer;
        this.groupByFields = groupByFields;
        this.perSeriesAligner = perSeriesAligner;
    }

    private AggregationArgs() {
        this.alignmentPeriod = Input.empty();
        this.crossSeriesReducer = Input.empty();
        this.groupByFields = Input.empty();
        this.perSeriesAligner = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alignmentPeriod;
        private @Nullable Input<AggregationCrossSeriesReducer> crossSeriesReducer;
        private @Nullable Input<List<String>> groupByFields;
        private @Nullable Input<AggregationPerSeriesAligner> perSeriesAligner;

        public Builder() {
    	      // Empty
        }

        public Builder(AggregationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alignmentPeriod = defaults.alignmentPeriod;
    	      this.crossSeriesReducer = defaults.crossSeriesReducer;
    	      this.groupByFields = defaults.groupByFields;
    	      this.perSeriesAligner = defaults.perSeriesAligner;
        }

        public Builder setAlignmentPeriod(@Nullable Input<String> alignmentPeriod) {
            this.alignmentPeriod = alignmentPeriod;
            return this;
        }

        public Builder setAlignmentPeriod(@Nullable String alignmentPeriod) {
            this.alignmentPeriod = Input.ofNullable(alignmentPeriod);
            return this;
        }

        public Builder setCrossSeriesReducer(@Nullable Input<AggregationCrossSeriesReducer> crossSeriesReducer) {
            this.crossSeriesReducer = crossSeriesReducer;
            return this;
        }

        public Builder setCrossSeriesReducer(@Nullable AggregationCrossSeriesReducer crossSeriesReducer) {
            this.crossSeriesReducer = Input.ofNullable(crossSeriesReducer);
            return this;
        }

        public Builder setGroupByFields(@Nullable Input<List<String>> groupByFields) {
            this.groupByFields = groupByFields;
            return this;
        }

        public Builder setGroupByFields(@Nullable List<String> groupByFields) {
            this.groupByFields = Input.ofNullable(groupByFields);
            return this;
        }

        public Builder setPerSeriesAligner(@Nullable Input<AggregationPerSeriesAligner> perSeriesAligner) {
            this.perSeriesAligner = perSeriesAligner;
            return this;
        }

        public Builder setPerSeriesAligner(@Nullable AggregationPerSeriesAligner perSeriesAligner) {
            this.perSeriesAligner = Input.ofNullable(perSeriesAligner);
            return this;
        }

        public AggregationArgs build() {
            return new AggregationArgs(alignmentPeriod, crossSeriesReducer, groupByFields, perSeriesAligner);
        }
    }
}
