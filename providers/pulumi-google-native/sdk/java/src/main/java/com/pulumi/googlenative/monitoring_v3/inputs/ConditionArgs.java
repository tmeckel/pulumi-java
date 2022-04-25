// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.inputs.LogMatchArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.MetricAbsenceArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.MetricThresholdArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.MonitoringQueryLanguageConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A condition is a true/false test that determines when an alerting policy should open an incident. If a condition evaluates to true, it signifies that something is wrong.
 * 
 */
public final class ConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * A condition that checks that a time series continues to receive new data points.
     * 
     */
    @Import(name="conditionAbsent")
    private @Nullable Output<MetricAbsenceArgs> conditionAbsent;

    /**
     * @return A condition that checks that a time series continues to receive new data points.
     * 
     */
    public Optional<Output<MetricAbsenceArgs>> conditionAbsent() {
        return Optional.ofNullable(this.conditionAbsent);
    }

    /**
     * A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
     * 
     */
    @Import(name="conditionMatchedLog")
    private @Nullable Output<LogMatchArgs> conditionMatchedLog;

    /**
     * @return A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
     * 
     */
    public Optional<Output<LogMatchArgs>> conditionMatchedLog() {
        return Optional.ofNullable(this.conditionMatchedLog);
    }

    /**
     * A condition that uses the Monitoring Query Language to define alerts.
     * 
     */
    @Import(name="conditionMonitoringQueryLanguage")
    private @Nullable Output<MonitoringQueryLanguageConditionArgs> conditionMonitoringQueryLanguage;

    /**
     * @return A condition that uses the Monitoring Query Language to define alerts.
     * 
     */
    public Optional<Output<MonitoringQueryLanguageConditionArgs>> conditionMonitoringQueryLanguage() {
        return Optional.ofNullable(this.conditionMonitoringQueryLanguage);
    }

    /**
     * A condition that compares a time series against a threshold.
     * 
     */
    @Import(name="conditionThreshold")
    private @Nullable Output<MetricThresholdArgs> conditionThreshold;

    /**
     * @return A condition that compares a time series against a threshold.
     * 
     */
    public Optional<Output<MetricThresholdArgs>> conditionThreshold() {
        return Optional.ofNullable(this.conditionThreshold);
    }

    /**
     * A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple conditions in the same policy.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple conditions in the same policy.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Stackdriver Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Stackdriver Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ConditionArgs() {}

    private ConditionArgs(ConditionArgs $) {
        this.conditionAbsent = $.conditionAbsent;
        this.conditionMatchedLog = $.conditionMatchedLog;
        this.conditionMonitoringQueryLanguage = $.conditionMonitoringQueryLanguage;
        this.conditionThreshold = $.conditionThreshold;
        this.displayName = $.displayName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionArgs $;

        public Builder() {
            $ = new ConditionArgs();
        }

        public Builder(ConditionArgs defaults) {
            $ = new ConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionAbsent A condition that checks that a time series continues to receive new data points.
         * 
         * @return builder
         * 
         */
        public Builder conditionAbsent(@Nullable Output<MetricAbsenceArgs> conditionAbsent) {
            $.conditionAbsent = conditionAbsent;
            return this;
        }

        /**
         * @param conditionAbsent A condition that checks that a time series continues to receive new data points.
         * 
         * @return builder
         * 
         */
        public Builder conditionAbsent(MetricAbsenceArgs conditionAbsent) {
            return conditionAbsent(Output.of(conditionAbsent));
        }

        /**
         * @param conditionMatchedLog A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
         * 
         * @return builder
         * 
         */
        public Builder conditionMatchedLog(@Nullable Output<LogMatchArgs> conditionMatchedLog) {
            $.conditionMatchedLog = conditionMatchedLog;
            return this;
        }

        /**
         * @param conditionMatchedLog A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
         * 
         * @return builder
         * 
         */
        public Builder conditionMatchedLog(LogMatchArgs conditionMatchedLog) {
            return conditionMatchedLog(Output.of(conditionMatchedLog));
        }

        /**
         * @param conditionMonitoringQueryLanguage A condition that uses the Monitoring Query Language to define alerts.
         * 
         * @return builder
         * 
         */
        public Builder conditionMonitoringQueryLanguage(@Nullable Output<MonitoringQueryLanguageConditionArgs> conditionMonitoringQueryLanguage) {
            $.conditionMonitoringQueryLanguage = conditionMonitoringQueryLanguage;
            return this;
        }

        /**
         * @param conditionMonitoringQueryLanguage A condition that uses the Monitoring Query Language to define alerts.
         * 
         * @return builder
         * 
         */
        public Builder conditionMonitoringQueryLanguage(MonitoringQueryLanguageConditionArgs conditionMonitoringQueryLanguage) {
            return conditionMonitoringQueryLanguage(Output.of(conditionMonitoringQueryLanguage));
        }

        /**
         * @param conditionThreshold A condition that compares a time series against a threshold.
         * 
         * @return builder
         * 
         */
        public Builder conditionThreshold(@Nullable Output<MetricThresholdArgs> conditionThreshold) {
            $.conditionThreshold = conditionThreshold;
            return this;
        }

        /**
         * @param conditionThreshold A condition that compares a time series against a threshold.
         * 
         * @return builder
         * 
         */
        public Builder conditionThreshold(MetricThresholdArgs conditionThreshold) {
            return conditionThreshold(Output.of(conditionThreshold));
        }

        /**
         * @param displayName A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple conditions in the same policy.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple conditions in the same policy.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Stackdriver Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Stackdriver Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ConditionArgs build() {
            return $;
        }
    }

}
