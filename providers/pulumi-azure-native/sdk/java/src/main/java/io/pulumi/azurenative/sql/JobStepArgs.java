// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.JobStepActionArgs;
import io.pulumi.azurenative.sql.inputs.JobStepExecutionOptionsArgs;
import io.pulumi.azurenative.sql.inputs.JobStepOutputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStepArgs Empty = new JobStepArgs();

    /**
     * The action payload of the job step.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<JobStepActionArgs> action;

    public Input<JobStepActionArgs> getAction() {
        return this.action;
    }

    /**
     * The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    @InputImport(name="credential", required=true)
      private final Input<String> credential;

    public Input<String> getCredential() {
        return this.credential;
    }

    /**
     * Execution options for the job step.
     * 
     */
    @InputImport(name="executionOptions")
      private final @Nullable Input<JobStepExecutionOptionsArgs> executionOptions;

    public Input<JobStepExecutionOptionsArgs> getExecutionOptions() {
        return this.executionOptions == null ? Input.empty() : this.executionOptions;
    }

    /**
     * The name of the job agent.
     * 
     */
    @InputImport(name="jobAgentName", required=true)
      private final Input<String> jobAgentName;

    public Input<String> getJobAgentName() {
        return this.jobAgentName;
    }

    /**
     * The name of the job.
     * 
     */
    @InputImport(name="jobName", required=true)
      private final Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName;
    }

    /**
     * Output destination properties of the job step.
     * 
     */
    @InputImport(name="output")
      private final @Nullable Input<JobStepOutputArgs> output;

    public Input<JobStepOutputArgs> getOutput() {
        return this.output == null ? Input.empty() : this.output;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The job step's index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    @InputImport(name="stepId")
      private final @Nullable Input<Integer> stepId;

    public Input<Integer> getStepId() {
        return this.stepId == null ? Input.empty() : this.stepId;
    }

    /**
     * The name of the job step.
     * 
     */
    @InputImport(name="stepName")
      private final @Nullable Input<String> stepName;

    public Input<String> getStepName() {
        return this.stepName == null ? Input.empty() : this.stepName;
    }

    /**
     * The resource ID of the target group that the job step will be executed on.
     * 
     */
    @InputImport(name="targetGroup", required=true)
      private final Input<String> targetGroup;

    public Input<String> getTargetGroup() {
        return this.targetGroup;
    }

    public JobStepArgs(
        Input<JobStepActionArgs> action,
        Input<String> credential,
        @Nullable Input<JobStepExecutionOptionsArgs> executionOptions,
        Input<String> jobAgentName,
        Input<String> jobName,
        @Nullable Input<JobStepOutputArgs> output,
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<Integer> stepId,
        @Nullable Input<String> stepName,
        Input<String> targetGroup) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.credential = Objects.requireNonNull(credential, "expected parameter 'credential' to be non-null");
        this.executionOptions = executionOptions;
        this.jobAgentName = Objects.requireNonNull(jobAgentName, "expected parameter 'jobAgentName' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.output = output;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.stepId = stepId;
        this.stepName = stepName;
        this.targetGroup = Objects.requireNonNull(targetGroup, "expected parameter 'targetGroup' to be non-null");
    }

    private JobStepArgs() {
        this.action = Input.empty();
        this.credential = Input.empty();
        this.executionOptions = Input.empty();
        this.jobAgentName = Input.empty();
        this.jobName = Input.empty();
        this.output = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.stepId = Input.empty();
        this.stepName = Input.empty();
        this.targetGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<JobStepActionArgs> action;
        private Input<String> credential;
        private @Nullable Input<JobStepExecutionOptionsArgs> executionOptions;
        private Input<String> jobAgentName;
        private Input<String> jobName;
        private @Nullable Input<JobStepOutputArgs> output;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<Integer> stepId;
        private @Nullable Input<String> stepName;
        private Input<String> targetGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.credential = defaults.credential;
    	      this.executionOptions = defaults.executionOptions;
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.jobName = defaults.jobName;
    	      this.output = defaults.output;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.stepId = defaults.stepId;
    	      this.stepName = defaults.stepName;
    	      this.targetGroup = defaults.targetGroup;
        }

        public Builder action(Input<JobStepActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder action(JobStepActionArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder credential(Input<String> credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder credential(String credential) {
            this.credential = Input.of(Objects.requireNonNull(credential));
            return this;
        }

        public Builder executionOptions(@Nullable Input<JobStepExecutionOptionsArgs> executionOptions) {
            this.executionOptions = executionOptions;
            return this;
        }

        public Builder executionOptions(@Nullable JobStepExecutionOptionsArgs executionOptions) {
            this.executionOptions = Input.ofNullable(executionOptions);
            return this;
        }

        public Builder jobAgentName(Input<String> jobAgentName) {
            this.jobAgentName = Objects.requireNonNull(jobAgentName);
            return this;
        }

        public Builder jobAgentName(String jobAgentName) {
            this.jobAgentName = Input.of(Objects.requireNonNull(jobAgentName));
            return this;
        }

        public Builder jobName(Input<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder jobName(String jobName) {
            this.jobName = Input.of(Objects.requireNonNull(jobName));
            return this;
        }

        public Builder output(@Nullable Input<JobStepOutputArgs> output) {
            this.output = output;
            return this;
        }

        public Builder output(@Nullable JobStepOutputArgs output) {
            this.output = Input.ofNullable(output);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serverName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder stepId(@Nullable Input<Integer> stepId) {
            this.stepId = stepId;
            return this;
        }

        public Builder stepId(@Nullable Integer stepId) {
            this.stepId = Input.ofNullable(stepId);
            return this;
        }

        public Builder stepName(@Nullable Input<String> stepName) {
            this.stepName = stepName;
            return this;
        }

        public Builder stepName(@Nullable String stepName) {
            this.stepName = Input.ofNullable(stepName);
            return this;
        }

        public Builder targetGroup(Input<String> targetGroup) {
            this.targetGroup = Objects.requireNonNull(targetGroup);
            return this;
        }

        public Builder targetGroup(String targetGroup) {
            this.targetGroup = Input.of(Objects.requireNonNull(targetGroup));
            return this;
        }
        public JobStepArgs build() {
            return new JobStepArgs(action, credential, executionOptions, jobAgentName, jobName, output, resourceGroupName, serverName, stepId, stepName, targetGroup);
        }
    }
}
