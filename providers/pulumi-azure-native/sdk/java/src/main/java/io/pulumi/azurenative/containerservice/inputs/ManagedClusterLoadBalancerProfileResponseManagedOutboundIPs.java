// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Desired managed outbound IPs for the cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs Empty = new ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs();

    /**
     * Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    public ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs(@Nullable Integer count) {
        this.count = count == null ? 1 : count;
    }

    private ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs() {
        this.count = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs build() {
            return new ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs(count);
        }
    }
}
