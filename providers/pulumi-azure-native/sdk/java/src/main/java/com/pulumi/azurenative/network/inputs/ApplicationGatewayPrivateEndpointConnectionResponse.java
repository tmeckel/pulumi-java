// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private Endpoint connection on an application gateway.
 * 
 */
public final class ApplicationGatewayPrivateEndpointConnectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayPrivateEndpointConnectionResponse Empty = new ApplicationGatewayPrivateEndpointConnectionResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The consumer link id.
     * 
     */
    @Import(name="linkIdentifier", required=true)
    private String linkIdentifier;

    /**
     * @return The consumer link id.
     * 
     */
    public String linkIdentifier() {
        return this.linkIdentifier;
    }

    /**
     * Name of the private endpoint connection on an application gateway.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the private endpoint connection on an application gateway.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource of private end point.
     * 
     */
    @Import(name="privateEndpoint", required=true)
    private PrivateEndpointResponse privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public PrivateEndpointResponse privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Optional<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The provisioning state of the application gateway private endpoint connection resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the application gateway private endpoint connection resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    private ApplicationGatewayPrivateEndpointConnectionResponse() {}

    private ApplicationGatewayPrivateEndpointConnectionResponse(ApplicationGatewayPrivateEndpointConnectionResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.linkIdentifier = $.linkIdentifier;
        this.name = $.name;
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayPrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayPrivateEndpointConnectionResponse $;

        public Builder() {
            $ = new ApplicationGatewayPrivateEndpointConnectionResponse();
        }

        public Builder(ApplicationGatewayPrivateEndpointConnectionResponse defaults) {
            $ = new ApplicationGatewayPrivateEndpointConnectionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag A unique read-only string that changes whenever the resource is updated.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param linkIdentifier The consumer link id.
         * 
         * @return builder
         * 
         */
        public Builder linkIdentifier(String linkIdentifier) {
            $.linkIdentifier = linkIdentifier;
            return this;
        }

        /**
         * @param name Name of the private endpoint connection on an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param privateEndpoint The resource of private end point.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(PrivateEndpointResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the application gateway private endpoint connection resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param type Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ApplicationGatewayPrivateEndpointConnectionResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.linkIdentifier = Objects.requireNonNull($.linkIdentifier, "expected parameter 'linkIdentifier' to be non-null");
            $.privateEndpoint = Objects.requireNonNull($.privateEndpoint, "expected parameter 'privateEndpoint' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
