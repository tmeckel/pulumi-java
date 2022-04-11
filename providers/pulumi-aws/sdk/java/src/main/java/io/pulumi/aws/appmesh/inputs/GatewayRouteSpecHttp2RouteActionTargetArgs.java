// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionTargetArgs Empty = new GatewayRouteSpecHttp2RouteActionTargetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @Import(name="virtualService", required=true)
      private final Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> virtualService;

    public Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> getVirtualService() {
        return this.virtualService;
    }

    public GatewayRouteSpecHttp2RouteActionTargetArgs(Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private GatewayRouteSpecHttp2RouteActionTargetArgs() {
        this.virtualService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteActionTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public Builder virtualService(GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs virtualService) {
            this.virtualService = Output.of(Objects.requireNonNull(virtualService));
            return this;
        }        public GatewayRouteSpecHttp2RouteActionTargetArgs build() {
            return new GatewayRouteSpecHttp2RouteActionTargetArgs(virtualService);
        }
    }
}
