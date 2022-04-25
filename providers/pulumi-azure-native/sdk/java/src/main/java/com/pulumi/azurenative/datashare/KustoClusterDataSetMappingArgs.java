// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KustoClusterDataSetMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final KustoClusterDataSetMappingArgs Empty = new KustoClusterDataSetMappingArgs();

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
     * Kind of data set mapping.
     * Expected value is &#39;KustoCluster&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;KustoCluster&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource id of the sink kusto cluster.
     * 
     */
    @Import(name="kustoClusterResourceId", required=true)
    private Output<String> kustoClusterResourceId;

    /**
     * @return Resource id of the sink kusto cluster.
     * 
     */
    public Output<String> kustoClusterResourceId() {
        return this.kustoClusterResourceId;
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

    private KustoClusterDataSetMappingArgs() {}

    private KustoClusterDataSetMappingArgs(KustoClusterDataSetMappingArgs $) {
        this.accountName = $.accountName;
        this.dataSetId = $.dataSetId;
        this.dataSetMappingName = $.dataSetMappingName;
        this.kind = $.kind;
        this.kustoClusterResourceId = $.kustoClusterResourceId;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KustoClusterDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KustoClusterDataSetMappingArgs $;

        public Builder() {
            $ = new KustoClusterDataSetMappingArgs();
        }

        public Builder(KustoClusterDataSetMappingArgs defaults) {
            $ = new KustoClusterDataSetMappingArgs(Objects.requireNonNull(defaults));
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
         * @param kind Kind of data set mapping.
         * Expected value is &#39;KustoCluster&#39;.
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
         * Expected value is &#39;KustoCluster&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kustoClusterResourceId Resource id of the sink kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder kustoClusterResourceId(Output<String> kustoClusterResourceId) {
            $.kustoClusterResourceId = kustoClusterResourceId;
            return this;
        }

        /**
         * @param kustoClusterResourceId Resource id of the sink kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder kustoClusterResourceId(String kustoClusterResourceId) {
            return kustoClusterResourceId(Output.of(kustoClusterResourceId));
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

        public KustoClusterDataSetMappingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetId = Objects.requireNonNull($.dataSetId, "expected parameter 'dataSetId' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.kustoClusterResourceId = Objects.requireNonNull($.kustoClusterResourceId, "expected parameter 'kustoClusterResourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            return $;
        }
    }

}
