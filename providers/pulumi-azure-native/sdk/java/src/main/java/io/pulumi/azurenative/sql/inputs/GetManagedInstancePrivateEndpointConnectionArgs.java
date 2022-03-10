// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagedInstancePrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagedInstancePrivateEndpointConnectionArgs Empty = new GetManagedInstancePrivateEndpointConnectionArgs();

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName", required=true)
      private final String managedInstanceName;

    public String getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the private endpoint connection.
     * 
     */
    @InputImport(name="privateEndpointConnectionName", required=true)
      private final String privateEndpointConnectionName;

    public String getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetManagedInstancePrivateEndpointConnectionArgs(
        String managedInstanceName,
        String privateEndpointConnectionName,
        String resourceGroupName) {
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetManagedInstancePrivateEndpointConnectionArgs() {
        this.managedInstanceName = null;
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedInstancePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedInstanceName;
        private String privateEndpointConnectionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedInstancePrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder managedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetManagedInstancePrivateEndpointConnectionArgs build() {
            return new GetManagedInstancePrivateEndpointConnectionArgs(managedInstanceName, privateEndpointConnectionName, resourceGroupName);
        }
    }
}
