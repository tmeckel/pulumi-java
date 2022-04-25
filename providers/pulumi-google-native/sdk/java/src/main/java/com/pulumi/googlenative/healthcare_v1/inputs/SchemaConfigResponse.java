// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for the FHIR BigQuery schema. Determines how the server generates the schema.
 * 
 */
public final class SchemaConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SchemaConfigResponse Empty = new SchemaConfigResponse();

    /**
     * The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
     * 
     */
    @Import(name="recursiveStructureDepth", required=true)
    private String recursiveStructureDepth;

    /**
     * @return The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
     * 
     */
    public String recursiveStructureDepth() {
        return this.recursiveStructureDepth;
    }

    /**
     * Specifies the output schema type. Schema type is required.
     * 
     */
    @Import(name="schemaType", required=true)
    private String schemaType;

    /**
     * @return Specifies the output schema type. Schema type is required.
     * 
     */
    public String schemaType() {
        return this.schemaType;
    }

    private SchemaConfigResponse() {}

    private SchemaConfigResponse(SchemaConfigResponse $) {
        this.recursiveStructureDepth = $.recursiveStructureDepth;
        this.schemaType = $.schemaType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaConfigResponse $;

        public Builder() {
            $ = new SchemaConfigResponse();
        }

        public Builder(SchemaConfigResponse defaults) {
            $ = new SchemaConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param recursiveStructureDepth The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
         * 
         * @return builder
         * 
         */
        public Builder recursiveStructureDepth(String recursiveStructureDepth) {
            $.recursiveStructureDepth = recursiveStructureDepth;
            return this;
        }

        /**
         * @param schemaType Specifies the output schema type. Schema type is required.
         * 
         * @return builder
         * 
         */
        public Builder schemaType(String schemaType) {
            $.schemaType = schemaType;
            return this;
        }

        public SchemaConfigResponse build() {
            $.recursiveStructureDepth = Objects.requireNonNull($.recursiveStructureDepth, "expected parameter 'recursiveStructureDepth' to be non-null");
            $.schemaType = Objects.requireNonNull($.schemaType, "expected parameter 'schemaType' to be non-null");
            return $;
        }
    }

}
