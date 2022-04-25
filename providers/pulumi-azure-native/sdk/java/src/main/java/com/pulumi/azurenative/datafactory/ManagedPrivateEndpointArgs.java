// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedPrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedPrivateEndpointArgs Empty = new ManagedPrivateEndpointArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private Output<String> factoryName;

    /**
     * @return The factory name.
     * 
     */
    public Output<String> factoryName() {
        return this.factoryName;
    }

    /**
     * Managed private endpoint name
     * 
     */
    @Import(name="managedPrivateEndpointName")
    private @Nullable Output<String> managedPrivateEndpointName;

    /**
     * @return Managed private endpoint name
     * 
     */
    public Optional<Output<String>> managedPrivateEndpointName() {
        return Optional.ofNullable(this.managedPrivateEndpointName);
    }

    /**
     * Managed virtual network name
     * 
     */
    @Import(name="managedVirtualNetworkName", required=true)
    private Output<String> managedVirtualNetworkName;

    /**
     * @return Managed virtual network name
     * 
     */
    public Output<String> managedVirtualNetworkName() {
        return this.managedVirtualNetworkName;
    }

    /**
     * Managed private endpoint properties.
     * 
     */
    @Import(name="properties", required=true)
    private Output<com.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> properties;

    /**
     * @return Managed private endpoint properties.
     * 
     */
    public Output<com.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> properties() {
        return this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ManagedPrivateEndpointArgs() {}

    private ManagedPrivateEndpointArgs(ManagedPrivateEndpointArgs $) {
        this.factoryName = $.factoryName;
        this.managedPrivateEndpointName = $.managedPrivateEndpointName;
        this.managedVirtualNetworkName = $.managedVirtualNetworkName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedPrivateEndpointArgs $;

        public Builder() {
            $ = new ManagedPrivateEndpointArgs();
        }

        public Builder(ManagedPrivateEndpointArgs defaults) {
            $ = new ManagedPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(Output<String> factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            return factoryName(Output.of(factoryName));
        }

        /**
         * @param managedPrivateEndpointName Managed private endpoint name
         * 
         * @return builder
         * 
         */
        public Builder managedPrivateEndpointName(@Nullable Output<String> managedPrivateEndpointName) {
            $.managedPrivateEndpointName = managedPrivateEndpointName;
            return this;
        }

        /**
         * @param managedPrivateEndpointName Managed private endpoint name
         * 
         * @return builder
         * 
         */
        public Builder managedPrivateEndpointName(String managedPrivateEndpointName) {
            return managedPrivateEndpointName(Output.of(managedPrivateEndpointName));
        }

        /**
         * @param managedVirtualNetworkName Managed virtual network name
         * 
         * @return builder
         * 
         */
        public Builder managedVirtualNetworkName(Output<String> managedVirtualNetworkName) {
            $.managedVirtualNetworkName = managedVirtualNetworkName;
            return this;
        }

        /**
         * @param managedVirtualNetworkName Managed virtual network name
         * 
         * @return builder
         * 
         */
        public Builder managedVirtualNetworkName(String managedVirtualNetworkName) {
            return managedVirtualNetworkName(Output.of(managedVirtualNetworkName));
        }

        /**
         * @param properties Managed private endpoint properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<com.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Managed private endpoint properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(com.pulumi.azurenative.datafactory.inputs.ManagedPrivateEndpointArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ManagedPrivateEndpointArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.managedVirtualNetworkName = Objects.requireNonNull($.managedVirtualNetworkName, "expected parameter 'managedVirtualNetworkName' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
