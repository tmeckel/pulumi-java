// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.speech_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.speech_v1.inputs.ClassItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomClassArgs Empty = new CustomClassArgs();

    /**
     * The ID to use for the custom class, which will become the final component of the custom class' resource name. This value should be 4-63 characters, and valid characters are /a-z-/.
     * 
     */
    @Import(name="customClassId", required=true)
      private final Output<String> customClassId;

    public Output<String> getCustomClassId() {
        return this.customClassId;
    }

    /**
     * A collection of class items.
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<ClassItemArgs>> items;

    public Output<List<ClassItemArgs>> getItems() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name of the custom class.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public CustomClassArgs(
        Output<String> customClassId,
        @Nullable Output<List<ClassItemArgs>> items,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.customClassId = Objects.requireNonNull(customClassId, "expected parameter 'customClassId' to be non-null");
        this.items = items;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private CustomClassArgs() {
        this.customClassId = Codegen.empty();
        this.items = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> customClassId;
        private @Nullable Output<List<ClassItemArgs>> items;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customClassId = defaults.customClassId;
    	      this.items = defaults.items;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder customClassId(Output<String> customClassId) {
            this.customClassId = Objects.requireNonNull(customClassId);
            return this;
        }
        public Builder customClassId(String customClassId) {
            this.customClassId = Output.of(Objects.requireNonNull(customClassId));
            return this;
        }
        public Builder items(@Nullable Output<List<ClassItemArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<ClassItemArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(ClassItemArgs... items) {
            return items(List.of(items));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        }        public CustomClassArgs build() {
            return new CustomClassArgs(customClassId, items, location, name, project);
        }
    }
}
