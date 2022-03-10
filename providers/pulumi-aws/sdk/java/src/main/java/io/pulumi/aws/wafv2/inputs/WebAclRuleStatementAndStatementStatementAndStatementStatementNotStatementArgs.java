// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementArgs>> statements;

    public Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs(Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementArgs(statements);
        }
    }
}
