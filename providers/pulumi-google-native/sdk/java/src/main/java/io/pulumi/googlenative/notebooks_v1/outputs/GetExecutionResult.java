// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.ExecutionTemplateResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetExecutionResult {
    /**
     * Time the Execution was instantiated.
     * 
     */
    private final String createTime;
    /**
     * A brief description of this execution.
     * 
     */
    private final String description;
    /**
     * Name used for UI purposes. Name can only contain alphanumeric characters and underscores '_'.
     * 
     */
    private final String displayName;
    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    private final ExecutionTemplateResponse executionTemplate;
    /**
     * The URI of the external job used to execute the notebook.
     * 
     */
    private final String jobUri;
    /**
     * The resource name of the execute. Format: `projects/{project_id}/locations/{location}/executions/{execution_id}`
     * 
     */
    private final String name;
    /**
     * Output notebook file generated by this execution
     * 
     */
    private final String outputNotebookFile;
    /**
     * State of the underlying AI Platform job.
     * 
     */
    private final String state;
    /**
     * Time the Execution was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetExecutionResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("executionTemplate") ExecutionTemplateResponse executionTemplate,
        @OutputCustomType.Parameter("jobUri") String jobUri,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("outputNotebookFile") String outputNotebookFile,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.executionTemplate = executionTemplate;
        this.jobUri = jobUri;
        this.name = name;
        this.outputNotebookFile = outputNotebookFile;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * Time the Execution was instantiated.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * A brief description of this execution.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Name used for UI purposes. Name can only contain alphanumeric characters and underscores '_'.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
    */
    public ExecutionTemplateResponse getExecutionTemplate() {
        return this.executionTemplate;
    }
    /**
     * The URI of the external job used to execute the notebook.
     * 
    */
    public String getJobUri() {
        return this.jobUri;
    }
    /**
     * The resource name of the execute. Format: `projects/{project_id}/locations/{location}/executions/{execution_id}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Output notebook file generated by this execution
     * 
    */
    public String getOutputNotebookFile() {
        return this.outputNotebookFile;
    }
    /**
     * State of the underlying AI Platform job.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Time the Execution was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExecutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private ExecutionTemplateResponse executionTemplate;
        private String jobUri;
        private String name;
        private String outputNotebookFile;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExecutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.executionTemplate = defaults.executionTemplate;
    	      this.jobUri = defaults.jobUri;
    	      this.name = defaults.name;
    	      this.outputNotebookFile = defaults.outputNotebookFile;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder executionTemplate(ExecutionTemplateResponse executionTemplate) {
            this.executionTemplate = Objects.requireNonNull(executionTemplate);
            return this;
        }

        public Builder jobUri(String jobUri) {
            this.jobUri = Objects.requireNonNull(jobUri);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder outputNotebookFile(String outputNotebookFile) {
            this.outputNotebookFile = Objects.requireNonNull(outputNotebookFile);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetExecutionResult build() {
            return new GetExecutionResult(createTime, description, displayName, executionTemplate, jobUri, name, outputNotebookFile, state, updateTime);
        }
    }
}
