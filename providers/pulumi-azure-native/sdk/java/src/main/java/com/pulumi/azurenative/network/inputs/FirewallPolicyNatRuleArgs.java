// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationRuleConditionArgs;
import com.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleActionArgs;
import com.pulumi.azurenative.network.inputs.NatRuleConditionArgs;
import com.pulumi.azurenative.network.inputs.NetworkRuleConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Firewall Policy NAT Rule.
 * 
 */
public final class FirewallPolicyNatRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyNatRuleArgs Empty = new FirewallPolicyNatRuleArgs();

    /**
     * The action type of a Nat rule.
     * 
     */
    @Import(name="action")
    private @Nullable Output<FirewallPolicyNatRuleActionArgs> action;

    /**
     * @return The action type of a Nat rule.
     * 
     */
    public Optional<Output<FirewallPolicyNatRuleActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of the Firewall Policy Rule resource.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The match conditions for incoming traffic.
     * 
     */
    @Import(name="ruleCondition")
    private @Nullable Output<Object> ruleCondition;

    /**
     * @return The match conditions for incoming traffic.
     * 
     */
    public Optional<Output<Object>> ruleCondition() {
        return Optional.ofNullable(this.ruleCondition);
    }

    /**
     * The type of the rule.
     * Expected value is &#39;FirewallPolicyNatRule&#39;.
     * 
     */
    @Import(name="ruleType", required=true)
    private Output<String> ruleType;

    /**
     * @return The type of the rule.
     * Expected value is &#39;FirewallPolicyNatRule&#39;.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @Import(name="translatedAddress")
    private @Nullable Output<String> translatedAddress;

    /**
     * @return The translated address for this NAT rule.
     * 
     */
    public Optional<Output<String>> translatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @Import(name="translatedPort")
    private @Nullable Output<String> translatedPort;

    /**
     * @return The translated port for this NAT rule.
     * 
     */
    public Optional<Output<String>> translatedPort() {
        return Optional.ofNullable(this.translatedPort);
    }

    private FirewallPolicyNatRuleArgs() {}

    private FirewallPolicyNatRuleArgs(FirewallPolicyNatRuleArgs $) {
        this.action = $.action;
        this.name = $.name;
        this.priority = $.priority;
        this.ruleCondition = $.ruleCondition;
        this.ruleType = $.ruleType;
        this.translatedAddress = $.translatedAddress;
        this.translatedPort = $.translatedPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyNatRuleArgs $;

        public Builder() {
            $ = new FirewallPolicyNatRuleArgs();
        }

        public Builder(FirewallPolicyNatRuleArgs defaults) {
            $ = new FirewallPolicyNatRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action type of a Nat rule.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<FirewallPolicyNatRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action type of a Nat rule.
         * 
         * @return builder
         * 
         */
        public Builder action(FirewallPolicyNatRuleActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param name The name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Priority of the Firewall Policy Rule resource.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of the Firewall Policy Rule resource.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param ruleCondition The match conditions for incoming traffic.
         * 
         * @return builder
         * 
         */
        public Builder ruleCondition(@Nullable Output<Object> ruleCondition) {
            $.ruleCondition = ruleCondition;
            return this;
        }

        /**
         * @param ruleCondition The match conditions for incoming traffic.
         * 
         * @return builder
         * 
         */
        public Builder ruleCondition(Object ruleCondition) {
            return ruleCondition(Output.of(ruleCondition));
        }

        /**
         * @param ruleType The type of the rule.
         * Expected value is &#39;FirewallPolicyNatRule&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType The type of the rule.
         * Expected value is &#39;FirewallPolicyNatRule&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
        }

        /**
         * @param translatedAddress The translated address for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedAddress(@Nullable Output<String> translatedAddress) {
            $.translatedAddress = translatedAddress;
            return this;
        }

        /**
         * @param translatedAddress The translated address for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedAddress(String translatedAddress) {
            return translatedAddress(Output.of(translatedAddress));
        }

        /**
         * @param translatedPort The translated port for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedPort(@Nullable Output<String> translatedPort) {
            $.translatedPort = translatedPort;
            return this;
        }

        /**
         * @param translatedPort The translated port for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedPort(String translatedPort) {
            return translatedPort(Output.of(translatedPort));
        }

        public FirewallPolicyNatRuleArgs build() {
            $.ruleType = Codegen.stringProp("ruleType").output().arg($.ruleType).require();
            return $;
        }
    }

}
