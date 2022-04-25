// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.xray.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupInsightsConfiguration {
    /**
     * @return Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * 
     */
    private final @Nullable Boolean insightsEnabled;
    /**
     * @return Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
     * 
     */
    private final @Nullable Boolean notificationsEnabled;

    @CustomType.Constructor
    private GroupInsightsConfiguration(
        @CustomType.Parameter("insightsEnabled") @Nullable Boolean insightsEnabled,
        @CustomType.Parameter("notificationsEnabled") @Nullable Boolean notificationsEnabled) {
        this.insightsEnabled = insightsEnabled;
        this.notificationsEnabled = notificationsEnabled;
    }

    /**
     * @return Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * 
     */
    public Optional<Boolean> insightsEnabled() {
        return Optional.ofNullable(this.insightsEnabled);
    }
    /**
     * @return Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
     * 
     */
    public Optional<Boolean> notificationsEnabled() {
        return Optional.ofNullable(this.notificationsEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInsightsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean insightsEnabled;
        private @Nullable Boolean notificationsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInsightsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insightsEnabled = defaults.insightsEnabled;
    	      this.notificationsEnabled = defaults.notificationsEnabled;
        }

        public Builder insightsEnabled(@Nullable Boolean insightsEnabled) {
            this.insightsEnabled = insightsEnabled;
            return this;
        }
        public Builder notificationsEnabled(@Nullable Boolean notificationsEnabled) {
            this.notificationsEnabled = notificationsEnabled;
            return this;
        }        public GroupInsightsConfiguration build() {
            return new GroupInsightsConfiguration(insightsEnabled, notificationsEnabled);
        }
    }
}
