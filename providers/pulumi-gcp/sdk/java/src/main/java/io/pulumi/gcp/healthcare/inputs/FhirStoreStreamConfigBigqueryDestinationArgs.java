// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs;
import java.lang.String;
import java.util.Objects;


public final class FhirStoreStreamConfigBigqueryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreStreamConfigBigqueryDestinationArgs Empty = new FhirStoreStreamConfigBigqueryDestinationArgs();

    /**
     * BigQuery URI to a dataset, up to 2000 characters long, in the format bq://projectId.bqDatasetId
     * 
     */
    @InputImport(name="datasetUri", required=true)
      private final Input<String> datasetUri;

    public Input<String> getDatasetUri() {
        return this.datasetUri;
    }

    /**
     * The configuration for the exported BigQuery schema.
     * Structure is documented below.
     * 
     */
    @InputImport(name="schemaConfig", required=true)
      private final Input<FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs> schemaConfig;

    public Input<FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs> getSchemaConfig() {
        return this.schemaConfig;
    }

    public FhirStoreStreamConfigBigqueryDestinationArgs(
        Input<String> datasetUri,
        Input<FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs> schemaConfig) {
        this.datasetUri = Objects.requireNonNull(datasetUri, "expected parameter 'datasetUri' to be non-null");
        this.schemaConfig = Objects.requireNonNull(schemaConfig, "expected parameter 'schemaConfig' to be non-null");
    }

    private FhirStoreStreamConfigBigqueryDestinationArgs() {
        this.datasetUri = Input.empty();
        this.schemaConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfigBigqueryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetUri;
        private Input<FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs> schemaConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfigBigqueryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetUri = defaults.datasetUri;
    	      this.schemaConfig = defaults.schemaConfig;
        }

        public Builder datasetUri(Input<String> datasetUri) {
            this.datasetUri = Objects.requireNonNull(datasetUri);
            return this;
        }

        public Builder datasetUri(String datasetUri) {
            this.datasetUri = Input.of(Objects.requireNonNull(datasetUri));
            return this;
        }

        public Builder schemaConfig(Input<FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs> schemaConfig) {
            this.schemaConfig = Objects.requireNonNull(schemaConfig);
            return this;
        }

        public Builder schemaConfig(FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs schemaConfig) {
            this.schemaConfig = Input.of(Objects.requireNonNull(schemaConfig));
            return this;
        }
        public FhirStoreStreamConfigBigqueryDestinationArgs build() {
            return new FhirStoreStreamConfigBigqueryDestinationArgs(datasetUri, schemaConfig);
        }
    }
}
