// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.enums.TemplateContentsInterpreter;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.ImportFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Files that make up the template contents of a template type.
 * 
 */
public final class TemplateContentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateContentsArgs Empty = new TemplateContentsArgs();

    /**
     * Import files referenced by the main template.
     * 
     */
    @InputImport(name="imports")
      private final @Nullable Input<List<ImportFileArgs>> imports;

    public Input<List<ImportFileArgs>> getImports() {
        return this.imports == null ? Input.empty() : this.imports;
    }

    /**
     * Which interpreter (python or jinja) should be used during expansion.
     * 
     */
    @InputImport(name="interpreter")
      private final @Nullable Input<TemplateContentsInterpreter> interpreter;

    public Input<TemplateContentsInterpreter> getInterpreter() {
        return this.interpreter == null ? Input.empty() : this.interpreter;
    }

    /**
     * The filename of the mainTemplate
     * 
     */
    @InputImport(name="mainTemplate")
      private final @Nullable Input<String> mainTemplate;

    public Input<String> getMainTemplate() {
        return this.mainTemplate == null ? Input.empty() : this.mainTemplate;
    }

    /**
     * The contents of the template schema.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * The contents of the main template file.
     * 
     */
    @InputImport(name="template")
      private final @Nullable Input<String> template;

    public Input<String> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    public TemplateContentsArgs(
        @Nullable Input<List<ImportFileArgs>> imports,
        @Nullable Input<TemplateContentsInterpreter> interpreter,
        @Nullable Input<String> mainTemplate,
        @Nullable Input<String> schema,
        @Nullable Input<String> template) {
        this.imports = imports;
        this.interpreter = interpreter;
        this.mainTemplate = mainTemplate;
        this.schema = schema;
        this.template = template;
    }

    private TemplateContentsArgs() {
        this.imports = Input.empty();
        this.interpreter = Input.empty();
        this.mainTemplate = Input.empty();
        this.schema = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateContentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ImportFileArgs>> imports;
        private @Nullable Input<TemplateContentsInterpreter> interpreter;
        private @Nullable Input<String> mainTemplate;
        private @Nullable Input<String> schema;
        private @Nullable Input<String> template;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateContentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imports = defaults.imports;
    	      this.interpreter = defaults.interpreter;
    	      this.mainTemplate = defaults.mainTemplate;
    	      this.schema = defaults.schema;
    	      this.template = defaults.template;
        }

        public Builder imports(@Nullable Input<List<ImportFileArgs>> imports) {
            this.imports = imports;
            return this;
        }

        public Builder imports(@Nullable List<ImportFileArgs> imports) {
            this.imports = Input.ofNullable(imports);
            return this;
        }

        public Builder interpreter(@Nullable Input<TemplateContentsInterpreter> interpreter) {
            this.interpreter = interpreter;
            return this;
        }

        public Builder interpreter(@Nullable TemplateContentsInterpreter interpreter) {
            this.interpreter = Input.ofNullable(interpreter);
            return this;
        }

        public Builder mainTemplate(@Nullable Input<String> mainTemplate) {
            this.mainTemplate = mainTemplate;
            return this;
        }

        public Builder mainTemplate(@Nullable String mainTemplate) {
            this.mainTemplate = Input.ofNullable(mainTemplate);
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

        public Builder template(@Nullable Input<String> template) {
            this.template = template;
            return this;
        }

        public Builder template(@Nullable String template) {
            this.template = Input.ofNullable(template);
            return this;
        }
        public TemplateContentsArgs build() {
            return new TemplateContentsArgs(imports, interpreter, mainTemplate, schema, template);
        }
    }
}
