// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A configuration for running Apache Spark SQL (https://spark.apache.org/sql/) queries as a batch workload.
 * 
 */
public final class SparkSqlBatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkSqlBatchArgs Empty = new SparkSqlBatchArgs();

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @InputImport(name="jarFileUris")
    private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    /**
     * The HCFS URI of the script that contains Spark SQL queries to execute.
     * 
     */
    @InputImport(name="queryFileUri", required=true)
    private final Input<String> queryFileUri;

    public Input<String> getQueryFileUri() {
        return this.queryFileUri;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
     * 
     */
    @InputImport(name="queryVariables")
    private final @Nullable Input<Map<String,String>> queryVariables;

    public Input<Map<String,String>> getQueryVariables() {
        return this.queryVariables == null ? Input.empty() : this.queryVariables;
    }

    public SparkSqlBatchArgs(
        @Nullable Input<List<String>> jarFileUris,
        Input<String> queryFileUri,
        @Nullable Input<Map<String,String>> queryVariables) {
        this.jarFileUris = jarFileUris;
        this.queryFileUri = Objects.requireNonNull(queryFileUri, "expected parameter 'queryFileUri' to be non-null");
        this.queryVariables = queryVariables;
    }

    private SparkSqlBatchArgs() {
        this.jarFileUris = Input.empty();
        this.queryFileUri = Input.empty();
        this.queryVariables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSqlBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> jarFileUris;
        private Input<String> queryFileUri;
        private @Nullable Input<Map<String,String>> queryVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSqlBatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryVariables = defaults.queryVariables;
        }

        public Builder setJarFileUris(@Nullable Input<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Input.ofNullable(jarFileUris);
            return this;
        }

        public Builder setQueryFileUri(Input<String> queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }

        public Builder setQueryFileUri(String queryFileUri) {
            this.queryFileUri = Input.of(Objects.requireNonNull(queryFileUri));
            return this;
        }

        public Builder setQueryVariables(@Nullable Input<Map<String,String>> queryVariables) {
            this.queryVariables = queryVariables;
            return this;
        }

        public Builder setQueryVariables(@Nullable Map<String,String> queryVariables) {
            this.queryVariables = Input.ofNullable(queryVariables);
            return this;
        }

        public SparkSqlBatchArgs build() {
            return new SparkSqlBatchArgs(jarFileUris, queryFileUri, queryVariables);
        }
    }
}
