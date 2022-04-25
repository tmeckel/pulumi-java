// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyInstanceSchedulePolicyScheduleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An InstanceSchedulePolicy specifies when and how frequent certain operations are performed on the instance.
 * 
 */
public final class ResourcePolicyInstanceSchedulePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyInstanceSchedulePolicyArgs Empty = new ResourcePolicyInstanceSchedulePolicyArgs();

    /**
     * The expiration time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return The expiration time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * Specifies the schedule for starting instances.
     * 
     */
    @Import(name="vmStartSchedule")
    private @Nullable Output<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStartSchedule;

    /**
     * @return Specifies the schedule for starting instances.
     * 
     */
    public Optional<Output<ResourcePolicyInstanceSchedulePolicyScheduleArgs>> vmStartSchedule() {
        return Optional.ofNullable(this.vmStartSchedule);
    }

    /**
     * Specifies the schedule for stopping instances.
     * 
     */
    @Import(name="vmStopSchedule")
    private @Nullable Output<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStopSchedule;

    /**
     * @return Specifies the schedule for stopping instances.
     * 
     */
    public Optional<Output<ResourcePolicyInstanceSchedulePolicyScheduleArgs>> vmStopSchedule() {
        return Optional.ofNullable(this.vmStopSchedule);
    }

    private ResourcePolicyInstanceSchedulePolicyArgs() {}

    private ResourcePolicyInstanceSchedulePolicyArgs(ResourcePolicyInstanceSchedulePolicyArgs $) {
        this.expirationTime = $.expirationTime;
        this.startTime = $.startTime;
        this.timeZone = $.timeZone;
        this.vmStartSchedule = $.vmStartSchedule;
        this.vmStopSchedule = $.vmStopSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyInstanceSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyInstanceSchedulePolicyArgs $;

        public Builder() {
            $ = new ResourcePolicyInstanceSchedulePolicyArgs();
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyArgs defaults) {
            $ = new ResourcePolicyInstanceSchedulePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationTime The expiration time of the schedule. The timestamp is an RFC3339 string.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime The expiration time of the schedule. The timestamp is an RFC3339 string.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param startTime The start time of the schedule. The timestamp is an RFC3339 string.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time of the schedule. The timestamp is an RFC3339 string.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timeZone Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        /**
         * @param vmStartSchedule Specifies the schedule for starting instances.
         * 
         * @return builder
         * 
         */
        public Builder vmStartSchedule(@Nullable Output<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStartSchedule) {
            $.vmStartSchedule = vmStartSchedule;
            return this;
        }

        /**
         * @param vmStartSchedule Specifies the schedule for starting instances.
         * 
         * @return builder
         * 
         */
        public Builder vmStartSchedule(ResourcePolicyInstanceSchedulePolicyScheduleArgs vmStartSchedule) {
            return vmStartSchedule(Output.of(vmStartSchedule));
        }

        /**
         * @param vmStopSchedule Specifies the schedule for stopping instances.
         * 
         * @return builder
         * 
         */
        public Builder vmStopSchedule(@Nullable Output<ResourcePolicyInstanceSchedulePolicyScheduleArgs> vmStopSchedule) {
            $.vmStopSchedule = vmStopSchedule;
            return this;
        }

        /**
         * @param vmStopSchedule Specifies the schedule for stopping instances.
         * 
         * @return builder
         * 
         */
        public Builder vmStopSchedule(ResourcePolicyInstanceSchedulePolicyScheduleArgs vmStopSchedule) {
            return vmStopSchedule(Output.of(vmStopSchedule));
        }

        public ResourcePolicyInstanceSchedulePolicyArgs build() {
            return $;
        }
    }

}
