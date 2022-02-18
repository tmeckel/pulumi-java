// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * State of the auto-rollout process.
 * 
 */
public final class GoogleCloudDialogflowCxV3RolloutStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3RolloutStateResponse Empty = new GoogleCloudDialogflowCxV3RolloutStateResponse();

    /**
     * Start time of the current step.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Display name of the current auto rollout step.
     * 
     */
    @InputImport(name="step", required=true)
    private final String step;

    public String getStep() {
        return this.step;
    }

    /**
     * Index of the current step in the auto rollout steps list.
     * 
     */
    @InputImport(name="stepIndex", required=true)
    private final Integer stepIndex;

    public Integer getStepIndex() {
        return this.stepIndex;
    }

    public GoogleCloudDialogflowCxV3RolloutStateResponse(
        String startTime,
        String step,
        Integer stepIndex) {
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.step = Objects.requireNonNull(step, "expected parameter 'step' to be non-null");
        this.stepIndex = Objects.requireNonNull(stepIndex, "expected parameter 'stepIndex' to be non-null");
    }

    private GoogleCloudDialogflowCxV3RolloutStateResponse() {
        this.startTime = null;
        this.step = null;
        this.stepIndex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3RolloutStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTime;
        private String step;
        private Integer stepIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3RolloutStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
    	      this.step = defaults.step;
    	      this.stepIndex = defaults.stepIndex;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStep(String step) {
            this.step = Objects.requireNonNull(step);
            return this;
        }

        public Builder setStepIndex(Integer stepIndex) {
            this.stepIndex = Objects.requireNonNull(stepIndex);
            return this;
        }

        public GoogleCloudDialogflowCxV3RolloutStateResponse build() {
            return new GoogleCloudDialogflowCxV3RolloutStateResponse(startTime, step, stepIndex);
        }
    }
}
