// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementStatementOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementOrStatementArgs Empty = new RuleGroupRuleStatementAndStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementArgs>> statements;

    public Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public RuleGroupRuleStatementAndStatementStatementOrStatementArgs(Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private RuleGroupRuleStatementAndStatementStatementOrStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementOrStatementArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementOrStatementArgs(statements);
        }
    }
}
