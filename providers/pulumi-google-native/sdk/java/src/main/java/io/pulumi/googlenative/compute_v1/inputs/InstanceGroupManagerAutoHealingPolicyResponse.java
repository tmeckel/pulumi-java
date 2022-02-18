// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerAutoHealingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerAutoHealingPolicyResponse Empty = new InstanceGroupManagerAutoHealingPolicyResponse();

    /**
     * The URL for the health check that signals autohealing.
     * 
     */
    @InputImport(name="healthCheck", required=true)
    private final String healthCheck;

    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    @InputImport(name="initialDelaySec", required=true)
    private final Integer initialDelaySec;

    public Integer getInitialDelaySec() {
        return this.initialDelaySec;
    }

    public InstanceGroupManagerAutoHealingPolicyResponse(
        String healthCheck,
        Integer initialDelaySec) {
        this.healthCheck = Objects.requireNonNull(healthCheck, "expected parameter 'healthCheck' to be non-null");
        this.initialDelaySec = Objects.requireNonNull(initialDelaySec, "expected parameter 'initialDelaySec' to be non-null");
    }

    private InstanceGroupManagerAutoHealingPolicyResponse() {
        this.healthCheck = null;
        this.initialDelaySec = null;
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

        public Builder setHealthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setInitialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }

        public InstanceGroupManagerAutoHealingPolicyResponse build() {
            return new InstanceGroupManagerAutoHealingPolicyResponse(healthCheck, initialDelaySec);
        }
    }
}
