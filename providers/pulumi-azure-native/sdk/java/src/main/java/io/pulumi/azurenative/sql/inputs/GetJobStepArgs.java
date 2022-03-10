// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetJobStepArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobStepArgs Empty = new GetJobStepArgs();

    /**
     * The name of the job agent.
     * 
     */
    @InputImport(name="jobAgentName", required=true)
      private final String jobAgentName;

    public String getJobAgentName() {
        return this.jobAgentName;
    }

    /**
     * The name of the job.
     * 
     */
    @InputImport(name="jobName", required=true)
      private final String jobName;

    public String getJobName() {
        return this.jobName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * The name of the job step.
     * 
     */
    @InputImport(name="stepName", required=true)
      private final String stepName;

    public String getStepName() {
        return this.stepName;
    }

    public GetJobStepArgs(
        String jobAgentName,
        String jobName,
        String resourceGroupName,
        String serverName,
        String stepName) {
        this.jobAgentName = Objects.requireNonNull(jobAgentName, "expected parameter 'jobAgentName' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.stepName = Objects.requireNonNull(stepName, "expected parameter 'stepName' to be non-null");
    }

    private GetJobStepArgs() {
        this.jobAgentName = null;
        this.jobName = null;
        this.resourceGroupName = null;
        this.serverName = null;
        this.stepName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobAgentName;
        private String jobName;
        private String resourceGroupName;
        private String serverName;
        private String stepName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.stepName = defaults.stepName;
        }

        public Builder jobAgentName(String jobAgentName) {
            this.jobAgentName = Objects.requireNonNull(jobAgentName);
            return this;
        }

        public Builder jobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder stepName(String stepName) {
            this.stepName = Objects.requireNonNull(stepName);
            return this;
        }
        public GetJobStepArgs build() {
            return new GetJobStepArgs(jobAgentName, jobName, resourceGroupName, serverName, stepName);
        }
    }
}
