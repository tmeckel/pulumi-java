// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.TextFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Azure Blob storage.
 * 
 */
public final class AzureBlobDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBlobDatasetArgs Empty = new AzureBlobDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the Dataset.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The data compression method used for the blob storage.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<DatasetCompressionArgs> compression;

    /**
     * @return The data compression method used for the blob storage.
     * 
     */
    public Optional<Output<DatasetCompressionArgs>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Dataset description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
    private @Nullable Output<Object> fileName;

    /**
     * @return The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<DatasetFolderArgs> folder;

    /**
     * @return The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    public Optional<Output<DatasetFolderArgs>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="folderPath")
    private @Nullable Output<Object> folderPath;

    /**
     * @return The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * The format of the Azure Blob storage.
     * 
     */
    @Import(name="format")
    private @Nullable Output<Object> format;

    /**
     * @return The format of the Azure Blob storage.
     * 
     */
    public Optional<Output<Object>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The end of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
    private @Nullable Output<Object> modifiedDatetimeEnd;

    /**
     * @return The end of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
    private @Nullable Output<Object> modifiedDatetimeStart;

    /**
     * @return The start of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for dataset.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<Object> schema;

    /**
     * @return Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    public Optional<Output<Object>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
    private @Nullable Output<Object> structure;

    /**
     * @return Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    public Optional<Output<Object>> structure() {
        return Optional.ofNullable(this.structure);
    }

    /**
     * The root of blob path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableRootLocation")
    private @Nullable Output<Object> tableRootLocation;

    /**
     * @return The root of blob path. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> tableRootLocation() {
        return Optional.ofNullable(this.tableRootLocation);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;AzureBlob&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of dataset.
     * Expected value is &#39;AzureBlob&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AzureBlobDatasetArgs() {}

    private AzureBlobDatasetArgs(AzureBlobDatasetArgs $) {
        this.annotations = $.annotations;
        this.compression = $.compression;
        this.description = $.description;
        this.fileName = $.fileName;
        this.folder = $.folder;
        this.folderPath = $.folderPath;
        this.format = $.format;
        this.linkedServiceName = $.linkedServiceName;
        this.modifiedDatetimeEnd = $.modifiedDatetimeEnd;
        this.modifiedDatetimeStart = $.modifiedDatetimeStart;
        this.parameters = $.parameters;
        this.schema = $.schema;
        this.structure = $.structure;
        this.tableRootLocation = $.tableRootLocation;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBlobDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobDatasetArgs $;

        public Builder() {
            $ = new AzureBlobDatasetArgs();
        }

        public Builder(AzureBlobDatasetArgs defaults) {
            $ = new AzureBlobDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param compression The data compression method used for the blob storage.
         * 
         * @return builder
         * 
         */
        public Builder compression(@Nullable Output<DatasetCompressionArgs> compression) {
            $.compression = compression;
            return this;
        }

        /**
         * @param compression The data compression method used for the blob storage.
         * 
         * @return builder
         * 
         */
        public Builder compression(DatasetCompressionArgs compression) {
            return compression(Output.of(compression));
        }

        /**
         * @param description Dataset description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Dataset description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileName The name of the Azure Blob. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileName(@Nullable Output<Object> fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param fileName The name of the Azure Blob. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileName(Object fileName) {
            return fileName(Output.of(fileName));
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(DatasetFolderArgs folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param folderPath The path of the Azure Blob storage. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder folderPath(@Nullable Output<Object> folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        /**
         * @param folderPath The path of the Azure Blob storage. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder folderPath(Object folderPath) {
            return folderPath(Output.of(folderPath));
        }

        /**
         * @param format The format of the Azure Blob storage.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<Object> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the Azure Blob storage.
         * 
         * @return builder
         * 
         */
        public Builder format(Object format) {
            return format(Output.of(format));
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param modifiedDatetimeEnd The end of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeEnd(@Nullable Output<Object> modifiedDatetimeEnd) {
            $.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        /**
         * @param modifiedDatetimeEnd The end of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeEnd(Object modifiedDatetimeEnd) {
            return modifiedDatetimeEnd(Output.of(modifiedDatetimeEnd));
        }

        /**
         * @param modifiedDatetimeStart The start of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeStart(@Nullable Output<Object> modifiedDatetimeStart) {
            $.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        /**
         * @param modifiedDatetimeStart The start of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeStart(Object modifiedDatetimeStart) {
            return modifiedDatetimeStart(Output.of(modifiedDatetimeStart));
        }

        /**
         * @param parameters Parameters for dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param schema Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<Object> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
         * 
         * @return builder
         * 
         */
        public Builder schema(Object schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param structure Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
         * 
         * @return builder
         * 
         */
        public Builder structure(@Nullable Output<Object> structure) {
            $.structure = structure;
            return this;
        }

        /**
         * @param structure Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
         * 
         * @return builder
         * 
         */
        public Builder structure(Object structure) {
            return structure(Output.of(structure));
        }

        /**
         * @param tableRootLocation The root of blob path. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableRootLocation(@Nullable Output<Object> tableRootLocation) {
            $.tableRootLocation = tableRootLocation;
            return this;
        }

        /**
         * @param tableRootLocation The root of blob path. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableRootLocation(Object tableRootLocation) {
            return tableRootLocation(Output.of(tableRootLocation));
        }

        /**
         * @param type Type of dataset.
         * Expected value is &#39;AzureBlob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of dataset.
         * Expected value is &#39;AzureBlob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureBlobDatasetArgs build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
