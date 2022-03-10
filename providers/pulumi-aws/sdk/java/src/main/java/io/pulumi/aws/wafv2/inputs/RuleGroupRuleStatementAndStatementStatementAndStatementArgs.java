// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementAndStatementStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementStatementAndStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementAndStatementArgs Empty = new RuleGroupRuleStatementAndStatementStatementAndStatementArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementArgs>> statements;

    public Input<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public RuleGroupRuleStatementAndStatementStatementAndStatementArgs(Input<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private RuleGroupRuleStatementAndStatementStatementAndStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementAndStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Input<List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementAndStatementArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementAndStatementArgs(statements);
        }
    }
}
