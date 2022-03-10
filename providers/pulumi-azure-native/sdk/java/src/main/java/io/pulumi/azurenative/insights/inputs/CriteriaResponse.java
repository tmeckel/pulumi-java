// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DimensionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the criteria for converting log to metric.
 * 
 */
public final class CriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final CriteriaResponse Empty = new CriteriaResponse();

    /**
     * List of Dimensions for creating metric
     * 
     */
    @InputImport(name="dimensions")
      private final @Nullable List<DimensionResponse> dimensions;

    public List<DimensionResponse> getDimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }

    /**
     * Name of the metric
     * 
     */
    @InputImport(name="metricName", required=true)
      private final String metricName;

    public String getMetricName() {
        return this.metricName;
    }

    public CriteriaResponse(
        @Nullable List<DimensionResponse> dimensions,
        String metricName) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
    }

    private CriteriaResponse() {
        this.dimensions = List.of();
        this.metricName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DimensionResponse> dimensions;
        private String metricName;

        public Builder() {
    	      // Empty
        }

        public Builder(CriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
        }

        public Builder dimensions(@Nullable List<DimensionResponse> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public CriteriaResponse build() {
            return new CriteriaResponse(dimensions, metricName);
        }
    }
}
