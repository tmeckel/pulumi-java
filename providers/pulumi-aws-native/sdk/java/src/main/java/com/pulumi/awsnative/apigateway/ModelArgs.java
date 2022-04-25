// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * The content type for the model.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content type for the model.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * A description that identifies this model.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description that identifies this model.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A name for the model. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the model name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the model. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the model name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of a REST API with which to associate this model.
     * 
     */
    @Import(name="restApiId", required=true)
    private Output<String> restApiId;

    /**
     * @return The ID of a REST API with which to associate this model.
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     * The schema to use to transform data to one or more output formats. Specify null ({}) if you don&#39;t want to specify a schema.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<Object> schema;

    /**
     * @return The schema to use to transform data to one or more output formats. Specify null ({}) if you don&#39;t want to specify a schema.
     * 
     */
    public Optional<Output<Object>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private ModelArgs() {}

    private ModelArgs(ModelArgs $) {
        this.contentType = $.contentType;
        this.description = $.description;
        this.name = $.name;
        this.restApiId = $.restApiId;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelArgs $;

        public Builder() {
            $ = new ModelArgs();
        }

        public Builder(ModelArgs defaults) {
            $ = new ModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType The content type for the model.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type for the model.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param description A description that identifies this model.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description that identifies this model.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name A name for the model. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the model name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the model. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the model name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param restApiId The ID of a REST API with which to associate this model.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(Output<String> restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        /**
         * @param restApiId The ID of a REST API with which to associate this model.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            return restApiId(Output.of(restApiId));
        }

        /**
         * @param schema The schema to use to transform data to one or more output formats. Specify null ({}) if you don&#39;t want to specify a schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<Object> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema to use to transform data to one or more output formats. Specify null ({}) if you don&#39;t want to specify a schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(Object schema) {
            return schema(Output.of(schema));
        }

        public ModelArgs build() {
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            return $;
        }
    }

}
