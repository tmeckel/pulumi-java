// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs Empty = new GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs();

    /**
     * The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualServiceName", required=true)
      private final Output<String> virtualServiceName;

    public Output<String> getVirtualServiceName() {
        return this.virtualServiceName;
    }

    public GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs(Output<String> virtualServiceName) {
        this.virtualServiceName = Objects.requireNonNull(virtualServiceName, "expected parameter 'virtualServiceName' to be non-null");
    }

    private GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs() {
        this.virtualServiceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> virtualServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualServiceName = defaults.virtualServiceName;
        }

        public Builder virtualServiceName(Output<String> virtualServiceName) {
            this.virtualServiceName = Objects.requireNonNull(virtualServiceName);
            return this;
        }
        public Builder virtualServiceName(String virtualServiceName) {
            this.virtualServiceName = Output.of(Objects.requireNonNull(virtualServiceName));
            return this;
        }        public GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs build() {
            return new GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs(virtualServiceName);
        }
    }
}
