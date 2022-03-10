// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerUpdatePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerUpdatePolicyResponse Empty = new InstanceGroupManagerUpdatePolicyResponse();

    /**
     * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
     * 
     */
    @InputImport(name="instanceRedistributionType", required=true)
      private final String instanceRedistributionType;

    public String getInstanceRedistributionType() {
        return this.instanceRedistributionType;
    }

    /**
     * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
     * 
     */
    @InputImport(name="maxSurge", required=true)
      private final FixedOrPercentResponse maxSurge;

    public FixedOrPercentResponse getMaxSurge() {
        return this.maxSurge;
    }

    /**
     * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
     * 
     */
    @InputImport(name="maxUnavailable", required=true)
      private final FixedOrPercentResponse maxUnavailable;

    public FixedOrPercentResponse getMaxUnavailable() {
        return this.maxUnavailable;
    }

    /**
     * Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600].
     * 
     */
    @InputImport(name="minReadySec", required=true)
      private final Integer minReadySec;

    public Integer getMinReadySec() {
        return this.minReadySec;
    }

    /**
     * Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    @InputImport(name="minimalAction", required=true)
      private final String minimalAction;

    public String getMinimalAction() {
        return this.minimalAction;
    }

    /**
     * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
     * 
     */
    @InputImport(name="mostDisruptiveAllowedAction", required=true)
      private final String mostDisruptiveAllowedAction;

    public String getMostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction;
    }

    /**
     * What action should be used to replace instances. See minimal_action.REPLACE
     * 
     */
    @InputImport(name="replacementMethod", required=true)
      private final String replacementMethod;

    public String getReplacementMethod() {
        return this.replacementMethod;
    }

    /**
     * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public InstanceGroupManagerUpdatePolicyResponse(
        String instanceRedistributionType,
        FixedOrPercentResponse maxSurge,
        FixedOrPercentResponse maxUnavailable,
        Integer minReadySec,
        String minimalAction,
        String mostDisruptiveAllowedAction,
        String replacementMethod,
        String type) {
        this.instanceRedistributionType = Objects.requireNonNull(instanceRedistributionType, "expected parameter 'instanceRedistributionType' to be non-null");
        this.maxSurge = Objects.requireNonNull(maxSurge, "expected parameter 'maxSurge' to be non-null");
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
        this.minReadySec = Objects.requireNonNull(minReadySec, "expected parameter 'minReadySec' to be non-null");
        this.minimalAction = Objects.requireNonNull(minimalAction, "expected parameter 'minimalAction' to be non-null");
        this.mostDisruptiveAllowedAction = Objects.requireNonNull(mostDisruptiveAllowedAction, "expected parameter 'mostDisruptiveAllowedAction' to be non-null");
        this.replacementMethod = Objects.requireNonNull(replacementMethod, "expected parameter 'replacementMethod' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceGroupManagerUpdatePolicyResponse() {
        this.instanceRedistributionType = null;
        this.maxSurge = null;
        this.maxUnavailable = null;
        this.minReadySec = null;
        this.minimalAction = null;
        this.mostDisruptiveAllowedAction = null;
        this.replacementMethod = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerUpdatePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceRedistributionType;
        private FixedOrPercentResponse maxSurge;
        private FixedOrPercentResponse maxUnavailable;
        private Integer minReadySec;
        private String minimalAction;
        private String mostDisruptiveAllowedAction;
        private String replacementMethod;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerUpdatePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceRedistributionType = defaults.instanceRedistributionType;
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.minReadySec = defaults.minReadySec;
    	      this.minimalAction = defaults.minimalAction;
    	      this.mostDisruptiveAllowedAction = defaults.mostDisruptiveAllowedAction;
    	      this.replacementMethod = defaults.replacementMethod;
    	      this.type = defaults.type;
        }

        public Builder instanceRedistributionType(String instanceRedistributionType) {
            this.instanceRedistributionType = Objects.requireNonNull(instanceRedistributionType);
            return this;
        }

        public Builder maxSurge(FixedOrPercentResponse maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder maxUnavailable(FixedOrPercentResponse maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder minReadySec(Integer minReadySec) {
            this.minReadySec = Objects.requireNonNull(minReadySec);
            return this;
        }

        public Builder minimalAction(String minimalAction) {
            this.minimalAction = Objects.requireNonNull(minimalAction);
            return this;
        }

        public Builder mostDisruptiveAllowedAction(String mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = Objects.requireNonNull(mostDisruptiveAllowedAction);
            return this;
        }

        public Builder replacementMethod(String replacementMethod) {
            this.replacementMethod = Objects.requireNonNull(replacementMethod);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public InstanceGroupManagerUpdatePolicyResponse build() {
            return new InstanceGroupManagerUpdatePolicyResponse(instanceRedistributionType, maxSurge, maxUnavailable, minReadySec, minimalAction, mostDisruptiveAllowedAction, replacementMethod, type);
        }
    }
}
