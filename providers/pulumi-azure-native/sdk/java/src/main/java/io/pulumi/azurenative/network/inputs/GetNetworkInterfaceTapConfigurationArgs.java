// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkInterfaceTapConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfaceTapConfigurationArgs Empty = new GetNetworkInterfaceTapConfigurationArgs();

    /**
     * The name of the network interface.
     * 
     */
    @InputImport(name="networkInterfaceName", required=true)
      private final String networkInterfaceName;

    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

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
     * The name of the tap configuration.
     * 
     */
    @InputImport(name="tapConfigurationName", required=true)
      private final String tapConfigurationName;

    public String getTapConfigurationName() {
        return this.tapConfigurationName;
    }

    public GetNetworkInterfaceTapConfigurationArgs(
        String networkInterfaceName,
        String resourceGroupName,
        String tapConfigurationName) {
        this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName, "expected parameter 'networkInterfaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tapConfigurationName = Objects.requireNonNull(tapConfigurationName, "expected parameter 'tapConfigurationName' to be non-null");
    }

    private GetNetworkInterfaceTapConfigurationArgs() {
        this.networkInterfaceName = null;
        this.resourceGroupName = null;
        this.tapConfigurationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceTapConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkInterfaceName;
        private String resourceGroupName;
        private String tapConfigurationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceTapConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tapConfigurationName = defaults.tapConfigurationName;
        }

        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder tapConfigurationName(String tapConfigurationName) {
            this.tapConfigurationName = Objects.requireNonNull(tapConfigurationName);
            return this;
        }
        public GetNetworkInterfaceTapConfigurationArgs build() {
            return new GetNetworkInterfaceTapConfigurationArgs(networkInterfaceName, resourceGroupName, tapConfigurationName);
        }
    }
}
