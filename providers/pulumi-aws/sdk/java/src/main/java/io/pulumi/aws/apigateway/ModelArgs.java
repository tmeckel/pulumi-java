// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * The content type of the model
     * 
     */
    @InputImport(name="contentType", required=true)
      private final Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType;
    }

    /**
     * The description of the model
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the model
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @InputImport(name="restApi", required=true)
      private final Input<String> restApi;

    public Input<String> getRestApi() {
        return this.restApi;
    }

    /**
     * The schema of the model in a JSON form
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    public ModelArgs(
        Input<String> contentType,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> restApi,
        @Nullable Input<String> schema) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.description = description;
        this.name = name;
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
        this.schema = schema;
    }

    private ModelArgs() {
        this.contentType = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.restApi = Input.empty();
        this.schema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> restApi;
        private @Nullable Input<String> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.restApi = defaults.restApi;
    	      this.schema = defaults.schema;
        }

        public Builder contentType(Input<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder restApi(Input<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }

        public Builder schema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder schema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }
        public ModelArgs build() {
            return new ModelArgs(contentType, description, name, restApi, schema);
        }
    }
}
