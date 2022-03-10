// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.InboundNatRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a virtual machine that determine how it is connected to a load balancer.
 * 
 */
public final class SharedPublicIpAddressConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SharedPublicIpAddressConfigurationResponse Empty = new SharedPublicIpAddressConfigurationResponse();

    /**
     * The incoming NAT rules
     * 
     */
    @InputImport(name="inboundNatRules")
      private final @Nullable List<InboundNatRuleResponse> inboundNatRules;

    public List<InboundNatRuleResponse> getInboundNatRules() {
        return this.inboundNatRules == null ? List.of() : this.inboundNatRules;
    }

    public SharedPublicIpAddressConfigurationResponse(@Nullable List<InboundNatRuleResponse> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
    }

    private SharedPublicIpAddressConfigurationResponse() {
        this.inboundNatRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPublicIpAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InboundNatRuleResponse> inboundNatRules;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPublicIpAddressConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inboundNatRules = defaults.inboundNatRules;
        }

        public Builder inboundNatRules(@Nullable List<InboundNatRuleResponse> inboundNatRules) {
            this.inboundNatRules = inboundNatRules;
            return this;
        }
        public SharedPublicIpAddressConfigurationResponse build() {
            return new SharedPublicIpAddressConfigurationResponse(inboundNatRules);
        }
    }
}
