// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle Service Cloud dataset.
 * 
 */
public final class OracleServiceCloudObjectDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleServiceCloudObjectDatasetArgs Empty = new OracleServiceCloudObjectDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Dataset description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @InputImport(name="folder")
      private final @Nullable Input<DatasetFolderArgs> folder;

    public Input<DatasetFolderArgs> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
      private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<Object> schema;

    public Input<Object> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @InputImport(name="structure")
      private final @Nullable Input<Object> structure;

    public Input<Object> getStructure() {
        return this.structure == null ? Input.empty() : this.structure;
    }

    /**
     * The table name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tableName")
      private final @Nullable Input<Object> tableName;

    public Input<Object> getTableName() {
        return this.tableName == null ? Input.empty() : this.tableName;
    }

    /**
     * Type of dataset.
     * Expected value is 'OracleServiceCloudObject'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public OracleServiceCloudObjectDatasetArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<String> description,
        @Nullable Input<DatasetFolderArgs> folder,
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> schema,
        @Nullable Input<Object> structure,
        @Nullable Input<Object> tableName,
        Input<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.tableName = tableName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OracleServiceCloudObjectDatasetArgs() {
        this.annotations = Input.empty();
        this.description = Input.empty();
        this.folder = Input.empty();
        this.linkedServiceName = Input.empty();
        this.parameters = Input.empty();
        this.schema = Input.empty();
        this.structure = Input.empty();
        this.tableName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleServiceCloudObjectDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<String> description;
        private @Nullable Input<DatasetFolderArgs> folder;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> schema;
        private @Nullable Input<Object> structure;
        private @Nullable Input<Object> tableName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleServiceCloudObjectDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder folder(@Nullable Input<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(@Nullable DatasetFolderArgs folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder linkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder parameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder schema(@Nullable Input<Object> schema) {
            this.schema = schema;
            return this;
        }

        public Builder schema(@Nullable Object schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder structure(@Nullable Input<Object> structure) {
            this.structure = structure;
            return this;
        }

        public Builder structure(@Nullable Object structure) {
            this.structure = Input.ofNullable(structure);
            return this;
        }

        public Builder tableName(@Nullable Input<Object> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder tableName(@Nullable Object tableName) {
            this.tableName = Input.ofNullable(tableName);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public OracleServiceCloudObjectDatasetArgs build() {
            return new OracleServiceCloudObjectDatasetArgs(annotations, description, folder, linkedServiceName, parameters, schema, structure, tableName, type);
        }
    }
}
