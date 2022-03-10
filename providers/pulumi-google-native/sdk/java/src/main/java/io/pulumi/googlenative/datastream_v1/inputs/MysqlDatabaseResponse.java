// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * MySQL database.
 * 
 */
public final class MysqlDatabaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlDatabaseResponse Empty = new MysqlDatabaseResponse();

    /**
     * Database name.
     * 
     */
    @InputImport(name="database", required=true)
      private final String database;

    public String getDatabase() {
        return this.database;
    }

    /**
     * Tables in the database.
     * 
     */
    @InputImport(name="mysqlTables", required=true)
      private final List<MysqlTableResponse> mysqlTables;

    public List<MysqlTableResponse> getMysqlTables() {
        return this.mysqlTables;
    }

    public MysqlDatabaseResponse(
        String database,
        List<MysqlTableResponse> mysqlTables) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.mysqlTables = Objects.requireNonNull(mysqlTables, "expected parameter 'mysqlTables' to be non-null");
    }

    private MysqlDatabaseResponse() {
        this.database = null;
        this.mysqlTables = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private List<MysqlTableResponse> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder mysqlTables(List<MysqlTableResponse> mysqlTables) {
            this.mysqlTables = Objects.requireNonNull(mysqlTables);
            return this;
        }
        public MysqlDatabaseResponse build() {
            return new MysqlDatabaseResponse(database, mysqlTables);
        }
    }
}
