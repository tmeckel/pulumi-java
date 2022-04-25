// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The comparison expression to be used in the budgets.
 * 
 */
public final class BudgetComparisonExpressionResponse extends com.pulumi.resources.InvokeArgs {

    public static final BudgetComparisonExpressionResponse Empty = new BudgetComparisonExpressionResponse();

    /**
     * The name of the column to use in comparison.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the column to use in comparison.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The operator to use for comparison.
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    /**
     * @return The operator to use for comparison.
     * 
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Array of values to use for comparison
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Array of values to use for comparison
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private BudgetComparisonExpressionResponse() {}

    private BudgetComparisonExpressionResponse(BudgetComparisonExpressionResponse $) {
        this.name = $.name;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetComparisonExpressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetComparisonExpressionResponse $;

        public Builder() {
            $ = new BudgetComparisonExpressionResponse();
        }

        public Builder(BudgetComparisonExpressionResponse defaults) {
            $ = new BudgetComparisonExpressionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the column to use in comparison.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param operator The operator to use for comparison.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param values Array of values to use for comparison
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Array of values to use for comparison
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public BudgetComparisonExpressionResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
