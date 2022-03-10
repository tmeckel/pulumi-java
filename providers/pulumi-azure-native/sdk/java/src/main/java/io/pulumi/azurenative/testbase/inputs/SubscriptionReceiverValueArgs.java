// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The subscription role receiver value.
 * 
 */
public final class SubscriptionReceiverValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionReceiverValueArgs Empty = new SubscriptionReceiverValueArgs();

    /**
     * The role of the notification receiver.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * The subscription id of the notification receiver.
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    /**
     * The subscription name of the notification receiver.
     * 
     */
    @InputImport(name="subscriptionName")
      private final @Nullable Input<String> subscriptionName;

    public Input<String> getSubscriptionName() {
        return this.subscriptionName == null ? Input.empty() : this.subscriptionName;
    }

    public SubscriptionReceiverValueArgs(
        @Nullable Input<String> role,
        @Nullable Input<String> subscriptionId,
        @Nullable Input<String> subscriptionName) {
        this.role = role;
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
    }

    private SubscriptionReceiverValueArgs() {
        this.role = Input.empty();
        this.subscriptionId = Input.empty();
        this.subscriptionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionReceiverValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> role;
        private @Nullable Input<String> subscriptionId;
        private @Nullable Input<String> subscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionReceiverValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.subscriptionName = defaults.subscriptionName;
        }

        public Builder role(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder subscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
            return this;
        }

        public Builder subscriptionName(@Nullable Input<String> subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        public Builder subscriptionName(@Nullable String subscriptionName) {
            this.subscriptionName = Input.ofNullable(subscriptionName);
            return this;
        }
        public SubscriptionReceiverValueArgs build() {
            return new SubscriptionReceiverValueArgs(role, subscriptionId, subscriptionName);
        }
    }
}
