// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.SubnetReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines load balancer frontend IP configuration properties.
 * 
 */
public final class LBFrontendIPConfigurationResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LBFrontendIPConfigurationResourceSettingsArgs Empty = new LBFrontendIPConfigurationResourceSettingsArgs();

    /**
     * Gets or sets the frontend IP configuration name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Gets or sets the IP address of the Load Balancer.This is only specified if a specific
     * private IP address shall be allocated from the subnet specified in subnetRef.
     * 
     */
    @InputImport(name="privateIpAddress")
      private final @Nullable Input<String> privateIpAddress;

    public Input<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Input.empty() : this.privateIpAddress;
    }

    /**
     * Gets or sets PrivateIP allocation method (Static/Dynamic).
     * 
     */
    @InputImport(name="privateIpAllocationMethod")
      private final @Nullable Input<String> privateIpAllocationMethod;

    public Input<String> getPrivateIpAllocationMethod() {
        return this.privateIpAllocationMethod == null ? Input.empty() : this.privateIpAllocationMethod;
    }

    /**
     * Defines reference to subnet.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<SubnetReferenceArgs> subnet;

    public Input<SubnetReferenceArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * Gets or sets the csv list of zones.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<String> zones;

    public Input<String> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public LBFrontendIPConfigurationResourceSettingsArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> privateIpAddress,
        @Nullable Input<String> privateIpAllocationMethod,
        @Nullable Input<SubnetReferenceArgs> subnet,
        @Nullable Input<String> zones) {
        this.name = name;
        this.privateIpAddress = privateIpAddress;
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        this.subnet = subnet;
        this.zones = zones;
    }

    private LBFrontendIPConfigurationResourceSettingsArgs() {
        this.name = Input.empty();
        this.privateIpAddress = Input.empty();
        this.privateIpAllocationMethod = Input.empty();
        this.subnet = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LBFrontendIPConfigurationResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> privateIpAddress;
        private @Nullable Input<String> privateIpAllocationMethod;
        private @Nullable Input<SubnetReferenceArgs> subnet;
        private @Nullable Input<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(LBFrontendIPConfigurationResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAllocationMethod = defaults.privateIpAllocationMethod;
    	      this.subnet = defaults.subnet;
    	      this.zones = defaults.zones;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder privateIpAddress(@Nullable Input<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Input.ofNullable(privateIpAddress);
            return this;
        }

        public Builder privateIpAllocationMethod(@Nullable Input<String> privateIpAllocationMethod) {
            this.privateIpAllocationMethod = privateIpAllocationMethod;
            return this;
        }

        public Builder privateIpAllocationMethod(@Nullable String privateIpAllocationMethod) {
            this.privateIpAllocationMethod = Input.ofNullable(privateIpAllocationMethod);
            return this;
        }

        public Builder subnet(@Nullable Input<SubnetReferenceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable SubnetReferenceArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder zones(@Nullable Input<String> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable String zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public LBFrontendIPConfigurationResourceSettingsArgs build() {
            return new LBFrontendIPConfigurationResourceSettingsArgs(name, privateIpAddress, privateIpAllocationMethod, subnet, zones);
        }
    }
}
