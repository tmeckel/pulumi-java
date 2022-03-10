// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.aws.backup.inputs.PlanRuleCopyActionGetArgs;
import io.pulumi.aws.backup.inputs.PlanRuleLifecycleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlanRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlanRuleGetArgs Empty = new PlanRuleGetArgs();

    /**
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * 
     */
    @InputImport(name="completionWindow")
      private final @Nullable Input<Integer> completionWindow;

    public Input<Integer> getCompletionWindow() {
        return this.completionWindow == null ? Input.empty() : this.completionWindow;
    }

    /**
     * Configuration block(s) with copy operation settings. Detailed below.
     * 
     */
    @InputImport(name="copyActions")
      private final @Nullable Input<List<PlanRuleCopyActionGetArgs>> copyActions;

    public Input<List<PlanRuleCopyActionGetArgs>> getCopyActions() {
        return this.copyActions == null ? Input.empty() : this.copyActions;
    }

    /**
     * Enable continuous backups for supported resources.
     * 
     */
    @InputImport(name="enableContinuousBackup")
      private final @Nullable Input<Boolean> enableContinuousBackup;

    public Input<Boolean> getEnableContinuousBackup() {
        return this.enableContinuousBackup == null ? Input.empty() : this.enableContinuousBackup;
    }

    /**
     * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * 
     */
    @InputImport(name="lifecycle")
      private final @Nullable Input<PlanRuleLifecycleGetArgs> lifecycle;

    public Input<PlanRuleLifecycleGetArgs> getLifecycle() {
        return this.lifecycle == null ? Input.empty() : this.lifecycle;
    }

    /**
     * Metadata that you can assign to help organize the resources that you create.
     * 
     */
    @InputImport(name="recoveryPointTags")
      private final @Nullable Input<Map<String,String>> recoveryPointTags;

    public Input<Map<String,String>> getRecoveryPointTags() {
        return this.recoveryPointTags == null ? Input.empty() : this.recoveryPointTags;
    }

    /**
     * An display name for a backup rule.
     * 
     */
    @InputImport(name="ruleName", required=true)
      private final Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName;
    }

    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The amount of time in minutes before beginning a backup.
     * 
     */
    @InputImport(name="startWindow")
      private final @Nullable Input<Integer> startWindow;

    public Input<Integer> getStartWindow() {
        return this.startWindow == null ? Input.empty() : this.startWindow;
    }

    /**
     * The name of a logical container where backups are stored.
     * 
     */
    @InputImport(name="targetVaultName", required=true)
      private final Input<String> targetVaultName;

    public Input<String> getTargetVaultName() {
        return this.targetVaultName;
    }

    public PlanRuleGetArgs(
        @Nullable Input<Integer> completionWindow,
        @Nullable Input<List<PlanRuleCopyActionGetArgs>> copyActions,
        @Nullable Input<Boolean> enableContinuousBackup,
        @Nullable Input<PlanRuleLifecycleGetArgs> lifecycle,
        @Nullable Input<Map<String,String>> recoveryPointTags,
        Input<String> ruleName,
        @Nullable Input<String> schedule,
        @Nullable Input<Integer> startWindow,
        Input<String> targetVaultName) {
        this.completionWindow = completionWindow;
        this.copyActions = copyActions;
        this.enableContinuousBackup = enableContinuousBackup;
        this.lifecycle = lifecycle;
        this.recoveryPointTags = recoveryPointTags;
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
        this.schedule = schedule;
        this.startWindow = startWindow;
        this.targetVaultName = Objects.requireNonNull(targetVaultName, "expected parameter 'targetVaultName' to be non-null");
    }

    private PlanRuleGetArgs() {
        this.completionWindow = Input.empty();
        this.copyActions = Input.empty();
        this.enableContinuousBackup = Input.empty();
        this.lifecycle = Input.empty();
        this.recoveryPointTags = Input.empty();
        this.ruleName = Input.empty();
        this.schedule = Input.empty();
        this.startWindow = Input.empty();
        this.targetVaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> completionWindow;
        private @Nullable Input<List<PlanRuleCopyActionGetArgs>> copyActions;
        private @Nullable Input<Boolean> enableContinuousBackup;
        private @Nullable Input<PlanRuleLifecycleGetArgs> lifecycle;
        private @Nullable Input<Map<String,String>> recoveryPointTags;
        private Input<String> ruleName;
        private @Nullable Input<String> schedule;
        private @Nullable Input<Integer> startWindow;
        private Input<String> targetVaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionWindow = defaults.completionWindow;
    	      this.copyActions = defaults.copyActions;
    	      this.enableContinuousBackup = defaults.enableContinuousBackup;
    	      this.lifecycle = defaults.lifecycle;
    	      this.recoveryPointTags = defaults.recoveryPointTags;
    	      this.ruleName = defaults.ruleName;
    	      this.schedule = defaults.schedule;
    	      this.startWindow = defaults.startWindow;
    	      this.targetVaultName = defaults.targetVaultName;
        }

        public Builder completionWindow(@Nullable Input<Integer> completionWindow) {
            this.completionWindow = completionWindow;
            return this;
        }

        public Builder completionWindow(@Nullable Integer completionWindow) {
            this.completionWindow = Input.ofNullable(completionWindow);
            return this;
        }

        public Builder copyActions(@Nullable Input<List<PlanRuleCopyActionGetArgs>> copyActions) {
            this.copyActions = copyActions;
            return this;
        }

        public Builder copyActions(@Nullable List<PlanRuleCopyActionGetArgs> copyActions) {
            this.copyActions = Input.ofNullable(copyActions);
            return this;
        }

        public Builder enableContinuousBackup(@Nullable Input<Boolean> enableContinuousBackup) {
            this.enableContinuousBackup = enableContinuousBackup;
            return this;
        }

        public Builder enableContinuousBackup(@Nullable Boolean enableContinuousBackup) {
            this.enableContinuousBackup = Input.ofNullable(enableContinuousBackup);
            return this;
        }

        public Builder lifecycle(@Nullable Input<PlanRuleLifecycleGetArgs> lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public Builder lifecycle(@Nullable PlanRuleLifecycleGetArgs lifecycle) {
            this.lifecycle = Input.ofNullable(lifecycle);
            return this;
        }

        public Builder recoveryPointTags(@Nullable Input<Map<String,String>> recoveryPointTags) {
            this.recoveryPointTags = recoveryPointTags;
            return this;
        }

        public Builder recoveryPointTags(@Nullable Map<String,String> recoveryPointTags) {
            this.recoveryPointTags = Input.ofNullable(recoveryPointTags);
            return this;
        }

        public Builder ruleName(Input<String> ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public Builder ruleName(String ruleName) {
            this.ruleName = Input.of(Objects.requireNonNull(ruleName));
            return this;
        }

        public Builder schedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder startWindow(@Nullable Input<Integer> startWindow) {
            this.startWindow = startWindow;
            return this;
        }

        public Builder startWindow(@Nullable Integer startWindow) {
            this.startWindow = Input.ofNullable(startWindow);
            return this;
        }

        public Builder targetVaultName(Input<String> targetVaultName) {
            this.targetVaultName = Objects.requireNonNull(targetVaultName);
            return this;
        }

        public Builder targetVaultName(String targetVaultName) {
            this.targetVaultName = Input.of(Objects.requireNonNull(targetVaultName));
            return this;
        }
        public PlanRuleGetArgs build() {
            return new PlanRuleGetArgs(completionWindow, copyActions, enableContinuousBackup, lifecycle, recoveryPointTags, ruleName, schedule, startWindow, targetVaultName);
        }
    }
}
