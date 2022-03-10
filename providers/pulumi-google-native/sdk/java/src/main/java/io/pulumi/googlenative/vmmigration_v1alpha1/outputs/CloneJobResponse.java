// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.ComputeEngineTargetDetailsResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloneJobResponse {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    private final ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
    /**
     * The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    private final String createTime;
    /**
     * Provides details for the errors that led to the Clone Job's state.
     * 
     */
    private final StatusResponse error;
    /**
     * The name of the clone.
     * 
     */
    private final String name;
    /**
     * State of the clone job.
     * 
     */
    private final String state;
    /**
     * The time the state was last updated.
     * 
     */
    private final String stateTime;

    @OutputCustomType.Constructor
    private CloneJobResponse(
        @OutputCustomType.Parameter("computeEngineTargetDetails") ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("error") StatusResponse error,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("stateTime") String stateTime) {
        this.computeEngineTargetDetails = computeEngineTargetDetails;
        this.createTime = createTime;
        this.error = error;
        this.name = name;
        this.state = state;
        this.stateTime = stateTime;
    }

    /**
     * Details of the target VM in Compute Engine.
     * 
    */
    public ComputeEngineTargetDetailsResponse getComputeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Provides details for the errors that led to the Clone Job's state.
     * 
    */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The name of the clone.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of the clone job.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The time the state was last updated.
     * 
    */
    public String getStateTime() {
        return this.stateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private String createTime;
        private StatusResponse error;
        private String name;
        private String state;
        private String stateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CloneJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.createTime = defaults.createTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
        }

        public Builder computeEngineTargetDetails(ComputeEngineTargetDetailsResponse computeEngineTargetDetails) {
            this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }
        public CloneJobResponse build() {
            return new CloneJobResponse(computeEngineTargetDetails, createTime, error, name, state, stateTime);
        }
    }
}
