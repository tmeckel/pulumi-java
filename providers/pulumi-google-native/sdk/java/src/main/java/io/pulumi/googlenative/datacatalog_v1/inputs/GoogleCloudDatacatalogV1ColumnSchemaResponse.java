// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A column within a schema. Columns can be nested inside other columns.
 * 
 */
public final class GoogleCloudDatacatalogV1ColumnSchemaResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1ColumnSchemaResponse Empty = new GoogleCloudDatacatalogV1ColumnSchemaResponse();

    /**
     * Name of the column. Must be a UTF-8 string without dots (.). The maximum size is 64 bytes.
     * 
     */
    @InputImport(name="column", required=true)
      private final String column;

    public String getColumn() {
        return this.column;
    }

    /**
     * Optional. Description of the column. Default value is an empty string. The description must be a UTF-8 string with the maximum size of 2000 bytes.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Optional. A column's mode indicates whether values in this column are required, nullable, or repeated. Only `NULLABLE`, `REQUIRED`, and `REPEATED` values are supported. Default mode is `NULLABLE`.
     * 
     */
    @InputImport(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * Optional. Schema of sub-columns. A column can have zero or more sub-columns.
     * 
     */
    @InputImport(name="subcolumns", required=true)
      private final List<GoogleCloudDatacatalogV1ColumnSchemaResponse> subcolumns;

    public List<GoogleCloudDatacatalogV1ColumnSchemaResponse> getSubcolumns() {
        return this.subcolumns;
    }

    /**
     * Type of the column. Must be a UTF-8 string with the maximum size of 128 bytes.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudDatacatalogV1ColumnSchemaResponse(
        String column,
        String description,
        String mode,
        List<GoogleCloudDatacatalogV1ColumnSchemaResponse> subcolumns,
        String type) {
        this.column = Objects.requireNonNull(column, "expected parameter 'column' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.subcolumns = Objects.requireNonNull(subcolumns, "expected parameter 'subcolumns' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDatacatalogV1ColumnSchemaResponse() {
        this.column = null;
        this.description = null;
        this.mode = null;
        this.subcolumns = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ColumnSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String column;
        private String description;
        private String mode;
        private List<GoogleCloudDatacatalogV1ColumnSchemaResponse> subcolumns;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ColumnSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.description = defaults.description;
    	      this.mode = defaults.mode;
    	      this.subcolumns = defaults.subcolumns;
    	      this.type = defaults.type;
        }

        public Builder column(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder subcolumns(List<GoogleCloudDatacatalogV1ColumnSchemaResponse> subcolumns) {
            this.subcolumns = Objects.requireNonNull(subcolumns);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDatacatalogV1ColumnSchemaResponse build() {
            return new GoogleCloudDatacatalogV1ColumnSchemaResponse(column, description, mode, subcolumns, type);
        }
    }
}
