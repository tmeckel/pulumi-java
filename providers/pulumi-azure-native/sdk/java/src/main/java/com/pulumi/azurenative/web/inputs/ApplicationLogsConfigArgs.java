// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AzureBlobStorageApplicationLogsConfigArgs;
import com.pulumi.azurenative.web.inputs.AzureTableStorageApplicationLogsConfigArgs;
import com.pulumi.azurenative.web.inputs.FileSystemApplicationLogsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application logs configuration.
 * 
 */
public final class ApplicationLogsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationLogsConfigArgs Empty = new ApplicationLogsConfigArgs();

    /**
     * Application logs to blob storage configuration.
     * 
     */
    @Import(name="azureBlobStorage")
    private @Nullable Output<AzureBlobStorageApplicationLogsConfigArgs> azureBlobStorage;

    /**
     * @return Application logs to blob storage configuration.
     * 
     */
    public Optional<Output<AzureBlobStorageApplicationLogsConfigArgs>> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }

    /**
     * Application logs to azure table storage configuration.
     * 
     */
    @Import(name="azureTableStorage")
    private @Nullable Output<AzureTableStorageApplicationLogsConfigArgs> azureTableStorage;

    /**
     * @return Application logs to azure table storage configuration.
     * 
     */
    public Optional<Output<AzureTableStorageApplicationLogsConfigArgs>> azureTableStorage() {
        return Optional.ofNullable(this.azureTableStorage);
    }

    /**
     * Application logs to file system configuration.
     * 
     */
    @Import(name="fileSystem")
    private @Nullable Output<FileSystemApplicationLogsConfigArgs> fileSystem;

    /**
     * @return Application logs to file system configuration.
     * 
     */
    public Optional<Output<FileSystemApplicationLogsConfigArgs>> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    private ApplicationLogsConfigArgs() {}

    private ApplicationLogsConfigArgs(ApplicationLogsConfigArgs $) {
        this.azureBlobStorage = $.azureBlobStorage;
        this.azureTableStorage = $.azureTableStorage;
        this.fileSystem = $.fileSystem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationLogsConfigArgs $;

        public Builder() {
            $ = new ApplicationLogsConfigArgs();
        }

        public Builder(ApplicationLogsConfigArgs defaults) {
            $ = new ApplicationLogsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureBlobStorage Application logs to blob storage configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorage(@Nullable Output<AzureBlobStorageApplicationLogsConfigArgs> azureBlobStorage) {
            $.azureBlobStorage = azureBlobStorage;
            return this;
        }

        /**
         * @param azureBlobStorage Application logs to blob storage configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorage(AzureBlobStorageApplicationLogsConfigArgs azureBlobStorage) {
            return azureBlobStorage(Output.of(azureBlobStorage));
        }

        /**
         * @param azureTableStorage Application logs to azure table storage configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureTableStorage(@Nullable Output<AzureTableStorageApplicationLogsConfigArgs> azureTableStorage) {
            $.azureTableStorage = azureTableStorage;
            return this;
        }

        /**
         * @param azureTableStorage Application logs to azure table storage configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureTableStorage(AzureTableStorageApplicationLogsConfigArgs azureTableStorage) {
            return azureTableStorage(Output.of(azureTableStorage));
        }

        /**
         * @param fileSystem Application logs to file system configuration.
         * 
         * @return builder
         * 
         */
        public Builder fileSystem(@Nullable Output<FileSystemApplicationLogsConfigArgs> fileSystem) {
            $.fileSystem = fileSystem;
            return this;
        }

        /**
         * @param fileSystem Application logs to file system configuration.
         * 
         * @return builder
         * 
         */
        public Builder fileSystem(FileSystemApplicationLogsConfigArgs fileSystem) {
            return fileSystem(Output.of(fileSystem));
        }

        public ApplicationLogsConfigArgs build() {
            return $;
        }
    }

}
