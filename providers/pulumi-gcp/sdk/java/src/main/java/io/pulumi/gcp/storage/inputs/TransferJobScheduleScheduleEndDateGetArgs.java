// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class TransferJobScheduleScheduleEndDateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobScheduleScheduleEndDateGetArgs Empty = new TransferJobScheduleScheduleEndDateGetArgs();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    @InputImport(name="day", required=true)
      private final Input<Integer> day;

    public Input<Integer> getDay() {
        return this.day;
    }

    /**
     * Month of year. Must be from 1 to 12.
     * 
     */
    @InputImport(name="month", required=true)
      private final Input<Integer> month;

    public Input<Integer> getMonth() {
        return this.month;
    }

    /**
     * Year of date. Must be from 1 to 9999.
     * 
     */
    @InputImport(name="year", required=true)
      private final Input<Integer> year;

    public Input<Integer> getYear() {
        return this.year;
    }

    public TransferJobScheduleScheduleEndDateGetArgs(
        Input<Integer> day,
        Input<Integer> month,
        Input<Integer> year) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.month = Objects.requireNonNull(month, "expected parameter 'month' to be non-null");
        this.year = Objects.requireNonNull(year, "expected parameter 'year' to be non-null");
    }

    private TransferJobScheduleScheduleEndDateGetArgs() {
        this.day = Input.empty();
        this.month = Input.empty();
        this.year = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobScheduleScheduleEndDateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> day;
        private Input<Integer> month;
        private Input<Integer> year;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobScheduleScheduleEndDateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(Input<Integer> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder day(Integer day) {
            this.day = Input.of(Objects.requireNonNull(day));
            return this;
        }

        public Builder month(Input<Integer> month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }

        public Builder month(Integer month) {
            this.month = Input.of(Objects.requireNonNull(month));
            return this;
        }

        public Builder year(Input<Integer> year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }

        public Builder year(Integer year) {
            this.year = Input.of(Objects.requireNonNull(year));
            return this;
        }
        public TransferJobScheduleScheduleEndDateGetArgs build() {
            return new TransferJobScheduleScheduleEndDateGetArgs(day, month, year);
        }
    }
}
