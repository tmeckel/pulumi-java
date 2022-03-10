// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionArgs Empty = new GetPrivateEndpointConnectionArgs();

    /**
     * The name of the parent resource (namely, either, the topic name or domain name).
     * 
     */
    @InputImport(name="parentName", required=true)
      private final String parentName;

    public String getParentName() {
        return this.parentName;
    }

    /**
     * The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * 
     */
    @InputImport(name="parentType", required=true)
      private final String parentType;

    public String getParentType() {
        return this.parentType;
    }

    /**
     * The name of the private endpoint connection connection.
     * 
     */
    @InputImport(name="privateEndpointConnectionName", required=true)
      private final String privateEndpointConnectionName;

    public String getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPrivateEndpointConnectionArgs(
        String parentName,
        String parentType,
        String privateEndpointConnectionName,
        String resourceGroupName) {
        this.parentName = Objects.requireNonNull(parentName, "expected parameter 'parentName' to be non-null");
        this.parentType = Objects.requireNonNull(parentType, "expected parameter 'parentType' to be non-null");
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPrivateEndpointConnectionArgs() {
        this.parentName = null;
        this.parentType = null;
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parentName;
        private String parentType;
        private String privateEndpointConnectionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parentName = defaults.parentName;
    	      this.parentType = defaults.parentType;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder parentName(String parentName) {
            this.parentName = Objects.requireNonNull(parentName);
            return this;
        }

        public Builder parentType(String parentType) {
            this.parentType = Objects.requireNonNull(parentType);
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
        public GetPrivateEndpointConnectionArgs build() {
            return new GetPrivateEndpointConnectionArgs(parentName, parentType, privateEndpointConnectionName, resourceGroupName);
        }
    }
}
