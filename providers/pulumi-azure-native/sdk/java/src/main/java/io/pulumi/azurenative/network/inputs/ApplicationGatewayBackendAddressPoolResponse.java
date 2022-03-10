// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayBackendAddressResponse;
import io.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backend Address Pool of an application gateway.
 * 
 */
public final class ApplicationGatewayBackendAddressPoolResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayBackendAddressPoolResponse Empty = new ApplicationGatewayBackendAddressPoolResponse();

    /**
     * Backend addresses.
     * 
     */
    @InputImport(name="backendAddresses")
      private final @Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses;

    public List<ApplicationGatewayBackendAddressResponse> getBackendAddresses() {
        return this.backendAddresses == null ? List.of() : this.backendAddresses;
    }

    /**
     * Collection of references to IPs defined in network interfaces.
     * 
     */
    @InputImport(name="backendIPConfigurations", required=true)
      private final List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations;

    public List<NetworkInterfaceIPConfigurationResponse> getBackendIPConfigurations() {
        return this.backendIPConfigurations;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the backend address pool that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the backend address pool resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicationGatewayBackendAddressPoolResponse(
        @Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses,
        List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.backendAddresses = backendAddresses;
        this.backendIPConfigurations = Objects.requireNonNull(backendIPConfigurations, "expected parameter 'backendIPConfigurations' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewayBackendAddressPoolResponse() {
        this.backendAddresses = List.of();
        this.backendIPConfigurations = List.of();
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendAddressPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses;
        private List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendAddressPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddresses = defaults.backendAddresses;
    	      this.backendIPConfigurations = defaults.backendIPConfigurations;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder backendAddresses(@Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses) {
            this.backendAddresses = backendAddresses;
            return this;
        }

        public Builder backendIPConfigurations(List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations) {
            this.backendIPConfigurations = Objects.requireNonNull(backendIPConfigurations);
            return this;
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

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayBackendAddressPoolResponse build() {
            return new ApplicationGatewayBackendAddressPoolResponse(backendAddresses, backendIPConfigurations, etag, id, name, provisioningState, type);
        }
    }
}
