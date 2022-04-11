// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.ProvisioningState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayApiEntityTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayApiEntityTagArgs Empty = new GatewayApiEntityTagArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId")
      private final @Nullable Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId == null ? Codegen.empty() : this.apiId;
    }

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * 
     */
    @Import(name="gatewayId", required=true)
      private final Output<String> gatewayId;

    public Output<String> getGatewayId() {
        return this.gatewayId;
    }

    /**
     * Provisioning state.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<ProvisioningState> provisioningState;

    public Output<ProvisioningState> getProvisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
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

    public GatewayApiEntityTagArgs(
        @Nullable Output<String> apiId,
        Output<String> gatewayId,
        @Nullable Output<ProvisioningState> provisioningState,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.apiId = apiId;
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayApiEntityTagArgs() {
        this.apiId = Codegen.empty();
        this.gatewayId = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayApiEntityTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiId;
        private Output<String> gatewayId;
        private @Nullable Output<ProvisioningState> provisioningState;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayApiEntityTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder apiId(@Nullable Output<String> apiId) {
            this.apiId = apiId;
            return this;
        }
        public Builder apiId(@Nullable String apiId) {
            this.apiId = Codegen.ofNullable(apiId);
            return this;
        }
        public Builder gatewayId(Output<String> gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Output.of(Objects.requireNonNull(gatewayId));
            return this;
        }
        public Builder provisioningState(@Nullable Output<ProvisioningState> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable ProvisioningState provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
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
        }        public GatewayApiEntityTagArgs build() {
            return new GatewayApiEntityTagArgs(apiId, gatewayId, provisioningState, resourceGroupName, serviceName);
        }
    }
}
