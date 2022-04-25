// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.azurenative.servicefabricmesh.outputs.ContainerEventResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.ContainerStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerInstanceViewResponse {
    /**
     * @return Current container instance state.
     * 
     */
    private final @Nullable ContainerStateResponse currentState;
    /**
     * @return The events of this container instance.
     * 
     */
    private final @Nullable List<ContainerEventResponse> events;
    /**
     * @return Previous container instance state.
     * 
     */
    private final @Nullable ContainerStateResponse previousState;
    /**
     * @return The number of times the container has been restarted.
     * 
     */
    private final @Nullable Integer restartCount;

    @CustomType.Constructor
    private ContainerInstanceViewResponse(
        @CustomType.Parameter("currentState") @Nullable ContainerStateResponse currentState,
        @CustomType.Parameter("events") @Nullable List<ContainerEventResponse> events,
        @CustomType.Parameter("previousState") @Nullable ContainerStateResponse previousState,
        @CustomType.Parameter("restartCount") @Nullable Integer restartCount) {
        this.currentState = currentState;
        this.events = events;
        this.previousState = previousState;
        this.restartCount = restartCount;
    }

    /**
     * @return Current container instance state.
     * 
     */
    public Optional<ContainerStateResponse> currentState() {
        return Optional.ofNullable(this.currentState);
    }
    /**
     * @return The events of this container instance.
     * 
     */
    public List<ContainerEventResponse> events() {
        return this.events == null ? List.of() : this.events;
    }
    /**
     * @return Previous container instance state.
     * 
     */
    public Optional<ContainerStateResponse> previousState() {
        return Optional.ofNullable(this.previousState);
    }
    /**
     * @return The number of times the container has been restarted.
     * 
     */
    public Optional<Integer> restartCount() {
        return Optional.ofNullable(this.restartCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerStateResponse currentState;
        private @Nullable List<ContainerEventResponse> events;
        private @Nullable ContainerStateResponse previousState;
        private @Nullable Integer restartCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentState = defaults.currentState;
    	      this.events = defaults.events;
    	      this.previousState = defaults.previousState;
    	      this.restartCount = defaults.restartCount;
        }

        public Builder currentState(@Nullable ContainerStateResponse currentState) {
            this.currentState = currentState;
            return this;
        }
        public Builder events(@Nullable List<ContainerEventResponse> events) {
            this.events = events;
            return this;
        }
        public Builder events(ContainerEventResponse... events) {
            return events(List.of(events));
        }
        public Builder previousState(@Nullable ContainerStateResponse previousState) {
            this.previousState = previousState;
            return this;
        }
        public Builder restartCount(@Nullable Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }        public ContainerInstanceViewResponse build() {
            return new ContainerInstanceViewResponse(currentState, events, previousState, restartCount);
        }
    }
}
