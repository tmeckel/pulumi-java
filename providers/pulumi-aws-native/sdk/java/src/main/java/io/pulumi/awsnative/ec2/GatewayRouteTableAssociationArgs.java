// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteTableAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteTableAssociationArgs Empty = new GatewayRouteTableAssociationArgs();

    /**
     * The ID of the gateway.
     * 
     */
    @Import(name="gatewayId", required=true)
      private final Output<String> gatewayId;

    public Output<String> getGatewayId() {
        return this.gatewayId;
    }

    /**
     * The ID of the route table.
     * 
     */
    @Import(name="routeTableId", required=true)
      private final Output<String> routeTableId;

    public Output<String> getRouteTableId() {
        return this.routeTableId;
    }

    public GatewayRouteTableAssociationArgs(
        Output<String> gatewayId,
        Output<String> routeTableId) {
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.routeTableId = Objects.requireNonNull(routeTableId, "expected parameter 'routeTableId' to be non-null");
    }

    private GatewayRouteTableAssociationArgs() {
        this.gatewayId = Codegen.empty();
        this.routeTableId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteTableAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> gatewayId;
        private Output<String> routeTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteTableAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.routeTableId = defaults.routeTableId;
        }

        public Builder gatewayId(Output<String> gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Output.of(Objects.requireNonNull(gatewayId));
            return this;
        }
        public Builder routeTableId(Output<String> routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Output.of(Objects.requireNonNull(routeTableId));
            return this;
        }        public GatewayRouteTableAssociationArgs build() {
            return new GatewayRouteTableAssociationArgs(gatewayId, routeTableId);
        }
    }
}
