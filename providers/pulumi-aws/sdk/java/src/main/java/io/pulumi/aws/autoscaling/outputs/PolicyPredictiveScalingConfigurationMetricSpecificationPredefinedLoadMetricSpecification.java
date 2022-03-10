// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification {
    /**
     * Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
     * 
     */
    private final String predefinedMetricType;
    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
     * 
     */
    private final String resourceLabel;

    @OutputCustomType.Constructor
    private PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification(
        @OutputCustomType.Parameter("predefinedMetricType") String predefinedMetricType,
        @OutputCustomType.Parameter("resourceLabel") String resourceLabel) {
        this.predefinedMetricType = predefinedMetricType;
        this.resourceLabel = resourceLabel;
    }

    /**
     * Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
     * 
    */
    public String getPredefinedMetricType() {
        return this.predefinedMetricType;
    }
    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
     * 
    */
    public String getResourceLabel() {
        return this.resourceLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String predefinedMetricType;
        private String resourceLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedMetricType = defaults.predefinedMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        public Builder predefinedMetricType(String predefinedMetricType) {
            this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType);
            return this;
        }

        public Builder resourceLabel(String resourceLabel) {
            this.resourceLabel = Objects.requireNonNull(resourceLabel);
            return this;
        }
        public PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification build() {
            return new PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification(predefinedMetricType, resourceLabel);
        }
    }
}
