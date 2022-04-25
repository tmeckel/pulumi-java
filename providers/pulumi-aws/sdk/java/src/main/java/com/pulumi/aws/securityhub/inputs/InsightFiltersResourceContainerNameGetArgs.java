// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceContainerNameGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceContainerNameGetArgs Empty = new InsightFiltersResourceContainerNameGetArgs();

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    @Import(name="comparison", required=true)
    private Output<String> comparison;

    /**
     * @return The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    public Output<String> comparison() {
        return this.comparison;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private InsightFiltersResourceContainerNameGetArgs() {}

    private InsightFiltersResourceContainerNameGetArgs(InsightFiltersResourceContainerNameGetArgs $) {
        this.comparison = $.comparison;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersResourceContainerNameGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersResourceContainerNameGetArgs $;

        public Builder() {
            $ = new InsightFiltersResourceContainerNameGetArgs();
        }

        public Builder(InsightFiltersResourceContainerNameGetArgs defaults) {
            $ = new InsightFiltersResourceContainerNameGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparison The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
         * 
         * @return builder
         * 
         */
        public Builder comparison(Output<String> comparison) {
            $.comparison = comparison;
            return this;
        }

        /**
         * @param comparison The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
         * 
         * @return builder
         * 
         */
        public Builder comparison(String comparison) {
            return comparison(Output.of(comparison));
        }

        /**
         * @param value A date range value for the date filter, provided as an Integer.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A date range value for the date filter, provided as an Integer.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public InsightFiltersResourceContainerNameGetArgs build() {
            $.comparison = Objects.requireNonNull($.comparison, "expected parameter 'comparison' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
