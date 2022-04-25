// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementArgs>> statements;

    /**
     * @return The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
