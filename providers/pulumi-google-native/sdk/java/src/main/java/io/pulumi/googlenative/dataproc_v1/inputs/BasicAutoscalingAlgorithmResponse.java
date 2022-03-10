// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.BasicYarnAutoscalingConfigResponse;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkStandaloneAutoscalingConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Basic algorithm for autoscaling.
 * 
 */
public final class BasicAutoscalingAlgorithmResponse extends io.pulumi.resources.InvokeArgs {

    public static final BasicAutoscalingAlgorithmResponse Empty = new BasicAutoscalingAlgorithmResponse();

    /**
     * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
     * 
     */
    @InputImport(name="cooldownPeriod", required=true)
      private final String cooldownPeriod;

    public String getCooldownPeriod() {
        return this.cooldownPeriod;
    }

    /**
     * Optional. Spark Standalone autoscaling configuration
     * 
     */
    @InputImport(name="sparkStandaloneConfig", required=true)
      private final SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig;

    public SparkStandaloneAutoscalingConfigResponse getSparkStandaloneConfig() {
        return this.sparkStandaloneConfig;
    }

    /**
     * Optional. YARN autoscaling configuration.
     * 
     */
    @InputImport(name="yarnConfig", required=true)
      private final BasicYarnAutoscalingConfigResponse yarnConfig;

    public BasicYarnAutoscalingConfigResponse getYarnConfig() {
        return this.yarnConfig;
    }

    public BasicAutoscalingAlgorithmResponse(
        String cooldownPeriod,
        SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig,
        BasicYarnAutoscalingConfigResponse yarnConfig) {
        this.cooldownPeriod = Objects.requireNonNull(cooldownPeriod, "expected parameter 'cooldownPeriod' to be non-null");
        this.sparkStandaloneConfig = Objects.requireNonNull(sparkStandaloneConfig, "expected parameter 'sparkStandaloneConfig' to be non-null");
        this.yarnConfig = Objects.requireNonNull(yarnConfig, "expected parameter 'yarnConfig' to be non-null");
    }

    private BasicAutoscalingAlgorithmResponse() {
        this.cooldownPeriod = null;
        this.sparkStandaloneConfig = null;
        this.yarnConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAutoscalingAlgorithmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cooldownPeriod;
        private SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig;
        private BasicYarnAutoscalingConfigResponse yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAutoscalingAlgorithmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.sparkStandaloneConfig = defaults.sparkStandaloneConfig;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder cooldownPeriod(String cooldownPeriod) {
            this.cooldownPeriod = Objects.requireNonNull(cooldownPeriod);
            return this;
        }

        public Builder sparkStandaloneConfig(SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig) {
            this.sparkStandaloneConfig = Objects.requireNonNull(sparkStandaloneConfig);
            return this;
        }

        public Builder yarnConfig(BasicYarnAutoscalingConfigResponse yarnConfig) {
            this.yarnConfig = Objects.requireNonNull(yarnConfig);
            return this;
        }
        public BasicAutoscalingAlgorithmResponse build() {
            return new BasicAutoscalingAlgorithmResponse(cooldownPeriod, sparkStandaloneConfig, yarnConfig);
        }
    }
}
