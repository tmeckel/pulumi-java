// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobQueryDefaultDatasetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryDestinationEncryptionConfigurationArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryDestinationTableArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryScriptOptionsArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryUserDefinedFunctionResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryArgs Empty = new JobQueryArgs();

    /**
     * If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance.
     * Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed.
     * However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
     */
    @InputImport(name="allowLargeResults")
      private final @Nullable Input<Boolean> allowLargeResults;

    public Input<Boolean> getAllowLargeResults() {
        return this.allowLargeResults == null ? Input.empty() : this.allowLargeResults;
    }

    /**
     * Specifies whether the job is allowed to create new tables. The following values are supported:
     * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
     * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result.
     * Creation, truncation and append actions occur as one atomic update upon job completion
     * Default value is `CREATE_IF_NEEDED`.
     * Possible values are `CREATE_IF_NEEDED` and `CREATE_NEVER`.
     * 
     */
    @InputImport(name="createDisposition")
      private final @Nullable Input<String> createDisposition;

    public Input<String> getCreateDisposition() {
        return this.createDisposition == null ? Input.empty() : this.createDisposition;
    }

    /**
     * Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultDataset")
      private final @Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset;

    public Input<JobQueryDefaultDatasetArgs> getDefaultDataset() {
        return this.defaultDataset == null ? Input.empty() : this.defaultDataset;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * 
     */
    @InputImport(name="destinationEncryptionConfiguration")
      private final @Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration;

    public Input<JobQueryDestinationEncryptionConfigurationArgs> getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration == null ? Input.empty() : this.destinationEncryptionConfiguration;
    }

    /**
     * The destination table.
     * Structure is documented below.
     * 
     */
    @InputImport(name="destinationTable")
      private final @Nullable Input<JobQueryDestinationTableArgs> destinationTable;

    public Input<JobQueryDestinationTableArgs> getDestinationTable() {
        return this.destinationTable == null ? Input.empty() : this.destinationTable;
    }

    /**
     * If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results.
     * allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
     */
    @InputImport(name="flattenResults")
      private final @Nullable Input<Boolean> flattenResults;

    public Input<Boolean> getFlattenResults() {
        return this.flattenResults == null ? Input.empty() : this.flattenResults;
    }

    /**
     * Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    @InputImport(name="maximumBillingTier")
      private final @Nullable Input<Integer> maximumBillingTier;

    public Input<Integer> getMaximumBillingTier() {
        return this.maximumBillingTier == null ? Input.empty() : this.maximumBillingTier;
    }

    /**
     * Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    @InputImport(name="maximumBytesBilled")
      private final @Nullable Input<String> maximumBytesBilled;

    public Input<String> getMaximumBytesBilled() {
        return this.maximumBytesBilled == null ? Input.empty() : this.maximumBytesBilled;
    }

    /**
     * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
     */
    @InputImport(name="parameterMode")
      private final @Nullable Input<String> parameterMode;

    public Input<String> getParameterMode() {
        return this.parameterMode == null ? Input.empty() : this.parameterMode;
    }

    /**
     * Specifies a priority for the query.
     * Default value is `INTERACTIVE`.
     * Possible values are `INTERACTIVE` and `BATCH`.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<String> priority;

    public Input<String> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Configures a query job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="query", required=true)
      private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    /**
     * Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or
     * supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND;
     * when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators.
     * For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified:
     * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
     * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    @InputImport(name="schemaUpdateOptions")
      private final @Nullable Input<List<String>> schemaUpdateOptions;

    public Input<List<String>> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions == null ? Input.empty() : this.schemaUpdateOptions;
    }

    /**
     * Options controlling the execution of scripts.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scriptOptions")
      private final @Nullable Input<JobQueryScriptOptionsArgs> scriptOptions;

    public Input<JobQueryScriptOptionsArgs> getScriptOptions() {
        return this.scriptOptions == null ? Input.empty() : this.scriptOptions;
    }

    /**
     * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true.
     * If set to false, the query will use BigQuery's standard SQL.
     * 
     */
    @InputImport(name="useLegacySql")
      private final @Nullable Input<Boolean> useLegacySql;

    public Input<Boolean> getUseLegacySql() {
        return this.useLegacySql == null ? Input.empty() : this.useLegacySql;
    }

    /**
     * Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever
     * tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified.
     * The default value is true.
     * 
     */
    @InputImport(name="useQueryCache")
      private final @Nullable Input<Boolean> useQueryCache;

    public Input<Boolean> getUseQueryCache() {
        return this.useQueryCache == null ? Input.empty() : this.useQueryCache;
    }

    /**
     * Describes user-defined function resources used in the query.
     * Structure is documented below.
     * 
     */
    @InputImport(name="userDefinedFunctionResources")
      private final @Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

    public Input<List<JobQueryUserDefinedFunctionResourceArgs>> getUserDefinedFunctionResources() {
        return this.userDefinedFunctionResources == null ? Input.empty() : this.userDefinedFunctionResources;
    }

    /**
     * Specifies the action that occurs if the destination table already exists. The following values are supported:
     * WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
     * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
     * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result.
     * Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
     * Creation, truncation and append actions occur as one atomic update upon job completion.
     * Default value is `WRITE_EMPTY`.
     * Possible values are `WRITE_TRUNCATE`, `WRITE_APPEND`, and `WRITE_EMPTY`.
     * 
     */
    @InputImport(name="writeDisposition")
      private final @Nullable Input<String> writeDisposition;

    public Input<String> getWriteDisposition() {
        return this.writeDisposition == null ? Input.empty() : this.writeDisposition;
    }

    public JobQueryArgs(
        @Nullable Input<Boolean> allowLargeResults,
        @Nullable Input<String> createDisposition,
        @Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset,
        @Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration,
        @Nullable Input<JobQueryDestinationTableArgs> destinationTable,
        @Nullable Input<Boolean> flattenResults,
        @Nullable Input<Integer> maximumBillingTier,
        @Nullable Input<String> maximumBytesBilled,
        @Nullable Input<String> parameterMode,
        @Nullable Input<String> priority,
        Input<String> query,
        @Nullable Input<List<String>> schemaUpdateOptions,
        @Nullable Input<JobQueryScriptOptionsArgs> scriptOptions,
        @Nullable Input<Boolean> useLegacySql,
        @Nullable Input<Boolean> useQueryCache,
        @Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources,
        @Nullable Input<String> writeDisposition) {
        this.allowLargeResults = allowLargeResults;
        this.createDisposition = createDisposition;
        this.defaultDataset = defaultDataset;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.flattenResults = flattenResults;
        this.maximumBillingTier = maximumBillingTier;
        this.maximumBytesBilled = maximumBytesBilled;
        this.parameterMode = parameterMode;
        this.priority = priority;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.schemaUpdateOptions = schemaUpdateOptions;
        this.scriptOptions = scriptOptions;
        this.useLegacySql = useLegacySql;
        this.useQueryCache = useQueryCache;
        this.userDefinedFunctionResources = userDefinedFunctionResources;
        this.writeDisposition = writeDisposition;
    }

    private JobQueryArgs() {
        this.allowLargeResults = Input.empty();
        this.createDisposition = Input.empty();
        this.defaultDataset = Input.empty();
        this.destinationEncryptionConfiguration = Input.empty();
        this.destinationTable = Input.empty();
        this.flattenResults = Input.empty();
        this.maximumBillingTier = Input.empty();
        this.maximumBytesBilled = Input.empty();
        this.parameterMode = Input.empty();
        this.priority = Input.empty();
        this.query = Input.empty();
        this.schemaUpdateOptions = Input.empty();
        this.scriptOptions = Input.empty();
        this.useLegacySql = Input.empty();
        this.useQueryCache = Input.empty();
        this.userDefinedFunctionResources = Input.empty();
        this.writeDisposition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowLargeResults;
        private @Nullable Input<String> createDisposition;
        private @Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset;
        private @Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration;
        private @Nullable Input<JobQueryDestinationTableArgs> destinationTable;
        private @Nullable Input<Boolean> flattenResults;
        private @Nullable Input<Integer> maximumBillingTier;
        private @Nullable Input<String> maximumBytesBilled;
        private @Nullable Input<String> parameterMode;
        private @Nullable Input<String> priority;
        private Input<String> query;
        private @Nullable Input<List<String>> schemaUpdateOptions;
        private @Nullable Input<JobQueryScriptOptionsArgs> scriptOptions;
        private @Nullable Input<Boolean> useLegacySql;
        private @Nullable Input<Boolean> useQueryCache;
        private @Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources;
        private @Nullable Input<String> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLargeResults = defaults.allowLargeResults;
    	      this.createDisposition = defaults.createDisposition;
    	      this.defaultDataset = defaults.defaultDataset;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.flattenResults = defaults.flattenResults;
    	      this.maximumBillingTier = defaults.maximumBillingTier;
    	      this.maximumBytesBilled = defaults.maximumBytesBilled;
    	      this.parameterMode = defaults.parameterMode;
    	      this.priority = defaults.priority;
    	      this.query = defaults.query;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.scriptOptions = defaults.scriptOptions;
    	      this.useLegacySql = defaults.useLegacySql;
    	      this.useQueryCache = defaults.useQueryCache;
    	      this.userDefinedFunctionResources = defaults.userDefinedFunctionResources;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder allowLargeResults(@Nullable Input<Boolean> allowLargeResults) {
            this.allowLargeResults = allowLargeResults;
            return this;
        }

        public Builder allowLargeResults(@Nullable Boolean allowLargeResults) {
            this.allowLargeResults = Input.ofNullable(allowLargeResults);
            return this;
        }

        public Builder createDisposition(@Nullable Input<String> createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }

        public Builder createDisposition(@Nullable String createDisposition) {
            this.createDisposition = Input.ofNullable(createDisposition);
            return this;
        }

        public Builder defaultDataset(@Nullable Input<JobQueryDefaultDatasetArgs> defaultDataset) {
            this.defaultDataset = defaultDataset;
            return this;
        }

        public Builder defaultDataset(@Nullable JobQueryDefaultDatasetArgs defaultDataset) {
            this.defaultDataset = Input.ofNullable(defaultDataset);
            return this;
        }

        public Builder destinationEncryptionConfiguration(@Nullable Input<JobQueryDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        public Builder destinationEncryptionConfiguration(@Nullable JobQueryDestinationEncryptionConfigurationArgs destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Input.ofNullable(destinationEncryptionConfiguration);
            return this;
        }

        public Builder destinationTable(@Nullable Input<JobQueryDestinationTableArgs> destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }

        public Builder destinationTable(@Nullable JobQueryDestinationTableArgs destinationTable) {
            this.destinationTable = Input.ofNullable(destinationTable);
            return this;
        }

        public Builder flattenResults(@Nullable Input<Boolean> flattenResults) {
            this.flattenResults = flattenResults;
            return this;
        }

        public Builder flattenResults(@Nullable Boolean flattenResults) {
            this.flattenResults = Input.ofNullable(flattenResults);
            return this;
        }

        public Builder maximumBillingTier(@Nullable Input<Integer> maximumBillingTier) {
            this.maximumBillingTier = maximumBillingTier;
            return this;
        }

        public Builder maximumBillingTier(@Nullable Integer maximumBillingTier) {
            this.maximumBillingTier = Input.ofNullable(maximumBillingTier);
            return this;
        }

        public Builder maximumBytesBilled(@Nullable Input<String> maximumBytesBilled) {
            this.maximumBytesBilled = maximumBytesBilled;
            return this;
        }

        public Builder maximumBytesBilled(@Nullable String maximumBytesBilled) {
            this.maximumBytesBilled = Input.ofNullable(maximumBytesBilled);
            return this;
        }

        public Builder parameterMode(@Nullable Input<String> parameterMode) {
            this.parameterMode = parameterMode;
            return this;
        }

        public Builder parameterMode(@Nullable String parameterMode) {
            this.parameterMode = Input.ofNullable(parameterMode);
            return this;
        }

        public Builder priority(@Nullable Input<String> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable String priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder query(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder query(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder schemaUpdateOptions(@Nullable Input<List<String>> schemaUpdateOptions) {
            this.schemaUpdateOptions = schemaUpdateOptions;
            return this;
        }

        public Builder schemaUpdateOptions(@Nullable List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Input.ofNullable(schemaUpdateOptions);
            return this;
        }

        public Builder scriptOptions(@Nullable Input<JobQueryScriptOptionsArgs> scriptOptions) {
            this.scriptOptions = scriptOptions;
            return this;
        }

        public Builder scriptOptions(@Nullable JobQueryScriptOptionsArgs scriptOptions) {
            this.scriptOptions = Input.ofNullable(scriptOptions);
            return this;
        }

        public Builder useLegacySql(@Nullable Input<Boolean> useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }

        public Builder useLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = Input.ofNullable(useLegacySql);
            return this;
        }

        public Builder useQueryCache(@Nullable Input<Boolean> useQueryCache) {
            this.useQueryCache = useQueryCache;
            return this;
        }

        public Builder useQueryCache(@Nullable Boolean useQueryCache) {
            this.useQueryCache = Input.ofNullable(useQueryCache);
            return this;
        }

        public Builder userDefinedFunctionResources(@Nullable Input<List<JobQueryUserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }

        public Builder userDefinedFunctionResources(@Nullable List<JobQueryUserDefinedFunctionResourceArgs> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Input.ofNullable(userDefinedFunctionResources);
            return this;
        }

        public Builder writeDisposition(@Nullable Input<String> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder writeDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = Input.ofNullable(writeDisposition);
            return this;
        }
        public JobQueryArgs build() {
            return new JobQueryArgs(allowLargeResults, createDisposition, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, priority, query, schemaUpdateOptions, scriptOptions, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
        }
    }
}
