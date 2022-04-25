// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MHSMVirtualNetworkRuleResponse {
    /**
     * @return Full resource id of a vnet subnet, such as &#39;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1&#39;.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private MHSMVirtualNetworkRuleResponse(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return Full resource id of a vnet subnet, such as &#39;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1&#39;.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMVirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMVirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public MHSMVirtualNetworkRuleResponse build() {
            return new MHSMVirtualNetworkRuleResponse(id);
        }
    }
}
