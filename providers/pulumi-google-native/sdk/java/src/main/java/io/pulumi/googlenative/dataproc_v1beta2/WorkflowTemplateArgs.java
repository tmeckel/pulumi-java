// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.OrderedJobArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.TemplateParameterArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.WorkflowTemplatePlacementArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateArgs Empty = new WorkflowTemplateArgs();

    /**
     * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see JSON representation of duration (https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10 minutes ("600s") to 24 hours ("86400s"). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a managed cluster, the cluster is deleted.
     * 
     */
    @InputImport(name="dagTimeout")
      private final @Nullable Input<String> dagTimeout;

    public Input<String> getDagTimeout() {
        return this.dagTimeout == null ? Input.empty() : this.dagTimeout;
    }

    /**
     * The template id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters..
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @InputImport(name="jobs", required=true)
      private final Input<List<OrderedJobArgs>> jobs;

    public Input<List<OrderedJobArgs>> getJobs() {
        return this.jobs;
    }

    /**
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a template.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<TemplateParameterArgs>> parameters;

    public Input<List<TemplateParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * WorkflowTemplate scheduling information.
     * 
     */
    @InputImport(name="placement", required=true)
      private final Input<WorkflowTemplatePlacementArgs> placement;

    public Input<WorkflowTemplatePlacementArgs> getPlacement() {
        return this.placement;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must match the current server version. A typical update template flow would fetch the current template with a GetWorkflowTemplate request, which will return the current template with the version field filled in with the current server version. The user updates other fields in the template, then returns it as part of the UpdateWorkflowTemplate request.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public WorkflowTemplateArgs(
        @Nullable Input<String> dagTimeout,
        Input<String> id,
        Input<List<OrderedJobArgs>> jobs,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<List<TemplateParameterArgs>> parameters,
        Input<WorkflowTemplatePlacementArgs> placement,
        @Nullable Input<String> project,
        @Nullable Input<Integer> version) {
        this.dagTimeout = dagTimeout;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.jobs = Objects.requireNonNull(jobs, "expected parameter 'jobs' to be non-null");
        this.labels = labels;
        this.location = location;
        this.parameters = parameters;
        this.placement = Objects.requireNonNull(placement, "expected parameter 'placement' to be non-null");
        this.project = project;
        this.version = version;
    }

    private WorkflowTemplateArgs() {
        this.dagTimeout = Input.empty();
        this.id = Input.empty();
        this.jobs = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.parameters = Input.empty();
        this.placement = Input.empty();
        this.project = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dagTimeout;
        private Input<String> id;
        private Input<List<OrderedJobArgs>> jobs;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<List<TemplateParameterArgs>> parameters;
        private Input<WorkflowTemplatePlacementArgs> placement;
        private @Nullable Input<String> project;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagTimeout = defaults.dagTimeout;
    	      this.id = defaults.id;
    	      this.jobs = defaults.jobs;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.parameters = defaults.parameters;
    	      this.placement = defaults.placement;
    	      this.project = defaults.project;
    	      this.version = defaults.version;
        }

        public Builder dagTimeout(@Nullable Input<String> dagTimeout) {
            this.dagTimeout = dagTimeout;
            return this;
        }

        public Builder dagTimeout(@Nullable String dagTimeout) {
            this.dagTimeout = Input.ofNullable(dagTimeout);
            return this;
        }

        public Builder id(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder jobs(Input<List<OrderedJobArgs>> jobs) {
            this.jobs = Objects.requireNonNull(jobs);
            return this;
        }

        public Builder jobs(List<OrderedJobArgs> jobs) {
            this.jobs = Input.of(Objects.requireNonNull(jobs));
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder parameters(@Nullable Input<List<TemplateParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<TemplateParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder placement(Input<WorkflowTemplatePlacementArgs> placement) {
            this.placement = Objects.requireNonNull(placement);
            return this;
        }

        public Builder placement(WorkflowTemplatePlacementArgs placement) {
            this.placement = Input.of(Objects.requireNonNull(placement));
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

        public Builder version(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public WorkflowTemplateArgs build() {
            return new WorkflowTemplateArgs(dagTimeout, id, jobs, labels, location, parameters, placement, project, version);
        }
    }
}
