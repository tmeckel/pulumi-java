// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WeekDayOfMonthResponse {
    /**
     * A day of the week.
     * 
     */
    private final String dayOfWeek;
    /**
     * Optional. Represents the number of days before or after the given week day of month that the patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point to the second day of the month and this `day_offset` value is set to `3`, the patch deployment takes place three days after the second Tuesday of the month. If this value is negative, for example -5, the patches are deployed five days before before the second Tuesday of the month. Allowed values are in range [-30, 30].
     * 
     */
    private final Integer dayOffset;
    /**
     * Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
     */
    private final Integer weekOrdinal;

    @OutputCustomType.Constructor
    private WeekDayOfMonthResponse(
        @OutputCustomType.Parameter("dayOfWeek") String dayOfWeek,
        @OutputCustomType.Parameter("dayOffset") Integer dayOffset,
        @OutputCustomType.Parameter("weekOrdinal") Integer weekOrdinal) {
        this.dayOfWeek = dayOfWeek;
        this.dayOffset = dayOffset;
        this.weekOrdinal = weekOrdinal;
    }

    /**
     * A day of the week.
     * 
    */
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * Optional. Represents the number of days before or after the given week day of month that the patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point to the second day of the month and this `day_offset` value is set to `3`, the patch deployment takes place three days after the second Tuesday of the month. If this value is negative, for example -5, the patches are deployed five days before before the second Tuesday of the month. Allowed values are in range [-30, 30].
     * 
    */
    public Integer getDayOffset() {
        return this.dayOffset;
    }
    /**
     * Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
    */
    public Integer getWeekOrdinal() {
        return this.weekOrdinal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeekDayOfMonthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private Integer dayOffset;
        private Integer weekOrdinal;

        public Builder() {
    	      // Empty
        }

        public Builder(WeekDayOfMonthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.dayOffset = defaults.dayOffset;
    	      this.weekOrdinal = defaults.weekOrdinal;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder dayOffset(Integer dayOffset) {
            this.dayOffset = Objects.requireNonNull(dayOffset);
            return this;
        }

        public Builder weekOrdinal(Integer weekOrdinal) {
            this.weekOrdinal = Objects.requireNonNull(weekOrdinal);
            return this;
        }
        public WeekDayOfMonthResponse build() {
            return new WeekDayOfMonthResponse(dayOfWeek, dayOffset, weekOrdinal);
        }
    }
}
