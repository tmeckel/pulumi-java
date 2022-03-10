// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RegionInstanceGroupManagerAutoHealingPolicies {
    /**
     * The health check resource that signals autohealing.
     * 
     */
    private final String healthCheck;
    /**
     * The number of seconds that the managed instance group waits before
     * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
     */
    private final Integer initialDelaySec;

    @OutputCustomType.Constructor
    private RegionInstanceGroupManagerAutoHealingPolicies(
        @OutputCustomType.Parameter("healthCheck") String healthCheck,
        @OutputCustomType.Parameter("initialDelaySec") Integer initialDelaySec) {
        this.healthCheck = healthCheck;
        this.initialDelaySec = initialDelaySec;
    }

    /**
     * The health check resource that signals autohealing.
     * 
    */
    public String getHealthCheck() {
        return this.healthCheck;
    }
    /**
     * The number of seconds that the managed instance group waits before
     * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
    */
    public Integer getInitialDelaySec() {
        return this.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerAutoHealingPolicies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String healthCheck;
        private Integer initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerAutoHealingPolicies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        public Builder healthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder initialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }
        public RegionInstanceGroupManagerAutoHealingPolicies build() {
            return new RegionInstanceGroupManagerAutoHealingPolicies(healthCheck, initialDelaySec);
        }
    }
}
