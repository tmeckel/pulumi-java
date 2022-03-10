// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationRuleConditionResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyFilterRuleActionResponse;
import io.pulumi.azurenative.network.outputs.NatRuleConditionResponse;
import io.pulumi.azurenative.network.outputs.NetworkRuleConditionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyFilterRuleResponse {
    /**
     * The action type of a Filter rule.
     * 
     */
    private final @Nullable FirewallPolicyFilterRuleActionResponse action;
    /**
     * The name of the rule.
     * 
     */
    private final @Nullable String name;
    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * Collection of rule conditions used by a rule.
     * 
     */
    private final @Nullable List<Object> ruleConditions;
    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyFilterRule'.
     * 
     */
    private final String ruleType;

    @OutputCustomType.Constructor
    private FirewallPolicyFilterRuleResponse(
        @OutputCustomType.Parameter("action") @Nullable FirewallPolicyFilterRuleActionResponse action,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("priority") @Nullable Integer priority,
        @OutputCustomType.Parameter("ruleConditions") @Nullable List<Object> ruleConditions,
        @OutputCustomType.Parameter("ruleType") String ruleType) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleConditions = ruleConditions;
        this.ruleType = ruleType;
    }

    /**
     * The action type of a Filter rule.
     * 
    */
    public Optional<FirewallPolicyFilterRuleActionResponse> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * The name of the rule.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority of the Firewall Policy Rule resource.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Collection of rule conditions used by a rule.
     * 
    */
    public List<Object> getRuleConditions() {
        return this.ruleConditions == null ? List.of() : this.ruleConditions;
    }
    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyFilterRule'.
     * 
    */
    public String getRuleType() {
        return this.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyFilterRuleActionResponse action;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable List<Object> ruleConditions;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleConditions = defaults.ruleConditions;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder action(@Nullable FirewallPolicyFilterRuleActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder ruleConditions(@Nullable List<Object> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }

        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public FirewallPolicyFilterRuleResponse build() {
            return new FirewallPolicyFilterRuleResponse(action, name, priority, ruleConditions, ruleType);
        }
    }
}
