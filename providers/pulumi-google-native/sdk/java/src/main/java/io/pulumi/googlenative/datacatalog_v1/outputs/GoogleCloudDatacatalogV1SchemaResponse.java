// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1ColumnSchemaResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1SchemaResponse {
    /**
     * The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
     * 
     */
    private final List<GoogleCloudDatacatalogV1ColumnSchemaResponse> columns;

    @OutputCustomType.Constructor({"columns"})
    private GoogleCloudDatacatalogV1SchemaResponse(List<GoogleCloudDatacatalogV1ColumnSchemaResponse> columns) {
        this.columns = Objects.requireNonNull(columns);
    }

    /**
     * The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
     * 
     */
    public List<GoogleCloudDatacatalogV1ColumnSchemaResponse> getColumns() {
        return this.columns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1SchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDatacatalogV1ColumnSchemaResponse> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1SchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder setColumns(List<GoogleCloudDatacatalogV1ColumnSchemaResponse> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }

        public GoogleCloudDatacatalogV1SchemaResponse build() {
            return new GoogleCloudDatacatalogV1SchemaResponse(columns);
        }
    }
}
