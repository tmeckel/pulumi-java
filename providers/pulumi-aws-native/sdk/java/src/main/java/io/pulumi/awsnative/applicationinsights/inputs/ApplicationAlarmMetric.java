// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A metric to be monitored for the component.
 * 
 */
public final class ApplicationAlarmMetric extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationAlarmMetric Empty = new ApplicationAlarmMetric();

    /**
     * The name of the metric to be monitored for the component.
     * 
     */
    @InputImport(name="alarmMetricName", required=true)
      private final String alarmMetricName;

    public String getAlarmMetricName() {
        return this.alarmMetricName;
    }

    public ApplicationAlarmMetric(String alarmMetricName) {
        this.alarmMetricName = Objects.requireNonNull(alarmMetricName, "expected parameter 'alarmMetricName' to be non-null");
    }

    private ApplicationAlarmMetric() {
        this.alarmMetricName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAlarmMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmMetricName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAlarmMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmMetricName = defaults.alarmMetricName;
        }

        public Builder alarmMetricName(String alarmMetricName) {
            this.alarmMetricName = Objects.requireNonNull(alarmMetricName);
            return this;
        }
        public ApplicationAlarmMetric build() {
            return new ApplicationAlarmMetric(alarmMetricName);
        }
    }
}
