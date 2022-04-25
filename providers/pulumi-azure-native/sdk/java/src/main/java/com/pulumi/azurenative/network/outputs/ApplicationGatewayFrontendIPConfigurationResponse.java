// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayFrontendIPConfigurationResponse {
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Name of the frontend IP configuration that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * @return PrivateIPAddress of the network interface IP Configuration.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * @return The private IP address allocation method.
     * 
     */
    private final @Nullable String privateIPAllocationMethod;
    /**
     * @return Reference to the application gateway private link configuration.
     * 
     */
    private final @Nullable SubResourceResponse privateLinkConfiguration;
    /**
     * @return The provisioning state of the frontend IP configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Reference to the PublicIP resource.
     * 
     */
    private final @Nullable SubResourceResponse publicIPAddress;
    /**
     * @return Reference to the subnet resource.
     * 
     */
    private final @Nullable SubResourceResponse subnet;
    /**
     * @return Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ApplicationGatewayFrontendIPConfigurationResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("privateIPAddress") @Nullable String privateIPAddress,
        @CustomType.Parameter("privateIPAllocationMethod") @Nullable String privateIPAllocationMethod,
        @CustomType.Parameter("privateLinkConfiguration") @Nullable SubResourceResponse privateLinkConfiguration,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIPAddress") @Nullable SubResourceResponse publicIPAddress,
        @CustomType.Parameter("subnet") @Nullable SubResourceResponse subnet,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.privateLinkConfiguration = privateLinkConfiguration;
        this.provisioningState = provisioningState;
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
        this.type = type;
    }

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the frontend IP configuration that is unique within an Application Gateway.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return PrivateIPAddress of the network interface IP Configuration.
     * 
     */
    public Optional<String> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * @return The private IP address allocation method.
     * 
     */
    public Optional<String> privateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    /**
     * @return Reference to the application gateway private link configuration.
     * 
     */
    public Optional<SubResourceResponse> privateLinkConfiguration() {
        return Optional.ofNullable(this.privateLinkConfiguration);
    }
    /**
     * @return The provisioning state of the frontend IP configuration resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Reference to the PublicIP resource.
     * 
     */
    public Optional<SubResourceResponse> publicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }
    /**
     * @return Reference to the subnet resource.
     * 
     */
    public Optional<SubResourceResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * @return Type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAllocationMethod;
        private @Nullable SubResourceResponse privateLinkConfiguration;
        private String provisioningState;
        private @Nullable SubResourceResponse publicIPAddress;
        private @Nullable SubResourceResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFrontendIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.privateLinkConfiguration = defaults.privateLinkConfiguration;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }
        public Builder privateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }
        public Builder privateLinkConfiguration(@Nullable SubResourceResponse privateLinkConfiguration) {
            this.privateLinkConfiguration = privateLinkConfiguration;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicIPAddress(@Nullable SubResourceResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }
        public Builder subnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ApplicationGatewayFrontendIPConfigurationResponse build() {
            return new ApplicationGatewayFrontendIPConfigurationResponse(etag, id, name, privateIPAddress, privateIPAllocationMethod, privateLinkConfiguration, provisioningState, publicIPAddress, subnet, type);
        }
    }
}
