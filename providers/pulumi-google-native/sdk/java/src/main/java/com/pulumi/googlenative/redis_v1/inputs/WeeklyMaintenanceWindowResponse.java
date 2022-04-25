// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.redis_v1.inputs.TimeOfDayResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Time window in which disruptive maintenance updates occur. Non-disruptive updates can occur inside or outside this window.
 * 
 */
public final class WeeklyMaintenanceWindowResponse extends com.pulumi.resources.InvokeArgs {

    public static final WeeklyMaintenanceWindowResponse Empty = new WeeklyMaintenanceWindowResponse();

    /**
     * The day of week that maintenance updates occur.
     * 
     */
    @Import(name="day", required=true)
    private String day;

    /**
     * @return The day of week that maintenance updates occur.
     * 
     */
    public String day() {
        return this.day;
    }

    /**
     * Duration of the maintenance window. The current window is fixed at 1 hour.
     * 
     */
    @Import(name="duration", required=true)
    private String duration;

    /**
     * @return Duration of the maintenance window. The current window is fixed at 1 hour.
     * 
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Start time of the window in UTC time.
     * 
     */
    @Import(name="startTime", required=true)
    private TimeOfDayResponse startTime;

    /**
     * @return Start time of the window in UTC time.
     * 
     */
    public TimeOfDayResponse startTime() {
        return this.startTime;
    }

    private WeeklyMaintenanceWindowResponse() {}

    private WeeklyMaintenanceWindowResponse(WeeklyMaintenanceWindowResponse $) {
        this.day = $.day;
        this.duration = $.duration;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeeklyMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeeklyMaintenanceWindowResponse $;

        public Builder() {
            $ = new WeeklyMaintenanceWindowResponse();
        }

        public Builder(WeeklyMaintenanceWindowResponse defaults) {
            $ = new WeeklyMaintenanceWindowResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param day The day of week that maintenance updates occur.
         * 
         * @return builder
         * 
         */
        public Builder day(String day) {
            $.day = day;
            return this;
        }

        /**
         * @param duration Duration of the maintenance window. The current window is fixed at 1 hour.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param startTime Start time of the window in UTC time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(TimeOfDayResponse startTime) {
            $.startTime = startTime;
            return this;
        }

        public WeeklyMaintenanceWindowResponse build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
