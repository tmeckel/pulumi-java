// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentArgs Empty = new PatchDeploymentArgs();

    /**
     * Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    @InputImport(name="duration")
      private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * VM instances to patch.
     * Structure is documented below.
     * 
     */
    @InputImport(name="instanceFilter", required=true)
      private final Input<PatchDeploymentInstanceFilterArgs> instanceFilter;

    public Input<PatchDeploymentInstanceFilterArgs> getInstanceFilter() {
        return this.instanceFilter;
    }

    /**
     * Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    @InputImport(name="oneTimeSchedule")
      private final @Nullable Input<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule;

    public Input<PatchDeploymentOneTimeScheduleArgs> getOneTimeSchedule() {
        return this.oneTimeSchedule == null ? Input.empty() : this.oneTimeSchedule;
    }

    /**
     * Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    @InputImport(name="patchConfig")
      private final @Nullable Input<PatchDeploymentPatchConfigArgs> patchConfig;

    public Input<PatchDeploymentPatchConfigArgs> getPatchConfig() {
        return this.patchConfig == null ? Input.empty() : this.patchConfig;
    }

    /**
     * A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @InputImport(name="patchDeploymentId", required=true)
      private final Input<String> patchDeploymentId;

    public Input<String> getPatchDeploymentId() {
        return this.patchDeploymentId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="recurringSchedule")
      private final @Nullable Input<PatchDeploymentRecurringScheduleArgs> recurringSchedule;

    public Input<PatchDeploymentRecurringScheduleArgs> getRecurringSchedule() {
        return this.recurringSchedule == null ? Input.empty() : this.recurringSchedule;
    }

    /**
     * Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rollout")
      private final @Nullable Input<PatchDeploymentRolloutArgs> rollout;

    public Input<PatchDeploymentRolloutArgs> getRollout() {
        return this.rollout == null ? Input.empty() : this.rollout;
    }

    public PatchDeploymentArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> duration,
        Input<PatchDeploymentInstanceFilterArgs> instanceFilter,
        @Nullable Input<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule,
        @Nullable Input<PatchDeploymentPatchConfigArgs> patchConfig,
        Input<String> patchDeploymentId,
        @Nullable Input<String> project,
        @Nullable Input<PatchDeploymentRecurringScheduleArgs> recurringSchedule,
        @Nullable Input<PatchDeploymentRolloutArgs> rollout) {
        this.description = description;
        this.duration = duration;
        this.instanceFilter = Objects.requireNonNull(instanceFilter, "expected parameter 'instanceFilter' to be non-null");
        this.oneTimeSchedule = oneTimeSchedule;
        this.patchConfig = patchConfig;
        this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId, "expected parameter 'patchDeploymentId' to be non-null");
        this.project = project;
        this.recurringSchedule = recurringSchedule;
        this.rollout = rollout;
    }

    private PatchDeploymentArgs() {
        this.description = Input.empty();
        this.duration = Input.empty();
        this.instanceFilter = Input.empty();
        this.oneTimeSchedule = Input.empty();
        this.patchConfig = Input.empty();
        this.patchDeploymentId = Input.empty();
        this.project = Input.empty();
        this.recurringSchedule = Input.empty();
        this.rollout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> duration;
        private Input<PatchDeploymentInstanceFilterArgs> instanceFilter;
        private @Nullable Input<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule;
        private @Nullable Input<PatchDeploymentPatchConfigArgs> patchConfig;
        private Input<String> patchDeploymentId;
        private @Nullable Input<String> project;
        private @Nullable Input<PatchDeploymentRecurringScheduleArgs> recurringSchedule;
        private @Nullable Input<PatchDeploymentRolloutArgs> rollout;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.duration = defaults.duration;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.oneTimeSchedule = defaults.oneTimeSchedule;
    	      this.patchConfig = defaults.patchConfig;
    	      this.patchDeploymentId = defaults.patchDeploymentId;
    	      this.project = defaults.project;
    	      this.recurringSchedule = defaults.recurringSchedule;
    	      this.rollout = defaults.rollout;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder duration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder instanceFilter(Input<PatchDeploymentInstanceFilterArgs> instanceFilter) {
            this.instanceFilter = Objects.requireNonNull(instanceFilter);
            return this;
        }

        public Builder instanceFilter(PatchDeploymentInstanceFilterArgs instanceFilter) {
            this.instanceFilter = Input.of(Objects.requireNonNull(instanceFilter));
            return this;
        }

        public Builder oneTimeSchedule(@Nullable Input<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule) {
            this.oneTimeSchedule = oneTimeSchedule;
            return this;
        }

        public Builder oneTimeSchedule(@Nullable PatchDeploymentOneTimeScheduleArgs oneTimeSchedule) {
            this.oneTimeSchedule = Input.ofNullable(oneTimeSchedule);
            return this;
        }

        public Builder patchConfig(@Nullable Input<PatchDeploymentPatchConfigArgs> patchConfig) {
            this.patchConfig = patchConfig;
            return this;
        }

        public Builder patchConfig(@Nullable PatchDeploymentPatchConfigArgs patchConfig) {
            this.patchConfig = Input.ofNullable(patchConfig);
            return this;
        }

        public Builder patchDeploymentId(Input<String> patchDeploymentId) {
            this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId);
            return this;
        }

        public Builder patchDeploymentId(String patchDeploymentId) {
            this.patchDeploymentId = Input.of(Objects.requireNonNull(patchDeploymentId));
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

        public Builder recurringSchedule(@Nullable Input<PatchDeploymentRecurringScheduleArgs> recurringSchedule) {
            this.recurringSchedule = recurringSchedule;
            return this;
        }

        public Builder recurringSchedule(@Nullable PatchDeploymentRecurringScheduleArgs recurringSchedule) {
            this.recurringSchedule = Input.ofNullable(recurringSchedule);
            return this;
        }

        public Builder rollout(@Nullable Input<PatchDeploymentRolloutArgs> rollout) {
            this.rollout = rollout;
            return this;
        }

        public Builder rollout(@Nullable PatchDeploymentRolloutArgs rollout) {
            this.rollout = Input.ofNullable(rollout);
            return this;
        }
        public PatchDeploymentArgs build() {
            return new PatchDeploymentArgs(description, duration, instanceFilter, oneTimeSchedule, patchConfig, patchDeploymentId, project, recurringSchedule, rollout);
        }
    }
}
