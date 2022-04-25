// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Represents a time of day. The date and time zone are either not significant or are specified elsewhere. An API may choose to allow leap seconds. Related types are google.type.Date and `google.protobuf.Timestamp`.
 * 
 */
public final class TimeOfDayResponse extends com.pulumi.resources.InvokeArgs {

    public static final TimeOfDayResponse Empty = new TimeOfDayResponse();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
     * 
     */
    @Import(name="hours", required=true)
    private Integer hours;

    /**
     * @return Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
     * 
     */
    public Integer hours() {
        return this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @Import(name="minutes", required=true)
    private Integer minutes;

    /**
     * @return Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    public Integer minutes() {
        return this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @Import(name="nanos", required=true)
    private Integer nanos;

    /**
     * @return Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    public Integer nanos() {
        return this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    @Import(name="seconds", required=true)
    private Integer seconds;

    /**
     * @return Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    public Integer seconds() {
        return this.seconds;
    }

    private TimeOfDayResponse() {}

    private TimeOfDayResponse(TimeOfDayResponse $) {
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeOfDayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeOfDayResponse $;

        public Builder() {
            $ = new TimeOfDayResponse();
        }

        public Builder(TimeOfDayResponse defaults) {
            $ = new TimeOfDayResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param hours Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param minutes Minutes of hour of day. Must be from 0 to 59.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param nanos Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
         * 
         * @return builder
         * 
         */
        public Builder nanos(Integer nanos) {
            $.nanos = nanos;
            return this;
        }

        /**
         * @param seconds Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
         * 
         * @return builder
         * 
         */
        public Builder seconds(Integer seconds) {
            $.seconds = seconds;
            return this;
        }

        public TimeOfDayResponse build() {
            $.hours = Objects.requireNonNull($.hours, "expected parameter 'hours' to be non-null");
            $.minutes = Objects.requireNonNull($.minutes, "expected parameter 'minutes' to be non-null");
            $.nanos = Objects.requireNonNull($.nanos, "expected parameter 'nanos' to be non-null");
            $.seconds = Objects.requireNonNull($.seconds, "expected parameter 'seconds' to be non-null");
            return $;
        }
    }

}
