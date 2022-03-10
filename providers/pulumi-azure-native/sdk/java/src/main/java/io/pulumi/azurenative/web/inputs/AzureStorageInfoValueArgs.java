// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.AzureStorageType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Files or Blob Storage access information value for dictionary storage.
 * 
 */
public final class AzureStorageInfoValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureStorageInfoValueArgs Empty = new AzureStorageInfoValueArgs();

    /**
     * Access key for the storage account.
     * 
     */
    @InputImport(name="accessKey")
      private final @Nullable Input<String> accessKey;

    public Input<String> getAccessKey() {
        return this.accessKey == null ? Input.empty() : this.accessKey;
    }

    /**
     * Name of the storage account.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * Path to mount the storage within the site's runtime environment.
     * 
     */
    @InputImport(name="mountPath")
      private final @Nullable Input<String> mountPath;

    public Input<String> getMountPath() {
        return this.mountPath == null ? Input.empty() : this.mountPath;
    }

    /**
     * Name of the file share (container name, for Blob storage).
     * 
     */
    @InputImport(name="shareName")
      private final @Nullable Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName == null ? Input.empty() : this.shareName;
    }

    /**
     * Type of storage.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<AzureStorageType> type;

    public Input<AzureStorageType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AzureStorageInfoValueArgs(
        @Nullable Input<String> accessKey,
        @Nullable Input<String> accountName,
        @Nullable Input<String> mountPath,
        @Nullable Input<String> shareName,
        @Nullable Input<AzureStorageType> type) {
        this.accessKey = accessKey;
        this.accountName = accountName;
        this.mountPath = mountPath;
        this.shareName = shareName;
        this.type = type;
    }

    private AzureStorageInfoValueArgs() {
        this.accessKey = Input.empty();
        this.accountName = Input.empty();
        this.mountPath = Input.empty();
        this.shareName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageInfoValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessKey;
        private @Nullable Input<String> accountName;
        private @Nullable Input<String> mountPath;
        private @Nullable Input<String> shareName;
        private @Nullable Input<AzureStorageType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageInfoValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountName = defaults.accountName;
    	      this.mountPath = defaults.mountPath;
    	      this.shareName = defaults.shareName;
    	      this.type = defaults.type;
        }

        public Builder accessKey(@Nullable Input<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = Input.ofNullable(accessKey);
            return this;
        }

        public Builder accountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder mountPath(@Nullable Input<String> mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = Input.ofNullable(mountPath);
            return this;
        }

        public Builder shareName(@Nullable Input<String> shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder shareName(@Nullable String shareName) {
            this.shareName = Input.ofNullable(shareName);
            return this;
        }

        public Builder type(@Nullable Input<AzureStorageType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable AzureStorageType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public AzureStorageInfoValueArgs build() {
            return new AzureStorageInfoValueArgs(accessKey, accountName, mountPath, shareName, type);
        }
    }
}
