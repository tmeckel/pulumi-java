// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * NetworkInterface represents a NIC of a VM.
 * 
 */
public final class NetworkInterfaceResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResponse Empty = new NetworkInterfaceResponse();

    /**
     * The external IP to define in the NIC.
     * 
     */
    @Import(name="externalIp", required=true)
    private String externalIp;

    /**
     * @return The external IP to define in the NIC.
     * 
     */
    public String externalIp() {
        return this.externalIp;
    }

    /**
     * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
     */
    @Import(name="internalIp", required=true)
    private String internalIp;

    /**
     * @return The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
     */
    public String internalIp() {
        return this.internalIp;
    }

    /**
     * The network to connect the NIC to.
     * 
     */
    @Import(name="network", required=true)
    private String network;

    /**
     * @return The network to connect the NIC to.
     * 
     */
    public String network() {
        return this.network;
    }

    /**
     * The subnetwork to connect the NIC to.
     * 
     */
    @Import(name="subnetwork", required=true)
    private String subnetwork;

    /**
     * @return The subnetwork to connect the NIC to.
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }

    private NetworkInterfaceResponse() {}

    private NetworkInterfaceResponse(NetworkInterfaceResponse $) {
        this.externalIp = $.externalIp;
        this.internalIp = $.internalIp;
        this.network = $.network;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceResponse $;

        public Builder() {
            $ = new NetworkInterfaceResponse();
        }

        public Builder(NetworkInterfaceResponse defaults) {
            $ = new NetworkInterfaceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalIp The external IP to define in the NIC.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(String externalIp) {
            $.externalIp = externalIp;
            return this;
        }

        /**
         * @param internalIp The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
         * 
         * @return builder
         * 
         */
        public Builder internalIp(String internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param network The network to connect the NIC to.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            $.network = network;
            return this;
        }

        /**
         * @param subnetwork The subnetwork to connect the NIC to.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        public NetworkInterfaceResponse build() {
            $.externalIp = Objects.requireNonNull($.externalIp, "expected parameter 'externalIp' to be non-null");
            $.internalIp = Objects.requireNonNull($.internalIp, "expected parameter 'internalIp' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.subnetwork = Objects.requireNonNull($.subnetwork, "expected parameter 'subnetwork' to be non-null");
            return $;
        }
    }

}
