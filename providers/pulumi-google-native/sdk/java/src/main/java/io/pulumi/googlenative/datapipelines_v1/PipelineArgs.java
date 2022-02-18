// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datapipelines_v1.enums.PipelineState;
import io.pulumi.googlenative.datapipelines_v1.enums.PipelineType;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1ScheduleSpecArgs;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1WorkloadArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * The display name of the pipeline. It can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), and underscores (_).
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), and periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects). * `LOCATION_ID` is the canonical ID for the pipeline's location. The list of available locations can be obtained by calling `google.cloud.location.Locations.ListLocations`. Note that the Data Pipelines service is not available in all regions. It depends on Cloud Scheduler, an App Engine application, so it's only available in [App Engine regions](https://cloud.google.com/about/locations#region). * `PIPELINE_ID` is the ID of the pipeline. Must be unique for the selected project and location.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Immutable. The sources of the pipeline (for example, Dataplex). The keys and values are set by the corresponding sources during pipeline creation.
     * 
     */
    @InputImport(name="pipelineSources")
    private final @Nullable Input<Map<String,String>> pipelineSources;

    public Input<Map<String,String>> getPipelineSources() {
        return this.pipelineSources == null ? Input.empty() : this.pipelineSources;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
     * 
     */
    @InputImport(name="scheduleInfo")
    private final @Nullable Input<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo;

    public Input<GoogleCloudDatapipelinesV1ScheduleSpecArgs> getScheduleInfo() {
        return this.scheduleInfo == null ? Input.empty() : this.scheduleInfo;
    }

    /**
     * Optional. A service account email to be used with the Cloud Scheduler job. If not specified, the default compute engine service account will be used.
     * 
     */
    @InputImport(name="schedulerServiceAccountEmail")
    private final @Nullable Input<String> schedulerServiceAccountEmail;

    public Input<String> getSchedulerServiceAccountEmail() {
        return this.schedulerServiceAccountEmail == null ? Input.empty() : this.schedulerServiceAccountEmail;
    }

    /**
     * The state of the pipeline. When the pipeline is created, the state is set to 'PIPELINE_STATE_ACTIVE' by default. State changes can be requested by setting the state to stopping, paused, or resuming. State cannot be changed through UpdatePipeline requests.
     * 
     */
    @InputImport(name="state", required=true)
    private final Input<PipelineState> state;

    public Input<PipelineState> getState() {
        return this.state;
    }

    /**
     * The type of the pipeline. This field affects the scheduling of the pipeline and the type of metrics to show for the pipeline.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<PipelineType> type;

    public Input<PipelineType> getType() {
        return this.type;
    }

    /**
     * Workload information for creating new jobs.
     * 
     */
    @InputImport(name="workload")
    private final @Nullable Input<GoogleCloudDatapipelinesV1WorkloadArgs> workload;

    public Input<GoogleCloudDatapipelinesV1WorkloadArgs> getWorkload() {
        return this.workload == null ? Input.empty() : this.workload;
    }

    public PipelineArgs(
        Input<String> displayName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> pipelineSources,
        @Nullable Input<String> project,
        @Nullable Input<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo,
        @Nullable Input<String> schedulerServiceAccountEmail,
        Input<PipelineState> state,
        Input<PipelineType> type,
        @Nullable Input<GoogleCloudDatapipelinesV1WorkloadArgs> workload) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.location = location;
        this.name = name;
        this.pipelineSources = pipelineSources;
        this.project = project;
        this.scheduleInfo = scheduleInfo;
        this.schedulerServiceAccountEmail = schedulerServiceAccountEmail;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.workload = workload;
    }

    private PipelineArgs() {
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.pipelineSources = Input.empty();
        this.project = Input.empty();
        this.scheduleInfo = Input.empty();
        this.schedulerServiceAccountEmail = Input.empty();
        this.state = Input.empty();
        this.type = Input.empty();
        this.workload = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> pipelineSources;
        private @Nullable Input<String> project;
        private @Nullable Input<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo;
        private @Nullable Input<String> schedulerServiceAccountEmail;
        private Input<PipelineState> state;
        private Input<PipelineType> type;
        private @Nullable Input<GoogleCloudDatapipelinesV1WorkloadArgs> workload;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pipelineSources = defaults.pipelineSources;
    	      this.project = defaults.project;
    	      this.scheduleInfo = defaults.scheduleInfo;
    	      this.schedulerServiceAccountEmail = defaults.schedulerServiceAccountEmail;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.workload = defaults.workload;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPipelineSources(@Nullable Input<Map<String,String>> pipelineSources) {
            this.pipelineSources = pipelineSources;
            return this;
        }

        public Builder setPipelineSources(@Nullable Map<String,String> pipelineSources) {
            this.pipelineSources = Input.ofNullable(pipelineSources);
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

        public Builder setScheduleInfo(@Nullable Input<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        public Builder setScheduleInfo(@Nullable GoogleCloudDatapipelinesV1ScheduleSpecArgs scheduleInfo) {
            this.scheduleInfo = Input.ofNullable(scheduleInfo);
            return this;
        }

        public Builder setSchedulerServiceAccountEmail(@Nullable Input<String> schedulerServiceAccountEmail) {
            this.schedulerServiceAccountEmail = schedulerServiceAccountEmail;
            return this;
        }

        public Builder setSchedulerServiceAccountEmail(@Nullable String schedulerServiceAccountEmail) {
            this.schedulerServiceAccountEmail = Input.ofNullable(schedulerServiceAccountEmail);
            return this;
        }

        public Builder setState(Input<PipelineState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(PipelineState state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder setType(Input<PipelineType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(PipelineType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setWorkload(@Nullable Input<GoogleCloudDatapipelinesV1WorkloadArgs> workload) {
            this.workload = workload;
            return this;
        }

        public Builder setWorkload(@Nullable GoogleCloudDatapipelinesV1WorkloadArgs workload) {
            this.workload = Input.ofNullable(workload);
            return this;
        }

        public PipelineArgs build() {
            return new PipelineArgs(displayName, location, name, pipelineSources, project, scheduleInfo, schedulerServiceAccountEmail, state, type, workload);
        }
    }
}
