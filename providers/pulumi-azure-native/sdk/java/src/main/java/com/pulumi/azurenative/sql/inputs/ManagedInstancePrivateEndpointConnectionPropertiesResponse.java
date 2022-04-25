// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.inputs.ManagedInstancePrivateEndpointPropertyResponse;
import com.pulumi.azurenative.sql.inputs.ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a private endpoint connection.
 * 
 */
public final class ManagedInstancePrivateEndpointConnectionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedInstancePrivateEndpointConnectionPropertiesResponse Empty = new ManagedInstancePrivateEndpointConnectionPropertiesResponse();

    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint;

    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    public Optional<ManagedInstancePrivateEndpointPropertyResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Connection State of the Private Endpoint Connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;

    /**
     * @return Connection State of the Private Endpoint Connection.
     * 
     */
    public Optional<ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * State of the Private Endpoint Connection.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return State of the Private Endpoint Connection.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    private ManagedInstancePrivateEndpointConnectionPropertiesResponse() {}

    private ManagedInstancePrivateEndpointConnectionPropertiesResponse(ManagedInstancePrivateEndpointConnectionPropertiesResponse $) {
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstancePrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstancePrivateEndpointConnectionPropertiesResponse $;

        public Builder() {
            $ = new ManagedInstancePrivateEndpointConnectionPropertiesResponse();
        }

        public Builder(ManagedInstancePrivateEndpointConnectionPropertiesResponse defaults) {
            $ = new ManagedInstancePrivateEndpointConnectionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpoint Private endpoint which the connection belongs to.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState Connection State of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param provisioningState State of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public ManagedInstancePrivateEndpointConnectionPropertiesResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
