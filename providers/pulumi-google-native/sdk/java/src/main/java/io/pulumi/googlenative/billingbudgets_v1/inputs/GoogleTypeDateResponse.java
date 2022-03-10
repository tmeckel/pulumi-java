// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Represents a whole or partial calendar date, such as a birthday. The time of day and time zone are either specified elsewhere or are insignificant. The date is relative to the Gregorian Calendar. This can represent one of the following: * A full date, with non-zero year, month, and day values * A month and day value, with a zero year, such as an anniversary * A year on its own, with zero month and day values * A year and month value, with a zero day, such as a credit card expiration date Related types are google.type.TimeOfDay and `google.protobuf.Timestamp`.
 * 
 */
public final class GoogleTypeDateResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleTypeDateResponse Empty = new GoogleTypeDateResponse();

    /**
     * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
     * 
     */
    @InputImport(name="day", required=true)
      private final Integer day;

    public Integer getDay() {
        return this.day;
    }

    /**
     * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    @InputImport(name="month", required=true)
      private final Integer month;

    public Integer getMonth() {
        return this.month;
    }

    /**
     * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    @InputImport(name="year", required=true)
      private final Integer year;

    public Integer getYear() {
        return this.year;
    }

    public GoogleTypeDateResponse(
        Integer day,
        Integer month,
        Integer year) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.month = Objects.requireNonNull(month, "expected parameter 'month' to be non-null");
        this.year = Objects.requireNonNull(year, "expected parameter 'year' to be non-null");
    }

    private GoogleTypeDateResponse() {
        this.day = null;
        this.month = null;
        this.year = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeDateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleTypeDateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder month(Integer month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }

        public Builder year(Integer year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }
        public GoogleTypeDateResponse build() {
            return new GoogleTypeDateResponse(day, month, year);
        }
    }
}
