// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTopologyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTopologyArgs Empty = new GetServiceTopologyArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service topology .
     * 
     */
    @InputImport(name="serviceTopologyName", required=true)
      private final String serviceTopologyName;

    public String getServiceTopologyName() {
        return this.serviceTopologyName;
    }

    public GetServiceTopologyArgs(
        String resourceGroupName,
        String serviceTopologyName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName, "expected parameter 'serviceTopologyName' to be non-null");
    }

    private GetServiceTopologyArgs() {
        this.resourceGroupName = null;
        this.serviceTopologyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serviceTopologyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTopologyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceTopologyName = defaults.serviceTopologyName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serviceTopologyName(String serviceTopologyName) {
            this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName);
            return this;
        }
        public GetServiceTopologyArgs build() {
            return new GetServiceTopologyArgs(resourceGroupName, serviceTopologyName);
        }
    }
}
