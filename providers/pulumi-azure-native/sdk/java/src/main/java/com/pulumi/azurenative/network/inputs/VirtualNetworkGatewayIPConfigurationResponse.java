// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP configuration for virtual network gateway.
 * 
 */
public final class VirtualNetworkGatewayIPConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkGatewayIPConfigurationResponse Empty = new VirtualNetworkGatewayIPConfigurationResponse();

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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Private IP Address for this gateway.
     * 
     */
    @Import(name="privateIPAddress", required=true)
    private String privateIPAddress;

    /**
     * @return Private IP Address for this gateway.
     * 
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * The private IP address allocation method.
     * 
     */
    @Import(name="privateIPAllocationMethod")
    private @Nullable String privateIPAllocationMethod;

    /**
     * @return The private IP address allocation method.
     * 
     */
    public Optional<String> privateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }

    /**
     * The provisioning state of the virtual network gateway IP configuration resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the virtual network gateway IP configuration resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the public IP resource.
     * 
     */
    @Import(name="publicIPAddress")
    private @Nullable SubResourceResponse publicIPAddress;

    /**
     * @return The reference to the public IP resource.
     * 
     */
    public Optional<SubResourceResponse> publicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @Import(name="subnet")
    private @Nullable SubResourceResponse subnet;

    /**
     * @return The reference to the subnet resource.
     * 
     */
    public Optional<SubResourceResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private VirtualNetworkGatewayIPConfigurationResponse() {}

    private VirtualNetworkGatewayIPConfigurationResponse(VirtualNetworkGatewayIPConfigurationResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.privateIPAddress = $.privateIPAddress;
        this.privateIPAllocationMethod = $.privateIPAllocationMethod;
        this.provisioningState = $.provisioningState;
        this.publicIPAddress = $.publicIPAddress;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayIPConfigurationResponse $;

        public Builder() {
            $ = new VirtualNetworkGatewayIPConfigurationResponse();
        }

        public Builder(VirtualNetworkGatewayIPConfigurationResponse defaults) {
            $ = new VirtualNetworkGatewayIPConfigurationResponse(Objects.requireNonNull(defaults));
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
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param privateIPAddress Private IP Address for this gateway.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(String privateIPAddress) {
            $.privateIPAddress = privateIPAddress;
            return this;
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            $.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the virtual network gateway IP configuration resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param publicIPAddress The reference to the public IP resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIPAddress(@Nullable SubResourceResponse publicIPAddress) {
            $.publicIPAddress = publicIPAddress;
            return this;
        }

        /**
         * @param subnet The reference to the subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable SubResourceResponse subnet) {
            $.subnet = subnet;
            return this;
        }

        public VirtualNetworkGatewayIPConfigurationResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.privateIPAddress = Objects.requireNonNull($.privateIPAddress, "expected parameter 'privateIPAddress' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
