// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Compute Engine route.
 * 
 */
public final class RouteInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final RouteInfoResponse Empty = new RouteInfoResponse();

    /**
     * Destination IP range of the route.
     * 
     */
    @Import(name="destIpRange", required=true)
    private String destIpRange;

    /**
     * @return Destination IP range of the route.
     * 
     */
    public String destIpRange() {
        return this.destIpRange;
    }

    /**
     * Name of a Compute Engine route.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return Name of a Compute Engine route.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Instance tags of the route.
     * 
     */
    @Import(name="instanceTags", required=true)
    private List<String> instanceTags;

    /**
     * @return Instance tags of the route.
     * 
     */
    public List<String> instanceTags() {
        return this.instanceTags;
    }

    /**
     * URI of a Compute Engine network.
     * 
     */
    @Import(name="networkUri", required=true)
    private String networkUri;

    /**
     * @return URI of a Compute Engine network.
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }

    /**
     * Next hop of the route.
     * 
     */
    @Import(name="nextHop", required=true)
    private String nextHop;

    /**
     * @return Next hop of the route.
     * 
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Type of next hop.
     * 
     */
    @Import(name="nextHopType", required=true)
    private String nextHopType;

    /**
     * @return Type of next hop.
     * 
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Priority of the route.
     * 
     */
    @Import(name="priority", required=true)
    private Integer priority;

    /**
     * @return Priority of the route.
     * 
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Type of route.
     * 
     */
    @Import(name="routeType", required=true)
    private String routeType;

    /**
     * @return Type of route.
     * 
     */
    public String routeType() {
        return this.routeType;
    }

    /**
     * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    /**
     * @return URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
     * 
     */
    public String uri() {
        return this.uri;
    }

    private RouteInfoResponse() {}

    private RouteInfoResponse(RouteInfoResponse $) {
        this.destIpRange = $.destIpRange;
        this.displayName = $.displayName;
        this.instanceTags = $.instanceTags;
        this.networkUri = $.networkUri;
        this.nextHop = $.nextHop;
        this.nextHopType = $.nextHopType;
        this.priority = $.priority;
        this.routeType = $.routeType;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteInfoResponse $;

        public Builder() {
            $ = new RouteInfoResponse();
        }

        public Builder(RouteInfoResponse defaults) {
            $ = new RouteInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param destIpRange Destination IP range of the route.
         * 
         * @return builder
         * 
         */
        public Builder destIpRange(String destIpRange) {
            $.destIpRange = destIpRange;
            return this;
        }

        /**
         * @param displayName Name of a Compute Engine route.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param instanceTags Instance tags of the route.
         * 
         * @return builder
         * 
         */
        public Builder instanceTags(List<String> instanceTags) {
            $.instanceTags = instanceTags;
            return this;
        }

        /**
         * @param instanceTags Instance tags of the route.
         * 
         * @return builder
         * 
         */
        public Builder instanceTags(String... instanceTags) {
            return instanceTags(List.of(instanceTags));
        }

        /**
         * @param networkUri URI of a Compute Engine network.
         * 
         * @return builder
         * 
         */
        public Builder networkUri(String networkUri) {
            $.networkUri = networkUri;
            return this;
        }

        /**
         * @param nextHop Next hop of the route.
         * 
         * @return builder
         * 
         */
        public Builder nextHop(String nextHop) {
            $.nextHop = nextHop;
            return this;
        }

        /**
         * @param nextHopType Type of next hop.
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(String nextHopType) {
            $.nextHopType = nextHopType;
            return this;
        }

        /**
         * @param priority Priority of the route.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param routeType Type of route.
         * 
         * @return builder
         * 
         */
        public Builder routeType(String routeType) {
            $.routeType = routeType;
            return this;
        }

        /**
         * @param uri URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public RouteInfoResponse build() {
            $.destIpRange = Objects.requireNonNull($.destIpRange, "expected parameter 'destIpRange' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.instanceTags = Objects.requireNonNull($.instanceTags, "expected parameter 'instanceTags' to be non-null");
            $.networkUri = Objects.requireNonNull($.networkUri, "expected parameter 'networkUri' to be non-null");
            $.nextHop = Objects.requireNonNull($.nextHop, "expected parameter 'nextHop' to be non-null");
            $.nextHopType = Objects.requireNonNull($.nextHopType, "expected parameter 'nextHopType' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.routeType = Objects.requireNonNull($.routeType, "expected parameter 'routeType' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
