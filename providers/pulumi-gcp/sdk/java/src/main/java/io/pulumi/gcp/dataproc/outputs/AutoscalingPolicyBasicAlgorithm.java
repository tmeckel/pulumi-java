// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.AutoscalingPolicyBasicAlgorithmYarnConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscalingPolicyBasicAlgorithm {
    /**
     * Duration between scaling events. A scaling period starts after the
     * update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * 
     */
    private final @Nullable String cooldownPeriod;
    /**
     * YARN autoscaling configuration.
     * Structure is documented below.
     * 
     */
    private final AutoscalingPolicyBasicAlgorithmYarnConfig yarnConfig;

    @OutputCustomType.Constructor
    private AutoscalingPolicyBasicAlgorithm(
        @OutputCustomType.Parameter("cooldownPeriod") @Nullable String cooldownPeriod,
        @OutputCustomType.Parameter("yarnConfig") AutoscalingPolicyBasicAlgorithmYarnConfig yarnConfig) {
        this.cooldownPeriod = cooldownPeriod;
        this.yarnConfig = yarnConfig;
    }

    /**
     * Duration between scaling events. A scaling period starts after the
     * update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * 
    */
    public Optional<String> getCooldownPeriod() {
        return Optional.ofNullable(this.cooldownPeriod);
    }
    /**
     * YARN autoscaling configuration.
     * Structure is documented below.
     * 
    */
    public AutoscalingPolicyBasicAlgorithmYarnConfig getYarnConfig() {
        return this.yarnConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyBasicAlgorithm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cooldownPeriod;
        private AutoscalingPolicyBasicAlgorithmYarnConfig yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyBasicAlgorithm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder cooldownPeriod(@Nullable String cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }

        public Builder yarnConfig(AutoscalingPolicyBasicAlgorithmYarnConfig yarnConfig) {
            this.yarnConfig = Objects.requireNonNull(yarnConfig);
            return this;
        }
        public AutoscalingPolicyBasicAlgorithm build() {
            return new AutoscalingPolicyBasicAlgorithm(cooldownPeriod, yarnConfig);
        }
    }
}
