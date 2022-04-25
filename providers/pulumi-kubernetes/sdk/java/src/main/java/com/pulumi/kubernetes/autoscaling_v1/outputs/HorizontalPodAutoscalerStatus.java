// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerStatus {
    /**
     * @return current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
     * 
     */
    private final @Nullable Integer currentCPUUtilizationPercentage;
    /**
     * @return current number of replicas of pods managed by this autoscaler.
     * 
     */
    private final Integer currentReplicas;
    /**
     * @return desired number of replicas of pods managed by this autoscaler.
     * 
     */
    private final Integer desiredReplicas;
    /**
     * @return last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    private final @Nullable String lastScaleTime;
    /**
     * @return most recent generation observed by this autoscaler.
     * 
     */
    private final @Nullable Integer observedGeneration;

    @CustomType.Constructor
    private HorizontalPodAutoscalerStatus(
        @CustomType.Parameter("currentCPUUtilizationPercentage") @Nullable Integer currentCPUUtilizationPercentage,
        @CustomType.Parameter("currentReplicas") Integer currentReplicas,
        @CustomType.Parameter("desiredReplicas") Integer desiredReplicas,
        @CustomType.Parameter("lastScaleTime") @Nullable String lastScaleTime,
        @CustomType.Parameter("observedGeneration") @Nullable Integer observedGeneration) {
        this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = desiredReplicas;
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    /**
     * @return current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
     * 
     */
    public Optional<Integer> currentCPUUtilizationPercentage() {
        return Optional.ofNullable(this.currentCPUUtilizationPercentage);
    }
    /**
     * @return current number of replicas of pods managed by this autoscaler.
     * 
     */
    public Integer currentReplicas() {
        return this.currentReplicas;
    }
    /**
     * @return desired number of replicas of pods managed by this autoscaler.
     * 
     */
    public Integer desiredReplicas() {
        return this.desiredReplicas;
    }
    /**
     * @return last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    public Optional<String> lastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }
    /**
     * @return most recent generation observed by this autoscaler.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer currentCPUUtilizationPercentage;
        private Integer currentReplicas;
        private Integer desiredReplicas;
        private @Nullable String lastScaleTime;
        private @Nullable Integer observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentCPUUtilizationPercentage = defaults.currentCPUUtilizationPercentage;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder currentCPUUtilizationPercentage(@Nullable Integer currentCPUUtilizationPercentage) {
            this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
            return this;
        }
        public Builder currentReplicas(Integer currentReplicas) {
            this.currentReplicas = Objects.requireNonNull(currentReplicas);
            return this;
        }
        public Builder desiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }
        public Builder lastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }        public HorizontalPodAutoscalerStatus build() {
            return new HorizontalPodAutoscalerStatus(currentCPUUtilizationPercentage, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}
