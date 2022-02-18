// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.LoggingConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.QueryListResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SparkSqlJobResponse {
    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final List<String> jarFileUris;
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    private final LoggingConfigResponse loggingConfig;
    /**
     * Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Dataproc API may be overwritten.
     * 
     */
    private final Map<String,String> properties;
    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    private final String queryFileUri;
    /**
     * A list of queries.
     * 
     */
    private final QueryListResponse queryList;
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
     * 
     */
    private final Map<String,String> scriptVariables;

    @OutputCustomType.Constructor({"jarFileUris","loggingConfig","properties","queryFileUri","queryList","scriptVariables"})
    private SparkSqlJobResponse(
        List<String> jarFileUris,
        LoggingConfigResponse loggingConfig,
        Map<String,String> properties,
        String queryFileUri,
        QueryListResponse queryList,
        Map<String,String> scriptVariables) {
        this.jarFileUris = Objects.requireNonNull(jarFileUris);
        this.loggingConfig = Objects.requireNonNull(loggingConfig);
        this.properties = Objects.requireNonNull(properties);
        this.queryFileUri = Objects.requireNonNull(queryFileUri);
        this.queryList = Objects.requireNonNull(queryList);
        this.scriptVariables = Objects.requireNonNull(scriptVariables);
    }

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Dataproc API may be overwritten.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties;
    }
    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    public String getQueryFileUri() {
        return this.queryFileUri;
    }
    /**
     * A list of queries.
     * 
     */
    public QueryListResponse getQueryList() {
        return this.queryList;
    }
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
     * 
     */
    public Map<String,String> getScriptVariables() {
        return this.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSqlJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private Map<String,String> properties;
        private String queryFileUri;
        private QueryListResponse queryList;
        private Map<String,String> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSqlJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder setJarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder setLoggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setQueryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }

        public Builder setQueryList(QueryListResponse queryList) {
            this.queryList = Objects.requireNonNull(queryList);
            return this;
        }

        public Builder setScriptVariables(Map<String,String> scriptVariables) {
            this.scriptVariables = Objects.requireNonNull(scriptVariables);
            return this;
        }

        public SparkSqlJobResponse build() {
            return new SparkSqlJobResponse(jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
