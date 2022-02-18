// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CpuUtilizationResponse {
    /**
     * Period of time over which CPU utilization is calculated.
     * 
     */
    private final String aggregationWindowLength;
    /**
     * Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
     * 
     */
    private final Double targetUtilization;

    @OutputCustomType.Constructor({"aggregationWindowLength","targetUtilization"})
    private CpuUtilizationResponse(
        String aggregationWindowLength,
        Double targetUtilization) {
        this.aggregationWindowLength = Objects.requireNonNull(aggregationWindowLength);
        this.targetUtilization = Objects.requireNonNull(targetUtilization);
    }

    /**
     * Period of time over which CPU utilization is calculated.
     * 
     */
    public String getAggregationWindowLength() {
        return this.aggregationWindowLength;
    }
    /**
     * Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
     * 
     */
    public Double getTargetUtilization() {
        return this.targetUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpuUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationWindowLength;
        private Double targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(CpuUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationWindowLength = defaults.aggregationWindowLength;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder setAggregationWindowLength(String aggregationWindowLength) {
            this.aggregationWindowLength = Objects.requireNonNull(aggregationWindowLength);
            return this;
        }

        public Builder setTargetUtilization(Double targetUtilization) {
            this.targetUtilization = Objects.requireNonNull(targetUtilization);
            return this;
        }

        public CpuUtilizationResponse build() {
            return new CpuUtilizationResponse(aggregationWindowLength, targetUtilization);
        }
    }
}
