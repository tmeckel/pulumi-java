// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blockchain.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBlockchainMemberArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBlockchainMemberArgs Empty = new GetBlockchainMemberArgs();

    /**
     * Blockchain member name.
     * 
     */
    @Import(name="blockchainMemberName", required=true)
    private String blockchainMemberName;

    /**
     * @return Blockchain member name.
     * 
     */
    public String blockchainMemberName() {
        return this.blockchainMemberName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetBlockchainMemberArgs() {}

    private GetBlockchainMemberArgs(GetBlockchainMemberArgs $) {
        this.blockchainMemberName = $.blockchainMemberName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBlockchainMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBlockchainMemberArgs $;

        public Builder() {
            $ = new GetBlockchainMemberArgs();
        }

        public Builder(GetBlockchainMemberArgs defaults) {
            $ = new GetBlockchainMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockchainMemberName Blockchain member name.
         * 
         * @return builder
         * 
         */
        public Builder blockchainMemberName(String blockchainMemberName) {
            $.blockchainMemberName = blockchainMemberName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetBlockchainMemberArgs build() {
            $.blockchainMemberName = Objects.requireNonNull($.blockchainMemberName, "expected parameter 'blockchainMemberName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
