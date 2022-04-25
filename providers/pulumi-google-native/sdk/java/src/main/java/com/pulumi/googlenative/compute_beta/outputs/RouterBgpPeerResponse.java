// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.RouterAdvertisedIpRangeResponse;
import com.pulumi.googlenative.compute_beta.outputs.RouterBgpPeerBfdResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouterBgpPeerResponse {
    /**
     * @return User-specified flag to indicate which mode to use for advertisement.
     * 
     */
    private final String advertiseMode;
    /**
     * @return User-specified list of prefix groups to advertise in custom mode, which can take one of the following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets. - ALL_VPC_SUBNETS: Advertises the router&#39;s own VPC subnets. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the &#34;bgp&#34; message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    private final List<String> advertisedGroups;
    /**
     * @return User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the &#34;bgp&#34; message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    private final List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;
    /**
     * @return The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
     * 
     */
    private final Integer advertisedRoutePriority;
    /**
     * @return BFD configuration for the BGP peering.
     * 
     */
    private final RouterBgpPeerBfdResponse bfd;
    /**
     * @return The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
     * 
     */
    private final String enable;
    /**
     * @return Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
     * 
     */
    private final Boolean enableIpv6;
    /**
     * @return Name of the interface the BGP peer is associated with.
     * 
     */
    private final String interfaceName;
    /**
     * @return IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    private final String ipAddress;
    /**
     * @return IPv6 address of the interface inside Google Cloud Platform.
     * 
     */
    private final String ipv6NexthopAddress;
    /**
     * @return The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    private final String managementType;
    /**
     * @return Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
     * 
     */
    private final Integer peerAsn;
    /**
     * @return IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    private final String peerIpAddress;
    /**
     * @return IPv6 address of the BGP interface outside Google Cloud Platform.
     * 
     */
    private final String peerIpv6NexthopAddress;
    /**
     * @return URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
     * 
     */
    private final String routerApplianceInstance;

    @CustomType.Constructor
    private RouterBgpPeerResponse(
        @CustomType.Parameter("advertiseMode") String advertiseMode,
        @CustomType.Parameter("advertisedGroups") List<String> advertisedGroups,
        @CustomType.Parameter("advertisedIpRanges") List<RouterAdvertisedIpRangeResponse> advertisedIpRanges,
        @CustomType.Parameter("advertisedRoutePriority") Integer advertisedRoutePriority,
        @CustomType.Parameter("bfd") RouterBgpPeerBfdResponse bfd,
        @CustomType.Parameter("enable") String enable,
        @CustomType.Parameter("enableIpv6") Boolean enableIpv6,
        @CustomType.Parameter("interfaceName") String interfaceName,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("ipv6NexthopAddress") String ipv6NexthopAddress,
        @CustomType.Parameter("managementType") String managementType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peerAsn") Integer peerAsn,
        @CustomType.Parameter("peerIpAddress") String peerIpAddress,
        @CustomType.Parameter("peerIpv6NexthopAddress") String peerIpv6NexthopAddress,
        @CustomType.Parameter("routerApplianceInstance") String routerApplianceInstance) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.advertisedRoutePriority = advertisedRoutePriority;
        this.bfd = bfd;
        this.enable = enable;
        this.enableIpv6 = enableIpv6;
        this.interfaceName = interfaceName;
        this.ipAddress = ipAddress;
        this.ipv6NexthopAddress = ipv6NexthopAddress;
        this.managementType = managementType;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIpAddress = peerIpAddress;
        this.peerIpv6NexthopAddress = peerIpv6NexthopAddress;
        this.routerApplianceInstance = routerApplianceInstance;
    }

    /**
     * @return User-specified flag to indicate which mode to use for advertisement.
     * 
     */
    public String advertiseMode() {
        return this.advertiseMode;
    }
    /**
     * @return User-specified list of prefix groups to advertise in custom mode, which can take one of the following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets. - ALL_VPC_SUBNETS: Advertises the router&#39;s own VPC subnets. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the &#34;bgp&#34; message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    public List<String> advertisedGroups() {
        return this.advertisedGroups;
    }
    /**
     * @return User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the &#34;bgp&#34; message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    public List<RouterAdvertisedIpRangeResponse> advertisedIpRanges() {
        return this.advertisedIpRanges;
    }
    /**
     * @return The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
     * 
     */
    public Integer advertisedRoutePriority() {
        return this.advertisedRoutePriority;
    }
    /**
     * @return BFD configuration for the BGP peering.
     * 
     */
    public RouterBgpPeerBfdResponse bfd() {
        return this.bfd;
    }
    /**
     * @return The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
     * 
     */
    public String enable() {
        return this.enable;
    }
    /**
     * @return Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
     * 
     */
    public Boolean enableIpv6() {
        return this.enableIpv6;
    }
    /**
     * @return Name of the interface the BGP peer is associated with.
     * 
     */
    public String interfaceName() {
        return this.interfaceName;
    }
    /**
     * @return IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return IPv6 address of the interface inside Google Cloud Platform.
     * 
     */
    public String ipv6NexthopAddress() {
        return this.ipv6NexthopAddress;
    }
    /**
     * @return The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    public String managementType() {
        return this.managementType;
    }
    /**
     * @return Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
     * 
     */
    public Integer peerAsn() {
        return this.peerAsn;
    }
    /**
     * @return IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    public String peerIpAddress() {
        return this.peerIpAddress;
    }
    /**
     * @return IPv6 address of the BGP interface outside Google Cloud Platform.
     * 
     */
    public String peerIpv6NexthopAddress() {
        return this.peerIpv6NexthopAddress;
    }
    /**
     * @return URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
     * 
     */
    public String routerApplianceInstance() {
        return this.routerApplianceInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advertiseMode;
        private List<String> advertisedGroups;
        private List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;
        private Integer advertisedRoutePriority;
        private RouterBgpPeerBfdResponse bfd;
        private String enable;
        private Boolean enableIpv6;
        private String interfaceName;
        private String ipAddress;
        private String ipv6NexthopAddress;
        private String managementType;
        private String name;
        private Integer peerAsn;
        private String peerIpAddress;
        private String peerIpv6NexthopAddress;
        private String routerApplianceInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.advertisedRoutePriority = defaults.advertisedRoutePriority;
    	      this.bfd = defaults.bfd;
    	      this.enable = defaults.enable;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.interfaceName = defaults.interfaceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipv6NexthopAddress = defaults.ipv6NexthopAddress;
    	      this.managementType = defaults.managementType;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.peerIpv6NexthopAddress = defaults.peerIpv6NexthopAddress;
    	      this.routerApplianceInstance = defaults.routerApplianceInstance;
        }

        public Builder advertiseMode(String advertiseMode) {
            this.advertiseMode = Objects.requireNonNull(advertiseMode);
            return this;
        }
        public Builder advertisedGroups(List<String> advertisedGroups) {
            this.advertisedGroups = Objects.requireNonNull(advertisedGroups);
            return this;
        }
        public Builder advertisedGroups(String... advertisedGroups) {
            return advertisedGroups(List.of(advertisedGroups));
        }
        public Builder advertisedIpRanges(List<RouterAdvertisedIpRangeResponse> advertisedIpRanges) {
            this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges);
            return this;
        }
        public Builder advertisedIpRanges(RouterAdvertisedIpRangeResponse... advertisedIpRanges) {
            return advertisedIpRanges(List.of(advertisedIpRanges));
        }
        public Builder advertisedRoutePriority(Integer advertisedRoutePriority) {
            this.advertisedRoutePriority = Objects.requireNonNull(advertisedRoutePriority);
            return this;
        }
        public Builder bfd(RouterBgpPeerBfdResponse bfd) {
            this.bfd = Objects.requireNonNull(bfd);
            return this;
        }
        public Builder enable(String enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder enableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = Objects.requireNonNull(enableIpv6);
            return this;
        }
        public Builder interfaceName(String interfaceName) {
            this.interfaceName = Objects.requireNonNull(interfaceName);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder ipv6NexthopAddress(String ipv6NexthopAddress) {
            this.ipv6NexthopAddress = Objects.requireNonNull(ipv6NexthopAddress);
            return this;
        }
        public Builder managementType(String managementType) {
            this.managementType = Objects.requireNonNull(managementType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peerAsn(Integer peerAsn) {
            this.peerAsn = Objects.requireNonNull(peerAsn);
            return this;
        }
        public Builder peerIpAddress(String peerIpAddress) {
            this.peerIpAddress = Objects.requireNonNull(peerIpAddress);
            return this;
        }
        public Builder peerIpv6NexthopAddress(String peerIpv6NexthopAddress) {
            this.peerIpv6NexthopAddress = Objects.requireNonNull(peerIpv6NexthopAddress);
            return this;
        }
        public Builder routerApplianceInstance(String routerApplianceInstance) {
            this.routerApplianceInstance = Objects.requireNonNull(routerApplianceInstance);
            return this;
        }        public RouterBgpPeerResponse build() {
            return new RouterBgpPeerResponse(advertiseMode, advertisedGroups, advertisedIpRanges, advertisedRoutePriority, bfd, enable, enableIpv6, interfaceName, ipAddress, ipv6NexthopAddress, managementType, name, peerAsn, peerIpAddress, peerIpv6NexthopAddress, routerApplianceInstance);
        }
    }
}
