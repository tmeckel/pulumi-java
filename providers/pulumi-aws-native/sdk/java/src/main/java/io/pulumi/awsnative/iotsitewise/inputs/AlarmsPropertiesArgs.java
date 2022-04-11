// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor portal. You can use the alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
 * 
 */
public final class AlarmsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlarmsPropertiesArgs Empty = new AlarmsPropertiesArgs();

    /**
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources and services, such as AWS IoT Events.
     * 
     */
    @Import(name="alarmRoleArn")
      private final @Nullable Output<String> alarmRoleArn;

    public Output<String> getAlarmRoleArn() {
        return this.alarmRoleArn == null ? Codegen.empty() : this.alarmRoleArn;
    }

    /**
     * The ARN of the AWS Lambda function that manages alarm notifications. For more information, see Managing alarm notifications in the AWS IoT Events Developer Guide.
     * 
     */
    @Import(name="notificationLambdaArn")
      private final @Nullable Output<String> notificationLambdaArn;

    public Output<String> getNotificationLambdaArn() {
        return this.notificationLambdaArn == null ? Codegen.empty() : this.notificationLambdaArn;
    }

    public AlarmsPropertiesArgs(
        @Nullable Output<String> alarmRoleArn,
        @Nullable Output<String> notificationLambdaArn) {
        this.alarmRoleArn = alarmRoleArn;
        this.notificationLambdaArn = notificationLambdaArn;
    }

    private AlarmsPropertiesArgs() {
        this.alarmRoleArn = Codegen.empty();
        this.notificationLambdaArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alarmRoleArn;
        private @Nullable Output<String> notificationLambdaArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmRoleArn = defaults.alarmRoleArn;
    	      this.notificationLambdaArn = defaults.notificationLambdaArn;
        }

        public Builder alarmRoleArn(@Nullable Output<String> alarmRoleArn) {
            this.alarmRoleArn = alarmRoleArn;
            return this;
        }
        public Builder alarmRoleArn(@Nullable String alarmRoleArn) {
            this.alarmRoleArn = Codegen.ofNullable(alarmRoleArn);
            return this;
        }
        public Builder notificationLambdaArn(@Nullable Output<String> notificationLambdaArn) {
            this.notificationLambdaArn = notificationLambdaArn;
            return this;
        }
        public Builder notificationLambdaArn(@Nullable String notificationLambdaArn) {
            this.notificationLambdaArn = Codegen.ofNullable(notificationLambdaArn);
            return this;
        }        public AlarmsPropertiesArgs build() {
            return new AlarmsPropertiesArgs(alarmRoleArn, notificationLambdaArn);
        }
    }
}
