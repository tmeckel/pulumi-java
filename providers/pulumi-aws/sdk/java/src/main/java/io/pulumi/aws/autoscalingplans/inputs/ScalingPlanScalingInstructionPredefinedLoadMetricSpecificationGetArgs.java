// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs Empty = new ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs();

    /**
     * The metric type. Valid values: `ALBTargetGroupRequestCount`, `ASGTotalCPUUtilization`, `ASGTotalNetworkIn`, `ASGTotalNetworkOut`.
     * 
     */
    @Import(name="predefinedLoadMetricType", required=true)
      private final Output<String> predefinedLoadMetricType;

    public Output<String> getPredefinedLoadMetricType() {
        return this.predefinedLoadMetricType;
    }

    /**
     * Identifies the resource associated with the metric type.
     * 
     */
    @Import(name="resourceLabel")
      private final @Nullable Output<String> resourceLabel;

    public Output<String> getResourceLabel() {
        return this.resourceLabel == null ? Codegen.empty() : this.resourceLabel;
    }

    public ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs(
        Output<String> predefinedLoadMetricType,
        @Nullable Output<String> resourceLabel) {
        this.predefinedLoadMetricType = Objects.requireNonNull(predefinedLoadMetricType, "expected parameter 'predefinedLoadMetricType' to be non-null");
        this.resourceLabel = resourceLabel;
    }

    private ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs() {
        this.predefinedLoadMetricType = Codegen.empty();
        this.resourceLabel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> predefinedLoadMetricType;
        private @Nullable Output<String> resourceLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedLoadMetricType = defaults.predefinedLoadMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        public Builder predefinedLoadMetricType(Output<String> predefinedLoadMetricType) {
            this.predefinedLoadMetricType = Objects.requireNonNull(predefinedLoadMetricType);
            return this;
        }
        public Builder predefinedLoadMetricType(String predefinedLoadMetricType) {
            this.predefinedLoadMetricType = Output.of(Objects.requireNonNull(predefinedLoadMetricType));
            return this;
        }
        public Builder resourceLabel(@Nullable Output<String> resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }
        public Builder resourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = Codegen.ofNullable(resourceLabel);
            return this;
        }        public ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs build() {
            return new ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs(predefinedLoadMetricType, resourceLabel);
        }
    }
}
