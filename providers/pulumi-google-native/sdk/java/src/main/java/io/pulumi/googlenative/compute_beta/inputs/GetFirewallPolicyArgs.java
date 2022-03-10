// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyArgs Empty = new GetFirewallPolicyArgs();

    @InputImport(name="firewallPolicy", required=true)
      private final String firewallPolicy;

    public String getFirewallPolicy() {
        return this.firewallPolicy;
    }

    public GetFirewallPolicyArgs(String firewallPolicy) {
        this.firewallPolicy = Objects.requireNonNull(firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
    }

    private GetFirewallPolicyArgs() {
        this.firewallPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicy = defaults.firewallPolicy;
        }

        public Builder firewallPolicy(String firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }
        public GetFirewallPolicyArgs build() {
            return new GetFirewallPolicyArgs(firewallPolicy);
        }
    }
}
