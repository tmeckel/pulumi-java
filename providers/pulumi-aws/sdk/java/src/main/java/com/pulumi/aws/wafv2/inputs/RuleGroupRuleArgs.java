// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleRuleLabelArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleVisibilityConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleArgs Empty = new RuleGroupRuleArgs();

    /**
     * The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * 
     */
    @Import(name="action", required=true)
    private Output<RuleGroupRuleActionArgs> action;

    /**
     * @return The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * 
     */
    public Output<RuleGroupRuleActionArgs> action() {
        return this.action;
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
    private @Nullable Output<List<RuleGroupRuleRuleLabelArgs>> ruleLabels;

    /**
     * @return Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    public Optional<Output<List<RuleGroupRuleRuleLabelArgs>>> ruleLabels() {
        return Optional.ofNullable(this.ruleLabels);
    }

    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    @Import(name="statement", required=true)
    private Output<RuleGroupRuleStatementArgs> statement;

    /**
     * @return The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    public Output<RuleGroupRuleStatementArgs> statement() {
        return this.statement;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
    private Output<RuleGroupRuleVisibilityConfigArgs> visibilityConfig;

    /**
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    public Output<RuleGroupRuleVisibilityConfigArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    private RuleGroupRuleArgs() {}

    private RuleGroupRuleArgs(RuleGroupRuleArgs $) {
        this.action = $.action;
        this.name = $.name;
        this.priority = $.priority;
        this.ruleLabels = $.ruleLabels;
        this.statement = $.statement;
        this.visibilityConfig = $.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleArgs $;

        public Builder() {
            $ = new RuleGroupRuleArgs();
        }

        public Builder(RuleGroupRuleArgs defaults) {
            $ = new RuleGroupRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<RuleGroupRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
         * 
         * @return builder
         * 
         */
        public Builder action(RuleGroupRuleActionArgs action) {
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
        public Builder ruleLabels(@Nullable Output<List<RuleGroupRuleRuleLabelArgs>> ruleLabels) {
            $.ruleLabels = ruleLabels;
            return this;
        }

        /**
         * @param ruleLabels Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(List<RuleGroupRuleRuleLabelArgs> ruleLabels) {
            return ruleLabels(Output.of(ruleLabels));
        }

        /**
         * @param ruleLabels Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(RuleGroupRuleRuleLabelArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }

        /**
         * @param statement The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder statement(Output<RuleGroupRuleStatementArgs> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder statement(RuleGroupRuleStatementArgs statement) {
            return statement(Output.of(statement));
        }

        /**
         * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
         * 
         * @return builder
         * 
         */
        public Builder visibilityConfig(Output<RuleGroupRuleVisibilityConfigArgs> visibilityConfig) {
            $.visibilityConfig = visibilityConfig;
            return this;
        }

        /**
         * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
         * 
         * @return builder
         * 
         */
        public Builder visibilityConfig(RuleGroupRuleVisibilityConfigArgs visibilityConfig) {
            return visibilityConfig(Output.of(visibilityConfig));
        }

        public RuleGroupRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.statement = Objects.requireNonNull($.statement, "expected parameter 'statement' to be non-null");
            $.visibilityConfig = Objects.requireNonNull($.visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
            return $;
        }
    }

}
