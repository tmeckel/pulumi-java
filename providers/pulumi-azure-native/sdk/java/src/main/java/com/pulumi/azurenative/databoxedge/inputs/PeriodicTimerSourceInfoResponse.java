// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Periodic timer event source.
 * 
 */
public final class PeriodicTimerSourceInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PeriodicTimerSourceInfoResponse Empty = new PeriodicTimerSourceInfoResponse();

    /**
     * Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     * 
     */
    @Import(name="schedule", required=true)
    private String schedule;

    /**
     * @return Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     * 
     */
    public String schedule() {
        return this.schedule;
    }

    /**
     * The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    /**
     * @return The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Topic where periodic events are published to IoT device.
     * 
     */
    @Import(name="topic")
    private @Nullable String topic;

    /**
     * @return Topic where periodic events are published to IoT device.
     * 
     */
    public Optional<String> topic() {
        return Optional.ofNullable(this.topic);
    }

    private PeriodicTimerSourceInfoResponse() {}

    private PeriodicTimerSourceInfoResponse(PeriodicTimerSourceInfoResponse $) {
        this.schedule = $.schedule;
        this.startTime = $.startTime;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeriodicTimerSourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeriodicTimerSourceInfoResponse $;

        public Builder() {
            $ = new PeriodicTimerSourceInfoResponse();
        }

        public Builder(PeriodicTimerSourceInfoResponse defaults) {
            $ = new PeriodicTimerSourceInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param schedule Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param startTime The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param topic Topic where periodic events are published to IoT device.
         * 
         * @return builder
         * 
         */
        public Builder topic(@Nullable String topic) {
            $.topic = topic;
            return this;
        }

        public PeriodicTimerSourceInfoResponse build() {
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
