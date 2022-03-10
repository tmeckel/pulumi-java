// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OutboundFirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final OutboundFirewallRuleArgs Empty = new OutboundFirewallRuleArgs();

    @InputImport(name="outboundRuleFqdn")
      private final @Nullable Input<String> outboundRuleFqdn;

    public Input<String> getOutboundRuleFqdn() {
        return this.outboundRuleFqdn == null ? Input.empty() : this.outboundRuleFqdn;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    public OutboundFirewallRuleArgs(
        @Nullable Input<String> outboundRuleFqdn,
        Input<String> resourceGroupName,
        Input<String> serverName) {
        this.outboundRuleFqdn = outboundRuleFqdn;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private OutboundFirewallRuleArgs() {
        this.outboundRuleFqdn = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutboundFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> outboundRuleFqdn;
        private Input<String> resourceGroupName;
        private Input<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(OutboundFirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outboundRuleFqdn = defaults.outboundRuleFqdn;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder outboundRuleFqdn(@Nullable Input<String> outboundRuleFqdn) {
            this.outboundRuleFqdn = outboundRuleFqdn;
            return this;
        }

        public Builder outboundRuleFqdn(@Nullable String outboundRuleFqdn) {
            this.outboundRuleFqdn = Input.ofNullable(outboundRuleFqdn);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serverName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }
        public OutboundFirewallRuleArgs build() {
            return new OutboundFirewallRuleArgs(outboundRuleFqdn, resourceGroupName, serverName);
        }
    }
}
