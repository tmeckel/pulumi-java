// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Upcoming maintenance schedule. If no maintenance is scheduled, fields are not populated.
 * 
 */
public final class MaintenanceScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaintenanceScheduleResponse Empty = new MaintenanceScheduleResponse();

    /**
     * If the scheduled maintenance can be rescheduled, default is true.
     * 
     */
    @InputImport(name="canReschedule", required=true)
    private final Boolean canReschedule;

    public Boolean getCanReschedule() {
        return this.canReschedule;
    }

    /**
     * The end time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The deadline that the maintenance schedule start time can not go beyond, including reschedule.
     * 
     */
    @InputImport(name="scheduleDeadlineTime", required=true)
    private final String scheduleDeadlineTime;

    public String getScheduleDeadlineTime() {
        return this.scheduleDeadlineTime;
    }

    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public MaintenanceScheduleResponse(
        Boolean canReschedule,
        String endTime,
        String scheduleDeadlineTime,
        String startTime) {
        this.canReschedule = Objects.requireNonNull(canReschedule, "expected parameter 'canReschedule' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime, "expected parameter 'scheduleDeadlineTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private MaintenanceScheduleResponse() {
        this.canReschedule = null;
        this.endTime = null;
        this.scheduleDeadlineTime = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canReschedule;
        private String endTime;
        private String scheduleDeadlineTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canReschedule = defaults.canReschedule;
    	      this.endTime = defaults.endTime;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setCanReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setScheduleDeadlineTime(String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public MaintenanceScheduleResponse build() {
            return new MaintenanceScheduleResponse(canReschedule, endTime, scheduleDeadlineTime, startTime);
        }
    }
}
