// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataflow_v1b3.JobArgs;
import io.pulumi.googlenative.dataflow_v1b3.outputs.EnvironmentResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.ExecutionStageStateResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.JobMetadataResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.PipelineDescriptionResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.StepResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Cloud Dataflow job. To create a job, we recommend using `projects.locations.jobs.create` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.create` is not recommended, as your job will always start in `us-central1`.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dataflow/v1b3:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * The client's unique identifier of the job, re-used across retried attempts. If this field is set, the service will ensure its uniqueness. The request to create a job will fail if the service has knowledge of a previously submitted job with the same client's ID and job name. The caller may use this field to ensure idempotence of job creation across retried attempts to create a job. By default, the field is empty and, in that case, the service ignores it.
     * 
     */
    @Export(name="clientRequestId", type=String.class, parameters={})
    private Output<String> clientRequestId;

    /**
     * @return The client's unique identifier of the job, re-used across retried attempts. If this field is set, the service will ensure its uniqueness. The request to create a job will fail if the service has knowledge of a previously submitted job with the same client's ID and job name. The caller may use this field to ensure idempotence of job creation across retried attempts to create a job. By default, the field is empty and, in that case, the service ignores it.
     * 
     */
    public Output<String> getClientRequestId() {
        return this.clientRequestId;
    }
    /**
     * The timestamp when the job was initially created. Immutable and set by the Cloud Dataflow service.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the job was initially created. Immutable and set by the Cloud Dataflow service.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * If this is specified, the job's initial state is populated from the given snapshot.
     * 
     */
    @Export(name="createdFromSnapshotId", type=String.class, parameters={})
    private Output<String> createdFromSnapshotId;

    /**
     * @return If this is specified, the job's initial state is populated from the given snapshot.
     * 
     */
    public Output<String> getCreatedFromSnapshotId() {
        return this.createdFromSnapshotId;
    }
    /**
     * The current state of the job. Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise specified. A job in the `JOB_STATE_RUNNING` state may asynchronously enter a terminal state. After a job has reached a terminal state, no further state updates may be made. This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
     * 
     */
    @Export(name="currentState", type=String.class, parameters={})
    private Output<String> currentState;

    /**
     * @return The current state of the job. Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise specified. A job in the `JOB_STATE_RUNNING` state may asynchronously enter a terminal state. After a job has reached a terminal state, no further state updates may be made. This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
     * 
     */
    public Output<String> getCurrentState() {
        return this.currentState;
    }
    /**
     * The timestamp associated with the current state.
     * 
     */
    @Export(name="currentStateTime", type=String.class, parameters={})
    private Output<String> currentStateTime;

    /**
     * @return The timestamp associated with the current state.
     * 
     */
    public Output<String> getCurrentStateTime() {
        return this.currentStateTime;
    }
    /**
     * The environment for the job.
     * 
     */
    @Export(name="environment", type=EnvironmentResponse.class, parameters={})
    private Output<EnvironmentResponse> environment;

    /**
     * @return The environment for the job.
     * 
     */
    public Output<EnvironmentResponse> getEnvironment() {
        return this.environment;
    }
    /**
     * This field is populated by the Dataflow service to support filtering jobs by the metadata values provided here. Populated for ListJobs and all GetJob views SUMMARY and higher.
     * 
     */
    @Export(name="jobMetadata", type=JobMetadataResponse.class, parameters={})
    private Output<JobMetadataResponse> jobMetadata;

    /**
     * @return This field is populated by the Dataflow service to support filtering jobs by the metadata values provided here. Populated for ListJobs and all GetJob views SUMMARY and higher.
     * 
     */
    public Output<JobMetadataResponse> getJobMetadata() {
        return this.jobMetadata;
    }
    /**
     * User-defined labels for this job. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128 bytes in size.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for this job. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128 bytes in size.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The user-specified Cloud Dataflow job name. Only one Job with a given name may exist in a project at any given time. If a caller attempts to create a Job with the same name as an already-existing Job, the attempt returns the existing Job. The name must match the regular expression `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The user-specified Cloud Dataflow job name. Only one Job with a given name may exist in a project at any given time. If a caller attempts to create a Job with the same name as an already-existing Job, the attempt returns the existing Job. The name must match the regular expression `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Preliminary field: The format of this data may change at any time. A description of the user pipeline and stages through which it is executed. Created by Cloud Dataflow service. Only retrieved with JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
     * 
     */
    @Export(name="pipelineDescription", type=PipelineDescriptionResponse.class, parameters={})
    private Output<PipelineDescriptionResponse> pipelineDescription;

    /**
     * @return Preliminary field: The format of this data may change at any time. A description of the user pipeline and stages through which it is executed. Created by Cloud Dataflow service. Only retrieved with JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
     * 
     */
    public Output<PipelineDescriptionResponse> getPipelineDescription() {
        return this.pipelineDescription;
    }
    /**
     * The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * If this job is an update of an existing job, this field is the job ID of the job it replaced. When sending a `CreateJobRequest`, you can update a job by specifying it here. The job named here is stopped, and its intermediate state is transferred to this job.
     * 
     */
    @Export(name="replaceJobId", type=String.class, parameters={})
    private Output<String> replaceJobId;

    /**
     * @return If this job is an update of an existing job, this field is the job ID of the job it replaced. When sending a `CreateJobRequest`, you can update a job by specifying it here. The job named here is stopped, and its intermediate state is transferred to this job.
     * 
     */
    public Output<String> getReplaceJobId() {
        return this.replaceJobId;
    }
    /**
     * If another job is an update of this job (and thus, this job is in `JOB_STATE_UPDATED`), this field contains the ID of that job.
     * 
     */
    @Export(name="replacedByJobId", type=String.class, parameters={})
    private Output<String> replacedByJobId;

    /**
     * @return If another job is an update of this job (and thus, this job is in `JOB_STATE_UPDATED`), this field contains the ID of that job.
     * 
     */
    public Output<String> getReplacedByJobId() {
        return this.replacedByJobId;
    }
    /**
     * The job's requested state. `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING` states, by setting requested_state. `UpdateJob` may also be used to directly set a job's requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the job if it has not already reached a terminal state.
     * 
     */
    @Export(name="requestedState", type=String.class, parameters={})
    private Output<String> requestedState;

    /**
     * @return The job's requested state. `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING` states, by setting requested_state. `UpdateJob` may also be used to directly set a job's requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the job if it has not already reached a terminal state.
     * 
     */
    public Output<String> getRequestedState() {
        return this.requestedState;
    }
    /**
     * Reserved for future use. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
     * 
     */
    @Export(name="stageStates", type=List.class, parameters={ExecutionStageStateResponse.class})
    private Output<List<ExecutionStageStateResponse>> stageStates;

    /**
     * @return This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
     * 
     */
    public Output<List<ExecutionStageStateResponse>> getStageStates() {
        return this.stageStates;
    }
    /**
     * The timestamp when the job was started (transitioned to JOB_STATE_PENDING). Flexible resource scheduling jobs are started with some delay after job creation, so start_time is unset before start and is updated when the job is started by the Cloud Dataflow service. For other jobs, start_time always equals to create_time and is immutable and set by the Cloud Dataflow service.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The timestamp when the job was started (transitioned to JOB_STATE_PENDING). Flexible resource scheduling jobs are started with some delay after job creation, so start_time is unset before start and is updated when the job is started by the Cloud Dataflow service. For other jobs, start_time always equals to create_time and is immutable and set by the Cloud Dataflow service.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * Exactly one of step or steps_location should be specified. The top-level steps that constitute the entire job. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    @Export(name="steps", type=List.class, parameters={StepResponse.class})
    private Output<List<StepResponse>> steps;

    /**
     * @return Exactly one of step or steps_location should be specified. The top-level steps that constitute the entire job. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    public Output<List<StepResponse>> getSteps() {
        return this.steps;
    }
    /**
     * The Cloud Storage location where the steps are stored.
     * 
     */
    @Export(name="stepsLocation", type=String.class, parameters={})
    private Output<String> stepsLocation;

    /**
     * @return The Cloud Storage location where the steps are stored.
     * 
     */
    public Output<String> getStepsLocation() {
        return this.stepsLocation;
    }
    /**
     * A set of files the system should be aware of that are used for temporary storage. These temporary files will be removed on job completion. No duplicates are allowed. No file patterns are supported. The supported files are: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    @Export(name="tempFiles", type=List.class, parameters={String.class})
    private Output<List<String>> tempFiles;

    /**
     * @return A set of files the system should be aware of that are used for temporary storage. These temporary files will be removed on job completion. No duplicates are allowed. No file patterns are supported. The supported files are: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    public Output<List<String>> getTempFiles() {
        return this.tempFiles;
    }
    /**
     * The map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job.
     * 
     */
    @Export(name="transformNameMapping", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> transformNameMapping;

    /**
     * @return The map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job.
     * 
     */
    public Output<Map<String,String>> getTransformNameMapping() {
        return this.transformNameMapping;
    }
    /**
     * The type of Cloud Dataflow job.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Cloud Dataflow job.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, @Nullable JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, @Nullable JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataflow/v1b3:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataflow/v1b3:Job", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
