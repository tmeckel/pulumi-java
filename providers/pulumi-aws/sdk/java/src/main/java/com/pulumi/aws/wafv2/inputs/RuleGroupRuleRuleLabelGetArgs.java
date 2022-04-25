// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleRuleLabelGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleRuleLabelGetArgs Empty = new RuleGroupRuleRuleLabelGetArgs();

    /**
     * The label string.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The label string.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private RuleGroupRuleRuleLabelGetArgs() {}

    private RuleGroupRuleRuleLabelGetArgs(RuleGroupRuleRuleLabelGetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleRuleLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleRuleLabelGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleRuleLabelGetArgs();
        }

        public Builder(RuleGroupRuleRuleLabelGetArgs defaults) {
            $ = new RuleGroupRuleRuleLabelGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The label string.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The label string.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RuleGroupRuleRuleLabelGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
