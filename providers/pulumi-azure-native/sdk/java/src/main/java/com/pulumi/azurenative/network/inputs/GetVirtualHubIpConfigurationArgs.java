// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualHubIpConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualHubIpConfigurationArgs Empty = new GetVirtualHubIpConfigurationArgs();

    /**
     * The name of the ipconfig.
     * 
     */
    @Import(name="ipConfigName", required=true)
    private String ipConfigName;

    /**
     * @return The name of the ipconfig.
     * 
     */
    public String ipConfigName() {
        return this.ipConfigName;
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the VirtualHub.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName", required=true)
    private String virtualHubName;

    /**
     * @return The name of the VirtualHub.
     * 
     */
    public String virtualHubName() {
        return this.virtualHubName;
    }

    private GetVirtualHubIpConfigurationArgs() {}

    private GetVirtualHubIpConfigurationArgs(GetVirtualHubIpConfigurationArgs $) {
        this.ipConfigName = $.ipConfigName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualHubIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualHubIpConfigurationArgs $;

        public Builder() {
            $ = new GetVirtualHubIpConfigurationArgs();
        }

        public Builder(GetVirtualHubIpConfigurationArgs defaults) {
            $ = new GetVirtualHubIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipConfigName The name of the ipconfig.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigName(String ipConfigName) {
            $.ipConfigName = ipConfigName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(String virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        public GetVirtualHubIpConfigurationArgs build() {
            $.ipConfigName = Objects.requireNonNull($.ipConfigName, "expected parameter 'ipConfigName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
