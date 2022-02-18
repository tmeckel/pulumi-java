// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * A message representing a metric in the measurement.
 * 
 */
public final class GoogleCloudMlV1_Measurement_MetricResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_Measurement_MetricResponse Empty = new GoogleCloudMlV1_Measurement_MetricResponse();

    /**
     * Metric name.
     * 
     */
    @InputImport(name="metric", required=true)
    private final String metric;

    public String getMetric() {
        return this.metric;
    }

    /**
     * The value for this metric.
     * 
     */
    @InputImport(name="value", required=true)
    private final Double value;

    public Double getValue() {
        return this.value;
    }

    public GoogleCloudMlV1_Measurement_MetricResponse(
        String metric,
        Double value) {
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudMlV1_Measurement_MetricResponse() {
        this.metric = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_Measurement_MetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metric;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_Measurement_MetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.value = defaults.value;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GoogleCloudMlV1_Measurement_MetricResponse build() {
            return new GoogleCloudMlV1_Measurement_MetricResponse(metric, value);
        }
    }
}
