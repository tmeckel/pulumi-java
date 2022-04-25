// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlarmResult {
    private final @Nullable String alarmArn;
    /**
     * @return The arithmetic operation to use when comparing the specified statistic to the threshold. The specified statistic value is used as the first operand.
     * 
     */
    private final @Nullable String comparisonOperator;
    /**
     * @return The contact protocols to use for the alarm, such as Email, SMS (text messaging), or both.
     * 
     */
    private final @Nullable List<String> contactProtocols;
    /**
     * @return The number of data points that must be not within the specified threshold to trigger the alarm. If you are setting an &#34;M out of N&#34; alarm, this value (datapointsToAlarm) is the M.
     * 
     */
    private final @Nullable Integer datapointsToAlarm;
    /**
     * @return The number of most recent periods over which data is compared to the specified threshold. If you are setting an &#34;M out of N&#34; alarm, this value (evaluationPeriods) is the N.
     * 
     */
    private final @Nullable Integer evaluationPeriods;
    /**
     * @return Indicates whether the alarm is enabled. Notifications are enabled by default if you don&#39;t specify this parameter.
     * 
     */
    private final @Nullable Boolean notificationEnabled;
    /**
     * @return The alarm states that trigger a notification.
     * 
     */
    private final @Nullable List<String> notificationTriggers;
    /**
     * @return The current state of the alarm.
     * 
     */
    private final @Nullable String state;
    /**
     * @return The value against which the specified statistic is compared.
     * 
     */
    private final @Nullable Double threshold;
    /**
     * @return Sets how this alarm will handle missing data points.
     * 
     */
    private final @Nullable String treatMissingData;

    @CustomType.Constructor
    private GetAlarmResult(
        @CustomType.Parameter("alarmArn") @Nullable String alarmArn,
        @CustomType.Parameter("comparisonOperator") @Nullable String comparisonOperator,
        @CustomType.Parameter("contactProtocols") @Nullable List<String> contactProtocols,
        @CustomType.Parameter("datapointsToAlarm") @Nullable Integer datapointsToAlarm,
        @CustomType.Parameter("evaluationPeriods") @Nullable Integer evaluationPeriods,
        @CustomType.Parameter("notificationEnabled") @Nullable Boolean notificationEnabled,
        @CustomType.Parameter("notificationTriggers") @Nullable List<String> notificationTriggers,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("threshold") @Nullable Double threshold,
        @CustomType.Parameter("treatMissingData") @Nullable String treatMissingData) {
        this.alarmArn = alarmArn;
        this.comparisonOperator = comparisonOperator;
        this.contactProtocols = contactProtocols;
        this.datapointsToAlarm = datapointsToAlarm;
        this.evaluationPeriods = evaluationPeriods;
        this.notificationEnabled = notificationEnabled;
        this.notificationTriggers = notificationTriggers;
        this.state = state;
        this.threshold = threshold;
        this.treatMissingData = treatMissingData;
    }

    public Optional<String> alarmArn() {
        return Optional.ofNullable(this.alarmArn);
    }
    /**
     * @return The arithmetic operation to use when comparing the specified statistic to the threshold. The specified statistic value is used as the first operand.
     * 
     */
    public Optional<String> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }
    /**
     * @return The contact protocols to use for the alarm, such as Email, SMS (text messaging), or both.
     * 
     */
    public List<String> contactProtocols() {
        return this.contactProtocols == null ? List.of() : this.contactProtocols;
    }
    /**
     * @return The number of data points that must be not within the specified threshold to trigger the alarm. If you are setting an &#34;M out of N&#34; alarm, this value (datapointsToAlarm) is the M.
     * 
     */
    public Optional<Integer> datapointsToAlarm() {
        return Optional.ofNullable(this.datapointsToAlarm);
    }
    /**
     * @return The number of most recent periods over which data is compared to the specified threshold. If you are setting an &#34;M out of N&#34; alarm, this value (evaluationPeriods) is the N.
     * 
     */
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    /**
     * @return Indicates whether the alarm is enabled. Notifications are enabled by default if you don&#39;t specify this parameter.
     * 
     */
    public Optional<Boolean> notificationEnabled() {
        return Optional.ofNullable(this.notificationEnabled);
    }
    /**
     * @return The alarm states that trigger a notification.
     * 
     */
    public List<String> notificationTriggers() {
        return this.notificationTriggers == null ? List.of() : this.notificationTriggers;
    }
    /**
     * @return The current state of the alarm.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The value against which the specified statistic is compared.
     * 
     */
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * @return Sets how this alarm will handle missing data points.
     * 
     */
    public Optional<String> treatMissingData() {
        return Optional.ofNullable(this.treatMissingData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alarmArn;
        private @Nullable String comparisonOperator;
        private @Nullable List<String> contactProtocols;
        private @Nullable Integer datapointsToAlarm;
        private @Nullable Integer evaluationPeriods;
        private @Nullable Boolean notificationEnabled;
        private @Nullable List<String> notificationTriggers;
        private @Nullable String state;
        private @Nullable Double threshold;
        private @Nullable String treatMissingData;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlarmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmArn = defaults.alarmArn;
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.contactProtocols = defaults.contactProtocols;
    	      this.datapointsToAlarm = defaults.datapointsToAlarm;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.notificationEnabled = defaults.notificationEnabled;
    	      this.notificationTriggers = defaults.notificationTriggers;
    	      this.state = defaults.state;
    	      this.threshold = defaults.threshold;
    	      this.treatMissingData = defaults.treatMissingData;
        }

        public Builder alarmArn(@Nullable String alarmArn) {
            this.alarmArn = alarmArn;
            return this;
        }
        public Builder comparisonOperator(@Nullable String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public Builder contactProtocols(@Nullable List<String> contactProtocols) {
            this.contactProtocols = contactProtocols;
            return this;
        }
        public Builder contactProtocols(String... contactProtocols) {
            return contactProtocols(List.of(contactProtocols));
        }
        public Builder datapointsToAlarm(@Nullable Integer datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }
        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }
        public Builder notificationEnabled(@Nullable Boolean notificationEnabled) {
            this.notificationEnabled = notificationEnabled;
            return this;
        }
        public Builder notificationTriggers(@Nullable List<String> notificationTriggers) {
            this.notificationTriggers = notificationTriggers;
            return this;
        }
        public Builder notificationTriggers(String... notificationTriggers) {
            return notificationTriggers(List.of(notificationTriggers));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder treatMissingData(@Nullable String treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }        public GetAlarmResult build() {
            return new GetAlarmResult(alarmArn, comparisonOperator, contactProtocols, datapointsToAlarm, evaluationPeriods, notificationEnabled, notificationTriggers, state, threshold, treatMissingData);
        }
    }
}
