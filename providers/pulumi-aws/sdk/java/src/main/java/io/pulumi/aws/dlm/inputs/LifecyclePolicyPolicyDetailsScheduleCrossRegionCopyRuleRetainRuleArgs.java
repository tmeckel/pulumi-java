// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs Empty = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs();

    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    @InputImport(name="interval", required=true)
      private final Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval;
    }

    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    @InputImport(name="intervalUnit", required=true)
      private final Input<String> intervalUnit;

    public Input<String> getIntervalUnit() {
        return this.intervalUnit;
    }

    public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs(
        Input<Integer> interval,
        Input<String> intervalUnit) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.intervalUnit = Objects.requireNonNull(intervalUnit, "expected parameter 'intervalUnit' to be non-null");
    }

    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs() {
        this.interval = Input.empty();
        this.intervalUnit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> interval;
        private Input<String> intervalUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
        }

        public Builder interval(Input<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder interval(Integer interval) {
            this.interval = Input.of(Objects.requireNonNull(interval));
            return this;
        }

        public Builder intervalUnit(Input<String> intervalUnit) {
            this.intervalUnit = Objects.requireNonNull(intervalUnit);
            return this;
        }

        public Builder intervalUnit(String intervalUnit) {
            this.intervalUnit = Input.of(Objects.requireNonNull(intervalUnit));
            return this;
        }
        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs build() {
            return new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs(interval, intervalUnit);
        }
    }
}
