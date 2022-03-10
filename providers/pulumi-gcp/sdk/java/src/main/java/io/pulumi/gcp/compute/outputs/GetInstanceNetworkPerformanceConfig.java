// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceNetworkPerformanceConfig {
    /**
     * The egress bandwidth tier for the instance.
     * 
     */
    private final String totalEgressBandwidthTier;

    @OutputCustomType.Constructor
    private GetInstanceNetworkPerformanceConfig(@OutputCustomType.Parameter("totalEgressBandwidthTier") String totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = totalEgressBandwidthTier;
    }

    /**
     * The egress bandwidth tier for the instance.
     * 
    */
    public String getTotalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkPerformanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNetworkPerformanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }
        public GetInstanceNetworkPerformanceConfig build() {
            return new GetInstanceNetworkPerformanceConfig(totalEgressBandwidthTier);
        }
    }
}
