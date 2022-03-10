// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.EnableStatus;
import io.pulumi.azurenative.devtestlab.inputs.DayDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.HourDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.NotificationSettingsArgs;
import io.pulumi.azurenative.devtestlab.inputs.WeekDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for creating a schedule.
 * 
 */
public final class ScheduleCreationParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleCreationParameterArgs Empty = new ScheduleCreationParameterArgs();

    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @InputImport(name="dailyRecurrence")
      private final @Nullable Input<DayDetailsArgs> dailyRecurrence;

    public Input<DayDetailsArgs> getDailyRecurrence() {
        return this.dailyRecurrence == null ? Input.empty() : this.dailyRecurrence;
    }

    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @InputImport(name="hourlyRecurrence")
      private final @Nullable Input<HourDetailsArgs> hourlyRecurrence;

    public Input<HourDetailsArgs> getHourlyRecurrence() {
        return this.hourlyRecurrence == null ? Input.empty() : this.hourlyRecurrence;
    }

    /**
     * The name of the virtual machine or environment
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Notification settings.
     * 
     */
    @InputImport(name="notificationSettings")
      private final @Nullable Input<NotificationSettingsArgs> notificationSettings;

    public Input<NotificationSettingsArgs> getNotificationSettings() {
        return this.notificationSettings == null ? Input.empty() : this.notificationSettings;
    }

    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Either<String,EnableStatus>> status;

    public Input<Either<String,EnableStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @InputImport(name="targetResourceId")
      private final @Nullable Input<String> targetResourceId;

    public Input<String> getTargetResourceId() {
        return this.targetResourceId == null ? Input.empty() : this.targetResourceId;
    }

    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @InputImport(name="taskType")
      private final @Nullable Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType == null ? Input.empty() : this.taskType;
    }

    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @InputImport(name="timeZoneId")
      private final @Nullable Input<String> timeZoneId;

    public Input<String> getTimeZoneId() {
        return this.timeZoneId == null ? Input.empty() : this.timeZoneId;
    }

    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @InputImport(name="weeklyRecurrence")
      private final @Nullable Input<WeekDetailsArgs> weeklyRecurrence;

    public Input<WeekDetailsArgs> getWeeklyRecurrence() {
        return this.weeklyRecurrence == null ? Input.empty() : this.weeklyRecurrence;
    }

    public ScheduleCreationParameterArgs(
        @Nullable Input<DayDetailsArgs> dailyRecurrence,
        @Nullable Input<HourDetailsArgs> hourlyRecurrence,
        @Nullable Input<String> name,
        @Nullable Input<NotificationSettingsArgs> notificationSettings,
        @Nullable Input<Either<String,EnableStatus>> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> targetResourceId,
        @Nullable Input<String> taskType,
        @Nullable Input<String> timeZoneId,
        @Nullable Input<WeekDetailsArgs> weeklyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.status = status == null ? Input.ofLeft("Disabled") : status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.weeklyRecurrence = weeklyRecurrence;
    }

    private ScheduleCreationParameterArgs() {
        this.dailyRecurrence = Input.empty();
        this.hourlyRecurrence = Input.empty();
        this.name = Input.empty();
        this.notificationSettings = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.targetResourceId = Input.empty();
        this.taskType = Input.empty();
        this.timeZoneId = Input.empty();
        this.weeklyRecurrence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleCreationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DayDetailsArgs> dailyRecurrence;
        private @Nullable Input<HourDetailsArgs> hourlyRecurrence;
        private @Nullable Input<String> name;
        private @Nullable Input<NotificationSettingsArgs> notificationSettings;
        private @Nullable Input<Either<String,EnableStatus>> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> targetResourceId;
        private @Nullable Input<String> taskType;
        private @Nullable Input<String> timeZoneId;
        private @Nullable Input<WeekDetailsArgs> weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleCreationParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder dailyRecurrence(@Nullable Input<DayDetailsArgs> dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder dailyRecurrence(@Nullable DayDetailsArgs dailyRecurrence) {
            this.dailyRecurrence = Input.ofNullable(dailyRecurrence);
            return this;
        }

        public Builder hourlyRecurrence(@Nullable Input<HourDetailsArgs> hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder hourlyRecurrence(@Nullable HourDetailsArgs hourlyRecurrence) {
            this.hourlyRecurrence = Input.ofNullable(hourlyRecurrence);
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

        public Builder notificationSettings(@Nullable Input<NotificationSettingsArgs> notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }

        public Builder notificationSettings(@Nullable NotificationSettingsArgs notificationSettings) {
            this.notificationSettings = Input.ofNullable(notificationSettings);
            return this;
        }

        public Builder status(@Nullable Input<Either<String,EnableStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Either<String,EnableStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder targetResourceId(@Nullable Input<String> targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = Input.ofNullable(targetResourceId);
            return this;
        }

        public Builder taskType(@Nullable Input<String> taskType) {
            this.taskType = taskType;
            return this;
        }

        public Builder taskType(@Nullable String taskType) {
            this.taskType = Input.ofNullable(taskType);
            return this;
        }

        public Builder timeZoneId(@Nullable Input<String> timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }

        public Builder timeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = Input.ofNullable(timeZoneId);
            return this;
        }

        public Builder weeklyRecurrence(@Nullable Input<WeekDetailsArgs> weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }

        public Builder weeklyRecurrence(@Nullable WeekDetailsArgs weeklyRecurrence) {
            this.weeklyRecurrence = Input.ofNullable(weeklyRecurrence);
            return this;
        }
        public ScheduleCreationParameterArgs build() {
            return new ScheduleCreationParameterArgs(dailyRecurrence, hourlyRecurrence, name, notificationSettings, status, tags, targetResourceId, taskType, timeZoneId, weeklyRecurrence);
        }
    }
}
