// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkRuleResponse {
    /**
     * The action of virtual network rule.
     * 
     */
    private final @Nullable String action;
    /**
     * Gets the state of virtual network rule.
     * 
     */
    private final @Nullable String state;
    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    private final String virtualNetworkResourceId;

    @OutputCustomType.Constructor
    private VirtualNetworkRuleResponse(
        @OutputCustomType.Parameter("action") @Nullable String action,
        @OutputCustomType.Parameter("state") @Nullable String state,
        @OutputCustomType.Parameter("virtualNetworkResourceId") String virtualNetworkResourceId) {
        this.action = action;
        this.state = state;
        this.virtualNetworkResourceId = virtualNetworkResourceId;
    }

    /**
     * The action of virtual network rule.
     * 
    */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Gets the state of virtual network rule.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
    */
    public String getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String state;
        private String virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder virtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }
        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(action, state, virtualNetworkResourceId);
        }
    }
}
