// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final VariableArgs Empty = new VariableArgs();

    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     * 
     */
    @InputImport(name="parent", required=true)
      private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Input<String> text;

    public Input<String> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public VariableArgs(
        @Nullable Input<String> name,
        Input<String> parent,
        @Nullable Input<String> project,
        @Nullable Input<String> text,
        @Nullable Input<String> value) {
        this.name = name;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.project = project;
        this.text = text;
        this.value = value;
    }

    private VariableArgs() {
        this.name = Input.empty();
        this.parent = Input.empty();
        this.project = Input.empty();
        this.text = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> parent;
        private @Nullable Input<String> project;
        private @Nullable Input<String> text;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(VariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.project = defaults.project;
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder parent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder text(@Nullable Input<String> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable String text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public VariableArgs build() {
            return new VariableArgs(name, parent, project, text, value);
        }
    }
}
