// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage Account.
 * 
 */
public final class StorageAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountResponse Empty = new StorageAccountResponse();

    /**
     * The container in the storage account, only to be specified for WASB storage accounts.
     * 
     */
    @InputImport(name="container")
      private final @Nullable String container;

    public Optional<String> getContainer() {
        return this.container == null ? Optional.empty() : Optional.ofNullable(this.container);
    }

    /**
     * The filesystem, only to be specified for Azure Data Lake Storage Gen 2.
     * 
     */
    @InputImport(name="fileSystem")
      private final @Nullable String fileSystem;

    public Optional<String> getFileSystem() {
        return this.fileSystem == null ? Optional.empty() : Optional.ofNullable(this.fileSystem);
    }

    /**
     * The file share name.
     * 
     */
    @InputImport(name="fileshare")
      private final @Nullable String fileshare;

    public Optional<String> getFileshare() {
        return this.fileshare == null ? Optional.empty() : Optional.ofNullable(this.fileshare);
    }

    /**
     * Whether or not the storage account is the default storage account.
     * 
     */
    @InputImport(name="isDefault")
      private final @Nullable Boolean isDefault;

    public Optional<Boolean> getIsDefault() {
        return this.isDefault == null ? Optional.empty() : Optional.ofNullable(this.isDefault);
    }

    /**
     * The storage account access key.
     * 
     */
    @InputImport(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * The managed identity (MSI) that is allowed to access the storage account, only to be specified for Azure Data Lake Storage Gen 2.
     * 
     */
    @InputImport(name="msiResourceId")
      private final @Nullable String msiResourceId;

    public Optional<String> getMsiResourceId() {
        return this.msiResourceId == null ? Optional.empty() : Optional.ofNullable(this.msiResourceId);
    }

    /**
     * The name of the storage account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The resource ID of storage account, only to be specified for Azure Data Lake Storage Gen 2.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * The shared access signature key.
     * 
     */
    @InputImport(name="saskey")
      private final @Nullable String saskey;

    public Optional<String> getSaskey() {
        return this.saskey == null ? Optional.empty() : Optional.ofNullable(this.saskey);
    }

    public StorageAccountResponse(
        @Nullable String container,
        @Nullable String fileSystem,
        @Nullable String fileshare,
        @Nullable Boolean isDefault,
        @Nullable String key,
        @Nullable String msiResourceId,
        @Nullable String name,
        @Nullable String resourceId,
        @Nullable String saskey) {
        this.container = container;
        this.fileSystem = fileSystem;
        this.fileshare = fileshare;
        this.isDefault = isDefault;
        this.key = key;
        this.msiResourceId = msiResourceId;
        this.name = name;
        this.resourceId = resourceId;
        this.saskey = saskey;
    }

    private StorageAccountResponse() {
        this.container = null;
        this.fileSystem = null;
        this.fileshare = null;
        this.isDefault = null;
        this.key = null;
        this.msiResourceId = null;
        this.name = null;
        this.resourceId = null;
        this.saskey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String container;
        private @Nullable String fileSystem;
        private @Nullable String fileshare;
        private @Nullable Boolean isDefault;
        private @Nullable String key;
        private @Nullable String msiResourceId;
        private @Nullable String name;
        private @Nullable String resourceId;
        private @Nullable String saskey;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.fileSystem = defaults.fileSystem;
    	      this.fileshare = defaults.fileshare;
    	      this.isDefault = defaults.isDefault;
    	      this.key = defaults.key;
    	      this.msiResourceId = defaults.msiResourceId;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.saskey = defaults.saskey;
        }

        public Builder container(@Nullable String container) {
            this.container = container;
            return this;
        }

        public Builder fileSystem(@Nullable String fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder fileshare(@Nullable String fileshare) {
            this.fileshare = fileshare;
            return this;
        }

        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder msiResourceId(@Nullable String msiResourceId) {
            this.msiResourceId = msiResourceId;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder saskey(@Nullable String saskey) {
            this.saskey = saskey;
            return this;
        }
        public StorageAccountResponse build() {
            return new StorageAccountResponse(container, fileSystem, fileshare, isDefault, key, msiResourceId, name, resourceId, saskey);
        }
    }
}
