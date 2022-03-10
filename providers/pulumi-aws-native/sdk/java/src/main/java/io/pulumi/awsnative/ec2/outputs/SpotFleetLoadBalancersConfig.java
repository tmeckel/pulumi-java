// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.SpotFleetClassicLoadBalancersConfig;
import io.pulumi.awsnative.ec2.outputs.SpotFleetTargetGroupsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetLoadBalancersConfig {
    private final @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig;
    private final @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig;

    @OutputCustomType.Constructor
    private SpotFleetLoadBalancersConfig(
        @OutputCustomType.Parameter("classicLoadBalancersConfig") @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig,
        @OutputCustomType.Parameter("targetGroupsConfig") @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
        this.targetGroupsConfig = targetGroupsConfig;
    }

    public Optional<SpotFleetClassicLoadBalancersConfig> getClassicLoadBalancersConfig() {
        return Optional.ofNullable(this.classicLoadBalancersConfig);
    }
    public Optional<SpotFleetTargetGroupsConfig> getTargetGroupsConfig() {
        return Optional.ofNullable(this.targetGroupsConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetLoadBalancersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig;
        private @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetLoadBalancersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classicLoadBalancersConfig = defaults.classicLoadBalancersConfig;
    	      this.targetGroupsConfig = defaults.targetGroupsConfig;
        }

        public Builder classicLoadBalancersConfig(@Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig) {
            this.classicLoadBalancersConfig = classicLoadBalancersConfig;
            return this;
        }

        public Builder targetGroupsConfig(@Nullable SpotFleetTargetGroupsConfig targetGroupsConfig) {
            this.targetGroupsConfig = targetGroupsConfig;
            return this;
        }
        public SpotFleetLoadBalancersConfig build() {
            return new SpotFleetLoadBalancersConfig(classicLoadBalancersConfig, targetGroupsConfig);
        }
    }
}
