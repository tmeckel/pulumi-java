// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network related configurations.
 * 
 */
public final class NetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * Allows the TPU node to send and receive packets with non-matching destination or source IPs. This is required if you plan to use the TPU workers to forward routes.
     * 
     */
    @InputImport(name="canIpForward")
      private final @Nullable Input<Boolean> canIpForward;

    public Input<Boolean> getCanIpForward() {
        return this.canIpForward == null ? Input.empty() : this.canIpForward;
    }

    /**
     * Indicates that external IP addresses would be associated with the TPU workers. If set to false, the specified subnetwork or network should have Private Google Access enabled.
     * 
     */
    @InputImport(name="enableExternalIps")
      private final @Nullable Input<Boolean> enableExternalIps;

    public Input<Boolean> getEnableExternalIps() {
        return this.enableExternalIps == null ? Input.empty() : this.enableExternalIps;
    }

    /**
     * The name of the network for the TPU node. It must be a preexisting Google Compute Engine network. If none is provided, "default" will be used.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine subnetwork. If none is provided, "default" will be used.
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    public NetworkConfigArgs(
        @Nullable Input<Boolean> canIpForward,
        @Nullable Input<Boolean> enableExternalIps,
        @Nullable Input<String> network,
        @Nullable Input<String> subnetwork) {
        this.canIpForward = canIpForward;
        this.enableExternalIps = enableExternalIps;
        this.network = network;
        this.subnetwork = subnetwork;
    }

    private NetworkConfigArgs() {
        this.canIpForward = Input.empty();
        this.enableExternalIps = Input.empty();
        this.network = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> canIpForward;
        private @Nullable Input<Boolean> enableExternalIps;
        private @Nullable Input<String> network;
        private @Nullable Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.enableExternalIps = defaults.enableExternalIps;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder canIpForward(@Nullable Input<Boolean> canIpForward) {
            this.canIpForward = canIpForward;
            return this;
        }

        public Builder canIpForward(@Nullable Boolean canIpForward) {
            this.canIpForward = Input.ofNullable(canIpForward);
            return this;
        }

        public Builder enableExternalIps(@Nullable Input<Boolean> enableExternalIps) {
            this.enableExternalIps = enableExternalIps;
            return this;
        }

        public Builder enableExternalIps(@Nullable Boolean enableExternalIps) {
            this.enableExternalIps = Input.ofNullable(enableExternalIps);
            return this;
        }

        public Builder network(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder subnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }
        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(canIpForward, enableExternalIps, network, subnetwork);
        }
    }
}
