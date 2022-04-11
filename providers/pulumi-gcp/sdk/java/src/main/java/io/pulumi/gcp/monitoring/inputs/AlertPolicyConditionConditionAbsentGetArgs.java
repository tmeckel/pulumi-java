// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentAggregationGetArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentTriggerGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionAbsentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionAbsentGetArgs Empty = new AlertPolicyConditionConditionAbsentGetArgs();

    /**
     * Specifies the alignment of data points in
     * individual time series as well as how to
     * combine the retrieved time series together
     * (such as when aggregating multiple streams
     * on each resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).
     * Multiple aggregations are applied in the
     * order specified.This field is similar to the
     * one in the MetricService.ListTimeSeries
     * request. It is advisable to use the
     * ListTimeSeries method when debugging this
     * field.
     * Structure is documented below.
     * 
     */
    @Import(name="aggregations")
      private final @Nullable Output<List<AlertPolicyConditionConditionAbsentAggregationGetArgs>> aggregations;

    public Output<List<AlertPolicyConditionConditionAbsentAggregationGetArgs>> getAggregations() {
        return this.aggregations == null ? Codegen.empty() : this.aggregations;
    }

    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    @Import(name="duration", required=true)
      private final Output<String> duration;

    public Output<String> getDuration() {
        return this.duration;
    }

    /**
     * A logs-based filter.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    @Import(name="trigger")
      private final @Nullable Output<AlertPolicyConditionConditionAbsentTriggerGetArgs> trigger;

    public Output<AlertPolicyConditionConditionAbsentTriggerGetArgs> getTrigger() {
        return this.trigger == null ? Codegen.empty() : this.trigger;
    }

    public AlertPolicyConditionConditionAbsentGetArgs(
        @Nullable Output<List<AlertPolicyConditionConditionAbsentAggregationGetArgs>> aggregations,
        Output<String> duration,
        @Nullable Output<String> filter,
        @Nullable Output<AlertPolicyConditionConditionAbsentTriggerGetArgs> trigger) {
        this.aggregations = aggregations;
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.filter = filter;
        this.trigger = trigger;
    }

    private AlertPolicyConditionConditionAbsentGetArgs() {
        this.aggregations = Codegen.empty();
        this.duration = Codegen.empty();
        this.filter = Codegen.empty();
        this.trigger = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionAbsentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AlertPolicyConditionConditionAbsentAggregationGetArgs>> aggregations;
        private Output<String> duration;
        private @Nullable Output<String> filter;
        private @Nullable Output<AlertPolicyConditionConditionAbsentTriggerGetArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionAbsentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.duration = defaults.duration;
    	      this.filter = defaults.filter;
    	      this.trigger = defaults.trigger;
        }

        public Builder aggregations(@Nullable Output<List<AlertPolicyConditionConditionAbsentAggregationGetArgs>> aggregations) {
            this.aggregations = aggregations;
            return this;
        }
        public Builder aggregations(@Nullable List<AlertPolicyConditionConditionAbsentAggregationGetArgs> aggregations) {
            this.aggregations = Codegen.ofNullable(aggregations);
            return this;
        }
        public Builder aggregations(AlertPolicyConditionConditionAbsentAggregationGetArgs... aggregations) {
            return aggregations(List.of(aggregations));
        }
        public Builder duration(Output<String> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Output.of(Objects.requireNonNull(duration));
            return this;
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder trigger(@Nullable Output<AlertPolicyConditionConditionAbsentTriggerGetArgs> trigger) {
            this.trigger = trigger;
            return this;
        }
        public Builder trigger(@Nullable AlertPolicyConditionConditionAbsentTriggerGetArgs trigger) {
            this.trigger = Codegen.ofNullable(trigger);
            return this;
        }        public AlertPolicyConditionConditionAbsentGetArgs build() {
            return new AlertPolicyConditionConditionAbsentGetArgs(aggregations, duration, filter, trigger);
        }
    }
}
