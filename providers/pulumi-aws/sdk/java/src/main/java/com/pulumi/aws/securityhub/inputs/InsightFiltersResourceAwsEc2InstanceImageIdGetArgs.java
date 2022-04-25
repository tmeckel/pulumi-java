// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceAwsEc2InstanceImageIdGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceAwsEc2InstanceImageIdGetArgs Empty = new InsightFiltersResourceAwsEc2InstanceImageIdGetArgs();

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

    private InsightFiltersResourceAwsEc2InstanceImageIdGetArgs() {}

    private InsightFiltersResourceAwsEc2InstanceImageIdGetArgs(InsightFiltersResourceAwsEc2InstanceImageIdGetArgs $) {
        this.comparison = $.comparison;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersResourceAwsEc2InstanceImageIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersResourceAwsEc2InstanceImageIdGetArgs $;

        public Builder() {
            $ = new InsightFiltersResourceAwsEc2InstanceImageIdGetArgs();
        }

        public Builder(InsightFiltersResourceAwsEc2InstanceImageIdGetArgs defaults) {
            $ = new InsightFiltersResourceAwsEc2InstanceImageIdGetArgs(Objects.requireNonNull(defaults));
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

        public InsightFiltersResourceAwsEc2InstanceImageIdGetArgs build() {
            $.comparison = Objects.requireNonNull($.comparison, "expected parameter 'comparison' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
