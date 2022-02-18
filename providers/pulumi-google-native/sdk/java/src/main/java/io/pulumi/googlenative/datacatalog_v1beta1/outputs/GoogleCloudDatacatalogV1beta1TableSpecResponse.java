// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1beta1TableSpecResponse {
    /**
     * If the table is a dated shard, i.e., with name pattern `[prefix]YYYYMMDD`, `grouped_entry` is the Data Catalog resource name of the date sharded grouped entry, for example, `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`. Otherwise, `grouped_entry` is empty.
     * 
     */
    private final String groupedEntry;

    @OutputCustomType.Constructor({"groupedEntry"})
    private GoogleCloudDatacatalogV1beta1TableSpecResponse(String groupedEntry) {
        this.groupedEntry = Objects.requireNonNull(groupedEntry);
    }

    /**
     * If the table is a dated shard, i.e., with name pattern `[prefix]YYYYMMDD`, `grouped_entry` is the Data Catalog resource name of the date sharded grouped entry, for example, `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`. Otherwise, `grouped_entry` is empty.
     * 
     */
    public String getGroupedEntry() {
        return this.groupedEntry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1TableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupedEntry;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1TableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupedEntry = defaults.groupedEntry;
        }

        public Builder setGroupedEntry(String groupedEntry) {
            this.groupedEntry = Objects.requireNonNull(groupedEntry);
            return this;
        }

        public GoogleCloudDatacatalogV1beta1TableSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1TableSpecResponse(groupedEntry);
        }
    }
}
