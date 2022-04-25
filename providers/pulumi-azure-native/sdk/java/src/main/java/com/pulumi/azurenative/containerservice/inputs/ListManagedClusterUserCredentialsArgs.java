// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListManagedClusterUserCredentialsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListManagedClusterUserCredentialsArgs Empty = new ListManagedClusterUserCredentialsArgs();

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

    /**
     * The name of the managed cluster resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the managed cluster resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private ListManagedClusterUserCredentialsArgs() {}

    private ListManagedClusterUserCredentialsArgs(ListManagedClusterUserCredentialsArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListManagedClusterUserCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListManagedClusterUserCredentialsArgs $;

        public Builder() {
            $ = new ListManagedClusterUserCredentialsArgs();
        }

        public Builder(ListManagedClusterUserCredentialsArgs defaults) {
            $ = new ListManagedClusterUserCredentialsArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param resourceName The name of the managed cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public ListManagedClusterUserCredentialsArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
