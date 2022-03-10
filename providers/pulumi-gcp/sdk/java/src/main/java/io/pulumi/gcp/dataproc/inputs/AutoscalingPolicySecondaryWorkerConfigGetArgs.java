// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalingPolicySecondaryWorkerConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicySecondaryWorkerConfigGetArgs Empty = new AutoscalingPolicySecondaryWorkerConfigGetArgs();

    /**
     * Maximum number of instances for this group. Note that by default, clusters will not use
     * secondary workers. Required for secondary workers if the minimum secondary instances is set.
     * Bounds: [minInstances, ). Defaults to 0.
     * 
     */
    @InputImport(name="maxInstances")
      private final @Nullable Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances == null ? Input.empty() : this.maxInstances;
    }

    /**
     * Minimum number of instances for this group. Bounds: [0, maxInstances]. Defaults to 0.
     * 
     */
    @InputImport(name="minInstances")
      private final @Nullable Input<Integer> minInstances;

    public Input<Integer> getMinInstances() {
        return this.minInstances == null ? Input.empty() : this.minInstances;
    }

    /**
     * Weight for the instance group, which is used to determine the fraction of total workers
     * in the cluster from this instance group. For example, if primary workers have weight 2,
     * and secondary workers have weight 1, the cluster will have approximately 2 primary workers
     * for each secondary worker.
     * The cluster may not reach the specified balance if constrained by min/max bounds or other
     * autoscaling settings. For example, if maxInstances for secondary workers is 0, then only
     * primary workers will be added. The cluster can also be out of balance when created.
     * If weight is not set on any instance group, the cluster will default to equal weight for
     * all groups: the cluster will attempt to maintain an equal number of workers in each group
     * within the configured size bounds for each group. If weight is set for one group only,
     * the cluster will default to zero weight on the unset group. For example if weight is set
     * only on primary workers, the cluster will use primary workers only and no secondary workers.
     * 
     */
    @InputImport(name="weight")
      private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public AutoscalingPolicySecondaryWorkerConfigGetArgs(
        @Nullable Input<Integer> maxInstances,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<Integer> weight) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.weight = weight;
    }

    private AutoscalingPolicySecondaryWorkerConfigGetArgs() {
        this.maxInstances = Input.empty();
        this.minInstances = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicySecondaryWorkerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxInstances;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicySecondaryWorkerConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.weight = defaults.weight;
        }

        public Builder maxInstances(@Nullable Input<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Input.ofNullable(maxInstances);
            return this;
        }

        public Builder minInstances(@Nullable Input<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = Input.ofNullable(minInstances);
            return this;
        }

        public Builder weight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }
        public AutoscalingPolicySecondaryWorkerConfigGetArgs build() {
            return new AutoscalingPolicySecondaryWorkerConfigGetArgs(maxInstances, minInstances, weight);
        }
    }
}
