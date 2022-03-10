// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.AzureBackupServerContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSClassicComputeVMContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSComputeVMContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureSQLAGWorkloadContainerProtectionContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureSqlContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureStorageContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureVMAppContainerProtectionContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.DpmContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.GenericContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.IaaSVMContainerArgs;
import io.pulumi.azurenative.recoveryservices.inputs.MabContainerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectionContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionContainerArgs Empty = new ProtectionContainerArgs();

    /**
     * Name of the container to be registered.
     * 
     */
    @InputImport(name="containerName")
      private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * Optional ETag.
     * 
     */
    @InputImport(name="eTag")
      private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Fabric name associated with the container.
     * 
     */
    @InputImport(name="fabricName", required=true)
      private final Input<String> fabricName;

    public Input<String> getFabricName() {
        return this.fabricName;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * ProtectionContainerResource properties
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @InputImport(name="vaultName", required=true)
      private final Input<String> vaultName;

    public Input<String> getVaultName() {
        return this.vaultName;
    }

    public ProtectionContainerArgs(
        @Nullable Input<String> containerName,
        @Nullable Input<String> eTag,
        Input<String> fabricName,
        @Nullable Input<String> location,
        @Nullable Input<Object> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> vaultName) {
        this.containerName = containerName;
        this.eTag = eTag;
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private ProtectionContainerArgs() {
        this.containerName = Input.empty();
        this.eTag = Input.empty();
        this.fabricName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerName;
        private @Nullable Input<String> eTag;
        private Input<String> fabricName;
        private @Nullable Input<String> location;
        private @Nullable Input<Object> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.eTag = defaults.eTag;
    	      this.fabricName = defaults.fabricName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder containerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder eTag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder fabricName(Input<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder fabricName(String fabricName) {
            this.fabricName = Input.of(Objects.requireNonNull(fabricName));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder properties(@Nullable Input<Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Object properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder vaultName(Input<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }

        public Builder vaultName(String vaultName) {
            this.vaultName = Input.of(Objects.requireNonNull(vaultName));
            return this;
        }
        public ProtectionContainerArgs build() {
            return new ProtectionContainerArgs(containerName, eTag, fabricName, location, properties, resourceGroupName, tags, vaultName);
        }
    }
}
