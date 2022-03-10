// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Fields specific for BigQuery routines.
 * 
 */
public final class GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse Empty = new GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse();

    /**
     * Paths of the imported libraries.
     * 
     */
    @InputImport(name="importedLibraries", required=true)
      private final List<String> importedLibraries;

    public List<String> getImportedLibraries() {
        return this.importedLibraries;
    }

    public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse(List<String> importedLibraries) {
        this.importedLibraries = Objects.requireNonNull(importedLibraries, "expected parameter 'importedLibraries' to be non-null");
    }

    private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse() {
        this.importedLibraries = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> importedLibraries;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importedLibraries = defaults.importedLibraries;
        }

        public Builder importedLibraries(List<String> importedLibraries) {
            this.importedLibraries = Objects.requireNonNull(importedLibraries);
            return this;
        }
        public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse build() {
            return new GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse(importedLibraries);
        }
    }
}
