// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1beta.enums.RecurringScheduleFrequency;
import io.pulumi.googlenative.osconfig_v1beta.inputs.MonthlyScheduleArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.TimeOfDayArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.TimeZoneArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.WeeklyScheduleArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sets the time for recurring patch deployments.
 * 
 */
public final class RecurringScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecurringScheduleArgs Empty = new RecurringScheduleArgs();

    /**
     * Optional. The end time at which a recurring patch deployment schedule is no longer active.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    /**
     * The frequency unit of this recurring schedule.
     * 
     */
    @Import(name="frequency", required=true)
      private final Output<RecurringScheduleFrequency> frequency;

    public Output<RecurringScheduleFrequency> getFrequency() {
        return this.frequency;
    }

    /**
     * Schedule with monthly executions.
     * 
     */
    @Import(name="monthly", required=true)
      private final Output<MonthlyScheduleArgs> monthly;

    public Output<MonthlyScheduleArgs> getMonthly() {
        return this.monthly;
    }

    /**
     * Optional. The time that the recurring schedule becomes effective. Defaults to `create_time` of the patch deployment.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * Time of the day to run a recurring deployment.
     * 
     */
    @Import(name="timeOfDay", required=true)
      private final Output<TimeOfDayArgs> timeOfDay;

    public Output<TimeOfDayArgs> getTimeOfDay() {
        return this.timeOfDay;
    }

    /**
     * Defines the time zone that `time_of_day` is relative to. The rules for daylight saving time are determined by the chosen time zone.
     * 
     */
    @Import(name="timeZone", required=true)
      private final Output<TimeZoneArgs> timeZone;

    public Output<TimeZoneArgs> getTimeZone() {
        return this.timeZone;
    }

    /**
     * Schedule with weekly executions.
     * 
     */
    @Import(name="weekly", required=true)
      private final Output<WeeklyScheduleArgs> weekly;

    public Output<WeeklyScheduleArgs> getWeekly() {
        return this.weekly;
    }

    public RecurringScheduleArgs(
        @Nullable Output<String> endTime,
        Output<RecurringScheduleFrequency> frequency,
        Output<MonthlyScheduleArgs> monthly,
        @Nullable Output<String> startTime,
        Output<TimeOfDayArgs> timeOfDay,
        Output<TimeZoneArgs> timeZone,
        Output<WeeklyScheduleArgs> weekly) {
        this.endTime = endTime;
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.monthly = Objects.requireNonNull(monthly, "expected parameter 'monthly' to be non-null");
        this.startTime = startTime;
        this.timeOfDay = Objects.requireNonNull(timeOfDay, "expected parameter 'timeOfDay' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
        this.weekly = Objects.requireNonNull(weekly, "expected parameter 'weekly' to be non-null");
    }

    private RecurringScheduleArgs() {
        this.endTime = Codegen.empty();
        this.frequency = Codegen.empty();
        this.monthly = Codegen.empty();
        this.startTime = Codegen.empty();
        this.timeOfDay = Codegen.empty();
        this.timeZone = Codegen.empty();
        this.weekly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurringScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endTime;
        private Output<RecurringScheduleFrequency> frequency;
        private Output<MonthlyScheduleArgs> monthly;
        private @Nullable Output<String> startTime;
        private Output<TimeOfDayArgs> timeOfDay;
        private Output<TimeZoneArgs> timeZone;
        private Output<WeeklyScheduleArgs> weekly;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurringScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.monthly = defaults.monthly;
    	      this.startTime = defaults.startTime;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
    	      this.weekly = defaults.weekly;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder frequency(Output<RecurringScheduleFrequency> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        public Builder frequency(RecurringScheduleFrequency frequency) {
            this.frequency = Output.of(Objects.requireNonNull(frequency));
            return this;
        }
        public Builder monthly(Output<MonthlyScheduleArgs> monthly) {
            this.monthly = Objects.requireNonNull(monthly);
            return this;
        }
        public Builder monthly(MonthlyScheduleArgs monthly) {
            this.monthly = Output.of(Objects.requireNonNull(monthly));
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder timeOfDay(Output<TimeOfDayArgs> timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }
        public Builder timeOfDay(TimeOfDayArgs timeOfDay) {
            this.timeOfDay = Output.of(Objects.requireNonNull(timeOfDay));
            return this;
        }
        public Builder timeZone(Output<TimeZoneArgs> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder timeZone(TimeZoneArgs timeZone) {
            this.timeZone = Output.of(Objects.requireNonNull(timeZone));
            return this;
        }
        public Builder weekly(Output<WeeklyScheduleArgs> weekly) {
            this.weekly = Objects.requireNonNull(weekly);
            return this;
        }
        public Builder weekly(WeeklyScheduleArgs weekly) {
            this.weekly = Output.of(Objects.requireNonNull(weekly));
            return this;
        }        public RecurringScheduleArgs build() {
            return new RecurringScheduleArgs(endTime, frequency, monthly, startTime, timeOfDay, timeZone, weekly);
        }
    }
}
