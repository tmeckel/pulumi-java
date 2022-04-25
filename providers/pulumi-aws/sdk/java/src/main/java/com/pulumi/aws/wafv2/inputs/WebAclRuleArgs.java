// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleRuleLabelArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleVisibilityConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleArgs Empty = new WebAclRuleArgs();

    /**
     * The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
     * 
     */
    @Import(name="action")
    private @Nullable Output<WebAclRuleActionArgs> action;

    /**
     * @return The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
     * 
     */
    public Optional<Output<WebAclRuleActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * A friendly name of the rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A friendly name of the rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
     * 
     */
    @Import(name="overrideAction")
    private @Nullable Output<WebAclRuleOverrideActionArgs> overrideAction;

    /**
     * @return The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
     * 
     */
    public Optional<Output<WebAclRuleOverrideActionArgs>> overrideAction() {
        return Optional.ofNullable(this.overrideAction);
    }

    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    @Import(name="ruleLabels")
    private @Nullable Output<List<WebAclRuleRuleLabelArgs>> ruleLabels;

    /**
     * @return Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    public Optional<Output<List<WebAclRuleRuleLabelArgs>>> ruleLabels() {
        return Optional.ofNullable(this.ruleLabels);
    }

    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    @Import(name="statement", required=true)
    private Output<WebAclRuleStatementArgs> statement;

    /**
     * @return The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    public Output<WebAclRuleStatementArgs> statement() {
        return this.statement;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
    private Output<WebAclRuleVisibilityConfigArgs> visibilityConfig;

    /**
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    public Output<WebAclRuleVisibilityConfigArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    private WebAclRuleArgs() {}

    private WebAclRuleArgs(WebAclRuleArgs $) {
        this.action = $.action;
        this.name = $.name;
        this.overrideAction = $.overrideAction;
        this.priority = $.priority;
        this.ruleLabels = $.ruleLabels;
        this.statement = $.statement;
        this.visibilityConfig = $.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleArgs $;

        public Builder() {
            $ = new WebAclRuleArgs();
        }

        public Builder(WebAclRuleArgs defaults) {
            $ = new WebAclRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<WebAclRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
         * 
         * @return builder
         * 
         */
        public Builder action(WebAclRuleActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param name A friendly name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param overrideAction The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
         * 
         * @return builder
         * 
         */
        public Builder overrideAction(@Nullable Output<WebAclRuleOverrideActionArgs> overrideAction) {
            $.overrideAction = overrideAction;
            return this;
        }

        /**
         * @param overrideAction The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
         * 
         * @return builder
         * 
         */
        public Builder overrideAction(WebAclRuleOverrideActionArgs overrideAction) {
            return overrideAction(Output.of(overrideAction));
        }

        /**
         * @param priority If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param ruleLabels Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(@Nullable Output<List<WebAclRuleRuleLabelArgs>> ruleLabels) {
            $.ruleLabels = ruleLabels;
            return this;
        }

        /**
         * @param ruleLabels Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(List<WebAclRuleRuleLabelArgs> ruleLabels) {
            return ruleLabels(Output.of(ruleLabels));
        }

        /**
         * @param ruleLabels Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(WebAclRuleRuleLabelArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }

        /**
         * @param statement The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder statement(Output<WebAclRuleStatementArgs> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder statement(WebAclRuleStatementArgs statement) {
            return statement(Output.of(statement));
        }

        /**
         * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
         * 
         * @return builder
         * 
         */
        public Builder visibilityConfig(Output<WebAclRuleVisibilityConfigArgs> visibilityConfig) {
            $.visibilityConfig = visibilityConfig;
            return this;
        }

        /**
         * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
         * 
         * @return builder
         * 
         */
        public Builder visibilityConfig(WebAclRuleVisibilityConfigArgs visibilityConfig) {
            return visibilityConfig(Output.of(visibilityConfig));
        }

        public WebAclRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.statement = Objects.requireNonNull($.statement, "expected parameter 'statement' to be non-null");
            $.visibilityConfig = Objects.requireNonNull($.visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
            return $;
        }
    }

}
