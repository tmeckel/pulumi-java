// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class UpgradeSettingsResponse {
    /**
     * The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    private final Integer maxSurge;
    /**
     * The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    private final Integer maxUnavailable;

    @OutputCustomType.Constructor({"maxSurge","maxUnavailable"})
    private UpgradeSettingsResponse(
        Integer maxSurge,
        Integer maxUnavailable) {
        this.maxSurge = Objects.requireNonNull(maxSurge);
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
    }

    /**
     * The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    public Integer getMaxSurge() {
        return this.maxSurge;
    }
    /**
     * The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxSurge;
        private Integer maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxSurge(Integer maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder setMaxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public UpgradeSettingsResponse build() {
            return new UpgradeSettingsResponse(maxSurge, maxUnavailable);
        }
    }
}
