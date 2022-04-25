// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudsearch_v1.inputs.ValueArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ValueFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValueFilterArgs Empty = new ValueFilterArgs();

    /**
     * The `operator_name` applied to the query, such as *price_greater_than*. The filter can work against both types of filters defined in the schema for your data source: 1. `operator_name`, where the query filters results by the property that matches the value. 2. `greater_than_operator_name` or `less_than_operator_name` in your schema. The query filters the results for the property values that are greater than or less than the supplied value in the query.
     * 
     */
    @Import(name="operatorName")
    private @Nullable Output<String> operatorName;

    /**
     * @return The `operator_name` applied to the query, such as *price_greater_than*. The filter can work against both types of filters defined in the schema for your data source: 1. `operator_name`, where the query filters results by the property that matches the value. 2. `greater_than_operator_name` or `less_than_operator_name` in your schema. The query filters the results for the property values that are greater than or less than the supplied value in the query.
     * 
     */
    public Optional<Output<String>> operatorName() {
        return Optional.ofNullable(this.operatorName);
    }

    /**
     * The value to be compared with.
     * 
     */
    @Import(name="value")
    private @Nullable Output<ValueArgs> value;

    /**
     * @return The value to be compared with.
     * 
     */
    public Optional<Output<ValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private ValueFilterArgs() {}

    private ValueFilterArgs(ValueFilterArgs $) {
        this.operatorName = $.operatorName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValueFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValueFilterArgs $;

        public Builder() {
            $ = new ValueFilterArgs();
        }

        public Builder(ValueFilterArgs defaults) {
            $ = new ValueFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operatorName The `operator_name` applied to the query, such as *price_greater_than*. The filter can work against both types of filters defined in the schema for your data source: 1. `operator_name`, where the query filters results by the property that matches the value. 2. `greater_than_operator_name` or `less_than_operator_name` in your schema. The query filters the results for the property values that are greater than or less than the supplied value in the query.
         * 
         * @return builder
         * 
         */
        public Builder operatorName(@Nullable Output<String> operatorName) {
            $.operatorName = operatorName;
            return this;
        }

        /**
         * @param operatorName The `operator_name` applied to the query, such as *price_greater_than*. The filter can work against both types of filters defined in the schema for your data source: 1. `operator_name`, where the query filters results by the property that matches the value. 2. `greater_than_operator_name` or `less_than_operator_name` in your schema. The query filters the results for the property values that are greater than or less than the supplied value in the query.
         * 
         * @return builder
         * 
         */
        public Builder operatorName(String operatorName) {
            return operatorName(Output.of(operatorName));
        }

        /**
         * @param value The value to be compared with.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<ValueArgs> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to be compared with.
         * 
         * @return builder
         * 
         */
        public Builder value(ValueArgs value) {
            return value(Output.of(value));
        }

        public ValueFilterArgs build() {
            return $;
        }
    }

}
