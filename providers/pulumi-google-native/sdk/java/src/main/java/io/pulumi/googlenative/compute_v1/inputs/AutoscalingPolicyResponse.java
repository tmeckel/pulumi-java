// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyCpuUtilizationResponse;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyCustomMetricUtilizationResponse;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyLoadBalancingUtilizationResponse;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyScaleInControlResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Cloud Autoscaler policy.
 * 
 */
public final class AutoscalingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyResponse Empty = new AutoscalingPolicyResponse();

    /**
     * The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
     * 
     */
    @InputImport(name="coolDownPeriodSec", required=true)
      private final Integer coolDownPeriodSec;

    public Integer getCoolDownPeriodSec() {
        return this.coolDownPeriodSec;
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
     * 
     */
    @InputImport(name="cpuUtilization", required=true)
      private final AutoscalingPolicyCpuUtilizationResponse cpuUtilization;

    public AutoscalingPolicyCpuUtilizationResponse getCpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * 
     */
    @InputImport(name="customMetricUtilizations", required=true)
      private final List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations;

    public List<AutoscalingPolicyCustomMetricUtilizationResponse> getCustomMetricUtilizations() {
        return this.customMetricUtilizations;
    }

    /**
     * Configuration parameters of autoscaling based on load balancer.
     * 
     */
    @InputImport(name="loadBalancingUtilization", required=true)
      private final AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization;

    public AutoscalingPolicyLoadBalancingUtilizationResponse getLoadBalancingUtilization() {
        return this.loadBalancingUtilization;
    }

    /**
     * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
     * 
     */
    @InputImport(name="maxNumReplicas", required=true)
      private final Integer maxNumReplicas;

    public Integer getMaxNumReplicas() {
        return this.maxNumReplicas;
    }

    /**
     * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
     * 
     */
    @InputImport(name="minNumReplicas", required=true)
      private final Integer minNumReplicas;

    public Integer getMinNumReplicas() {
        return this.minNumReplicas;
    }

    /**
     * Defines operating mode for this policy.
     * 
     */
    @InputImport(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    @InputImport(name="scaleInControl", required=true)
      private final AutoscalingPolicyScaleInControlResponse scaleInControl;

    public AutoscalingPolicyScaleInControlResponse getScaleInControl() {
        return this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
     * 
     */
    @InputImport(name="scalingSchedules", required=true)
      private final Map<String,String> scalingSchedules;

    public Map<String,String> getScalingSchedules() {
        return this.scalingSchedules;
    }

    public AutoscalingPolicyResponse(
        Integer coolDownPeriodSec,
        AutoscalingPolicyCpuUtilizationResponse cpuUtilization,
        List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations,
        AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization,
        Integer maxNumReplicas,
        Integer minNumReplicas,
        String mode,
        AutoscalingPolicyScaleInControlResponse scaleInControl,
        Map<String,String> scalingSchedules) {
        this.coolDownPeriodSec = Objects.requireNonNull(coolDownPeriodSec, "expected parameter 'coolDownPeriodSec' to be non-null");
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization, "expected parameter 'cpuUtilization' to be non-null");
        this.customMetricUtilizations = Objects.requireNonNull(customMetricUtilizations, "expected parameter 'customMetricUtilizations' to be non-null");
        this.loadBalancingUtilization = Objects.requireNonNull(loadBalancingUtilization, "expected parameter 'loadBalancingUtilization' to be non-null");
        this.maxNumReplicas = Objects.requireNonNull(maxNumReplicas, "expected parameter 'maxNumReplicas' to be non-null");
        this.minNumReplicas = Objects.requireNonNull(minNumReplicas, "expected parameter 'minNumReplicas' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.scaleInControl = Objects.requireNonNull(scaleInControl, "expected parameter 'scaleInControl' to be non-null");
        this.scalingSchedules = Objects.requireNonNull(scalingSchedules, "expected parameter 'scalingSchedules' to be non-null");
    }

    private AutoscalingPolicyResponse() {
        this.coolDownPeriodSec = null;
        this.cpuUtilization = null;
        this.customMetricUtilizations = List.of();
        this.loadBalancingUtilization = null;
        this.maxNumReplicas = null;
        this.minNumReplicas = null;
        this.mode = null;
        this.scaleInControl = null;
        this.scalingSchedules = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer coolDownPeriodSec;
        private AutoscalingPolicyCpuUtilizationResponse cpuUtilization;
        private List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations;
        private AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization;
        private Integer maxNumReplicas;
        private Integer minNumReplicas;
        private String mode;
        private AutoscalingPolicyScaleInControlResponse scaleInControl;
        private Map<String,String> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriodSec = defaults.coolDownPeriodSec;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.customMetricUtilizations = defaults.customMetricUtilizations;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxNumReplicas = defaults.maxNumReplicas;
    	      this.minNumReplicas = defaults.minNumReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder coolDownPeriodSec(Integer coolDownPeriodSec) {
            this.coolDownPeriodSec = Objects.requireNonNull(coolDownPeriodSec);
            return this;
        }

        public Builder cpuUtilization(AutoscalingPolicyCpuUtilizationResponse cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder customMetricUtilizations(List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations) {
            this.customMetricUtilizations = Objects.requireNonNull(customMetricUtilizations);
            return this;
        }

        public Builder loadBalancingUtilization(AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization) {
            this.loadBalancingUtilization = Objects.requireNonNull(loadBalancingUtilization);
            return this;
        }

        public Builder maxNumReplicas(Integer maxNumReplicas) {
            this.maxNumReplicas = Objects.requireNonNull(maxNumReplicas);
            return this;
        }

        public Builder minNumReplicas(Integer minNumReplicas) {
            this.minNumReplicas = Objects.requireNonNull(minNumReplicas);
            return this;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder scaleInControl(AutoscalingPolicyScaleInControlResponse scaleInControl) {
            this.scaleInControl = Objects.requireNonNull(scaleInControl);
            return this;
        }

        public Builder scalingSchedules(Map<String,String> scalingSchedules) {
            this.scalingSchedules = Objects.requireNonNull(scalingSchedules);
            return this;
        }
        public AutoscalingPolicyResponse build() {
            return new AutoscalingPolicyResponse(coolDownPeriodSec, cpuUtilization, customMetricUtilizations, loadBalancingUtilization, maxNumReplicas, minNumReplicas, mode, scaleInControl, scalingSchedules);
        }
    }
}
