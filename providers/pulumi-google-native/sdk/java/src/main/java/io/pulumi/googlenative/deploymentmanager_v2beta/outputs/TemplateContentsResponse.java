// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.ImportFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TemplateContentsResponse {
    /**
     * Import files referenced by the main template.
     * 
     */
    private final List<ImportFileResponse> imports;
    /**
     * Which interpreter (python or jinja) should be used during expansion.
     * 
     */
    private final String interpreter;
    /**
     * The filename of the mainTemplate
     * 
     */
    private final String mainTemplate;
    /**
     * The contents of the template schema.
     * 
     */
    private final String schema;
    /**
     * The contents of the main template file.
     * 
     */
    private final String template;

    @OutputCustomType.Constructor
    private TemplateContentsResponse(
        @OutputCustomType.Parameter("imports") List<ImportFileResponse> imports,
        @OutputCustomType.Parameter("interpreter") String interpreter,
        @OutputCustomType.Parameter("mainTemplate") String mainTemplate,
        @OutputCustomType.Parameter("schema") String schema,
        @OutputCustomType.Parameter("template") String template) {
        this.imports = imports;
        this.interpreter = interpreter;
        this.mainTemplate = mainTemplate;
        this.schema = schema;
        this.template = template;
    }

    /**
     * Import files referenced by the main template.
     * 
    */
    public List<ImportFileResponse> getImports() {
        return this.imports;
    }
    /**
     * Which interpreter (python or jinja) should be used during expansion.
     * 
    */
    public String getInterpreter() {
        return this.interpreter;
    }
    /**
     * The filename of the mainTemplate
     * 
    */
    public String getMainTemplate() {
        return this.mainTemplate;
    }
    /**
     * The contents of the template schema.
     * 
    */
    public String getSchema() {
        return this.schema;
    }
    /**
     * The contents of the main template file.
     * 
    */
    public String getTemplate() {
        return this.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateContentsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ImportFileResponse> imports;
        private String interpreter;
        private String mainTemplate;
        private String schema;
        private String template;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateContentsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imports = defaults.imports;
    	      this.interpreter = defaults.interpreter;
    	      this.mainTemplate = defaults.mainTemplate;
    	      this.schema = defaults.schema;
    	      this.template = defaults.template;
        }

        public Builder imports(List<ImportFileResponse> imports) {
            this.imports = Objects.requireNonNull(imports);
            return this;
        }

        public Builder interpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder mainTemplate(String mainTemplate) {
            this.mainTemplate = Objects.requireNonNull(mainTemplate);
            return this;
        }

        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder template(String template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public TemplateContentsResponse build() {
            return new TemplateContentsResponse(imports, interpreter, mainTemplate, schema, template);
        }
    }
}
