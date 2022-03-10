// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs Empty = new SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs();

    /**
     * Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    @InputImport(name="count", required=true)
      private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    /**
     * Interval over which the threshold is computed.
     * 
     */
    @InputImport(name="intervalSec", required=true)
      private final Input<Integer> intervalSec;

    public Input<Integer> getIntervalSec() {
        return this.intervalSec;
    }

    public SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs(
        Input<Integer> count,
        Input<Integer> intervalSec) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.intervalSec = Objects.requireNonNull(intervalSec, "expected parameter 'intervalSec' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs() {
        this.count = Input.empty();
        this.intervalSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private Input<Integer> intervalSec;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalSec = defaults.intervalSec;
        }

        public Builder count(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder count(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder intervalSec(Input<Integer> intervalSec) {
            this.intervalSec = Objects.requireNonNull(intervalSec);
            return this;
        }

        public Builder intervalSec(Integer intervalSec) {
            this.intervalSec = Input.of(Objects.requireNonNull(intervalSec));
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs(count, intervalSec);
        }
    }
}
