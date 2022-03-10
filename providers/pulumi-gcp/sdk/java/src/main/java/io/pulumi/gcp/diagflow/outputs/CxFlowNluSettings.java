// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxFlowNluSettings {
    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold.
     * If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
     */
    private final @Nullable Double classificationThreshold;
    /**
     * Indicates NLU model training mode.
     * * MODEL_TRAINING_MODE_AUTOMATIC: NLU model training is automatically triggered when a flow gets modified. User can also manually trigger model training in this mode.
     * * MODEL_TRAINING_MODE_MANUAL: User needs to manually trigger NLU model training. Best for large flows whose models take long time to train.
     *   Possible values are `MODEL_TRAINING_MODE_AUTOMATIC` and `MODEL_TRAINING_MODE_MANUAL`.
     * 
     */
    private final @Nullable String modelTrainingMode;
    /**
     * Indicates the type of NLU model.
     * * MODEL_TYPE_STANDARD: Use standard NLU model.
     * * MODEL_TYPE_ADVANCED: Use advanced NLU model.
     *   Possible values are `MODEL_TYPE_STANDARD` and `MODEL_TYPE_ADVANCED`.
     * 
     */
    private final @Nullable String modelType;

    @OutputCustomType.Constructor
    private CxFlowNluSettings(
        @OutputCustomType.Parameter("classificationThreshold") @Nullable Double classificationThreshold,
        @OutputCustomType.Parameter("modelTrainingMode") @Nullable String modelTrainingMode,
        @OutputCustomType.Parameter("modelType") @Nullable String modelType) {
        this.classificationThreshold = classificationThreshold;
        this.modelTrainingMode = modelTrainingMode;
        this.modelType = modelType;
    }

    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold.
     * If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
    */
    public Optional<Double> getClassificationThreshold() {
        return Optional.ofNullable(this.classificationThreshold);
    }
    /**
     * Indicates NLU model training mode.
     * * MODEL_TRAINING_MODE_AUTOMATIC: NLU model training is automatically triggered when a flow gets modified. User can also manually trigger model training in this mode.
     * * MODEL_TRAINING_MODE_MANUAL: User needs to manually trigger NLU model training. Best for large flows whose models take long time to train.
     *   Possible values are `MODEL_TRAINING_MODE_AUTOMATIC` and `MODEL_TRAINING_MODE_MANUAL`.
     * 
    */
    public Optional<String> getModelTrainingMode() {
        return Optional.ofNullable(this.modelTrainingMode);
    }
    /**
     * Indicates the type of NLU model.
     * * MODEL_TYPE_STANDARD: Use standard NLU model.
     * * MODEL_TYPE_ADVANCED: Use advanced NLU model.
     *   Possible values are `MODEL_TYPE_STANDARD` and `MODEL_TYPE_ADVANCED`.
     * 
    */
    public Optional<String> getModelType() {
        return Optional.ofNullable(this.modelType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowNluSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double classificationThreshold;
        private @Nullable String modelTrainingMode;
        private @Nullable String modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowNluSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationThreshold = defaults.classificationThreshold;
    	      this.modelTrainingMode = defaults.modelTrainingMode;
    	      this.modelType = defaults.modelType;
        }

        public Builder classificationThreshold(@Nullable Double classificationThreshold) {
            this.classificationThreshold = classificationThreshold;
            return this;
        }

        public Builder modelTrainingMode(@Nullable String modelTrainingMode) {
            this.modelTrainingMode = modelTrainingMode;
            return this;
        }

        public Builder modelType(@Nullable String modelType) {
            this.modelType = modelType;
            return this;
        }
        public CxFlowNluSettings build() {
            return new CxFlowNluSettings(classificationThreshold, modelTrainingMode, modelType);
        }
    }
}
