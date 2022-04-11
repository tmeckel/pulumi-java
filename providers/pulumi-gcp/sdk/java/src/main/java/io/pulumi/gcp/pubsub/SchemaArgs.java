// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    /**
     * The definition of the schema.
     * This should contain a string representing the full definition of the schema
     * that is a valid schema definition of the type specified in type.
     * 
     */
    @Import(name="definition")
      private final @Nullable Output<String> definition;

    public Output<String> getDefinition() {
        return this.definition == null ? Codegen.empty() : this.definition;
    }

    /**
     * The ID to use for the schema, which will become the final component of the schema's resource name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The type of the schema definition
     * Default value is `TYPE_UNSPECIFIED`.
     * Possible values are `TYPE_UNSPECIFIED`, `PROTOCOL_BUFFER`, and `AVRO`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public SchemaArgs(
        @Nullable Output<String> definition,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> type) {
        this.definition = definition;
        this.name = name;
        this.project = project;
        this.type = type;
    }

    private SchemaArgs() {
        this.definition = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> definition;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder definition(@Nullable Output<String> definition) {
            this.definition = definition;
            return this;
        }
        public Builder definition(@Nullable String definition) {
            this.definition = Codegen.ofNullable(definition);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public SchemaArgs build() {
            return new SchemaArgs(definition, name, project, type);
        }
    }
}
