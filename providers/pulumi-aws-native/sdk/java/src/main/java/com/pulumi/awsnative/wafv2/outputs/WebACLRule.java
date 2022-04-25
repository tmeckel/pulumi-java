// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.WebACLCaptchaConfig;
import com.pulumi.awsnative.wafv2.outputs.WebACLLabel;
import com.pulumi.awsnative.wafv2.outputs.WebACLOverrideAction;
import com.pulumi.awsnative.wafv2.outputs.WebACLRuleAction;
import com.pulumi.awsnative.wafv2.outputs.WebACLStatement;
import com.pulumi.awsnative.wafv2.outputs.WebACLVisibilityConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLRule {
    private final @Nullable WebACLRuleAction action;
    private final @Nullable WebACLCaptchaConfig captchaConfig;
    private final String name;
    private final @Nullable WebACLOverrideAction overrideAction;
    private final Integer priority;
    /**
     * @return Collection of Rule Labels.
     * 
     */
    private final @Nullable List<WebACLLabel> ruleLabels;
    private final WebACLStatement statement;
    private final WebACLVisibilityConfig visibilityConfig;

    @CustomType.Constructor
    private WebACLRule(
        @CustomType.Parameter("action") @Nullable WebACLRuleAction action,
        @CustomType.Parameter("captchaConfig") @Nullable WebACLCaptchaConfig captchaConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("overrideAction") @Nullable WebACLOverrideAction overrideAction,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("ruleLabels") @Nullable List<WebACLLabel> ruleLabels,
        @CustomType.Parameter("statement") WebACLStatement statement,
        @CustomType.Parameter("visibilityConfig") WebACLVisibilityConfig visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = name;
        this.overrideAction = overrideAction;
        this.priority = priority;
        this.ruleLabels = ruleLabels;
        this.statement = statement;
        this.visibilityConfig = visibilityConfig;
    }

    public Optional<WebACLRuleAction> action() {
        return Optional.ofNullable(this.action);
    }
    public Optional<WebACLCaptchaConfig> captchaConfig() {
        return Optional.ofNullable(this.captchaConfig);
    }
    public String name() {
        return this.name;
    }
    public Optional<WebACLOverrideAction> overrideAction() {
        return Optional.ofNullable(this.overrideAction);
    }
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Collection of Rule Labels.
     * 
     */
    public List<WebACLLabel> ruleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }
    public WebACLStatement statement() {
        return this.statement;
    }
    public WebACLVisibilityConfig visibilityConfig() {
        return this.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLRuleAction action;
        private @Nullable WebACLCaptchaConfig captchaConfig;
        private String name;
        private @Nullable WebACLOverrideAction overrideAction;
        private Integer priority;
        private @Nullable List<WebACLLabel> ruleLabels;
        private WebACLStatement statement;
        private WebACLVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRule defaults) {
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

        public Builder action(@Nullable WebACLRuleAction action) {
            this.action = action;
            return this;
        }
        public Builder captchaConfig(@Nullable WebACLCaptchaConfig captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder overrideAction(@Nullable WebACLOverrideAction overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleLabels(@Nullable List<WebACLLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(WebACLLabel... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(WebACLStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder visibilityConfig(WebACLVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }        public WebACLRule build() {
            return new WebACLRule(action, captchaConfig, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
