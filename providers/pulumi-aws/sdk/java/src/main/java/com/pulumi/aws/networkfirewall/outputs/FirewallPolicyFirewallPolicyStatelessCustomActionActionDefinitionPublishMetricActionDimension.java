// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension {
    /**
     * @return The string value to use in the custom metric dimension.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension(@CustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * @return The string value to use in the custom metric dimension.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension build() {
            return new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension(value);
        }
    }
}
