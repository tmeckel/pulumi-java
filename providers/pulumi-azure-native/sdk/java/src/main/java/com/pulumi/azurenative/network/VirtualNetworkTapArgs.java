// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.FrontendIPConfigurationArgs;
import com.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkTapArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkTapArgs Empty = new VirtualNetworkTapArgs();

    /**
     * The reference to the private IP address on the internal Load Balancer that will receive the tap.
     * 
     */
    @Import(name="destinationLoadBalancerFrontEndIPConfiguration")
    private @Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration;

    /**
     * @return The reference to the private IP address on the internal Load Balancer that will receive the tap.
     * 
     */
    public Optional<Output<FrontendIPConfigurationArgs>> destinationLoadBalancerFrontEndIPConfiguration() {
        return Optional.ofNullable(this.destinationLoadBalancerFrontEndIPConfiguration);
    }

    /**
     * The reference to the private IP Address of the collector nic that will receive the tap.
     * 
     */
    @Import(name="destinationNetworkInterfaceIPConfiguration")
    private @Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration;

    /**
     * @return The reference to the private IP Address of the collector nic that will receive the tap.
     * 
     */
    public Optional<Output<NetworkInterfaceIPConfigurationArgs>> destinationNetworkInterfaceIPConfiguration() {
        return Optional.ofNullable(this.destinationNetworkInterfaceIPConfiguration);
    }

    /**
     * The VXLAN destination port that will receive the tapped traffic.
     * 
     */
    @Import(name="destinationPort")
    private @Nullable Output<Integer> destinationPort;

    /**
     * @return The VXLAN destination port that will receive the tapped traffic.
     * 
     */
    public Optional<Output<Integer>> destinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the virtual network tap.
     * 
     */
    @Import(name="tapName")
    private @Nullable Output<String> tapName;

    /**
     * @return The name of the virtual network tap.
     * 
     */
    public Optional<Output<String>> tapName() {
        return Optional.ofNullable(this.tapName);
    }

    private VirtualNetworkTapArgs() {}

    private VirtualNetworkTapArgs(VirtualNetworkTapArgs $) {
        this.destinationLoadBalancerFrontEndIPConfiguration = $.destinationLoadBalancerFrontEndIPConfiguration;
        this.destinationNetworkInterfaceIPConfiguration = $.destinationNetworkInterfaceIPConfiguration;
        this.destinationPort = $.destinationPort;
        this.id = $.id;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.tapName = $.tapName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkTapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkTapArgs $;

        public Builder() {
            $ = new VirtualNetworkTapArgs();
        }

        public Builder(VirtualNetworkTapArgs defaults) {
            $ = new VirtualNetworkTapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationLoadBalancerFrontEndIPConfiguration The reference to the private IP address on the internal Load Balancer that will receive the tap.
         * 
         * @return builder
         * 
         */
        public Builder destinationLoadBalancerFrontEndIPConfiguration(@Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration) {
            $.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
            return this;
        }

        /**
         * @param destinationLoadBalancerFrontEndIPConfiguration The reference to the private IP address on the internal Load Balancer that will receive the tap.
         * 
         * @return builder
         * 
         */
        public Builder destinationLoadBalancerFrontEndIPConfiguration(FrontendIPConfigurationArgs destinationLoadBalancerFrontEndIPConfiguration) {
            return destinationLoadBalancerFrontEndIPConfiguration(Output.of(destinationLoadBalancerFrontEndIPConfiguration));
        }

        /**
         * @param destinationNetworkInterfaceIPConfiguration The reference to the private IP Address of the collector nic that will receive the tap.
         * 
         * @return builder
         * 
         */
        public Builder destinationNetworkInterfaceIPConfiguration(@Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration) {
            $.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
            return this;
        }

        /**
         * @param destinationNetworkInterfaceIPConfiguration The reference to the private IP Address of the collector nic that will receive the tap.
         * 
         * @return builder
         * 
         */
        public Builder destinationNetworkInterfaceIPConfiguration(NetworkInterfaceIPConfigurationArgs destinationNetworkInterfaceIPConfiguration) {
            return destinationNetworkInterfaceIPConfiguration(Output.of(destinationNetworkInterfaceIPConfiguration));
        }

        /**
         * @param destinationPort The VXLAN destination port that will receive the tapped traffic.
         * 
         * @return builder
         * 
         */
        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            $.destinationPort = destinationPort;
            return this;
        }

        /**
         * @param destinationPort The VXLAN destination port that will receive the tapped traffic.
         * 
         * @return builder
         * 
         */
        public Builder destinationPort(Integer destinationPort) {
            return destinationPort(Output.of(destinationPort));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
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
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tapName The name of the virtual network tap.
         * 
         * @return builder
         * 
         */
        public Builder tapName(@Nullable Output<String> tapName) {
            $.tapName = tapName;
            return this;
        }

        /**
         * @param tapName The name of the virtual network tap.
         * 
         * @return builder
         * 
         */
        public Builder tapName(String tapName) {
            return tapName(Output.of(tapName));
        }

        public VirtualNetworkTapArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
