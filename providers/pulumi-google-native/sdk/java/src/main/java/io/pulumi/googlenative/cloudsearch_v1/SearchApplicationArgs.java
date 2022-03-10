// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudsearch_v1.inputs.DataSourceRestrictionArgs;
import io.pulumi.googlenative.cloudsearch_v1.inputs.FacetOptionsArgs;
import io.pulumi.googlenative.cloudsearch_v1.inputs.QueryInterpretationConfigArgs;
import io.pulumi.googlenative.cloudsearch_v1.inputs.ScoringConfigArgs;
import io.pulumi.googlenative.cloudsearch_v1.inputs.SortOptionsArgs;
import io.pulumi.googlenative.cloudsearch_v1.inputs.SourceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SearchApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SearchApplicationArgs Empty = new SearchApplicationArgs();

    /**
     * Retrictions applied to the configurations. The maximum number of elements is 10.
     * 
     */
    @InputImport(name="dataSourceRestrictions")
      private final @Nullable Input<List<DataSourceRestrictionArgs>> dataSourceRestrictions;

    public Input<List<DataSourceRestrictionArgs>> getDataSourceRestrictions() {
        return this.dataSourceRestrictions == null ? Input.empty() : this.dataSourceRestrictions;
    }

    /**
     * The default fields for returning facet results. The sources specified here also have been included in data_source_restrictions above.
     * 
     */
    @InputImport(name="defaultFacetOptions")
      private final @Nullable Input<List<FacetOptionsArgs>> defaultFacetOptions;

    public Input<List<FacetOptionsArgs>> getDefaultFacetOptions() {
        return this.defaultFacetOptions == null ? Input.empty() : this.defaultFacetOptions;
    }

    /**
     * The default options for sorting the search results
     * 
     */
    @InputImport(name="defaultSortOptions")
      private final @Nullable Input<SortOptionsArgs> defaultSortOptions;

    public Input<SortOptionsArgs> getDefaultSortOptions() {
        return this.defaultSortOptions == null ? Input.empty() : this.defaultSortOptions;
    }

    /**
     * Display name of the Search Application. The maximum length is 300 characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Indicates whether audit logging is on/off for requests made for the search application in query APIs.
     * 
     */
    @InputImport(name="enableAuditLog")
      private final @Nullable Input<Boolean> enableAuditLog;

    public Input<Boolean> getEnableAuditLog() {
        return this.enableAuditLog == null ? Input.empty() : this.enableAuditLog;
    }

    /**
     * Name of the Search Application. Format: searchapplications/{application_id}.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The default options for query interpretation
     * 
     */
    @InputImport(name="queryInterpretationConfig")
      private final @Nullable Input<QueryInterpretationConfigArgs> queryInterpretationConfig;

    public Input<QueryInterpretationConfigArgs> getQueryInterpretationConfig() {
        return this.queryInterpretationConfig == null ? Input.empty() : this.queryInterpretationConfig;
    }

    /**
     * With each result we should return the URI for its thumbnail (when applicable)
     * 
     */
    @InputImport(name="returnResultThumbnailUrls")
      private final @Nullable Input<Boolean> returnResultThumbnailUrls;

    public Input<Boolean> getReturnResultThumbnailUrls() {
        return this.returnResultThumbnailUrls == null ? Input.empty() : this.returnResultThumbnailUrls;
    }

    /**
     * Configuration for ranking results.
     * 
     */
    @InputImport(name="scoringConfig")
      private final @Nullable Input<ScoringConfigArgs> scoringConfig;

    public Input<ScoringConfigArgs> getScoringConfig() {
        return this.scoringConfig == null ? Input.empty() : this.scoringConfig;
    }

    /**
     * Configuration for a sources specified in data_source_restrictions.
     * 
     */
    @InputImport(name="sourceConfig")
      private final @Nullable Input<List<SourceConfigArgs>> sourceConfig;

    public Input<List<SourceConfigArgs>> getSourceConfig() {
        return this.sourceConfig == null ? Input.empty() : this.sourceConfig;
    }

    public SearchApplicationArgs(
        @Nullable Input<List<DataSourceRestrictionArgs>> dataSourceRestrictions,
        @Nullable Input<List<FacetOptionsArgs>> defaultFacetOptions,
        @Nullable Input<SortOptionsArgs> defaultSortOptions,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enableAuditLog,
        @Nullable Input<String> name,
        @Nullable Input<QueryInterpretationConfigArgs> queryInterpretationConfig,
        @Nullable Input<Boolean> returnResultThumbnailUrls,
        @Nullable Input<ScoringConfigArgs> scoringConfig,
        @Nullable Input<List<SourceConfigArgs>> sourceConfig) {
        this.dataSourceRestrictions = dataSourceRestrictions;
        this.defaultFacetOptions = defaultFacetOptions;
        this.defaultSortOptions = defaultSortOptions;
        this.displayName = displayName;
        this.enableAuditLog = enableAuditLog;
        this.name = name;
        this.queryInterpretationConfig = queryInterpretationConfig;
        this.returnResultThumbnailUrls = returnResultThumbnailUrls;
        this.scoringConfig = scoringConfig;
        this.sourceConfig = sourceConfig;
    }

    private SearchApplicationArgs() {
        this.dataSourceRestrictions = Input.empty();
        this.defaultFacetOptions = Input.empty();
        this.defaultSortOptions = Input.empty();
        this.displayName = Input.empty();
        this.enableAuditLog = Input.empty();
        this.name = Input.empty();
        this.queryInterpretationConfig = Input.empty();
        this.returnResultThumbnailUrls = Input.empty();
        this.scoringConfig = Input.empty();
        this.sourceConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataSourceRestrictionArgs>> dataSourceRestrictions;
        private @Nullable Input<List<FacetOptionsArgs>> defaultFacetOptions;
        private @Nullable Input<SortOptionsArgs> defaultSortOptions;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enableAuditLog;
        private @Nullable Input<String> name;
        private @Nullable Input<QueryInterpretationConfigArgs> queryInterpretationConfig;
        private @Nullable Input<Boolean> returnResultThumbnailUrls;
        private @Nullable Input<ScoringConfigArgs> scoringConfig;
        private @Nullable Input<List<SourceConfigArgs>> sourceConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceRestrictions = defaults.dataSourceRestrictions;
    	      this.defaultFacetOptions = defaults.defaultFacetOptions;
    	      this.defaultSortOptions = defaults.defaultSortOptions;
    	      this.displayName = defaults.displayName;
    	      this.enableAuditLog = defaults.enableAuditLog;
    	      this.name = defaults.name;
    	      this.queryInterpretationConfig = defaults.queryInterpretationConfig;
    	      this.returnResultThumbnailUrls = defaults.returnResultThumbnailUrls;
    	      this.scoringConfig = defaults.scoringConfig;
    	      this.sourceConfig = defaults.sourceConfig;
        }

        public Builder dataSourceRestrictions(@Nullable Input<List<DataSourceRestrictionArgs>> dataSourceRestrictions) {
            this.dataSourceRestrictions = dataSourceRestrictions;
            return this;
        }

        public Builder dataSourceRestrictions(@Nullable List<DataSourceRestrictionArgs> dataSourceRestrictions) {
            this.dataSourceRestrictions = Input.ofNullable(dataSourceRestrictions);
            return this;
        }

        public Builder defaultFacetOptions(@Nullable Input<List<FacetOptionsArgs>> defaultFacetOptions) {
            this.defaultFacetOptions = defaultFacetOptions;
            return this;
        }

        public Builder defaultFacetOptions(@Nullable List<FacetOptionsArgs> defaultFacetOptions) {
            this.defaultFacetOptions = Input.ofNullable(defaultFacetOptions);
            return this;
        }

        public Builder defaultSortOptions(@Nullable Input<SortOptionsArgs> defaultSortOptions) {
            this.defaultSortOptions = defaultSortOptions;
            return this;
        }

        public Builder defaultSortOptions(@Nullable SortOptionsArgs defaultSortOptions) {
            this.defaultSortOptions = Input.ofNullable(defaultSortOptions);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder enableAuditLog(@Nullable Input<Boolean> enableAuditLog) {
            this.enableAuditLog = enableAuditLog;
            return this;
        }

        public Builder enableAuditLog(@Nullable Boolean enableAuditLog) {
            this.enableAuditLog = Input.ofNullable(enableAuditLog);
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

        public Builder queryInterpretationConfig(@Nullable Input<QueryInterpretationConfigArgs> queryInterpretationConfig) {
            this.queryInterpretationConfig = queryInterpretationConfig;
            return this;
        }

        public Builder queryInterpretationConfig(@Nullable QueryInterpretationConfigArgs queryInterpretationConfig) {
            this.queryInterpretationConfig = Input.ofNullable(queryInterpretationConfig);
            return this;
        }

        public Builder returnResultThumbnailUrls(@Nullable Input<Boolean> returnResultThumbnailUrls) {
            this.returnResultThumbnailUrls = returnResultThumbnailUrls;
            return this;
        }

        public Builder returnResultThumbnailUrls(@Nullable Boolean returnResultThumbnailUrls) {
            this.returnResultThumbnailUrls = Input.ofNullable(returnResultThumbnailUrls);
            return this;
        }

        public Builder scoringConfig(@Nullable Input<ScoringConfigArgs> scoringConfig) {
            this.scoringConfig = scoringConfig;
            return this;
        }

        public Builder scoringConfig(@Nullable ScoringConfigArgs scoringConfig) {
            this.scoringConfig = Input.ofNullable(scoringConfig);
            return this;
        }

        public Builder sourceConfig(@Nullable Input<List<SourceConfigArgs>> sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }

        public Builder sourceConfig(@Nullable List<SourceConfigArgs> sourceConfig) {
            this.sourceConfig = Input.ofNullable(sourceConfig);
            return this;
        }
        public SearchApplicationArgs build() {
            return new SearchApplicationArgs(dataSourceRestrictions, defaultFacetOptions, defaultSortOptions, displayName, enableAuditLog, name, queryInterpretationConfig, returnResultThumbnailUrls, scoringConfig, sourceConfig);
        }
    }
}
