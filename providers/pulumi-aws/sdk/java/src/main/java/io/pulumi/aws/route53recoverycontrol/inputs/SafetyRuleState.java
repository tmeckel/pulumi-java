// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SafetyRuleState extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleState Empty = new SafetyRuleState();

    /**
     * ARN of the safety rule.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     * 
     */
    @InputImport(name="assertedControls")
      private final @Nullable Input<List<String>> assertedControls;

    public Input<List<String>> getAssertedControls() {
        return this.assertedControls == null ? Input.empty() : this.assertedControls;
    }

    /**
     * ARN of the control panel in which this safety rule will reside.
     * 
     */
    @InputImport(name="controlPanelArn")
      private final @Nullable Input<String> controlPanelArn;

    public Input<String> getControlPanelArn() {
        return this.controlPanelArn == null ? Input.empty() : this.controlPanelArn;
    }

    /**
     * Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    @InputImport(name="gatingControls")
      private final @Nullable Input<List<String>> gatingControls;

    public Input<List<String>> getGatingControls() {
        return this.gatingControls == null ? Input.empty() : this.gatingControls;
    }

    /**
     * Name describing the safety rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration block for safety rule criteria. See below.
     * 
     */
    @InputImport(name="ruleConfig")
      private final @Nullable Input<SafetyRuleRuleConfigGetArgs> ruleConfig;

    public Input<SafetyRuleRuleConfigGetArgs> getRuleConfig() {
        return this.ruleConfig == null ? Input.empty() : this.ruleConfig;
    }

    /**
     * Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Routing controls that can only be set or unset if the specified `rule_config` evaluates to true for the specified `gating_controls`.
     * 
     */
    @InputImport(name="targetControls")
      private final @Nullable Input<List<String>> targetControls;

    public Input<List<String>> getTargetControls() {
        return this.targetControls == null ? Input.empty() : this.targetControls;
    }

    /**
     * Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     * 
     */
    @InputImport(name="waitPeriodMs")
      private final @Nullable Input<Integer> waitPeriodMs;

    public Input<Integer> getWaitPeriodMs() {
        return this.waitPeriodMs == null ? Input.empty() : this.waitPeriodMs;
    }

    public SafetyRuleState(
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> assertedControls,
        @Nullable Input<String> controlPanelArn,
        @Nullable Input<List<String>> gatingControls,
        @Nullable Input<String> name,
        @Nullable Input<SafetyRuleRuleConfigGetArgs> ruleConfig,
        @Nullable Input<String> status,
        @Nullable Input<List<String>> targetControls,
        @Nullable Input<Integer> waitPeriodMs) {
        this.arn = arn;
        this.assertedControls = assertedControls;
        this.controlPanelArn = controlPanelArn;
        this.gatingControls = gatingControls;
        this.name = name;
        this.ruleConfig = ruleConfig;
        this.status = status;
        this.targetControls = targetControls;
        this.waitPeriodMs = waitPeriodMs;
    }

    private SafetyRuleState() {
        this.arn = Input.empty();
        this.assertedControls = Input.empty();
        this.controlPanelArn = Input.empty();
        this.gatingControls = Input.empty();
        this.name = Input.empty();
        this.ruleConfig = Input.empty();
        this.status = Input.empty();
        this.targetControls = Input.empty();
        this.waitPeriodMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> assertedControls;
        private @Nullable Input<String> controlPanelArn;
        private @Nullable Input<List<String>> gatingControls;
        private @Nullable Input<String> name;
        private @Nullable Input<SafetyRuleRuleConfigGetArgs> ruleConfig;
        private @Nullable Input<String> status;
        private @Nullable Input<List<String>> targetControls;
        private @Nullable Input<Integer> waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assertedControls = defaults.assertedControls;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.gatingControls = defaults.gatingControls;
    	      this.name = defaults.name;
    	      this.ruleConfig = defaults.ruleConfig;
    	      this.status = defaults.status;
    	      this.targetControls = defaults.targetControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder assertedControls(@Nullable Input<List<String>> assertedControls) {
            this.assertedControls = assertedControls;
            return this;
        }

        public Builder assertedControls(@Nullable List<String> assertedControls) {
            this.assertedControls = Input.ofNullable(assertedControls);
            return this;
        }

        public Builder controlPanelArn(@Nullable Input<String> controlPanelArn) {
            this.controlPanelArn = controlPanelArn;
            return this;
        }

        public Builder controlPanelArn(@Nullable String controlPanelArn) {
            this.controlPanelArn = Input.ofNullable(controlPanelArn);
            return this;
        }

        public Builder gatingControls(@Nullable Input<List<String>> gatingControls) {
            this.gatingControls = gatingControls;
            return this;
        }

        public Builder gatingControls(@Nullable List<String> gatingControls) {
            this.gatingControls = Input.ofNullable(gatingControls);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder ruleConfig(@Nullable Input<SafetyRuleRuleConfigGetArgs> ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }

        public Builder ruleConfig(@Nullable SafetyRuleRuleConfigGetArgs ruleConfig) {
            this.ruleConfig = Input.ofNullable(ruleConfig);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder targetControls(@Nullable Input<List<String>> targetControls) {
            this.targetControls = targetControls;
            return this;
        }

        public Builder targetControls(@Nullable List<String> targetControls) {
            this.targetControls = Input.ofNullable(targetControls);
            return this;
        }

        public Builder waitPeriodMs(@Nullable Input<Integer> waitPeriodMs) {
            this.waitPeriodMs = waitPeriodMs;
            return this;
        }

        public Builder waitPeriodMs(@Nullable Integer waitPeriodMs) {
            this.waitPeriodMs = Input.ofNullable(waitPeriodMs);
            return this;
        }
        public SafetyRuleState build() {
            return new SafetyRuleState(arn, assertedControls, controlPanelArn, gatingControls, name, ruleConfig, status, targetControls, waitPeriodMs);
        }
    }
}
