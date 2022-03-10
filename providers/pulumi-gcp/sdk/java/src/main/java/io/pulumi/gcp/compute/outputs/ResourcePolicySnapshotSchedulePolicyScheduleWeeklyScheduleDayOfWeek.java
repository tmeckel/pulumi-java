// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek {
    /**
     * The day of the week to create the snapshot. e.g. MONDAY
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    private final String day;
    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor
    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(
        @OutputCustomType.Parameter("day") String day,
        @OutputCustomType.Parameter("startTime") String startTime) {
        this.day = day;
        this.startTime = startTime;
    }

    /**
     * The day of the week to create the snapshot. e.g. MONDAY
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
    */
    public String getDay() {
        return this.day;
    }
    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(day, startTime);
        }
    }
}
