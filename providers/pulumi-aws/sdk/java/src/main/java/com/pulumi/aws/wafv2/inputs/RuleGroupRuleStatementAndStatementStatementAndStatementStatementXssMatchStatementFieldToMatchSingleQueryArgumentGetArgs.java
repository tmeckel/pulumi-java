// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs();

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs() {}

    private RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs(RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs();
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs defaults) {
            $ = new RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
