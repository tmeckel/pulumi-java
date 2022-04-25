// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.azurenative.containerservice.outputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes {
    /**
     * @return A list of public IP prefix resources.
     * 
     */
    private final @Nullable List<ResourceReferenceResponse> publicIPPrefixes;

    @CustomType.Constructor
    private ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes(@CustomType.Parameter("publicIPPrefixes") @Nullable List<ResourceReferenceResponse> publicIPPrefixes) {
        this.publicIPPrefixes = publicIPPrefixes;
    }

    /**
     * @return A list of public IP prefix resources.
     * 
     */
    public List<ResourceReferenceResponse> publicIPPrefixes() {
        return this.publicIPPrefixes == null ? List.of() : this.publicIPPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceReferenceResponse> publicIPPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPPrefixes = defaults.publicIPPrefixes;
        }

        public Builder publicIPPrefixes(@Nullable List<ResourceReferenceResponse> publicIPPrefixes) {
            this.publicIPPrefixes = publicIPPrefixes;
            return this;
        }
        public Builder publicIPPrefixes(ResourceReferenceResponse... publicIPPrefixes) {
            return publicIPPrefixes(List.of(publicIPPrefixes));
        }        public ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes build() {
            return new ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes(publicIPPrefixes);
        }
    }
}
