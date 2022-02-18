// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dlp_v2.JobTriggerArgs;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ErrorResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectJobConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2TriggerResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a job trigger to run DLP actions such as scanning storage for sensitive information on a set schedule. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
 * 
 */
@ResourceType(type="google-native:dlp/v2:JobTrigger")
public class JobTrigger extends io.pulumi.resources.CustomResource {
    /**
     * The creation timestamp of a triggeredJob.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of a triggeredJob.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * User provided description (max 256 chars)
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User provided description (max 256 chars)
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Display name (max 100 chars)
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name (max 100 chars)
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A stream of errors encountered when the trigger was activated. Repeated errors may result in the JobTrigger automatically being paused. Will return the last 100 errors. Whenever the JobTrigger is modified this list will be cleared.
     * 
     */
    @OutputExport(name="errors", type=List.class, parameters={GooglePrivacyDlpV2ErrorResponse.class})
    private Output<List<GooglePrivacyDlpV2ErrorResponse>> errors;

    /**
     * @return A stream of errors encountered when the trigger was activated. Repeated errors may result in the JobTrigger automatically being paused. Will return the last 100 errors. Whenever the JobTrigger is modified this list will be cleared.
     * 
     */
    public Output<List<GooglePrivacyDlpV2ErrorResponse>> getErrors() {
        return this.errors;
    }
    /**
     * For inspect jobs, a snapshot of the configuration.
     * 
     */
    @OutputExport(name="inspectJob", type=GooglePrivacyDlpV2InspectJobConfigResponse.class, parameters={})
    private Output<GooglePrivacyDlpV2InspectJobConfigResponse> inspectJob;

    /**
     * @return For inspect jobs, a snapshot of the configuration.
     * 
     */
    public Output<GooglePrivacyDlpV2InspectJobConfigResponse> getInspectJob() {
        return this.inspectJob;
    }
    /**
     * The timestamp of the last time this trigger executed.
     * 
     */
    @OutputExport(name="lastRunTime", type=String.class, parameters={})
    private Output<String> lastRunTime;

    /**
     * @return The timestamp of the last time this trigger executed.
     * 
     */
    public Output<String> getLastRunTime() {
        return this.lastRunTime;
    }
    /**
     * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A status for this trigger.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return A status for this trigger.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
     */
    @OutputExport(name="triggers", type=List.class, parameters={GooglePrivacyDlpV2TriggerResponse.class})
    private Output<List<GooglePrivacyDlpV2TriggerResponse>> triggers;

    /**
     * @return A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
     */
    public Output<List<GooglePrivacyDlpV2TriggerResponse>> getTriggers() {
        return this.triggers;
    }
    /**
     * The last update timestamp of a triggeredJob.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of a triggeredJob.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobTrigger(String name, JobTriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:JobTrigger", name, args == null ? JobTriggerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobTrigger(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:JobTrigger", name, null, makeResourceOptions(options, id));
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
    public static JobTrigger get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobTrigger(name, id, options);
    }
}
