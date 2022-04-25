// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Normal BigQuery table specification.
 * 
 */
public final class GoogleCloudDatacatalogV1TableSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1TableSpecResponse Empty = new GoogleCloudDatacatalogV1TableSpecResponse();

    /**
     * If the table is date-sharded, that is, it matches the `[prefix]YYYYMMDD` name pattern, this field is the Data Catalog resource name of the date-sharded grouped entry. For example: `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`. Otherwise, `grouped_entry` is empty.
     * 
     */
    @Import(name="groupedEntry", required=true)
    private String groupedEntry;

    /**
     * @return If the table is date-sharded, that is, it matches the `[prefix]YYYYMMDD` name pattern, this field is the Data Catalog resource name of the date-sharded grouped entry. For example: `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`. Otherwise, `grouped_entry` is empty.
     * 
     */
    public String groupedEntry() {
        return this.groupedEntry;
    }

    private GoogleCloudDatacatalogV1TableSpecResponse() {}

    private GoogleCloudDatacatalogV1TableSpecResponse(GoogleCloudDatacatalogV1TableSpecResponse $) {
        this.groupedEntry = $.groupedEntry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1TableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1TableSpecResponse $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1TableSpecResponse();
        }

        public Builder(GoogleCloudDatacatalogV1TableSpecResponse defaults) {
            $ = new GoogleCloudDatacatalogV1TableSpecResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupedEntry If the table is date-sharded, that is, it matches the `[prefix]YYYYMMDD` name pattern, this field is the Data Catalog resource name of the date-sharded grouped entry. For example: `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`. Otherwise, `grouped_entry` is empty.
         * 
         * @return builder
         * 
         */
        public Builder groupedEntry(String groupedEntry) {
            $.groupedEntry = groupedEntry;
            return this;
        }

        public GoogleCloudDatacatalogV1TableSpecResponse build() {
            $.groupedEntry = Objects.requireNonNull($.groupedEntry, "expected parameter 'groupedEntry' to be non-null");
            return $;
        }
    }

}
