// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.autoscaling_v1.inputs.CrossVersionObjectReferenceArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * specification of a horizontal pod autoscaler.
 * 
 */
public final class HorizontalPodAutoscalerSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerSpecArgs Empty = new HorizontalPodAutoscalerSpecArgs();

    /**
     * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
     * 
     */
    @Import(name="maxReplicas", required=true)
      private final Output<Integer> maxReplicas;

    public Output<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    @Import(name="minReplicas")
      private final @Nullable Output<Integer> minReplicas;

    public Output<Integer> getMinReplicas() {
        return this.minReplicas == null ? Codegen.empty() : this.minReplicas;
    }

    /**
     * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
     * 
     */
    @Import(name="scaleTargetRef", required=true)
      private final Output<CrossVersionObjectReferenceArgs> scaleTargetRef;

    public Output<CrossVersionObjectReferenceArgs> getScaleTargetRef() {
        return this.scaleTargetRef;
    }

    /**
     * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
     * 
     */
    @Import(name="targetCPUUtilizationPercentage")
      private final @Nullable Output<Integer> targetCPUUtilizationPercentage;

    public Output<Integer> getTargetCPUUtilizationPercentage() {
        return this.targetCPUUtilizationPercentage == null ? Codegen.empty() : this.targetCPUUtilizationPercentage;
    }

    public HorizontalPodAutoscalerSpecArgs(
        Output<Integer> maxReplicas,
        @Nullable Output<Integer> minReplicas,
        Output<CrossVersionObjectReferenceArgs> scaleTargetRef,
        @Nullable Output<Integer> targetCPUUtilizationPercentage) {
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef, "expected parameter 'scaleTargetRef' to be non-null");
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    private HorizontalPodAutoscalerSpecArgs() {
        this.maxReplicas = Codegen.empty();
        this.minReplicas = Codegen.empty();
        this.scaleTargetRef = Codegen.empty();
        this.targetCPUUtilizationPercentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxReplicas;
        private @Nullable Output<Integer> minReplicas;
        private Output<CrossVersionObjectReferenceArgs> scaleTargetRef;
        private @Nullable Output<Integer> targetCPUUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
    	      this.targetCPUUtilizationPercentage = defaults.targetCPUUtilizationPercentage;
        }

        public Builder maxReplicas(Output<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Output.of(Objects.requireNonNull(maxReplicas));
            return this;
        }
        public Builder minReplicas(@Nullable Output<Integer> minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Builder minReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = Codegen.ofNullable(minReplicas);
            return this;
        }
        public Builder scaleTargetRef(Output<CrossVersionObjectReferenceArgs> scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }
        public Builder scaleTargetRef(CrossVersionObjectReferenceArgs scaleTargetRef) {
            this.scaleTargetRef = Output.of(Objects.requireNonNull(scaleTargetRef));
            return this;
        }
        public Builder targetCPUUtilizationPercentage(@Nullable Output<Integer> targetCPUUtilizationPercentage) {
            this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
            return this;
        }
        public Builder targetCPUUtilizationPercentage(@Nullable Integer targetCPUUtilizationPercentage) {
            this.targetCPUUtilizationPercentage = Codegen.ofNullable(targetCPUUtilizationPercentage);
            return this;
        }        public HorizontalPodAutoscalerSpecArgs build() {
            return new HorizontalPodAutoscalerSpecArgs(maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage);
        }
    }
}
