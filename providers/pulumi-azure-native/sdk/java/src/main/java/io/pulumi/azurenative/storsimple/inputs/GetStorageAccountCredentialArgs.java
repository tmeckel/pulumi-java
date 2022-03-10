// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStorageAccountCredentialArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStorageAccountCredentialArgs Empty = new GetStorageAccountCredentialArgs();

    /**
     * The manager name
     * 
     */
    @InputImport(name="managerName", required=true)
      private final String managerName;

    public String getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of storage account credential to be fetched.
     * 
     */
    @InputImport(name="storageAccountCredentialName", required=true)
      private final String storageAccountCredentialName;

    public String getStorageAccountCredentialName() {
        return this.storageAccountCredentialName;
    }

    public GetStorageAccountCredentialArgs(
        String managerName,
        String resourceGroupName,
        String storageAccountCredentialName) {
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountCredentialName = Objects.requireNonNull(storageAccountCredentialName, "expected parameter 'storageAccountCredentialName' to be non-null");
    }

    private GetStorageAccountCredentialArgs() {
        this.managerName = null;
        this.resourceGroupName = null;
        this.storageAccountCredentialName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageAccountCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managerName;
        private String resourceGroupName;
        private String storageAccountCredentialName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageAccountCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountCredentialName = defaults.storageAccountCredentialName;
        }

        public Builder managerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder storageAccountCredentialName(String storageAccountCredentialName) {
            this.storageAccountCredentialName = Objects.requireNonNull(storageAccountCredentialName);
            return this;
        }
        public GetStorageAccountCredentialArgs build() {
            return new GetStorageAccountCredentialArgs(managerName, resourceGroupName, storageAccountCredentialName);
        }
    }
}
