// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Normal BigQuery table specification.
 * 
 */
public final class GoogleCloudDatacatalogV1TableSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1TableSpecResponse Empty = new GoogleCloudDatacatalogV1TableSpecResponse();

    /**
     * If the table is date-sharded, that is, it matches the `[prefix]YYYYMMDD` name pattern, this field is the Data Catalog resource name of the date-sharded grouped entry. For example: `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`. Otherwise, `grouped_entry` is empty.
     * 
     */
    @InputImport(name="groupedEntry", required=true)
      private final String groupedEntry;

    public String getGroupedEntry() {
        return this.groupedEntry;
    }

    public GoogleCloudDatacatalogV1TableSpecResponse(String groupedEntry) {
        this.groupedEntry = Objects.requireNonNull(groupedEntry, "expected parameter 'groupedEntry' to be non-null");
    }

    private GoogleCloudDatacatalogV1TableSpecResponse() {
        this.groupedEntry = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1TableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupedEntry;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1TableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupedEntry = defaults.groupedEntry;
        }

        public Builder groupedEntry(String groupedEntry) {
            this.groupedEntry = Objects.requireNonNull(groupedEntry);
            return this;
        }
        public GoogleCloudDatacatalogV1TableSpecResponse build() {
            return new GoogleCloudDatacatalogV1TableSpecResponse(groupedEntry);
        }
    }
}
