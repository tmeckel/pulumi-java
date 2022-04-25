// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.enums.ProvisioningState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayApiEntityTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayApiEntityTagArgs Empty = new GatewayApiEntityTagArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    /**
     * @return API identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

    /**
     * Provisioning state.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<ProvisioningState> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Optional<Output<ProvisioningState>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GatewayApiEntityTagArgs() {}

    private GatewayApiEntityTagArgs(GatewayApiEntityTagArgs $) {
        this.apiId = $.apiId;
        this.gatewayId = $.gatewayId;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayApiEntityTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayApiEntityTagArgs $;

        public Builder() {
            $ = new GatewayApiEntityTagArgs();
        }

        public Builder(GatewayApiEntityTagArgs defaults) {
            $ = new GatewayApiEntityTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param provisioningState Provisioning state.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<ProvisioningState> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState Provisioning state.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(ProvisioningState provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GatewayApiEntityTagArgs build() {
            $.gatewayId = Objects.requireNonNull($.gatewayId, "expected parameter 'gatewayId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
