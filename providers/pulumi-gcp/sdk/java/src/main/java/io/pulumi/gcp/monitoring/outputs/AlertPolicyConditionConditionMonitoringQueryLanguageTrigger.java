// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AlertPolicyConditionConditionMonitoringQueryLanguageTrigger {
    /**
     * The absolute number of time series
     * that must fail the predicate for the
     * condition to be triggered.
     * 
     */
    private final @Nullable Integer count;
    /**
     * The percentage of time series that
     * must fail the predicate for the
     * condition to be triggered.
     * 
     */
    private final @Nullable Double percent;

    @OutputCustomType.Constructor
    private AlertPolicyConditionConditionMonitoringQueryLanguageTrigger(
        @OutputCustomType.Parameter("count") @Nullable Integer count,
        @OutputCustomType.Parameter("percent") @Nullable Double percent) {
        this.count = count;
        this.percent = percent;
    }

    /**
     * The absolute number of time series
     * that must fail the predicate for the
     * condition to be triggered.
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * The percentage of time series that
     * must fail the predicate for the
     * condition to be triggered.
     * 
    */
    public Optional<Double> getPercent() {
        return Optional.ofNullable(this.percent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionMonitoringQueryLanguageTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable Double percent;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionMonitoringQueryLanguageTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.percent = defaults.percent;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder percent(@Nullable Double percent) {
            this.percent = percent;
            return this;
        }
        public AlertPolicyConditionConditionMonitoringQueryLanguageTrigger build() {
            return new AlertPolicyConditionConditionMonitoringQueryLanguageTrigger(count, percent);
        }
    }
}
