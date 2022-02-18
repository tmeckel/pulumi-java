// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Presto (https://prestosql.io/) queries. IMPORTANT: The Dataproc Presto Optional Component (https://cloud.google.com/dataproc/docs/concepts/components/presto) must be enabled when the cluster is created to submit a Presto job to the cluster.
 * 
 */
public final class PrestoJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrestoJobArgs Empty = new PrestoJobArgs();

    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    @InputImport(name="clientTags")
    private final @Nullable Input<List<String>> clientTags;

    public Input<List<String>> getClientTags() {
        return this.clientTags == null ? Input.empty() : this.clientTags;
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @InputImport(name="continueOnFailure")
    private final @Nullable Input<Boolean> continueOnFailure;

    public Input<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Input.empty() : this.continueOnFailure;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @InputImport(name="loggingConfig")
    private final @Nullable Input<LoggingConfigArgs> loggingConfig;

    public Input<LoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    @InputImport(name="outputFormat")
    private final @Nullable Input<String> outputFormat;

    public Input<String> getOutputFormat() {
        return this.outputFormat == null ? Input.empty() : this.outputFormat;
    }

    /**
     * Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @InputImport(name="queryFileUri")
    private final @Nullable Input<String> queryFileUri;

    public Input<String> getQueryFileUri() {
        return this.queryFileUri == null ? Input.empty() : this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @InputImport(name="queryList")
    private final @Nullable Input<QueryListArgs> queryList;

    public Input<QueryListArgs> getQueryList() {
        return this.queryList == null ? Input.empty() : this.queryList;
    }

    public PrestoJobArgs(
        @Nullable Input<List<String>> clientTags,
        @Nullable Input<Boolean> continueOnFailure,
        @Nullable Input<LoggingConfigArgs> loggingConfig,
        @Nullable Input<String> outputFormat,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> queryFileUri,
        @Nullable Input<QueryListArgs> queryList) {
        this.clientTags = clientTags;
        this.continueOnFailure = continueOnFailure;
        this.loggingConfig = loggingConfig;
        this.outputFormat = outputFormat;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
    }

    private PrestoJobArgs() {
        this.clientTags = Input.empty();
        this.continueOnFailure = Input.empty();
        this.loggingConfig = Input.empty();
        this.outputFormat = Input.empty();
        this.properties = Input.empty();
        this.queryFileUri = Input.empty();
        this.queryList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrestoJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> clientTags;
        private @Nullable Input<Boolean> continueOnFailure;
        private @Nullable Input<LoggingConfigArgs> loggingConfig;
        private @Nullable Input<String> outputFormat;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> queryFileUri;
        private @Nullable Input<QueryListArgs> queryList;

        public Builder() {
    	      // Empty
        }

        public Builder(PrestoJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTags = defaults.clientTags;
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.outputFormat = defaults.outputFormat;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
        }

        public Builder setClientTags(@Nullable Input<List<String>> clientTags) {
            this.clientTags = clientTags;
            return this;
        }

        public Builder setClientTags(@Nullable List<String> clientTags) {
            this.clientTags = Input.ofNullable(clientTags);
            return this;
        }

        public Builder setContinueOnFailure(@Nullable Input<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder setContinueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Input.ofNullable(continueOnFailure);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder setOutputFormat(@Nullable Input<String> outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        public Builder setOutputFormat(@Nullable String outputFormat) {
            this.outputFormat = Input.ofNullable(outputFormat);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setQueryFileUri(@Nullable Input<String> queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder setQueryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = Input.ofNullable(queryFileUri);
            return this;
        }

        public Builder setQueryList(@Nullable Input<QueryListArgs> queryList) {
            this.queryList = queryList;
            return this;
        }

        public Builder setQueryList(@Nullable QueryListArgs queryList) {
            this.queryList = Input.ofNullable(queryList);
            return this;
        }

        public PrestoJobArgs build() {
            return new PrestoJobArgs(clientTags, continueOnFailure, loggingConfig, outputFormat, properties, queryFileUri, queryList);
        }
    }
}
