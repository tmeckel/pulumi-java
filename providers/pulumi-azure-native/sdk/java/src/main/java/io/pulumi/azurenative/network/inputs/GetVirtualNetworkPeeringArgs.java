// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkPeeringArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkPeeringArgs Empty = new GetVirtualNetworkPeeringArgs();

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual network.
     * 
     */
    @InputImport(name="virtualNetworkName", required=true)
      private final String virtualNetworkName;

    public String getVirtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     * The name of the virtual network peering.
     * 
     */
    @InputImport(name="virtualNetworkPeeringName", required=true)
      private final String virtualNetworkPeeringName;

    public String getVirtualNetworkPeeringName() {
        return this.virtualNetworkPeeringName;
    }

    public GetVirtualNetworkPeeringArgs(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
        this.virtualNetworkPeeringName = Objects.requireNonNull(virtualNetworkPeeringName, "expected parameter 'virtualNetworkPeeringName' to be non-null");
    }

    private GetVirtualNetworkPeeringArgs() {
        this.resourceGroupName = null;
        this.virtualNetworkName = null;
        this.virtualNetworkPeeringName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String virtualNetworkName;
        private String virtualNetworkPeeringName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
    	      this.virtualNetworkPeeringName = defaults.virtualNetworkPeeringName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder virtualNetworkName(String virtualNetworkName) {
            this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName);
            return this;
        }

        public Builder virtualNetworkPeeringName(String virtualNetworkPeeringName) {
            this.virtualNetworkPeeringName = Objects.requireNonNull(virtualNetworkPeeringName);
            return this;
        }
        public GetVirtualNetworkPeeringArgs build() {
            return new GetVirtualNetworkPeeringArgs(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
        }
    }
}
