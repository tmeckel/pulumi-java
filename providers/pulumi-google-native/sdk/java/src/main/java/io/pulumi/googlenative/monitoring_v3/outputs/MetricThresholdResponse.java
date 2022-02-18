// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.AggregationResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.TriggerResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MetricThresholdResponse {
    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    private final List<AggregationResponse> aggregations;
    /**
     * The comparison to apply between the time series (indicated by filter and aggregation) and the threshold (indicated by threshold_value). The comparison is applied on each time series, with the time series on the left-hand side and the threshold on the right-hand side.Only COMPARISON_LT and COMPARISON_GT are supported currently.
     * 
     */
    private final String comparison;
    /**
     * Specifies the alignment of data points in individual time series selected by denominatorFilter as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources).When computing ratios, the aggregations and denominator_aggregations fields must use the same alignment period and produce time series that have the same periodicity and labels.
     * 
     */
    private final List<AggregationResponse> denominatorAggregations;
    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies a time series that should be used as the denominator of a ratio that will be compared with the threshold. If a denominator_filter is specified, the time series specified by the filter field will be used as the numerator.The filter must specify the metric type and optionally may contain restrictions on resource type, resource labels, and metric labels. This field may not exceed 2048 Unicode characters in length.
     * 
     */
    private final String denominatorFilter;
    /**
     * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    private final String duration;
    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    private final String filter;
    /**
     * A value against which to compare the time series.
     * 
     */
    private final Double thresholdValue;
    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    private final TriggerResponse trigger;

    @OutputCustomType.Constructor({"aggregations","comparison","denominatorAggregations","denominatorFilter","duration","filter","thresholdValue","trigger"})
    private MetricThresholdResponse(
        List<AggregationResponse> aggregations,
        String comparison,
        List<AggregationResponse> denominatorAggregations,
        String denominatorFilter,
        String duration,
        String filter,
        Double thresholdValue,
        TriggerResponse trigger) {
        this.aggregations = Objects.requireNonNull(aggregations);
        this.comparison = Objects.requireNonNull(comparison);
        this.denominatorAggregations = Objects.requireNonNull(denominatorAggregations);
        this.denominatorFilter = Objects.requireNonNull(denominatorFilter);
        this.duration = Objects.requireNonNull(duration);
        this.filter = Objects.requireNonNull(filter);
        this.thresholdValue = Objects.requireNonNull(thresholdValue);
        this.trigger = Objects.requireNonNull(trigger);
    }

    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    public List<AggregationResponse> getAggregations() {
        return this.aggregations;
    }
    /**
     * The comparison to apply between the time series (indicated by filter and aggregation) and the threshold (indicated by threshold_value). The comparison is applied on each time series, with the time series on the left-hand side and the threshold on the right-hand side.Only COMPARISON_LT and COMPARISON_GT are supported currently.
     * 
     */
    public String getComparison() {
        return this.comparison;
    }
    /**
     * Specifies the alignment of data points in individual time series selected by denominatorFilter as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources).When computing ratios, the aggregations and denominator_aggregations fields must use the same alignment period and produce time series that have the same periodicity and labels.
     * 
     */
    public List<AggregationResponse> getDenominatorAggregations() {
        return this.denominatorAggregations;
    }
    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies a time series that should be used as the denominator of a ratio that will be compared with the threshold. If a denominator_filter is specified, the time series specified by the filter field will be used as the numerator.The filter must specify the metric type and optionally may contain restrictions on resource type, resource labels, and metric labels. This field may not exceed 2048 Unicode characters in length.
     * 
     */
    public String getDenominatorFilter() {
        return this.denominatorFilter;
    }
    /**
     * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    public String getDuration() {
        return this.duration;
    }
    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    public String getFilter() {
        return this.filter;
    }
    /**
     * A value against which to compare the time series.
     * 
     */
    public Double getThresholdValue() {
        return this.thresholdValue;
    }
    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    public TriggerResponse getTrigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AggregationResponse> aggregations;
        private String comparison;
        private List<AggregationResponse> denominatorAggregations;
        private String denominatorFilter;
        private String duration;
        private String filter;
        private Double thresholdValue;
        private TriggerResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricThresholdResponse defaults) {
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

        public Builder setAggregations(List<AggregationResponse> aggregations) {
            this.aggregations = Objects.requireNonNull(aggregations);
            return this;
        }

        public Builder setComparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setDenominatorAggregations(List<AggregationResponse> denominatorAggregations) {
            this.denominatorAggregations = Objects.requireNonNull(denominatorAggregations);
            return this;
        }

        public Builder setDenominatorFilter(String denominatorFilter) {
            this.denominatorFilter = Objects.requireNonNull(denominatorFilter);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setThresholdValue(Double thresholdValue) {
            this.thresholdValue = Objects.requireNonNull(thresholdValue);
            return this;
        }

        public Builder setTrigger(TriggerResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }

        public MetricThresholdResponse build() {
            return new MetricThresholdResponse(aggregations, comparison, denominatorAggregations, denominatorFilter, duration, filter, thresholdValue, trigger);
        }
    }
}
