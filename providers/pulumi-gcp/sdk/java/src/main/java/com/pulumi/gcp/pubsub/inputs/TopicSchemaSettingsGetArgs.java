// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicSchemaSettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicSchemaSettingsGetArgs Empty = new TopicSchemaSettingsGetArgs();

    /**
     * The encoding of messages validated against schema.
     * Default value is `ENCODING_UNSPECIFIED`.
     * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return The encoding of messages validated against schema.
     * Default value is `ENCODING_UNSPECIFIED`.
     * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private TopicSchemaSettingsGetArgs() {}

    private TopicSchemaSettingsGetArgs(TopicSchemaSettingsGetArgs $) {
        this.encoding = $.encoding;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicSchemaSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicSchemaSettingsGetArgs $;

        public Builder() {
            $ = new TopicSchemaSettingsGetArgs();
        }

        public Builder(TopicSchemaSettingsGetArgs defaults) {
            $ = new TopicSchemaSettingsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encoding The encoding of messages validated against schema.
         * Default value is `ENCODING_UNSPECIFIED`.
         * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding The encoding of messages validated against schema.
         * Default value is `ENCODING_UNSPECIFIED`.
         * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param schema The name of the schema that messages published should be
         * validated against. Format is projects/{project}/schemas/{schema}.
         * The value of this field will be _deleted-schema_
         * if the schema has been deleted.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The name of the schema that messages published should be
         * validated against. Format is projects/{project}/schemas/{schema}.
         * The value of this field will be _deleted-schema_
         * if the schema has been deleted.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public TopicSchemaSettingsGetArgs build() {
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}
