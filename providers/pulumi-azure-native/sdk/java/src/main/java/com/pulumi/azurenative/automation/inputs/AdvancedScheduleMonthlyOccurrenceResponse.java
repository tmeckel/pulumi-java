// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the create advanced schedule monthly occurrence.
 * 
 */
public final class AdvancedScheduleMonthlyOccurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdvancedScheduleMonthlyOccurrenceResponse Empty = new AdvancedScheduleMonthlyOccurrenceResponse();

    /**
     * Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    @Import(name="day")
    private @Nullable String day;

    /**
     * @return Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    public Optional<String> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * Occurrence of the week within the month. Must be between 1 and 5
     * 
     */
    @Import(name="occurrence")
    private @Nullable Integer occurrence;

    /**
     * @return Occurrence of the week within the month. Must be between 1 and 5
     * 
     */
    public Optional<Integer> occurrence() {
        return Optional.ofNullable(this.occurrence);
    }

    private AdvancedScheduleMonthlyOccurrenceResponse() {}

    private AdvancedScheduleMonthlyOccurrenceResponse(AdvancedScheduleMonthlyOccurrenceResponse $) {
        this.day = $.day;
        this.occurrence = $.occurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdvancedScheduleMonthlyOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedScheduleMonthlyOccurrenceResponse $;

        public Builder() {
            $ = new AdvancedScheduleMonthlyOccurrenceResponse();
        }

        public Builder(AdvancedScheduleMonthlyOccurrenceResponse defaults) {
            $ = new AdvancedScheduleMonthlyOccurrenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
         * 
         * @return builder
         * 
         */
        public Builder day(@Nullable String day) {
            $.day = day;
            return this;
        }

        /**
         * @param occurrence Occurrence of the week within the month. Must be between 1 and 5
         * 
         * @return builder
         * 
         */
        public Builder occurrence(@Nullable Integer occurrence) {
            $.occurrence = occurrence;
            return this;
        }

        public AdvancedScheduleMonthlyOccurrenceResponse build() {
            return $;
        }
    }

}
