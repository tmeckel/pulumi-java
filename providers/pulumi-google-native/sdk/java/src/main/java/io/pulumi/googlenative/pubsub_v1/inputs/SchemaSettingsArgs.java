// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.pubsub_v1.enums.SchemaSettingsEncoding;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for validating messages published against a schema.
 * 
 */
public final class SchemaSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaSettingsArgs Empty = new SchemaSettingsArgs();

    /**
     * The encoding of messages validated against `schema`.
     * 
     */
    @InputImport(name="encoding")
    private final @Nullable Input<SchemaSettingsEncoding> encoding;

    public Input<SchemaSettingsEncoding> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * The name of the schema that messages published should be validated against. Format is `projects/{project}/schemas/{schema}`. The value of this field will be `_deleted-schema_` if the schema has been deleted.
     * 
     */
    @InputImport(name="schema", required=true)
    private final Input<String> schema;

    public Input<String> getSchema() {
        return this.schema;
    }

    public SchemaSettingsArgs(
        @Nullable Input<SchemaSettingsEncoding> encoding,
        Input<String> schema) {
        this.encoding = encoding;
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
    }

    private SchemaSettingsArgs() {
        this.encoding = Input.empty();
        this.schema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SchemaSettingsEncoding> encoding;
        private Input<String> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.schema = defaults.schema;
        }

        public Builder setEncoding(@Nullable Input<SchemaSettingsEncoding> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable SchemaSettingsEncoding encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setSchema(Input<String> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSchema(String schema) {
            this.schema = Input.of(Objects.requireNonNull(schema));
            return this;
        }

        public SchemaSettingsArgs build() {
            return new SchemaSettingsArgs(encoding, schema);
        }
    }
}
