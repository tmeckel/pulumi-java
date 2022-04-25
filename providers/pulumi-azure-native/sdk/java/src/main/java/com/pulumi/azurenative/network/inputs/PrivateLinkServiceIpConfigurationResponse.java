// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubnetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private link service ip configuration.
 * 
 */
public final class PrivateLinkServiceIpConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceIpConfigurationResponse Empty = new PrivateLinkServiceIpConfigurationResponse();

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
     * The name of private link service ip configuration.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of private link service ip configuration.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether the ip configuration is primary or not.
     * 
     */
    @Import(name="primary")
    private @Nullable Boolean primary;

    /**
     * @return Whether the ip configuration is primary or not.
     * 
     */
    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * The private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIPAddress")
    private @Nullable String privateIPAddress;

    /**
     * @return The private IP address of the IP configuration.
     * 
     */
    public Optional<String> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
     */
    @Import(name="privateIPAddressVersion")
    private @Nullable String privateIPAddressVersion;

    /**
     * @return Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
     */
    public Optional<String> privateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
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
     * The provisioning state of the private link service IP configuration resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the private link service IP configuration resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @Import(name="subnet")
    private @Nullable SubnetResponse subnet;

    /**
     * @return The reference to the subnet resource.
     * 
     */
    public Optional<SubnetResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    private PrivateLinkServiceIpConfigurationResponse() {}

    private PrivateLinkServiceIpConfigurationResponse(PrivateLinkServiceIpConfigurationResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.primary = $.primary;
        this.privateIPAddress = $.privateIPAddress;
        this.privateIPAddressVersion = $.privateIPAddressVersion;
        this.privateIPAllocationMethod = $.privateIPAllocationMethod;
        this.provisioningState = $.provisioningState;
        this.subnet = $.subnet;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceIpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceIpConfigurationResponse $;

        public Builder() {
            $ = new PrivateLinkServiceIpConfigurationResponse();
        }

        public Builder(PrivateLinkServiceIpConfigurationResponse defaults) {
            $ = new PrivateLinkServiceIpConfigurationResponse(Objects.requireNonNull(defaults));
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
         * @param name The name of private link service ip configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param primary Whether the ip configuration is primary or not.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Boolean primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param privateIPAddress The private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            $.privateIPAddress = privateIPAddress;
            return this;
        }

        /**
         * @param privateIPAddressVersion Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            $.privateIPAddressVersion = privateIPAddressVersion;
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
         * @param provisioningState The provisioning state of the private link service IP configuration resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param subnet The reference to the subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable SubnetResponse subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param type The resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public PrivateLinkServiceIpConfigurationResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
