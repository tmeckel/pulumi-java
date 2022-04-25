// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceArgs Empty = new GetDeviceArgs();

    /**
     * The name of the device resource.
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    /**
     * @return The name of the device resource.
     * 
     */
    public String deviceName() {
        return this.deviceName;
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

    private GetDeviceArgs() {}

    private GetDeviceArgs(GetDeviceArgs $) {
        this.deviceName = $.deviceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceArgs $;

        public Builder() {
            $ = new GetDeviceArgs();
        }

        public Builder(GetDeviceArgs defaults) {
            $ = new GetDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName The name of the device resource.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
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

        public GetDeviceArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
