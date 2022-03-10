// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.SubnetResourceSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkResourceSettingsResponse {
    /**
     * Gets or sets the address prefixes for the virtual network.
     * 
     */
    private final @Nullable List<String> addressSpace;
    /**
     * Gets or sets DHCPOptions that contains an array of DNS servers available to VMs
     * deployed in the virtual network.
     * 
     */
    private final @Nullable List<String> dnsServers;
    /**
     * Gets or sets a value indicating whether gets or sets whether the
     * DDOS protection should be switched on.
     * 
     */
    private final @Nullable Boolean enableDdosProtection;
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/virtualNetworks'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets List of subnets in a VirtualNetwork.
     * 
     */
    private final @Nullable List<SubnetResourceSettingsResponse> subnets;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;

    @OutputCustomType.Constructor
    private VirtualNetworkResourceSettingsResponse(
        @OutputCustomType.Parameter("addressSpace") @Nullable List<String> addressSpace,
        @OutputCustomType.Parameter("dnsServers") @Nullable List<String> dnsServers,
        @OutputCustomType.Parameter("enableDdosProtection") @Nullable Boolean enableDdosProtection,
        @OutputCustomType.Parameter("resourceType") String resourceType,
        @OutputCustomType.Parameter("subnets") @Nullable List<SubnetResourceSettingsResponse> subnets,
        @OutputCustomType.Parameter("targetResourceName") String targetResourceName) {
        this.addressSpace = addressSpace;
        this.dnsServers = dnsServers;
        this.enableDdosProtection = enableDdosProtection;
        this.resourceType = resourceType;
        this.subnets = subnets;
        this.targetResourceName = targetResourceName;
    }

    /**
     * Gets or sets the address prefixes for the virtual network.
     * 
    */
    public List<String> getAddressSpace() {
        return this.addressSpace == null ? List.of() : this.addressSpace;
    }
    /**
     * Gets or sets DHCPOptions that contains an array of DNS servers available to VMs
     * deployed in the virtual network.
     * 
    */
    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * Gets or sets a value indicating whether gets or sets whether the
     * DDOS protection should be switched on.
     * 
    */
    public Optional<Boolean> getEnableDdosProtection() {
        return Optional.ofNullable(this.enableDdosProtection);
    }
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/virtualNetworks'.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets List of subnets in a VirtualNetwork.
     * 
    */
    public List<SubnetResourceSettingsResponse> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * Gets or sets the target Resource name.
     * 
    */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressSpace;
        private @Nullable List<String> dnsServers;
        private @Nullable Boolean enableDdosProtection;
        private String resourceType;
        private @Nullable List<SubnetResourceSettingsResponse> subnets;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.dnsServers = defaults.dnsServers;
    	      this.enableDdosProtection = defaults.enableDdosProtection;
    	      this.resourceType = defaults.resourceType;
    	      this.subnets = defaults.subnets;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder addressSpace(@Nullable List<String> addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder enableDdosProtection(@Nullable Boolean enableDdosProtection) {
            this.enableDdosProtection = enableDdosProtection;
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder subnets(@Nullable List<SubnetResourceSettingsResponse> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public VirtualNetworkResourceSettingsResponse build() {
            return new VirtualNetworkResourceSettingsResponse(addressSpace, dnsServers, enableDdosProtection, resourceType, subnets, targetResourceName);
        }
    }
}
