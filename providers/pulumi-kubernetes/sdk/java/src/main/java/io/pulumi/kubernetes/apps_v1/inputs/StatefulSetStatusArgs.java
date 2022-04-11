// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.apps_v1.inputs.StatefulSetConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 * 
 */
public final class StatefulSetStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulSetStatusArgs Empty = new StatefulSetStatusArgs();

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset. This is a beta field and enabled/disabled by StatefulSetMinReadySeconds feature gate.
     * 
     */
    @Import(name="availableReplicas", required=true)
      private final Output<Integer> availableReplicas;

    public Output<Integer> getAvailableReplicas() {
        return this.availableReplicas;
    }

    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    @Import(name="collisionCount")
      private final @Nullable Output<Integer> collisionCount;

    public Output<Integer> getCollisionCount() {
        return this.collisionCount == null ? Codegen.empty() : this.collisionCount;
    }

    /**
     * Represents the latest available observations of a statefulset's current state.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<StatefulSetConditionArgs>> conditions;

    public Output<List<StatefulSetConditionArgs>> getConditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    @Import(name="currentReplicas")
      private final @Nullable Output<Integer> currentReplicas;

    public Output<Integer> getCurrentReplicas() {
        return this.currentReplicas == null ? Codegen.empty() : this.currentReplicas;
    }

    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    @Import(name="currentRevision")
      private final @Nullable Output<String> currentRevision;

    public Output<String> getCurrentRevision() {
        return this.currentRevision == null ? Codegen.empty() : this.currentRevision;
    }

    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Codegen.empty() : this.observedGeneration;
    }

    /**
     * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
     * 
     */
    @Import(name="readyReplicas")
      private final @Nullable Output<Integer> readyReplicas;

    public Output<Integer> getReadyReplicas() {
        return this.readyReplicas == null ? Codegen.empty() : this.readyReplicas;
    }

    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    @Import(name="replicas", required=true)
      private final Output<Integer> replicas;

    public Output<Integer> getReplicas() {
        return this.replicas;
    }

    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    @Import(name="updateRevision")
      private final @Nullable Output<String> updateRevision;

    public Output<String> getUpdateRevision() {
        return this.updateRevision == null ? Codegen.empty() : this.updateRevision;
    }

    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    @Import(name="updatedReplicas")
      private final @Nullable Output<Integer> updatedReplicas;

    public Output<Integer> getUpdatedReplicas() {
        return this.updatedReplicas == null ? Codegen.empty() : this.updatedReplicas;
    }

    public StatefulSetStatusArgs(
        Output<Integer> availableReplicas,
        @Nullable Output<Integer> collisionCount,
        @Nullable Output<List<StatefulSetConditionArgs>> conditions,
        @Nullable Output<Integer> currentReplicas,
        @Nullable Output<String> currentRevision,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<Integer> readyReplicas,
        Output<Integer> replicas,
        @Nullable Output<String> updateRevision,
        @Nullable Output<Integer> updatedReplicas) {
        this.availableReplicas = Objects.requireNonNull(availableReplicas, "expected parameter 'availableReplicas' to be non-null");
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.currentReplicas = currentReplicas;
        this.currentRevision = currentRevision;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
        this.updateRevision = updateRevision;
        this.updatedReplicas = updatedReplicas;
    }

    private StatefulSetStatusArgs() {
        this.availableReplicas = Codegen.empty();
        this.collisionCount = Codegen.empty();
        this.conditions = Codegen.empty();
        this.currentReplicas = Codegen.empty();
        this.currentRevision = Codegen.empty();
        this.observedGeneration = Codegen.empty();
        this.readyReplicas = Codegen.empty();
        this.replicas = Codegen.empty();
        this.updateRevision = Codegen.empty();
        this.updatedReplicas = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> availableReplicas;
        private @Nullable Output<Integer> collisionCount;
        private @Nullable Output<List<StatefulSetConditionArgs>> conditions;
        private @Nullable Output<Integer> currentReplicas;
        private @Nullable Output<String> currentRevision;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<Integer> readyReplicas;
        private Output<Integer> replicas;
        private @Nullable Output<String> updateRevision;
        private @Nullable Output<Integer> updatedReplicas;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.currentRevision = defaults.currentRevision;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.updateRevision = defaults.updateRevision;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        public Builder availableReplicas(Output<Integer> availableReplicas) {
            this.availableReplicas = Objects.requireNonNull(availableReplicas);
            return this;
        }
        public Builder availableReplicas(Integer availableReplicas) {
            this.availableReplicas = Output.of(Objects.requireNonNull(availableReplicas));
            return this;
        }
        public Builder collisionCount(@Nullable Output<Integer> collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }
        public Builder collisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = Codegen.ofNullable(collisionCount);
            return this;
        }
        public Builder conditions(@Nullable Output<List<StatefulSetConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<StatefulSetConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(StatefulSetConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder currentReplicas(@Nullable Output<Integer> currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }
        public Builder currentReplicas(@Nullable Integer currentReplicas) {
            this.currentReplicas = Codegen.ofNullable(currentReplicas);
            return this;
        }
        public Builder currentRevision(@Nullable Output<String> currentRevision) {
            this.currentRevision = currentRevision;
            return this;
        }
        public Builder currentRevision(@Nullable String currentRevision) {
            this.currentRevision = Codegen.ofNullable(currentRevision);
            return this;
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Codegen.ofNullable(observedGeneration);
            return this;
        }
        public Builder readyReplicas(@Nullable Output<Integer> readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        public Builder readyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = Codegen.ofNullable(readyReplicas);
            return this;
        }
        public Builder replicas(Output<Integer> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public Builder replicas(Integer replicas) {
            this.replicas = Output.of(Objects.requireNonNull(replicas));
            return this;
        }
        public Builder updateRevision(@Nullable Output<String> updateRevision) {
            this.updateRevision = updateRevision;
            return this;
        }
        public Builder updateRevision(@Nullable String updateRevision) {
            this.updateRevision = Codegen.ofNullable(updateRevision);
            return this;
        }
        public Builder updatedReplicas(@Nullable Output<Integer> updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }
        public Builder updatedReplicas(@Nullable Integer updatedReplicas) {
            this.updatedReplicas = Codegen.ofNullable(updatedReplicas);
            return this;
        }        public StatefulSetStatusArgs build() {
            return new StatefulSetStatusArgs(availableReplicas, collisionCount, conditions, currentReplicas, currentRevision, observedGeneration, readyReplicas, replicas, updateRevision, updatedReplicas);
        }
    }
}
