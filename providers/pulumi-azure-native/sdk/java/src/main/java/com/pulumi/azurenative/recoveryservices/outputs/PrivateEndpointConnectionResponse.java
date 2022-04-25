// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.recoveryservices.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointConnectionResponse {
    /**
     * @return Gets or sets private endpoint associated with the private endpoint connection
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * @return Gets or sets private link service connection state
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * @return Gets or sets provisioning state of the private endpoint connection
     * 
     */
    private final @Nullable String provisioningState;

    @CustomType.Constructor
    private PrivateEndpointConnectionResponse(
        @CustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    /**
     * @return Gets or sets private endpoint associated with the private endpoint connection
     * 
     */
    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return Gets or sets private link service connection state
     * 
     */
    public Optional<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * @return Gets or sets provisioning state of the private endpoint connection
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
