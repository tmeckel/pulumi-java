// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.openenergyplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnergyServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnergyServiceArgs Empty = new GetEnergyServiceArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The resource name.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetEnergyServiceArgs() {}

    private GetEnergyServiceArgs(GetEnergyServiceArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnergyServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnergyServiceArgs $;

        public Builder() {
            $ = new GetEnergyServiceArgs();
        }

        public Builder(GetEnergyServiceArgs defaults) {
            $ = new GetEnergyServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The resource name.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetEnergyServiceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
