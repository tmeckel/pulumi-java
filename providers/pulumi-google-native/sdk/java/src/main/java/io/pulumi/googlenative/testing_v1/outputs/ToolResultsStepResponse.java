// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ToolResultsStepResponse {
    /**
     * A tool results execution ID.
     * 
     */
    private final String executionId;
    /**
     * A tool results history ID.
     * 
     */
    private final String historyId;
    /**
     * The cloud project that owns the tool results step.
     * 
     */
    private final String project;
    /**
     * A tool results step ID.
     * 
     */
    private final String stepId;

    @OutputCustomType.Constructor({"executionId","historyId","project","stepId"})
    private ToolResultsStepResponse(
        String executionId,
        String historyId,
        String project,
        String stepId) {
        this.executionId = Objects.requireNonNull(executionId);
        this.historyId = Objects.requireNonNull(historyId);
        this.project = Objects.requireNonNull(project);
        this.stepId = Objects.requireNonNull(stepId);
    }

    /**
     * A tool results execution ID.
     * 
     */
    public String getExecutionId() {
        return this.executionId;
    }
    /**
     * A tool results history ID.
     * 
     */
    public String getHistoryId() {
        return this.historyId;
    }
    /**
     * The cloud project that owns the tool results step.
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * A tool results step ID.
     * 
     */
    public String getStepId() {
        return this.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolResultsStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionId;
        private String historyId;
        private String project;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolResultsStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionId = defaults.executionId;
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
    	      this.stepId = defaults.stepId;
        }

        public Builder setExecutionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }

        public Builder setHistoryId(String historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public ToolResultsStepResponse build() {
            return new ToolResultsStepResponse(executionId, historyId, project, stepId);
        }
    }
}
