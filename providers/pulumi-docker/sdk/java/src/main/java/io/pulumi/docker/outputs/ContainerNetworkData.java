// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerNetworkData {
    /**
     * @Deprecated
     * Use `network_data` instead. The network gateway of the container as read from its NetworkSettings.
     * 
     */
        @Deprecated /* Use `network_data` instead. The network gateway of the container as read from its NetworkSettings. */
    private final @Nullable String gateway;
    private final @Nullable String globalIpv6Address;
    private final @Nullable Integer globalIpv6PrefixLength;
    /**
     * @Deprecated
     * Use `network_data` instead. The IP address of the container's first network it.
     * 
     */
        @Deprecated /* Use `network_data` instead. The IP address of the container's first network it. */
    private final @Nullable String ipAddress;
    /**
     * @Deprecated
     * Use `network_data` instead. The IP prefix length of the container as read from its NetworkSettings.
     * 
     */
        @Deprecated /* Use `network_data` instead. The IP prefix length of the container as read from its NetworkSettings. */
    private final @Nullable Integer ipPrefixLength;
    private final @Nullable String ipv6Gateway;
    private final @Nullable String networkName;

    @OutputCustomType.Constructor
    private ContainerNetworkData(
        @OutputCustomType.Parameter("gateway") @Nullable String gateway,
        @OutputCustomType.Parameter("globalIpv6Address") @Nullable String globalIpv6Address,
        @OutputCustomType.Parameter("globalIpv6PrefixLength") @Nullable Integer globalIpv6PrefixLength,
        @OutputCustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @OutputCustomType.Parameter("ipPrefixLength") @Nullable Integer ipPrefixLength,
        @OutputCustomType.Parameter("ipv6Gateway") @Nullable String ipv6Gateway,
        @OutputCustomType.Parameter("networkName") @Nullable String networkName) {
        this.gateway = gateway;
        this.globalIpv6Address = globalIpv6Address;
        this.globalIpv6PrefixLength = globalIpv6PrefixLength;
        this.ipAddress = ipAddress;
        this.ipPrefixLength = ipPrefixLength;
        this.ipv6Gateway = ipv6Gateway;
        this.networkName = networkName;
    }

    /**
     * @Deprecated
     * Use `network_data` instead. The network gateway of the container as read from its NetworkSettings.
     * 
    */
    @Deprecated /* Use `network_data` instead. The network gateway of the container as read from its NetworkSettings. */
    public Optional<String> getGateway() {
        return Optional.ofNullable(this.gateway);
    }
    public Optional<String> getGlobalIpv6Address() {
        return Optional.ofNullable(this.globalIpv6Address);
    }
    public Optional<Integer> getGlobalIpv6PrefixLength() {
        return Optional.ofNullable(this.globalIpv6PrefixLength);
    }
    /**
     * @Deprecated
     * Use `network_data` instead. The IP address of the container's first network it.
     * 
    */
    @Deprecated /* Use `network_data` instead. The IP address of the container's first network it. */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @Deprecated
     * Use `network_data` instead. The IP prefix length of the container as read from its NetworkSettings.
     * 
    */
    @Deprecated /* Use `network_data` instead. The IP prefix length of the container as read from its NetworkSettings. */
    public Optional<Integer> getIpPrefixLength() {
        return Optional.ofNullable(this.ipPrefixLength);
    }
    public Optional<String> getIpv6Gateway() {
        return Optional.ofNullable(this.ipv6Gateway);
    }
    public Optional<String> getNetworkName() {
        return Optional.ofNullable(this.networkName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworkData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gateway;
        private @Nullable String globalIpv6Address;
        private @Nullable Integer globalIpv6PrefixLength;
        private @Nullable String ipAddress;
        private @Nullable Integer ipPrefixLength;
        private @Nullable String ipv6Gateway;
        private @Nullable String networkName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworkData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gateway = defaults.gateway;
    	      this.globalIpv6Address = defaults.globalIpv6Address;
    	      this.globalIpv6PrefixLength = defaults.globalIpv6PrefixLength;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipPrefixLength = defaults.ipPrefixLength;
    	      this.ipv6Gateway = defaults.ipv6Gateway;
    	      this.networkName = defaults.networkName;
        }

        public Builder setGateway(@Nullable String gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder setGlobalIpv6Address(@Nullable String globalIpv6Address) {
            this.globalIpv6Address = globalIpv6Address;
            return this;
        }

        public Builder setGlobalIpv6PrefixLength(@Nullable Integer globalIpv6PrefixLength) {
            this.globalIpv6PrefixLength = globalIpv6PrefixLength;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpPrefixLength(@Nullable Integer ipPrefixLength) {
            this.ipPrefixLength = ipPrefixLength;
            return this;
        }

        public Builder setIpv6Gateway(@Nullable String ipv6Gateway) {
            this.ipv6Gateway = ipv6Gateway;
            return this;
        }

        public Builder setNetworkName(@Nullable String networkName) {
            this.networkName = networkName;
            return this;
        }
        public ContainerNetworkData build() {
            return new ContainerNetworkData(gateway, globalIpv6Address, globalIpv6PrefixLength, ipAddress, ipPrefixLength, ipv6Gateway, networkName);
        }
    }
}
