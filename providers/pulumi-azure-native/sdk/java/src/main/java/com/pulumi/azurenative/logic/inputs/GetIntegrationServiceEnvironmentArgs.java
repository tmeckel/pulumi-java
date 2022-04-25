// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationServiceEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationServiceEnvironmentArgs Empty = new GetIntegrationServiceEnvironmentArgs();

    /**
     * The integration service environment name.
     * 
     */
    @Import(name="integrationServiceEnvironmentName", required=true)
    private String integrationServiceEnvironmentName;

    /**
     * @return The integration service environment name.
     * 
     */
    public String integrationServiceEnvironmentName() {
        return this.integrationServiceEnvironmentName;
    }

    /**
     * The resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private String resourceGroup;

    /**
     * @return The resource group.
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    private GetIntegrationServiceEnvironmentArgs() {}

    private GetIntegrationServiceEnvironmentArgs(GetIntegrationServiceEnvironmentArgs $) {
        this.integrationServiceEnvironmentName = $.integrationServiceEnvironmentName;
        this.resourceGroup = $.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationServiceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationServiceEnvironmentArgs $;

        public Builder() {
            $ = new GetIntegrationServiceEnvironmentArgs();
        }

        public Builder(GetIntegrationServiceEnvironmentArgs defaults) {
            $ = new GetIntegrationServiceEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationServiceEnvironmentName The integration service environment name.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentName(String integrationServiceEnvironmentName) {
            $.integrationServiceEnvironmentName = integrationServiceEnvironmentName;
            return this;
        }

        /**
         * @param resourceGroup The resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        public GetIntegrationServiceEnvironmentArgs build() {
            $.integrationServiceEnvironmentName = Objects.requireNonNull($.integrationServiceEnvironmentName, "expected parameter 'integrationServiceEnvironmentName' to be non-null");
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            return $;
        }
    }

}
