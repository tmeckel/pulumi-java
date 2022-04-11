// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyScalingScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyScalingScheduleGetArgs Empty = new AutoscalerAutoscalingPolicyScalingScheduleGetArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    @Import(name="durationSec", required=true)
      private final Output<Integer> durationSec;

    public Output<Integer> getDurationSec() {
        return this.durationSec;
    }

    /**
     * Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    @Import(name="minRequiredReplicas", required=true)
      private final Output<Integer> minRequiredReplicas;

    public Output<Integer> getMinRequiredReplicas() {
        return this.minRequiredReplicas;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule;
    }

    /**
     * The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    public AutoscalerAutoscalingPolicyScalingScheduleGetArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        Output<Integer> durationSec,
        Output<Integer> minRequiredReplicas,
        Output<String> name,
        Output<String> schedule,
        @Nullable Output<String> timeZone) {
        this.description = description;
        this.disabled = disabled;
        this.durationSec = Objects.requireNonNull(durationSec, "expected parameter 'durationSec' to be non-null");
        this.minRequiredReplicas = Objects.requireNonNull(minRequiredReplicas, "expected parameter 'minRequiredReplicas' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.timeZone = timeZone;
    }

    private AutoscalerAutoscalingPolicyScalingScheduleGetArgs() {
        this.description = Codegen.empty();
        this.disabled = Codegen.empty();
        this.durationSec = Codegen.empty();
        this.minRequiredReplicas = Codegen.empty();
        this.name = Codegen.empty();
        this.schedule = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScalingScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private Output<Integer> durationSec;
        private Output<Integer> minRequiredReplicas;
        private Output<String> name;
        private Output<String> schedule;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScalingScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.durationSec = defaults.durationSec;
    	      this.minRequiredReplicas = defaults.minRequiredReplicas;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder durationSec(Output<Integer> durationSec) {
            this.durationSec = Objects.requireNonNull(durationSec);
            return this;
        }
        public Builder durationSec(Integer durationSec) {
            this.durationSec = Output.of(Objects.requireNonNull(durationSec));
            return this;
        }
        public Builder minRequiredReplicas(Output<Integer> minRequiredReplicas) {
            this.minRequiredReplicas = Objects.requireNonNull(minRequiredReplicas);
            return this;
        }
        public Builder minRequiredReplicas(Integer minRequiredReplicas) {
            this.minRequiredReplicas = Output.of(Objects.requireNonNull(minRequiredReplicas));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder schedule(Output<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }        public AutoscalerAutoscalingPolicyScalingScheduleGetArgs build() {
            return new AutoscalerAutoscalingPolicyScalingScheduleGetArgs(description, disabled, durationSec, minRequiredReplicas, name, schedule, timeZone);
        }
    }
}
