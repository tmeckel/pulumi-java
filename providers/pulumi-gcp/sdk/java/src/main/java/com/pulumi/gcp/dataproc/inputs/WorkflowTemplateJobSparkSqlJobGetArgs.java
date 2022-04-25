// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobLoggingConfigGetArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobQueryListGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobSparkSqlJobGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSparkSqlJobGetArgs Empty = new WorkflowTemplateJobSparkSqlJobGetArgs();

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    /**
     * @return Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<WorkflowTemplateJobSparkSqlJobLoggingConfigGetArgs> loggingConfig;

    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    public Optional<Output<WorkflowTemplateJobSparkSqlJobLoggingConfigGetArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri")
    private @Nullable Output<String> queryFileUri;

    /**
     * @return The HCFS URI of the script that contains SQL queries.
     * 
     */
    public Optional<Output<String>> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
    private @Nullable Output<WorkflowTemplateJobSparkSqlJobQueryListGetArgs> queryList;

    /**
     * @return A list of queries.
     * 
     */
    public Optional<Output<WorkflowTemplateJobSparkSqlJobQueryListGetArgs>> queryList() {
        return Optional.ofNullable(this.queryList);
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name=&#34;value&#34;;`).
     * 
     */
    @Import(name="scriptVariables")
    private @Nullable Output<Map<String,String>> scriptVariables;

    /**
     * @return Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name=&#34;value&#34;;`).
     * 
     */
    public Optional<Output<Map<String,String>>> scriptVariables() {
        return Optional.ofNullable(this.scriptVariables);
    }

    private WorkflowTemplateJobSparkSqlJobGetArgs() {}

    private WorkflowTemplateJobSparkSqlJobGetArgs(WorkflowTemplateJobSparkSqlJobGetArgs $) {
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
        this.scriptVariables = $.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateJobSparkSqlJobGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateJobSparkSqlJobGetArgs $;

        public Builder() {
            $ = new WorkflowTemplateJobSparkSqlJobGetArgs();
        }

        public Builder(WorkflowTemplateJobSparkSqlJobGetArgs defaults) {
            $ = new WorkflowTemplateJobSparkSqlJobGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<WorkflowTemplateJobSparkSqlJobLoggingConfigGetArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(WorkflowTemplateJobSparkSqlJobLoggingConfigGetArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param properties Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains SQL queries.
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
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(String queryFileUri) {
            return queryFileUri(Output.of(queryFileUri));
        }

        /**
         * @param queryList A list of queries.
         * 
         * @return builder
         * 
         */
        public Builder queryList(@Nullable Output<WorkflowTemplateJobSparkSqlJobQueryListGetArgs> queryList) {
            $.queryList = queryList;
            return this;
        }

        /**
         * @param queryList A list of queries.
         * 
         * @return builder
         * 
         */
        public Builder queryList(WorkflowTemplateJobSparkSqlJobQueryListGetArgs queryList) {
            return queryList(Output.of(queryList));
        }

        /**
         * @param scriptVariables Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name=&#34;value&#34;;`).
         * 
         * @return builder
         * 
         */
        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            $.scriptVariables = scriptVariables;
            return this;
        }

        /**
         * @param scriptVariables Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name=&#34;value&#34;;`).
         * 
         * @return builder
         * 
         */
        public Builder scriptVariables(Map<String,String> scriptVariables) {
            return scriptVariables(Output.of(scriptVariables));
        }

        public WorkflowTemplateJobSparkSqlJobGetArgs build() {
            return $;
        }
    }

}
