// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs();

    /**
     * Set of actions to take on a packet that matches one of the stateless rule definition&#39;s `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<String>> actions;

    /**
     * @return Set of actions to take on a packet that matches one of the stateless rule definition&#39;s `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
     * 
     */
    public Output<List<String>> actions() {
        return this.actions;
    }

    /**
     * A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
     * 
     */
    @Import(name="matchAttributes", required=true)
    private Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> matchAttributes;

    /**
     * @return A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
     * 
     */
    public Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> matchAttributes() {
        return this.matchAttributes;
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs() {}

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs $) {
        this.actions = $.actions;
        this.matchAttributes = $.matchAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs();
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs defaults) {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions Set of actions to take on a packet that matches one of the stateless rule definition&#39;s `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions Set of actions to take on a packet that matches one of the stateless rule definition&#39;s `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions Set of actions to take on a packet that matches one of the stateless rule definition&#39;s `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param matchAttributes A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
         * 
         * @return builder
         * 
         */
        public Builder matchAttributes(Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> matchAttributes) {
            $.matchAttributes = matchAttributes;
            return this;
        }

        /**
         * @param matchAttributes A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
         * 
         * @return builder
         * 
         */
        public Builder matchAttributes(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs matchAttributes) {
            return matchAttributes(Output.of(matchAttributes));
        }

        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.matchAttributes = Objects.requireNonNull($.matchAttributes, "expected parameter 'matchAttributes' to be non-null");
            return $;
        }
    }

}
