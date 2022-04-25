// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleState extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleState Empty = new ScheduleState();

    /**
     * The ARN assigned by AWS to the autoscaling schedule.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN assigned by AWS to the autoscaling schedule.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * 
     */
    @Import(name="autoscalingGroupName")
    private @Nullable Output<String> autoscalingGroupName;

    /**
     * @return The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * 
     */
    public Optional<Output<String>> autoscalingGroupName() {
        return Optional.ofNullable(this.autoscalingGroupName);
    }

    /**
     * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don&#39;t want to change the desired capacity at the scheduled time.
     * 
     */
    @Import(name="desiredCapacity")
    private @Nullable Output<Integer> desiredCapacity;

    /**
     * @return The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don&#39;t want to change the desired capacity at the scheduled time.
     * 
     */
    public Optional<Output<Integer>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    /**
     * The time for this action to end, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The time for this action to end, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The maximum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don&#39;t want to change the maximum size at the scheduled time.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return The maximum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don&#39;t want to change the maximum size at the scheduled time.
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * The minimum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don&#39;t want to change the minimum size at the scheduled time.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return The minimum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don&#39;t want to change the minimum size at the scheduled time.
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<String> recurrence;

    /**
     * @return The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
     * 
     */
    public Optional<Output<String>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    /**
     * The name of this scaling action.
     * 
     */
    @Import(name="scheduledActionName")
    private @Nullable Output<String> scheduledActionName;

    /**
     * @return The name of this scaling action.
     * 
     */
    public Optional<Output<String>> scheduledActionName() {
        return Optional.ofNullable(this.scheduledActionName);
    }

    /**
     * The time for this action to start, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The time for this action to start, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The timezone for the cron expression. Valid values are the canonical names of the IANA time zones (such as Etc/GMT+9 or Pacific/Tahiti).
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The timezone for the cron expression. Valid values are the canonical names of the IANA time zones (such as Etc/GMT+9 or Pacific/Tahiti).
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private ScheduleState() {}

    private ScheduleState(ScheduleState $) {
        this.arn = $.arn;
        this.autoscalingGroupName = $.autoscalingGroupName;
        this.desiredCapacity = $.desiredCapacity;
        this.endTime = $.endTime;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.recurrence = $.recurrence;
        this.scheduledActionName = $.scheduledActionName;
        this.startTime = $.startTime;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleState $;

        public Builder() {
            $ = new ScheduleState();
        }

        public Builder(ScheduleState defaults) {
            $ = new ScheduleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN assigned by AWS to the autoscaling schedule.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN assigned by AWS to the autoscaling schedule.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param autoscalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingGroupName(@Nullable Output<String> autoscalingGroupName) {
            $.autoscalingGroupName = autoscalingGroupName;
            return this;
        }

        /**
         * @param autoscalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingGroupName(String autoscalingGroupName) {
            return autoscalingGroupName(Output.of(autoscalingGroupName));
        }

        /**
         * @param desiredCapacity The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don&#39;t want to change the desired capacity at the scheduled time.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * @param desiredCapacity The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don&#39;t want to change the desired capacity at the scheduled time.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        /**
         * @param endTime The time for this action to end, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
         * If you try to schedule your action in the past, Auto Scaling returns an error message.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The time for this action to end, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
         * If you try to schedule your action in the past, Auto Scaling returns an error message.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param maxSize The maximum size for the Auto Scaling group. Default 0.
         * Set to -1 if you don&#39;t want to change the maximum size at the scheduled time.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize The maximum size for the Auto Scaling group. Default 0.
         * Set to -1 if you don&#39;t want to change the maximum size at the scheduled time.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize The minimum size for the Auto Scaling group. Default 0.
         * Set to -1 if you don&#39;t want to change the minimum size at the scheduled time.
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize The minimum size for the Auto Scaling group. Default 0.
         * Set to -1 if you don&#39;t want to change the minimum size at the scheduled time.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param recurrence The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(@Nullable Output<String> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        /**
         * @param recurrence The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(String recurrence) {
            return recurrence(Output.of(recurrence));
        }

        /**
         * @param scheduledActionName The name of this scaling action.
         * 
         * @return builder
         * 
         */
        public Builder scheduledActionName(@Nullable Output<String> scheduledActionName) {
            $.scheduledActionName = scheduledActionName;
            return this;
        }

        /**
         * @param scheduledActionName The name of this scaling action.
         * 
         * @return builder
         * 
         */
        public Builder scheduledActionName(String scheduledActionName) {
            return scheduledActionName(Output.of(scheduledActionName));
        }

        /**
         * @param startTime The time for this action to start, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
         * If you try to schedule your action in the past, Auto Scaling returns an error message.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The time for this action to start, in &#34;YYYY-MM-DDThh:mm:ssZ&#34; format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
         * If you try to schedule your action in the past, Auto Scaling returns an error message.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timeZone The timezone for the cron expression. Valid values are the canonical names of the IANA time zones (such as Etc/GMT+9 or Pacific/Tahiti).
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The timezone for the cron expression. Valid values are the canonical names of the IANA time zones (such as Etc/GMT+9 or Pacific/Tahiti).
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public ScheduleState build() {
            return $;
        }
    }

}
