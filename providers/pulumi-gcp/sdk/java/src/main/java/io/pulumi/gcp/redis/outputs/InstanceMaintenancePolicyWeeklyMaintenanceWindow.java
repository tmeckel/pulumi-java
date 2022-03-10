// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.redis.outputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceMaintenancePolicyWeeklyMaintenanceWindow {
    /**
     * Required. The day of week that maintenance updates occur.
     * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
     * - MONDAY: Monday
     * - TUESDAY: Tuesday
     * - WEDNESDAY: Wednesday
     * - THURSDAY: Thursday
     * - FRIDAY: Friday
     * - SATURDAY: Saturday
     * - SUNDAY: Sunday
     *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    private final String day;
    /**
     * - 
     * Output only. Duration of the maintenance window.
     * The current window is fixed at 1 hour.
     * A duration in seconds with up to nine fractional digits,
     * terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String duration;
    /**
     * - 
     * Output only. The start time of any upcoming scheduled maintenance for this instance.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    private final InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime startTime;

    @OutputCustomType.Constructor
    private InstanceMaintenancePolicyWeeklyMaintenanceWindow(
        @OutputCustomType.Parameter("day") String day,
        @OutputCustomType.Parameter("duration") @Nullable String duration,
        @OutputCustomType.Parameter("startTime") InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime startTime) {
        this.day = day;
        this.duration = duration;
        this.startTime = startTime;
    }

    /**
     * Required. The day of week that maintenance updates occur.
     * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
     * - MONDAY: Monday
     * - TUESDAY: Tuesday
     * - WEDNESDAY: Wednesday
     * - THURSDAY: Thursday
     * - FRIDAY: Friday
     * - SATURDAY: Saturday
     * - SUNDAY: Sunday
     *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
    */
    public String getDay() {
        return this.day;
    }
    /**
     * - 
     * Output only. Duration of the maintenance window.
     * The current window is fixed at 1 hour.
     * A duration in seconds with up to nine fractional digits,
     * terminated by 's'. Example: "3.5s".
     * 
    */
    public Optional<String> getDuration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * - 
     * Output only. The start time of any upcoming scheduled maintenance for this instance.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
    */
    public InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicyWeeklyMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private @Nullable String duration;
        private InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicyWeeklyMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }

        public Builder startTime(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public InstanceMaintenancePolicyWeeklyMaintenanceWindow build() {
            return new InstanceMaintenancePolicyWeeklyMaintenanceWindow(day, duration, startTime);
        }
    }
}
