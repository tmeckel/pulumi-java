// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DailyMaintenanceWindowResponse {
    /**
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    private final String duration;
    /**
     * Time within the maintenance window to start the maintenance operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"duration","startTime"})
    private DailyMaintenanceWindowResponse(
        String duration,
        String startTime) {
        this.duration = Objects.requireNonNull(duration);
        this.startTime = Objects.requireNonNull(startTime);
    }

    /**
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    public String getDuration() {
        return this.duration;
    }
    /**
     * Time within the maintenance window to start the maintenance operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DailyMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DailyMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public DailyMaintenanceWindowResponse build() {
            return new DailyMaintenanceWindowResponse(duration, startTime);
        }
    }
}
