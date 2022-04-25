// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProfileSupportedOptimizationTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProfileSupportedOptimizationTypesArgs Empty = new GetProfileSupportedOptimizationTypesArgs();

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    /**
     * @return Name of the CDN profile which is unique within the resource group.
     * 
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetProfileSupportedOptimizationTypesArgs() {}

    private GetProfileSupportedOptimizationTypesArgs(GetProfileSupportedOptimizationTypesArgs $) {
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProfileSupportedOptimizationTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProfileSupportedOptimizationTypesArgs $;

        public Builder() {
            $ = new GetProfileSupportedOptimizationTypesArgs();
        }

        public Builder(GetProfileSupportedOptimizationTypesArgs defaults) {
            $ = new GetProfileSupportedOptimizationTypesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param profileName Name of the CDN profile which is unique within the resource group.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetProfileSupportedOptimizationTypesArgs build() {
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
