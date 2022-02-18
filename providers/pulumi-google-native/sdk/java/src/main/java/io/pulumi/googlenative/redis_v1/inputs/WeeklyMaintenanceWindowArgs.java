// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.redis_v1.enums.WeeklyMaintenanceWindowDay;
import io.pulumi.googlenative.redis_v1.inputs.TimeOfDayArgs;
import java.util.Objects;


/**
 * Time window in which disruptive maintenance updates occur. Non-disruptive updates can occur inside or outside this window.
 * 
 */
public final class WeeklyMaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WeeklyMaintenanceWindowArgs Empty = new WeeklyMaintenanceWindowArgs();

    /**
     * The day of week that maintenance updates occur.
     * 
     */
    @InputImport(name="day", required=true)
    private final Input<WeeklyMaintenanceWindowDay> day;

    public Input<WeeklyMaintenanceWindowDay> getDay() {
        return this.day;
    }

    /**
     * Start time of the window in UTC time.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final Input<TimeOfDayArgs> startTime;

    public Input<TimeOfDayArgs> getStartTime() {
        return this.startTime;
    }

    public WeeklyMaintenanceWindowArgs(
        Input<WeeklyMaintenanceWindowDay> day,
        Input<TimeOfDayArgs> startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private WeeklyMaintenanceWindowArgs() {
        this.day = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<WeeklyMaintenanceWindowDay> day;
        private Input<TimeOfDayArgs> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyMaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDay(Input<WeeklyMaintenanceWindowDay> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setDay(WeeklyMaintenanceWindowDay day) {
            this.day = Input.of(Objects.requireNonNull(day));
            return this;
        }

        public Builder setStartTime(Input<TimeOfDayArgs> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStartTime(TimeOfDayArgs startTime) {
            this.startTime = Input.of(Objects.requireNonNull(startTime));
            return this;
        }

        public WeeklyMaintenanceWindowArgs build() {
            return new WeeklyMaintenanceWindowArgs(day, startTime);
        }
    }
}
