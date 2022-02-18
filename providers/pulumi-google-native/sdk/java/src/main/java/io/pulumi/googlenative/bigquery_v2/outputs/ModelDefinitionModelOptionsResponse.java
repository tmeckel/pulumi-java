// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ModelDefinitionModelOptionsResponse {
    private final List<String> labels;
    private final String lossType;
    private final String modelType;

    @OutputCustomType.Constructor({"labels","lossType","modelType"})
    private ModelDefinitionModelOptionsResponse(
        List<String> labels,
        String lossType,
        String modelType) {
        this.labels = Objects.requireNonNull(labels);
        this.lossType = Objects.requireNonNull(lossType);
        this.modelType = Objects.requireNonNull(modelType);
    }

    public List<String> getLabels() {
        return this.labels;
    }
    public String getLossType() {
        return this.lossType;
    }
    public String getModelType() {
        return this.modelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelDefinitionModelOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> labels;
        private String lossType;
        private String modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelDefinitionModelOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.lossType = defaults.lossType;
    	      this.modelType = defaults.modelType;
        }

        public Builder setLabels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLossType(String lossType) {
            this.lossType = Objects.requireNonNull(lossType);
            return this;
        }

        public Builder setModelType(String modelType) {
            this.modelType = Objects.requireNonNull(modelType);
            return this;
        }

        public ModelDefinitionModelOptionsResponse build() {
            return new ModelDefinitionModelOptionsResponse(labels, lossType, modelType);
        }
    }
}
