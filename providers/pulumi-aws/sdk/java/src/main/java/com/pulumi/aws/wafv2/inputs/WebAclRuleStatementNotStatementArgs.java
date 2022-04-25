// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementArgs Empty = new WebAclRuleStatementNotStatementArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementNotStatementStatementArgs>> statements;

    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementNotStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementNotStatementArgs() {}

    private WebAclRuleStatementNotStatementArgs(WebAclRuleStatementNotStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementArgs();
        }

        public Builder(WebAclRuleStatementNotStatementArgs defaults) {
            $ = new WebAclRuleStatementNotStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementNotStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementNotStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementNotStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementNotStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
