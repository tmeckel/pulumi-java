// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnTunnelArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnTunnelArgs Empty = new VpnTunnelArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    @Import(name="ikeVersion")
      private final @Nullable Output<Integer> ikeVersion;

    public Output<Integer> getIkeVersion() {
        return this.ikeVersion == null ? Codegen.empty() : this.ikeVersion;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    @Import(name="localTrafficSelector")
      private final @Nullable Output<List<String>> localTrafficSelector;

    public Output<List<String>> getLocalTrafficSelector() {
        return this.localTrafficSelector == null ? Codegen.empty() : this.localTrafficSelector;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    @Import(name="peerExternalGateway")
      private final @Nullable Output<String> peerExternalGateway;

    public Output<String> getPeerExternalGateway() {
        return this.peerExternalGateway == null ? Codegen.empty() : this.peerExternalGateway;
    }

    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    @Import(name="peerExternalGatewayInterface")
      private final @Nullable Output<Integer> peerExternalGatewayInterface;

    public Output<Integer> getPeerExternalGatewayInterface() {
        return this.peerExternalGatewayInterface == null ? Codegen.empty() : this.peerExternalGatewayInterface;
    }

    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    @Import(name="peerGcpGateway")
      private final @Nullable Output<String> peerGcpGateway;

    public Output<String> getPeerGcpGateway() {
        return this.peerGcpGateway == null ? Codegen.empty() : this.peerGcpGateway;
    }

    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    @Import(name="peerIp")
      private final @Nullable Output<String> peerIp;

    public Output<String> getPeerIp() {
        return this.peerIp == null ? Codegen.empty() : this.peerIp;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    /**
     * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    @Import(name="remoteTrafficSelector")
      private final @Nullable Output<List<String>> remoteTrafficSelector;

    public Output<List<String>> getRemoteTrafficSelector() {
        return this.remoteTrafficSelector == null ? Codegen.empty() : this.remoteTrafficSelector;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * URL of the router resource to be used for dynamic routing.
     * 
     */
    @Import(name="router")
      private final @Nullable Output<String> router;

    public Output<String> getRouter() {
        return this.router == null ? Codegen.empty() : this.router;
    }

    /**
     * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    @Import(name="sharedSecret")
      private final @Nullable Output<String> sharedSecret;

    public Output<String> getSharedSecret() {
        return this.sharedSecret == null ? Codegen.empty() : this.sharedSecret;
    }

    /**
     * Hash of the shared secret.
     * 
     */
    @Import(name="sharedSecretHash")
      private final @Nullable Output<String> sharedSecretHash;

    public Output<String> getSharedSecretHash() {
        return this.sharedSecretHash == null ? Codegen.empty() : this.sharedSecretHash;
    }

    /**
     * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    @Import(name="targetVpnGateway")
      private final @Nullable Output<String> targetVpnGateway;

    public Output<String> getTargetVpnGateway() {
        return this.targetVpnGateway == null ? Codegen.empty() : this.targetVpnGateway;
    }

    /**
     * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    @Import(name="vpnGateway")
      private final @Nullable Output<String> vpnGateway;

    public Output<String> getVpnGateway() {
        return this.vpnGateway == null ? Codegen.empty() : this.vpnGateway;
    }

    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    @Import(name="vpnGatewayInterface")
      private final @Nullable Output<Integer> vpnGatewayInterface;

    public Output<Integer> getVpnGatewayInterface() {
        return this.vpnGatewayInterface == null ? Codegen.empty() : this.vpnGatewayInterface;
    }

    public VpnTunnelArgs(
        @Nullable Output<String> description,
        @Nullable Output<Integer> ikeVersion,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<String>> localTrafficSelector,
        @Nullable Output<String> name,
        @Nullable Output<String> peerExternalGateway,
        @Nullable Output<Integer> peerExternalGatewayInterface,
        @Nullable Output<String> peerGcpGateway,
        @Nullable Output<String> peerIp,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<List<String>> remoteTrafficSelector,
        @Nullable Output<String> requestId,
        @Nullable Output<String> router,
        @Nullable Output<String> sharedSecret,
        @Nullable Output<String> sharedSecretHash,
        @Nullable Output<String> targetVpnGateway,
        @Nullable Output<String> vpnGateway,
        @Nullable Output<Integer> vpnGatewayInterface) {
        this.description = description;
        this.ikeVersion = ikeVersion;
        this.labels = labels;
        this.localTrafficSelector = localTrafficSelector;
        this.name = name;
        this.peerExternalGateway = peerExternalGateway;
        this.peerExternalGatewayInterface = peerExternalGatewayInterface;
        this.peerGcpGateway = peerGcpGateway;
        this.peerIp = peerIp;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.remoteTrafficSelector = remoteTrafficSelector;
        this.requestId = requestId;
        this.router = router;
        this.sharedSecret = sharedSecret;
        this.sharedSecretHash = sharedSecretHash;
        this.targetVpnGateway = targetVpnGateway;
        this.vpnGateway = vpnGateway;
        this.vpnGatewayInterface = vpnGatewayInterface;
    }

    private VpnTunnelArgs() {
        this.description = Codegen.empty();
        this.ikeVersion = Codegen.empty();
        this.labels = Codegen.empty();
        this.localTrafficSelector = Codegen.empty();
        this.name = Codegen.empty();
        this.peerExternalGateway = Codegen.empty();
        this.peerExternalGatewayInterface = Codegen.empty();
        this.peerGcpGateway = Codegen.empty();
        this.peerIp = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.remoteTrafficSelector = Codegen.empty();
        this.requestId = Codegen.empty();
        this.router = Codegen.empty();
        this.sharedSecret = Codegen.empty();
        this.sharedSecretHash = Codegen.empty();
        this.targetVpnGateway = Codegen.empty();
        this.vpnGateway = Codegen.empty();
        this.vpnGatewayInterface = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> ikeVersion;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<String>> localTrafficSelector;
        private @Nullable Output<String> name;
        private @Nullable Output<String> peerExternalGateway;
        private @Nullable Output<Integer> peerExternalGatewayInterface;
        private @Nullable Output<String> peerGcpGateway;
        private @Nullable Output<String> peerIp;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<List<String>> remoteTrafficSelector;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> router;
        private @Nullable Output<String> sharedSecret;
        private @Nullable Output<String> sharedSecretHash;
        private @Nullable Output<String> targetVpnGateway;
        private @Nullable Output<String> vpnGateway;
        private @Nullable Output<Integer> vpnGatewayInterface;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnTunnelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.labels = defaults.labels;
    	      this.localTrafficSelector = defaults.localTrafficSelector;
    	      this.name = defaults.name;
    	      this.peerExternalGateway = defaults.peerExternalGateway;
    	      this.peerExternalGatewayInterface = defaults.peerExternalGatewayInterface;
    	      this.peerGcpGateway = defaults.peerGcpGateway;
    	      this.peerIp = defaults.peerIp;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.remoteTrafficSelector = defaults.remoteTrafficSelector;
    	      this.requestId = defaults.requestId;
    	      this.router = defaults.router;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.sharedSecretHash = defaults.sharedSecretHash;
    	      this.targetVpnGateway = defaults.targetVpnGateway;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnGatewayInterface = defaults.vpnGatewayInterface;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ikeVersion(@Nullable Output<Integer> ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public Builder ikeVersion(@Nullable Integer ikeVersion) {
            this.ikeVersion = Codegen.ofNullable(ikeVersion);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder localTrafficSelector(@Nullable Output<List<String>> localTrafficSelector) {
            this.localTrafficSelector = localTrafficSelector;
            return this;
        }
        public Builder localTrafficSelector(@Nullable List<String> localTrafficSelector) {
            this.localTrafficSelector = Codegen.ofNullable(localTrafficSelector);
            return this;
        }
        public Builder localTrafficSelector(String... localTrafficSelector) {
            return localTrafficSelector(List.of(localTrafficSelector));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder peerExternalGateway(@Nullable Output<String> peerExternalGateway) {
            this.peerExternalGateway = peerExternalGateway;
            return this;
        }
        public Builder peerExternalGateway(@Nullable String peerExternalGateway) {
            this.peerExternalGateway = Codegen.ofNullable(peerExternalGateway);
            return this;
        }
        public Builder peerExternalGatewayInterface(@Nullable Output<Integer> peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = peerExternalGatewayInterface;
            return this;
        }
        public Builder peerExternalGatewayInterface(@Nullable Integer peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = Codegen.ofNullable(peerExternalGatewayInterface);
            return this;
        }
        public Builder peerGcpGateway(@Nullable Output<String> peerGcpGateway) {
            this.peerGcpGateway = peerGcpGateway;
            return this;
        }
        public Builder peerGcpGateway(@Nullable String peerGcpGateway) {
            this.peerGcpGateway = Codegen.ofNullable(peerGcpGateway);
            return this;
        }
        public Builder peerIp(@Nullable Output<String> peerIp) {
            this.peerIp = peerIp;
            return this;
        }
        public Builder peerIp(@Nullable String peerIp) {
            this.peerIp = Codegen.ofNullable(peerIp);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder remoteTrafficSelector(@Nullable Output<List<String>> remoteTrafficSelector) {
            this.remoteTrafficSelector = remoteTrafficSelector;
            return this;
        }
        public Builder remoteTrafficSelector(@Nullable List<String> remoteTrafficSelector) {
            this.remoteTrafficSelector = Codegen.ofNullable(remoteTrafficSelector);
            return this;
        }
        public Builder remoteTrafficSelector(String... remoteTrafficSelector) {
            return remoteTrafficSelector(List.of(remoteTrafficSelector));
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder router(@Nullable Output<String> router) {
            this.router = router;
            return this;
        }
        public Builder router(@Nullable String router) {
            this.router = Codegen.ofNullable(router);
            return this;
        }
        public Builder sharedSecret(@Nullable Output<String> sharedSecret) {
            this.sharedSecret = sharedSecret;
            return this;
        }
        public Builder sharedSecret(@Nullable String sharedSecret) {
            this.sharedSecret = Codegen.ofNullable(sharedSecret);
            return this;
        }
        public Builder sharedSecretHash(@Nullable Output<String> sharedSecretHash) {
            this.sharedSecretHash = sharedSecretHash;
            return this;
        }
        public Builder sharedSecretHash(@Nullable String sharedSecretHash) {
            this.sharedSecretHash = Codegen.ofNullable(sharedSecretHash);
            return this;
        }
        public Builder targetVpnGateway(@Nullable Output<String> targetVpnGateway) {
            this.targetVpnGateway = targetVpnGateway;
            return this;
        }
        public Builder targetVpnGateway(@Nullable String targetVpnGateway) {
            this.targetVpnGateway = Codegen.ofNullable(targetVpnGateway);
            return this;
        }
        public Builder vpnGateway(@Nullable Output<String> vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }
        public Builder vpnGateway(@Nullable String vpnGateway) {
            this.vpnGateway = Codegen.ofNullable(vpnGateway);
            return this;
        }
        public Builder vpnGatewayInterface(@Nullable Output<Integer> vpnGatewayInterface) {
            this.vpnGatewayInterface = vpnGatewayInterface;
            return this;
        }
        public Builder vpnGatewayInterface(@Nullable Integer vpnGatewayInterface) {
            this.vpnGatewayInterface = Codegen.ofNullable(vpnGatewayInterface);
            return this;
        }        public VpnTunnelArgs build() {
            return new VpnTunnelArgs(description, ikeVersion, labels, localTrafficSelector, name, peerExternalGateway, peerExternalGatewayInterface, peerGcpGateway, peerIp, project, region, remoteTrafficSelector, requestId, router, sharedSecret, sharedSecretHash, targetVpnGateway, vpnGateway, vpnGatewayInterface);
        }
    }
}
