// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * State of the auto-rollout process.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1RolloutStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1RolloutStateArgs Empty = new GoogleCloudDialogflowCxV3beta1RolloutStateArgs();

    /**
     * Start time of the current step.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Display name of the current auto rollout step.
     * 
     */
    @InputImport(name="step")
    private final @Nullable Input<String> step;

    public Input<String> getStep() {
        return this.step == null ? Input.empty() : this.step;
    }

    /**
     * Index of the current step in the auto rollout steps list.
     * 
     */
    @InputImport(name="stepIndex")
    private final @Nullable Input<Integer> stepIndex;

    public Input<Integer> getStepIndex() {
        return this.stepIndex == null ? Input.empty() : this.stepIndex;
    }

    public GoogleCloudDialogflowCxV3beta1RolloutStateArgs(
        @Nullable Input<String> startTime,
        @Nullable Input<String> step,
        @Nullable Input<Integer> stepIndex) {
        this.startTime = startTime;
        this.step = step;
        this.stepIndex = stepIndex;
    }

    private GoogleCloudDialogflowCxV3beta1RolloutStateArgs() {
        this.startTime = Input.empty();
        this.step = Input.empty();
        this.stepIndex = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1RolloutStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> step;
        private @Nullable Input<Integer> stepIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1RolloutStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
    	      this.step = defaults.step;
    	      this.stepIndex = defaults.stepIndex;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setStep(@Nullable Input<String> step) {
            this.step = step;
            return this;
        }

        public Builder setStep(@Nullable String step) {
            this.step = Input.ofNullable(step);
            return this;
        }

        public Builder setStepIndex(@Nullable Input<Integer> stepIndex) {
            this.stepIndex = stepIndex;
            return this;
        }

        public Builder setStepIndex(@Nullable Integer stepIndex) {
            this.stepIndex = Input.ofNullable(stepIndex);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1RolloutStateArgs build() {
            return new GoogleCloudDialogflowCxV3beta1RolloutStateArgs(startTime, step, stepIndex);
        }
    }
}
