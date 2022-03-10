// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs Empty = new WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs>> statements;

    public Input<List<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs(Input<List<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Input<List<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs(statements);
        }
    }
}
