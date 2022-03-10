// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1.outputs.MysqlColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MysqlTableResponse {
    /**
     * MySQL columns in the database. When unspecified as part of include/exclude lists, includes/excludes everything.
     * 
     */
    private final List<MysqlColumnResponse> mysqlColumns;
    /**
     * Table name.
     * 
     */
    private final String table;

    @OutputCustomType.Constructor
    private MysqlTableResponse(
        @OutputCustomType.Parameter("mysqlColumns") List<MysqlColumnResponse> mysqlColumns,
        @OutputCustomType.Parameter("table") String table) {
        this.mysqlColumns = mysqlColumns;
        this.table = table;
    }

    /**
     * MySQL columns in the database. When unspecified as part of include/exclude lists, includes/excludes everything.
     * 
    */
    public List<MysqlColumnResponse> getMysqlColumns() {
        return this.mysqlColumns;
    }
    /**
     * Table name.
     * 
    */
    public String getTable() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MysqlColumnResponse> mysqlColumns;
        private String table;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlColumns = defaults.mysqlColumns;
    	      this.table = defaults.table;
        }

        public Builder mysqlColumns(List<MysqlColumnResponse> mysqlColumns) {
            this.mysqlColumns = Objects.requireNonNull(mysqlColumns);
            return this;
        }

        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public MysqlTableResponse build() {
            return new MysqlTableResponse(mysqlColumns, table);
        }
    }
}
