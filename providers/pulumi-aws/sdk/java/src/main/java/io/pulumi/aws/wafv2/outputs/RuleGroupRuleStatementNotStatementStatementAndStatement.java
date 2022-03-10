// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleStatementNotStatementStatementAndStatement {
    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<RuleGroupRuleStatementNotStatementStatementAndStatementStatement> statements;

    @OutputCustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementAndStatement(@OutputCustomType.Parameter("statements") List<RuleGroupRuleStatementNotStatementStatementAndStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
    */
    public List<RuleGroupRuleStatementNotStatementStatementAndStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleStatementNotStatementStatementAndStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<RuleGroupRuleStatementNotStatementStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementAndStatement build() {
            return new RuleGroupRuleStatementNotStatementStatementAndStatement(statements);
        }
    }
}
