// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.CustomDnsConfigPropertiesFormatArgs;
import com.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionArgs;
import com.pulumi.azurenative.network.inputs.SubnetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * An array of custom dns configurations.
     * 
     */
    @Import(name="customDnsConfigs")
    private @Nullable Output<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs;

    /**
     * @return An array of custom dns configurations.
     * 
     */
    public Optional<Output<List<CustomDnsConfigPropertiesFormatArgs>>> customDnsConfigs() {
        return Optional.ofNullable(this.customDnsConfigs);
    }

    /**
     * The extended location of the load balancer.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return The extended location of the load balancer.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
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
     * A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
     */
    @Import(name="manualPrivateLinkServiceConnections")
    private @Nullable Output<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections;

    /**
     * @return A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
     */
    public Optional<Output<List<PrivateLinkServiceConnectionArgs>>> manualPrivateLinkServiceConnections() {
        return Optional.ofNullable(this.manualPrivateLinkServiceConnections);
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName")
    private @Nullable Output<String> privateEndpointName;

    /**
     * @return The name of the private endpoint.
     * 
     */
    public Optional<Output<String>> privateEndpointName() {
        return Optional.ofNullable(this.privateEndpointName);
    }

    /**
     * A grouping of information about the connection to the remote resource.
     * 
     */
    @Import(name="privateLinkServiceConnections")
    private @Nullable Output<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections;

    /**
     * @return A grouping of information about the connection to the remote resource.
     * 
     */
    public Optional<Output<List<PrivateLinkServiceConnectionArgs>>> privateLinkServiceConnections() {
        return Optional.ofNullable(this.privateLinkServiceConnections);
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
     * The ID of the subnet from which the private IP will be allocated.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<SubnetArgs> subnet;

    /**
     * @return The ID of the subnet from which the private IP will be allocated.
     * 
     */
    public Optional<Output<SubnetArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
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

    private PrivateEndpointArgs() {}

    private PrivateEndpointArgs(PrivateEndpointArgs $) {
        this.customDnsConfigs = $.customDnsConfigs;
        this.extendedLocation = $.extendedLocation;
        this.id = $.id;
        this.location = $.location;
        this.manualPrivateLinkServiceConnections = $.manualPrivateLinkServiceConnections;
        this.privateEndpointName = $.privateEndpointName;
        this.privateLinkServiceConnections = $.privateLinkServiceConnections;
        this.resourceGroupName = $.resourceGroupName;
        this.subnet = $.subnet;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointArgs $;

        public Builder() {
            $ = new PrivateEndpointArgs();
        }

        public Builder(PrivateEndpointArgs defaults) {
            $ = new PrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customDnsConfigs An array of custom dns configurations.
         * 
         * @return builder
         * 
         */
        public Builder customDnsConfigs(@Nullable Output<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs) {
            $.customDnsConfigs = customDnsConfigs;
            return this;
        }

        /**
         * @param customDnsConfigs An array of custom dns configurations.
         * 
         * @return builder
         * 
         */
        public Builder customDnsConfigs(List<CustomDnsConfigPropertiesFormatArgs> customDnsConfigs) {
            return customDnsConfigs(Output.of(customDnsConfigs));
        }

        /**
         * @param customDnsConfigs An array of custom dns configurations.
         * 
         * @return builder
         * 
         */
        public Builder customDnsConfigs(CustomDnsConfigPropertiesFormatArgs... customDnsConfigs) {
            return customDnsConfigs(List.of(customDnsConfigs));
        }

        /**
         * @param extendedLocation The extended location of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation The extended location of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
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
         * @param manualPrivateLinkServiceConnections A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
         * 
         * @return builder
         * 
         */
        public Builder manualPrivateLinkServiceConnections(@Nullable Output<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections) {
            $.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }

        /**
         * @param manualPrivateLinkServiceConnections A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
         * 
         * @return builder
         * 
         */
        public Builder manualPrivateLinkServiceConnections(List<PrivateLinkServiceConnectionArgs> manualPrivateLinkServiceConnections) {
            return manualPrivateLinkServiceConnections(Output.of(manualPrivateLinkServiceConnections));
        }

        /**
         * @param manualPrivateLinkServiceConnections A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
         * 
         * @return builder
         * 
         */
        public Builder manualPrivateLinkServiceConnections(PrivateLinkServiceConnectionArgs... manualPrivateLinkServiceConnections) {
            return manualPrivateLinkServiceConnections(List.of(manualPrivateLinkServiceConnections));
        }

        /**
         * @param privateEndpointName The name of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointName(@Nullable Output<String> privateEndpointName) {
            $.privateEndpointName = privateEndpointName;
            return this;
        }

        /**
         * @param privateEndpointName The name of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointName(String privateEndpointName) {
            return privateEndpointName(Output.of(privateEndpointName));
        }

        /**
         * @param privateLinkServiceConnections A grouping of information about the connection to the remote resource.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnections(@Nullable Output<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections) {
            $.privateLinkServiceConnections = privateLinkServiceConnections;
            return this;
        }

        /**
         * @param privateLinkServiceConnections A grouping of information about the connection to the remote resource.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnections(List<PrivateLinkServiceConnectionArgs> privateLinkServiceConnections) {
            return privateLinkServiceConnections(Output.of(privateLinkServiceConnections));
        }

        /**
         * @param privateLinkServiceConnections A grouping of information about the connection to the remote resource.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnections(PrivateLinkServiceConnectionArgs... privateLinkServiceConnections) {
            return privateLinkServiceConnections(List.of(privateLinkServiceConnections));
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
         * @param subnet The ID of the subnet from which the private IP will be allocated.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<SubnetArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The ID of the subnet from which the private IP will be allocated.
         * 
         * @return builder
         * 
         */
        public Builder subnet(SubnetArgs subnet) {
            return subnet(Output.of(subnet));
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

        public PrivateEndpointArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
