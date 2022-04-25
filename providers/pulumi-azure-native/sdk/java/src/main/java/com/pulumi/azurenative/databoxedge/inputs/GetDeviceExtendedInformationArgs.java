// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceExtendedInformationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceExtendedInformationArgs Empty = new GetDeviceExtendedInformationArgs();

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    /**
     * @return The device name.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDeviceExtendedInformationArgs() {}

    private GetDeviceExtendedInformationArgs(GetDeviceExtendedInformationArgs $) {
        this.deviceName = $.deviceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceExtendedInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceExtendedInformationArgs $;

        public Builder() {
            $ = new GetDeviceExtendedInformationArgs();
        }

        public Builder(GetDeviceExtendedInformationArgs defaults) {
            $ = new GetDeviceExtendedInformationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDeviceExtendedInformationArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
