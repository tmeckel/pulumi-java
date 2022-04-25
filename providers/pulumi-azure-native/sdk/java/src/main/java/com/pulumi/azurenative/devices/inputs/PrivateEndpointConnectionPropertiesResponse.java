// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.devices.inputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a private endpoint connection
 * 
 */
public final class PrivateEndpointConnectionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionPropertiesResponse Empty = new PrivateEndpointConnectionPropertiesResponse();

    /**
     * The private endpoint property of a private endpoint connection
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable PrivateEndpointResponse privateEndpoint;

    /**
     * @return The private endpoint property of a private endpoint connection
     * 
     */
    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * The current state of a private endpoint connection
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
    private PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    /**
     * @return The current state of a private endpoint connection
     * 
     */
    public PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    private PrivateEndpointConnectionPropertiesResponse() {}

    private PrivateEndpointConnectionPropertiesResponse(PrivateEndpointConnectionPropertiesResponse $) {
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionPropertiesResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionPropertiesResponse();
        }

        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
            $ = new PrivateEndpointConnectionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpoint The private endpoint property of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState The current state of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public PrivateEndpointConnectionPropertiesResponse build() {
            $.privateLinkServiceConnectionState = Objects.requireNonNull($.privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
            return $;
        }
    }

}
