// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.DimensionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CriteriaResponse {
    /**
     * @return List of Dimensions for creating metric
     * 
     */
    private final @Nullable List<DimensionResponse> dimensions;
    /**
     * @return Name of the metric
     * 
     */
    private final String metricName;

    @CustomType.Constructor
    private CriteriaResponse(
        @CustomType.Parameter("dimensions") @Nullable List<DimensionResponse> dimensions,
        @CustomType.Parameter("metricName") String metricName) {
        this.dimensions = dimensions;
        this.metricName = metricName;
    }

    /**
     * @return List of Dimensions for creating metric
     * 
     */
    public List<DimensionResponse> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return Name of the metric
     * 
     */
    public String metricName() {
        return this.metricName;
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
        public Builder dimensions(DimensionResponse... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }        public CriteriaResponse build() {
            return new CriteriaResponse(dimensions, metricName);
        }
    }
}
