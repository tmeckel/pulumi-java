// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.extensions_v1beta1.inputs.DaemonSetConditionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DaemonSetStatus represents the current status of a daemon set.
 * 
 */
public final class DaemonSetStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final DaemonSetStatusArgs Empty = new DaemonSetStatusArgs();

    /**
     * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    @Import(name="collisionCount")
    private @Nullable Output<Integer> collisionCount;

    /**
     * @return Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    public Optional<Output<Integer>> collisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }

    /**
     * Represents the latest available observations of a DaemonSet&#39;s current state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<DaemonSetConditionArgs>> conditions;

    /**
     * @return Represents the latest available observations of a DaemonSet&#39;s current state.
     * 
     */
    public Optional<Output<List<DaemonSetConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    @Import(name="currentNumberScheduled", required=true)
    private Output<Integer> currentNumberScheduled;

    /**
     * @return The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    public Output<Integer> currentNumberScheduled() {
        return this.currentNumberScheduled;
    }

    /**
     * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    @Import(name="desiredNumberScheduled", required=true)
    private Output<Integer> desiredNumberScheduled;

    /**
     * @return The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    public Output<Integer> desiredNumberScheduled() {
        return this.desiredNumberScheduled;
    }

    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    @Import(name="numberAvailable")
    private @Nullable Output<Integer> numberAvailable;

    /**
     * @return The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    public Optional<Output<Integer>> numberAvailable() {
        return Optional.ofNullable(this.numberAvailable);
    }

    /**
     * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    @Import(name="numberMisscheduled", required=true)
    private Output<Integer> numberMisscheduled;

    /**
     * @return The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    public Output<Integer> numberMisscheduled() {
        return this.numberMisscheduled;
    }

    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
     * 
     */
    @Import(name="numberReady", required=true)
    private Output<Integer> numberReady;

    /**
     * @return The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
     * 
     */
    public Output<Integer> numberReady() {
        return this.numberReady;
    }

    /**
     * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    @Import(name="numberUnavailable")
    private @Nullable Output<Integer> numberUnavailable;

    /**
     * @return The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    public Optional<Output<Integer>> numberUnavailable() {
        return Optional.ofNullable(this.numberUnavailable);
    }

    /**
     * The most recent generation observed by the daemon set controller.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    /**
     * @return The most recent generation observed by the daemon set controller.
     * 
     */
    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    /**
     * The total number of nodes that are running updated daemon pod
     * 
     */
    @Import(name="updatedNumberScheduled")
    private @Nullable Output<Integer> updatedNumberScheduled;

    /**
     * @return The total number of nodes that are running updated daemon pod
     * 
     */
    public Optional<Output<Integer>> updatedNumberScheduled() {
        return Optional.ofNullable(this.updatedNumberScheduled);
    }

    private DaemonSetStatusArgs() {}

    private DaemonSetStatusArgs(DaemonSetStatusArgs $) {
        this.collisionCount = $.collisionCount;
        this.conditions = $.conditions;
        this.currentNumberScheduled = $.currentNumberScheduled;
        this.desiredNumberScheduled = $.desiredNumberScheduled;
        this.numberAvailable = $.numberAvailable;
        this.numberMisscheduled = $.numberMisscheduled;
        this.numberReady = $.numberReady;
        this.numberUnavailable = $.numberUnavailable;
        this.observedGeneration = $.observedGeneration;
        this.updatedNumberScheduled = $.updatedNumberScheduled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DaemonSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DaemonSetStatusArgs $;

        public Builder() {
            $ = new DaemonSetStatusArgs();
        }

        public Builder(DaemonSetStatusArgs defaults) {
            $ = new DaemonSetStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collisionCount Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
         * 
         * @return builder
         * 
         */
        public Builder collisionCount(@Nullable Output<Integer> collisionCount) {
            $.collisionCount = collisionCount;
            return this;
        }

        /**
         * @param collisionCount Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
         * 
         * @return builder
         * 
         */
        public Builder collisionCount(Integer collisionCount) {
            return collisionCount(Output.of(collisionCount));
        }

        /**
         * @param conditions Represents the latest available observations of a DaemonSet&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<DaemonSetConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Represents the latest available observations of a DaemonSet&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<DaemonSetConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Represents the latest available observations of a DaemonSet&#39;s current state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(DaemonSetConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param currentNumberScheduled The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
         * 
         * @return builder
         * 
         */
        public Builder currentNumberScheduled(Output<Integer> currentNumberScheduled) {
            $.currentNumberScheduled = currentNumberScheduled;
            return this;
        }

        /**
         * @param currentNumberScheduled The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
         * 
         * @return builder
         * 
         */
        public Builder currentNumberScheduled(Integer currentNumberScheduled) {
            return currentNumberScheduled(Output.of(currentNumberScheduled));
        }

        /**
         * @param desiredNumberScheduled The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
         * 
         * @return builder
         * 
         */
        public Builder desiredNumberScheduled(Output<Integer> desiredNumberScheduled) {
            $.desiredNumberScheduled = desiredNumberScheduled;
            return this;
        }

        /**
         * @param desiredNumberScheduled The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
         * 
         * @return builder
         * 
         */
        public Builder desiredNumberScheduled(Integer desiredNumberScheduled) {
            return desiredNumberScheduled(Output.of(desiredNumberScheduled));
        }

        /**
         * @param numberAvailable The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
         * 
         * @return builder
         * 
         */
        public Builder numberAvailable(@Nullable Output<Integer> numberAvailable) {
            $.numberAvailable = numberAvailable;
            return this;
        }

        /**
         * @param numberAvailable The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
         * 
         * @return builder
         * 
         */
        public Builder numberAvailable(Integer numberAvailable) {
            return numberAvailable(Output.of(numberAvailable));
        }

        /**
         * @param numberMisscheduled The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
         * 
         * @return builder
         * 
         */
        public Builder numberMisscheduled(Output<Integer> numberMisscheduled) {
            $.numberMisscheduled = numberMisscheduled;
            return this;
        }

        /**
         * @param numberMisscheduled The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
         * 
         * @return builder
         * 
         */
        public Builder numberMisscheduled(Integer numberMisscheduled) {
            return numberMisscheduled(Output.of(numberMisscheduled));
        }

        /**
         * @param numberReady The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
         * 
         * @return builder
         * 
         */
        public Builder numberReady(Output<Integer> numberReady) {
            $.numberReady = numberReady;
            return this;
        }

        /**
         * @param numberReady The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
         * 
         * @return builder
         * 
         */
        public Builder numberReady(Integer numberReady) {
            return numberReady(Output.of(numberReady));
        }

        /**
         * @param numberUnavailable The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
         * 
         * @return builder
         * 
         */
        public Builder numberUnavailable(@Nullable Output<Integer> numberUnavailable) {
            $.numberUnavailable = numberUnavailable;
            return this;
        }

        /**
         * @param numberUnavailable The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
         * 
         * @return builder
         * 
         */
        public Builder numberUnavailable(Integer numberUnavailable) {
            return numberUnavailable(Output.of(numberUnavailable));
        }

        /**
         * @param observedGeneration The most recent generation observed by the daemon set controller.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * @param observedGeneration The most recent generation observed by the daemon set controller.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        /**
         * @param updatedNumberScheduled The total number of nodes that are running updated daemon pod
         * 
         * @return builder
         * 
         */
        public Builder updatedNumberScheduled(@Nullable Output<Integer> updatedNumberScheduled) {
            $.updatedNumberScheduled = updatedNumberScheduled;
            return this;
        }

        /**
         * @param updatedNumberScheduled The total number of nodes that are running updated daemon pod
         * 
         * @return builder
         * 
         */
        public Builder updatedNumberScheduled(Integer updatedNumberScheduled) {
            return updatedNumberScheduled(Output.of(updatedNumberScheduled));
        }

        public DaemonSetStatusArgs build() {
            $.currentNumberScheduled = Objects.requireNonNull($.currentNumberScheduled, "expected parameter 'currentNumberScheduled' to be non-null");
            $.desiredNumberScheduled = Objects.requireNonNull($.desiredNumberScheduled, "expected parameter 'desiredNumberScheduled' to be non-null");
            $.numberMisscheduled = Objects.requireNonNull($.numberMisscheduled, "expected parameter 'numberMisscheduled' to be non-null");
            $.numberReady = Objects.requireNonNull($.numberReady, "expected parameter 'numberReady' to be non-null");
            return $;
        }
    }

}
