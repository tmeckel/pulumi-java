// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGetArgs>> statements;

    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGetArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs() {}

    private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs();
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs defaults) {
            $ = new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGetArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGetArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementGetArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
