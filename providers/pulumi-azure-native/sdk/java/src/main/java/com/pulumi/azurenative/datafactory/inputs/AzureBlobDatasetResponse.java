// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.TextFormatResponse;
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
public final class AzureBlobDatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBlobDatasetResponse Empty = new AzureBlobDatasetResponse();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    /**
     * @return List of tags that can be used for describing the Dataset.
     * 
     */
    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The data compression method used for the blob storage.
     * 
     */
    @Import(name="compression")
    private @Nullable DatasetCompressionResponse compression;

    /**
     * @return The data compression method used for the blob storage.
     * 
     */
    public Optional<DatasetCompressionResponse> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Dataset description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
    private @Nullable Object fileName;

    /**
     * @return The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable DatasetResponseFolder folder;

    /**
     * @return The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    public Optional<DatasetResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="folderPath")
    private @Nullable Object folderPath;

    /**
     * @return The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * The format of the Azure Blob storage.
     * 
     */
    @Import(name="format")
    private @Nullable Object format;

    /**
     * @return The format of the Azure Blob storage.
     * 
     */
    public Optional<Object> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private LinkedServiceReferenceResponse linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The end of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
    private @Nullable Object modifiedDatetimeEnd;

    /**
     * @return The end of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
    private @Nullable Object modifiedDatetimeStart;

    /**
     * @return The start of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    /**
     * @return Parameters for dataset.
     * 
     */
    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
    private @Nullable Object schema;

    /**
     * @return Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    public Optional<Object> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
    private @Nullable Object structure;

    /**
     * @return Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    public Optional<Object> structure() {
        return Optional.ofNullable(this.structure);
    }

    /**
     * The root of blob path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableRootLocation")
    private @Nullable Object tableRootLocation;

    /**
     * @return The root of blob path. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> tableRootLocation() {
        return Optional.ofNullable(this.tableRootLocation);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;AzureBlob&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of dataset.
     * Expected value is &#39;AzureBlob&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private AzureBlobDatasetResponse() {}

    private AzureBlobDatasetResponse(AzureBlobDatasetResponse $) {
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
    public static Builder builder(AzureBlobDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobDatasetResponse $;

        public Builder() {
            $ = new AzureBlobDatasetResponse();
        }

        public Builder(AzureBlobDatasetResponse defaults) {
            $ = new AzureBlobDatasetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
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
        public Builder compression(@Nullable DatasetCompressionResponse compression) {
            $.compression = compression;
            return this;
        }

        /**
         * @param description Dataset description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param fileName The name of the Azure Blob. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileName(@Nullable Object fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable DatasetResponseFolder folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folderPath The path of the Azure Blob storage. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder folderPath(@Nullable Object folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        /**
         * @param format The format of the Azure Blob storage.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Object format) {
            $.format = format;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param modifiedDatetimeEnd The end of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            $.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        /**
         * @param modifiedDatetimeStart The start of Azure Blob&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            $.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        /**
         * @param parameters Parameters for dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param schema Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Object schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param structure Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
         * 
         * @return builder
         * 
         */
        public Builder structure(@Nullable Object structure) {
            $.structure = structure;
            return this;
        }

        /**
         * @param tableRootLocation The root of blob path. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableRootLocation(@Nullable Object tableRootLocation) {
            $.tableRootLocation = tableRootLocation;
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
            $.type = type;
            return this;
        }

        public AzureBlobDatasetResponse build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
