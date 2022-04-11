// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceParametersRedshiftArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersRedshiftArgs Empty = new DataSourceParametersRedshiftArgs();

    /**
     * The ID of the cluster to which to connect.
     * 
     */
    @Import(name="clusterId")
      private final @Nullable Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId == null ? Codegen.empty() : this.clusterId;
    }

    /**
     * The database to which to connect.
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> getDatabase() {
        return this.database;
    }

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    /**
     * The port to which to connect.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    public DataSourceParametersRedshiftArgs(
        @Nullable Output<String> clusterId,
        Output<String> database,
        @Nullable Output<String> host,
        @Nullable Output<Integer> port) {
        this.clusterId = clusterId;
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = host;
        this.port = port;
    }

    private DataSourceParametersRedshiftArgs() {
        this.clusterId = Codegen.empty();
        this.database = Codegen.empty();
        this.host = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersRedshiftArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterId;
        private Output<String> database;
        private @Nullable Output<String> host;
        private @Nullable Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersRedshiftArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = Codegen.ofNullable(clusterId);
            return this;
        }
        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }        public DataSourceParametersRedshiftArgs build() {
            return new DataSourceParametersRedshiftArgs(clusterId, database, host, port);
        }
    }
}
