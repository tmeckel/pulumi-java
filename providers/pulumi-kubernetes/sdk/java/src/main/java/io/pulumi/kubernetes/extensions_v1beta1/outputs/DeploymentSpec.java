// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PodTemplateSpec;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.DeploymentStrategy;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.RollbackConfig;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentSpec {
    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    private final @Nullable Integer minReadySeconds;
    /**
     * Indicates that the deployment is paused and will not be processed by the deployment controller.
     * 
     */
    private final @Nullable Boolean paused;
    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
     * 
     */
    private final @Nullable Integer progressDeadlineSeconds;
    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    private final @Nullable Integer replicas;
    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means "retaining all old RelicaSets".
     * 
     */
    private final @Nullable Integer revisionHistoryLimit;
    /**
     * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
     * 
     */
    private final @Nullable RollbackConfig rollbackTo;
    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
     * 
     */
    private final @Nullable LabelSelector selector;
    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    private final @Nullable DeploymentStrategy strategy;
    /**
     * Template describes the pods that will be created.
     * 
     */
    private final PodTemplateSpec template;

    @OutputCustomType.Constructor
    private DeploymentSpec(
        @OutputCustomType.Parameter("minReadySeconds") @Nullable Integer minReadySeconds,
        @OutputCustomType.Parameter("paused") @Nullable Boolean paused,
        @OutputCustomType.Parameter("progressDeadlineSeconds") @Nullable Integer progressDeadlineSeconds,
        @OutputCustomType.Parameter("replicas") @Nullable Integer replicas,
        @OutputCustomType.Parameter("revisionHistoryLimit") @Nullable Integer revisionHistoryLimit,
        @OutputCustomType.Parameter("rollbackTo") @Nullable RollbackConfig rollbackTo,
        @OutputCustomType.Parameter("selector") @Nullable LabelSelector selector,
        @OutputCustomType.Parameter("strategy") @Nullable DeploymentStrategy strategy,
        @OutputCustomType.Parameter("template") PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.rollbackTo = rollbackTo;
        this.selector = selector;
        this.strategy = strategy;
        this.template = template;
    }

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
    */
    public Optional<Integer> getMinReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    /**
     * Indicates that the deployment is paused and will not be processed by the deployment controller.
     * 
    */
    public Optional<Boolean> getPaused() {
        return Optional.ofNullable(this.paused);
    }
    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
     * 
    */
    public Optional<Integer> getProgressDeadlineSeconds() {
        return Optional.ofNullable(this.progressDeadlineSeconds);
    }
    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
    */
    public Optional<Integer> getReplicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means "retaining all old RelicaSets".
     * 
    */
    public Optional<Integer> getRevisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    /**
     * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
     * 
    */
    public Optional<RollbackConfig> getRollbackTo() {
        return Optional.ofNullable(this.rollbackTo);
    }
    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
     * 
    */
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
    */
    public Optional<DeploymentStrategy> getStrategy() {
        return Optional.ofNullable(this.strategy);
    }
    /**
     * Template describes the pods that will be created.
     * 
    */
    public PodTemplateSpec getTemplate() {
        return this.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Boolean paused;
        private @Nullable Integer progressDeadlineSeconds;
        private @Nullable Integer replicas;
        private @Nullable Integer revisionHistoryLimit;
        private @Nullable RollbackConfig rollbackTo;
        private @Nullable LabelSelector selector;
        private @Nullable DeploymentStrategy strategy;
        private PodTemplateSpec template;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.paused = defaults.paused;
    	      this.progressDeadlineSeconds = defaults.progressDeadlineSeconds;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.rollbackTo = defaults.rollbackTo;
    	      this.selector = defaults.selector;
    	      this.strategy = defaults.strategy;
    	      this.template = defaults.template;
        }

        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder paused(@Nullable Boolean paused) {
            this.paused = paused;
            return this;
        }

        public Builder progressDeadlineSeconds(@Nullable Integer progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }

        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder rollbackTo(@Nullable RollbackConfig rollbackTo) {
            this.rollbackTo = rollbackTo;
            return this;
        }

        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        public Builder strategy(@Nullable DeploymentStrategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public Builder template(PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public DeploymentSpec build() {
            return new DeploymentSpec(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, rollbackTo, selector, strategy, template);
        }
    }
}
