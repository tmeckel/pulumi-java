// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCaptchaConfigArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupLabelArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupVisibilityConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of RuleGroup that contains condition and action.
 * 
 */
public final class RuleGroupRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleArgs Empty = new RuleGroupRuleArgs();

    @Import(name="action")
      private final @Nullable Output<RuleGroupRuleActionArgs> action;

    public Output<RuleGroupRuleActionArgs> getAction() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    @Import(name="captchaConfig")
      private final @Nullable Output<RuleGroupCaptchaConfigArgs> captchaConfig;

    public Output<RuleGroupCaptchaConfigArgs> getCaptchaConfig() {
        return this.captchaConfig == null ? Codegen.empty() : this.captchaConfig;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Collection of Rule Labels.
     * 
     */
    @Import(name="ruleLabels")
      private final @Nullable Output<List<RuleGroupLabelArgs>> ruleLabels;

    public Output<List<RuleGroupLabelArgs>> getRuleLabels() {
        return this.ruleLabels == null ? Codegen.empty() : this.ruleLabels;
    }

    @Import(name="statement", required=true)
      private final Output<RuleGroupStatementArgs> statement;

    public Output<RuleGroupStatementArgs> getStatement() {
        return this.statement;
    }

    @Import(name="visibilityConfig", required=true)
      private final Output<RuleGroupVisibilityConfigArgs> visibilityConfig;

    public Output<RuleGroupVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public RuleGroupRuleArgs(
        @Nullable Output<RuleGroupRuleActionArgs> action,
        @Nullable Output<RuleGroupCaptchaConfigArgs> captchaConfig,
        Output<String> name,
        Output<Integer> priority,
        @Nullable Output<List<RuleGroupLabelArgs>> ruleLabels,
        Output<RuleGroupStatementArgs> statement,
        Output<RuleGroupVisibilityConfigArgs> visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private RuleGroupRuleArgs() {
        this.action = Codegen.empty();
        this.captchaConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.ruleLabels = Codegen.empty();
        this.statement = Codegen.empty();
        this.visibilityConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleActionArgs> action;
        private @Nullable Output<RuleGroupCaptchaConfigArgs> captchaConfig;
        private Output<String> name;
        private Output<Integer> priority;
        private @Nullable Output<List<RuleGroupLabelArgs>> ruleLabels;
        private Output<RuleGroupStatementArgs> statement;
        private Output<RuleGroupVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(@Nullable Output<RuleGroupRuleActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable RuleGroupRuleActionArgs action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder captchaConfig(@Nullable Output<RuleGroupCaptchaConfigArgs> captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }
        public Builder captchaConfig(@Nullable RuleGroupCaptchaConfigArgs captchaConfig) {
            this.captchaConfig = Codegen.ofNullable(captchaConfig);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder ruleLabels(@Nullable Output<List<RuleGroupLabelArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(@Nullable List<RuleGroupLabelArgs> ruleLabels) {
            this.ruleLabels = Codegen.ofNullable(ruleLabels);
            return this;
        }
        public Builder ruleLabels(RuleGroupLabelArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(Output<RuleGroupStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder statement(RuleGroupStatementArgs statement) {
            this.statement = Output.of(Objects.requireNonNull(statement));
            return this;
        }
        public Builder visibilityConfig(Output<RuleGroupVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public Builder visibilityConfig(RuleGroupVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Output.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }        public RuleGroupRuleArgs build() {
            return new RuleGroupRuleArgs(action, captchaConfig, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
