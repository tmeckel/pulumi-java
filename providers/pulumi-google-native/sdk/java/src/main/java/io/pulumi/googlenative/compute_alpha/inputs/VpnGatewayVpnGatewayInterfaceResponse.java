// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A VPN gateway interface.
 * 
 */
public final class VpnGatewayVpnGatewayInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnGatewayVpnGatewayInterfaceResponse Empty = new VpnGatewayVpnGatewayInterfaceResponse();

    /**
     * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for IPsec-encrypted Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource. Not currently available publicly.
     * 
     */
    @InputImport(name="interconnectAttachment", required=true)
      private final String interconnectAttachment;

    public String getInterconnectAttachment() {
        return this.interconnectAttachment;
    }

    /**
     * IP address for this VPN interface associated with the VPN gateway. The IP address could be either a regional external IP address or a regional internal IP address. The two IP addresses for a VPN gateway must be all regional external or regional internal IP addresses. There cannot be a mix of regional external IP addresses and regional internal IP addresses. For IPsec-encrypted Cloud Interconnect, the IP addresses for both interfaces could either be regional internal IP addresses or regional external IP addresses. For regular (non IPsec-encrypted Cloud Interconnect) HA VPN tunnels, the IP address must be a regional external IP address.
     * 
     */
    @InputImport(name="ipAddress", required=true)
      private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    public VpnGatewayVpnGatewayInterfaceResponse(
        String interconnectAttachment,
        String ipAddress) {
        this.interconnectAttachment = Objects.requireNonNull(interconnectAttachment, "expected parameter 'interconnectAttachment' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
    }

    private VpnGatewayVpnGatewayInterfaceResponse() {
        this.interconnectAttachment = null;
        this.ipAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayVpnGatewayInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interconnectAttachment;
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayVpnGatewayInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder interconnectAttachment(String interconnectAttachment) {
            this.interconnectAttachment = Objects.requireNonNull(interconnectAttachment);
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public VpnGatewayVpnGatewayInterfaceResponse build() {
            return new VpnGatewayVpnGatewayInterfaceResponse(interconnectAttachment, ipAddress);
        }
    }
}
