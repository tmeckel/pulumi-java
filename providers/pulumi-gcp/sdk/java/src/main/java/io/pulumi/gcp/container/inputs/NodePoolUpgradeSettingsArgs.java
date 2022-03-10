// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class NodePoolUpgradeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolUpgradeSettingsArgs Empty = new NodePoolUpgradeSettingsArgs();

    /**
     * The number of additional nodes that can be added to the node pool during
     * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
     * Can be set to 0 or greater.
     * 
     */
    @InputImport(name="maxSurge", required=true)
      private final Input<Integer> maxSurge;

    public Input<Integer> getMaxSurge() {
        return this.maxSurge;
    }

    /**
     * The number of nodes that can be simultaneously unavailable during
     * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
     * parallel. Can be set to 0 or greater.
     * 
     */
    @InputImport(name="maxUnavailable", required=true)
      private final Input<Integer> maxUnavailable;

    public Input<Integer> getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public NodePoolUpgradeSettingsArgs(
        Input<Integer> maxSurge,
        Input<Integer> maxUnavailable) {
        this.maxSurge = Objects.requireNonNull(maxSurge, "expected parameter 'maxSurge' to be non-null");
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
    }

    private NodePoolUpgradeSettingsArgs() {
        this.maxSurge = Input.empty();
        this.maxUnavailable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolUpgradeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxSurge;
        private Input<Integer> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolUpgradeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(Input<Integer> maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder maxSurge(Integer maxSurge) {
            this.maxSurge = Input.of(Objects.requireNonNull(maxSurge));
            return this;
        }

        public Builder maxUnavailable(Input<Integer> maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder maxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Input.of(Objects.requireNonNull(maxUnavailable));
            return this;
        }
        public NodePoolUpgradeSettingsArgs build() {
            return new NodePoolUpgradeSettingsArgs(maxSurge, maxUnavailable);
        }
    }
}
