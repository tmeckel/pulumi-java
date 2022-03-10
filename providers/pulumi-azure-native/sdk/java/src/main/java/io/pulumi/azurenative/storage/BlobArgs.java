// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.enums.BlobAccessTier;
import io.pulumi.azurenative.storage.enums.BlobType;
import io.pulumi.core.AssetOrArchive;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobArgs Empty = new BlobArgs();

    /**
     * The access tier of the storage blob.
     * 
     */
    @InputImport(name="accessTier")
      private final @Nullable Input<BlobAccessTier> accessTier;

    public Input<BlobAccessTier> getAccessTier() {
        return this.accessTier == null ? Input.empty() : this.accessTier;
    }

    /**
     * Specifies the storage account in which to create the storage container.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the storage blob. Must be unique within the storage container the blob is located.
     * 
     */
    @InputImport(name="blobName")
      private final @Nullable Input<String> blobName;

    public Input<String> getBlobName() {
        return this.blobName == null ? Input.empty() : this.blobName;
    }

    /**
     * The name of the storage container in which this blob should be created.
     * 
     */
    @InputImport(name="containerName", required=true)
      private final Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName;
    }

    /**
     * The MD5 sum of the blob contents. Cannot be defined if blob type is Append.
     * 
     */
    @InputImport(name="contentMd5")
      private final @Nullable Input<String> contentMd5;

    public Input<String> getContentMd5() {
        return this.contentMd5 == null ? Input.empty() : this.contentMd5;
    }

    /**
     * The content type of the storage blob. Defaults to `application/octet-stream`.
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * A map of custom blob metadata.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * An asset to copy to the blob contents. This field cannot be specified for Append blobs.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<AssetOrArchive> source;

    public Input<AssetOrArchive> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The type of the storage blob to be created. Defaults to 'Block'.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<BlobType> type;

    public Input<BlobType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public BlobArgs(
        @Nullable Input<BlobAccessTier> accessTier,
        Input<String> accountName,
        @Nullable Input<String> blobName,
        Input<String> containerName,
        @Nullable Input<String> contentMd5,
        @Nullable Input<String> contentType,
        @Nullable Input<Map<String,String>> metadata,
        Input<String> resourceGroupName,
        @Nullable Input<AssetOrArchive> source,
        @Nullable Input<BlobType> type) {
        this.accessTier = accessTier;
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.blobName = blobName;
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.contentMd5 = contentMd5;
        this.contentType = contentType;
        this.metadata = metadata;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = source;
        this.type = type == null ? Input.ofNullable(io.pulumi.azurenative.storage.enums.BlobType.Block) : type;
    }

    private BlobArgs() {
        this.accessTier = Input.empty();
        this.accountName = Input.empty();
        this.blobName = Input.empty();
        this.containerName = Input.empty();
        this.contentMd5 = Input.empty();
        this.contentType = Input.empty();
        this.metadata = Input.empty();
        this.resourceGroupName = Input.empty();
        this.source = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BlobAccessTier> accessTier;
        private Input<String> accountName;
        private @Nullable Input<String> blobName;
        private Input<String> containerName;
        private @Nullable Input<String> contentMd5;
        private @Nullable Input<String> contentType;
        private @Nullable Input<Map<String,String>> metadata;
        private Input<String> resourceGroupName;
        private @Nullable Input<AssetOrArchive> source;
        private @Nullable Input<BlobType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.accountName = defaults.accountName;
    	      this.blobName = defaults.blobName;
    	      this.containerName = defaults.containerName;
    	      this.contentMd5 = defaults.contentMd5;
    	      this.contentType = defaults.contentType;
    	      this.metadata = defaults.metadata;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder accessTier(@Nullable Input<BlobAccessTier> accessTier) {
            this.accessTier = accessTier;
            return this;
        }

        public Builder accessTier(@Nullable BlobAccessTier accessTier) {
            this.accessTier = Input.ofNullable(accessTier);
            return this;
        }

        public Builder accountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder blobName(@Nullable Input<String> blobName) {
            this.blobName = blobName;
            return this;
        }

        public Builder blobName(@Nullable String blobName) {
            this.blobName = Input.ofNullable(blobName);
            return this;
        }

        public Builder containerName(Input<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder containerName(String containerName) {
            this.containerName = Input.of(Objects.requireNonNull(containerName));
            return this;
        }

        public Builder contentMd5(@Nullable Input<String> contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        public Builder contentMd5(@Nullable String contentMd5) {
            this.contentMd5 = Input.ofNullable(contentMd5);
            return this;
        }

        public Builder contentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder metadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
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

        public Builder source(@Nullable Input<AssetOrArchive> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable AssetOrArchive source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder type(@Nullable Input<BlobType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable BlobType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public BlobArgs build() {
            return new BlobArgs(accessTier, accountName, blobName, containerName, contentMd5, contentType, metadata, resourceGroupName, source, type);
        }
    }
}
