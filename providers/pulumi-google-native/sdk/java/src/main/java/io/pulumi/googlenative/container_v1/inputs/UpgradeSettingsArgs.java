// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * These upgrade settings control the level of parallelism and the level of disruption caused by an upgrade. maxUnavailable controls the number of nodes that can be simultaneously unavailable. maxSurge controls the number of additional nodes that can be added to the node pool temporarily for the time of the upgrade to increase the number of available nodes. (maxUnavailable + maxSurge) determines the level of parallelism (how many nodes are being upgraded at the same time). Note: upgrades inevitably introduce some disruption since workloads need to be moved from old nodes to new, upgraded ones. Even if maxUnavailable=0, this holds true. (Disruption stays within the limits of PodDisruptionBudget, if it is configured.) Consider a hypothetical node pool with 5 nodes having maxSurge=2, maxUnavailable=1. This means the upgrade process upgrades 3 nodes simultaneously. It creates 2 additional (upgraded) nodes, then it brings down 3 old (not yet upgraded) nodes at the same time. This ensures that there are always at least 4 nodes available.
 * 
 */
public final class UpgradeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpgradeSettingsArgs Empty = new UpgradeSettingsArgs();

    /**
     * The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    @Import(name="maxSurge")
      private final @Nullable Output<Integer> maxSurge;

    public Output<Integer> getMaxSurge() {
        return this.maxSurge == null ? Codegen.empty() : this.maxSurge;
    }

    /**
     * The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    @Import(name="maxUnavailable")
      private final @Nullable Output<Integer> maxUnavailable;

    public Output<Integer> getMaxUnavailable() {
        return this.maxUnavailable == null ? Codegen.empty() : this.maxUnavailable;
    }

    public UpgradeSettingsArgs(
        @Nullable Output<Integer> maxSurge,
        @Nullable Output<Integer> maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    private UpgradeSettingsArgs() {
        this.maxSurge = Codegen.empty();
        this.maxUnavailable = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxSurge;
        private @Nullable Output<Integer> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(@Nullable Output<Integer> maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }
        public Builder maxSurge(@Nullable Integer maxSurge) {
            this.maxSurge = Codegen.ofNullable(maxSurge);
            return this;
        }
        public Builder maxUnavailable(@Nullable Output<Integer> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = Codegen.ofNullable(maxUnavailable);
            return this;
        }        public UpgradeSettingsArgs build() {
            return new UpgradeSettingsArgs(maxSurge, maxUnavailable);
        }
    }
}
