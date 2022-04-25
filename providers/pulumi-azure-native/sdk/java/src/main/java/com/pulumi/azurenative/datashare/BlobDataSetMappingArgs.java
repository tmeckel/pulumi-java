// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.datashare.enums.OutputType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlobDataSetMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobDataSetMappingArgs Empty = new BlobDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Container that has the file path.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return Container that has the file path.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @Import(name="dataSetId", required=true)
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @Import(name="dataSetMappingName")
    private @Nullable Output<String> dataSetMappingName;

    /**
     * @return The name of the data set mapping to be created.
     * 
     */
    public Optional<Output<String>> dataSetMappingName() {
        return Optional.ofNullable(this.dataSetMappingName);
    }

    /**
     * File path within the source data set
     * 
     */
    @Import(name="filePath", required=true)
    private Output<String> filePath;

    /**
     * @return File path within the source data set
     * 
     */
    public Output<String> filePath() {
        return this.filePath;
    }

    /**
     * Kind of data set mapping.
     * Expected value is &#39;Blob&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;Blob&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * File output type
     * 
     */
    @Import(name="outputType")
    private @Nullable Output<Either<String,OutputType>> outputType;

    /**
     * @return File output type
     * 
     */
    public Optional<Output<Either<String,OutputType>>> outputType() {
        return Optional.ofNullable(this.outputType);
    }

    /**
     * Resource group of storage account.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private Output<String> shareSubscriptionName;

    /**
     * @return The name of the share subscription which will hold the data set sink.
     * 
     */
    public Output<String> shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Storage account name of the source data set.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subscription id of storage account.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private BlobDataSetMappingArgs() {}

    private BlobDataSetMappingArgs(BlobDataSetMappingArgs $) {
        this.accountName = $.accountName;
        this.containerName = $.containerName;
        this.dataSetId = $.dataSetId;
        this.dataSetMappingName = $.dataSetMappingName;
        this.filePath = $.filePath;
        this.kind = $.kind;
        this.outputType = $.outputType;
        this.resourceGroup = $.resourceGroup;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
        this.storageAccountName = $.storageAccountName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobDataSetMappingArgs $;

        public Builder() {
            $ = new BlobDataSetMappingArgs();
        }

        public Builder(BlobDataSetMappingArgs defaults) {
            $ = new BlobDataSetMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param containerName Container that has the file path.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Container that has the file path.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param dataSetId The id of the source data set.
         * 
         * @return builder
         * 
         */
        public Builder dataSetId(Output<String> dataSetId) {
            $.dataSetId = dataSetId;
            return this;
        }

        /**
         * @param dataSetId The id of the source data set.
         * 
         * @return builder
         * 
         */
        public Builder dataSetId(String dataSetId) {
            return dataSetId(Output.of(dataSetId));
        }

        /**
         * @param dataSetMappingName The name of the data set mapping to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataSetMappingName(@Nullable Output<String> dataSetMappingName) {
            $.dataSetMappingName = dataSetMappingName;
            return this;
        }

        /**
         * @param dataSetMappingName The name of the data set mapping to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataSetMappingName(String dataSetMappingName) {
            return dataSetMappingName(Output.of(dataSetMappingName));
        }

        /**
         * @param filePath File path within the source data set
         * 
         * @return builder
         * 
         */
        public Builder filePath(Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath File path within the source data set
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param kind Kind of data set mapping.
         * Expected value is &#39;Blob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of data set mapping.
         * Expected value is &#39;Blob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param outputType File output type
         * 
         * @return builder
         * 
         */
        public Builder outputType(@Nullable Output<Either<String,OutputType>> outputType) {
            $.outputType = outputType;
            return this;
        }

        /**
         * @param outputType File output type
         * 
         * @return builder
         * 
         */
        public Builder outputType(Either<String,OutputType> outputType) {
            return outputType(Output.of(outputType));
        }

        /**
         * @param outputType File output type
         * 
         * @return builder
         * 
         */
        public Builder outputType(String outputType) {
            return outputType(Either.ofLeft(outputType));
        }

        /**
         * @param outputType File output type
         * 
         * @return builder
         * 
         */
        public Builder outputType(OutputType outputType) {
            return outputType(Either.ofRight(outputType));
        }

        /**
         * @param resourceGroup Resource group of storage account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup Resource group of storage account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shareSubscriptionName The name of the share subscription which will hold the data set sink.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        /**
         * @param shareSubscriptionName The name of the share subscription which will hold the data set sink.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            return shareSubscriptionName(Output.of(shareSubscriptionName));
        }

        /**
         * @param storageAccountName Storage account name of the source data set.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName Storage account name of the source data set.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param subscriptionId Subscription id of storage account.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription id of storage account.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public BlobDataSetMappingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.dataSetId = Objects.requireNonNull($.dataSetId, "expected parameter 'dataSetId' to be non-null");
            $.filePath = Objects.requireNonNull($.filePath, "expected parameter 'filePath' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
