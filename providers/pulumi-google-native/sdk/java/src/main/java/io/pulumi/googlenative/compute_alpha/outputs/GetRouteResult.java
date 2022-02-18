// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.RouteAsPathResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouteWarningsItemResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRouteResult {
    /**
     * Whether this route can conflict with existing subnetworks. Setting this to true allows this route to conflict with subnetworks that have already been configured on the corresponding network.
     * 
     */
    private final Boolean allowConflictingSubnetworks;
    /**
     * AS path.
     * 
     */
    private final List<RouteAsPathResponse> asPaths;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private final String description;
    /**
     * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    private final String destRange;
    /**
     * ILB route behavior when ILB is deemed unhealthy based on user specified threshold on the Backend Service of the internal load balancing.
     * 
     */
    private final String ilbRouteBehaviorOnUnhealthy;
    /**
     * Type of this resource. Always compute#routes for Route resources.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private final String name;
    /**
     * Fully-qualified URL of the network that this route applies to.
     * 
     */
    private final String network;
    /**
     * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    private final String nextHopGateway;
    /**
     * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    private final String nextHopIlb;
    /**
     * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    private final String nextHopInstance;
    /**
     * The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    private final String nextHopInterconnectAttachment;
    /**
     * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    private final String nextHopIp;
    /**
     * The URL of the local network if it should handle matching packets.
     * 
     */
    private final String nextHopNetwork;
    /**
     * The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    private final String nextHopPeering;
    /**
     * The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    private final String nextHopVpnTunnel;
    /**
     * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    private final Integer priority;
    /**
     * [Output only] The status of the route.
     * 
     */
    private final String routeStatus;
    /**
     * The type of this route, which can be one of the following values: - 'TRANSIT' for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - 'SUBNET' for a route from a subnet of the VPC - 'BGP' for a route learned from a BGP peer of this router - 'STATIC' for a static route
     * 
     */
    private final String routeType;
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * A list of instance tags to which this route applies.
     * 
     */
    private final List<String> tags;
    /**
     * If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    private final List<RouteWarningsItemResponse> warnings;

    @OutputCustomType.Constructor({"allowConflictingSubnetworks","asPaths","creationTimestamp","description","destRange","ilbRouteBehaviorOnUnhealthy","kind","name","network","nextHopGateway","nextHopIlb","nextHopInstance","nextHopInterconnectAttachment","nextHopIp","nextHopNetwork","nextHopPeering","nextHopVpnTunnel","priority","routeStatus","routeType","selfLink","selfLinkWithId","tags","warnings"})
    private GetRouteResult(
        Boolean allowConflictingSubnetworks,
        List<RouteAsPathResponse> asPaths,
        String creationTimestamp,
        String description,
        String destRange,
        String ilbRouteBehaviorOnUnhealthy,
        String kind,
        String name,
        String network,
        String nextHopGateway,
        String nextHopIlb,
        String nextHopInstance,
        String nextHopInterconnectAttachment,
        String nextHopIp,
        String nextHopNetwork,
        String nextHopPeering,
        String nextHopVpnTunnel,
        Integer priority,
        String routeStatus,
        String routeType,
        String selfLink,
        String selfLinkWithId,
        List<String> tags,
        List<RouteWarningsItemResponse> warnings) {
        this.allowConflictingSubnetworks = Objects.requireNonNull(allowConflictingSubnetworks);
        this.asPaths = Objects.requireNonNull(asPaths);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.destRange = Objects.requireNonNull(destRange);
        this.ilbRouteBehaviorOnUnhealthy = Objects.requireNonNull(ilbRouteBehaviorOnUnhealthy);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
        this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
        this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
        this.nextHopInterconnectAttachment = Objects.requireNonNull(nextHopInterconnectAttachment);
        this.nextHopIp = Objects.requireNonNull(nextHopIp);
        this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
        this.nextHopPeering = Objects.requireNonNull(nextHopPeering);
        this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
        this.priority = Objects.requireNonNull(priority);
        this.routeStatus = Objects.requireNonNull(routeStatus);
        this.routeType = Objects.requireNonNull(routeType);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.tags = Objects.requireNonNull(tags);
        this.warnings = Objects.requireNonNull(warnings);
    }

    /**
     * Whether this route can conflict with existing subnetworks. Setting this to true allows this route to conflict with subnetworks that have already been configured on the corresponding network.
     * 
     */
    public Boolean getAllowConflictingSubnetworks() {
        return this.allowConflictingSubnetworks;
    }
    /**
     * AS path.
     * 
     */
    public List<RouteAsPathResponse> getAsPaths() {
        return this.asPaths;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    public String getDestRange() {
        return this.destRange;
    }
    /**
     * ILB route behavior when ILB is deemed unhealthy based on user specified threshold on the Backend Service of the internal load balancing.
     * 
     */
    public String getIlbRouteBehaviorOnUnhealthy() {
        return this.ilbRouteBehaviorOnUnhealthy;
    }
    /**
     * Type of this resource. Always compute#routes for Route resources.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Fully-qualified URL of the network that this route applies to.
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    public String getNextHopGateway() {
        return this.nextHopGateway;
    }
    /**
     * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    public String getNextHopIlb() {
        return this.nextHopIlb;
    }
    /**
     * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    public String getNextHopInstance() {
        return this.nextHopInstance;
    }
    /**
     * The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    public String getNextHopInterconnectAttachment() {
        return this.nextHopInterconnectAttachment;
    }
    /**
     * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    public String getNextHopIp() {
        return this.nextHopIp;
    }
    /**
     * The URL of the local network if it should handle matching packets.
     * 
     */
    public String getNextHopNetwork() {
        return this.nextHopNetwork;
    }
    /**
     * The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    public String getNextHopPeering() {
        return this.nextHopPeering;
    }
    /**
     * The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    public String getNextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    /**
     * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * [Output only] The status of the route.
     * 
     */
    public String getRouteStatus() {
        return this.routeStatus;
    }
    /**
     * The type of this route, which can be one of the following values: - 'TRANSIT' for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - 'SUBNET' for a route from a subnet of the VPC - 'BGP' for a route learned from a BGP peer of this router - 'STATIC' for a static route
     * 
     */
    public String getRouteType() {
        return this.routeType;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * A list of instance tags to which this route applies.
     * 
     */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    public List<RouteWarningsItemResponse> getWarnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowConflictingSubnetworks;
        private List<RouteAsPathResponse> asPaths;
        private String creationTimestamp;
        private String description;
        private String destRange;
        private String ilbRouteBehaviorOnUnhealthy;
        private String kind;
        private String name;
        private String network;
        private String nextHopGateway;
        private String nextHopIlb;
        private String nextHopInstance;
        private String nextHopInterconnectAttachment;
        private String nextHopIp;
        private String nextHopNetwork;
        private String nextHopPeering;
        private String nextHopVpnTunnel;
        private Integer priority;
        private String routeStatus;
        private String routeType;
        private String selfLink;
        private String selfLinkWithId;
        private List<String> tags;
        private List<RouteWarningsItemResponse> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConflictingSubnetworks = defaults.allowConflictingSubnetworks;
    	      this.asPaths = defaults.asPaths;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.ilbRouteBehaviorOnUnhealthy = defaults.ilbRouteBehaviorOnUnhealthy;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopInterconnectAttachment = defaults.nextHopInterconnectAttachment;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopPeering = defaults.nextHopPeering;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.routeStatus = defaults.routeStatus;
    	      this.routeType = defaults.routeType;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.tags = defaults.tags;
    	      this.warnings = defaults.warnings;
        }

        public Builder setAllowConflictingSubnetworks(Boolean allowConflictingSubnetworks) {
            this.allowConflictingSubnetworks = Objects.requireNonNull(allowConflictingSubnetworks);
            return this;
        }

        public Builder setAsPaths(List<RouteAsPathResponse> asPaths) {
            this.asPaths = Objects.requireNonNull(asPaths);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDestRange(String destRange) {
            this.destRange = Objects.requireNonNull(destRange);
            return this;
        }

        public Builder setIlbRouteBehaviorOnUnhealthy(String ilbRouteBehaviorOnUnhealthy) {
            this.ilbRouteBehaviorOnUnhealthy = Objects.requireNonNull(ilbRouteBehaviorOnUnhealthy);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNextHopGateway(String nextHopGateway) {
            this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
            return this;
        }

        public Builder setNextHopIlb(String nextHopIlb) {
            this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
            return this;
        }

        public Builder setNextHopInstance(String nextHopInstance) {
            this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
            return this;
        }

        public Builder setNextHopInterconnectAttachment(String nextHopInterconnectAttachment) {
            this.nextHopInterconnectAttachment = Objects.requireNonNull(nextHopInterconnectAttachment);
            return this;
        }

        public Builder setNextHopIp(String nextHopIp) {
            this.nextHopIp = Objects.requireNonNull(nextHopIp);
            return this;
        }

        public Builder setNextHopNetwork(String nextHopNetwork) {
            this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
            return this;
        }

        public Builder setNextHopPeering(String nextHopPeering) {
            this.nextHopPeering = Objects.requireNonNull(nextHopPeering);
            return this;
        }

        public Builder setNextHopVpnTunnel(String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRouteStatus(String routeStatus) {
            this.routeStatus = Objects.requireNonNull(routeStatus);
            return this;
        }

        public Builder setRouteType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setWarnings(List<RouteWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }

        public GetRouteResult build() {
            return new GetRouteResult(allowConflictingSubnetworks, asPaths, creationTimestamp, description, destRange, ilbRouteBehaviorOnUnhealthy, kind, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopInterconnectAttachment, nextHopIp, nextHopNetwork, nextHopPeering, nextHopVpnTunnel, priority, routeStatus, routeType, selfLink, selfLinkWithId, tags, warnings);
        }
    }
}
