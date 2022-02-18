// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VpnGatewayInfoResponse {
    /**
     * Name of a VPN gateway.
     * 
     */
    private final String displayName;
    /**
     * IP address of the VPN gateway.
     * 
     */
    private final String ipAddress;
    /**
     * URI of a Compute Engine network where the VPN gateway is configured.
     * 
     */
    private final String networkUri;
    /**
     * Name of a Google Cloud region where this VPN gateway is configured.
     * 
     */
    private final String region;
    /**
     * URI of a VPN gateway.
     * 
     */
    private final String uri;
    /**
     * A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed.
     * 
     */
    private final String vpnTunnelUri;

    @OutputCustomType.Constructor({"displayName","ipAddress","networkUri","region","uri","vpnTunnelUri"})
    private VpnGatewayInfoResponse(
        String displayName,
        String ipAddress,
        String networkUri,
        String region,
        String uri,
        String vpnTunnelUri) {
        this.displayName = Objects.requireNonNull(displayName);
        this.ipAddress = Objects.requireNonNull(ipAddress);
        this.networkUri = Objects.requireNonNull(networkUri);
        this.region = Objects.requireNonNull(region);
        this.uri = Objects.requireNonNull(uri);
        this.vpnTunnelUri = Objects.requireNonNull(vpnTunnelUri);
    }

    /**
     * Name of a VPN gateway.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * IP address of the VPN gateway.
     * 
     */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * URI of a Compute Engine network where the VPN gateway is configured.
     * 
     */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Name of a Google Cloud region where this VPN gateway is configured.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * URI of a VPN gateway.
     * 
     */
    public String getUri() {
        return this.uri;
    }
    /**
     * A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed.
     * 
     */
    public String getVpnTunnelUri() {
        return this.vpnTunnelUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String ipAddress;
        private String networkUri;
        private String region;
        private String uri;
        private String vpnTunnelUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.uri = defaults.uri;
    	      this.vpnTunnelUri = defaults.vpnTunnelUri;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setVpnTunnelUri(String vpnTunnelUri) {
            this.vpnTunnelUri = Objects.requireNonNull(vpnTunnelUri);
            return this;
        }

        public VpnGatewayInfoResponse build() {
            return new VpnGatewayInfoResponse(displayName, ipAddress, networkUri, region, uri, vpnTunnelUri);
        }
    }
}
