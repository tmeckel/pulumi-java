// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlTrainingRunArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelDefinitionModelOptionsArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelDefinitionArgs Empty = new ModelDefinitionArgs();

    /**
     * [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
     * 
     */
    @InputImport(name="modelOptions")
      private final @Nullable Input<ModelDefinitionModelOptionsArgs> modelOptions;

    public Input<ModelDefinitionModelOptionsArgs> getModelOptions() {
        return this.modelOptions == null ? Input.empty() : this.modelOptions;
    }

    /**
     * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
     * 
     */
    @InputImport(name="trainingRuns")
      private final @Nullable Input<List<BqmlTrainingRunArgs>> trainingRuns;

    public Input<List<BqmlTrainingRunArgs>> getTrainingRuns() {
        return this.trainingRuns == null ? Input.empty() : this.trainingRuns;
    }

    public ModelDefinitionArgs(
        @Nullable Input<ModelDefinitionModelOptionsArgs> modelOptions,
        @Nullable Input<List<BqmlTrainingRunArgs>> trainingRuns) {
        this.modelOptions = modelOptions;
        this.trainingRuns = trainingRuns;
    }

    private ModelDefinitionArgs() {
        this.modelOptions = Input.empty();
        this.trainingRuns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ModelDefinitionModelOptionsArgs> modelOptions;
        private @Nullable Input<List<BqmlTrainingRunArgs>> trainingRuns;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelOptions = defaults.modelOptions;
    	      this.trainingRuns = defaults.trainingRuns;
        }

        public Builder modelOptions(@Nullable Input<ModelDefinitionModelOptionsArgs> modelOptions) {
            this.modelOptions = modelOptions;
            return this;
        }

        public Builder modelOptions(@Nullable ModelDefinitionModelOptionsArgs modelOptions) {
            this.modelOptions = Input.ofNullable(modelOptions);
            return this;
        }

        public Builder trainingRuns(@Nullable Input<List<BqmlTrainingRunArgs>> trainingRuns) {
            this.trainingRuns = trainingRuns;
            return this;
        }

        public Builder trainingRuns(@Nullable List<BqmlTrainingRunArgs> trainingRuns) {
            this.trainingRuns = Input.ofNullable(trainingRuns);
            return this;
        }
        public ModelDefinitionArgs build() {
            return new ModelDefinitionArgs(modelOptions, trainingRuns);
        }
    }
}
