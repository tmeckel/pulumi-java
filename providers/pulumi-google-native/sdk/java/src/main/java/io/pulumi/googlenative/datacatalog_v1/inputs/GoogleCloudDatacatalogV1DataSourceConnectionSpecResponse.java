// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse;
import java.util.Objects;


/**
 * Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
 * 
 */
public final class GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse Empty = new GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse();

    /**
     * Fields specific to BigQuery connections.
     * 
     */
    @InputImport(name="bigqueryConnectionSpec", required=true)
    private final GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec;

    public GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse getBigqueryConnectionSpec() {
        return this.bigqueryConnectionSpec;
    }

    public GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec) {
        this.bigqueryConnectionSpec = Objects.requireNonNull(bigqueryConnectionSpec, "expected parameter 'bigqueryConnectionSpec' to be non-null");
    }

    private GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse() {
        this.bigqueryConnectionSpec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryConnectionSpec = defaults.bigqueryConnectionSpec;
        }

        public Builder setBigqueryConnectionSpec(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec) {
            this.bigqueryConnectionSpec = Objects.requireNonNull(bigqueryConnectionSpec);
            return this;
        }

        public GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse build() {
            return new GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse(bigqueryConnectionSpec);
        }
    }
}
