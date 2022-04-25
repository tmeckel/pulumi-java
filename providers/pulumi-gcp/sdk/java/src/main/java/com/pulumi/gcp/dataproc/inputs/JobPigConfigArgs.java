// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.JobPigConfigLoggingConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobPigConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobPigConfigArgs Empty = new JobPigConfigArgs();

    /**
     * Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    @Import(name="continueOnFailure")
    private @Nullable Output<Boolean> continueOnFailure;

    /**
     * @return Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }

    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    /**
     * @return HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    @Import(name="loggingConfig")
    private @Nullable Output<JobPigConfigLoggingConfigArgs> loggingConfig;

    public Optional<Output<JobPigConfigLoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * A mapping of property names to values, used to configure Spark SQL&#39;s SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return A mapping of property names to values, used to configure Spark SQL&#39;s SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    @Import(name="queryFileUri")
    private @Nullable Output<String> queryFileUri;

    /**
     * @return The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    public Optional<Output<String>> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }

    /**
     * The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    @Import(name="queryLists")
    private @Nullable Output<List<String>> queryLists;

    /**
     * @return The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    public Optional<Output<List<String>>> queryLists() {
        return Optional.ofNullable(this.queryLists);
    }

    /**
     * Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name=&#34;value&#34;;`).
     * 
     */
    @Import(name="scriptVariables")
    private @Nullable Output<Map<String,String>> scriptVariables;

    /**
     * @return Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name=&#34;value&#34;;`).
     * 
     */
    public Optional<Output<Map<String,String>>> scriptVariables() {
        return Optional.ofNullable(this.scriptVariables);
    }

    private JobPigConfigArgs() {}

    private JobPigConfigArgs(JobPigConfigArgs $) {
        this.continueOnFailure = $.continueOnFailure;
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryLists = $.queryLists;
        this.scriptVariables = $.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobPigConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobPigConfigArgs $;

        public Builder() {
            $ = new JobPigConfigArgs();
        }

        public Builder(JobPigConfigArgs defaults) {
            $ = new JobPigConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param continueOnFailure Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            $.continueOnFailure = continueOnFailure;
            return this;
        }

        /**
         * @param continueOnFailure Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder continueOnFailure(Boolean continueOnFailure) {
            return continueOnFailure(Output.of(continueOnFailure));
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to be added to the Spark CLASSPATH.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to be added to the Spark CLASSPATH.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to be added to the Spark CLASSPATH.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        public Builder loggingConfig(@Nullable Output<JobPigConfigLoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(JobPigConfigLoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param properties A mapping of property names to values, used to configure Spark SQL&#39;s SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A mapping of property names to values, used to configure Spark SQL&#39;s SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains SQL queries.
         * Conflicts with `query_list`
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains SQL queries.
         * Conflicts with `query_list`
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(String queryFileUri) {
            return queryFileUri(Output.of(queryFileUri));
        }

        /**
         * @param queryLists The list of SQL queries or statements to execute as part of the job.
         * Conflicts with `query_file_uri`
         * 
         * @return builder
         * 
         */
        public Builder queryLists(@Nullable Output<List<String>> queryLists) {
            $.queryLists = queryLists;
            return this;
        }

        /**
         * @param queryLists The list of SQL queries or statements to execute as part of the job.
         * Conflicts with `query_file_uri`
         * 
         * @return builder
         * 
         */
        public Builder queryLists(List<String> queryLists) {
            return queryLists(Output.of(queryLists));
        }

        /**
         * @param queryLists The list of SQL queries or statements to execute as part of the job.
         * Conflicts with `query_file_uri`
         * 
         * @return builder
         * 
         */
        public Builder queryLists(String... queryLists) {
            return queryLists(List.of(queryLists));
        }

        /**
         * @param scriptVariables Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name=&#34;value&#34;;`).
         * 
         * @return builder
         * 
         */
        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            $.scriptVariables = scriptVariables;
            return this;
        }

        /**
         * @param scriptVariables Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name=&#34;value&#34;;`).
         * 
         * @return builder
         * 
         */
        public Builder scriptVariables(Map<String,String> scriptVariables) {
            return scriptVariables(Output.of(scriptVariables));
        }

        public JobPigConfigArgs build() {
            return $;
        }
    }

}
