// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.PodTemplateSpec;
import com.pulumi.kubernetes.extensions_v1beta1.outputs.DaemonSetUpdateStrategy;
import com.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DaemonSetSpec {
    /**
     * @return The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
     */
    private final @Nullable Integer minReadySeconds;
    /**
     * @return The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    private final @Nullable Integer revisionHistoryLimit;
    /**
     * @return A label query over pods that are managed by the daemon set. Must match in order to be controlled. If empty, defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    private final @Nullable LabelSelector selector;
    /**
     * @return An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template&#39;s node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    private final PodTemplateSpec template;
    /**
     * @return DEPRECATED. A sequence number representing a specific generation of the template. Populated by the system. It can be set only during the creation.
     * 
     */
    private final @Nullable Integer templateGeneration;
    /**
     * @return An update strategy to replace existing DaemonSet pods with new pods.
     * 
     */
    private final @Nullable DaemonSetUpdateStrategy updateStrategy;

    @CustomType.Constructor
    private DaemonSetSpec(
        @CustomType.Parameter("minReadySeconds") @Nullable Integer minReadySeconds,
        @CustomType.Parameter("revisionHistoryLimit") @Nullable Integer revisionHistoryLimit,
        @CustomType.Parameter("selector") @Nullable LabelSelector selector,
        @CustomType.Parameter("template") PodTemplateSpec template,
        @CustomType.Parameter("templateGeneration") @Nullable Integer templateGeneration,
        @CustomType.Parameter("updateStrategy") @Nullable DaemonSetUpdateStrategy updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.template = template;
        this.templateGeneration = templateGeneration;
        this.updateStrategy = updateStrategy;
    }

    /**
     * @return The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
     */
    public Optional<Integer> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    /**
     * @return The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    public Optional<Integer> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    /**
     * @return A label query over pods that are managed by the daemon set. Must match in order to be controlled. If empty, defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template&#39;s node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    public PodTemplateSpec template() {
        return this.template;
    }
    /**
     * @return DEPRECATED. A sequence number representing a specific generation of the template. Populated by the system. It can be set only during the creation.
     * 
     */
    public Optional<Integer> templateGeneration() {
        return Optional.ofNullable(this.templateGeneration);
    }
    /**
     * @return An update strategy to replace existing DaemonSet pods with new pods.
     * 
     */
    public Optional<DaemonSetUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Integer revisionHistoryLimit;
        private @Nullable LabelSelector selector;
        private PodTemplateSpec template;
        private @Nullable Integer templateGeneration;
        private @Nullable DaemonSetUpdateStrategy updateStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
    	      this.templateGeneration = defaults.templateGeneration;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }
        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }
        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        public Builder template(PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder templateGeneration(@Nullable Integer templateGeneration) {
            this.templateGeneration = templateGeneration;
            return this;
        }
        public Builder updateStrategy(@Nullable DaemonSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }        public DaemonSetSpec build() {
            return new DaemonSetSpec(minReadySeconds, revisionHistoryLimit, selector, template, templateGeneration, updateStrategy);
        }
    }
}
