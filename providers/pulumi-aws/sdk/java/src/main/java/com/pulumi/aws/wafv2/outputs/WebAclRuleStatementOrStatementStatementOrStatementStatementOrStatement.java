// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatement {
    /**
     * @return The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * @return The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatement build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatement(statements);
        }
    }
}
