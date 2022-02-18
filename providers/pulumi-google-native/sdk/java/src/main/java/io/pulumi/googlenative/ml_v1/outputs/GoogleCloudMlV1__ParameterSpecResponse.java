// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__ParameterSpecResponse {
    /**
     * Required if type is `CATEGORICAL`. The list of possible categories.
     * 
     */
    private final List<String> categoricalValues;
    /**
     * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
     * 
     */
    private final List<Double> discreteValues;
    /**
     * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is `INTEGER`.
     * 
     */
    private final Double maxValue;
    /**
     * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is INTEGER.
     * 
     */
    private final Double minValue;
    /**
     * The parameter name must be unique amongst all ParameterConfigs in a HyperparameterSpec message. E.g., "learning_rate".
     * 
     */
    private final String parameterName;
    /**
     * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical parameters. Some kind of scaling is strongly recommended for real or integral parameters (e.g., `UNIT_LINEAR_SCALE`).
     * 
     */
    private final String scaleType;
    /**
     * The type of the parameter.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"categoricalValues","discreteValues","maxValue","minValue","parameterName","scaleType","type"})
    private GoogleCloudMlV1__ParameterSpecResponse(
        List<String> categoricalValues,
        List<Double> discreteValues,
        Double maxValue,
        Double minValue,
        String parameterName,
        String scaleType,
        String type) {
        this.categoricalValues = Objects.requireNonNull(categoricalValues);
        this.discreteValues = Objects.requireNonNull(discreteValues);
        this.maxValue = Objects.requireNonNull(maxValue);
        this.minValue = Objects.requireNonNull(minValue);
        this.parameterName = Objects.requireNonNull(parameterName);
        this.scaleType = Objects.requireNonNull(scaleType);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Required if type is `CATEGORICAL`. The list of possible categories.
     * 
     */
    public List<String> getCategoricalValues() {
        return this.categoricalValues;
    }
    /**
     * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
     * 
     */
    public List<Double> getDiscreteValues() {
        return this.discreteValues;
    }
    /**
     * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is `INTEGER`.
     * 
     */
    public Double getMaxValue() {
        return this.maxValue;
    }
    /**
     * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is INTEGER.
     * 
     */
    public Double getMinValue() {
        return this.minValue;
    }
    /**
     * The parameter name must be unique amongst all ParameterConfigs in a HyperparameterSpec message. E.g., "learning_rate".
     * 
     */
    public String getParameterName() {
        return this.parameterName;
    }
    /**
     * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical parameters. Some kind of scaling is strongly recommended for real or integral parameters (e.g., `UNIT_LINEAR_SCALE`).
     * 
     */
    public String getScaleType() {
        return this.scaleType;
    }
    /**
     * The type of the parameter.
     * 
     */
    public String getType() {
        return this.type;
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

        public Builder setCategoricalValues(List<String> categoricalValues) {
            this.categoricalValues = Objects.requireNonNull(categoricalValues);
            return this;
        }

        public Builder setDiscreteValues(List<Double> discreteValues) {
            this.discreteValues = Objects.requireNonNull(discreteValues);
            return this;
        }

        public Builder setMaxValue(Double maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder setMinValue(Double minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }

        public Builder setParameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder setScaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GoogleCloudMlV1__ParameterSpecResponse build() {
            return new GoogleCloudMlV1__ParameterSpecResponse(categoricalValues, discreteValues, maxValue, minValue, parameterName, scaleType, type);
        }
    }
}
