// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.aws.redshift.inputs.ScheduledActionTargetActionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionState extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionState Empty = new ScheduledActionState();

    /**
     * The description of the scheduled action.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether to enable the scheduled action. Default is `true` .
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * The IAM role to assume to run the scheduled action.
     * 
     */
    @InputImport(name="iamRole")
      private final @Nullable Input<String> iamRole;

    public Input<String> getIamRole() {
        return this.iamRole == null ? Input.empty() : this.iamRole;
    }

    /**
     * The scheduled action name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The schedule of action. The schedule is defined format of "at expression" or "cron expression", for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Target action. Documented below.
     * 
     */
    @InputImport(name="targetAction")
      private final @Nullable Input<ScheduledActionTargetActionGetArgs> targetAction;

    public Input<ScheduledActionTargetActionGetArgs> getTargetAction() {
        return this.targetAction == null ? Input.empty() : this.targetAction;
    }

    public ScheduledActionState(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enable,
        @Nullable Input<String> endTime,
        @Nullable Input<String> iamRole,
        @Nullable Input<String> name,
        @Nullable Input<String> schedule,
        @Nullable Input<String> startTime,
        @Nullable Input<ScheduledActionTargetActionGetArgs> targetAction) {
        this.description = description;
        this.enable = enable;
        this.endTime = endTime;
        this.iamRole = iamRole;
        this.name = name;
        this.schedule = schedule;
        this.startTime = startTime;
        this.targetAction = targetAction;
    }

    private ScheduledActionState() {
        this.description = Input.empty();
        this.enable = Input.empty();
        this.endTime = Input.empty();
        this.iamRole = Input.empty();
        this.name = Input.empty();
        this.schedule = Input.empty();
        this.startTime = Input.empty();
        this.targetAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> iamRole;
        private @Nullable Input<String> name;
        private @Nullable Input<String> schedule;
        private @Nullable Input<String> startTime;
        private @Nullable Input<ScheduledActionTargetActionGetArgs> targetAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.endTime = defaults.endTime;
    	      this.iamRole = defaults.iamRole;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.targetAction = defaults.targetAction;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder enable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder enable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder endTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder iamRole(@Nullable Input<String> iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        public Builder iamRole(@Nullable String iamRole) {
            this.iamRole = Input.ofNullable(iamRole);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder startTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder targetAction(@Nullable Input<ScheduledActionTargetActionGetArgs> targetAction) {
            this.targetAction = targetAction;
            return this;
        }

        public Builder targetAction(@Nullable ScheduledActionTargetActionGetArgs targetAction) {
            this.targetAction = Input.ofNullable(targetAction);
            return this;
        }
        public ScheduledActionState build() {
            return new ScheduledActionState(description, enable, endTime, iamRole, name, schedule, startTime, targetAction);
        }
    }
}
