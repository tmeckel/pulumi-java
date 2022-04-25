// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The KPI alias.
 * 
 */
public final class KpiAliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final KpiAliasArgs Empty = new KpiAliasArgs();

    /**
     * KPI alias name.
     * 
     */
    @Import(name="aliasName", required=true)
    private Output<String> aliasName;

    /**
     * @return KPI alias name.
     * 
     */
    public Output<String> aliasName() {
        return this.aliasName;
    }

    /**
     * The expression.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The expression.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    private KpiAliasArgs() {}

    private KpiAliasArgs(KpiAliasArgs $) {
        this.aliasName = $.aliasName;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KpiAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KpiAliasArgs $;

        public Builder() {
            $ = new KpiAliasArgs();
        }

        public Builder(KpiAliasArgs defaults) {
            $ = new KpiAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasName KPI alias name.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(Output<String> aliasName) {
            $.aliasName = aliasName;
            return this;
        }

        /**
         * @param aliasName KPI alias name.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(String aliasName) {
            return aliasName(Output.of(aliasName));
        }

        /**
         * @param expression The expression.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The expression.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public KpiAliasArgs build() {
            $.aliasName = Objects.requireNonNull($.aliasName, "expected parameter 'aliasName' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
