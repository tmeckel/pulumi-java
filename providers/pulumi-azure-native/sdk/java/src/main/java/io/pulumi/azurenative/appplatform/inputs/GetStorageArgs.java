// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStorageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStorageArgs Empty = new GetStorageArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * The name of the storage resource.
     * 
     */
    @InputImport(name="storageName", required=true)
      private final String storageName;

    public String getStorageName() {
        return this.storageName;
    }

    public GetStorageArgs(
        String resourceGroupName,
        String serviceName,
        String storageName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.storageName = Objects.requireNonNull(storageName, "expected parameter 'storageName' to be non-null");
    }

    private GetStorageArgs() {
        this.resourceGroupName = null;
        this.serviceName = null;
        this.storageName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serviceName;
        private String storageName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.storageName = defaults.storageName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder storageName(String storageName) {
            this.storageName = Objects.requireNonNull(storageName);
            return this;
        }
        public GetStorageArgs build() {
            return new GetStorageArgs(resourceGroupName, serviceName, storageName);
        }
    }
}
