// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceFileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceFileResponse Empty = new ResourceFileResponse();

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified.
     * 
     */
    @Import(name="autoStorageContainerName")
    private @Nullable String autoStorageContainerName;

    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified.
     * 
     */
    public Optional<String> autoStorageContainerName() {
        return Optional.ofNullable(this.autoStorageContainerName);
    }

    /**
     * The property is valid only when autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    @Import(name="blobPrefix")
    private @Nullable String blobPrefix;

    /**
     * @return The property is valid only when autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    public Optional<String> blobPrefix() {
        return Optional.ofNullable(this.blobPrefix);
    }

    /**
     * This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    @Import(name="fileMode")
    private @Nullable String fileMode;

    /**
     * @return This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    public Optional<String> fileMode() {
        return Optional.ofNullable(this.fileMode);
    }

    /**
     * If the httpUrl property is specified, the filePath is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In the case where filePath is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
     * 
     */
    @Import(name="filePath")
    private @Nullable String filePath;

    /**
     * @return If the httpUrl property is specified, the filePath is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In the case where filePath is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @Import(name="httpUrl")
    private @Nullable String httpUrl;

    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    public Optional<String> httpUrl() {
        return Optional.ofNullable(this.httpUrl);
    }

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @Import(name="storageContainerUrl")
    private @Nullable String storageContainerUrl;

    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    public Optional<String> storageContainerUrl() {
        return Optional.ofNullable(this.storageContainerUrl);
    }

    private ResourceFileResponse() {}

    private ResourceFileResponse(ResourceFileResponse $) {
        this.autoStorageContainerName = $.autoStorageContainerName;
        this.blobPrefix = $.blobPrefix;
        this.fileMode = $.fileMode;
        this.filePath = $.filePath;
        this.httpUrl = $.httpUrl;
        this.storageContainerUrl = $.storageContainerUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceFileResponse $;

        public Builder() {
            $ = new ResourceFileResponse();
        }

        public Builder(ResourceFileResponse defaults) {
            $ = new ResourceFileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoStorageContainerName The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified.
         * 
         * @return builder
         * 
         */
        public Builder autoStorageContainerName(@Nullable String autoStorageContainerName) {
            $.autoStorageContainerName = autoStorageContainerName;
            return this;
        }

        /**
         * @param blobPrefix The property is valid only when autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
         * 
         * @return builder
         * 
         */
        public Builder blobPrefix(@Nullable String blobPrefix) {
            $.blobPrefix = blobPrefix;
            return this;
        }

        /**
         * @param fileMode This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
         * 
         * @return builder
         * 
         */
        public Builder fileMode(@Nullable String fileMode) {
            $.fileMode = fileMode;
            return this;
        }

        /**
         * @param filePath If the httpUrl property is specified, the filePath is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In the case where filePath is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable String filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param httpUrl The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
         * 
         * @return builder
         * 
         */
        public Builder httpUrl(@Nullable String httpUrl) {
            $.httpUrl = httpUrl;
            return this;
        }

        /**
         * @param storageContainerUrl The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerUrl(@Nullable String storageContainerUrl) {
            $.storageContainerUrl = storageContainerUrl;
            return this;
        }

        public ResourceFileResponse build() {
            return $;
        }
    }

}
