// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerAutoHealingPolicyResponse {
    /**
     * @return The URL for the health check that signals autohealing.
     * 
     */
    private final String healthCheck;
    /**
     * @return The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    private final Integer initialDelaySec;

    @CustomType.Constructor
    private InstanceGroupManagerAutoHealingPolicyResponse(
        @CustomType.Parameter("healthCheck") String healthCheck,
        @CustomType.Parameter("initialDelaySec") Integer initialDelaySec) {
        this.healthCheck = healthCheck;
        this.initialDelaySec = initialDelaySec;
    }

    /**
     * @return The URL for the health check that signals autohealing.
     * 
     */
    public String healthCheck() {
        return this.healthCheck;
    }
    /**
     * @return The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    public Integer initialDelaySec() {
        return this.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String healthCheck;
        private Integer initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
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
        }        public InstanceGroupManagerAutoHealingPolicyResponse build() {
            return new InstanceGroupManagerAutoHealingPolicyResponse(healthCheck, initialDelaySec);
        }
    }
}
