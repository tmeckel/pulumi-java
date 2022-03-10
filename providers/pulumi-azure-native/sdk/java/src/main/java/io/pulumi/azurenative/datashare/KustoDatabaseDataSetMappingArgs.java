// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KustoDatabaseDataSetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final KustoDatabaseDataSetMappingArgs Empty = new KustoDatabaseDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @InputImport(name="dataSetId", required=true)
      private final Input<String> dataSetId;

    public Input<String> getDataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @InputImport(name="dataSetMappingName")
      private final @Nullable Input<String> dataSetMappingName;

    public Input<String> getDataSetMappingName() {
        return this.dataSetMappingName == null ? Input.empty() : this.dataSetMappingName;
    }

    /**
     * Kind of data set mapping.
     * Expected value is 'KustoDatabase'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Resource id of the sink kusto cluster.
     * 
     */
    @InputImport(name="kustoClusterResourceId", required=true)
      private final Input<String> kustoClusterResourceId;

    public Input<String> getKustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
      private final Input<String> shareSubscriptionName;

    public Input<String> getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    public KustoDatabaseDataSetMappingArgs(
        Input<String> accountName,
        Input<String> dataSetId,
        @Nullable Input<String> dataSetMappingName,
        Input<String> kind,
        Input<String> kustoClusterResourceId,
        Input<String> resourceGroupName,
        Input<String> shareSubscriptionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetId = Objects.requireNonNull(dataSetId, "expected parameter 'dataSetId' to be non-null");
        this.dataSetMappingName = dataSetMappingName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.kustoClusterResourceId = Objects.requireNonNull(kustoClusterResourceId, "expected parameter 'kustoClusterResourceId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
    }

    private KustoDatabaseDataSetMappingArgs() {
        this.accountName = Input.empty();
        this.dataSetId = Input.empty();
        this.dataSetMappingName = Input.empty();
        this.kind = Input.empty();
        this.kustoClusterResourceId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareSubscriptionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KustoDatabaseDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> dataSetId;
        private @Nullable Input<String> dataSetMappingName;
        private Input<String> kind;
        private Input<String> kustoClusterResourceId;
        private Input<String> resourceGroupName;
        private Input<String> shareSubscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(KustoDatabaseDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.kind = defaults.kind;
    	      this.kustoClusterResourceId = defaults.kustoClusterResourceId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
        }

        public Builder accountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder dataSetId(Input<String> dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Input.of(Objects.requireNonNull(dataSetId));
            return this;
        }

        public Builder dataSetMappingName(@Nullable Input<String> dataSetMappingName) {
            this.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder dataSetMappingName(@Nullable String dataSetMappingName) {
            this.dataSetMappingName = Input.ofNullable(dataSetMappingName);
            return this;
        }

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder kustoClusterResourceId(Input<String> kustoClusterResourceId) {
            this.kustoClusterResourceId = Objects.requireNonNull(kustoClusterResourceId);
            return this;
        }

        public Builder kustoClusterResourceId(String kustoClusterResourceId) {
            this.kustoClusterResourceId = Input.of(Objects.requireNonNull(kustoClusterResourceId));
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

        public Builder shareSubscriptionName(Input<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Input.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }
        public KustoDatabaseDataSetMappingArgs build() {
            return new KustoDatabaseDataSetMappingArgs(accountName, dataSetId, dataSetMappingName, kind, kustoClusterResourceId, resourceGroupName, shareSubscriptionName);
        }
    }
}
