// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs>> statements;

    public Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs(Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs() {
        this.statements = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementArgs(statements);
        }
    }
}
