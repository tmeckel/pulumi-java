// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.BasicYarnAutoscalingConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BasicAutoscalingAlgorithmResponse {
    /**
     * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
     * 
     */
    private final String cooldownPeriod;
    /**
     * Optional. YARN autoscaling configuration.
     * 
     */
    private final BasicYarnAutoscalingConfigResponse yarnConfig;

    @OutputCustomType.Constructor
    private BasicAutoscalingAlgorithmResponse(
        @OutputCustomType.Parameter("cooldownPeriod") String cooldownPeriod,
        @OutputCustomType.Parameter("yarnConfig") BasicYarnAutoscalingConfigResponse yarnConfig) {
        this.cooldownPeriod = cooldownPeriod;
        this.yarnConfig = yarnConfig;
    }

    /**
     * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
     * 
    */
    public String getCooldownPeriod() {
        return this.cooldownPeriod;
    }
    /**
     * Optional. YARN autoscaling configuration.
     * 
    */
    public BasicYarnAutoscalingConfigResponse getYarnConfig() {
        return this.yarnConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAutoscalingAlgorithmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cooldownPeriod;
        private BasicYarnAutoscalingConfigResponse yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAutoscalingAlgorithmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder cooldownPeriod(String cooldownPeriod) {
            this.cooldownPeriod = Objects.requireNonNull(cooldownPeriod);
            return this;
        }

        public Builder yarnConfig(BasicYarnAutoscalingConfigResponse yarnConfig) {
            this.yarnConfig = Objects.requireNonNull(yarnConfig);
            return this;
        }
        public BasicAutoscalingAlgorithmResponse build() {
            return new BasicAutoscalingAlgorithmResponse(cooldownPeriod, yarnConfig);
        }
    }
}
