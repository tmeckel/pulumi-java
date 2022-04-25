// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.RecurrentScheduleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The repeating times at which this profile begins. This element is not used if the FixedDate element is used.
 * 
 */
public final class RecurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecurrenceResponse Empty = new RecurrenceResponse();

    /**
     * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    @Import(name="frequency", required=true)
    private String frequency;

    /**
     * @return the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    public String frequency() {
        return this.frequency;
    }

    /**
     * the scheduling constraints for when the profile begins.
     * 
     */
    @Import(name="schedule", required=true)
    private RecurrentScheduleResponse schedule;

    /**
     * @return the scheduling constraints for when the profile begins.
     * 
     */
    public RecurrentScheduleResponse schedule() {
        return this.schedule;
    }

    private RecurrenceResponse() {}

    private RecurrenceResponse(RecurrenceResponse $) {
        this.frequency = $.frequency;
        this.schedule = $.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecurrenceResponse $;

        public Builder() {
            $ = new RecurrenceResponse();
        }

        public Builder(RecurrenceResponse defaults) {
            $ = new RecurrenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequency the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
         * 
         * @return builder
         * 
         */
        public Builder frequency(String frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param schedule the scheduling constraints for when the profile begins.
         * 
         * @return builder
         * 
         */
        public Builder schedule(RecurrentScheduleResponse schedule) {
            $.schedule = schedule;
            return this;
        }

        public RecurrenceResponse build() {
            $.frequency = Objects.requireNonNull($.frequency, "expected parameter 'frequency' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            return $;
        }
    }

}
