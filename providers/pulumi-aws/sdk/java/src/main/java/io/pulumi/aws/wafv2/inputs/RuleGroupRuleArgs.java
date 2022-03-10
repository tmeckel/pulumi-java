// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleRuleLabelArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleVisibilityConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleArgs Empty = new RuleGroupRuleArgs();

    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<RuleGroupRuleActionArgs> action;

    public Input<RuleGroupRuleActionArgs> getAction() {
        return this.action;
    }

    /**
     * A friendly name of the rule.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    @InputImport(name="ruleLabels")
      private final @Nullable Input<List<RuleGroupRuleRuleLabelArgs>> ruleLabels;

    public Input<List<RuleGroupRuleRuleLabelArgs>> getRuleLabels() {
        return this.ruleLabels == null ? Input.empty() : this.ruleLabels;
    }

    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    @InputImport(name="statement", required=true)
      private final Input<RuleGroupRuleStatementArgs> statement;

    public Input<RuleGroupRuleStatementArgs> getStatement() {
        return this.statement;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @InputImport(name="visibilityConfig", required=true)
      private final Input<RuleGroupRuleVisibilityConfigArgs> visibilityConfig;

    public Input<RuleGroupRuleVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public RuleGroupRuleArgs(
        Input<RuleGroupRuleActionArgs> action,
        Input<String> name,
        Input<Integer> priority,
        @Nullable Input<List<RuleGroupRuleRuleLabelArgs>> ruleLabels,
        Input<RuleGroupRuleStatementArgs> statement,
        Input<RuleGroupRuleVisibilityConfigArgs> visibilityConfig) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private RuleGroupRuleArgs() {
        this.action = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.ruleLabels = Input.empty();
        this.statement = Input.empty();
        this.visibilityConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupRuleActionArgs> action;
        private Input<String> name;
        private Input<Integer> priority;
        private @Nullable Input<List<RuleGroupRuleRuleLabelArgs>> ruleLabels;
        private Input<RuleGroupRuleStatementArgs> statement;
        private Input<RuleGroupRuleVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(Input<RuleGroupRuleActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder action(RuleGroupRuleActionArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder priority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder ruleLabels(@Nullable Input<List<RuleGroupRuleRuleLabelArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder ruleLabels(@Nullable List<RuleGroupRuleRuleLabelArgs> ruleLabels) {
            this.ruleLabels = Input.ofNullable(ruleLabels);
            return this;
        }

        public Builder statement(Input<RuleGroupRuleStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder statement(RuleGroupRuleStatementArgs statement) {
            this.statement = Input.of(Objects.requireNonNull(statement));
            return this;
        }

        public Builder visibilityConfig(Input<RuleGroupRuleVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }

        public Builder visibilityConfig(RuleGroupRuleVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Input.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }
        public RuleGroupRuleArgs build() {
            return new RuleGroupRuleArgs(action, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
