// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.enums.ClusterAutoscalingAutoscalingProfile;
import io.pulumi.googlenative.container_v1.inputs.AutoprovisioningNodePoolDefaultsArgs;
import io.pulumi.googlenative.container_v1.inputs.ResourceLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ClusterAutoscaling contains global, per-cluster information required by Cluster Autoscaler to automatically adjust the size of the cluster and create/delete node pools based on the current needs.
 * 
 */
public final class ClusterAutoscalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAutoscalingArgs Empty = new ClusterAutoscalingArgs();

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP.
     * 
     */
    @InputImport(name="autoprovisioningLocations")
    private final @Nullable Input<List<String>> autoprovisioningLocations;

    public Input<List<String>> getAutoprovisioningLocations() {
        return this.autoprovisioningLocations == null ? Input.empty() : this.autoprovisioningLocations;
    }

    /**
     * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
     * 
     */
    @InputImport(name="autoprovisioningNodePoolDefaults")
    private final @Nullable Input<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults;

    public Input<AutoprovisioningNodePoolDefaultsArgs> getAutoprovisioningNodePoolDefaults() {
        return this.autoprovisioningNodePoolDefaults == null ? Input.empty() : this.autoprovisioningNodePoolDefaults;
    }

    /**
     * Defines autoscaling behaviour.
     * 
     */
    @InputImport(name="autoscalingProfile")
    private final @Nullable Input<ClusterAutoscalingAutoscalingProfile> autoscalingProfile;

    public Input<ClusterAutoscalingAutoscalingProfile> getAutoscalingProfile() {
        return this.autoscalingProfile == null ? Input.empty() : this.autoscalingProfile;
    }

    /**
     * Enables automatic node pool creation and deletion.
     * 
     */
    @InputImport(name="enableNodeAutoprovisioning")
    private final @Nullable Input<Boolean> enableNodeAutoprovisioning;

    public Input<Boolean> getEnableNodeAutoprovisioning() {
        return this.enableNodeAutoprovisioning == null ? Input.empty() : this.enableNodeAutoprovisioning;
    }

    /**
     * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
     * 
     */
    @InputImport(name="resourceLimits")
    private final @Nullable Input<List<ResourceLimitArgs>> resourceLimits;

    public Input<List<ResourceLimitArgs>> getResourceLimits() {
        return this.resourceLimits == null ? Input.empty() : this.resourceLimits;
    }

    public ClusterAutoscalingArgs(
        @Nullable Input<List<String>> autoprovisioningLocations,
        @Nullable Input<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults,
        @Nullable Input<ClusterAutoscalingAutoscalingProfile> autoscalingProfile,
        @Nullable Input<Boolean> enableNodeAutoprovisioning,
        @Nullable Input<List<ResourceLimitArgs>> resourceLimits) {
        this.autoprovisioningLocations = autoprovisioningLocations;
        this.autoprovisioningNodePoolDefaults = autoprovisioningNodePoolDefaults;
        this.autoscalingProfile = autoscalingProfile;
        this.enableNodeAutoprovisioning = enableNodeAutoprovisioning;
        this.resourceLimits = resourceLimits;
    }

    private ClusterAutoscalingArgs() {
        this.autoprovisioningLocations = Input.empty();
        this.autoprovisioningNodePoolDefaults = Input.empty();
        this.autoscalingProfile = Input.empty();
        this.enableNodeAutoprovisioning = Input.empty();
        this.resourceLimits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> autoprovisioningLocations;
        private @Nullable Input<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults;
        private @Nullable Input<ClusterAutoscalingAutoscalingProfile> autoscalingProfile;
        private @Nullable Input<Boolean> enableNodeAutoprovisioning;
        private @Nullable Input<List<ResourceLimitArgs>> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAutoscalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioningLocations = defaults.autoprovisioningLocations;
    	      this.autoprovisioningNodePoolDefaults = defaults.autoprovisioningNodePoolDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enableNodeAutoprovisioning = defaults.enableNodeAutoprovisioning;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder setAutoprovisioningLocations(@Nullable Input<List<String>> autoprovisioningLocations) {
            this.autoprovisioningLocations = autoprovisioningLocations;
            return this;
        }

        public Builder setAutoprovisioningLocations(@Nullable List<String> autoprovisioningLocations) {
            this.autoprovisioningLocations = Input.ofNullable(autoprovisioningLocations);
            return this;
        }

        public Builder setAutoprovisioningNodePoolDefaults(@Nullable Input<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults) {
            this.autoprovisioningNodePoolDefaults = autoprovisioningNodePoolDefaults;
            return this;
        }

        public Builder setAutoprovisioningNodePoolDefaults(@Nullable AutoprovisioningNodePoolDefaultsArgs autoprovisioningNodePoolDefaults) {
            this.autoprovisioningNodePoolDefaults = Input.ofNullable(autoprovisioningNodePoolDefaults);
            return this;
        }

        public Builder setAutoscalingProfile(@Nullable Input<ClusterAutoscalingAutoscalingProfile> autoscalingProfile) {
            this.autoscalingProfile = autoscalingProfile;
            return this;
        }

        public Builder setAutoscalingProfile(@Nullable ClusterAutoscalingAutoscalingProfile autoscalingProfile) {
            this.autoscalingProfile = Input.ofNullable(autoscalingProfile);
            return this;
        }

        public Builder setEnableNodeAutoprovisioning(@Nullable Input<Boolean> enableNodeAutoprovisioning) {
            this.enableNodeAutoprovisioning = enableNodeAutoprovisioning;
            return this;
        }

        public Builder setEnableNodeAutoprovisioning(@Nullable Boolean enableNodeAutoprovisioning) {
            this.enableNodeAutoprovisioning = Input.ofNullable(enableNodeAutoprovisioning);
            return this;
        }

        public Builder setResourceLimits(@Nullable Input<List<ResourceLimitArgs>> resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }

        public Builder setResourceLimits(@Nullable List<ResourceLimitArgs> resourceLimits) {
            this.resourceLimits = Input.ofNullable(resourceLimits);
            return this;
        }

        public ClusterAutoscalingArgs build() {
            return new ClusterAutoscalingArgs(autoprovisioningLocations, autoprovisioningNodePoolDefaults, autoscalingProfile, enableNodeAutoprovisioning, resourceLimits);
        }
    }
}
