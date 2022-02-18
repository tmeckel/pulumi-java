// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.ClusteringArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ExternalDataConfigurationArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.MaterializedViewDefinitionArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelDefinitionArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.RangePartitioningArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableSchemaArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TimePartitioningArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ViewDefinitionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * [Beta] Clustering specification for the table. Must be specified with partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    @InputImport(name="clustering")
    private final @Nullable Input<ClusteringArgs> clustering;

    public Input<ClusteringArgs> getClustering() {
        return this.clustering == null ? Input.empty() : this.clustering;
    }

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * [Optional] A user-friendly description of this table.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @InputImport(name="encryptionConfiguration")
    private final @Nullable Input<EncryptionConfigurationArgs> encryptionConfiguration;

    public Input<EncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    /**
     * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
     * 
     */
    @InputImport(name="expirationTime")
    private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    @InputImport(name="externalDataConfiguration")
    private final @Nullable Input<ExternalDataConfigurationArgs> externalDataConfiguration;

    public Input<ExternalDataConfigurationArgs> getExternalDataConfiguration() {
        return this.externalDataConfiguration == null ? Input.empty() : this.externalDataConfiguration;
    }

    /**
     * [Optional] A descriptive name for this table.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * [Optional] Materialized view definition.
     * 
     */
    @InputImport(name="materializedView")
    private final @Nullable Input<MaterializedViewDefinitionArgs> materializedView;

    public Input<MaterializedViewDefinitionArgs> getMaterializedView() {
        return this.materializedView == null ? Input.empty() : this.materializedView;
    }

    /**
     * [Output-only, Beta] Present iff this table represents a ML model. Describes the training information for the model, and it is required to run 'PREDICT' queries.
     * 
     */
    @InputImport(name="model")
    private final @Nullable Input<ModelDefinitionArgs> model;

    public Input<ModelDefinitionArgs> getModel() {
        return this.model == null ? Input.empty() : this.model;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @InputImport(name="rangePartitioning")
    private final @Nullable Input<RangePartitioningArgs> rangePartitioning;

    public Input<RangePartitioningArgs> getRangePartitioning() {
        return this.rangePartitioning == null ? Input.empty() : this.rangePartitioning;
    }

    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    @InputImport(name="requirePartitionFilter")
    private final @Nullable Input<Boolean> requirePartitionFilter;

    public Input<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter == null ? Input.empty() : this.requirePartitionFilter;
    }

    /**
     * [Optional] Describes the schema of this table.
     * 
     */
    @InputImport(name="schema")
    private final @Nullable Input<TableSchemaArgs> schema;

    public Input<TableSchemaArgs> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * [Required] Reference describing the ID of this table.
     * 
     */
    @InputImport(name="tableReference")
    private final @Nullable Input<TableReferenceArgs> tableReference;

    public Input<TableReferenceArgs> getTableReference() {
        return this.tableReference == null ? Input.empty() : this.tableReference;
    }

    /**
     * Time-based partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @InputImport(name="timePartitioning")
    private final @Nullable Input<TimePartitioningArgs> timePartitioning;

    public Input<TimePartitioningArgs> getTimePartitioning() {
        return this.timePartitioning == null ? Input.empty() : this.timePartitioning;
    }

    /**
     * [Optional] The view definition.
     * 
     */
    @InputImport(name="view")
    private final @Nullable Input<ViewDefinitionArgs> view;

    public Input<ViewDefinitionArgs> getView() {
        return this.view == null ? Input.empty() : this.view;
    }

    public TableArgs(
        @Nullable Input<ClusteringArgs> clustering,
        Input<String> datasetId,
        @Nullable Input<String> description,
        @Nullable Input<EncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Input<String> expirationTime,
        @Nullable Input<ExternalDataConfigurationArgs> externalDataConfiguration,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<MaterializedViewDefinitionArgs> materializedView,
        @Nullable Input<ModelDefinitionArgs> model,
        @Nullable Input<String> project,
        @Nullable Input<RangePartitioningArgs> rangePartitioning,
        @Nullable Input<Boolean> requirePartitionFilter,
        @Nullable Input<TableSchemaArgs> schema,
        @Nullable Input<TableReferenceArgs> tableReference,
        @Nullable Input<TimePartitioningArgs> timePartitioning,
        @Nullable Input<ViewDefinitionArgs> view) {
        this.clustering = clustering;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.description = description;
        this.encryptionConfiguration = encryptionConfiguration;
        this.expirationTime = expirationTime;
        this.externalDataConfiguration = externalDataConfiguration;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.materializedView = materializedView;
        this.model = model;
        this.project = project;
        this.rangePartitioning = rangePartitioning;
        this.requirePartitionFilter = requirePartitionFilter;
        this.schema = schema;
        this.tableReference = tableReference;
        this.timePartitioning = timePartitioning;
        this.view = view;
    }

    private TableArgs() {
        this.clustering = Input.empty();
        this.datasetId = Input.empty();
        this.description = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.expirationTime = Input.empty();
        this.externalDataConfiguration = Input.empty();
        this.friendlyName = Input.empty();
        this.labels = Input.empty();
        this.materializedView = Input.empty();
        this.model = Input.empty();
        this.project = Input.empty();
        this.rangePartitioning = Input.empty();
        this.requirePartitionFilter = Input.empty();
        this.schema = Input.empty();
        this.tableReference = Input.empty();
        this.timePartitioning = Input.empty();
        this.view = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusteringArgs> clustering;
        private Input<String> datasetId;
        private @Nullable Input<String> description;
        private @Nullable Input<EncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<ExternalDataConfigurationArgs> externalDataConfiguration;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<MaterializedViewDefinitionArgs> materializedView;
        private @Nullable Input<ModelDefinitionArgs> model;
        private @Nullable Input<String> project;
        private @Nullable Input<RangePartitioningArgs> rangePartitioning;
        private @Nullable Input<Boolean> requirePartitionFilter;
        private @Nullable Input<TableSchemaArgs> schema;
        private @Nullable Input<TableReferenceArgs> tableReference;
        private @Nullable Input<TimePartitioningArgs> timePartitioning;
        private @Nullable Input<ViewDefinitionArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clustering = defaults.clustering;
    	      this.datasetId = defaults.datasetId;
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.expirationTime = defaults.expirationTime;
    	      this.externalDataConfiguration = defaults.externalDataConfiguration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.materializedView = defaults.materializedView;
    	      this.model = defaults.model;
    	      this.project = defaults.project;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.schema = defaults.schema;
    	      this.tableReference = defaults.tableReference;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.view = defaults.view;
        }

        public Builder setClustering(@Nullable Input<ClusteringArgs> clustering) {
            this.clustering = clustering;
            return this;
        }

        public Builder setClustering(@Nullable ClusteringArgs clustering) {
            this.clustering = Input.ofNullable(clustering);
            return this;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<EncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable EncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setExpirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder setExternalDataConfiguration(@Nullable Input<ExternalDataConfigurationArgs> externalDataConfiguration) {
            this.externalDataConfiguration = externalDataConfiguration;
            return this;
        }

        public Builder setExternalDataConfiguration(@Nullable ExternalDataConfigurationArgs externalDataConfiguration) {
            this.externalDataConfiguration = Input.ofNullable(externalDataConfiguration);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMaterializedView(@Nullable Input<MaterializedViewDefinitionArgs> materializedView) {
            this.materializedView = materializedView;
            return this;
        }

        public Builder setMaterializedView(@Nullable MaterializedViewDefinitionArgs materializedView) {
            this.materializedView = Input.ofNullable(materializedView);
            return this;
        }

        public Builder setModel(@Nullable Input<ModelDefinitionArgs> model) {
            this.model = model;
            return this;
        }

        public Builder setModel(@Nullable ModelDefinitionArgs model) {
            this.model = Input.ofNullable(model);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRangePartitioning(@Nullable Input<RangePartitioningArgs> rangePartitioning) {
            this.rangePartitioning = rangePartitioning;
            return this;
        }

        public Builder setRangePartitioning(@Nullable RangePartitioningArgs rangePartitioning) {
            this.rangePartitioning = Input.ofNullable(rangePartitioning);
            return this;
        }

        public Builder setRequirePartitionFilter(@Nullable Input<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        public Builder setRequirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Input.ofNullable(requirePartitionFilter);
            return this;
        }

        public Builder setSchema(@Nullable Input<TableSchemaArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable TableSchemaArgs schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setTableReference(@Nullable Input<TableReferenceArgs> tableReference) {
            this.tableReference = tableReference;
            return this;
        }

        public Builder setTableReference(@Nullable TableReferenceArgs tableReference) {
            this.tableReference = Input.ofNullable(tableReference);
            return this;
        }

        public Builder setTimePartitioning(@Nullable Input<TimePartitioningArgs> timePartitioning) {
            this.timePartitioning = timePartitioning;
            return this;
        }

        public Builder setTimePartitioning(@Nullable TimePartitioningArgs timePartitioning) {
            this.timePartitioning = Input.ofNullable(timePartitioning);
            return this;
        }

        public Builder setView(@Nullable Input<ViewDefinitionArgs> view) {
            this.view = view;
            return this;
        }

        public Builder setView(@Nullable ViewDefinitionArgs view) {
            this.view = Input.ofNullable(view);
            return this;
        }

        public TableArgs build() {
            return new TableArgs(clustering, datasetId, description, encryptionConfiguration, expirationTime, externalDataConfiguration, friendlyName, labels, materializedView, model, project, rangePartitioning, requirePartitionFilter, schema, tableReference, timePartitioning, view);
        }
    }
}
