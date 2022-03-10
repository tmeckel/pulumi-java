// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationServiceEnvironmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationServiceEnvironmentArgs Empty = new GetIntegrationServiceEnvironmentArgs();

    /**
     * The integration service environment name.
     * 
     */
    @InputImport(name="integrationServiceEnvironmentName", required=true)
      private final String integrationServiceEnvironmentName;

    public String getIntegrationServiceEnvironmentName() {
        return this.integrationServiceEnvironmentName;
    }

    /**
     * The resource group.
     * 
     */
    @InputImport(name="resourceGroup", required=true)
      private final String resourceGroup;

    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public GetIntegrationServiceEnvironmentArgs(
        String integrationServiceEnvironmentName,
        String resourceGroup) {
        this.integrationServiceEnvironmentName = Objects.requireNonNull(integrationServiceEnvironmentName, "expected parameter 'integrationServiceEnvironmentName' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private GetIntegrationServiceEnvironmentArgs() {
        this.integrationServiceEnvironmentName = null;
        this.resourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationServiceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationServiceEnvironmentName;
        private String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationServiceEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationServiceEnvironmentName = defaults.integrationServiceEnvironmentName;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder integrationServiceEnvironmentName(String integrationServiceEnvironmentName) {
            this.integrationServiceEnvironmentName = Objects.requireNonNull(integrationServiceEnvironmentName);
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public GetIntegrationServiceEnvironmentArgs build() {
            return new GetIntegrationServiceEnvironmentArgs(integrationServiceEnvironmentName, resourceGroup);
        }
    }
}
