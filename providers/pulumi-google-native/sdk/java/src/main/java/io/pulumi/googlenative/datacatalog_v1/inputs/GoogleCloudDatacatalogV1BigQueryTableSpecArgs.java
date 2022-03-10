// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1TableSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1ViewSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a BigQuery table.
 * 
 */
public final class GoogleCloudDatacatalogV1BigQueryTableSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1BigQueryTableSpecArgs Empty = new GoogleCloudDatacatalogV1BigQueryTableSpecArgs();

    /**
     * Specification of a BigQuery table. Populated only if the `table_source_type` is `BIGQUERY_TABLE`.
     * 
     */
    @InputImport(name="tableSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1TableSpecArgs> tableSpec;

    public Input<GoogleCloudDatacatalogV1TableSpecArgs> getTableSpec() {
        return this.tableSpec == null ? Input.empty() : this.tableSpec;
    }

    /**
     * Table view specification. Populated only if the `table_source_type` is `BIGQUERY_VIEW`.
     * 
     */
    @InputImport(name="viewSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1ViewSpecArgs> viewSpec;

    public Input<GoogleCloudDatacatalogV1ViewSpecArgs> getViewSpec() {
        return this.viewSpec == null ? Input.empty() : this.viewSpec;
    }

    public GoogleCloudDatacatalogV1BigQueryTableSpecArgs(
        @Nullable Input<GoogleCloudDatacatalogV1TableSpecArgs> tableSpec,
        @Nullable Input<GoogleCloudDatacatalogV1ViewSpecArgs> viewSpec) {
        this.tableSpec = tableSpec;
        this.viewSpec = viewSpec;
    }

    private GoogleCloudDatacatalogV1BigQueryTableSpecArgs() {
        this.tableSpec = Input.empty();
        this.viewSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryTableSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDatacatalogV1TableSpecArgs> tableSpec;
        private @Nullable Input<GoogleCloudDatacatalogV1ViewSpecArgs> viewSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryTableSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableSpec = defaults.tableSpec;
    	      this.viewSpec = defaults.viewSpec;
        }

        public Builder tableSpec(@Nullable Input<GoogleCloudDatacatalogV1TableSpecArgs> tableSpec) {
            this.tableSpec = tableSpec;
            return this;
        }

        public Builder tableSpec(@Nullable GoogleCloudDatacatalogV1TableSpecArgs tableSpec) {
            this.tableSpec = Input.ofNullable(tableSpec);
            return this;
        }

        public Builder viewSpec(@Nullable Input<GoogleCloudDatacatalogV1ViewSpecArgs> viewSpec) {
            this.viewSpec = viewSpec;
            return this;
        }

        public Builder viewSpec(@Nullable GoogleCloudDatacatalogV1ViewSpecArgs viewSpec) {
            this.viewSpec = Input.ofNullable(viewSpec);
            return this;
        }
        public GoogleCloudDatacatalogV1BigQueryTableSpecArgs build() {
            return new GoogleCloudDatacatalogV1BigQueryTableSpecArgs(tableSpec, viewSpec);
        }
    }
}
