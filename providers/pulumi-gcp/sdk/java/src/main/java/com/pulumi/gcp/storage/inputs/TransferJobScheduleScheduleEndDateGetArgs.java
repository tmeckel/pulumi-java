// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class TransferJobScheduleScheduleEndDateGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobScheduleScheduleEndDateGetArgs Empty = new TransferJobScheduleScheduleEndDateGetArgs();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    @Import(name="day", required=true)
    private Output<Integer> day;

    /**
     * @return Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    public Output<Integer> day() {
        return this.day;
    }

    /**
     * Month of year. Must be from 1 to 12.
     * 
     */
    @Import(name="month", required=true)
    private Output<Integer> month;

    /**
     * @return Month of year. Must be from 1 to 12.
     * 
     */
    public Output<Integer> month() {
        return this.month;
    }

    /**
     * Year of date. Must be from 1 to 9999.
     * 
     */
    @Import(name="year", required=true)
    private Output<Integer> year;

    /**
     * @return Year of date. Must be from 1 to 9999.
     * 
     */
    public Output<Integer> year() {
        return this.year;
    }

    private TransferJobScheduleScheduleEndDateGetArgs() {}

    private TransferJobScheduleScheduleEndDateGetArgs(TransferJobScheduleScheduleEndDateGetArgs $) {
        this.day = $.day;
        this.month = $.month;
        this.year = $.year;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobScheduleScheduleEndDateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobScheduleScheduleEndDateGetArgs $;

        public Builder() {
            $ = new TransferJobScheduleScheduleEndDateGetArgs();
        }

        public Builder(TransferJobScheduleScheduleEndDateGetArgs defaults) {
            $ = new TransferJobScheduleScheduleEndDateGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Day of month. Must be from 1 to 31 and valid for the year and month.
         * 
         * @return builder
         * 
         */
        public Builder day(Output<Integer> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day Day of month. Must be from 1 to 31 and valid for the year and month.
         * 
         * @return builder
         * 
         */
        public Builder day(Integer day) {
            return day(Output.of(day));
        }

        /**
         * @param month Month of year. Must be from 1 to 12.
         * 
         * @return builder
         * 
         */
        public Builder month(Output<Integer> month) {
            $.month = month;
            return this;
        }

        /**
         * @param month Month of year. Must be from 1 to 12.
         * 
         * @return builder
         * 
         */
        public Builder month(Integer month) {
            return month(Output.of(month));
        }

        /**
         * @param year Year of date. Must be from 1 to 9999.
         * 
         * @return builder
         * 
         */
        public Builder year(Output<Integer> year) {
            $.year = year;
            return this;
        }

        /**
         * @param year Year of date. Must be from 1 to 9999.
         * 
         * @return builder
         * 
         */
        public Builder year(Integer year) {
            return year(Output.of(year));
        }

        public TransferJobScheduleScheduleEndDateGetArgs build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.month = Objects.requireNonNull($.month, "expected parameter 'month' to be non-null");
            $.year = Objects.requireNonNull($.year, "expected parameter 'year' to be non-null");
            return $;
        }
    }

}
