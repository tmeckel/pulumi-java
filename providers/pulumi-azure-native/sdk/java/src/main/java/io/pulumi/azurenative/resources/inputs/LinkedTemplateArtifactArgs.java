// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Template Spec artifact containing an embedded Azure Resource Manager template for use as a linked template.
 * 
 */
public final class LinkedTemplateArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedTemplateArtifactArgs Empty = new LinkedTemplateArtifactArgs();

    /**
     * A filesystem safe relative path of the artifact.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    /**
     * The Azure Resource Manager template.
     * 
     */
    @Import(name="template", required=true)
      private final Output<Object> template;

    public Output<Object> getTemplate() {
        return this.template;
    }

    public LinkedTemplateArtifactArgs(
        Output<String> path,
        Output<Object> template) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private LinkedTemplateArtifactArgs() {
        this.path = Codegen.empty();
        this.template = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedTemplateArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> path;
        private Output<Object> template;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedTemplateArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.template = defaults.template;
        }

        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder template(Output<Object> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder template(Object template) {
            this.template = Output.of(Objects.requireNonNull(template));
            return this;
        }        public LinkedTemplateArtifactArgs build() {
            return new LinkedTemplateArtifactArgs(path, template);
        }
    }
}
