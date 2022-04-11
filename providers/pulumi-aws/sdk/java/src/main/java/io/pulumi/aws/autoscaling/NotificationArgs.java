// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class NotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationArgs Empty = new NotificationArgs();

    /**
     * A list of AutoScaling Group Names
     * 
     */
    @Import(name="groupNames", required=true)
      private final Output<List<String>> groupNames;

    public Output<List<String>> getGroupNames() {
        return this.groupNames;
    }

    /**
     * A list of Notification Types that trigger
     * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
     * 
     */
    @Import(name="notifications", required=true)
      private final Output<List<String>> notifications;

    public Output<List<String>> getNotifications() {
        return this.notifications;
    }

    /**
     * The Topic ARN for notifications to be sent through
     * 
     */
    @Import(name="topicArn", required=true)
      private final Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn;
    }

    public NotificationArgs(
        Output<List<String>> groupNames,
        Output<List<String>> notifications,
        Output<String> topicArn) {
        this.groupNames = Objects.requireNonNull(groupNames, "expected parameter 'groupNames' to be non-null");
        this.notifications = Objects.requireNonNull(notifications, "expected parameter 'notifications' to be non-null");
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private NotificationArgs() {
        this.groupNames = Codegen.empty();
        this.notifications = Codegen.empty();
        this.topicArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> groupNames;
        private Output<List<String>> notifications;
        private Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupNames = defaults.groupNames;
    	      this.notifications = defaults.notifications;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder groupNames(Output<List<String>> groupNames) {
            this.groupNames = Objects.requireNonNull(groupNames);
            return this;
        }
        public Builder groupNames(List<String> groupNames) {
            this.groupNames = Output.of(Objects.requireNonNull(groupNames));
            return this;
        }
        public Builder groupNames(String... groupNames) {
            return groupNames(List.of(groupNames));
        }
        public Builder notifications(Output<List<String>> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(List<String> notifications) {
            this.notifications = Output.of(Objects.requireNonNull(notifications));
            return this;
        }
        public Builder notifications(String... notifications) {
            return notifications(List.of(notifications));
        }
        public Builder topicArn(Output<String> topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }
        public Builder topicArn(String topicArn) {
            this.topicArn = Output.of(Objects.requireNonNull(topicArn));
            return this;
        }        public NotificationArgs build() {
            return new NotificationArgs(groupNames, notifications, topicArn);
        }
    }
}
