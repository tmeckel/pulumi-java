// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dns.outputs.ManagedZonePeeringConfigTargetNetwork;
import java.util.Objects;

@CustomType
public final class ManagedZonePeeringConfig {
    /**
     * @return The network with which to peer.
     * Structure is documented below.
     * 
     */
    private final ManagedZonePeeringConfigTargetNetwork targetNetwork;

    @CustomType.Constructor
    private ManagedZonePeeringConfig(@CustomType.Parameter("targetNetwork") ManagedZonePeeringConfigTargetNetwork targetNetwork) {
        this.targetNetwork = targetNetwork;
    }

    /**
     * @return The network with which to peer.
     * Structure is documented below.
     * 
     */
    public ManagedZonePeeringConfigTargetNetwork targetNetwork() {
        return this.targetNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZonePeeringConfigTargetNetwork targetNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNetwork = defaults.targetNetwork;
        }

        public Builder targetNetwork(ManagedZonePeeringConfigTargetNetwork targetNetwork) {
            this.targetNetwork = Objects.requireNonNull(targetNetwork);
            return this;
        }        public ManagedZonePeeringConfig build() {
            return new ManagedZonePeeringConfig(targetNetwork);
        }
    }
}
