// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementAndStatementStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementGetArgs>> statements;

    /**
     * @return The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementGetArgs>> statements() {
        return this.statements;
    }

    private RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs() {}

    private RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs(RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs();
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs defaults) {
            $ = new RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementGetArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementGetArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(RuleGroupRuleStatementAndStatementStatementAndStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }

        public RuleGroupRuleStatementAndStatementStatementAndStatementGetArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
