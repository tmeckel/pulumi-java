// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.outputs;

import io.pulumi.aws.autoscalingplans.outputs.ScalingPlanScalingInstructionCustomizedLoadMetricSpecification;
import io.pulumi.aws.autoscalingplans.outputs.ScalingPlanScalingInstructionPredefinedLoadMetricSpecification;
import io.pulumi.aws.autoscalingplans.outputs.ScalingPlanScalingInstructionTargetTrackingConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScalingPlanScalingInstruction {
    /**
     * The customized load metric to use for predictive scaling. You must specify either `customized_load_metric_specification` or `predefined_load_metric_specification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
     * 
     */
    private final @Nullable ScalingPlanScalingInstructionCustomizedLoadMetricSpecification customizedLoadMetricSpecification;
    /**
     * Boolean controlling whether dynamic scaling by AWS Auto Scaling is disabled. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean disableDynamicScaling;
    /**
     * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting for `predictive_scaling_max_capacity_behavior`.
     * 
     */
    private final Integer maxCapacity;
    /**
     * The minimum capacity of the resource.
     * 
     */
    private final Integer minCapacity;
    /**
     * The predefined load metric to use for predictive scaling. You must specify either `predefined_load_metric_specification` or `customized_load_metric_specification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
     * 
     */
    private final @Nullable ScalingPlanScalingInstructionPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
    /**
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource.
     * Valid values: `SetForecastCapacityToMaxCapacity`, `SetMaxCapacityAboveForecastCapacity`, `SetMaxCapacityToForecastCapacity`.
     * 
     */
    private final @Nullable String predictiveScalingMaxCapacityBehavior;
    /**
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * 
     */
    private final @Nullable Integer predictiveScalingMaxCapacityBuffer;
    /**
     * The predictive scaling mode. Valid values: `ForecastAndScale`, `ForecastOnly`.
     * 
     */
    private final @Nullable String predictiveScalingMode;
    /**
     * The ID of the resource. This string consists of the resource type and unique identifier.
     * 
     */
    private final String resourceId;
    /**
     * The scalable dimension associated with the resource. Valid values: `autoscaling:autoScalingGroup:DesiredCapacity`, `dynamodb:index:ReadCapacityUnits`, `dynamodb:index:WriteCapacityUnits`, `dynamodb:table:ReadCapacityUnits`, `dynamodb:table:WriteCapacityUnits`, `ecs:service:DesiredCount`, `ec2:spot-fleet-request:TargetCapacity`, `rds:cluster:ReadReplicaCount`.
     * 
     */
    private final String scalableDimension;
    /**
     * Controls whether a resource's externally created scaling policies are kept or replaced. Valid values: `KeepExternalPolicies`, `ReplaceExternalPolicies`. Defaults to `KeepExternalPolicies`.
     * 
     */
    private final @Nullable String scalingPolicyUpdateBehavior;
    /**
     * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out.
     * 
     */
    private final @Nullable Integer scheduledActionBufferTime;
    /**
     * The namespace of the AWS service. Valid values: `autoscaling`, `dynamodb`, `ecs`, `ec2`, `rds`.
     * 
     */
    private final String serviceNamespace;
    /**
     * The structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
     * 
     */
    private final List<ScalingPlanScalingInstructionTargetTrackingConfiguration> targetTrackingConfigurations;

    @OutputCustomType.Constructor
    private ScalingPlanScalingInstruction(
        @OutputCustomType.Parameter("customizedLoadMetricSpecification") @Nullable ScalingPlanScalingInstructionCustomizedLoadMetricSpecification customizedLoadMetricSpecification,
        @OutputCustomType.Parameter("disableDynamicScaling") @Nullable Boolean disableDynamicScaling,
        @OutputCustomType.Parameter("maxCapacity") Integer maxCapacity,
        @OutputCustomType.Parameter("minCapacity") Integer minCapacity,
        @OutputCustomType.Parameter("predefinedLoadMetricSpecification") @Nullable ScalingPlanScalingInstructionPredefinedLoadMetricSpecification predefinedLoadMetricSpecification,
        @OutputCustomType.Parameter("predictiveScalingMaxCapacityBehavior") @Nullable String predictiveScalingMaxCapacityBehavior,
        @OutputCustomType.Parameter("predictiveScalingMaxCapacityBuffer") @Nullable Integer predictiveScalingMaxCapacityBuffer,
        @OutputCustomType.Parameter("predictiveScalingMode") @Nullable String predictiveScalingMode,
        @OutputCustomType.Parameter("resourceId") String resourceId,
        @OutputCustomType.Parameter("scalableDimension") String scalableDimension,
        @OutputCustomType.Parameter("scalingPolicyUpdateBehavior") @Nullable String scalingPolicyUpdateBehavior,
        @OutputCustomType.Parameter("scheduledActionBufferTime") @Nullable Integer scheduledActionBufferTime,
        @OutputCustomType.Parameter("serviceNamespace") String serviceNamespace,
        @OutputCustomType.Parameter("targetTrackingConfigurations") List<ScalingPlanScalingInstructionTargetTrackingConfiguration> targetTrackingConfigurations) {
        this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
        this.disableDynamicScaling = disableDynamicScaling;
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
        this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior;
        this.predictiveScalingMaxCapacityBuffer = predictiveScalingMaxCapacityBuffer;
        this.predictiveScalingMode = predictiveScalingMode;
        this.resourceId = resourceId;
        this.scalableDimension = scalableDimension;
        this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior;
        this.scheduledActionBufferTime = scheduledActionBufferTime;
        this.serviceNamespace = serviceNamespace;
        this.targetTrackingConfigurations = targetTrackingConfigurations;
    }

    /**
     * The customized load metric to use for predictive scaling. You must specify either `customized_load_metric_specification` or `predefined_load_metric_specification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
     * 
    */
    public Optional<ScalingPlanScalingInstructionCustomizedLoadMetricSpecification> getCustomizedLoadMetricSpecification() {
        return Optional.ofNullable(this.customizedLoadMetricSpecification);
    }
    /**
     * Boolean controlling whether dynamic scaling by AWS Auto Scaling is disabled. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getDisableDynamicScaling() {
        return Optional.ofNullable(this.disableDynamicScaling);
    }
    /**
     * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting for `predictive_scaling_max_capacity_behavior`.
     * 
    */
    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }
    /**
     * The minimum capacity of the resource.
     * 
    */
    public Integer getMinCapacity() {
        return this.minCapacity;
    }
    /**
     * The predefined load metric to use for predictive scaling. You must specify either `predefined_load_metric_specification` or `customized_load_metric_specification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
     * 
    */
    public Optional<ScalingPlanScalingInstructionPredefinedLoadMetricSpecification> getPredefinedLoadMetricSpecification() {
        return Optional.ofNullable(this.predefinedLoadMetricSpecification);
    }
    /**
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource.
     * Valid values: `SetForecastCapacityToMaxCapacity`, `SetMaxCapacityAboveForecastCapacity`, `SetMaxCapacityToForecastCapacity`.
     * 
    */
    public Optional<String> getPredictiveScalingMaxCapacityBehavior() {
        return Optional.ofNullable(this.predictiveScalingMaxCapacityBehavior);
    }
    /**
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * 
    */
    public Optional<Integer> getPredictiveScalingMaxCapacityBuffer() {
        return Optional.ofNullable(this.predictiveScalingMaxCapacityBuffer);
    }
    /**
     * The predictive scaling mode. Valid values: `ForecastAndScale`, `ForecastOnly`.
     * 
    */
    public Optional<String> getPredictiveScalingMode() {
        return Optional.ofNullable(this.predictiveScalingMode);
    }
    /**
     * The ID of the resource. This string consists of the resource type and unique identifier.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * The scalable dimension associated with the resource. Valid values: `autoscaling:autoScalingGroup:DesiredCapacity`, `dynamodb:index:ReadCapacityUnits`, `dynamodb:index:WriteCapacityUnits`, `dynamodb:table:ReadCapacityUnits`, `dynamodb:table:WriteCapacityUnits`, `ecs:service:DesiredCount`, `ec2:spot-fleet-request:TargetCapacity`, `rds:cluster:ReadReplicaCount`.
     * 
    */
    public String getScalableDimension() {
        return this.scalableDimension;
    }
    /**
     * Controls whether a resource's externally created scaling policies are kept or replaced. Valid values: `KeepExternalPolicies`, `ReplaceExternalPolicies`. Defaults to `KeepExternalPolicies`.
     * 
    */
    public Optional<String> getScalingPolicyUpdateBehavior() {
        return Optional.ofNullable(this.scalingPolicyUpdateBehavior);
    }
    /**
     * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out.
     * 
    */
    public Optional<Integer> getScheduledActionBufferTime() {
        return Optional.ofNullable(this.scheduledActionBufferTime);
    }
    /**
     * The namespace of the AWS service. Valid values: `autoscaling`, `dynamodb`, `ecs`, `ec2`, `rds`.
     * 
    */
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }
    /**
     * The structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
     * 
    */
    public List<ScalingPlanScalingInstructionTargetTrackingConfiguration> getTargetTrackingConfigurations() {
        return this.targetTrackingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstruction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScalingPlanScalingInstructionCustomizedLoadMetricSpecification customizedLoadMetricSpecification;
        private @Nullable Boolean disableDynamicScaling;
        private Integer maxCapacity;
        private Integer minCapacity;
        private @Nullable ScalingPlanScalingInstructionPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
        private @Nullable String predictiveScalingMaxCapacityBehavior;
        private @Nullable Integer predictiveScalingMaxCapacityBuffer;
        private @Nullable String predictiveScalingMode;
        private String resourceId;
        private String scalableDimension;
        private @Nullable String scalingPolicyUpdateBehavior;
        private @Nullable Integer scheduledActionBufferTime;
        private String serviceNamespace;
        private List<ScalingPlanScalingInstructionTargetTrackingConfiguration> targetTrackingConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstruction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customizedLoadMetricSpecification = defaults.customizedLoadMetricSpecification;
    	      this.disableDynamicScaling = defaults.disableDynamicScaling;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.predefinedLoadMetricSpecification = defaults.predefinedLoadMetricSpecification;
    	      this.predictiveScalingMaxCapacityBehavior = defaults.predictiveScalingMaxCapacityBehavior;
    	      this.predictiveScalingMaxCapacityBuffer = defaults.predictiveScalingMaxCapacityBuffer;
    	      this.predictiveScalingMode = defaults.predictiveScalingMode;
    	      this.resourceId = defaults.resourceId;
    	      this.scalableDimension = defaults.scalableDimension;
    	      this.scalingPolicyUpdateBehavior = defaults.scalingPolicyUpdateBehavior;
    	      this.scheduledActionBufferTime = defaults.scheduledActionBufferTime;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.targetTrackingConfigurations = defaults.targetTrackingConfigurations;
        }

        public Builder customizedLoadMetricSpecification(@Nullable ScalingPlanScalingInstructionCustomizedLoadMetricSpecification customizedLoadMetricSpecification) {
            this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
            return this;
        }

        public Builder disableDynamicScaling(@Nullable Boolean disableDynamicScaling) {
            this.disableDynamicScaling = disableDynamicScaling;
            return this;
        }

        public Builder maxCapacity(Integer maxCapacity) {
            this.maxCapacity = Objects.requireNonNull(maxCapacity);
            return this;
        }

        public Builder minCapacity(Integer minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }

        public Builder predefinedLoadMetricSpecification(@Nullable ScalingPlanScalingInstructionPredefinedLoadMetricSpecification predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
            return this;
        }

        public Builder predictiveScalingMaxCapacityBehavior(@Nullable String predictiveScalingMaxCapacityBehavior) {
            this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior;
            return this;
        }

        public Builder predictiveScalingMaxCapacityBuffer(@Nullable Integer predictiveScalingMaxCapacityBuffer) {
            this.predictiveScalingMaxCapacityBuffer = predictiveScalingMaxCapacityBuffer;
            return this;
        }

        public Builder predictiveScalingMode(@Nullable String predictiveScalingMode) {
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder scalableDimension(String scalableDimension) {
            this.scalableDimension = Objects.requireNonNull(scalableDimension);
            return this;
        }

        public Builder scalingPolicyUpdateBehavior(@Nullable String scalingPolicyUpdateBehavior) {
            this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior;
            return this;
        }

        public Builder scheduledActionBufferTime(@Nullable Integer scheduledActionBufferTime) {
            this.scheduledActionBufferTime = scheduledActionBufferTime;
            return this;
        }

        public Builder serviceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }

        public Builder targetTrackingConfigurations(List<ScalingPlanScalingInstructionTargetTrackingConfiguration> targetTrackingConfigurations) {
            this.targetTrackingConfigurations = Objects.requireNonNull(targetTrackingConfigurations);
            return this;
        }
        public ScalingPlanScalingInstruction build() {
            return new ScalingPlanScalingInstruction(customizedLoadMetricSpecification, disableDynamicScaling, maxCapacity, minCapacity, predefinedLoadMetricSpecification, predictiveScalingMaxCapacityBehavior, predictiveScalingMaxCapacityBuffer, predictiveScalingMode, resourceId, scalableDimension, scalingPolicyUpdateBehavior, scheduledActionBufferTime, serviceNamespace, targetTrackingConfigurations);
        }
    }
}
