// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1BigQueryTableSpecResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1BusinessContextResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1DataSourceResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1DatabaseTableSpecResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1GcsFilesetSpecResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1PersonalDetailsResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1RoutineSpecResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1SchemaResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1SystemTimestampsResponse;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1UsageSignalResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEntryResult {
    /**
     * @return Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name pattern. For more information, see [Introduction to partitioned tables] (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
     * 
     */
    private final GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse bigqueryDateShardedSpec;
    /**
     * @return Specification that applies to a BigQuery table. Valid only for entries with the `TABLE` type.
     * 
     */
    private final GoogleCloudDatacatalogV1BigQueryTableSpecResponse bigqueryTableSpec;
    /**
     * @return Business Context of the entry.
     * 
     */
    private final GoogleCloudDatacatalogV1BusinessContextResponse businessContext;
    /**
     * @return Physical location of the entry.
     * 
     */
    private final GoogleCloudDatacatalogV1DataSourceResponse dataSource;
    /**
     * @return Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
     * 
     */
    private final GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse dataSourceConnectionSpec;
    /**
     * @return Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
     * 
     */
    private final GoogleCloudDatacatalogV1DatabaseTableSpecResponse databaseTableSpec;
    /**
     * @return Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    private final String description;
    /**
     * @return Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    private final String displayName;
    /**
     * @return Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
     * 
     */
    private final String fullyQualifiedName;
    /**
     * @return Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
     * 
     */
    private final GoogleCloudDatacatalogV1GcsFilesetSpecResponse gcsFilesetSpec;
    /**
     * @return Indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore.
     * 
     */
    private final String integratedSystem;
    /**
     * @return Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
     * 
     */
    private final String linkedResource;
    /**
     * @return The resource name of an entry in URL format. Note: The entry itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    private final String name;
    /**
     * @return Additional information related to the entry. Private to the current user.
     * 
     */
    private final GoogleCloudDatacatalogV1PersonalDetailsResponse personalDetails;
    /**
     * @return Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
     * 
     */
    private final GoogleCloudDatacatalogV1RoutineSpecResponse routineSpec;
    /**
     * @return Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    private final GoogleCloudDatacatalogV1SchemaResponse schema;
    /**
     * @return Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
     * 
     */
    private final GoogleCloudDatacatalogV1SystemTimestampsResponse sourceSystemTimestamps;
    /**
     * @return The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
     * 
     */
    private final String type;
    /**
     * @return Resource usage statistics.
     * 
     */
    private final GoogleCloudDatacatalogV1UsageSignalResponse usageSignal;
    /**
     * @return Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    private final String userSpecifiedSystem;
    /**
     * @return Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    private final String userSpecifiedType;

    @CustomType.Constructor
    private GetEntryResult(
        @CustomType.Parameter("bigqueryDateShardedSpec") GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse bigqueryDateShardedSpec,
        @CustomType.Parameter("bigqueryTableSpec") GoogleCloudDatacatalogV1BigQueryTableSpecResponse bigqueryTableSpec,
        @CustomType.Parameter("businessContext") GoogleCloudDatacatalogV1BusinessContextResponse businessContext,
        @CustomType.Parameter("dataSource") GoogleCloudDatacatalogV1DataSourceResponse dataSource,
        @CustomType.Parameter("dataSourceConnectionSpec") GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse dataSourceConnectionSpec,
        @CustomType.Parameter("databaseTableSpec") GoogleCloudDatacatalogV1DatabaseTableSpecResponse databaseTableSpec,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("fullyQualifiedName") String fullyQualifiedName,
        @CustomType.Parameter("gcsFilesetSpec") GoogleCloudDatacatalogV1GcsFilesetSpecResponse gcsFilesetSpec,
        @CustomType.Parameter("integratedSystem") String integratedSystem,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("linkedResource") String linkedResource,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("personalDetails") GoogleCloudDatacatalogV1PersonalDetailsResponse personalDetails,
        @CustomType.Parameter("routineSpec") GoogleCloudDatacatalogV1RoutineSpecResponse routineSpec,
        @CustomType.Parameter("schema") GoogleCloudDatacatalogV1SchemaResponse schema,
        @CustomType.Parameter("sourceSystemTimestamps") GoogleCloudDatacatalogV1SystemTimestampsResponse sourceSystemTimestamps,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("usageSignal") GoogleCloudDatacatalogV1UsageSignalResponse usageSignal,
        @CustomType.Parameter("userSpecifiedSystem") String userSpecifiedSystem,
        @CustomType.Parameter("userSpecifiedType") String userSpecifiedType) {
        this.bigqueryDateShardedSpec = bigqueryDateShardedSpec;
        this.bigqueryTableSpec = bigqueryTableSpec;
        this.businessContext = businessContext;
        this.dataSource = dataSource;
        this.dataSourceConnectionSpec = dataSourceConnectionSpec;
        this.databaseTableSpec = databaseTableSpec;
        this.description = description;
        this.displayName = displayName;
        this.fullyQualifiedName = fullyQualifiedName;
        this.gcsFilesetSpec = gcsFilesetSpec;
        this.integratedSystem = integratedSystem;
        this.labels = labels;
        this.linkedResource = linkedResource;
        this.name = name;
        this.personalDetails = personalDetails;
        this.routineSpec = routineSpec;
        this.schema = schema;
        this.sourceSystemTimestamps = sourceSystemTimestamps;
        this.type = type;
        this.usageSignal = usageSignal;
        this.userSpecifiedSystem = userSpecifiedSystem;
        this.userSpecifiedType = userSpecifiedType;
    }

    /**
     * @return Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name pattern. For more information, see [Introduction to partitioned tables] (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
     * 
     */
    public GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse bigqueryDateShardedSpec() {
        return this.bigqueryDateShardedSpec;
    }
    /**
     * @return Specification that applies to a BigQuery table. Valid only for entries with the `TABLE` type.
     * 
     */
    public GoogleCloudDatacatalogV1BigQueryTableSpecResponse bigqueryTableSpec() {
        return this.bigqueryTableSpec;
    }
    /**
     * @return Business Context of the entry.
     * 
     */
    public GoogleCloudDatacatalogV1BusinessContextResponse businessContext() {
        return this.businessContext;
    }
    /**
     * @return Physical location of the entry.
     * 
     */
    public GoogleCloudDatacatalogV1DataSourceResponse dataSource() {
        return this.dataSource;
    }
    /**
     * @return Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
     * 
     */
    public GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse dataSourceConnectionSpec() {
        return this.dataSourceConnectionSpec;
    }
    /**
     * @return Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
     * 
     */
    public GoogleCloudDatacatalogV1DatabaseTableSpecResponse databaseTableSpec() {
        return this.databaseTableSpec;
    }
    /**
     * @return Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
     * 
     */
    public String fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * @return Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
     * 
     */
    public GoogleCloudDatacatalogV1GcsFilesetSpecResponse gcsFilesetSpec() {
        return this.gcsFilesetSpec;
    }
    /**
     * @return Indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore.
     * 
     */
    public String integratedSystem() {
        return this.integratedSystem;
    }
    /**
     * @return Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
     * 
     */
    public String linkedResource() {
        return this.linkedResource;
    }
    /**
     * @return The resource name of an entry in URL format. Note: The entry itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Additional information related to the entry. Private to the current user.
     * 
     */
    public GoogleCloudDatacatalogV1PersonalDetailsResponse personalDetails() {
        return this.personalDetails;
    }
    /**
     * @return Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
     * 
     */
    public GoogleCloudDatacatalogV1RoutineSpecResponse routineSpec() {
        return this.routineSpec;
    }
    /**
     * @return Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    public GoogleCloudDatacatalogV1SchemaResponse schema() {
        return this.schema;
    }
    /**
     * @return Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
     * 
     */
    public GoogleCloudDatacatalogV1SystemTimestampsResponse sourceSystemTimestamps() {
        return this.sourceSystemTimestamps;
    }
    /**
     * @return The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Resource usage statistics.
     * 
     */
    public GoogleCloudDatacatalogV1UsageSignalResponse usageSignal() {
        return this.usageSignal;
    }
    /**
     * @return Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    public String userSpecifiedSystem() {
        return this.userSpecifiedSystem;
    }
    /**
     * @return Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    public String userSpecifiedType() {
        return this.userSpecifiedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse bigqueryDateShardedSpec;
        private GoogleCloudDatacatalogV1BigQueryTableSpecResponse bigqueryTableSpec;
        private GoogleCloudDatacatalogV1BusinessContextResponse businessContext;
        private GoogleCloudDatacatalogV1DataSourceResponse dataSource;
        private GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse dataSourceConnectionSpec;
        private GoogleCloudDatacatalogV1DatabaseTableSpecResponse databaseTableSpec;
        private String description;
        private String displayName;
        private String fullyQualifiedName;
        private GoogleCloudDatacatalogV1GcsFilesetSpecResponse gcsFilesetSpec;
        private String integratedSystem;
        private Map<String,String> labels;
        private String linkedResource;
        private String name;
        private GoogleCloudDatacatalogV1PersonalDetailsResponse personalDetails;
        private GoogleCloudDatacatalogV1RoutineSpecResponse routineSpec;
        private GoogleCloudDatacatalogV1SchemaResponse schema;
        private GoogleCloudDatacatalogV1SystemTimestampsResponse sourceSystemTimestamps;
        private String type;
        private GoogleCloudDatacatalogV1UsageSignalResponse usageSignal;
        private String userSpecifiedSystem;
        private String userSpecifiedType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDateShardedSpec = defaults.bigqueryDateShardedSpec;
    	      this.bigqueryTableSpec = defaults.bigqueryTableSpec;
    	      this.businessContext = defaults.businessContext;
    	      this.dataSource = defaults.dataSource;
    	      this.dataSourceConnectionSpec = defaults.dataSourceConnectionSpec;
    	      this.databaseTableSpec = defaults.databaseTableSpec;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fullyQualifiedName = defaults.fullyQualifiedName;
    	      this.gcsFilesetSpec = defaults.gcsFilesetSpec;
    	      this.integratedSystem = defaults.integratedSystem;
    	      this.labels = defaults.labels;
    	      this.linkedResource = defaults.linkedResource;
    	      this.name = defaults.name;
    	      this.personalDetails = defaults.personalDetails;
    	      this.routineSpec = defaults.routineSpec;
    	      this.schema = defaults.schema;
    	      this.sourceSystemTimestamps = defaults.sourceSystemTimestamps;
    	      this.type = defaults.type;
    	      this.usageSignal = defaults.usageSignal;
    	      this.userSpecifiedSystem = defaults.userSpecifiedSystem;
    	      this.userSpecifiedType = defaults.userSpecifiedType;
        }

        public Builder bigqueryDateShardedSpec(GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse bigqueryDateShardedSpec) {
            this.bigqueryDateShardedSpec = Objects.requireNonNull(bigqueryDateShardedSpec);
            return this;
        }
        public Builder bigqueryTableSpec(GoogleCloudDatacatalogV1BigQueryTableSpecResponse bigqueryTableSpec) {
            this.bigqueryTableSpec = Objects.requireNonNull(bigqueryTableSpec);
            return this;
        }
        public Builder businessContext(GoogleCloudDatacatalogV1BusinessContextResponse businessContext) {
            this.businessContext = Objects.requireNonNull(businessContext);
            return this;
        }
        public Builder dataSource(GoogleCloudDatacatalogV1DataSourceResponse dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }
        public Builder dataSourceConnectionSpec(GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse dataSourceConnectionSpec) {
            this.dataSourceConnectionSpec = Objects.requireNonNull(dataSourceConnectionSpec);
            return this;
        }
        public Builder databaseTableSpec(GoogleCloudDatacatalogV1DatabaseTableSpecResponse databaseTableSpec) {
            this.databaseTableSpec = Objects.requireNonNull(databaseTableSpec);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            this.fullyQualifiedName = Objects.requireNonNull(fullyQualifiedName);
            return this;
        }
        public Builder gcsFilesetSpec(GoogleCloudDatacatalogV1GcsFilesetSpecResponse gcsFilesetSpec) {
            this.gcsFilesetSpec = Objects.requireNonNull(gcsFilesetSpec);
            return this;
        }
        public Builder integratedSystem(String integratedSystem) {
            this.integratedSystem = Objects.requireNonNull(integratedSystem);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder linkedResource(String linkedResource) {
            this.linkedResource = Objects.requireNonNull(linkedResource);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder personalDetails(GoogleCloudDatacatalogV1PersonalDetailsResponse personalDetails) {
            this.personalDetails = Objects.requireNonNull(personalDetails);
            return this;
        }
        public Builder routineSpec(GoogleCloudDatacatalogV1RoutineSpecResponse routineSpec) {
            this.routineSpec = Objects.requireNonNull(routineSpec);
            return this;
        }
        public Builder schema(GoogleCloudDatacatalogV1SchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public Builder sourceSystemTimestamps(GoogleCloudDatacatalogV1SystemTimestampsResponse sourceSystemTimestamps) {
            this.sourceSystemTimestamps = Objects.requireNonNull(sourceSystemTimestamps);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder usageSignal(GoogleCloudDatacatalogV1UsageSignalResponse usageSignal) {
            this.usageSignal = Objects.requireNonNull(usageSignal);
            return this;
        }
        public Builder userSpecifiedSystem(String userSpecifiedSystem) {
            this.userSpecifiedSystem = Objects.requireNonNull(userSpecifiedSystem);
            return this;
        }
        public Builder userSpecifiedType(String userSpecifiedType) {
            this.userSpecifiedType = Objects.requireNonNull(userSpecifiedType);
            return this;
        }        public GetEntryResult build() {
            return new GetEntryResult(bigqueryDateShardedSpec, bigqueryTableSpec, businessContext, dataSource, dataSourceConnectionSpec, databaseTableSpec, description, displayName, fullyQualifiedName, gcsFilesetSpec, integratedSystem, labels, linkedResource, name, personalDetails, routineSpec, schema, sourceSystemTimestamps, type, usageSignal, userSpecifiedSystem, userSpecifiedType);
        }
    }
}
