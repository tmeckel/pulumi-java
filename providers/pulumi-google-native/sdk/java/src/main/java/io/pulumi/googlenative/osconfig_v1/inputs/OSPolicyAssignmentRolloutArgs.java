// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1.inputs.FixedOrPercentArgs;
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
    @Import(name="disruptionBudget", required=true)
      private final Output<FixedOrPercentArgs> disruptionBudget;

    public Output<FixedOrPercentArgs> getDisruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    @Import(name="minWaitDuration", required=true)
      private final Output<String> minWaitDuration;

    public Output<String> getMinWaitDuration() {
        return this.minWaitDuration;
    }

    public OSPolicyAssignmentRolloutArgs(
        Output<FixedOrPercentArgs> disruptionBudget,
        Output<String> minWaitDuration) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
        this.minWaitDuration = Objects.requireNonNull(minWaitDuration, "expected parameter 'minWaitDuration' to be non-null");
    }

    private OSPolicyAssignmentRolloutArgs() {
        this.disruptionBudget = Codegen.empty();
        this.minWaitDuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FixedOrPercentArgs> disruptionBudget;
        private Output<String> minWaitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.minWaitDuration = defaults.minWaitDuration;
        }

        public Builder disruptionBudget(Output<FixedOrPercentArgs> disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }
        public Builder disruptionBudget(FixedOrPercentArgs disruptionBudget) {
            this.disruptionBudget = Output.of(Objects.requireNonNull(disruptionBudget));
            return this;
        }
        public Builder minWaitDuration(Output<String> minWaitDuration) {
            this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
            return this;
        }
        public Builder minWaitDuration(String minWaitDuration) {
            this.minWaitDuration = Output.of(Objects.requireNonNull(minWaitDuration));
            return this;
        }        public OSPolicyAssignmentRolloutArgs build() {
            return new OSPolicyAssignmentRolloutArgs(disruptionBudget, minWaitDuration);
        }
    }
}
