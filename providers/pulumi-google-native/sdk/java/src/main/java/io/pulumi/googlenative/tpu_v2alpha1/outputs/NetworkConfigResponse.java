// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkConfigResponse {
    /**
     * Allows the TPU node to send and receive packets with non-matching destination or source IPs. This is required if you plan to use the TPU workers to forward routes.
     * 
     */
    private final Boolean canIpForward;
    /**
     * Indicates that external IP addresses would be associated with the TPU workers. If set to false, the specified subnetwork or network should have Private Google Access enabled.
     * 
     */
    private final Boolean enableExternalIps;
    /**
     * The name of the network for the TPU node. It must be a preexisting Google Compute Engine network. If none is provided, "default" will be used.
     * 
     */
    private final String network;
    /**
     * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine subnetwork. If none is provided, "default" will be used.
     * 
     */
    private final String subnetwork;

    @OutputCustomType.Constructor({"canIpForward","enableExternalIps","network","subnetwork"})
    private NetworkConfigResponse(
        Boolean canIpForward,
        Boolean enableExternalIps,
        String network,
        String subnetwork) {
        this.canIpForward = Objects.requireNonNull(canIpForward);
        this.enableExternalIps = Objects.requireNonNull(enableExternalIps);
        this.network = Objects.requireNonNull(network);
        this.subnetwork = Objects.requireNonNull(subnetwork);
    }

    /**
     * Allows the TPU node to send and receive packets with non-matching destination or source IPs. This is required if you plan to use the TPU workers to forward routes.
     * 
     */
    public Boolean getCanIpForward() {
        return this.canIpForward;
    }
    /**
     * Indicates that external IP addresses would be associated with the TPU workers. If set to false, the specified subnetwork or network should have Private Google Access enabled.
     * 
     */
    public Boolean getEnableExternalIps() {
        return this.enableExternalIps;
    }
    /**
     * The name of the network for the TPU node. It must be a preexisting Google Compute Engine network. If none is provided, "default" will be used.
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine subnetwork. If none is provided, "default" will be used.
     * 
     */
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canIpForward;
        private Boolean enableExternalIps;
        private String network;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.enableExternalIps = defaults.enableExternalIps;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setCanIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }

        public Builder setEnableExternalIps(Boolean enableExternalIps) {
            this.enableExternalIps = Objects.requireNonNull(enableExternalIps);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(canIpForward, enableExternalIps, network, subnetwork);
        }
    }
}
