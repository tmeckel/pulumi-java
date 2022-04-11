// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v3.enums.MetricThresholdComparison;
import io.pulumi.googlenative.monitoring_v3.inputs.AggregationArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.TriggerArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A condition type that compares a collection of time series against a threshold.
 * 
 */
public final class MetricThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricThresholdArgs Empty = new MetricThresholdArgs();

    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    @Import(name="aggregations")
      private final @Nullable Output<List<AggregationArgs>> aggregations;

    public Output<List<AggregationArgs>> getAggregations() {
        return this.aggregations == null ? Codegen.empty() : this.aggregations;
    }

    /**
     * The comparison to apply between the time series (indicated by filter and aggregation) and the threshold (indicated by threshold_value). The comparison is applied on each time series, with the time series on the left-hand side and the threshold on the right-hand side.Only COMPARISON_LT and COMPARISON_GT are supported currently.
     * 
     */
    @Import(name="comparison")
      private final @Nullable Output<MetricThresholdComparison> comparison;

    public Output<MetricThresholdComparison> getComparison() {
        return this.comparison == null ? Codegen.empty() : this.comparison;
    }

    /**
     * Specifies the alignment of data points in individual time series selected by denominatorFilter as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources).When computing ratios, the aggregations and denominator_aggregations fields must use the same alignment period and produce time series that have the same periodicity and labels.
     * 
     */
    @Import(name="denominatorAggregations")
      private final @Nullable Output<List<AggregationArgs>> denominatorAggregations;

    public Output<List<AggregationArgs>> getDenominatorAggregations() {
        return this.denominatorAggregations == null ? Codegen.empty() : this.denominatorAggregations;
    }

    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies a time series that should be used as the denominator of a ratio that will be compared with the threshold. If a denominator_filter is specified, the time series specified by the filter field will be used as the numerator.The filter must specify the metric type and optionally may contain restrictions on resource type, resource labels, and metric labels. This field may not exceed 2048 Unicode characters in length.
     * 
     */
    @Import(name="denominatorFilter")
      private final @Nullable Output<String> denominatorFilter;

    public Output<String> getDenominatorFilter() {
        return this.denominatorFilter == null ? Codegen.empty() : this.denominatorFilter;
    }

    /**
     * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> getDuration() {
        return this.duration == null ? Codegen.empty() : this.duration;
    }

    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> getFilter() {
        return this.filter;
    }

    /**
     * A value against which to compare the time series.
     * 
     */
    @Import(name="thresholdValue")
      private final @Nullable Output<Double> thresholdValue;

    public Output<Double> getThresholdValue() {
        return this.thresholdValue == null ? Codegen.empty() : this.thresholdValue;
    }

    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    @Import(name="trigger")
      private final @Nullable Output<TriggerArgs> trigger;

    public Output<TriggerArgs> getTrigger() {
        return this.trigger == null ? Codegen.empty() : this.trigger;
    }

    public MetricThresholdArgs(
        @Nullable Output<List<AggregationArgs>> aggregations,
        @Nullable Output<MetricThresholdComparison> comparison,
        @Nullable Output<List<AggregationArgs>> denominatorAggregations,
        @Nullable Output<String> denominatorFilter,
        @Nullable Output<String> duration,
        Output<String> filter,
        @Nullable Output<Double> thresholdValue,
        @Nullable Output<TriggerArgs> trigger) {
        this.aggregations = aggregations;
        this.comparison = comparison;
        this.denominatorAggregations = denominatorAggregations;
        this.denominatorFilter = denominatorFilter;
        this.duration = duration;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.thresholdValue = thresholdValue;
        this.trigger = trigger;
    }

    private MetricThresholdArgs() {
        this.aggregations = Codegen.empty();
        this.comparison = Codegen.empty();
        this.denominatorAggregations = Codegen.empty();
        this.denominatorFilter = Codegen.empty();
        this.duration = Codegen.empty();
        this.filter = Codegen.empty();
        this.thresholdValue = Codegen.empty();
        this.trigger = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AggregationArgs>> aggregations;
        private @Nullable Output<MetricThresholdComparison> comparison;
        private @Nullable Output<List<AggregationArgs>> denominatorAggregations;
        private @Nullable Output<String> denominatorFilter;
        private @Nullable Output<String> duration;
        private Output<String> filter;
        private @Nullable Output<Double> thresholdValue;
        private @Nullable Output<TriggerArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.comparison = defaults.comparison;
    	      this.denominatorAggregations = defaults.denominatorAggregations;
    	      this.denominatorFilter = defaults.denominatorFilter;
    	      this.duration = defaults.duration;
    	      this.filter = defaults.filter;
    	      this.thresholdValue = defaults.thresholdValue;
    	      this.trigger = defaults.trigger;
        }

        public Builder aggregations(@Nullable Output<List<AggregationArgs>> aggregations) {
            this.aggregations = aggregations;
            return this;
        }
        public Builder aggregations(@Nullable List<AggregationArgs> aggregations) {
            this.aggregations = Codegen.ofNullable(aggregations);
            return this;
        }
        public Builder aggregations(AggregationArgs... aggregations) {
            return aggregations(List.of(aggregations));
        }
        public Builder comparison(@Nullable Output<MetricThresholdComparison> comparison) {
            this.comparison = comparison;
            return this;
        }
        public Builder comparison(@Nullable MetricThresholdComparison comparison) {
            this.comparison = Codegen.ofNullable(comparison);
            return this;
        }
        public Builder denominatorAggregations(@Nullable Output<List<AggregationArgs>> denominatorAggregations) {
            this.denominatorAggregations = denominatorAggregations;
            return this;
        }
        public Builder denominatorAggregations(@Nullable List<AggregationArgs> denominatorAggregations) {
            this.denominatorAggregations = Codegen.ofNullable(denominatorAggregations);
            return this;
        }
        public Builder denominatorAggregations(AggregationArgs... denominatorAggregations) {
            return denominatorAggregations(List.of(denominatorAggregations));
        }
        public Builder denominatorFilter(@Nullable Output<String> denominatorFilter) {
            this.denominatorFilter = denominatorFilter;
            return this;
        }
        public Builder denominatorFilter(@Nullable String denominatorFilter) {
            this.denominatorFilter = Codegen.ofNullable(denominatorFilter);
            return this;
        }
        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = Codegen.ofNullable(duration);
            return this;
        }
        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder thresholdValue(@Nullable Output<Double> thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        public Builder thresholdValue(@Nullable Double thresholdValue) {
            this.thresholdValue = Codegen.ofNullable(thresholdValue);
            return this;
        }
        public Builder trigger(@Nullable Output<TriggerArgs> trigger) {
            this.trigger = trigger;
            return this;
        }
        public Builder trigger(@Nullable TriggerArgs trigger) {
            this.trigger = Codegen.ofNullable(trigger);
            return this;
        }        public MetricThresholdArgs build() {
            return new MetricThresholdArgs(aggregations, comparison, denominatorAggregations, denominatorFilter, duration, filter, thresholdValue, trigger);
        }
    }
}
