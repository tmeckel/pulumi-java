// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek Empty = new GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek();

    @InputImport(name="day", required=true)
      private final String day;

    public String getDay() {
        return this.day;
    }

    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(
        String day,
        String startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek() {
        this.day = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
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
        public GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(day, startTime);
        }
    }
}
