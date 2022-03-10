// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.enums.SchemaConfigSchemaType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the FHIR BigQuery schema. Determines how the server generates the schema.
 * 
 */
public final class SchemaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaConfigArgs Empty = new SchemaConfigArgs();

    /**
     * The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
     * 
     */
    @InputImport(name="recursiveStructureDepth")
      private final @Nullable Input<String> recursiveStructureDepth;

    public Input<String> getRecursiveStructureDepth() {
        return this.recursiveStructureDepth == null ? Input.empty() : this.recursiveStructureDepth;
    }

    /**
     * Specifies the output schema type. Schema type is required.
     * 
     */
    @InputImport(name="schemaType")
      private final @Nullable Input<SchemaConfigSchemaType> schemaType;

    public Input<SchemaConfigSchemaType> getSchemaType() {
        return this.schemaType == null ? Input.empty() : this.schemaType;
    }

    public SchemaConfigArgs(
        @Nullable Input<String> recursiveStructureDepth,
        @Nullable Input<SchemaConfigSchemaType> schemaType) {
        this.recursiveStructureDepth = recursiveStructureDepth;
        this.schemaType = schemaType;
    }

    private SchemaConfigArgs() {
        this.recursiveStructureDepth = Input.empty();
        this.schemaType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> recursiveStructureDepth;
        private @Nullable Input<SchemaConfigSchemaType> schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveStructureDepth = defaults.recursiveStructureDepth;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder recursiveStructureDepth(@Nullable Input<String> recursiveStructureDepth) {
            this.recursiveStructureDepth = recursiveStructureDepth;
            return this;
        }

        public Builder recursiveStructureDepth(@Nullable String recursiveStructureDepth) {
            this.recursiveStructureDepth = Input.ofNullable(recursiveStructureDepth);
            return this;
        }

        public Builder schemaType(@Nullable Input<SchemaConfigSchemaType> schemaType) {
            this.schemaType = schemaType;
            return this;
        }

        public Builder schemaType(@Nullable SchemaConfigSchemaType schemaType) {
            this.schemaType = Input.ofNullable(schemaType);
            return this;
        }
        public SchemaConfigArgs build() {
            return new SchemaConfigArgs(recursiveStructureDepth, schemaType);
        }
    }
}
