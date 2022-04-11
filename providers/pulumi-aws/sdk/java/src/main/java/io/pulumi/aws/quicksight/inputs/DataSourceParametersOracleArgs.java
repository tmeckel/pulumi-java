// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersOracleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersOracleArgs Empty = new DataSourceParametersOracleArgs();

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
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    /**
     * The port to which to connect.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    public DataSourceParametersOracleArgs(
        Output<String> database,
        Output<String> host,
        Output<Integer> port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceParametersOracleArgs() {
        this.database = Codegen.empty();
        this.host = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersOracleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> database;
        private Output<String> host;
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersOracleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public DataSourceParametersOracleArgs build() {
            return new DataSourceParametersOracleArgs(database, host, port);
        }
    }
}
