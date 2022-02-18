// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyInstanceSchedulePolicyScheduleArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An InstanceSchedulePolicy specifies when and how frequent certain operations are performed on the instance.
 * 
 */
public final class ResourcePolicyInstanceSchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyInstanceSchedulePolicyArgs Empty = new ResourcePolicyInstanceSchedulePolicyArgs();

    /**
     * The expiration time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @InputImport(name="expirationTime")
    private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    @InputImport(name="timeZone")
    private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    /**
     * Specifies the schedule for starting instances.
     * 
     */
    @InputImport(name="vmStartSchedule")
    private final @Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStartSchedule;

    public Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> getVmStartSchedule() {
        return this.vmStartSchedule == null ? Input.empty() : this.vmStartSchedule;
    }

    /**
     * Specifies the schedule for stopping instances.
     * 
     */
    @InputImport(name="vmStopSchedule")
    private final @Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStopSchedule;

    public Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> getVmStopSchedule() {
        return this.vmStopSchedule == null ? Input.empty() : this.vmStopSchedule;
    }

    public ResourcePolicyInstanceSchedulePolicyArgs(
        @Nullable Input<String> expirationTime,
        @Nullable Input<String> startTime,
        @Nullable Input<String> timeZone,
        @Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStartSchedule,
        @Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStopSchedule) {
        this.expirationTime = expirationTime;
        this.startTime = startTime;
        this.timeZone = timeZone;
        this.vmStartSchedule = vmStartSchedule;
        this.vmStopSchedule = vmStopSchedule;
    }

    private ResourcePolicyInstanceSchedulePolicyArgs() {
        this.expirationTime = Input.empty();
        this.startTime = Input.empty();
        this.timeZone = Input.empty();
        this.vmStartSchedule = Input.empty();
        this.vmStopSchedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> timeZone;
        private @Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStartSchedule;
        private @Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStopSchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.vmStartSchedule = defaults.vmStartSchedule;
    	      this.vmStopSchedule = defaults.vmStopSchedule;
        }

        public Builder setExpirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }

        public Builder setVmStartSchedule(@Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStartSchedule) {
            this.vmStartSchedule = vmStartSchedule;
            return this;
        }

        public Builder setVmStartSchedule(@Nullable ResourcePolicyInstanceSchedulePolicyScheduleArgs vmStartSchedule) {
            this.vmStartSchedule = Input.ofNullable(vmStartSchedule);
            return this;
        }

        public Builder setVmStopSchedule(@Nullable Input<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStopSchedule) {
            this.vmStopSchedule = vmStopSchedule;
            return this;
        }

        public Builder setVmStopSchedule(@Nullable ResourcePolicyInstanceSchedulePolicyScheduleArgs vmStopSchedule) {
            this.vmStopSchedule = Input.ofNullable(vmStopSchedule);
            return this;
        }

        public ResourcePolicyInstanceSchedulePolicyArgs build() {
            return new ResourcePolicyInstanceSchedulePolicyArgs(expirationTime, startTime, timeZone, vmStartSchedule, vmStopSchedule);
        }
    }
}
