// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListPartnerNamespaceSharedAccessKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListPartnerNamespaceSharedAccessKeysArgs Empty = new ListPartnerNamespaceSharedAccessKeysArgs();

    /**
     * Name of the partner namespace.
     * 
     */
    @Import(name="partnerNamespaceName", required=true)
    private String partnerNamespaceName;

    /**
     * @return Name of the partner namespace.
     * 
     */
    public String partnerNamespaceName() {
        return this.partnerNamespaceName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListPartnerNamespaceSharedAccessKeysArgs() {}

    private ListPartnerNamespaceSharedAccessKeysArgs(ListPartnerNamespaceSharedAccessKeysArgs $) {
        this.partnerNamespaceName = $.partnerNamespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListPartnerNamespaceSharedAccessKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListPartnerNamespaceSharedAccessKeysArgs $;

        public Builder() {
            $ = new ListPartnerNamespaceSharedAccessKeysArgs();
        }

        public Builder(ListPartnerNamespaceSharedAccessKeysArgs defaults) {
            $ = new ListPartnerNamespaceSharedAccessKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partnerNamespaceName Name of the partner namespace.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceName(String partnerNamespaceName) {
            $.partnerNamespaceName = partnerNamespaceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListPartnerNamespaceSharedAccessKeysArgs build() {
            $.partnerNamespaceName = Objects.requireNonNull($.partnerNamespaceName, "expected parameter 'partnerNamespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
