// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Settings for validating messages published against a schema.
 * 
 */
public final class SchemaSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchemaSettingsResponse Empty = new SchemaSettingsResponse();

    /**
     * The encoding of messages validated against `schema`.
     * 
     */
    @InputImport(name="encoding", required=true)
      private final String encoding;

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * The name of the schema that messages published should be validated against. Format is `projects/{project}/schemas/{schema}`. The value of this field will be `_deleted-schema_` if the schema has been deleted.
     * 
     */
    @InputImport(name="schema", required=true)
      private final String schema;

    public String getSchema() {
        return this.schema;
    }

    public SchemaSettingsResponse(
        String encoding,
        String schema) {
        this.encoding = Objects.requireNonNull(encoding, "expected parameter 'encoding' to be non-null");
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
    }

    private SchemaSettingsResponse() {
        this.encoding = null;
        this.schema = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encoding;
        private String schema;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.schema = defaults.schema;
        }

        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public SchemaSettingsResponse build() {
            return new SchemaSettingsResponse(encoding, schema);
        }
    }
}
