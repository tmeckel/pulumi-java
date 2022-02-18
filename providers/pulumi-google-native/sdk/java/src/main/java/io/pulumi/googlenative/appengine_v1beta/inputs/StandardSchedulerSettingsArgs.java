// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scheduler settings for standard environment.
 * 
 */
public final class StandardSchedulerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardSchedulerSettingsArgs Empty = new StandardSchedulerSettingsArgs();

    /**
     * Maximum number of instances to run for this version. Set to zero to disable max_instances configuration.
     * 
     */
    @InputImport(name="maxInstances")
    private final @Nullable Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances == null ? Input.empty() : this.maxInstances;
    }

    /**
     * Minimum number of instances to run for this version. Set to zero to disable min_instances configuration.
     * 
     */
    @InputImport(name="minInstances")
    private final @Nullable Input<Integer> minInstances;

    public Input<Integer> getMinInstances() {
        return this.minInstances == null ? Input.empty() : this.minInstances;
    }

    /**
     * Target CPU utilization ratio to maintain when scaling.
     * 
     */
    @InputImport(name="targetCpuUtilization")
    private final @Nullable Input<Double> targetCpuUtilization;

    public Input<Double> getTargetCpuUtilization() {
        return this.targetCpuUtilization == null ? Input.empty() : this.targetCpuUtilization;
    }

    /**
     * Target throughput utilization ratio to maintain when scaling
     * 
     */
    @InputImport(name="targetThroughputUtilization")
    private final @Nullable Input<Double> targetThroughputUtilization;

    public Input<Double> getTargetThroughputUtilization() {
        return this.targetThroughputUtilization == null ? Input.empty() : this.targetThroughputUtilization;
    }

    public StandardSchedulerSettingsArgs(
        @Nullable Input<Integer> maxInstances,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<Double> targetCpuUtilization,
        @Nullable Input<Double> targetThroughputUtilization) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.targetCpuUtilization = targetCpuUtilization;
        this.targetThroughputUtilization = targetThroughputUtilization;
    }

    private StandardSchedulerSettingsArgs() {
        this.maxInstances = Input.empty();
        this.minInstances = Input.empty();
        this.targetCpuUtilization = Input.empty();
        this.targetThroughputUtilization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSchedulerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxInstances;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<Double> targetCpuUtilization;
        private @Nullable Input<Double> targetThroughputUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSchedulerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.targetCpuUtilization = defaults.targetCpuUtilization;
    	      this.targetThroughputUtilization = defaults.targetThroughputUtilization;
        }

        public Builder setMaxInstances(@Nullable Input<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Input.ofNullable(maxInstances);
            return this;
        }

        public Builder setMinInstances(@Nullable Input<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = Input.ofNullable(minInstances);
            return this;
        }

        public Builder setTargetCpuUtilization(@Nullable Input<Double> targetCpuUtilization) {
            this.targetCpuUtilization = targetCpuUtilization;
            return this;
        }

        public Builder setTargetCpuUtilization(@Nullable Double targetCpuUtilization) {
            this.targetCpuUtilization = Input.ofNullable(targetCpuUtilization);
            return this;
        }

        public Builder setTargetThroughputUtilization(@Nullable Input<Double> targetThroughputUtilization) {
            this.targetThroughputUtilization = targetThroughputUtilization;
            return this;
        }

        public Builder setTargetThroughputUtilization(@Nullable Double targetThroughputUtilization) {
            this.targetThroughputUtilization = Input.ofNullable(targetThroughputUtilization);
            return this;
        }

        public StandardSchedulerSettingsArgs build() {
            return new StandardSchedulerSettingsArgs(maxInstances, minInstances, targetCpuUtilization, targetThroughputUtilization);
        }
    }
}
