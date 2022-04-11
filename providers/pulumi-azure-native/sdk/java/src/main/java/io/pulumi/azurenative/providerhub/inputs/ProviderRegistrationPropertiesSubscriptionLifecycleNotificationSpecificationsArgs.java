// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.SubscriptionStateOverrideActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs Empty = new ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs();

    @Import(name="softDeleteTTL")
      private final @Nullable Output<String> softDeleteTTL;

    public Output<String> getSoftDeleteTTL() {
        return this.softDeleteTTL == null ? Codegen.empty() : this.softDeleteTTL;
    }

    @Import(name="subscriptionStateOverrideActions")
      private final @Nullable Output<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions;

    public Output<List<SubscriptionStateOverrideActionArgs>> getSubscriptionStateOverrideActions() {
        return this.subscriptionStateOverrideActions == null ? Codegen.empty() : this.subscriptionStateOverrideActions;
    }

    public ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs(
        @Nullable Output<String> softDeleteTTL,
        @Nullable Output<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions) {
        this.softDeleteTTL = softDeleteTTL;
        this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
    }

    private ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs() {
        this.softDeleteTTL = Codegen.empty();
        this.subscriptionStateOverrideActions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> softDeleteTTL;
        private @Nullable Output<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.softDeleteTTL = defaults.softDeleteTTL;
    	      this.subscriptionStateOverrideActions = defaults.subscriptionStateOverrideActions;
        }

        public Builder softDeleteTTL(@Nullable Output<String> softDeleteTTL) {
            this.softDeleteTTL = softDeleteTTL;
            return this;
        }
        public Builder softDeleteTTL(@Nullable String softDeleteTTL) {
            this.softDeleteTTL = Codegen.ofNullable(softDeleteTTL);
            return this;
        }
        public Builder subscriptionStateOverrideActions(@Nullable Output<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
            return this;
        }
        public Builder subscriptionStateOverrideActions(@Nullable List<SubscriptionStateOverrideActionArgs> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = Codegen.ofNullable(subscriptionStateOverrideActions);
            return this;
        }
        public Builder subscriptionStateOverrideActions(SubscriptionStateOverrideActionArgs... subscriptionStateOverrideActions) {
            return subscriptionStateOverrideActions(List.of(subscriptionStateOverrideActions));
        }        public ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs build() {
            return new ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs(softDeleteTTL, subscriptionStateOverrideActions);
        }
    }
}
