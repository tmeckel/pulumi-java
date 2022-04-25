// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupStatefulRuleOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupStatefulRuleOptionsArgs Empty = new RuleGroupRuleGroupStatefulRuleOptionsArgs();

    /**
     * Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    @Import(name="ruleOrder", required=true)
    private Output<String> ruleOrder;

    /**
     * @return Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    public Output<String> ruleOrder() {
        return this.ruleOrder;
    }

    private RuleGroupRuleGroupStatefulRuleOptionsArgs() {}

    private RuleGroupRuleGroupStatefulRuleOptionsArgs(RuleGroupRuleGroupStatefulRuleOptionsArgs $) {
        this.ruleOrder = $.ruleOrder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupStatefulRuleOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupStatefulRuleOptionsArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupStatefulRuleOptionsArgs();
        }

        public Builder(RuleGroupRuleGroupStatefulRuleOptionsArgs defaults) {
            $ = new RuleGroupRuleGroupStatefulRuleOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ruleOrder Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
         * 
         * @return builder
         * 
         */
        public Builder ruleOrder(Output<String> ruleOrder) {
            $.ruleOrder = ruleOrder;
            return this;
        }

        /**
         * @param ruleOrder Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
         * 
         * @return builder
         * 
         */
        public Builder ruleOrder(String ruleOrder) {
            return ruleOrder(Output.of(ruleOrder));
        }

        public RuleGroupRuleGroupStatefulRuleOptionsArgs build() {
            $.ruleOrder = Objects.requireNonNull($.ruleOrder, "expected parameter 'ruleOrder' to be non-null");
            return $;
        }
    }

}
