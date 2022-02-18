// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * MySQL table.
 * 
 */
public final class MysqlTableResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlTableResponse Empty = new MysqlTableResponse();

    /**
     * MySQL columns in the database. When unspecified as part of include/exclude lists, includes/excludes everything.
     * 
     */
    @InputImport(name="mysqlColumns", required=true)
    private final List<MysqlColumnResponse> mysqlColumns;

    public List<MysqlColumnResponse> getMysqlColumns() {
        return this.mysqlColumns;
    }

    /**
     * Table name.
     * 
     */
    @InputImport(name="tableName", required=true)
    private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    public MysqlTableResponse(
        List<MysqlColumnResponse> mysqlColumns,
        String tableName) {
        this.mysqlColumns = Objects.requireNonNull(mysqlColumns, "expected parameter 'mysqlColumns' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private MysqlTableResponse() {
        this.mysqlColumns = List.of();
        this.tableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MysqlColumnResponse> mysqlColumns;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlColumns = defaults.mysqlColumns;
    	      this.tableName = defaults.tableName;
        }

        public Builder setMysqlColumns(List<MysqlColumnResponse> mysqlColumns) {
            this.mysqlColumns = Objects.requireNonNull(mysqlColumns);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public MysqlTableResponse build() {
            return new MysqlTableResponse(mysqlColumns, tableName);
        }
    }
}
