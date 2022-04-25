// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.azurenative.network.inputs.VirtualHubRouteTableArgs;
import com.pulumi.azurenative.network.inputs.VirtualHubRouteTableV2Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHubArgs Empty = new VirtualHubArgs();

    /**
     * Address-prefix for this VirtualHub.
     * 
     */
    @Import(name="addressPrefix")
    private @Nullable Output<String> addressPrefix;

    /**
     * @return Address-prefix for this VirtualHub.
     * 
     */
    public Optional<Output<String>> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }

    /**
     * Flag to control transit for VirtualRouter hub.
     * 
     */
    @Import(name="allowBranchToBranchTraffic")
    private @Nullable Output<Boolean> allowBranchToBranchTraffic;

    /**
     * @return Flag to control transit for VirtualRouter hub.
     * 
     */
    public Optional<Output<Boolean>> allowBranchToBranchTraffic() {
        return Optional.ofNullable(this.allowBranchToBranchTraffic);
    }

    /**
     * The azureFirewall associated with this VirtualHub.
     * 
     */
    @Import(name="azureFirewall")
    private @Nullable Output<SubResourceArgs> azureFirewall;

    /**
     * @return The azureFirewall associated with this VirtualHub.
     * 
     */
    public Optional<Output<SubResourceArgs>> azureFirewall() {
        return Optional.ofNullable(this.azureFirewall);
    }

    /**
     * The expressRouteGateway associated with this VirtualHub.
     * 
     */
    @Import(name="expressRouteGateway")
    private @Nullable Output<SubResourceArgs> expressRouteGateway;

    /**
     * @return The expressRouteGateway associated with this VirtualHub.
     * 
     */
    public Optional<Output<SubResourceArgs>> expressRouteGateway() {
        return Optional.ofNullable(this.expressRouteGateway);
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
     * The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    @Import(name="p2SVpnGateway")
    private @Nullable Output<SubResourceArgs> p2SVpnGateway;

    /**
     * @return The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    public Optional<Output<SubResourceArgs>> p2SVpnGateway() {
        return Optional.ofNullable(this.p2SVpnGateway);
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name of the VirtualHub.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The routeTable associated with this virtual hub.
     * 
     */
    @Import(name="routeTable")
    private @Nullable Output<VirtualHubRouteTableArgs> routeTable;

    /**
     * @return The routeTable associated with this virtual hub.
     * 
     */
    public Optional<Output<VirtualHubRouteTableArgs>> routeTable() {
        return Optional.ofNullable(this.routeTable);
    }

    /**
     * The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    @Import(name="securityPartnerProvider")
    private @Nullable Output<SubResourceArgs> securityPartnerProvider;

    /**
     * @return The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    public Optional<Output<SubResourceArgs>> securityPartnerProvider() {
        return Optional.ofNullable(this.securityPartnerProvider);
    }

    /**
     * The Security Provider name.
     * 
     */
    @Import(name="securityProviderName")
    private @Nullable Output<String> securityProviderName;

    /**
     * @return The Security Provider name.
     * 
     */
    public Optional<Output<String>> securityProviderName() {
        return Optional.ofNullable(this.securityProviderName);
    }

    /**
     * The sku of this VirtualHub.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return The sku of this VirtualHub.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
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
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName")
    private @Nullable Output<String> virtualHubName;

    /**
     * @return The name of the VirtualHub.
     * 
     */
    public Optional<Output<String>> virtualHubName() {
        return Optional.ofNullable(this.virtualHubName);
    }

    /**
     * List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    @Import(name="virtualHubRouteTableV2s")
    private @Nullable Output<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s;

    /**
     * @return List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    public Optional<Output<List<VirtualHubRouteTableV2Args>>> virtualHubRouteTableV2s() {
        return Optional.ofNullable(this.virtualHubRouteTableV2s);
    }

    /**
     * VirtualRouter ASN.
     * 
     */
    @Import(name="virtualRouterAsn")
    private @Nullable Output<Double> virtualRouterAsn;

    /**
     * @return VirtualRouter ASN.
     * 
     */
    public Optional<Output<Double>> virtualRouterAsn() {
        return Optional.ofNullable(this.virtualRouterAsn);
    }

    /**
     * VirtualRouter IPs.
     * 
     */
    @Import(name="virtualRouterIps")
    private @Nullable Output<List<String>> virtualRouterIps;

    /**
     * @return VirtualRouter IPs.
     * 
     */
    public Optional<Output<List<String>>> virtualRouterIps() {
        return Optional.ofNullable(this.virtualRouterIps);
    }

    /**
     * The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    @Import(name="virtualWan")
    private @Nullable Output<SubResourceArgs> virtualWan;

    /**
     * @return The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    public Optional<Output<SubResourceArgs>> virtualWan() {
        return Optional.ofNullable(this.virtualWan);
    }

    /**
     * The VpnGateway associated with this VirtualHub.
     * 
     */
    @Import(name="vpnGateway")
    private @Nullable Output<SubResourceArgs> vpnGateway;

    /**
     * @return The VpnGateway associated with this VirtualHub.
     * 
     */
    public Optional<Output<SubResourceArgs>> vpnGateway() {
        return Optional.ofNullable(this.vpnGateway);
    }

    private VirtualHubArgs() {}

    private VirtualHubArgs(VirtualHubArgs $) {
        this.addressPrefix = $.addressPrefix;
        this.allowBranchToBranchTraffic = $.allowBranchToBranchTraffic;
        this.azureFirewall = $.azureFirewall;
        this.expressRouteGateway = $.expressRouteGateway;
        this.id = $.id;
        this.location = $.location;
        this.p2SVpnGateway = $.p2SVpnGateway;
        this.resourceGroupName = $.resourceGroupName;
        this.routeTable = $.routeTable;
        this.securityPartnerProvider = $.securityPartnerProvider;
        this.securityProviderName = $.securityProviderName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.virtualHubName = $.virtualHubName;
        this.virtualHubRouteTableV2s = $.virtualHubRouteTableV2s;
        this.virtualRouterAsn = $.virtualRouterAsn;
        this.virtualRouterIps = $.virtualRouterIps;
        this.virtualWan = $.virtualWan;
        this.vpnGateway = $.vpnGateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubArgs $;

        public Builder() {
            $ = new VirtualHubArgs();
        }

        public Builder(VirtualHubArgs defaults) {
            $ = new VirtualHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefix Address-prefix for this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        /**
         * @param addressPrefix Address-prefix for this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(String addressPrefix) {
            return addressPrefix(Output.of(addressPrefix));
        }

        /**
         * @param allowBranchToBranchTraffic Flag to control transit for VirtualRouter hub.
         * 
         * @return builder
         * 
         */
        public Builder allowBranchToBranchTraffic(@Nullable Output<Boolean> allowBranchToBranchTraffic) {
            $.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
            return this;
        }

        /**
         * @param allowBranchToBranchTraffic Flag to control transit for VirtualRouter hub.
         * 
         * @return builder
         * 
         */
        public Builder allowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
            return allowBranchToBranchTraffic(Output.of(allowBranchToBranchTraffic));
        }

        /**
         * @param azureFirewall The azureFirewall associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder azureFirewall(@Nullable Output<SubResourceArgs> azureFirewall) {
            $.azureFirewall = azureFirewall;
            return this;
        }

        /**
         * @param azureFirewall The azureFirewall associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder azureFirewall(SubResourceArgs azureFirewall) {
            return azureFirewall(Output.of(azureFirewall));
        }

        /**
         * @param expressRouteGateway The expressRouteGateway associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteGateway(@Nullable Output<SubResourceArgs> expressRouteGateway) {
            $.expressRouteGateway = expressRouteGateway;
            return this;
        }

        /**
         * @param expressRouteGateway The expressRouteGateway associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteGateway(SubResourceArgs expressRouteGateway) {
            return expressRouteGateway(Output.of(expressRouteGateway));
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
         * @param p2SVpnGateway The P2SVpnGateway associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder p2SVpnGateway(@Nullable Output<SubResourceArgs> p2SVpnGateway) {
            $.p2SVpnGateway = p2SVpnGateway;
            return this;
        }

        /**
         * @param p2SVpnGateway The P2SVpnGateway associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder p2SVpnGateway(SubResourceArgs p2SVpnGateway) {
            return p2SVpnGateway(Output.of(p2SVpnGateway));
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routeTable The routeTable associated with this virtual hub.
         * 
         * @return builder
         * 
         */
        public Builder routeTable(@Nullable Output<VirtualHubRouteTableArgs> routeTable) {
            $.routeTable = routeTable;
            return this;
        }

        /**
         * @param routeTable The routeTable associated with this virtual hub.
         * 
         * @return builder
         * 
         */
        public Builder routeTable(VirtualHubRouteTableArgs routeTable) {
            return routeTable(Output.of(routeTable));
        }

        /**
         * @param securityPartnerProvider The securityPartnerProvider associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder securityPartnerProvider(@Nullable Output<SubResourceArgs> securityPartnerProvider) {
            $.securityPartnerProvider = securityPartnerProvider;
            return this;
        }

        /**
         * @param securityPartnerProvider The securityPartnerProvider associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder securityPartnerProvider(SubResourceArgs securityPartnerProvider) {
            return securityPartnerProvider(Output.of(securityPartnerProvider));
        }

        /**
         * @param securityProviderName The Security Provider name.
         * 
         * @return builder
         * 
         */
        public Builder securityProviderName(@Nullable Output<String> securityProviderName) {
            $.securityProviderName = securityProviderName;
            return this;
        }

        /**
         * @param securityProviderName The Security Provider name.
         * 
         * @return builder
         * 
         */
        public Builder securityProviderName(String securityProviderName) {
            return securityProviderName(Output.of(securityProviderName));
        }

        /**
         * @param sku The sku of this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The sku of this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
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
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(@Nullable Output<String> virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(String virtualHubName) {
            return virtualHubName(Output.of(virtualHubName));
        }

        /**
         * @param virtualHubRouteTableV2s List of all virtual hub route table v2s associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubRouteTableV2s(@Nullable Output<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s) {
            $.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
            return this;
        }

        /**
         * @param virtualHubRouteTableV2s List of all virtual hub route table v2s associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubRouteTableV2s(List<VirtualHubRouteTableV2Args> virtualHubRouteTableV2s) {
            return virtualHubRouteTableV2s(Output.of(virtualHubRouteTableV2s));
        }

        /**
         * @param virtualHubRouteTableV2s List of all virtual hub route table v2s associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubRouteTableV2s(VirtualHubRouteTableV2Args... virtualHubRouteTableV2s) {
            return virtualHubRouteTableV2s(List.of(virtualHubRouteTableV2s));
        }

        /**
         * @param virtualRouterAsn VirtualRouter ASN.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterAsn(@Nullable Output<Double> virtualRouterAsn) {
            $.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        /**
         * @param virtualRouterAsn VirtualRouter ASN.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterAsn(Double virtualRouterAsn) {
            return virtualRouterAsn(Output.of(virtualRouterAsn));
        }

        /**
         * @param virtualRouterIps VirtualRouter IPs.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterIps(@Nullable Output<List<String>> virtualRouterIps) {
            $.virtualRouterIps = virtualRouterIps;
            return this;
        }

        /**
         * @param virtualRouterIps VirtualRouter IPs.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterIps(List<String> virtualRouterIps) {
            return virtualRouterIps(Output.of(virtualRouterIps));
        }

        /**
         * @param virtualRouterIps VirtualRouter IPs.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterIps(String... virtualRouterIps) {
            return virtualRouterIps(List.of(virtualRouterIps));
        }

        /**
         * @param virtualWan The VirtualWAN to which the VirtualHub belongs.
         * 
         * @return builder
         * 
         */
        public Builder virtualWan(@Nullable Output<SubResourceArgs> virtualWan) {
            $.virtualWan = virtualWan;
            return this;
        }

        /**
         * @param virtualWan The VirtualWAN to which the VirtualHub belongs.
         * 
         * @return builder
         * 
         */
        public Builder virtualWan(SubResourceArgs virtualWan) {
            return virtualWan(Output.of(virtualWan));
        }

        /**
         * @param vpnGateway The VpnGateway associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder vpnGateway(@Nullable Output<SubResourceArgs> vpnGateway) {
            $.vpnGateway = vpnGateway;
            return this;
        }

        /**
         * @param vpnGateway The VpnGateway associated with this VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder vpnGateway(SubResourceArgs vpnGateway) {
            return vpnGateway(Output.of(vpnGateway));
        }

        public VirtualHubArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
