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
 * A Rest service dataset.
 * 
 */
public final class RestResourceDatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final RestResourceDatasetResponse Empty = new RestResourceDatasetResponse();

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="additionalHeaders")
    private @Nullable Object additionalHeaders;

    /**
     * @return The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> additionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }

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
     * The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="paginationRules")
    private @Nullable Object paginationRules;

    /**
     * @return The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> paginationRules() {
        return Optional.ofNullable(this.paginationRules);
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
     * The relative URL to the resource that the RESTful API provides. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="relativeUrl")
    private @Nullable Object relativeUrl;

    /**
     * @return The relative URL to the resource that the RESTful API provides. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> relativeUrl() {
        return Optional.ofNullable(this.relativeUrl);
    }

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestBody")
    private @Nullable Object requestBody;

    /**
     * @return The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> requestBody() {
        return Optional.ofNullable(this.requestBody);
    }

    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestMethod")
    private @Nullable Object requestMethod;

    /**
     * @return The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
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
     * Expected value is &#39;RestResource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of dataset.
     * Expected value is &#39;RestResource&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private RestResourceDatasetResponse() {}

    private RestResourceDatasetResponse(RestResourceDatasetResponse $) {
        this.additionalHeaders = $.additionalHeaders;
        this.annotations = $.annotations;
        this.description = $.description;
        this.folder = $.folder;
        this.linkedServiceName = $.linkedServiceName;
        this.paginationRules = $.paginationRules;
        this.parameters = $.parameters;
        this.relativeUrl = $.relativeUrl;
        this.requestBody = $.requestBody;
        this.requestMethod = $.requestMethod;
        this.schema = $.schema;
        this.structure = $.structure;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestResourceDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestResourceDatasetResponse $;

        public Builder() {
            $ = new RestResourceDatasetResponse();
        }

        public Builder(RestResourceDatasetResponse defaults) {
            $ = new RestResourceDatasetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalHeaders The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder additionalHeaders(@Nullable Object additionalHeaders) {
            $.additionalHeaders = additionalHeaders;
            return this;
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
         * @param paginationRules The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder paginationRules(@Nullable Object paginationRules) {
            $.paginationRules = paginationRules;
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
         * @param relativeUrl The relative URL to the resource that the RESTful API provides. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder relativeUrl(@Nullable Object relativeUrl) {
            $.relativeUrl = relativeUrl;
            return this;
        }

        /**
         * @param requestBody The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestBody(@Nullable Object requestBody) {
            $.requestBody = requestBody;
            return this;
        }

        /**
         * @param requestMethod The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestMethod(@Nullable Object requestMethod) {
            $.requestMethod = requestMethod;
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
         * Expected value is &#39;RestResource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public RestResourceDatasetResponse build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
