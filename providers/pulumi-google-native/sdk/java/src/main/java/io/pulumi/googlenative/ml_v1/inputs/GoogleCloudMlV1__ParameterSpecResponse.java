// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single hyperparameter to optimize.
 * 
 */
public final class GoogleCloudMlV1__ParameterSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__ParameterSpecResponse Empty = new GoogleCloudMlV1__ParameterSpecResponse();

    /**
     * Required if type is `CATEGORICAL`. The list of possible categories.
     * 
     */
    @InputImport(name="categoricalValues", required=true)
      private final List<String> categoricalValues;

    public List<String> getCategoricalValues() {
        return this.categoricalValues;
    }

    /**
     * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
     * 
     */
    @InputImport(name="discreteValues", required=true)
      private final List<Double> discreteValues;

    public List<Double> getDiscreteValues() {
        return this.discreteValues;
    }

    /**
     * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is `INTEGER`.
     * 
     */
    @InputImport(name="maxValue", required=true)
      private final Double maxValue;

    public Double getMaxValue() {
        return this.maxValue;
    }

    /**
     * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is INTEGER.
     * 
     */
    @InputImport(name="minValue", required=true)
      private final Double minValue;

    public Double getMinValue() {
        return this.minValue;
    }

    /**
     * The parameter name must be unique amongst all ParameterConfigs in a HyperparameterSpec message. E.g., "learning_rate".
     * 
     */
    @InputImport(name="parameterName", required=true)
      private final String parameterName;

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical parameters. Some kind of scaling is strongly recommended for real or integral parameters (e.g., `UNIT_LINEAR_SCALE`).
     * 
     */
    @InputImport(name="scaleType", required=true)
      private final String scaleType;

    public String getScaleType() {
        return this.scaleType;
    }

    /**
     * The type of the parameter.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudMlV1__ParameterSpecResponse(
        List<String> categoricalValues,
        List<Double> discreteValues,
        Double maxValue,
        Double minValue,
        String parameterName,
        String scaleType,
        String type) {
        this.categoricalValues = Objects.requireNonNull(categoricalValues, "expected parameter 'categoricalValues' to be non-null");
        this.discreteValues = Objects.requireNonNull(discreteValues, "expected parameter 'discreteValues' to be non-null");
        this.maxValue = Objects.requireNonNull(maxValue, "expected parameter 'maxValue' to be non-null");
        this.minValue = Objects.requireNonNull(minValue, "expected parameter 'minValue' to be non-null");
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.scaleType = Objects.requireNonNull(scaleType, "expected parameter 'scaleType' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudMlV1__ParameterSpecResponse() {
        this.categoricalValues = List.of();
        this.discreteValues = List.of();
        this.maxValue = null;
        this.minValue = null;
        this.parameterName = null;
        this.scaleType = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ParameterSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> categoricalValues;
        private List<Double> discreteValues;
        private Double maxValue;
        private Double minValue;
        private String parameterName;
        private String scaleType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ParameterSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalValues = defaults.categoricalValues;
    	      this.discreteValues = defaults.discreteValues;
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
    	      this.parameterName = defaults.parameterName;
    	      this.scaleType = defaults.scaleType;
    	      this.type = defaults.type;
        }

        public Builder categoricalValues(List<String> categoricalValues) {
            this.categoricalValues = Objects.requireNonNull(categoricalValues);
            return this;
        }

        public Builder discreteValues(List<Double> discreteValues) {
            this.discreteValues = Objects.requireNonNull(discreteValues);
            return this;
        }

        public Builder maxValue(Double maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder minValue(Double minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder scaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudMlV1__ParameterSpecResponse build() {
            return new GoogleCloudMlV1__ParameterSpecResponse(categoricalValues, discreteValues, maxValue, minValue, parameterName, scaleType, type);
        }
    }
}
