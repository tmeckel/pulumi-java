// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="executionId", required=true)
    private final Input<String> executionId;

    public Input<String> getExecutionId() {
        return this.executionId;
    }

    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    @InputImport(name="executionTemplate")
    private final @Nullable Input<ExecutionTemplateArgs> executionTemplate;

    public Input<ExecutionTemplateArgs> getExecutionTemplate() {
        return this.executionTemplate == null ? Input.empty() : this.executionTemplate;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Output notebook file generated by this execution
     * 
     */
    @InputImport(name="outputNotebookFile")
    private final @Nullable Input<String> outputNotebookFile;

    public Input<String> getOutputNotebookFile() {
        return this.outputNotebookFile == null ? Input.empty() : this.outputNotebookFile;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ExecutionArgs(
        @Nullable Input<String> description,
        Input<String> executionId,
        @Nullable Input<ExecutionTemplateArgs> executionTemplate,
        @Nullable Input<String> location,
        @Nullable Input<String> outputNotebookFile,
        @Nullable Input<String> project) {
        this.description = description;
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.executionTemplate = executionTemplate;
        this.location = location;
        this.outputNotebookFile = outputNotebookFile;
        this.project = project;
    }

    private ExecutionArgs() {
        this.description = Input.empty();
        this.executionId = Input.empty();
        this.executionTemplate = Input.empty();
        this.location = Input.empty();
        this.outputNotebookFile = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> executionId;
        private @Nullable Input<ExecutionTemplateArgs> executionTemplate;
        private @Nullable Input<String> location;
        private @Nullable Input<String> outputNotebookFile;
        private @Nullable Input<String> project;

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

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExecutionId(Input<String> executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }

        public Builder setExecutionId(String executionId) {
            this.executionId = Input.of(Objects.requireNonNull(executionId));
            return this;
        }

        public Builder setExecutionTemplate(@Nullable Input<ExecutionTemplateArgs> executionTemplate) {
            this.executionTemplate = executionTemplate;
            return this;
        }

        public Builder setExecutionTemplate(@Nullable ExecutionTemplateArgs executionTemplate) {
            this.executionTemplate = Input.ofNullable(executionTemplate);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setOutputNotebookFile(@Nullable Input<String> outputNotebookFile) {
            this.outputNotebookFile = outputNotebookFile;
            return this;
        }

        public Builder setOutputNotebookFile(@Nullable String outputNotebookFile) {
            this.outputNotebookFile = Input.ofNullable(outputNotebookFile);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public ExecutionArgs build() {
            return new ExecutionArgs(description, executionId, executionTemplate, location, outputNotebookFile, project);
        }
    }
}
