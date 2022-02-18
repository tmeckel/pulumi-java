// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datalabeling_v1beta1.EvaluationJobArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1AttemptResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an evaluation job.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datalabeling/v1beta1:EvaluationJob")
public class EvaluationJob extends io.pulumi.resources.CustomResource {
    /**
     * Name of the AnnotationSpecSet describing all the labels that your machine learning model outputs. You must create this resource before you create an evaluation job and provide its name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
     * 
     */
    @OutputExport(name="annotationSpecSet", type=String.class, parameters={})
    private Output<String> annotationSpecSet;

    /**
     * @return Name of the AnnotationSpecSet describing all the labels that your machine learning model outputs. You must create this resource before you create an evaluation job and provide its name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
     * 
     */
    public Output<String> getAnnotationSpecSet() {
        return this.annotationSpecSet;
    }
    /**
     * Every time the evaluation job runs and an error occurs, the failed attempt is appended to this array.
     * 
     */
    @OutputExport(name="attempts", type=List.class, parameters={GoogleCloudDatalabelingV1beta1AttemptResponse.class})
    private Output<List<GoogleCloudDatalabelingV1beta1AttemptResponse>> attempts;

    /**
     * @return Every time the evaluation job runs and an error occurs, the failed attempt is appended to this array.
     * 
     */
    public Output<List<GoogleCloudDatalabelingV1beta1AttemptResponse>> getAttempts() {
        return this.attempts;
    }
    /**
     * Timestamp of when this evaluation job was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Timestamp of when this evaluation job was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the job. The description can be up to 25,000 characters long.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the job. The description can be up to 25,000 characters long.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Configuration details for the evaluation job.
     * 
     */
    @OutputExport(name="evaluationJobConfig", type=GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse.class, parameters={})
    private Output<GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse> evaluationJobConfig;

    /**
     * @return Configuration details for the evaluation job.
     * 
     */
    public Output<GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse> getEvaluationJobConfig() {
        return this.evaluationJobConfig;
    }
    /**
     * Whether you want Data Labeling Service to provide ground truth labels for prediction input. If you want the service to assign human labelers to annotate your data, set this to `true`. If you want to provide your own ground truth labels in the evaluation job's BigQuery table, set this to `false`.
     * 
     */
    @OutputExport(name="labelMissingGroundTruth", type=Boolean.class, parameters={})
    private Output<Boolean> labelMissingGroundTruth;

    /**
     * @return Whether you want Data Labeling Service to provide ground truth labels for prediction input. If you want the service to assign human labelers to annotate your data, set this to `true`. If you want to provide your own ground truth labels in the evaluation job's BigQuery table, set this to `false`.
     * 
     */
    public Output<Boolean> getLabelMissingGroundTruth() {
        return this.labelMissingGroundTruth;
    }
    /**
     * The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction input and output is sampled from this model version. When creating an evaluation job, specify the model version in the following format: "projects/{project_id}/models/{model_name}/versions/{version_name}" There can only be one evaluation job per model version.
     * 
     */
    @OutputExport(name="modelVersion", type=String.class, parameters={})
    private Output<String> modelVersion;

    /**
     * @return The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction input and output is sampled from this model version. When creating an evaluation job, specify the model version in the following format: "projects/{project_id}/models/{model_name}/versions/{version_name}" There can only be one evaluation job per model version.
     * 
     */
    public Output<String> getModelVersion() {
        return this.modelVersion;
    }
    /**
     * After you create a job, Data Labeling Service assigns a name to the job with the following format: "projects/{project_id}/evaluationJobs/ {evaluation_job_id}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return After you create a job, Data Labeling Service assigns a name to the job with the following format: "projects/{project_id}/evaluationJobs/ {evaluation_job_id}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Describes the interval at which the job runs. This interval must be at least 1 day, and it is rounded to the nearest day. For example, if you specify a 50-hour interval, the job runs every 2 days. You can provide the schedule in [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is used, not the specific time of day.
     * 
     */
    @OutputExport(name="schedule", type=String.class, parameters={})
    private Output<String> schedule;

    /**
     * @return Describes the interval at which the job runs. This interval must be at least 1 day, and it is rounded to the nearest day. For example, if you specify a 50-hour interval, the job runs every 2 days. You can provide the schedule in [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is used, not the specific time of day.
     * 
     */
    public Output<String> getSchedule() {
        return this.schedule;
    }
    /**
     * Describes the current state of the job.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Describes the current state of the job.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EvaluationJob(String name, EvaluationJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:EvaluationJob", name, args == null ? EvaluationJobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EvaluationJob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:EvaluationJob", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static EvaluationJob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EvaluationJob(name, id, options);
    }
}
