// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.azurenative.storsimple.enums.DayOfWeek;
import com.pulumi.azurenative.storsimple.inputs.TimeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * The schedule for bandwidth setting.
 * 
 */
public final class BandwidthScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthScheduleArgs Empty = new BandwidthScheduleArgs();

    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    @Import(name="days", required=true)
    private Output<List<DayOfWeek>> days;

    /**
     * @return The days of the week when this schedule is applicable.
     * 
     */
    public Output<List<DayOfWeek>> days() {
        return this.days;
    }

    /**
     * The rate in Mbps.
     * 
     */
    @Import(name="rateInMbps", required=true)
    private Output<Integer> rateInMbps;

    /**
     * @return The rate in Mbps.
     * 
     */
    public Output<Integer> rateInMbps() {
        return this.rateInMbps;
    }

    /**
     * The start time of the schedule.
     * 
     */
    @Import(name="start", required=true)
    private Output<TimeArgs> start;

    /**
     * @return The start time of the schedule.
     * 
     */
    public Output<TimeArgs> start() {
        return this.start;
    }

    /**
     * The stop time of the schedule.
     * 
     */
    @Import(name="stop", required=true)
    private Output<TimeArgs> stop;

    /**
     * @return The stop time of the schedule.
     * 
     */
    public Output<TimeArgs> stop() {
        return this.stop;
    }

    private BandwidthScheduleArgs() {}

    private BandwidthScheduleArgs(BandwidthScheduleArgs $) {
        this.days = $.days;
        this.rateInMbps = $.rateInMbps;
        this.start = $.start;
        this.stop = $.stop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthScheduleArgs $;

        public Builder() {
            $ = new BandwidthScheduleArgs();
        }

        public Builder(BandwidthScheduleArgs defaults) {
            $ = new BandwidthScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days The days of the week when this schedule is applicable.
         * 
         * @return builder
         * 
         */
        public Builder days(Output<List<DayOfWeek>> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days The days of the week when this schedule is applicable.
         * 
         * @return builder
         * 
         */
        public Builder days(List<DayOfWeek> days) {
            return days(Output.of(days));
        }

        /**
         * @param days The days of the week when this schedule is applicable.
         * 
         * @return builder
         * 
         */
        public Builder days(DayOfWeek... days) {
            return days(List.of(days));
        }

        /**
         * @param rateInMbps The rate in Mbps.
         * 
         * @return builder
         * 
         */
        public Builder rateInMbps(Output<Integer> rateInMbps) {
            $.rateInMbps = rateInMbps;
            return this;
        }

        /**
         * @param rateInMbps The rate in Mbps.
         * 
         * @return builder
         * 
         */
        public Builder rateInMbps(Integer rateInMbps) {
            return rateInMbps(Output.of(rateInMbps));
        }

        /**
         * @param start The start time of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder start(Output<TimeArgs> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start The start time of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder start(TimeArgs start) {
            return start(Output.of(start));
        }

        /**
         * @param stop The stop time of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder stop(Output<TimeArgs> stop) {
            $.stop = stop;
            return this;
        }

        /**
         * @param stop The stop time of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder stop(TimeArgs stop) {
            return stop(Output.of(stop));
        }

        public BandwidthScheduleArgs build() {
            $.days = Objects.requireNonNull($.days, "expected parameter 'days' to be non-null");
            $.rateInMbps = Objects.requireNonNull($.rateInMbps, "expected parameter 'rateInMbps' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            $.stop = Objects.requireNonNull($.stop, "expected parameter 'stop' to be non-null");
            return $;
        }
    }

}
