// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NumberNotIn Advanced Filter.
 * 
 */
public final class NumberNotInAdvancedFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final NumberNotInAdvancedFilterArgs Empty = new NumberNotInAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;NumberNotIn&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private Output<String> operatorType;

    /**
     * @return The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;NumberNotIn&#39;.
     * 
     */
    public Output<String> operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<Double>> values;

    /**
     * @return The set of filter values.
     * 
     */
    public Optional<Output<List<Double>>> values() {
        return Optional.ofNullable(this.values);
    }

    private NumberNotInAdvancedFilterArgs() {}

    private NumberNotInAdvancedFilterArgs(NumberNotInAdvancedFilterArgs $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NumberNotInAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NumberNotInAdvancedFilterArgs $;

        public Builder() {
            $ = new NumberNotInAdvancedFilterArgs();
        }

        public Builder(NumberNotInAdvancedFilterArgs defaults) {
            $ = new NumberNotInAdvancedFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;NumberNotIn&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(Output<String> operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;NumberNotIn&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(String operatorType) {
            return operatorType(Output.of(operatorType));
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<Double>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(List<Double> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(Double... values) {
            return values(List.of(values));
        }

        public NumberNotInAdvancedFilterArgs build() {
            $.operatorType = Codegen.stringProp("operatorType").output().arg($.operatorType).require();
            return $;
        }
    }

}
