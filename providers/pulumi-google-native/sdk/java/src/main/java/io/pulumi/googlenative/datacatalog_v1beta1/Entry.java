// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1beta1.EntryArgs;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SchemaResponse;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SystemTimestampsResponse;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1UsageSignalResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an entry. Only entries of 'FILESET' type or user-specified type can be created. Users should enable the Data Catalog API in the project identified by the `parent` parameter (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information). A maximum of 100,000 entries may be created per entry group.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datacatalog/v1beta1:Entry")
public class Entry extends io.pulumi.resources.CustomResource {
    /**
     * Specification for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context: https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * 
     */
    @OutputExport(name="bigqueryDateShardedSpec", type=GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse> bigqueryDateShardedSpec;

    /**
     * @return Specification for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context: https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse> getBigqueryDateShardedSpec() {
        return this.bigqueryDateShardedSpec;
    }
    /**
     * Specification that applies to a BigQuery table. This is only valid on entries of type `TABLE`.
     * 
     */
    @OutputExport(name="bigqueryTableSpec", type=GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse> bigqueryTableSpec;

    /**
     * @return Specification that applies to a BigQuery table. This is only valid on entries of type `TABLE`.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse> getBigqueryTableSpec() {
        return this.bigqueryTableSpec;
    }
    /**
     * Entry description, which can consist of several sentences or paragraphs that describe entry contents. Default value is an empty string.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Entry description, which can consist of several sentences or paragraphs that describe entry contents. Default value is an empty string.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Display information such as title and description. A short name to identify the entry, for example, "Analytics Data - Jan 2011". Default value is an empty string.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display information such as title and description. A short name to identify the entry, for example, "Analytics Data - Jan 2011". Default value is an empty string.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * 
     */
    @OutputExport(name="gcsFilesetSpec", type=GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse> gcsFilesetSpec;

    /**
     * @return Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse> getGcsFilesetSpec() {
        return this.gcsFilesetSpec;
    }
    /**
     * This field indicates the entry's source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
     * 
     */
    @OutputExport(name="integratedSystem", type=String.class, parameters={})
    private Output<String> integratedSystem;

    /**
     * @return This field indicates the entry's source system that Data Catalog integrates with, such as BigQuery or Pub/Sub.
     * 
     */
    public Output<String> getIntegratedSystem() {
        return this.integratedSystem;
    }
    /**
     * The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [full name of the resource](https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId Output only when Entry is of type in the EntryType enum. For entries with user_specified_type, this field is optional and defaults to an empty string.
     * 
     */
    @OutputExport(name="linkedResource", type=String.class, parameters={})
    private Output<String> linkedResource;

    /**
     * @return The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [full name of the resource](https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId Output only when Entry is of type in the EntryType enum. For entries with user_specified_type, this field is optional and defaults to an empty string.
     * 
     */
    public Output<String> getLinkedResource() {
        return this.linkedResource;
    }
    /**
     * The Data Catalog resource name of the entry in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id} Note that this Entry and its child resources may not actually be stored in the location in this name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Data Catalog resource name of the entry in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id} Note that this Entry and its child resources may not actually be stored in the location in this name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    @OutputExport(name="schema", type=GoogleCloudDatacatalogV1beta1SchemaResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1SchemaResponse> schema;

    /**
     * @return Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1SchemaResponse> getSchema() {
        return this.schema;
    }
    /**
     * Timestamps about the underlying resource, not about this Data Catalog entry. Output only when Entry is of type in the EntryType enum. For entries with user_specified_type, this field is optional and defaults to an empty timestamp.
     * 
     */
    @OutputExport(name="sourceSystemTimestamps", type=GoogleCloudDatacatalogV1beta1SystemTimestampsResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1SystemTimestampsResponse> sourceSystemTimestamps;

    /**
     * @return Timestamps about the underlying resource, not about this Data Catalog entry. Output only when Entry is of type in the EntryType enum. For entries with user_specified_type, this field is optional and defaults to an empty timestamp.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1SystemTimestampsResponse> getSourceSystemTimestamps() {
        return this.sourceSystemTimestamps;
    }
    /**
     * The type of the entry. Only used for Entries with types in the EntryType enum.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the entry. Only used for Entries with types in the EntryType enum.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Statistics on the usage level of the resource.
     * 
     */
    @OutputExport(name="usageSignal", type=GoogleCloudDatacatalogV1beta1UsageSignalResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1UsageSignalResponse> usageSignal;

    /**
     * @return Statistics on the usage level of the resource.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1UsageSignalResponse> getUsageSignal() {
        return this.usageSignal;
    }
    /**
     * This field indicates the entry's source system that Data Catalog does not integrate with. `user_specified_system` strings must begin with a letter or underscore and can only contain letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    @OutputExport(name="userSpecifiedSystem", type=String.class, parameters={})
    private Output<String> userSpecifiedSystem;

    /**
     * @return This field indicates the entry's source system that Data Catalog does not integrate with. `user_specified_system` strings must begin with a letter or underscore and can only contain letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long.
     * 
     */
    public Output<String> getUserSpecifiedSystem() {
        return this.userSpecifiedSystem;
    }
    /**
     * Entry type if it does not fit any of the input-allowed values listed in `EntryType` enum above. When creating an entry, users should check the enum values first, if nothing matches the entry to be created, then provide a custom value, for example "my_special_type". `user_specified_type` strings must begin with a letter or underscore and can only contain letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long. Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use `user_specified_type`.
     * 
     */
    @OutputExport(name="userSpecifiedType", type=String.class, parameters={})
    private Output<String> userSpecifiedType;

    /**
     * @return Entry type if it does not fit any of the input-allowed values listed in `EntryType` enum above. When creating an entry, users should check the enum values first, if nothing matches the entry to be created, then provide a custom value, for example "my_special_type". `user_specified_type` strings must begin with a letter or underscore and can only contain letters, numbers, and underscores; are case insensitive; must be at least 1 character and at most 64 characters long. Currently, only FILESET enum value is allowed. All other entries created through Data Catalog must use `user_specified_type`.
     * 
     */
    public Output<String> getUserSpecifiedType() {
        return this.userSpecifiedType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entry(String name, EntryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:Entry", name, args == null ? EntryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Entry(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:Entry", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Entry get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Entry(name, id, options);
    }
}
