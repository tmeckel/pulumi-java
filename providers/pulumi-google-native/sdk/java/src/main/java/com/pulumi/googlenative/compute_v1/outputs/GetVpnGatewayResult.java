// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.VpnGatewayVpnGatewayInterfaceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVpnGatewayResult {
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
     * @return Type of resource. Always compute#vpnGateway for VPN gateways.
     * 
     */
    private final String kind;
    /**
     * @return A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an VpnGateway.
     * 
     */
    private final String labelFingerprint;
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    private final String network;
    /**
     * @return URL of the region where the VPN gateway resides.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return The stack type for this VPN gateway to identify the IP protocols that are enabled. If not specified, IPV4_ONLY will be used.
     * 
     */
    private final String stackType;
    /**
     * @return The list of VPN interfaces associated with this VPN gateway.
     * 
     */
    private final List<VpnGatewayVpnGatewayInterfaceResponse> vpnInterfaces;

    @CustomType.Constructor
    private GetVpnGatewayResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("stackType") String stackType,
        @CustomType.Parameter("vpnInterfaces") List<VpnGatewayVpnGatewayInterfaceResponse> vpnInterfaces) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.region = region;
        this.selfLink = selfLink;
        this.stackType = stackType;
        this.vpnInterfaces = vpnInterfaces;
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
     * @return Type of resource. Always compute#vpnGateway for VPN gateways.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an VpnGateway.
     * 
     */
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return URL of the region where the VPN gateway resides.
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
    /**
     * @return The stack type for this VPN gateway to identify the IP protocols that are enabled. If not specified, IPV4_ONLY will be used.
     * 
     */
    public String stackType() {
        return this.stackType;
    }
    /**
     * @return The list of VPN interfaces associated with this VPN gateway.
     * 
     */
    public List<VpnGatewayVpnGatewayInterfaceResponse> vpnInterfaces() {
        return this.vpnInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String network;
        private String region;
        private String selfLink;
        private String stackType;
        private List<VpnGatewayVpnGatewayInterfaceResponse> vpnInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.stackType = defaults.stackType;
    	      this.vpnInterfaces = defaults.vpnInterfaces;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
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
        }
        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public Builder vpnInterfaces(List<VpnGatewayVpnGatewayInterfaceResponse> vpnInterfaces) {
            this.vpnInterfaces = Objects.requireNonNull(vpnInterfaces);
            return this;
        }
        public Builder vpnInterfaces(VpnGatewayVpnGatewayInterfaceResponse... vpnInterfaces) {
            return vpnInterfaces(List.of(vpnInterfaces));
        }        public GetVpnGatewayResult build() {
            return new GetVpnGatewayResult(creationTimestamp, description, kind, labelFingerprint, labels, name, network, region, selfLink, stackType, vpnInterfaces);
        }
    }
}
