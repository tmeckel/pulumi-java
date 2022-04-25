// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFileEventTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFileEventTriggerArgs Empty = new GetFileEventTriggerArgs();

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
     * The trigger name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The trigger name.
     * 
     */
    public String name() {
        return this.name;
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

    private GetFileEventTriggerArgs() {}

    private GetFileEventTriggerArgs(GetFileEventTriggerArgs $) {
        this.deviceName = $.deviceName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFileEventTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFileEventTriggerArgs $;

        public Builder() {
            $ = new GetFileEventTriggerArgs();
        }

        public Builder(GetFileEventTriggerArgs defaults) {
            $ = new GetFileEventTriggerArgs(Objects.requireNonNull(defaults));
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
         * @param name The trigger name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
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

        public GetFileEventTriggerArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
