// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The feature specific settings to be used in the application. These define behaviors that are user configurable.
 * 
 */
public final class FeatureSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureSettingsArgs Empty = new FeatureSettingsArgs();

    /**
     * Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is always true, this setting can be removed.
     * 
     */
    @InputImport(name="splitHealthChecks")
    private final @Nullable Input<Boolean> splitHealthChecks;

    public Input<Boolean> getSplitHealthChecks() {
        return this.splitHealthChecks == null ? Input.empty() : this.splitHealthChecks;
    }

    /**
     * If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base image for VMs, rather than a base Debian image.
     * 
     */
    @InputImport(name="useContainerOptimizedOs")
    private final @Nullable Input<Boolean> useContainerOptimizedOs;

    public Input<Boolean> getUseContainerOptimizedOs() {
        return this.useContainerOptimizedOs == null ? Input.empty() : this.useContainerOptimizedOs;
    }

    public FeatureSettingsArgs(
        @Nullable Input<Boolean> splitHealthChecks,
        @Nullable Input<Boolean> useContainerOptimizedOs) {
        this.splitHealthChecks = splitHealthChecks;
        this.useContainerOptimizedOs = useContainerOptimizedOs;
    }

    private FeatureSettingsArgs() {
        this.splitHealthChecks = Input.empty();
        this.useContainerOptimizedOs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> splitHealthChecks;
        private @Nullable Input<Boolean> useContainerOptimizedOs;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitHealthChecks = defaults.splitHealthChecks;
    	      this.useContainerOptimizedOs = defaults.useContainerOptimizedOs;
        }

        public Builder setSplitHealthChecks(@Nullable Input<Boolean> splitHealthChecks) {
            this.splitHealthChecks = splitHealthChecks;
            return this;
        }

        public Builder setSplitHealthChecks(@Nullable Boolean splitHealthChecks) {
            this.splitHealthChecks = Input.ofNullable(splitHealthChecks);
            return this;
        }

        public Builder setUseContainerOptimizedOs(@Nullable Input<Boolean> useContainerOptimizedOs) {
            this.useContainerOptimizedOs = useContainerOptimizedOs;
            return this;
        }

        public Builder setUseContainerOptimizedOs(@Nullable Boolean useContainerOptimizedOs) {
            this.useContainerOptimizedOs = Input.ofNullable(useContainerOptimizedOs);
            return this;
        }

        public FeatureSettingsArgs build() {
            return new FeatureSettingsArgs(splitHealthChecks, useContainerOptimizedOs);
        }
    }
}
