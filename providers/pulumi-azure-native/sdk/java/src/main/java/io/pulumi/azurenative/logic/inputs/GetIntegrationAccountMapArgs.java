// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountMapArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountMapArgs Empty = new GetIntegrationAccountMapArgs();

    /**
     * The integration account name.
     * 
     */
    @InputImport(name="integrationAccountName", required=true)
      private final String integrationAccountName;

    public String getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The integration account map name.
     * 
     */
    @InputImport(name="mapName", required=true)
      private final String mapName;

    public String getMapName() {
        return this.mapName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIntegrationAccountMapArgs(
        String integrationAccountName,
        String mapName,
        String resourceGroupName) {
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.mapName = Objects.requireNonNull(mapName, "expected parameter 'mapName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIntegrationAccountMapArgs() {
        this.integrationAccountName = null;
        this.mapName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationAccountName;
        private String mapName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.mapName = defaults.mapName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder mapName(String mapName) {
            this.mapName = Objects.requireNonNull(mapName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIntegrationAccountMapArgs build() {
            return new GetIntegrationAccountMapArgs(integrationAccountName, mapName, resourceGroupName);
        }
    }
}
