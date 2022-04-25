// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
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
 * The sharepoint online list resource dataset.
 * 
 */
public final class SharePointOnlineListResourceDatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final SharePointOnlineListResourceDatasetResponse Empty = new SharePointOnlineListResourceDatasetResponse();

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
     * The name of the SharePoint Online list. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="listName")
    private @Nullable Object listName;

    /**
     * @return The name of the SharePoint Online list. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> listName() {
        return Optional.ofNullable(this.listName);
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
     * Type of dataset.
     * Expected value is &#39;SharePointOnlineListResource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of dataset.
     * Expected value is &#39;SharePointOnlineListResource&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private SharePointOnlineListResourceDatasetResponse() {}

    private SharePointOnlineListResourceDatasetResponse(SharePointOnlineListResourceDatasetResponse $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.folder = $.folder;
        this.linkedServiceName = $.linkedServiceName;
        this.listName = $.listName;
        this.parameters = $.parameters;
        this.schema = $.schema;
        this.structure = $.structure;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharePointOnlineListResourceDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharePointOnlineListResourceDatasetResponse $;

        public Builder() {
            $ = new SharePointOnlineListResourceDatasetResponse();
        }

        public Builder(SharePointOnlineListResourceDatasetResponse defaults) {
            $ = new SharePointOnlineListResourceDatasetResponse(Objects.requireNonNull(defaults));
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
         * @param listName The name of the SharePoint Online list. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder listName(@Nullable Object listName) {
            $.listName = listName;
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
         * @param type Type of dataset.
         * Expected value is &#39;SharePointOnlineListResource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SharePointOnlineListResourceDatasetResponse build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
