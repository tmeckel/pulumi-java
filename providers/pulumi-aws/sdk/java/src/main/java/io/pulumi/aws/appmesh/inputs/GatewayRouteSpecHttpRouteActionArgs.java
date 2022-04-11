// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionArgs Empty = new GatewayRouteSpecHttpRouteActionArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @Import(name="target", required=true)
      private final Output<GatewayRouteSpecHttpRouteActionTargetArgs> target;

    public Output<GatewayRouteSpecHttpRouteActionTargetArgs> getTarget() {
        return this.target;
    }

    public GatewayRouteSpecHttpRouteActionArgs(Output<GatewayRouteSpecHttpRouteActionTargetArgs> target) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private GatewayRouteSpecHttpRouteActionArgs() {
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttpRouteActionTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder target(Output<GatewayRouteSpecHttpRouteActionTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(GatewayRouteSpecHttpRouteActionTargetArgs target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public GatewayRouteSpecHttpRouteActionArgs build() {
            return new GatewayRouteSpecHttpRouteActionArgs(target);
        }
    }
}
