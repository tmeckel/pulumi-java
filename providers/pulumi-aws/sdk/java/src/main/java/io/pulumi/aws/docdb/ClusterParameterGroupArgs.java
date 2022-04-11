// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterParameterGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterParameterGroupArgs Empty = new ClusterParameterGroupArgs();

    /**
     * The description of the documentDB cluster parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The family of the documentDB cluster parameter group.
     * 
     */
    @Import(name="family", required=true)
      private final Output<String> family;

    public Output<String> getFamily() {
        return this.family;
    }

    /**
     * The name of the documentDB parameter.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * A list of documentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<ClusterParameterGroupParameterArgs>> parameters;

    public Output<List<ClusterParameterGroupParameterArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ClusterParameterGroupArgs(
        @Nullable Output<String> description,
        Output<String> family,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<List<ClusterParameterGroupParameterArgs>> parameters,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = name;
        this.namePrefix = namePrefix;
        this.parameters = parameters;
        this.tags = tags;
    }

    private ClusterParameterGroupArgs() {
        this.description = Codegen.empty();
        this.family = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.parameters = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterParameterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> family;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<List<ClusterParameterGroupParameterArgs>> parameters;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterParameterGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.parameters = defaults.parameters;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder family(Output<String> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder family(String family) {
            this.family = Output.of(Objects.requireNonNull(family));
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
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder parameters(@Nullable Output<List<ClusterParameterGroupParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<ClusterParameterGroupParameterArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(ClusterParameterGroupParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ClusterParameterGroupArgs build() {
            return new ClusterParameterGroupArgs(description, family, name, namePrefix, parameters, tags);
        }
    }
}
