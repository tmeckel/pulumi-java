// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.RecurrenceFrequency;
import io.pulumi.azurenative.scheduler.inputs.JobRecurrenceScheduleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobRecurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobRecurrenceArgs Empty = new JobRecurrenceArgs();

    /**
     * Gets or sets the maximum number of times that the job should run.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Gets or sets the time at which the job will complete.
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    @InputImport(name="frequency")
      private final @Nullable Input<RecurrenceFrequency> frequency;

    public Input<RecurrenceFrequency> getFrequency() {
        return this.frequency == null ? Input.empty() : this.frequency;
    }

    /**
     * Gets or sets the interval between retries.
     * 
     */
    @InputImport(name="interval")
      private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    @InputImport(name="schedule")
      private final @Nullable Input<JobRecurrenceScheduleArgs> schedule;

    public Input<JobRecurrenceScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    public JobRecurrenceArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<String> endTime,
        @Nullable Input<RecurrenceFrequency> frequency,
        @Nullable Input<Integer> interval,
        @Nullable Input<JobRecurrenceScheduleArgs> schedule) {
        this.count = count;
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.schedule = schedule;
    }

    private JobRecurrenceArgs() {
        this.count = Input.empty();
        this.endTime = Input.empty();
        this.frequency = Input.empty();
        this.interval = Input.empty();
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<String> endTime;
        private @Nullable Input<RecurrenceFrequency> frequency;
        private @Nullable Input<Integer> interval;
        private @Nullable Input<JobRecurrenceScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.schedule = defaults.schedule;
        }

        public Builder count(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
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

        public Builder frequency(@Nullable Input<RecurrenceFrequency> frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder frequency(@Nullable RecurrenceFrequency frequency) {
            this.frequency = Input.ofNullable(frequency);
            return this;
        }

        public Builder interval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder schedule(@Nullable Input<JobRecurrenceScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable JobRecurrenceScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }
        public JobRecurrenceArgs build() {
            return new JobRecurrenceArgs(count, endTime, frequency, interval, schedule);
        }
    }
}
