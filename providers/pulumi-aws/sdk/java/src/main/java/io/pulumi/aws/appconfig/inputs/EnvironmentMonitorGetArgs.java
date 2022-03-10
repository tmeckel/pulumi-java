// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentMonitorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentMonitorGetArgs Empty = new EnvironmentMonitorGetArgs();

    /**
     * ARN of the Amazon CloudWatch alarm.
     * 
     */
    @InputImport(name="alarmArn", required=true)
      private final Input<String> alarmArn;

    public Input<String> getAlarmArn() {
        return this.alarmArn;
    }

    /**
     * ARN of an IAM role for AWS AppConfig to monitor `alarm_arn`.
     * 
     */
    @InputImport(name="alarmRoleArn")
      private final @Nullable Input<String> alarmRoleArn;

    public Input<String> getAlarmRoleArn() {
        return this.alarmRoleArn == null ? Input.empty() : this.alarmRoleArn;
    }

    public EnvironmentMonitorGetArgs(
        Input<String> alarmArn,
        @Nullable Input<String> alarmRoleArn) {
        this.alarmArn = Objects.requireNonNull(alarmArn, "expected parameter 'alarmArn' to be non-null");
        this.alarmRoleArn = alarmRoleArn;
    }

    private EnvironmentMonitorGetArgs() {
        this.alarmArn = Input.empty();
        this.alarmRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMonitorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> alarmArn;
        private @Nullable Input<String> alarmRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMonitorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmArn = defaults.alarmArn;
    	      this.alarmRoleArn = defaults.alarmRoleArn;
        }

        public Builder alarmArn(Input<String> alarmArn) {
            this.alarmArn = Objects.requireNonNull(alarmArn);
            return this;
        }

        public Builder alarmArn(String alarmArn) {
            this.alarmArn = Input.of(Objects.requireNonNull(alarmArn));
            return this;
        }

        public Builder alarmRoleArn(@Nullable Input<String> alarmRoleArn) {
            this.alarmRoleArn = alarmRoleArn;
            return this;
        }

        public Builder alarmRoleArn(@Nullable String alarmRoleArn) {
            this.alarmRoleArn = Input.ofNullable(alarmRoleArn);
            return this;
        }
        public EnvironmentMonitorGetArgs build() {
            return new EnvironmentMonitorGetArgs(alarmArn, alarmRoleArn);
        }
    }
}
