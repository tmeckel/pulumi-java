// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementHierarchyControllerArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementHierarchyControllerArgs Empty = new FeatureMembershipConfigmanagementHierarchyControllerArgs();

    /**
     * Whether hierarchical resource quota is enabled in this cluster.
     * 
     */
    @InputImport(name="enableHierarchicalResourceQuota")
      private final @Nullable Input<Boolean> enableHierarchicalResourceQuota;

    public Input<Boolean> getEnableHierarchicalResourceQuota() {
        return this.enableHierarchicalResourceQuota == null ? Input.empty() : this.enableHierarchicalResourceQuota;
    }

    /**
     * Whether pod tree labels are enabled in this cluster.
     * 
     */
    @InputImport(name="enablePodTreeLabels")
      private final @Nullable Input<Boolean> enablePodTreeLabels;

    public Input<Boolean> getEnablePodTreeLabels() {
        return this.enablePodTreeLabels == null ? Input.empty() : this.enablePodTreeLabels;
    }

    /**
     * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public FeatureMembershipConfigmanagementHierarchyControllerArgs(
        @Nullable Input<Boolean> enableHierarchicalResourceQuota,
        @Nullable Input<Boolean> enablePodTreeLabels,
        @Nullable Input<Boolean> enabled) {
        this.enableHierarchicalResourceQuota = enableHierarchicalResourceQuota;
        this.enablePodTreeLabels = enablePodTreeLabels;
        this.enabled = enabled;
    }

    private FeatureMembershipConfigmanagementHierarchyControllerArgs() {
        this.enableHierarchicalResourceQuota = Input.empty();
        this.enablePodTreeLabels = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementHierarchyControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableHierarchicalResourceQuota;
        private @Nullable Input<Boolean> enablePodTreeLabels;
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementHierarchyControllerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHierarchicalResourceQuota = defaults.enableHierarchicalResourceQuota;
    	      this.enablePodTreeLabels = defaults.enablePodTreeLabels;
    	      this.enabled = defaults.enabled;
        }

        public Builder enableHierarchicalResourceQuota(@Nullable Input<Boolean> enableHierarchicalResourceQuota) {
            this.enableHierarchicalResourceQuota = enableHierarchicalResourceQuota;
            return this;
        }

        public Builder enableHierarchicalResourceQuota(@Nullable Boolean enableHierarchicalResourceQuota) {
            this.enableHierarchicalResourceQuota = Input.ofNullable(enableHierarchicalResourceQuota);
            return this;
        }

        public Builder enablePodTreeLabels(@Nullable Input<Boolean> enablePodTreeLabels) {
            this.enablePodTreeLabels = enablePodTreeLabels;
            return this;
        }

        public Builder enablePodTreeLabels(@Nullable Boolean enablePodTreeLabels) {
            this.enablePodTreeLabels = Input.ofNullable(enablePodTreeLabels);
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public FeatureMembershipConfigmanagementHierarchyControllerArgs build() {
            return new FeatureMembershipConfigmanagementHierarchyControllerArgs(enableHierarchicalResourceQuota, enablePodTreeLabels, enabled);
        }
    }
}
