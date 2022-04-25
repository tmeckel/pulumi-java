// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.enums.JobScheduleDay;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobRecurrenceScheduleMonthlyOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobRecurrenceScheduleMonthlyOccurrenceArgs Empty = new JobRecurrenceScheduleMonthlyOccurrenceArgs();

    /**
     * Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    @Import(name="day")
    private @Nullable Output<JobScheduleDay> day;

    /**
     * @return Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    public Optional<Output<JobScheduleDay>> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * Gets or sets the occurrence. Must be between -5 and 5.
     * 
     */
    @Import(name="occurrence")
    private @Nullable Output<Integer> occurrence;

    /**
     * @return Gets or sets the occurrence. Must be between -5 and 5.
     * 
     */
    public Optional<Output<Integer>> occurrence() {
        return Optional.ofNullable(this.occurrence);
    }

    private JobRecurrenceScheduleMonthlyOccurrenceArgs() {}

    private JobRecurrenceScheduleMonthlyOccurrenceArgs(JobRecurrenceScheduleMonthlyOccurrenceArgs $) {
        this.day = $.day;
        this.occurrence = $.occurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobRecurrenceScheduleMonthlyOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobRecurrenceScheduleMonthlyOccurrenceArgs $;

        public Builder() {
            $ = new JobRecurrenceScheduleMonthlyOccurrenceArgs();
        }

        public Builder(JobRecurrenceScheduleMonthlyOccurrenceArgs defaults) {
            $ = new JobRecurrenceScheduleMonthlyOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
         * 
         * @return builder
         * 
         */
        public Builder day(@Nullable Output<JobScheduleDay> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
         * 
         * @return builder
         * 
         */
        public Builder day(JobScheduleDay day) {
            return day(Output.of(day));
        }

        /**
         * @param occurrence Gets or sets the occurrence. Must be between -5 and 5.
         * 
         * @return builder
         * 
         */
        public Builder occurrence(@Nullable Output<Integer> occurrence) {
            $.occurrence = occurrence;
            return this;
        }

        /**
         * @param occurrence Gets or sets the occurrence. Must be between -5 and 5.
         * 
         * @return builder
         * 
         */
        public Builder occurrence(Integer occurrence) {
            return occurrence(Output.of(occurrence));
        }

        public JobRecurrenceScheduleMonthlyOccurrenceArgs build() {
            return $;
        }
    }

}
