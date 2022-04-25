// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExpressRouteConnectionArgs Empty = new GetExpressRouteConnectionArgs();

    /**
     * The name of the ExpressRoute connection.
     * 
     */
    @Import(name="connectionName", required=true)
    private String connectionName;

    /**
     * @return The name of the ExpressRoute connection.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * The name of the ExpressRoute gateway.
     * 
     */
    @Import(name="expressRouteGatewayName", required=true)
    private String expressRouteGatewayName;

    /**
     * @return The name of the ExpressRoute gateway.
     * 
     */
    public String expressRouteGatewayName() {
        return this.expressRouteGatewayName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetExpressRouteConnectionArgs() {}

    private GetExpressRouteConnectionArgs(GetExpressRouteConnectionArgs $) {
        this.connectionName = $.connectionName;
        this.expressRouteGatewayName = $.expressRouteGatewayName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExpressRouteConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExpressRouteConnectionArgs $;

        public Builder() {
            $ = new GetExpressRouteConnectionArgs();
        }

        public Builder(GetExpressRouteConnectionArgs defaults) {
            $ = new GetExpressRouteConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName The name of the ExpressRoute connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param expressRouteGatewayName The name of the ExpressRoute gateway.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteGatewayName(String expressRouteGatewayName) {
            $.expressRouteGatewayName = expressRouteGatewayName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetExpressRouteConnectionArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.expressRouteGatewayName = Objects.requireNonNull($.expressRouteGatewayName, "expected parameter 'expressRouteGatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
