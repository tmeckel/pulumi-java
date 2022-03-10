// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetContainerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContainerArgs Empty = new GetContainerArgs();

    /**
     * The container Name
     * 
     */
    @InputImport(name="containerName", required=true)
      private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
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

    /**
     * The Storage Account Name
     * 
     */
    @InputImport(name="storageAccountName", required=true)
      private final String storageAccountName;

    public String getStorageAccountName() {
        return this.storageAccountName;
    }

    public GetContainerArgs(
        String containerName,
        String deviceName,
        String resourceGroupName,
        String storageAccountName) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
    }

    private GetContainerArgs() {
        this.containerName = null;
        this.deviceName = null;
        this.resourceGroupName = null;
        this.storageAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String deviceName;
        private String resourceGroupName;
        private String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public GetContainerArgs build() {
            return new GetContainerArgs(containerName, deviceName, resourceGroupName, storageAccountName);
        }
    }
}
