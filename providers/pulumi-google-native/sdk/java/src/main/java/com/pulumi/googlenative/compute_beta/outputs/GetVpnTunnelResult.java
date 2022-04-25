// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVpnTunnelResult {
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
     * @return Detailed status message for the VPN tunnel.
     * 
     */
    private final String detailedStatus;
    /**
     * @return IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    private final Integer ikeVersion;
    /**
     * @return Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
     */
    private final String kind;
    /**
     * @return A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
     * 
     */
    private final String labelFingerprint;
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    private final List<String> localTrafficSelector;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    private final String peerExternalGateway;
    /**
     * @return The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    private final Integer peerExternalGatewayInterface;
    /**
     * @return URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    private final String peerGcpGateway;
    /**
     * @return IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    private final String peerIp;
    /**
     * @return URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    private final List<String> remoteTrafficSelector;
    /**
     * @return URL of the router resource to be used for dynamic routing.
     * 
     */
    private final String router;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    private final String sharedSecret;
    /**
     * @return Hash of the shared secret.
     * 
     */
    private final String sharedSecretHash;
    /**
     * @return The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
     */
    private final String status;
    /**
     * @return URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    private final String targetVpnGateway;
    /**
     * @return URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    private final String vpnGateway;
    /**
     * @return The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    private final Integer vpnGatewayInterface;

    @CustomType.Constructor
    private GetVpnTunnelResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("detailedStatus") String detailedStatus,
        @CustomType.Parameter("ikeVersion") Integer ikeVersion,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("localTrafficSelector") List<String> localTrafficSelector,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peerExternalGateway") String peerExternalGateway,
        @CustomType.Parameter("peerExternalGatewayInterface") Integer peerExternalGatewayInterface,
        @CustomType.Parameter("peerGcpGateway") String peerGcpGateway,
        @CustomType.Parameter("peerIp") String peerIp,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("remoteTrafficSelector") List<String> remoteTrafficSelector,
        @CustomType.Parameter("router") String router,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sharedSecret") String sharedSecret,
        @CustomType.Parameter("sharedSecretHash") String sharedSecretHash,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("targetVpnGateway") String targetVpnGateway,
        @CustomType.Parameter("vpnGateway") String vpnGateway,
        @CustomType.Parameter("vpnGatewayInterface") Integer vpnGatewayInterface) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.detailedStatus = detailedStatus;
        this.ikeVersion = ikeVersion;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.localTrafficSelector = localTrafficSelector;
        this.name = name;
        this.peerExternalGateway = peerExternalGateway;
        this.peerExternalGatewayInterface = peerExternalGatewayInterface;
        this.peerGcpGateway = peerGcpGateway;
        this.peerIp = peerIp;
        this.region = region;
        this.remoteTrafficSelector = remoteTrafficSelector;
        this.router = router;
        this.selfLink = selfLink;
        this.sharedSecret = sharedSecret;
        this.sharedSecretHash = sharedSecretHash;
        this.status = status;
        this.targetVpnGateway = targetVpnGateway;
        this.vpnGateway = vpnGateway;
        this.vpnGatewayInterface = vpnGatewayInterface;
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
     * @return Detailed status message for the VPN tunnel.
     * 
     */
    public String detailedStatus() {
        return this.detailedStatus;
    }
    /**
     * @return IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    public Integer ikeVersion() {
        return this.ikeVersion;
    }
    /**
     * @return Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
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
     * @return Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    public List<String> localTrafficSelector() {
        return this.localTrafficSelector;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    public String peerExternalGateway() {
        return this.peerExternalGateway;
    }
    /**
     * @return The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    public Integer peerExternalGatewayInterface() {
        return this.peerExternalGatewayInterface;
    }
    /**
     * @return URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    public String peerGcpGateway() {
        return this.peerGcpGateway;
    }
    /**
     * @return IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    public String peerIp() {
        return this.peerIp;
    }
    /**
     * @return URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    public List<String> remoteTrafficSelector() {
        return this.remoteTrafficSelector;
    }
    /**
     * @return URL of the router resource to be used for dynamic routing.
     * 
     */
    public String router() {
        return this.router;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    public String sharedSecret() {
        return this.sharedSecret;
    }
    /**
     * @return Hash of the shared secret.
     * 
     */
    public String sharedSecretHash() {
        return this.sharedSecretHash;
    }
    /**
     * @return The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    public String targetVpnGateway() {
        return this.targetVpnGateway;
    }
    /**
     * @return URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    public String vpnGateway() {
        return this.vpnGateway;
    }
    /**
     * @return The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    public Integer vpnGatewayInterface() {
        return this.vpnGatewayInterface;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnTunnelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String detailedStatus;
        private Integer ikeVersion;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private List<String> localTrafficSelector;
        private String name;
        private String peerExternalGateway;
        private Integer peerExternalGatewayInterface;
        private String peerGcpGateway;
        private String peerIp;
        private String region;
        private List<String> remoteTrafficSelector;
        private String router;
        private String selfLink;
        private String sharedSecret;
        private String sharedSecretHash;
        private String status;
        private String targetVpnGateway;
        private String vpnGateway;
        private Integer vpnGatewayInterface;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnTunnelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.detailedStatus = defaults.detailedStatus;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.localTrafficSelector = defaults.localTrafficSelector;
    	      this.name = defaults.name;
    	      this.peerExternalGateway = defaults.peerExternalGateway;
    	      this.peerExternalGatewayInterface = defaults.peerExternalGatewayInterface;
    	      this.peerGcpGateway = defaults.peerGcpGateway;
    	      this.peerIp = defaults.peerIp;
    	      this.region = defaults.region;
    	      this.remoteTrafficSelector = defaults.remoteTrafficSelector;
    	      this.router = defaults.router;
    	      this.selfLink = defaults.selfLink;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.sharedSecretHash = defaults.sharedSecretHash;
    	      this.status = defaults.status;
    	      this.targetVpnGateway = defaults.targetVpnGateway;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnGatewayInterface = defaults.vpnGatewayInterface;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder detailedStatus(String detailedStatus) {
            this.detailedStatus = Objects.requireNonNull(detailedStatus);
            return this;
        }
        public Builder ikeVersion(Integer ikeVersion) {
            this.ikeVersion = Objects.requireNonNull(ikeVersion);
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
        public Builder localTrafficSelector(List<String> localTrafficSelector) {
            this.localTrafficSelector = Objects.requireNonNull(localTrafficSelector);
            return this;
        }
        public Builder localTrafficSelector(String... localTrafficSelector) {
            return localTrafficSelector(List.of(localTrafficSelector));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peerExternalGateway(String peerExternalGateway) {
            this.peerExternalGateway = Objects.requireNonNull(peerExternalGateway);
            return this;
        }
        public Builder peerExternalGatewayInterface(Integer peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = Objects.requireNonNull(peerExternalGatewayInterface);
            return this;
        }
        public Builder peerGcpGateway(String peerGcpGateway) {
            this.peerGcpGateway = Objects.requireNonNull(peerGcpGateway);
            return this;
        }
        public Builder peerIp(String peerIp) {
            this.peerIp = Objects.requireNonNull(peerIp);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder remoteTrafficSelector(List<String> remoteTrafficSelector) {
            this.remoteTrafficSelector = Objects.requireNonNull(remoteTrafficSelector);
            return this;
        }
        public Builder remoteTrafficSelector(String... remoteTrafficSelector) {
            return remoteTrafficSelector(List.of(remoteTrafficSelector));
        }
        public Builder router(String router) {
            this.router = Objects.requireNonNull(router);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sharedSecret(String sharedSecret) {
            this.sharedSecret = Objects.requireNonNull(sharedSecret);
            return this;
        }
        public Builder sharedSecretHash(String sharedSecretHash) {
            this.sharedSecretHash = Objects.requireNonNull(sharedSecretHash);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder targetVpnGateway(String targetVpnGateway) {
            this.targetVpnGateway = Objects.requireNonNull(targetVpnGateway);
            return this;
        }
        public Builder vpnGateway(String vpnGateway) {
            this.vpnGateway = Objects.requireNonNull(vpnGateway);
            return this;
        }
        public Builder vpnGatewayInterface(Integer vpnGatewayInterface) {
            this.vpnGatewayInterface = Objects.requireNonNull(vpnGatewayInterface);
            return this;
        }        public GetVpnTunnelResult build() {
            return new GetVpnTunnelResult(creationTimestamp, description, detailedStatus, ikeVersion, kind, labelFingerprint, labels, localTrafficSelector, name, peerExternalGateway, peerExternalGatewayInterface, peerGcpGateway, peerIp, region, remoteTrafficSelector, router, selfLink, sharedSecret, sharedSecretHash, status, targetVpnGateway, vpnGateway, vpnGatewayInterface);
        }
    }
}
