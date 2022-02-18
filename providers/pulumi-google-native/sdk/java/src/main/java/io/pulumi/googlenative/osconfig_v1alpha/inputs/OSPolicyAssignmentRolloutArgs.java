// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.FixedOrPercentArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Message to configure the rollout at the zonal level for the OS policy assignment.
 * 
 */
public final class OSPolicyAssignmentRolloutArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyAssignmentRolloutArgs Empty = new OSPolicyAssignmentRolloutArgs();

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    @InputImport(name="disruptionBudget", required=true)
    private final Input<FixedOrPercentArgs> disruptionBudget;

    public Input<FixedOrPercentArgs> getDisruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    @InputImport(name="minWaitDuration", required=true)
    private final Input<String> minWaitDuration;

    public Input<String> getMinWaitDuration() {
        return this.minWaitDuration;
    }

    public OSPolicyAssignmentRolloutArgs(
        Input<FixedOrPercentArgs> disruptionBudget,
        Input<String> minWaitDuration) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
        this.minWaitDuration = Objects.requireNonNull(minWaitDuration, "expected parameter 'minWaitDuration' to be non-null");
    }

    private OSPolicyAssignmentRolloutArgs() {
        this.disruptionBudget = Input.empty();
        this.minWaitDuration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FixedOrPercentArgs> disruptionBudget;
        private Input<String> minWaitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.minWaitDuration = defaults.minWaitDuration;
        }

        public Builder setDisruptionBudget(Input<FixedOrPercentArgs> disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }

        public Builder setDisruptionBudget(FixedOrPercentArgs disruptionBudget) {
            this.disruptionBudget = Input.of(Objects.requireNonNull(disruptionBudget));
            return this;
        }

        public Builder setMinWaitDuration(Input<String> minWaitDuration) {
            this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
            return this;
        }

        public Builder setMinWaitDuration(String minWaitDuration) {
            this.minWaitDuration = Input.of(Objects.requireNonNull(minWaitDuration));
            return this;
        }

        public OSPolicyAssignmentRolloutArgs build() {
            return new OSPolicyAssignmentRolloutArgs(disruptionBudget, minWaitDuration);
        }
    }
}
