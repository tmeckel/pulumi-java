// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleCloudwatchAlarmGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleCloudwatchAlarmGetArgs Empty = new TopicRuleCloudwatchAlarmGetArgs();

    /**
     * The CloudWatch alarm name.
     * 
     */
    @Import(name="alarmName", required=true)
      private final Output<String> alarmName;

    public Output<String> getAlarmName() {
        return this.alarmName;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The reason for the alarm change.
     * 
     */
    @Import(name="stateReason", required=true)
      private final Output<String> stateReason;

    public Output<String> getStateReason() {
        return this.stateReason;
    }

    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     * 
     */
    @Import(name="stateValue", required=true)
      private final Output<String> stateValue;

    public Output<String> getStateValue() {
        return this.stateValue;
    }

    public TopicRuleCloudwatchAlarmGetArgs(
        Output<String> alarmName,
        Output<String> roleArn,
        Output<String> stateReason,
        Output<String> stateValue) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateReason = Objects.requireNonNull(stateReason, "expected parameter 'stateReason' to be non-null");
        this.stateValue = Objects.requireNonNull(stateValue, "expected parameter 'stateValue' to be non-null");
    }

    private TopicRuleCloudwatchAlarmGetArgs() {
        this.alarmName = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.stateReason = Codegen.empty();
        this.stateValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchAlarmGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> alarmName;
        private Output<String> roleArn;
        private Output<String> stateReason;
        private Output<String> stateValue;

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

        public Builder alarmName(Output<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public Builder alarmName(String alarmName) {
            this.alarmName = Output.of(Objects.requireNonNull(alarmName));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder stateReason(Output<String> stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }
        public Builder stateReason(String stateReason) {
            this.stateReason = Output.of(Objects.requireNonNull(stateReason));
            return this;
        }
        public Builder stateValue(Output<String> stateValue) {
            this.stateValue = Objects.requireNonNull(stateValue);
            return this;
        }
        public Builder stateValue(String stateValue) {
            this.stateValue = Output.of(Objects.requireNonNull(stateValue));
            return this;
        }        public TopicRuleCloudwatchAlarmGetArgs build() {
            return new TopicRuleCloudwatchAlarmGetArgs(alarmName, roleArn, stateReason, stateValue);
        }
    }
}
