// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The storage Account.
 * 
 */
public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The container in the storage account, only to be specified for WASB storage accounts.
     * 
     */
    @InputImport(name="container")
      private final @Nullable Input<String> container;

    public Input<String> getContainer() {
        return this.container == null ? Input.empty() : this.container;
    }

    /**
     * The filesystem, only to be specified for Azure Data Lake Storage Gen 2.
     * 
     */
    @InputImport(name="fileSystem")
      private final @Nullable Input<String> fileSystem;

    public Input<String> getFileSystem() {
        return this.fileSystem == null ? Input.empty() : this.fileSystem;
    }

    /**
     * The file share name.
     * 
     */
    @InputImport(name="fileshare")
      private final @Nullable Input<String> fileshare;

    public Input<String> getFileshare() {
        return this.fileshare == null ? Input.empty() : this.fileshare;
    }

    /**
     * Whether or not the storage account is the default storage account.
     * 
     */
    @InputImport(name="isDefault")
      private final @Nullable Input<Boolean> isDefault;

    public Input<Boolean> getIsDefault() {
        return this.isDefault == null ? Input.empty() : this.isDefault;
    }

    /**
     * The storage account access key.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The managed identity (MSI) that is allowed to access the storage account, only to be specified for Azure Data Lake Storage Gen 2.
     * 
     */
    @InputImport(name="msiResourceId")
      private final @Nullable Input<String> msiResourceId;

    public Input<String> getMsiResourceId() {
        return this.msiResourceId == null ? Input.empty() : this.msiResourceId;
    }

    /**
     * The name of the storage account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource ID of storage account, only to be specified for Azure Data Lake Storage Gen 2.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * The shared access signature key.
     * 
     */
    @InputImport(name="saskey")
      private final @Nullable Input<String> saskey;

    public Input<String> getSaskey() {
        return this.saskey == null ? Input.empty() : this.saskey;
    }

    public StorageAccountArgs(
        @Nullable Input<String> container,
        @Nullable Input<String> fileSystem,
        @Nullable Input<String> fileshare,
        @Nullable Input<Boolean> isDefault,
        @Nullable Input<String> key,
        @Nullable Input<String> msiResourceId,
        @Nullable Input<String> name,
        @Nullable Input<String> resourceId,
        @Nullable Input<String> saskey) {
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

    private StorageAccountArgs() {
        this.container = Input.empty();
        this.fileSystem = Input.empty();
        this.fileshare = Input.empty();
        this.isDefault = Input.empty();
        this.key = Input.empty();
        this.msiResourceId = Input.empty();
        this.name = Input.empty();
        this.resourceId = Input.empty();
        this.saskey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> container;
        private @Nullable Input<String> fileSystem;
        private @Nullable Input<String> fileshare;
        private @Nullable Input<Boolean> isDefault;
        private @Nullable Input<String> key;
        private @Nullable Input<String> msiResourceId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> resourceId;
        private @Nullable Input<String> saskey;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
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

        public Builder container(@Nullable Input<String> container) {
            this.container = container;
            return this;
        }

        public Builder container(@Nullable String container) {
            this.container = Input.ofNullable(container);
            return this;
        }

        public Builder fileSystem(@Nullable Input<String> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder fileSystem(@Nullable String fileSystem) {
            this.fileSystem = Input.ofNullable(fileSystem);
            return this;
        }

        public Builder fileshare(@Nullable Input<String> fileshare) {
            this.fileshare = fileshare;
            return this;
        }

        public Builder fileshare(@Nullable String fileshare) {
            this.fileshare = Input.ofNullable(fileshare);
            return this;
        }

        public Builder isDefault(@Nullable Input<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = Input.ofNullable(isDefault);
            return this;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder msiResourceId(@Nullable Input<String> msiResourceId) {
            this.msiResourceId = msiResourceId;
            return this;
        }

        public Builder msiResourceId(@Nullable String msiResourceId) {
            this.msiResourceId = Input.ofNullable(msiResourceId);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder resourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder saskey(@Nullable Input<String> saskey) {
            this.saskey = saskey;
            return this;
        }

        public Builder saskey(@Nullable String saskey) {
            this.saskey = Input.ofNullable(saskey);
            return this;
        }
        public StorageAccountArgs build() {
            return new StorageAccountArgs(container, fileSystem, fileshare, isDefault, key, msiResourceId, name, resourceId, saskey);
        }
    }
}
