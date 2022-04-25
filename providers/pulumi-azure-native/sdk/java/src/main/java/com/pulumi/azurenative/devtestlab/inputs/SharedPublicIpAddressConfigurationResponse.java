// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.inputs.InboundNatRuleResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a virtual machine that determine how it is connected to a load balancer.
 * 
 */
public final class SharedPublicIpAddressConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final SharedPublicIpAddressConfigurationResponse Empty = new SharedPublicIpAddressConfigurationResponse();

    /**
     * The incoming NAT rules
     * 
     */
    @Import(name="inboundNatRules")
    private @Nullable List<InboundNatRuleResponse> inboundNatRules;

    /**
     * @return The incoming NAT rules
     * 
     */
    public Optional<List<InboundNatRuleResponse>> inboundNatRules() {
        return Optional.ofNullable(this.inboundNatRules);
    }

    private SharedPublicIpAddressConfigurationResponse() {}

    private SharedPublicIpAddressConfigurationResponse(SharedPublicIpAddressConfigurationResponse $) {
        this.inboundNatRules = $.inboundNatRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedPublicIpAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedPublicIpAddressConfigurationResponse $;

        public Builder() {
            $ = new SharedPublicIpAddressConfigurationResponse();
        }

        public Builder(SharedPublicIpAddressConfigurationResponse defaults) {
            $ = new SharedPublicIpAddressConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param inboundNatRules The incoming NAT rules
         * 
         * @return builder
         * 
         */
        public Builder inboundNatRules(@Nullable List<InboundNatRuleResponse> inboundNatRules) {
            $.inboundNatRules = inboundNatRules;
            return this;
        }

        /**
         * @param inboundNatRules The incoming NAT rules
         * 
         * @return builder
         * 
         */
        public Builder inboundNatRules(InboundNatRuleResponse... inboundNatRules) {
            return inboundNatRules(List.of(inboundNatRules));
        }

        public SharedPublicIpAddressConfigurationResponse build() {
            return $;
        }
    }

}
