// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersSnowflakeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersSnowflakeGetArgs Empty = new DataSourceParametersSnowflakeGetArgs();

    /**
     * The database to which to connect.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database to which to connect.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The host to which to connect.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * The warehouse to which to connect.
     * 
     */
    @Import(name="warehouse", required=true)
    private Output<String> warehouse;

    /**
     * @return The warehouse to which to connect.
     * 
     */
    public Output<String> warehouse() {
        return this.warehouse;
    }

    private DataSourceParametersSnowflakeGetArgs() {}

    private DataSourceParametersSnowflakeGetArgs(DataSourceParametersSnowflakeGetArgs $) {
        this.database = $.database;
        this.host = $.host;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersSnowflakeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersSnowflakeGetArgs $;

        public Builder() {
            $ = new DataSourceParametersSnowflakeGetArgs();
        }

        public Builder(DataSourceParametersSnowflakeGetArgs defaults) {
            $ = new DataSourceParametersSnowflakeGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The database to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param host The host to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param warehouse The warehouse to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse The warehouse to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public DataSourceParametersSnowflakeGetArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.warehouse = Objects.requireNonNull($.warehouse, "expected parameter 'warehouse' to be non-null");
            return $;
        }
    }

}
