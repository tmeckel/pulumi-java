// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLCaptchaConfigArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLLabelArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLOverrideActionArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRuleActionArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLVisibilityConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of WebACL that contains condition and action.
 * 
 */
public final class WebACLRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLRuleArgs Empty = new WebACLRuleArgs();

    @InputImport(name="action")
      private final @Nullable Input<WebACLRuleActionArgs> action;

    public Input<WebACLRuleActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="captchaConfig")
      private final @Nullable Input<WebACLCaptchaConfigArgs> captchaConfig;

    public Input<WebACLCaptchaConfigArgs> getCaptchaConfig() {
        return this.captchaConfig == null ? Input.empty() : this.captchaConfig;
    }

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="overrideAction")
      private final @Nullable Input<WebACLOverrideActionArgs> overrideAction;

    public Input<WebACLOverrideActionArgs> getOverrideAction() {
        return this.overrideAction == null ? Input.empty() : this.overrideAction;
    }

    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Collection of Rule Labels.
     * 
     */
    @InputImport(name="ruleLabels")
      private final @Nullable Input<List<WebACLLabelArgs>> ruleLabels;

    public Input<List<WebACLLabelArgs>> getRuleLabels() {
        return this.ruleLabels == null ? Input.empty() : this.ruleLabels;
    }

    @InputImport(name="statement", required=true)
      private final Input<WebACLStatementArgs> statement;

    public Input<WebACLStatementArgs> getStatement() {
        return this.statement;
    }

    @InputImport(name="visibilityConfig", required=true)
      private final Input<WebACLVisibilityConfigArgs> visibilityConfig;

    public Input<WebACLVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public WebACLRuleArgs(
        @Nullable Input<WebACLRuleActionArgs> action,
        @Nullable Input<WebACLCaptchaConfigArgs> captchaConfig,
        Input<String> name,
        @Nullable Input<WebACLOverrideActionArgs> overrideAction,
        Input<Integer> priority,
        @Nullable Input<List<WebACLLabelArgs>> ruleLabels,
        Input<WebACLStatementArgs> statement,
        Input<WebACLVisibilityConfigArgs> visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private WebACLRuleArgs() {
        this.action = Input.empty();
        this.captchaConfig = Input.empty();
        this.name = Input.empty();
        this.overrideAction = Input.empty();
        this.priority = Input.empty();
        this.ruleLabels = Input.empty();
        this.statement = Input.empty();
        this.visibilityConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebACLRuleActionArgs> action;
        private @Nullable Input<WebACLCaptchaConfigArgs> captchaConfig;
        private Input<String> name;
        private @Nullable Input<WebACLOverrideActionArgs> overrideAction;
        private Input<Integer> priority;
        private @Nullable Input<List<WebACLLabelArgs>> ruleLabels;
        private Input<WebACLStatementArgs> statement;
        private Input<WebACLVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(@Nullable Input<WebACLRuleActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable WebACLRuleActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder captchaConfig(@Nullable Input<WebACLCaptchaConfigArgs> captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }

        public Builder captchaConfig(@Nullable WebACLCaptchaConfigArgs captchaConfig) {
            this.captchaConfig = Input.ofNullable(captchaConfig);
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

        public Builder overrideAction(@Nullable Input<WebACLOverrideActionArgs> overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }

        public Builder overrideAction(@Nullable WebACLOverrideActionArgs overrideAction) {
            this.overrideAction = Input.ofNullable(overrideAction);
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

        public Builder ruleLabels(@Nullable Input<List<WebACLLabelArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder ruleLabels(@Nullable List<WebACLLabelArgs> ruleLabels) {
            this.ruleLabels = Input.ofNullable(ruleLabels);
            return this;
        }

        public Builder statement(Input<WebACLStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder statement(WebACLStatementArgs statement) {
            this.statement = Input.of(Objects.requireNonNull(statement));
            return this;
        }

        public Builder visibilityConfig(Input<WebACLVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }

        public Builder visibilityConfig(WebACLVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Input.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }
        public WebACLRuleArgs build() {
            return new WebACLRuleArgs(action, captchaConfig, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
