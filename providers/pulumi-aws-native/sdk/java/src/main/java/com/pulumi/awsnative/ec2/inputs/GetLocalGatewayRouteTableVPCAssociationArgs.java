// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocalGatewayRouteTableVPCAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayRouteTableVPCAssociationArgs Empty = new GetLocalGatewayRouteTableVPCAssociationArgs();

    /**
     * The ID of the association.
     * 
     */
    @Import(name="localGatewayRouteTableVpcAssociationId", required=true)
    private String localGatewayRouteTableVpcAssociationId;

    /**
     * @return The ID of the association.
     * 
     */
    public String localGatewayRouteTableVpcAssociationId() {
        return this.localGatewayRouteTableVpcAssociationId;
    }

    private GetLocalGatewayRouteTableVPCAssociationArgs() {}

    private GetLocalGatewayRouteTableVPCAssociationArgs(GetLocalGatewayRouteTableVPCAssociationArgs $) {
        this.localGatewayRouteTableVpcAssociationId = $.localGatewayRouteTableVpcAssociationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewayRouteTableVPCAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewayRouteTableVPCAssociationArgs $;

        public Builder() {
            $ = new GetLocalGatewayRouteTableVPCAssociationArgs();
        }

        public Builder(GetLocalGatewayRouteTableVPCAssociationArgs defaults) {
            $ = new GetLocalGatewayRouteTableVPCAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localGatewayRouteTableVpcAssociationId The ID of the association.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableVpcAssociationId(String localGatewayRouteTableVpcAssociationId) {
            $.localGatewayRouteTableVpcAssociationId = localGatewayRouteTableVpcAssociationId;
            return this;
        }

        public GetLocalGatewayRouteTableVPCAssociationArgs build() {
            $.localGatewayRouteTableVpcAssociationId = Objects.requireNonNull($.localGatewayRouteTableVpcAssociationId, "expected parameter 'localGatewayRouteTableVpcAssociationId' to be non-null");
            return $;
        }
    }

}
