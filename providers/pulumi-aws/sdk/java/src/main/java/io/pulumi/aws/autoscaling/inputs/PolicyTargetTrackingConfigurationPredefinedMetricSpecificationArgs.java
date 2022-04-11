// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs Empty = new PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs();

    /**
     * Describes a scaling metric for a predictive scaling policy. Valid values are `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, or `ALBRequestCountPerTarget`.
     * 
     */
    @Import(name="predefinedMetricType", required=true)
      private final Output<String> predefinedMetricType;

    public Output<String> getPredefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
     * 
     */
    @Import(name="resourceLabel")
      private final @Nullable Output<String> resourceLabel;

    public Output<String> getResourceLabel() {
        return this.resourceLabel == null ? Codegen.empty() : this.resourceLabel;
    }

    public PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs(
        Output<String> predefinedMetricType,
        @Nullable Output<String> resourceLabel) {
        this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType, "expected parameter 'predefinedMetricType' to be non-null");
        this.resourceLabel = resourceLabel;
    }

    private PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs() {
        this.predefinedMetricType = Codegen.empty();
        this.resourceLabel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> predefinedMetricType;
        private @Nullable Output<String> resourceLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedMetricType = defaults.predefinedMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        public Builder predefinedMetricType(Output<String> predefinedMetricType) {
            this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType);
            return this;
        }
        public Builder predefinedMetricType(String predefinedMetricType) {
            this.predefinedMetricType = Output.of(Objects.requireNonNull(predefinedMetricType));
            return this;
        }
        public Builder resourceLabel(@Nullable Output<String> resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }
        public Builder resourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = Codegen.ofNullable(resourceLabel);
            return this;
        }        public PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs build() {
            return new PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs(predefinedMetricType, resourceLabel);
        }
    }
}
