// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.FixedOrPercentArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Message to configure the rollout at the zonal level for the OS policy assignment.
 * 
 */
public final class OSPolicyAssignmentRolloutArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyAssignmentRolloutArgs Empty = new OSPolicyAssignmentRolloutArgs();

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    @Import(name="disruptionBudget", required=true)
    private Output<FixedOrPercentArgs> disruptionBudget;

    /**
     * @return The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    public Output<FixedOrPercentArgs> disruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    @Import(name="minWaitDuration", required=true)
    private Output<String> minWaitDuration;

    /**
     * @return This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    public Output<String> minWaitDuration() {
        return this.minWaitDuration;
    }

    private OSPolicyAssignmentRolloutArgs() {}

    private OSPolicyAssignmentRolloutArgs(OSPolicyAssignmentRolloutArgs $) {
        this.disruptionBudget = $.disruptionBudget;
        this.minWaitDuration = $.minWaitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyAssignmentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyAssignmentRolloutArgs $;

        public Builder() {
            $ = new OSPolicyAssignmentRolloutArgs();
        }

        public Builder(OSPolicyAssignmentRolloutArgs defaults) {
            $ = new OSPolicyAssignmentRolloutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disruptionBudget The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
         * 
         * @return builder
         * 
         */
        public Builder disruptionBudget(Output<FixedOrPercentArgs> disruptionBudget) {
            $.disruptionBudget = disruptionBudget;
            return this;
        }

        /**
         * @param disruptionBudget The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
         * 
         * @return builder
         * 
         */
        public Builder disruptionBudget(FixedOrPercentArgs disruptionBudget) {
            return disruptionBudget(Output.of(disruptionBudget));
        }

        /**
         * @param minWaitDuration This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
         * 
         * @return builder
         * 
         */
        public Builder minWaitDuration(Output<String> minWaitDuration) {
            $.minWaitDuration = minWaitDuration;
            return this;
        }

        /**
         * @param minWaitDuration This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
         * 
         * @return builder
         * 
         */
        public Builder minWaitDuration(String minWaitDuration) {
            return minWaitDuration(Output.of(minWaitDuration));
        }

        public OSPolicyAssignmentRolloutArgs build() {
            $.disruptionBudget = Objects.requireNonNull($.disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
            $.minWaitDuration = Objects.requireNonNull($.minWaitDuration, "expected parameter 'minWaitDuration' to be non-null");
            return $;
        }
    }

}
