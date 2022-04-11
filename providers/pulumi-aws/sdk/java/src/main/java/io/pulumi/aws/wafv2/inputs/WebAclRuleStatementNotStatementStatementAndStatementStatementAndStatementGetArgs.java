// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs() {
        this.statements = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementGetArgs(statements);
        }
    }
}
