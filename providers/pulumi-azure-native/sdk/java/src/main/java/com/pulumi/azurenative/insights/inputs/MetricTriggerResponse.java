// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.ScaleRuleMetricDimensionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The trigger that results in a scaling action.
 * 
 */
public final class MetricTriggerResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetricTriggerResponse Empty = new MetricTriggerResponse();

    /**
     * List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
     * 
     */
    @Import(name="dimensions")
    private @Nullable List<ScaleRuleMetricDimensionResponse> dimensions;

    /**
     * @return List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
     * 
     */
    public Optional<List<ScaleRuleMetricDimensionResponse>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * a value indicating whether metric should divide per instance.
     * 
     */
    @Import(name="dividePerInstance")
    private @Nullable Boolean dividePerInstance;

    /**
     * @return a value indicating whether metric should divide per instance.
     * 
     */
    public Optional<Boolean> dividePerInstance() {
        return Optional.ofNullable(this.dividePerInstance);
    }

    /**
     * the name of the metric that defines what the rule monitors.
     * 
     */
    @Import(name="metricName", required=true)
    private String metricName;

    /**
     * @return the name of the metric that defines what the rule monitors.
     * 
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * the namespace of the metric that defines what the rule monitors.
     * 
     */
    @Import(name="metricNamespace")
    private @Nullable String metricNamespace;

    /**
     * @return the namespace of the metric that defines what the rule monitors.
     * 
     */
    public Optional<String> metricNamespace() {
        return Optional.ofNullable(this.metricNamespace);
    }

    /**
     * the location of the resource the rule monitors.
     * 
     */
    @Import(name="metricResourceLocation")
    private @Nullable String metricResourceLocation;

    /**
     * @return the location of the resource the rule monitors.
     * 
     */
    public Optional<String> metricResourceLocation() {
        return Optional.ofNullable(this.metricResourceLocation);
    }

    /**
     * the resource identifier of the resource the rule monitors.
     * 
     */
    @Import(name="metricResourceUri", required=true)
    private String metricResourceUri;

    /**
     * @return the resource identifier of the resource the rule monitors.
     * 
     */
    public String metricResourceUri() {
        return this.metricResourceUri;
    }

    /**
     * the operator that is used to compare the metric data and the threshold.
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    /**
     * @return the operator that is used to compare the metric data and the threshold.
     * 
     */
    public String operator() {
        return this.operator;
    }

    /**
     * the metric statistic type. How the metrics from multiple instances are combined.
     * 
     */
    @Import(name="statistic", required=true)
    private String statistic;

    /**
     * @return the metric statistic type. How the metrics from multiple instances are combined.
     * 
     */
    public String statistic() {
        return this.statistic;
    }

    /**
     * the threshold of the metric that triggers the scale action.
     * 
     */
    @Import(name="threshold", required=true)
    private Double threshold;

    /**
     * @return the threshold of the metric that triggers the scale action.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }

    /**
     * time aggregation type. How the data that is collected should be combined over time. The default value is Average.
     * 
     */
    @Import(name="timeAggregation", required=true)
    private String timeAggregation;

    /**
     * @return time aggregation type. How the data that is collected should be combined over time. The default value is Average.
     * 
     */
    public String timeAggregation() {
        return this.timeAggregation;
    }

    /**
     * the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
     * 
     */
    @Import(name="timeGrain", required=true)
    private String timeGrain;

    /**
     * @return the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
     * 
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
     * 
     */
    @Import(name="timeWindow", required=true)
    private String timeWindow;

    /**
     * @return the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
     * 
     */
    public String timeWindow() {
        return this.timeWindow;
    }

    private MetricTriggerResponse() {}

    private MetricTriggerResponse(MetricTriggerResponse $) {
        this.dimensions = $.dimensions;
        this.dividePerInstance = $.dividePerInstance;
        this.metricName = $.metricName;
        this.metricNamespace = $.metricNamespace;
        this.metricResourceLocation = $.metricResourceLocation;
        this.metricResourceUri = $.metricResourceUri;
        this.operator = $.operator;
        this.statistic = $.statistic;
        this.threshold = $.threshold;
        this.timeAggregation = $.timeAggregation;
        this.timeGrain = $.timeGrain;
        this.timeWindow = $.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricTriggerResponse $;

        public Builder() {
            $ = new MetricTriggerResponse();
        }

        public Builder(MetricTriggerResponse defaults) {
            $ = new MetricTriggerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensions List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable List<ScaleRuleMetricDimensionResponse> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
         * 
         * @return builder
         * 
         */
        public Builder dimensions(ScaleRuleMetricDimensionResponse... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param dividePerInstance a value indicating whether metric should divide per instance.
         * 
         * @return builder
         * 
         */
        public Builder dividePerInstance(@Nullable Boolean dividePerInstance) {
            $.dividePerInstance = dividePerInstance;
            return this;
        }

        /**
         * @param metricName the name of the metric that defines what the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricNamespace the namespace of the metric that defines what the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespace(@Nullable String metricNamespace) {
            $.metricNamespace = metricNamespace;
            return this;
        }

        /**
         * @param metricResourceLocation the location of the resource the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricResourceLocation(@Nullable String metricResourceLocation) {
            $.metricResourceLocation = metricResourceLocation;
            return this;
        }

        /**
         * @param metricResourceUri the resource identifier of the resource the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricResourceUri(String metricResourceUri) {
            $.metricResourceUri = metricResourceUri;
            return this;
        }

        /**
         * @param operator the operator that is used to compare the metric data and the threshold.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param statistic the metric statistic type. How the metrics from multiple instances are combined.
         * 
         * @return builder
         * 
         */
        public Builder statistic(String statistic) {
            $.statistic = statistic;
            return this;
        }

        /**
         * @param threshold the threshold of the metric that triggers the scale action.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param timeAggregation time aggregation type. How the data that is collected should be combined over time. The default value is Average.
         * 
         * @return builder
         * 
         */
        public Builder timeAggregation(String timeAggregation) {
            $.timeAggregation = timeAggregation;
            return this;
        }

        /**
         * @param timeGrain the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
         * 
         * @return builder
         * 
         */
        public Builder timeGrain(String timeGrain) {
            $.timeGrain = timeGrain;
            return this;
        }

        /**
         * @param timeWindow the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(String timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        public MetricTriggerResponse build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.metricResourceUri = Objects.requireNonNull($.metricResourceUri, "expected parameter 'metricResourceUri' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.statistic = Objects.requireNonNull($.statistic, "expected parameter 'statistic' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            $.timeAggregation = Objects.requireNonNull($.timeAggregation, "expected parameter 'timeAggregation' to be non-null");
            $.timeGrain = Objects.requireNonNull($.timeGrain, "expected parameter 'timeGrain' to be non-null");
            $.timeWindow = Objects.requireNonNull($.timeWindow, "expected parameter 'timeWindow' to be non-null");
            return $;
        }
    }

}
