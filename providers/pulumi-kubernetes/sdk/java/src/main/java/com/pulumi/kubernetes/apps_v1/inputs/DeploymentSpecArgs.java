// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps_v1.inputs.DeploymentStrategyArgs;
import com.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 * 
 */
public final class DeploymentSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecArgs Empty = new DeploymentSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @Import(name="minReadySeconds")
    private @Nullable Output<Integer> minReadySeconds;

    /**
     * @return Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Optional<Output<Integer>> minReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }

    /**
     * Indicates that the deployment is paused.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Indicates that the deployment is paused.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    @Import(name="progressDeadlineSeconds")
    private @Nullable Output<Integer> progressDeadlineSeconds;

    /**
     * @return The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    public Optional<Output<Integer>> progressDeadlineSeconds() {
        return Optional.ofNullable(this.progressDeadlineSeconds);
    }

    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    /**
     * @return Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
    private @Nullable Output<Integer> revisionHistoryLimit;

    /**
     * @return The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    public Optional<Output<Integer>> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }

    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
     * 
     */
    @Import(name="selector", required=true)
    private Output<LabelSelectorArgs> selector;

    /**
     * @return Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
     * 
     */
    public Output<LabelSelectorArgs> selector() {
        return this.selector;
    }

    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<DeploymentStrategyArgs> strategy;

    /**
     * @return The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    public Optional<Output<DeploymentStrategyArgs>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    /**
     * Template describes the pods that will be created.
     * 
     */
    @Import(name="template", required=true)
    private Output<PodTemplateSpecArgs> template;

    /**
     * @return Template describes the pods that will be created.
     * 
     */
    public Output<PodTemplateSpecArgs> template() {
        return this.template;
    }

    private DeploymentSpecArgs() {}

    private DeploymentSpecArgs(DeploymentSpecArgs $) {
        this.minReadySeconds = $.minReadySeconds;
        this.paused = $.paused;
        this.progressDeadlineSeconds = $.progressDeadlineSeconds;
        this.replicas = $.replicas;
        this.revisionHistoryLimit = $.revisionHistoryLimit;
        this.selector = $.selector;
        this.strategy = $.strategy;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSpecArgs $;

        public Builder() {
            $ = new DeploymentSpecArgs();
        }

        public Builder(DeploymentSpecArgs defaults) {
            $ = new DeploymentSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            $.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
         * 
         * @return builder
         * 
         */
        public Builder minReadySeconds(Integer minReadySeconds) {
            return minReadySeconds(Output.of(minReadySeconds));
        }

        /**
         * @param paused Indicates that the deployment is paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Indicates that the deployment is paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param progressDeadlineSeconds The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
         * 
         * @return builder
         * 
         */
        public Builder progressDeadlineSeconds(@Nullable Output<Integer> progressDeadlineSeconds) {
            $.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }

        /**
         * @param progressDeadlineSeconds The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
         * 
         * @return builder
         * 
         */
        public Builder progressDeadlineSeconds(Integer progressDeadlineSeconds) {
            return progressDeadlineSeconds(Output.of(progressDeadlineSeconds));
        }

        /**
         * @param replicas Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param revisionHistoryLimit The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            $.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * @param revisionHistoryLimit The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            return revisionHistoryLimit(Output.of(revisionHistoryLimit));
        }

        /**
         * @param selector Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
         * 
         * @return builder
         * 
         */
        public Builder selector(Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param strategy The deployment strategy to use to replace existing pods with new ones.
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<DeploymentStrategyArgs> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy The deployment strategy to use to replace existing pods with new ones.
         * 
         * @return builder
         * 
         */
        public Builder strategy(DeploymentStrategyArgs strategy) {
            return strategy(Output.of(strategy));
        }

        /**
         * @param template Template describes the pods that will be created.
         * 
         * @return builder
         * 
         */
        public Builder template(Output<PodTemplateSpecArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Template describes the pods that will be created.
         * 
         * @return builder
         * 
         */
        public Builder template(PodTemplateSpecArgs template) {
            return template(Output.of(template));
        }

        public DeploymentSpecArgs build() {
            $.selector = Objects.requireNonNull($.selector, "expected parameter 'selector' to be non-null");
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}
