// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource {
    /**
     * @return An IP address or a block of IP addresses in CIDR notation. AWS Network Firewall supports all address ranges for IPv4.
     * 
     */
    private final String addressDefinition;

    @CustomType.Constructor
    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource(@CustomType.Parameter("addressDefinition") String addressDefinition) {
        this.addressDefinition = addressDefinition;
    }

    /**
     * @return An IP address or a block of IP addresses in CIDR notation. AWS Network Firewall supports all address ranges for IPv4.
     * 
     */
    public String addressDefinition() {
        return this.addressDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressDefinition = defaults.addressDefinition;
        }

        public Builder addressDefinition(String addressDefinition) {
            this.addressDefinition = Objects.requireNonNull(addressDefinition);
            return this;
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource(addressDefinition);
        }
    }
}
