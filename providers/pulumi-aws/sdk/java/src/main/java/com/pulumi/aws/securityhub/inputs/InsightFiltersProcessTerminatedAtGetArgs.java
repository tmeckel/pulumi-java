// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtDateRangeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InsightFiltersProcessTerminatedAtGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersProcessTerminatedAtGetArgs Empty = new InsightFiltersProcessTerminatedAtGetArgs();

    /**
     * A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    @Import(name="dateRange")
    private @Nullable Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs> dateRange;

    /**
     * @return A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    public Optional<Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs>> dateRange() {
        return Optional.ofNullable(this.dateRange);
    }

    /**
     * An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    @Import(name="end")
    private @Nullable Output<String> end;

    /**
     * @return An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    /**
     * @return A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private InsightFiltersProcessTerminatedAtGetArgs() {}

    private InsightFiltersProcessTerminatedAtGetArgs(InsightFiltersProcessTerminatedAtGetArgs $) {
        this.dateRange = $.dateRange;
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersProcessTerminatedAtGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersProcessTerminatedAtGetArgs $;

        public Builder() {
            $ = new InsightFiltersProcessTerminatedAtGetArgs();
        }

        public Builder(InsightFiltersProcessTerminatedAtGetArgs defaults) {
            $ = new InsightFiltersProcessTerminatedAtGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dateRange A configuration block of the date range for the date filter. See date_range below for more details.
         * 
         * @return builder
         * 
         */
        public Builder dateRange(@Nullable Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs> dateRange) {
            $.dateRange = dateRange;
            return this;
        }

        /**
         * @param dateRange A configuration block of the date range for the date filter. See date_range below for more details.
         * 
         * @return builder
         * 
         */
        public Builder dateRange(InsightFiltersProcessTerminatedAtDateRangeGetArgs dateRange) {
            return dateRange(Output.of(dateRange));
        }

        /**
         * @param end An end date for the date filter. Required with `start` if `date_range` is not specified.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end An end date for the date filter. Required with `start` if `date_range` is not specified.
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            return end(Output.of(end));
        }

        /**
         * @param start A start date for the date filter. Required with `end` if `date_range` is not specified.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start A start date for the date filter. Required with `end` if `date_range` is not specified.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            return start(Output.of(start));
        }

        public InsightFiltersProcessTerminatedAtGetArgs build() {
            return $;
        }
    }

}
