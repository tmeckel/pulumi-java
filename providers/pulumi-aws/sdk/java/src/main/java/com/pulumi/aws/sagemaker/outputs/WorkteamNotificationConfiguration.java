// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkteamNotificationConfiguration {
    /**
     * @return The ARN for the SNS topic to which notifications should be published.
     * 
     */
    private final @Nullable String notificationTopicArn;

    @CustomType.Constructor
    private WorkteamNotificationConfiguration(@CustomType.Parameter("notificationTopicArn") @Nullable String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * @return The ARN for the SNS topic to which notifications should be published.
     * 
     */
    public Optional<String> notificationTopicArn() {
        return Optional.ofNullable(this.notificationTopicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamNotificationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String notificationTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamNotificationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationTopicArn = defaults.notificationTopicArn;
        }

        public Builder notificationTopicArn(@Nullable String notificationTopicArn) {
            this.notificationTopicArn = notificationTopicArn;
            return this;
        }        public WorkteamNotificationConfiguration build() {
            return new WorkteamNotificationConfiguration(notificationTopicArn);
        }
    }
}
