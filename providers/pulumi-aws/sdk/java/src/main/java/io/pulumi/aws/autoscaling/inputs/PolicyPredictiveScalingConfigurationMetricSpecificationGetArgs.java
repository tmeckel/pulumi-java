// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs;
import io.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs;
import io.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs Empty = new PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs();

    /**
     * The load metric specification.
     * 
     */
    @Import(name="predefinedLoadMetricSpecification")
      private final @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs> predefinedLoadMetricSpecification;

    public Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs> getPredefinedLoadMetricSpecification() {
        return this.predefinedLoadMetricSpecification == null ? Codegen.empty() : this.predefinedLoadMetricSpecification;
    }

    /**
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * 
     */
    @Import(name="predefinedMetricPairSpecification")
      private final @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs> predefinedMetricPairSpecification;

    public Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs> getPredefinedMetricPairSpecification() {
        return this.predefinedMetricPairSpecification == null ? Codegen.empty() : this.predefinedMetricPairSpecification;
    }

    /**
     * The scaling metric specification.
     * 
     */
    @Import(name="predefinedScalingMetricSpecification")
      private final @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification;

    public Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs> getPredefinedScalingMetricSpecification() {
        return this.predefinedScalingMetricSpecification == null ? Codegen.empty() : this.predefinedScalingMetricSpecification;
    }

    /**
     * The target value for the metric.
     * 
     */
    @Import(name="targetValue", required=true)
      private final Output<Integer> targetValue;

    public Output<Integer> getTargetValue() {
        return this.targetValue;
    }

    public PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs(
        @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs> predefinedLoadMetricSpecification,
        @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs> predefinedMetricPairSpecification,
        @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification,
        Output<Integer> targetValue) {
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
        this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
        this.targetValue = Objects.requireNonNull(targetValue, "expected parameter 'targetValue' to be non-null");
    }

    private PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs() {
        this.predefinedLoadMetricSpecification = Codegen.empty();
        this.predefinedMetricPairSpecification = Codegen.empty();
        this.predefinedScalingMetricSpecification = Codegen.empty();
        this.targetValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs> predefinedLoadMetricSpecification;
        private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs> predefinedMetricPairSpecification;
        private @Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification;
        private Output<Integer> targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedLoadMetricSpecification = defaults.predefinedLoadMetricSpecification;
    	      this.predefinedMetricPairSpecification = defaults.predefinedMetricPairSpecification;
    	      this.predefinedScalingMetricSpecification = defaults.predefinedScalingMetricSpecification;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder predefinedLoadMetricSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs> predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
            return this;
        }
        public Builder predefinedLoadMetricSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationGetArgs predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = Codegen.ofNullable(predefinedLoadMetricSpecification);
            return this;
        }
        public Builder predefinedMetricPairSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs> predefinedMetricPairSpecification) {
            this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
            return this;
        }
        public Builder predefinedMetricPairSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationGetArgs predefinedMetricPairSpecification) {
            this.predefinedMetricPairSpecification = Codegen.ofNullable(predefinedMetricPairSpecification);
            return this;
        }
        public Builder predefinedScalingMetricSpecification(@Nullable Output<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
            return this;
        }
        public Builder predefinedScalingMetricSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationGetArgs predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = Codegen.ofNullable(predefinedScalingMetricSpecification);
            return this;
        }
        public Builder targetValue(Output<Integer> targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public Builder targetValue(Integer targetValue) {
            this.targetValue = Output.of(Objects.requireNonNull(targetValue));
            return this;
        }        public PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs build() {
            return new PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs(predefinedLoadMetricSpecification, predefinedMetricPairSpecification, predefinedScalingMetricSpecification, targetValue);
        }
    }
}
