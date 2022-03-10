// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.azurenative.hybridnetwork.outputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInterfaceResponse {
    /**
     * A list of IP configurations of the network interface.
     * 
     */
    private final @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations;
    /**
     * The MAC address of the network interface.
     * 
     */
    private final @Nullable String macAddress;
    /**
     * The name of the network interface.
     * 
     */
    private final @Nullable String networkInterfaceName;
    /**
     * The type of the VM switch.
     * 
     */
    private final @Nullable String vmSwitchType;

    @OutputCustomType.Constructor
    private NetworkInterfaceResponse(
        @OutputCustomType.Parameter("ipConfigurations") @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations,
        @OutputCustomType.Parameter("macAddress") @Nullable String macAddress,
        @OutputCustomType.Parameter("networkInterfaceName") @Nullable String networkInterfaceName,
        @OutputCustomType.Parameter("vmSwitchType") @Nullable String vmSwitchType) {
        this.ipConfigurations = ipConfigurations;
        this.macAddress = macAddress;
        this.networkInterfaceName = networkInterfaceName;
        this.vmSwitchType = vmSwitchType;
    }

    /**
     * A list of IP configurations of the network interface.
     * 
    */
    public List<NetworkInterfaceIPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * The MAC address of the network interface.
     * 
    */
    public Optional<String> getMacAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    /**
     * The name of the network interface.
     * 
    */
    public Optional<String> getNetworkInterfaceName() {
        return Optional.ofNullable(this.networkInterfaceName);
    }
    /**
     * The type of the VM switch.
     * 
    */
    public Optional<String> getVmSwitchType() {
        return Optional.ofNullable(this.vmSwitchType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations;
        private @Nullable String macAddress;
        private @Nullable String networkInterfaceName;
        private @Nullable String vmSwitchType;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.macAddress = defaults.macAddress;
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.vmSwitchType = defaults.vmSwitchType;
        }

        public Builder ipConfigurations(@Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder macAddress(@Nullable String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        public Builder networkInterfaceName(@Nullable String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        public Builder vmSwitchType(@Nullable String vmSwitchType) {
            this.vmSwitchType = vmSwitchType;
            return this;
        }
        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(ipConfigurations, macAddress, networkInterfaceName, vmSwitchType);
        }
    }
}
