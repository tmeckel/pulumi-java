// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__BuiltInAlgorithmOutputResponse {
    /**
     * Framework on which the built-in algorithm was trained.
     * 
     */
    private final String framework;
    /**
     * The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don't use hyperparameter tuning.
     * 
     */
    private final String modelPath;
    /**
     * Python version on which the built-in algorithm was trained.
     * 
     */
    private final String pythonVersion;
    /**
     * AI Platform runtime version on which the built-in algorithm was trained.
     * 
     */
    private final String runtimeVersion;

    @OutputCustomType.Constructor({"framework","modelPath","pythonVersion","runtimeVersion"})
    private GoogleCloudMlV1__BuiltInAlgorithmOutputResponse(
        String framework,
        String modelPath,
        String pythonVersion,
        String runtimeVersion) {
        this.framework = Objects.requireNonNull(framework);
        this.modelPath = Objects.requireNonNull(modelPath);
        this.pythonVersion = Objects.requireNonNull(pythonVersion);
        this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
    }

    /**
     * Framework on which the built-in algorithm was trained.
     * 
     */
    public String getFramework() {
        return this.framework;
    }
    /**
     * The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don't use hyperparameter tuning.
     * 
     */
    public String getModelPath() {
        return this.modelPath;
    }
    /**
     * Python version on which the built-in algorithm was trained.
     * 
     */
    public String getPythonVersion() {
        return this.pythonVersion;
    }
    /**
     * AI Platform runtime version on which the built-in algorithm was trained.
     * 
     */
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__BuiltInAlgorithmOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String framework;
        private String modelPath;
        private String pythonVersion;
        private String runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__BuiltInAlgorithmOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.framework = defaults.framework;
    	      this.modelPath = defaults.modelPath;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder setFramework(String framework) {
            this.framework = Objects.requireNonNull(framework);
            return this;
        }

        public Builder setModelPath(String modelPath) {
            this.modelPath = Objects.requireNonNull(modelPath);
            return this;
        }

        public Builder setPythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }

        public Builder setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public GoogleCloudMlV1__BuiltInAlgorithmOutputResponse build() {
            return new GoogleCloudMlV1__BuiltInAlgorithmOutputResponse(framework, modelPath, pythonVersion, runtimeVersion);
        }
    }
}
