// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmYarnConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalingPolicyBasicAlgorithmGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyBasicAlgorithmGetArgs Empty = new AutoscalingPolicyBasicAlgorithmGetArgs();

    /**
     * Duration between scaling events. A scaling period starts after the
     * update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * 
     */
    @Import(name="cooldownPeriod")
      private final @Nullable Output<String> cooldownPeriod;

    public Output<String> getCooldownPeriod() {
        return this.cooldownPeriod == null ? Codegen.empty() : this.cooldownPeriod;
    }

    /**
     * YARN autoscaling configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="yarnConfig", required=true)
      private final Output<AutoscalingPolicyBasicAlgorithmYarnConfigGetArgs> yarnConfig;

    public Output<AutoscalingPolicyBasicAlgorithmYarnConfigGetArgs> getYarnConfig() {
        return this.yarnConfig;
    }

    public AutoscalingPolicyBasicAlgorithmGetArgs(
        @Nullable Output<String> cooldownPeriod,
        Output<AutoscalingPolicyBasicAlgorithmYarnConfigGetArgs> yarnConfig) {
        this.cooldownPeriod = cooldownPeriod;
        this.yarnConfig = Objects.requireNonNull(yarnConfig, "expected parameter 'yarnConfig' to be non-null");
    }

    private AutoscalingPolicyBasicAlgorithmGetArgs() {
        this.cooldownPeriod = Codegen.empty();
        this.yarnConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyBasicAlgorithmGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cooldownPeriod;
        private Output<AutoscalingPolicyBasicAlgorithmYarnConfigGetArgs> yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyBasicAlgorithmGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder cooldownPeriod(@Nullable Output<String> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }
        public Builder cooldownPeriod(@Nullable String cooldownPeriod) {
            this.cooldownPeriod = Codegen.ofNullable(cooldownPeriod);
            return this;
        }
        public Builder yarnConfig(Output<AutoscalingPolicyBasicAlgorithmYarnConfigGetArgs> yarnConfig) {
            this.yarnConfig = Objects.requireNonNull(yarnConfig);
            return this;
        }
        public Builder yarnConfig(AutoscalingPolicyBasicAlgorithmYarnConfigGetArgs yarnConfig) {
            this.yarnConfig = Output.of(Objects.requireNonNull(yarnConfig));
            return this;
        }        public AutoscalingPolicyBasicAlgorithmGetArgs build() {
            return new AutoscalingPolicyBasicAlgorithmGetArgs(cooldownPeriod, yarnConfig);
        }
    }
}
