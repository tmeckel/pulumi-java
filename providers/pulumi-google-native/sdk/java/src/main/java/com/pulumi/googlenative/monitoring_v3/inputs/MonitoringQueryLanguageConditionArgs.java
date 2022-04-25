// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.inputs.TriggerArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A condition type that allows alert policies to be defined using Monitoring Query Language (https://cloud.google.com/monitoring/mql).
 * 
 */
public final class MonitoringQueryLanguageConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringQueryLanguageConditionArgs Empty = new MonitoringQueryLanguageConditionArgs();

    /**
     * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a boolean stream.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a boolean stream.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    @Import(name="trigger")
    private @Nullable Output<TriggerArgs> trigger;

    /**
     * @return The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    public Optional<Output<TriggerArgs>> trigger() {
        return Optional.ofNullable(this.trigger);
    }

    private MonitoringQueryLanguageConditionArgs() {}

    private MonitoringQueryLanguageConditionArgs(MonitoringQueryLanguageConditionArgs $) {
        this.duration = $.duration;
        this.query = $.query;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringQueryLanguageConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringQueryLanguageConditionArgs $;

        public Builder() {
            $ = new MonitoringQueryLanguageConditionArgs();
        }

        public Builder(MonitoringQueryLanguageConditionArgs defaults) {
            $ = new MonitoringQueryLanguageConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param query Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a boolean stream.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a boolean stream.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param trigger The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
         * 
         * @return builder
         * 
         */
        public Builder trigger(@Nullable Output<TriggerArgs> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
         * 
         * @return builder
         * 
         */
        public Builder trigger(TriggerArgs trigger) {
            return trigger(Output.of(trigger));
        }

        public MonitoringQueryLanguageConditionArgs build() {
            return $;
        }
    }

}
