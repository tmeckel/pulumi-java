// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs();

    /**
     * The number of days between snapshots.
     * 
     */
    @Import(name="daysInCycle", required=true)
      private final Output<Integer> daysInCycle;

    public Output<Integer> getDaysInCycle() {
        return this.daysInCycle;
    }

    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs(
        Output<Integer> daysInCycle,
        Output<String> startTime) {
        this.daysInCycle = Objects.requireNonNull(daysInCycle, "expected parameter 'daysInCycle' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs() {
        this.daysInCycle = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> daysInCycle;
        private Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder daysInCycle(Output<Integer> daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }
        public Builder daysInCycle(Integer daysInCycle) {
            this.daysInCycle = Output.of(Objects.requireNonNull(daysInCycle));
            return this;
        }
        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs(daysInCycle, startTime);
        }
    }
}
