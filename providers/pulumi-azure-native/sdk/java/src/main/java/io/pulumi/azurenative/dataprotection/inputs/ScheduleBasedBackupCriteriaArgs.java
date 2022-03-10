// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.enums.AbsoluteMarker;
import io.pulumi.azurenative.dataprotection.enums.DayOfWeek;
import io.pulumi.azurenative.dataprotection.enums.Month;
import io.pulumi.azurenative.dataprotection.enums.WeekNumber;
import io.pulumi.azurenative.dataprotection.inputs.DayArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Schedule based backup criteria
 * 
 */
public final class ScheduleBasedBackupCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleBasedBackupCriteriaArgs Empty = new ScheduleBasedBackupCriteriaArgs();

    /**
     * it contains absolute values like "AllBackup" / "FirstOfDay" / "FirstOfWeek" / "FirstOfMonth"
     * and should be part of AbsoluteMarker enum
     * 
     */
    @InputImport(name="absoluteCriteria")
      private final @Nullable Input<List<Either<String,AbsoluteMarker>>> absoluteCriteria;

    public Input<List<Either<String,AbsoluteMarker>>> getAbsoluteCriteria() {
        return this.absoluteCriteria == null ? Input.empty() : this.absoluteCriteria;
    }

    /**
     * This is day of the month from 1 to 28 other wise last of month
     * 
     */
    @InputImport(name="daysOfMonth")
      private final @Nullable Input<List<DayArgs>> daysOfMonth;

    public Input<List<DayArgs>> getDaysOfMonth() {
        return this.daysOfMonth == null ? Input.empty() : this.daysOfMonth;
    }

    /**
     * It should be Sunday/Monday/T..../Saturday
     * 
     */
    @InputImport(name="daysOfTheWeek")
      private final @Nullable Input<List<Either<String,DayOfWeek>>> daysOfTheWeek;

    public Input<List<Either<String,DayOfWeek>>> getDaysOfTheWeek() {
        return this.daysOfTheWeek == null ? Input.empty() : this.daysOfTheWeek;
    }

    /**
     * It should be January/February/....../December
     * 
     */
    @InputImport(name="monthsOfYear")
      private final @Nullable Input<List<Either<String,Month>>> monthsOfYear;

    public Input<List<Either<String,Month>>> getMonthsOfYear() {
        return this.monthsOfYear == null ? Input.empty() : this.monthsOfYear;
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'ScheduleBasedBackupCriteria'.
     * 
     */
    @InputImport(name="objectType", required=true)
      private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    /**
     * List of schedule times for backup
     * 
     */
    @InputImport(name="scheduleTimes")
      private final @Nullable Input<List<String>> scheduleTimes;

    public Input<List<String>> getScheduleTimes() {
        return this.scheduleTimes == null ? Input.empty() : this.scheduleTimes;
    }

    /**
     * It should be First/Second/Third/Fourth/Last
     * 
     */
    @InputImport(name="weeksOfTheMonth")
      private final @Nullable Input<List<Either<String,WeekNumber>>> weeksOfTheMonth;

    public Input<List<Either<String,WeekNumber>>> getWeeksOfTheMonth() {
        return this.weeksOfTheMonth == null ? Input.empty() : this.weeksOfTheMonth;
    }

    public ScheduleBasedBackupCriteriaArgs(
        @Nullable Input<List<Either<String,AbsoluteMarker>>> absoluteCriteria,
        @Nullable Input<List<DayArgs>> daysOfMonth,
        @Nullable Input<List<Either<String,DayOfWeek>>> daysOfTheWeek,
        @Nullable Input<List<Either<String,Month>>> monthsOfYear,
        Input<String> objectType,
        @Nullable Input<List<String>> scheduleTimes,
        @Nullable Input<List<Either<String,WeekNumber>>> weeksOfTheMonth) {
        this.absoluteCriteria = absoluteCriteria;
        this.daysOfMonth = daysOfMonth;
        this.daysOfTheWeek = daysOfTheWeek;
        this.monthsOfYear = monthsOfYear;
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.scheduleTimes = scheduleTimes;
        this.weeksOfTheMonth = weeksOfTheMonth;
    }

    private ScheduleBasedBackupCriteriaArgs() {
        this.absoluteCriteria = Input.empty();
        this.daysOfMonth = Input.empty();
        this.daysOfTheWeek = Input.empty();
        this.monthsOfYear = Input.empty();
        this.objectType = Input.empty();
        this.scheduleTimes = Input.empty();
        this.weeksOfTheMonth = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleBasedBackupCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,AbsoluteMarker>>> absoluteCriteria;
        private @Nullable Input<List<DayArgs>> daysOfMonth;
        private @Nullable Input<List<Either<String,DayOfWeek>>> daysOfTheWeek;
        private @Nullable Input<List<Either<String,Month>>> monthsOfYear;
        private Input<String> objectType;
        private @Nullable Input<List<String>> scheduleTimes;
        private @Nullable Input<List<Either<String,WeekNumber>>> weeksOfTheMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleBasedBackupCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.absoluteCriteria = defaults.absoluteCriteria;
    	      this.daysOfMonth = defaults.daysOfMonth;
    	      this.daysOfTheWeek = defaults.daysOfTheWeek;
    	      this.monthsOfYear = defaults.monthsOfYear;
    	      this.objectType = defaults.objectType;
    	      this.scheduleTimes = defaults.scheduleTimes;
    	      this.weeksOfTheMonth = defaults.weeksOfTheMonth;
        }

        public Builder absoluteCriteria(@Nullable Input<List<Either<String,AbsoluteMarker>>> absoluteCriteria) {
            this.absoluteCriteria = absoluteCriteria;
            return this;
        }

        public Builder absoluteCriteria(@Nullable List<Either<String,AbsoluteMarker>> absoluteCriteria) {
            this.absoluteCriteria = Input.ofNullable(absoluteCriteria);
            return this;
        }

        public Builder daysOfMonth(@Nullable Input<List<DayArgs>> daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }

        public Builder daysOfMonth(@Nullable List<DayArgs> daysOfMonth) {
            this.daysOfMonth = Input.ofNullable(daysOfMonth);
            return this;
        }

        public Builder daysOfTheWeek(@Nullable Input<List<Either<String,DayOfWeek>>> daysOfTheWeek) {
            this.daysOfTheWeek = daysOfTheWeek;
            return this;
        }

        public Builder daysOfTheWeek(@Nullable List<Either<String,DayOfWeek>> daysOfTheWeek) {
            this.daysOfTheWeek = Input.ofNullable(daysOfTheWeek);
            return this;
        }

        public Builder monthsOfYear(@Nullable Input<List<Either<String,Month>>> monthsOfYear) {
            this.monthsOfYear = monthsOfYear;
            return this;
        }

        public Builder monthsOfYear(@Nullable List<Either<String,Month>> monthsOfYear) {
            this.monthsOfYear = Input.ofNullable(monthsOfYear);
            return this;
        }

        public Builder objectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder objectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public Builder scheduleTimes(@Nullable Input<List<String>> scheduleTimes) {
            this.scheduleTimes = scheduleTimes;
            return this;
        }

        public Builder scheduleTimes(@Nullable List<String> scheduleTimes) {
            this.scheduleTimes = Input.ofNullable(scheduleTimes);
            return this;
        }

        public Builder weeksOfTheMonth(@Nullable Input<List<Either<String,WeekNumber>>> weeksOfTheMonth) {
            this.weeksOfTheMonth = weeksOfTheMonth;
            return this;
        }

        public Builder weeksOfTheMonth(@Nullable List<Either<String,WeekNumber>> weeksOfTheMonth) {
            this.weeksOfTheMonth = Input.ofNullable(weeksOfTheMonth);
            return this;
        }
        public ScheduleBasedBackupCriteriaArgs build() {
            return new ScheduleBasedBackupCriteriaArgs(absoluteCriteria, daysOfMonth, daysOfTheWeek, monthsOfYear, objectType, scheduleTimes, weeksOfTheMonth);
        }
    }
}
