// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v3.inputs.NotificationRateLimitArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Control over how the notification channels in notification_channels are notified when this alert fires.
 * 
 */
public final class AlertStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertStrategyArgs Empty = new AlertStrategyArgs();

    /**
     * If an alert policy that was active has no data for this long, any open incidents will close
     * 
     */
    @Import(name="autoClose")
      private final @Nullable Output<String> autoClose;

    public Output<String> getAutoClose() {
        return this.autoClose == null ? Codegen.empty() : this.autoClose;
    }

    /**
     * Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based.
     * 
     */
    @Import(name="notificationRateLimit")
      private final @Nullable Output<NotificationRateLimitArgs> notificationRateLimit;

    public Output<NotificationRateLimitArgs> getNotificationRateLimit() {
        return this.notificationRateLimit == null ? Codegen.empty() : this.notificationRateLimit;
    }

    public AlertStrategyArgs(
        @Nullable Output<String> autoClose,
        @Nullable Output<NotificationRateLimitArgs> notificationRateLimit) {
        this.autoClose = autoClose;
        this.notificationRateLimit = notificationRateLimit;
    }

    private AlertStrategyArgs() {
        this.autoClose = Codegen.empty();
        this.notificationRateLimit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoClose;
        private @Nullable Output<NotificationRateLimitArgs> notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        public Builder autoClose(@Nullable Output<String> autoClose) {
            this.autoClose = autoClose;
            return this;
        }
        public Builder autoClose(@Nullable String autoClose) {
            this.autoClose = Codegen.ofNullable(autoClose);
            return this;
        }
        public Builder notificationRateLimit(@Nullable Output<NotificationRateLimitArgs> notificationRateLimit) {
            this.notificationRateLimit = notificationRateLimit;
            return this;
        }
        public Builder notificationRateLimit(@Nullable NotificationRateLimitArgs notificationRateLimit) {
            this.notificationRateLimit = Codegen.ofNullable(notificationRateLimit);
            return this;
        }        public AlertStrategyArgs build() {
            return new AlertStrategyArgs(autoClose, notificationRateLimit);
        }
    }
}
