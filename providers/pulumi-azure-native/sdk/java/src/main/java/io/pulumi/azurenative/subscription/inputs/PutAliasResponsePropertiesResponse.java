// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.subscription.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Put subscription creation result properties.
 * 
 */
public final class PutAliasResponsePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PutAliasResponsePropertiesResponse Empty = new PutAliasResponsePropertiesResponse();

    /**
     * The provisioning state of the resource.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * Newly created subscription Id.
     * 
     */
    @InputImport(name="subscriptionId", required=true)
      private final String subscriptionId;

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public PutAliasResponsePropertiesResponse(
        @Nullable String provisioningState,
        String subscriptionId) {
        this.provisioningState = provisioningState;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private PutAliasResponsePropertiesResponse() {
        this.provisioningState = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PutAliasResponsePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String provisioningState;
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(PutAliasResponsePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public PutAliasResponsePropertiesResponse build() {
            return new PutAliasResponsePropertiesResponse(provisioningState, subscriptionId);
        }
    }
}
