// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta1a.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    @InputImport(name="subscriptionId", required=true)
    private final String subscriptionId;

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public GetSubscriptionArgs(String subscriptionId) {
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private GetSubscriptionArgs() {
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public GetSubscriptionArgs build() {
            return new GetSubscriptionArgs(subscriptionId);
        }
    }
}
