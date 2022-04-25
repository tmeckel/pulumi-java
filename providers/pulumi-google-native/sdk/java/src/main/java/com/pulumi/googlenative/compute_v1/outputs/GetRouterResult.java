// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.RouterBgpPeerResponse;
import com.pulumi.googlenative.compute_v1.outputs.RouterBgpResponse;
import com.pulumi.googlenative.compute_v1.outputs.RouterInterfaceResponse;
import com.pulumi.googlenative.compute_v1.outputs.RouterNatResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouterResult {
    /**
     * @return BGP information specific to this router.
     * 
     */
    private final RouterBgpResponse bgp;
    /**
     * @return BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
     */
    private final List<RouterBgpPeerResponse> bgpPeers;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
     */
    private final Boolean encryptedInterconnectRouter;
    /**
     * @return Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
     */
    private final List<RouterInterfaceResponse> interfaces;
    /**
     * @return Type of resource. Always compute#router for routers.
     * 
     */
    private final String kind;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return A list of NAT services created in this router.
     * 
     */
    private final List<RouterNatResponse> nats;
    /**
     * @return URI of the network to which this router belongs.
     * 
     */
    private final String network;
    /**
     * @return URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;

    @CustomType.Constructor
    private GetRouterResult(
        @CustomType.Parameter("bgp") RouterBgpResponse bgp,
        @CustomType.Parameter("bgpPeers") List<RouterBgpPeerResponse> bgpPeers,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("encryptedInterconnectRouter") Boolean encryptedInterconnectRouter,
        @CustomType.Parameter("interfaces") List<RouterInterfaceResponse> interfaces,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nats") List<RouterNatResponse> nats,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink) {
        this.bgp = bgp;
        this.bgpPeers = bgpPeers;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.encryptedInterconnectRouter = encryptedInterconnectRouter;
        this.interfaces = interfaces;
        this.kind = kind;
        this.name = name;
        this.nats = nats;
        this.network = network;
        this.region = region;
        this.selfLink = selfLink;
    }

    /**
     * @return BGP information specific to this router.
     * 
     */
    public RouterBgpResponse bgp() {
        return this.bgp;
    }
    /**
     * @return BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
     */
    public List<RouterBgpPeerResponse> bgpPeers() {
        return this.bgpPeers;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
     */
    public Boolean encryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter;
    }
    /**
     * @return Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
     */
    public List<RouterInterfaceResponse> interfaces() {
        return this.interfaces;
    }
    /**
     * @return Type of resource. Always compute#router for routers.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of NAT services created in this router.
     * 
     */
    public List<RouterNatResponse> nats() {
        return this.nats;
    }
    /**
     * @return URI of the network to which this router belongs.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterBgpResponse bgp;
        private List<RouterBgpPeerResponse> bgpPeers;
        private String creationTimestamp;
        private String description;
        private Boolean encryptedInterconnectRouter;
        private List<RouterInterfaceResponse> interfaces;
        private String kind;
        private String name;
        private List<RouterNatResponse> nats;
        private String network;
        private String region;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgp = defaults.bgp;
    	      this.bgpPeers = defaults.bgpPeers;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.encryptedInterconnectRouter = defaults.encryptedInterconnectRouter;
    	      this.interfaces = defaults.interfaces;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.nats = defaults.nats;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bgp(RouterBgpResponse bgp) {
            this.bgp = Objects.requireNonNull(bgp);
            return this;
        }
        public Builder bgpPeers(List<RouterBgpPeerResponse> bgpPeers) {
            this.bgpPeers = Objects.requireNonNull(bgpPeers);
            return this;
        }
        public Builder bgpPeers(RouterBgpPeerResponse... bgpPeers) {
            return bgpPeers(List.of(bgpPeers));
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder encryptedInterconnectRouter(Boolean encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = Objects.requireNonNull(encryptedInterconnectRouter);
            return this;
        }
        public Builder interfaces(List<RouterInterfaceResponse> interfaces) {
            this.interfaces = Objects.requireNonNull(interfaces);
            return this;
        }
        public Builder interfaces(RouterInterfaceResponse... interfaces) {
            return interfaces(List.of(interfaces));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nats(List<RouterNatResponse> nats) {
            this.nats = Objects.requireNonNull(nats);
            return this;
        }
        public Builder nats(RouterNatResponse... nats) {
            return nats(List.of(nats));
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }        public GetRouterResult build() {
            return new GetRouterResult(bgp, bgpPeers, creationTimestamp, description, encryptedInterconnectRouter, interfaces, kind, name, nats, network, region, selfLink);
        }
    }
}
