// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.NetworkRoutingConfigRoutingMode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A routing configuration attached to a network resource. The message includes the list of routers associated with the network, and a flag indicating the type of routing behavior to enforce network-wide.
 * 
 */
public final class NetworkRoutingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRoutingConfigArgs Empty = new NetworkRoutingConfigArgs();

    /**
     * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
     */
    @InputImport(name="routingMode")
      private final @Nullable Input<NetworkRoutingConfigRoutingMode> routingMode;

    public Input<NetworkRoutingConfigRoutingMode> getRoutingMode() {
        return this.routingMode == null ? Input.empty() : this.routingMode;
    }

    public NetworkRoutingConfigArgs(@Nullable Input<NetworkRoutingConfigRoutingMode> routingMode) {
        this.routingMode = routingMode;
    }

    private NetworkRoutingConfigArgs() {
        this.routingMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRoutingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NetworkRoutingConfigRoutingMode> routingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRoutingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingMode = defaults.routingMode;
        }

        public Builder routingMode(@Nullable Input<NetworkRoutingConfigRoutingMode> routingMode) {
            this.routingMode = routingMode;
            return this;
        }

        public Builder routingMode(@Nullable NetworkRoutingConfigRoutingMode routingMode) {
            this.routingMode = Input.ofNullable(routingMode);
            return this;
        }
        public NetworkRoutingConfigArgs build() {
            return new NetworkRoutingConfigArgs(routingMode);
        }
    }
}
