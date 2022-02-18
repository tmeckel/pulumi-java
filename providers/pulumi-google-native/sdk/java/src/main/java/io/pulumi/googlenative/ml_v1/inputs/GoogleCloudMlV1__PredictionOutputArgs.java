// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents results of a prediction job.
 * 
 */
public final class GoogleCloudMlV1__PredictionOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__PredictionOutputArgs Empty = new GoogleCloudMlV1__PredictionOutputArgs();

    /**
     * The number of data instances which resulted in errors.
     * 
     */
    @InputImport(name="errorCount")
    private final @Nullable Input<String> errorCount;

    public Input<String> getErrorCount() {
        return this.errorCount == null ? Input.empty() : this.errorCount;
    }

    /**
     * Node hours used by the batch prediction job.
     * 
     */
    @InputImport(name="nodeHours")
    private final @Nullable Input<Double> nodeHours;

    public Input<Double> getNodeHours() {
        return this.nodeHours == null ? Input.empty() : this.nodeHours;
    }

    /**
     * The output Google Cloud Storage location provided at the job creation time.
     * 
     */
    @InputImport(name="outputPath")
    private final @Nullable Input<String> outputPath;

    public Input<String> getOutputPath() {
        return this.outputPath == null ? Input.empty() : this.outputPath;
    }

    /**
     * The number of generated predictions.
     * 
     */
    @InputImport(name="predictionCount")
    private final @Nullable Input<String> predictionCount;

    public Input<String> getPredictionCount() {
        return this.predictionCount == null ? Input.empty() : this.predictionCount;
    }

    public GoogleCloudMlV1__PredictionOutputArgs(
        @Nullable Input<String> errorCount,
        @Nullable Input<Double> nodeHours,
        @Nullable Input<String> outputPath,
        @Nullable Input<String> predictionCount) {
        this.errorCount = errorCount;
        this.nodeHours = nodeHours;
        this.outputPath = outputPath;
        this.predictionCount = predictionCount;
    }

    private GoogleCloudMlV1__PredictionOutputArgs() {
        this.errorCount = Input.empty();
        this.nodeHours = Input.empty();
        this.outputPath = Input.empty();
        this.predictionCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__PredictionOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> errorCount;
        private @Nullable Input<Double> nodeHours;
        private @Nullable Input<String> outputPath;
        private @Nullable Input<String> predictionCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__PredictionOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCount = defaults.errorCount;
    	      this.nodeHours = defaults.nodeHours;
    	      this.outputPath = defaults.outputPath;
    	      this.predictionCount = defaults.predictionCount;
        }

        public Builder setErrorCount(@Nullable Input<String> errorCount) {
            this.errorCount = errorCount;
            return this;
        }

        public Builder setErrorCount(@Nullable String errorCount) {
            this.errorCount = Input.ofNullable(errorCount);
            return this;
        }

        public Builder setNodeHours(@Nullable Input<Double> nodeHours) {
            this.nodeHours = nodeHours;
            return this;
        }

        public Builder setNodeHours(@Nullable Double nodeHours) {
            this.nodeHours = Input.ofNullable(nodeHours);
            return this;
        }

        public Builder setOutputPath(@Nullable Input<String> outputPath) {
            this.outputPath = outputPath;
            return this;
        }

        public Builder setOutputPath(@Nullable String outputPath) {
            this.outputPath = Input.ofNullable(outputPath);
            return this;
        }

        public Builder setPredictionCount(@Nullable Input<String> predictionCount) {
            this.predictionCount = predictionCount;
            return this;
        }

        public Builder setPredictionCount(@Nullable String predictionCount) {
            this.predictionCount = Input.ofNullable(predictionCount);
            return this;
        }

        public GoogleCloudMlV1__PredictionOutputArgs build() {
            return new GoogleCloudMlV1__PredictionOutputArgs(errorCount, nodeHours, outputPath, predictionCount);
        }
    }
}
