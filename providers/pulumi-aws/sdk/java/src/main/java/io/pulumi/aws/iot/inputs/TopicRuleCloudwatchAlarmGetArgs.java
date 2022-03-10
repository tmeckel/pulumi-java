// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleCloudwatchAlarmGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleCloudwatchAlarmGetArgs Empty = new TopicRuleCloudwatchAlarmGetArgs();

    /**
     * The CloudWatch alarm name.
     * 
     */
    @InputImport(name="alarmName", required=true)
      private final Input<String> alarmName;

    public Input<String> getAlarmName() {
        return this.alarmName;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The reason for the alarm change.
     * 
     */
    @InputImport(name="stateReason", required=true)
      private final Input<String> stateReason;

    public Input<String> getStateReason() {
        return this.stateReason;
    }

    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     * 
     */
    @InputImport(name="stateValue", required=true)
      private final Input<String> stateValue;

    public Input<String> getStateValue() {
        return this.stateValue;
    }

    public TopicRuleCloudwatchAlarmGetArgs(
        Input<String> alarmName,
        Input<String> roleArn,
        Input<String> stateReason,
        Input<String> stateValue) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateReason = Objects.requireNonNull(stateReason, "expected parameter 'stateReason' to be non-null");
        this.stateValue = Objects.requireNonNull(stateValue, "expected parameter 'stateValue' to be non-null");
    }

    private TopicRuleCloudwatchAlarmGetArgs() {
        this.alarmName = Input.empty();
        this.roleArn = Input.empty();
        this.stateReason = Input.empty();
        this.stateValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchAlarmGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> alarmName;
        private Input<String> roleArn;
        private Input<String> stateReason;
        private Input<String> stateValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchAlarmGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.roleArn = defaults.roleArn;
    	      this.stateReason = defaults.stateReason;
    	      this.stateValue = defaults.stateValue;
        }

        public Builder alarmName(Input<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Input.of(Objects.requireNonNull(alarmName));
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder stateReason(Input<String> stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }

        public Builder stateReason(String stateReason) {
            this.stateReason = Input.of(Objects.requireNonNull(stateReason));
            return this;
        }

        public Builder stateValue(Input<String> stateValue) {
            this.stateValue = Objects.requireNonNull(stateValue);
            return this;
        }

        public Builder stateValue(String stateValue) {
            this.stateValue = Input.of(Objects.requireNonNull(stateValue));
            return this;
        }
        public TopicRuleCloudwatchAlarmGetArgs build() {
            return new TopicRuleCloudwatchAlarmGetArgs(alarmName, roleArn, stateReason, stateValue);
        }
    }
}
