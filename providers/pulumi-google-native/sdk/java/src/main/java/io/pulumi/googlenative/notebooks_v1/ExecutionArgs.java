// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.notebooks_v1.inputs.ExecutionTemplateArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExecutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecutionArgs Empty = new ExecutionArgs();

    /**
     * A brief description of this execution.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="executionId", required=true)
      private final Output<String> executionId;

    public Output<String> getExecutionId() {
        return this.executionId;
    }

    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    @Import(name="executionTemplate")
      private final @Nullable Output<ExecutionTemplateArgs> executionTemplate;

    public Output<ExecutionTemplateArgs> getExecutionTemplate() {
        return this.executionTemplate == null ? Codegen.empty() : this.executionTemplate;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Output notebook file generated by this execution
     * 
     */
    @Import(name="outputNotebookFile")
      private final @Nullable Output<String> outputNotebookFile;

    public Output<String> getOutputNotebookFile() {
        return this.outputNotebookFile == null ? Codegen.empty() : this.outputNotebookFile;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public ExecutionArgs(
        @Nullable Output<String> description,
        Output<String> executionId,
        @Nullable Output<ExecutionTemplateArgs> executionTemplate,
        @Nullable Output<String> location,
        @Nullable Output<String> outputNotebookFile,
        @Nullable Output<String> project) {
        this.description = description;
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.executionTemplate = executionTemplate;
        this.location = location;
        this.outputNotebookFile = outputNotebookFile;
        this.project = project;
    }

    private ExecutionArgs() {
        this.description = Codegen.empty();
        this.executionId = Codegen.empty();
        this.executionTemplate = Codegen.empty();
        this.location = Codegen.empty();
        this.outputNotebookFile = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> executionId;
        private @Nullable Output<ExecutionTemplateArgs> executionTemplate;
        private @Nullable Output<String> location;
        private @Nullable Output<String> outputNotebookFile;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.executionId = defaults.executionId;
    	      this.executionTemplate = defaults.executionTemplate;
    	      this.location = defaults.location;
    	      this.outputNotebookFile = defaults.outputNotebookFile;
    	      this.project = defaults.project;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder executionId(Output<String> executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }
        public Builder executionId(String executionId) {
            this.executionId = Output.of(Objects.requireNonNull(executionId));
            return this;
        }
        public Builder executionTemplate(@Nullable Output<ExecutionTemplateArgs> executionTemplate) {
            this.executionTemplate = executionTemplate;
            return this;
        }
        public Builder executionTemplate(@Nullable ExecutionTemplateArgs executionTemplate) {
            this.executionTemplate = Codegen.ofNullable(executionTemplate);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder outputNotebookFile(@Nullable Output<String> outputNotebookFile) {
            this.outputNotebookFile = outputNotebookFile;
            return this;
        }
        public Builder outputNotebookFile(@Nullable String outputNotebookFile) {
            this.outputNotebookFile = Codegen.ofNullable(outputNotebookFile);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public ExecutionArgs build() {
            return new ExecutionArgs(description, executionId, executionTemplate, location, outputNotebookFile, project);
        }
    }
}
