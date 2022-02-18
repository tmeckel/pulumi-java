// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class SecurityPolicyRuleRateLimitOptionsThresholdResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleRateLimitOptionsThresholdResponse Empty = new SecurityPolicyRuleRateLimitOptionsThresholdResponse();

    /**
     * Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    @InputImport(name="count", required=true)
    private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * Interval over which the threshold is computed.
     * 
     */
    @InputImport(name="intervalSec", required=true)
    private final Integer intervalSec;

    public Integer getIntervalSec() {
        return this.intervalSec;
    }

    public SecurityPolicyRuleRateLimitOptionsThresholdResponse(
        Integer count,
        Integer intervalSec) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.intervalSec = Objects.requireNonNull(intervalSec, "expected parameter 'intervalSec' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsThresholdResponse() {
        this.count = null;
        this.intervalSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Integer intervalSec;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsThresholdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalSec = defaults.intervalSec;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setIntervalSec(Integer intervalSec) {
            this.intervalSec = Objects.requireNonNull(intervalSec);
            return this;
        }

        public SecurityPolicyRuleRateLimitOptionsThresholdResponse build() {
            return new SecurityPolicyRuleRateLimitOptionsThresholdResponse(count, intervalSec);
        }
    }
}
