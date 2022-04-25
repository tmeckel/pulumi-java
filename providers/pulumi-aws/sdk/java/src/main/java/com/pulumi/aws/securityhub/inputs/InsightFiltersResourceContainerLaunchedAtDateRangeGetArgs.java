// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs Empty = new InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs();

    /**
     * A date range unit for the date filter. Valid values: `DAYS`.
     * 
     */
    @Import(name="unit", required=true)
    private Output<String> unit;

    /**
     * @return A date range unit for the date filter. Valid values: `DAYS`.
     * 
     */
    public Output<String> unit() {
        return this.unit;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs() {}

    private InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs(InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs $;

        public Builder() {
            $ = new InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs();
        }

        public Builder(InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs defaults) {
            $ = new InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param unit A date range unit for the date filter. Valid values: `DAYS`.
         * 
         * @return builder
         * 
         */
        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit A date range unit for the date filter. Valid values: `DAYS`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param value A date range value for the date filter, provided as an Integer.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A date range value for the date filter, provided as an Integer.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public InsightFiltersResourceContainerLaunchedAtDateRangeGetArgs build() {
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
