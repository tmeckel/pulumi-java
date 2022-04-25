// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaintenanceWindowResponse {
    /**
     * @return Maintenance window end time. It is used only to calculate the duration of the maintenance window. The value for end-time must be in the future, relative to `start_time`.
     * 
     */
    private final String endTime;
    /**
     * @return Maintenance window recurrence. Format is a subset of [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
     * 
     */
    private final String recurrence;
    /**
     * @return Start time of the first recurrence of the maintenance window.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private MaintenanceWindowResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("recurrence") String recurrence,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.recurrence = recurrence;
        this.startTime = startTime;
    }

    /**
     * @return Maintenance window end time. It is used only to calculate the duration of the maintenance window. The value for end-time must be in the future, relative to `start_time`.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return Maintenance window recurrence. Format is a subset of [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
     * 
     */
    public String recurrence() {
        return this.recurrence;
    }
    /**
     * @return Start time of the first recurrence of the maintenance window.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String recurrence;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder recurrence(String recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(endTime, recurrence, startTime);
        }
    }
}
