// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlarmArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlarmArgs Empty = new AlarmArgs();

    /**
     * The name for the alarm. Specify the name of an existing alarm to update, and overwrite the previous configuration of the alarm.
     * 
     */
    @InputImport(name="alarmName")
      private final @Nullable Input<String> alarmName;

    public Input<String> getAlarmName() {
        return this.alarmName == null ? Input.empty() : this.alarmName;
    }

    /**
     * The arithmetic operation to use when comparing the specified statistic to the threshold. The specified statistic value is used as the first operand.
     * 
     */
    @InputImport(name="comparisonOperator", required=true)
      private final Input<String> comparisonOperator;

    public Input<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The contact protocols to use for the alarm, such as Email, SMS (text messaging), or both.
     * 
     */
    @InputImport(name="contactProtocols")
      private final @Nullable Input<List<String>> contactProtocols;

    public Input<List<String>> getContactProtocols() {
        return this.contactProtocols == null ? Input.empty() : this.contactProtocols;
    }

    /**
     * The number of data points that must be not within the specified threshold to trigger the alarm. If you are setting an "M out of N" alarm, this value (datapointsToAlarm) is the M.
     * 
     */
    @InputImport(name="datapointsToAlarm")
      private final @Nullable Input<Integer> datapointsToAlarm;

    public Input<Integer> getDatapointsToAlarm() {
        return this.datapointsToAlarm == null ? Input.empty() : this.datapointsToAlarm;
    }

    /**
     * The number of most recent periods over which data is compared to the specified threshold. If you are setting an "M out of N" alarm, this value (evaluationPeriods) is the N.
     * 
     */
    @InputImport(name="evaluationPeriods", required=true)
      private final Input<Integer> evaluationPeriods;

    public Input<Integer> getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * The name of the metric to associate with the alarm.
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The validation status of the SSL/TLS certificate.
     * 
     */
    @InputImport(name="monitoredResourceName", required=true)
      private final Input<String> monitoredResourceName;

    public Input<String> getMonitoredResourceName() {
        return this.monitoredResourceName;
    }

    /**
     * Indicates whether the alarm is enabled. Notifications are enabled by default if you don't specify this parameter.
     * 
     */
    @InputImport(name="notificationEnabled")
      private final @Nullable Input<Boolean> notificationEnabled;

    public Input<Boolean> getNotificationEnabled() {
        return this.notificationEnabled == null ? Input.empty() : this.notificationEnabled;
    }

    /**
     * The alarm states that trigger a notification.
     * 
     */
    @InputImport(name="notificationTriggers")
      private final @Nullable Input<List<String>> notificationTriggers;

    public Input<List<String>> getNotificationTriggers() {
        return this.notificationTriggers == null ? Input.empty() : this.notificationTriggers;
    }

    /**
     * The value against which the specified statistic is compared.
     * 
     */
    @InputImport(name="threshold", required=true)
      private final Input<Double> threshold;

    public Input<Double> getThreshold() {
        return this.threshold;
    }

    /**
     * Sets how this alarm will handle missing data points.
     * 
     */
    @InputImport(name="treatMissingData")
      private final @Nullable Input<String> treatMissingData;

    public Input<String> getTreatMissingData() {
        return this.treatMissingData == null ? Input.empty() : this.treatMissingData;
    }

    public AlarmArgs(
        @Nullable Input<String> alarmName,
        Input<String> comparisonOperator,
        @Nullable Input<List<String>> contactProtocols,
        @Nullable Input<Integer> datapointsToAlarm,
        Input<Integer> evaluationPeriods,
        Input<String> metricName,
        Input<String> monitoredResourceName,
        @Nullable Input<Boolean> notificationEnabled,
        @Nullable Input<List<String>> notificationTriggers,
        Input<Double> threshold,
        @Nullable Input<String> treatMissingData) {
        this.alarmName = alarmName;
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.contactProtocols = contactProtocols;
        this.datapointsToAlarm = datapointsToAlarm;
        this.evaluationPeriods = Objects.requireNonNull(evaluationPeriods, "expected parameter 'evaluationPeriods' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.monitoredResourceName = Objects.requireNonNull(monitoredResourceName, "expected parameter 'monitoredResourceName' to be non-null");
        this.notificationEnabled = notificationEnabled;
        this.notificationTriggers = notificationTriggers;
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.treatMissingData = treatMissingData;
    }

    private AlarmArgs() {
        this.alarmName = Input.empty();
        this.comparisonOperator = Input.empty();
        this.contactProtocols = Input.empty();
        this.datapointsToAlarm = Input.empty();
        this.evaluationPeriods = Input.empty();
        this.metricName = Input.empty();
        this.monitoredResourceName = Input.empty();
        this.notificationEnabled = Input.empty();
        this.notificationTriggers = Input.empty();
        this.threshold = Input.empty();
        this.treatMissingData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alarmName;
        private Input<String> comparisonOperator;
        private @Nullable Input<List<String>> contactProtocols;
        private @Nullable Input<Integer> datapointsToAlarm;
        private Input<Integer> evaluationPeriods;
        private Input<String> metricName;
        private Input<String> monitoredResourceName;
        private @Nullable Input<Boolean> notificationEnabled;
        private @Nullable Input<List<String>> notificationTriggers;
        private Input<Double> threshold;
        private @Nullable Input<String> treatMissingData;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.contactProtocols = defaults.contactProtocols;
    	      this.datapointsToAlarm = defaults.datapointsToAlarm;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.metricName = defaults.metricName;
    	      this.monitoredResourceName = defaults.monitoredResourceName;
    	      this.notificationEnabled = defaults.notificationEnabled;
    	      this.notificationTriggers = defaults.notificationTriggers;
    	      this.threshold = defaults.threshold;
    	      this.treatMissingData = defaults.treatMissingData;
        }

        public Builder alarmName(@Nullable Input<String> alarmName) {
            this.alarmName = alarmName;
            return this;
        }

        public Builder alarmName(@Nullable String alarmName) {
            this.alarmName = Input.ofNullable(alarmName);
            return this;
        }

        public Builder comparisonOperator(Input<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Input.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder contactProtocols(@Nullable Input<List<String>> contactProtocols) {
            this.contactProtocols = contactProtocols;
            return this;
        }

        public Builder contactProtocols(@Nullable List<String> contactProtocols) {
            this.contactProtocols = Input.ofNullable(contactProtocols);
            return this;
        }

        public Builder datapointsToAlarm(@Nullable Input<Integer> datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }

        public Builder datapointsToAlarm(@Nullable Integer datapointsToAlarm) {
            this.datapointsToAlarm = Input.ofNullable(datapointsToAlarm);
            return this;
        }

        public Builder evaluationPeriods(Input<Integer> evaluationPeriods) {
            this.evaluationPeriods = Objects.requireNonNull(evaluationPeriods);
            return this;
        }

        public Builder evaluationPeriods(Integer evaluationPeriods) {
            this.evaluationPeriods = Input.of(Objects.requireNonNull(evaluationPeriods));
            return this;
        }

        public Builder metricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder monitoredResourceName(Input<String> monitoredResourceName) {
            this.monitoredResourceName = Objects.requireNonNull(monitoredResourceName);
            return this;
        }

        public Builder monitoredResourceName(String monitoredResourceName) {
            this.monitoredResourceName = Input.of(Objects.requireNonNull(monitoredResourceName));
            return this;
        }

        public Builder notificationEnabled(@Nullable Input<Boolean> notificationEnabled) {
            this.notificationEnabled = notificationEnabled;
            return this;
        }

        public Builder notificationEnabled(@Nullable Boolean notificationEnabled) {
            this.notificationEnabled = Input.ofNullable(notificationEnabled);
            return this;
        }

        public Builder notificationTriggers(@Nullable Input<List<String>> notificationTriggers) {
            this.notificationTriggers = notificationTriggers;
            return this;
        }

        public Builder notificationTriggers(@Nullable List<String> notificationTriggers) {
            this.notificationTriggers = Input.ofNullable(notificationTriggers);
            return this;
        }

        public Builder threshold(Input<Double> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder threshold(Double threshold) {
            this.threshold = Input.of(Objects.requireNonNull(threshold));
            return this;
        }

        public Builder treatMissingData(@Nullable Input<String> treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }

        public Builder treatMissingData(@Nullable String treatMissingData) {
            this.treatMissingData = Input.ofNullable(treatMissingData);
            return this;
        }
        public AlarmArgs build() {
            return new AlarmArgs(alarmName, comparisonOperator, contactProtocols, datapointsToAlarm, evaluationPeriods, metricName, monitoredResourceName, notificationEnabled, notificationTriggers, threshold, treatMissingData);
        }
    }
}
