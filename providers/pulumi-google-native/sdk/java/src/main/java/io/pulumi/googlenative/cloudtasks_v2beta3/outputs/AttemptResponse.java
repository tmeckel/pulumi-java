// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudtasks_v2beta3.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AttemptResponse {
    /**
     * The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
     * 
     */
    private final String dispatchTime;
    /**
     * The response from the worker for this attempt. If `response_time` is unset, then the task has not been attempted or is currently running and the `response_status` field is meaningless.
     * 
     */
    private final StatusResponse responseStatus;
    /**
     * The time that this attempt response was received. `response_time` will be truncated to the nearest microsecond.
     * 
     */
    private final String responseTime;
    /**
     * The time that this attempt was scheduled. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    private final String scheduleTime;

    @OutputCustomType.Constructor({"dispatchTime","responseStatus","responseTime","scheduleTime"})
    private AttemptResponse(
        String dispatchTime,
        StatusResponse responseStatus,
        String responseTime,
        String scheduleTime) {
        this.dispatchTime = Objects.requireNonNull(dispatchTime);
        this.responseStatus = Objects.requireNonNull(responseStatus);
        this.responseTime = Objects.requireNonNull(responseTime);
        this.scheduleTime = Objects.requireNonNull(scheduleTime);
    }

    /**
     * The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
     * 
     */
    public String getDispatchTime() {
        return this.dispatchTime;
    }
    /**
     * The response from the worker for this attempt. If `response_time` is unset, then the task has not been attempted or is currently running and the `response_status` field is meaningless.
     * 
     */
    public StatusResponse getResponseStatus() {
        return this.responseStatus;
    }
    /**
     * The time that this attempt response was received. `response_time` will be truncated to the nearest microsecond.
     * 
     */
    public String getResponseTime() {
        return this.responseTime;
    }
    /**
     * The time that this attempt was scheduled. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttemptResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dispatchTime;
        private StatusResponse responseStatus;
        private String responseTime;
        private String scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AttemptResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dispatchTime = defaults.dispatchTime;
    	      this.responseStatus = defaults.responseStatus;
    	      this.responseTime = defaults.responseTime;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder setDispatchTime(String dispatchTime) {
            this.dispatchTime = Objects.requireNonNull(dispatchTime);
            return this;
        }

        public Builder setResponseStatus(StatusResponse responseStatus) {
            this.responseStatus = Objects.requireNonNull(responseStatus);
            return this;
        }

        public Builder setResponseTime(String responseTime) {
            this.responseTime = Objects.requireNonNull(responseTime);
            return this;
        }

        public Builder setScheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }

        public AttemptResponse build() {
            return new AttemptResponse(dispatchTime, responseStatus, responseTime, scheduleTime);
        }
    }
}
