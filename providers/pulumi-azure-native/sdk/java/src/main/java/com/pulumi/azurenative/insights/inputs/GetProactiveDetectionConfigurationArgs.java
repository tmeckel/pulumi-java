// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProactiveDetectionConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProactiveDetectionConfigurationArgs Empty = new GetProactiveDetectionConfigurationArgs();

    /**
     * The ProactiveDetection configuration ID. This is unique within a Application Insights component.
     * 
     */
    @Import(name="configurationId", required=true)
    private String configurationId;

    /**
     * @return The ProactiveDetection configuration ID. This is unique within a Application Insights component.
     * 
     */
    public String configurationId() {
        return this.configurationId;
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

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the Application Insights component resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetProactiveDetectionConfigurationArgs() {}

    private GetProactiveDetectionConfigurationArgs(GetProactiveDetectionConfigurationArgs $) {
        this.configurationId = $.configurationId;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProactiveDetectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProactiveDetectionConfigurationArgs $;

        public Builder() {
            $ = new GetProactiveDetectionConfigurationArgs();
        }

        public Builder(GetProactiveDetectionConfigurationArgs defaults) {
            $ = new GetProactiveDetectionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights component.
         * 
         * @return builder
         * 
         */
        public Builder configurationId(String configurationId) {
            $.configurationId = configurationId;
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

        /**
         * @param resourceName The name of the Application Insights component resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetProactiveDetectionConfigurationArgs build() {
            $.configurationId = Objects.requireNonNull($.configurationId, "expected parameter 'configurationId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
