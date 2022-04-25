// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.azurenative.appconfiguration.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.appconfiguration.inputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A reference to a related private endpoint connection.
 * 
 */
public final class PrivateEndpointConnectionReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionReferenceResponse Empty = new PrivateEndpointConnectionReferenceResponse();

    /**
     * The resource ID.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The resource ID.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The resource of private endpoint.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable PrivateEndpointResponse privateEndpoint;

    /**
     * @return The resource of private endpoint.
     * 
     */
    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
    private PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * The provisioning status of the private endpoint connection.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning status of the private endpoint connection.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    private PrivateEndpointConnectionReferenceResponse() {}

    private PrivateEndpointConnectionReferenceResponse(PrivateEndpointConnectionReferenceResponse $) {
        this.id = $.id;
        this.name = $.name;
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionReferenceResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionReferenceResponse();
        }

        public Builder(PrivateEndpointConnectionReferenceResponse defaults) {
            $ = new PrivateEndpointConnectionReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param privateEndpoint The resource of private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param provisioningState The provisioning status of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param type The type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public PrivateEndpointConnectionReferenceResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.privateLinkServiceConnectionState = Objects.requireNonNull($.privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
