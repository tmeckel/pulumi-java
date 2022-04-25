// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.PodTemplateSpec;
import com.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicaSetSpec {
    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    private final @Nullable Integer minReadySeconds;
    /**
     * @return Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    private final @Nullable Integer replicas;
    /**
     * @return Selector is a label query over pods that should match the replica count. If the selector is empty, it is defaulted to the labels present on the pod template. Label keys and values that must match in order to be controlled by this replica set. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    private final @Nullable LabelSelector selector;
    /**
     * @return Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    private final @Nullable PodTemplateSpec template;

    @CustomType.Constructor
    private ReplicaSetSpec(
        @CustomType.Parameter("minReadySeconds") @Nullable Integer minReadySeconds,
        @CustomType.Parameter("replicas") @Nullable Integer replicas,
        @CustomType.Parameter("selector") @Nullable LabelSelector selector,
        @CustomType.Parameter("template") @Nullable PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.replicas = replicas;
        this.selector = selector;
        this.template = template;
    }

    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Optional<Integer> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    /**
     * @return Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * @return Selector is a label query over pods that should match the replica count. If the selector is empty, it is defaulted to the labels present on the pod template. Label keys and values that must match in order to be controlled by this replica set. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    public Optional<PodTemplateSpec> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Integer replicas;
        private @Nullable LabelSelector selector;
        private @Nullable PodTemplateSpec template;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.replicas = defaults.replicas;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
        }

        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        public Builder template(@Nullable PodTemplateSpec template) {
            this.template = template;
            return this;
        }        public ReplicaSetSpec build() {
            return new ReplicaSetSpec(minReadySeconds, replicas, selector, template);
        }
    }
}
