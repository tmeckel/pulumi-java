// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Weekly retention format.
 * 
 */
public final class WeeklyRetentionFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final WeeklyRetentionFormatResponse Empty = new WeeklyRetentionFormatResponse();

    /**
     * List of days of the week.
     * 
     */
    @Import(name="daysOfTheWeek")
    private @Nullable List<String> daysOfTheWeek;

    /**
     * @return List of days of the week.
     * 
     */
    public Optional<List<String>> daysOfTheWeek() {
        return Optional.ofNullable(this.daysOfTheWeek);
    }

    /**
     * List of weeks of month.
     * 
     */
    @Import(name="weeksOfTheMonth")
    private @Nullable List<String> weeksOfTheMonth;

    /**
     * @return List of weeks of month.
     * 
     */
    public Optional<List<String>> weeksOfTheMonth() {
        return Optional.ofNullable(this.weeksOfTheMonth);
    }

    private WeeklyRetentionFormatResponse() {}

    private WeeklyRetentionFormatResponse(WeeklyRetentionFormatResponse $) {
        this.daysOfTheWeek = $.daysOfTheWeek;
        this.weeksOfTheMonth = $.weeksOfTheMonth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeeklyRetentionFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeeklyRetentionFormatResponse $;

        public Builder() {
            $ = new WeeklyRetentionFormatResponse();
        }

        public Builder(WeeklyRetentionFormatResponse defaults) {
            $ = new WeeklyRetentionFormatResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfTheWeek List of days of the week.
         * 
         * @return builder
         * 
         */
        public Builder daysOfTheWeek(@Nullable List<String> daysOfTheWeek) {
            $.daysOfTheWeek = daysOfTheWeek;
            return this;
        }

        /**
         * @param daysOfTheWeek List of days of the week.
         * 
         * @return builder
         * 
         */
        public Builder daysOfTheWeek(String... daysOfTheWeek) {
            return daysOfTheWeek(List.of(daysOfTheWeek));
        }

        /**
         * @param weeksOfTheMonth List of weeks of month.
         * 
         * @return builder
         * 
         */
        public Builder weeksOfTheMonth(@Nullable List<String> weeksOfTheMonth) {
            $.weeksOfTheMonth = weeksOfTheMonth;
            return this;
        }

        /**
         * @param weeksOfTheMonth List of weeks of month.
         * 
         * @return builder
         * 
         */
        public Builder weeksOfTheMonth(String... weeksOfTheMonth) {
            return weeksOfTheMonth(List.of(weeksOfTheMonth));
        }

        public WeeklyRetentionFormatResponse build() {
            return $;
        }
    }

}
