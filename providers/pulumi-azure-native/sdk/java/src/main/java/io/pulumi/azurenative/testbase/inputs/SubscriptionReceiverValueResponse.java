// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The subscription role receiver value.
 * 
 */
public final class SubscriptionReceiverValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubscriptionReceiverValueResponse Empty = new SubscriptionReceiverValueResponse();

    /**
     * The role of the notification receiver.
     * 
     */
    @InputImport(name="role")
      private final @Nullable String role;

    public Optional<String> getRole() {
        return this.role == null ? Optional.empty() : Optional.ofNullable(this.role);
    }

    /**
     * The subscription id of the notification receiver.
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The subscription name of the notification receiver.
     * 
     */
    @InputImport(name="subscriptionName")
      private final @Nullable String subscriptionName;

    public Optional<String> getSubscriptionName() {
        return this.subscriptionName == null ? Optional.empty() : Optional.ofNullable(this.subscriptionName);
    }

    public SubscriptionReceiverValueResponse(
        @Nullable String role,
        @Nullable String subscriptionId,
        @Nullable String subscriptionName) {
        this.role = role;
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
    }

    private SubscriptionReceiverValueResponse() {
        this.role = null;
        this.subscriptionId = null;
        this.subscriptionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionReceiverValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String role;
        private @Nullable String subscriptionId;
        private @Nullable String subscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionReceiverValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.subscriptionName = defaults.subscriptionName;
        }

        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionName(@Nullable String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }
        public SubscriptionReceiverValueResponse build() {
            return new SubscriptionReceiverValueResponse(role, subscriptionId, subscriptionName);
        }
    }
}
