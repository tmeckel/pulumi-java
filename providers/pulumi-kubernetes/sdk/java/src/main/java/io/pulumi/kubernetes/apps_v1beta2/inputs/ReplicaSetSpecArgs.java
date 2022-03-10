// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 * 
 */
public final class ReplicaSetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaSetSpecArgs Empty = new ReplicaSetSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @InputImport(name="minReadySeconds")
      private final @Nullable Input<Integer> minReadySeconds;

    public Input<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Input.empty() : this.minReadySeconds;
    }

    /**
     * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    @InputImport(name="replicas")
      private final @Nullable Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    /**
     * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @InputImport(name="selector", required=true)
      private final Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector;
    }

    /**
     * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    @InputImport(name="template")
      private final @Nullable Input<PodTemplateSpecArgs> template;

    public Input<PodTemplateSpecArgs> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    public ReplicaSetSpecArgs(
        @Nullable Input<Integer> minReadySeconds,
        @Nullable Input<Integer> replicas,
        Input<LabelSelectorArgs> selector,
        @Nullable Input<PodTemplateSpecArgs> template) {
        this.minReadySeconds = minReadySeconds;
        this.replicas = replicas;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.template = template;
    }

    private ReplicaSetSpecArgs() {
        this.minReadySeconds = Input.empty();
        this.replicas = Input.empty();
        this.selector = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReadySeconds;
        private @Nullable Input<Integer> replicas;
        private Input<LabelSelectorArgs> selector;
        private @Nullable Input<PodTemplateSpecArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.replicas = defaults.replicas;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
        }

        public Builder minReadySeconds(@Nullable Input<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Input.ofNullable(minReadySeconds);
            return this;
        }

        public Builder replicas(@Nullable Input<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = Input.ofNullable(replicas);
            return this;
        }

        public Builder selector(Input<LabelSelectorArgs> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder selector(LabelSelectorArgs selector) {
            this.selector = Input.of(Objects.requireNonNull(selector));
            return this;
        }

        public Builder template(@Nullable Input<PodTemplateSpecArgs> template) {
            this.template = template;
            return this;
        }

        public Builder template(@Nullable PodTemplateSpecArgs template) {
            this.template = Input.ofNullable(template);
            return this;
        }
        public ReplicaSetSpecArgs build() {
            return new ReplicaSetSpecArgs(minReadySeconds, replicas, selector, template);
        }
    }
}
