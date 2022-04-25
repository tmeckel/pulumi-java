// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateCloudArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateCloudArgs Empty = new GetPrivateCloudArgs();

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private String privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public String privateCloudName() {
        return this.privateCloudName;
    }

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

    private GetPrivateCloudArgs() {}

    private GetPrivateCloudArgs(GetPrivateCloudArgs $) {
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateCloudArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateCloudArgs $;

        public Builder() {
            $ = new GetPrivateCloudArgs();
        }

        public Builder(GetPrivateCloudArgs defaults) {
            $ = new GetPrivateCloudArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
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

        public GetPrivateCloudArgs build() {
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
