// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.enums.JobTriggerStatus;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectJobConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TriggerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTriggerArgs Empty = new JobTriggerArgs();

    /**
     * User provided description (max 256 chars)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User provided description (max 256 chars)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display name (max 100 chars)
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name (max 100 chars)
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * For inspect jobs, a snapshot of the configuration.
     * 
     */
    @Import(name="inspectJob")
    private @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;

    /**
     * @return For inspect jobs, a snapshot of the configuration.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2InspectJobConfigArgs>> inspectJob() {
        return Optional.ofNullable(this.inspectJob);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A status for this trigger.
     * 
     */
    @Import(name="status", required=true)
    private Output<JobTriggerStatus> status;

    /**
     * @return A status for this trigger.
     * 
     */
    public Output<JobTriggerStatus> status() {
        return this.status;
    }

    /**
     * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @Import(name="triggerId")
    private @Nullable Output<String> triggerId;

    /**
     * @return The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    public Optional<Output<String>> triggerId() {
        return Optional.ofNullable(this.triggerId);
    }

    /**
     * A list of triggers which will be OR&#39;ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<List<GooglePrivacyDlpV2TriggerArgs>> triggers;

    /**
     * @return A list of triggers which will be OR&#39;ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2TriggerArgs>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    private JobTriggerArgs() {}

    private JobTriggerArgs(JobTriggerArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.inspectJob = $.inspectJob;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.status = $.status;
        this.triggerId = $.triggerId;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTriggerArgs $;

        public Builder() {
            $ = new JobTriggerArgs();
        }

        public Builder(JobTriggerArgs defaults) {
            $ = new JobTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description User provided description (max 256 chars)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User provided description (max 256 chars)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name (max 100 chars)
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name (max 100 chars)
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param inspectJob For inspect jobs, a snapshot of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder inspectJob(@Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob) {
            $.inspectJob = inspectJob;
            return this;
        }

        /**
         * @param inspectJob For inspect jobs, a snapshot of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder inspectJob(GooglePrivacyDlpV2InspectJobConfigArgs inspectJob) {
            return inspectJob(Output.of(inspectJob));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param status A status for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<JobTriggerStatus> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status A status for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder status(JobTriggerStatus status) {
            return status(Output.of(status));
        }

        /**
         * @param triggerId The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(@Nullable Output<String> triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        /**
         * @param triggerId The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(String triggerId) {
            return triggerId(Output.of(triggerId));
        }

        /**
         * @param triggers A list of triggers which will be OR&#39;ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<List<GooglePrivacyDlpV2TriggerArgs>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers A list of triggers which will be OR&#39;ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
         * 
         * @return builder
         * 
         */
        public Builder triggers(List<GooglePrivacyDlpV2TriggerArgs> triggers) {
            return triggers(Output.of(triggers));
        }

        /**
         * @param triggers A list of triggers which will be OR&#39;ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
         * 
         * @return builder
         * 
         */
        public Builder triggers(GooglePrivacyDlpV2TriggerArgs... triggers) {
            return triggers(List.of(triggers));
        }

        public JobTriggerArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
