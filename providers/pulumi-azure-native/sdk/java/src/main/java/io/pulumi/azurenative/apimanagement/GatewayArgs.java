// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.inputs.ResourceLocationDataContractArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Gateway description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * 
     */
    @Import(name="gatewayId")
      private final @Nullable Output<String> gatewayId;

    public Output<String> getGatewayId() {
        return this.gatewayId == null ? Codegen.empty() : this.gatewayId;
    }

    /**
     * Gateway location.
     * 
     */
    @Import(name="locationData")
      private final @Nullable Output<ResourceLocationDataContractArgs> locationData;

    public Output<ResourceLocationDataContractArgs> getLocationData() {
        return this.locationData == null ? Codegen.empty() : this.locationData;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public GatewayArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> gatewayId,
        @Nullable Output<ResourceLocationDataContractArgs> locationData,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.description = description;
        this.gatewayId = gatewayId;
        this.locationData = locationData;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayArgs() {
        this.description = Codegen.empty();
        this.gatewayId = Codegen.empty();
        this.locationData = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> gatewayId;
        private @Nullable Output<ResourceLocationDataContractArgs> locationData;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.gatewayId = defaults.gatewayId;
    	      this.locationData = defaults.locationData;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = Codegen.ofNullable(gatewayId);
            return this;
        }
        public Builder locationData(@Nullable Output<ResourceLocationDataContractArgs> locationData) {
            this.locationData = locationData;
            return this;
        }
        public Builder locationData(@Nullable ResourceLocationDataContractArgs locationData) {
            this.locationData = Codegen.ofNullable(locationData);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public GatewayArgs build() {
            return new GatewayArgs(description, gatewayId, locationData, resourceGroupName, serviceName);
        }
    }
}
