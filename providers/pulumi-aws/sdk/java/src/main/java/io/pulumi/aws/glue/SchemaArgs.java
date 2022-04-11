// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    /**
     * The compatibility mode of the schema. Values values are: `NONE`, `DISABLED`, `BACKWARD`, `BACKWARD_ALL`, `FORWARD`, `FORWARD_ALL`, `FULL`, and `FULL_ALL`.
     * 
     */
    @Import(name="compatibility", required=true)
      private final Output<String> compatibility;

    public Output<String> getCompatibility() {
        return this.compatibility;
    }

    /**
     * The data format of the schema definition. Valid values are `AVRO` and `JSON`.
     * 
     */
    @Import(name="dataFormat", required=true)
      private final Output<String> dataFormat;

    public Output<String> getDataFormat() {
        return this.dataFormat;
    }

    /**
     * A description of the schema.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The ARN of the Glue Registry to create the schema in.
     * 
     */
    @Import(name="registryArn")
      private final @Nullable Output<String> registryArn;

    public Output<String> getRegistryArn() {
        return this.registryArn == null ? Codegen.empty() : this.registryArn;
    }

    /**
     * The schema definition using the `data_format` setting for `schema_name`.
     * 
     */
    @Import(name="schemaDefinition", required=true)
      private final Output<String> schemaDefinition;

    public Output<String> getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * The Name of the schema.
     * 
     */
    @Import(name="schemaName", required=true)
      private final Output<String> schemaName;

    public Output<String> getSchemaName() {
        return this.schemaName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SchemaArgs(
        Output<String> compatibility,
        Output<String> dataFormat,
        @Nullable Output<String> description,
        @Nullable Output<String> registryArn,
        Output<String> schemaDefinition,
        Output<String> schemaName,
        @Nullable Output<Map<String,String>> tags) {
        this.compatibility = Objects.requireNonNull(compatibility, "expected parameter 'compatibility' to be non-null");
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.description = description;
        this.registryArn = registryArn;
        this.schemaDefinition = Objects.requireNonNull(schemaDefinition, "expected parameter 'schemaDefinition' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.tags = tags;
    }

    private SchemaArgs() {
        this.compatibility = Codegen.empty();
        this.dataFormat = Codegen.empty();
        this.description = Codegen.empty();
        this.registryArn = Codegen.empty();
        this.schemaDefinition = Codegen.empty();
        this.schemaName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> compatibility;
        private Output<String> dataFormat;
        private @Nullable Output<String> description;
        private @Nullable Output<String> registryArn;
        private Output<String> schemaDefinition;
        private Output<String> schemaName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibility = defaults.compatibility;
    	      this.dataFormat = defaults.dataFormat;
    	      this.description = defaults.description;
    	      this.registryArn = defaults.registryArn;
    	      this.schemaDefinition = defaults.schemaDefinition;
    	      this.schemaName = defaults.schemaName;
    	      this.tags = defaults.tags;
        }

        public Builder compatibility(Output<String> compatibility) {
            this.compatibility = Objects.requireNonNull(compatibility);
            return this;
        }
        public Builder compatibility(String compatibility) {
            this.compatibility = Output.of(Objects.requireNonNull(compatibility));
            return this;
        }
        public Builder dataFormat(Output<String> dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }
        public Builder dataFormat(String dataFormat) {
            this.dataFormat = Output.of(Objects.requireNonNull(dataFormat));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder registryArn(@Nullable Output<String> registryArn) {
            this.registryArn = registryArn;
            return this;
        }
        public Builder registryArn(@Nullable String registryArn) {
            this.registryArn = Codegen.ofNullable(registryArn);
            return this;
        }
        public Builder schemaDefinition(Output<String> schemaDefinition) {
            this.schemaDefinition = Objects.requireNonNull(schemaDefinition);
            return this;
        }
        public Builder schemaDefinition(String schemaDefinition) {
            this.schemaDefinition = Output.of(Objects.requireNonNull(schemaDefinition));
            return this;
        }
        public Builder schemaName(Output<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Output.of(Objects.requireNonNull(schemaName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public SchemaArgs build() {
            return new SchemaArgs(compatibility, dataFormat, description, registryArn, schemaDefinition, schemaName, tags);
        }
    }
}
