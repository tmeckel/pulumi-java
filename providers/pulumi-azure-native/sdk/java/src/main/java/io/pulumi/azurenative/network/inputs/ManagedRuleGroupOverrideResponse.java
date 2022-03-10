// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ManagedRuleOverrideResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a managed rule group override setting.
 * 
 */
public final class ManagedRuleGroupOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedRuleGroupOverrideResponse Empty = new ManagedRuleGroupOverrideResponse();

    /**
     * The managed rule group to override.
     * 
     */
    @InputImport(name="ruleGroupName", required=true)
      private final String ruleGroupName;

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable List<ManagedRuleOverrideResponse> rules;

    public List<ManagedRuleOverrideResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public ManagedRuleGroupOverrideResponse(
        String ruleGroupName,
        @Nullable List<ManagedRuleOverrideResponse> rules) {
        this.ruleGroupName = Objects.requireNonNull(ruleGroupName, "expected parameter 'ruleGroupName' to be non-null");
        this.rules = rules;
    }

    private ManagedRuleGroupOverrideResponse() {
        this.ruleGroupName = null;
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleGroupOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleGroupName;
        private @Nullable List<ManagedRuleOverrideResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleGroupOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder ruleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }

        public Builder rules(@Nullable List<ManagedRuleOverrideResponse> rules) {
            this.rules = rules;
            return this;
        }
        public ManagedRuleGroupOverrideResponse build() {
            return new ManagedRuleGroupOverrideResponse(ruleGroupName, rules);
        }
    }
}
