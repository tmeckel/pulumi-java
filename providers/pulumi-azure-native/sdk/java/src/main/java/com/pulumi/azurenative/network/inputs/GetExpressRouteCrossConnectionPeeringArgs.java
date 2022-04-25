// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteCrossConnectionPeeringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExpressRouteCrossConnectionPeeringArgs Empty = new GetExpressRouteCrossConnectionPeeringArgs();

    /**
     * The name of the ExpressRouteCrossConnection.
     * 
     */
    @Import(name="crossConnectionName", required=true)
    private String crossConnectionName;

    /**
     * @return The name of the ExpressRouteCrossConnection.
     * 
     */
    public String crossConnectionName() {
        return this.crossConnectionName;
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private String peeringName;

    /**
     * @return The name of the peering.
     * 
     */
    public String peeringName() {
        return this.peeringName;
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

    private GetExpressRouteCrossConnectionPeeringArgs() {}

    private GetExpressRouteCrossConnectionPeeringArgs(GetExpressRouteCrossConnectionPeeringArgs $) {
        this.crossConnectionName = $.crossConnectionName;
        this.peeringName = $.peeringName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExpressRouteCrossConnectionPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExpressRouteCrossConnectionPeeringArgs $;

        public Builder() {
            $ = new GetExpressRouteCrossConnectionPeeringArgs();
        }

        public Builder(GetExpressRouteCrossConnectionPeeringArgs defaults) {
            $ = new GetExpressRouteCrossConnectionPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossConnectionName The name of the ExpressRouteCrossConnection.
         * 
         * @return builder
         * 
         */
        public Builder crossConnectionName(String crossConnectionName) {
            $.crossConnectionName = crossConnectionName;
            return this;
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            $.peeringName = peeringName;
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

        public GetExpressRouteCrossConnectionPeeringArgs build() {
            $.crossConnectionName = Objects.requireNonNull($.crossConnectionName, "expected parameter 'crossConnectionName' to be non-null");
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
