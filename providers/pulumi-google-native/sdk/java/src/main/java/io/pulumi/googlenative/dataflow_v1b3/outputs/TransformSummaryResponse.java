// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataflow_v1b3.outputs.DisplayDataResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TransformSummaryResponse {
    /**
     * Transform-specific display data.
     * 
     */
    private final List<DisplayDataResponse> displayData;
    /**
     * User names for all collection inputs to this transform.
     * 
     */
    private final List<String> inputCollectionName;
    /**
     * Type of transform.
     * 
     */
    private final String kind;
    /**
     * User provided name for this transform instance.
     * 
     */
    private final String name;
    /**
     * User names for all collection outputs to this transform.
     * 
     */
    private final List<String> outputCollectionName;

    @OutputCustomType.Constructor({"displayData","inputCollectionName","kind","name","outputCollectionName"})
    private TransformSummaryResponse(
        List<DisplayDataResponse> displayData,
        List<String> inputCollectionName,
        String kind,
        String name,
        List<String> outputCollectionName) {
        this.displayData = Objects.requireNonNull(displayData);
        this.inputCollectionName = Objects.requireNonNull(inputCollectionName);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.outputCollectionName = Objects.requireNonNull(outputCollectionName);
    }

    /**
     * Transform-specific display data.
     * 
     */
    public List<DisplayDataResponse> getDisplayData() {
        return this.displayData;
    }
    /**
     * User names for all collection inputs to this transform.
     * 
     */
    public List<String> getInputCollectionName() {
        return this.inputCollectionName;
    }
    /**
     * Type of transform.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * User provided name for this transform instance.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * User names for all collection outputs to this transform.
     * 
     */
    public List<String> getOutputCollectionName() {
        return this.outputCollectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DisplayDataResponse> displayData;
        private List<String> inputCollectionName;
        private String kind;
        private String name;
        private List<String> outputCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayData = defaults.displayData;
    	      this.inputCollectionName = defaults.inputCollectionName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputCollectionName = defaults.outputCollectionName;
        }

        public Builder setDisplayData(List<DisplayDataResponse> displayData) {
            this.displayData = Objects.requireNonNull(displayData);
            return this;
        }

        public Builder setInputCollectionName(List<String> inputCollectionName) {
            this.inputCollectionName = Objects.requireNonNull(inputCollectionName);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputCollectionName(List<String> outputCollectionName) {
            this.outputCollectionName = Objects.requireNonNull(outputCollectionName);
            return this;
        }

        public TransformSummaryResponse build() {
            return new TransformSummaryResponse(displayData, inputCollectionName, kind, name, outputCollectionName);
        }
    }
}
