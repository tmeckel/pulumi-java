// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudsearch_v1.inputs.GSuitePrincipalArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * If true, sets the datasource to read-only mode. In read-only mode, the Indexing API rejects any requests to index or delete items in this source. Enabling read-only mode does not stop the processing of previously accepted data.
     * 
     */
    @Import(name="disableModifications")
      private final @Nullable Output<Boolean> disableModifications;

    public Output<Boolean> getDisableModifications() {
        return this.disableModifications == null ? Codegen.empty() : this.disableModifications;
    }

    /**
     * Disable serving any search or assist results.
     * 
     */
    @Import(name="disableServing")
      private final @Nullable Output<Boolean> disableServing;

    public Output<Boolean> getDisableServing() {
        return this.disableServing == null ? Codegen.empty() : this.disableServing;
    }

    /**
     * Display name of the datasource The maximum length is 300 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * List of service accounts that have indexing access.
     * 
     */
    @Import(name="indexingServiceAccounts")
      private final @Nullable Output<List<String>> indexingServiceAccounts;

    public Output<List<String>> getIndexingServiceAccounts() {
        return this.indexingServiceAccounts == null ? Codegen.empty() : this.indexingServiceAccounts;
    }

    /**
     * This field restricts visibility to items at the datasource level. Items within the datasource are restricted to the union of users and groups included in this field. Note that, this does not ensure access to a specific item, as users need to have ACL permissions on the contained items. This ensures a high level access on the entire datasource, and that the individual items are not shared outside this visibility.
     * 
     */
    @Import(name="itemsVisibility")
      private final @Nullable Output<List<GSuitePrincipalArgs>> itemsVisibility;

    public Output<List<GSuitePrincipalArgs>> getItemsVisibility() {
        return this.itemsVisibility == null ? Codegen.empty() : this.itemsVisibility;
    }

    /**
     * Name of the datasource resource. Format: datasources/{source_id}. The name is ignored when creating a datasource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * IDs of the Long Running Operations (LROs) currently running for this schema.
     * 
     */
    @Import(name="operationIds")
      private final @Nullable Output<List<String>> operationIds;

    public Output<List<String>> getOperationIds() {
        return this.operationIds == null ? Codegen.empty() : this.operationIds;
    }

    /**
     * Can a user request to get thumbnail URI for Items indexed in this data source.
     * 
     */
    @Import(name="returnThumbnailUrls")
      private final @Nullable Output<Boolean> returnThumbnailUrls;

    public Output<Boolean> getReturnThumbnailUrls() {
        return this.returnThumbnailUrls == null ? Codegen.empty() : this.returnThumbnailUrls;
    }

    /**
     * A short name or alias for the source. This value will be used to match the 'source' operator. For example, if the short name is *<value>* then queries like *source:<value>* will only return results for this source. The value must be unique across all datasources. The value must only contain alphanumeric characters (a-zA-Z0-9). The value cannot start with 'google' and cannot be one of the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep, people, teams. Its maximum length is 32 characters.
     * 
     */
    @Import(name="shortName")
      private final @Nullable Output<String> shortName;

    public Output<String> getShortName() {
        return this.shortName == null ? Codegen.empty() : this.shortName;
    }

    public DataSourceArgs(
        @Nullable Output<Boolean> disableModifications,
        @Nullable Output<Boolean> disableServing,
        Output<String> displayName,
        @Nullable Output<List<String>> indexingServiceAccounts,
        @Nullable Output<List<GSuitePrincipalArgs>> itemsVisibility,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> operationIds,
        @Nullable Output<Boolean> returnThumbnailUrls,
        @Nullable Output<String> shortName) {
        this.disableModifications = disableModifications;
        this.disableServing = disableServing;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.indexingServiceAccounts = indexingServiceAccounts;
        this.itemsVisibility = itemsVisibility;
        this.name = name;
        this.operationIds = operationIds;
        this.returnThumbnailUrls = returnThumbnailUrls;
        this.shortName = shortName;
    }

    private DataSourceArgs() {
        this.disableModifications = Codegen.empty();
        this.disableServing = Codegen.empty();
        this.displayName = Codegen.empty();
        this.indexingServiceAccounts = Codegen.empty();
        this.itemsVisibility = Codegen.empty();
        this.name = Codegen.empty();
        this.operationIds = Codegen.empty();
        this.returnThumbnailUrls = Codegen.empty();
        this.shortName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableModifications;
        private @Nullable Output<Boolean> disableServing;
        private Output<String> displayName;
        private @Nullable Output<List<String>> indexingServiceAccounts;
        private @Nullable Output<List<GSuitePrincipalArgs>> itemsVisibility;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> operationIds;
        private @Nullable Output<Boolean> returnThumbnailUrls;
        private @Nullable Output<String> shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableModifications = defaults.disableModifications;
    	      this.disableServing = defaults.disableServing;
    	      this.displayName = defaults.displayName;
    	      this.indexingServiceAccounts = defaults.indexingServiceAccounts;
    	      this.itemsVisibility = defaults.itemsVisibility;
    	      this.name = defaults.name;
    	      this.operationIds = defaults.operationIds;
    	      this.returnThumbnailUrls = defaults.returnThumbnailUrls;
    	      this.shortName = defaults.shortName;
        }

        public Builder disableModifications(@Nullable Output<Boolean> disableModifications) {
            this.disableModifications = disableModifications;
            return this;
        }
        public Builder disableModifications(@Nullable Boolean disableModifications) {
            this.disableModifications = Codegen.ofNullable(disableModifications);
            return this;
        }
        public Builder disableServing(@Nullable Output<Boolean> disableServing) {
            this.disableServing = disableServing;
            return this;
        }
        public Builder disableServing(@Nullable Boolean disableServing) {
            this.disableServing = Codegen.ofNullable(disableServing);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder indexingServiceAccounts(@Nullable Output<List<String>> indexingServiceAccounts) {
            this.indexingServiceAccounts = indexingServiceAccounts;
            return this;
        }
        public Builder indexingServiceAccounts(@Nullable List<String> indexingServiceAccounts) {
            this.indexingServiceAccounts = Codegen.ofNullable(indexingServiceAccounts);
            return this;
        }
        public Builder indexingServiceAccounts(String... indexingServiceAccounts) {
            return indexingServiceAccounts(List.of(indexingServiceAccounts));
        }
        public Builder itemsVisibility(@Nullable Output<List<GSuitePrincipalArgs>> itemsVisibility) {
            this.itemsVisibility = itemsVisibility;
            return this;
        }
        public Builder itemsVisibility(@Nullable List<GSuitePrincipalArgs> itemsVisibility) {
            this.itemsVisibility = Codegen.ofNullable(itemsVisibility);
            return this;
        }
        public Builder itemsVisibility(GSuitePrincipalArgs... itemsVisibility) {
            return itemsVisibility(List.of(itemsVisibility));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder operationIds(@Nullable Output<List<String>> operationIds) {
            this.operationIds = operationIds;
            return this;
        }
        public Builder operationIds(@Nullable List<String> operationIds) {
            this.operationIds = Codegen.ofNullable(operationIds);
            return this;
        }
        public Builder operationIds(String... operationIds) {
            return operationIds(List.of(operationIds));
        }
        public Builder returnThumbnailUrls(@Nullable Output<Boolean> returnThumbnailUrls) {
            this.returnThumbnailUrls = returnThumbnailUrls;
            return this;
        }
        public Builder returnThumbnailUrls(@Nullable Boolean returnThumbnailUrls) {
            this.returnThumbnailUrls = Codegen.ofNullable(returnThumbnailUrls);
            return this;
        }
        public Builder shortName(@Nullable Output<String> shortName) {
            this.shortName = shortName;
            return this;
        }
        public Builder shortName(@Nullable String shortName) {
            this.shortName = Codegen.ofNullable(shortName);
            return this;
        }        public DataSourceArgs build() {
            return new DataSourceArgs(disableModifications, disableServing, displayName, indexingServiceAccounts, itemsVisibility, name, operationIds, returnThumbnailUrls, shortName);
        }
    }
}
