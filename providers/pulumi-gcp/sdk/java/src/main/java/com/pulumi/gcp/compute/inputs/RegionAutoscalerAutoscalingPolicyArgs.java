// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs;
import com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs;
import com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyMetricArgs;
import com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlArgs;
import com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlArgs;
import com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScalingScheduleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionAutoscalerAutoscalingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerAutoscalingPolicyArgs Empty = new RegionAutoscalerAutoscalingPolicyArgs();

    /**
     * The number of seconds that the autoscaler should wait before it
     * starts collecting information from a new instance. This prevents
     * the autoscaler from collecting information when the instance is
     * initializing, during which the collected usage would not be
     * reliable. The default time autoscaler waits is 60 seconds.
     * Virtual machine initialization times might vary because of
     * numerous factors. We recommend that you test how long an
     * instance may take to initialize. To do this, create an instance
     * and time the startup process.
     * 
     */
    @Import(name="cooldownPeriod")
    private @Nullable Output<Integer> cooldownPeriod;

    /**
     * @return The number of seconds that the autoscaler should wait before it
     * starts collecting information from a new instance. This prevents
     * the autoscaler from collecting information when the instance is
     * initializing, during which the collected usage would not be
     * reliable. The default time autoscaler waits is 60 seconds.
     * Virtual machine initialization times might vary because of
     * numerous factors. We recommend that you test how long an
     * instance may take to initialize. To do this, create an instance
     * and time the startup process.
     * 
     */
    public Optional<Output<Integer>> cooldownPeriod() {
        return Optional.ofNullable(this.cooldownPeriod);
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    @Import(name="cpuUtilization")
    private @Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization;

    /**
     * @return Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs>> cpuUtilization() {
        return Optional.ofNullable(this.cpuUtilization);
    }

    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    @Import(name="loadBalancingUtilization")
    private @Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;

    /**
     * @return Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs>> loadBalancingUtilization() {
        return Optional.ofNullable(this.loadBalancingUtilization);
    }

    /**
     * The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    @Import(name="maxReplicas", required=true)
    private Output<Integer> maxReplicas;

    /**
     * @return The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    public Output<Integer> maxReplicas() {
        return this.maxReplicas;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    @Import(name="metrics")
    private @Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>> metrics;

    /**
     * @return Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    /**
     * The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    @Import(name="minReplicas", required=true)
    private Output<Integer> minReplicas;

    /**
     * @return The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    public Output<Integer> minReplicas() {
        return this.minReplicas;
    }

    /**
     * Defines operating mode for this policy.
     * Default value is `ON`.
     * Possible values are `OFF`, `ONLY_UP`, and `ON`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Defines operating mode for this policy.
     * Default value is `ON`.
     * Possible values are `OFF`, `ONLY_UP`, and `ON`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleDownControl")
    private @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl;

    /**
     * @return Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs>> scaleDownControl() {
        return Optional.ofNullable(this.scaleDownControl);
    }

    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleInControl")
    private @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl;

    /**
     * @return Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs>> scaleInControl() {
        return Optional.ofNullable(this.scaleInControl);
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    @Import(name="scalingSchedules")
    private @Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules;

    /**
     * @return Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>>> scalingSchedules() {
        return Optional.ofNullable(this.scalingSchedules);
    }

    private RegionAutoscalerAutoscalingPolicyArgs() {}

    private RegionAutoscalerAutoscalingPolicyArgs(RegionAutoscalerAutoscalingPolicyArgs $) {
        this.cooldownPeriod = $.cooldownPeriod;
        this.cpuUtilization = $.cpuUtilization;
        this.loadBalancingUtilization = $.loadBalancingUtilization;
        this.maxReplicas = $.maxReplicas;
        this.metrics = $.metrics;
        this.minReplicas = $.minReplicas;
        this.mode = $.mode;
        this.scaleDownControl = $.scaleDownControl;
        this.scaleInControl = $.scaleInControl;
        this.scalingSchedules = $.scalingSchedules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionAutoscalerAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionAutoscalerAutoscalingPolicyArgs $;

        public Builder() {
            $ = new RegionAutoscalerAutoscalingPolicyArgs();
        }

        public Builder(RegionAutoscalerAutoscalingPolicyArgs defaults) {
            $ = new RegionAutoscalerAutoscalingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cooldownPeriod The number of seconds that the autoscaler should wait before it
         * starts collecting information from a new instance. This prevents
         * the autoscaler from collecting information when the instance is
         * initializing, during which the collected usage would not be
         * reliable. The default time autoscaler waits is 60 seconds.
         * Virtual machine initialization times might vary because of
         * numerous factors. We recommend that you test how long an
         * instance may take to initialize. To do this, create an instance
         * and time the startup process.
         * 
         * @return builder
         * 
         */
        public Builder cooldownPeriod(@Nullable Output<Integer> cooldownPeriod) {
            $.cooldownPeriod = cooldownPeriod;
            return this;
        }

        /**
         * @param cooldownPeriod The number of seconds that the autoscaler should wait before it
         * starts collecting information from a new instance. This prevents
         * the autoscaler from collecting information when the instance is
         * initializing, during which the collected usage would not be
         * reliable. The default time autoscaler waits is 60 seconds.
         * Virtual machine initialization times might vary because of
         * numerous factors. We recommend that you test how long an
         * instance may take to initialize. To do this, create an instance
         * and time the startup process.
         * 
         * @return builder
         * 
         */
        public Builder cooldownPeriod(Integer cooldownPeriod) {
            return cooldownPeriod(Output.of(cooldownPeriod));
        }

        /**
         * @param cpuUtilization Defines the CPU utilization policy that allows the autoscaler to
         * scale based on the average CPU utilization of a managed instance
         * group.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilization(@Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization) {
            $.cpuUtilization = cpuUtilization;
            return this;
        }

        /**
         * @param cpuUtilization Defines the CPU utilization policy that allows the autoscaler to
         * scale based on the average CPU utilization of a managed instance
         * group.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilization(RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs cpuUtilization) {
            return cpuUtilization(Output.of(cpuUtilization));
        }

        /**
         * @param loadBalancingUtilization Configuration parameters of autoscaling based on a load balancer.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancingUtilization(@Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization) {
            $.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }

        /**
         * @param loadBalancingUtilization Configuration parameters of autoscaling based on a load balancer.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancingUtilization(RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs loadBalancingUtilization) {
            return loadBalancingUtilization(Output.of(loadBalancingUtilization));
        }

        /**
         * @param maxReplicas The maximum number of instances that the autoscaler can scale up
         * to. This is required when creating or updating an autoscaler. The
         * maximum number of replicas should not be lower than minimal number
         * of replicas.
         * 
         * @return builder
         * 
         */
        public Builder maxReplicas(Output<Integer> maxReplicas) {
            $.maxReplicas = maxReplicas;
            return this;
        }

        /**
         * @param maxReplicas The maximum number of instances that the autoscaler can scale up
         * to. This is required when creating or updating an autoscaler. The
         * maximum number of replicas should not be lower than minimal number
         * of replicas.
         * 
         * @return builder
         * 
         */
        public Builder maxReplicas(Integer maxReplicas) {
            return maxReplicas(Output.of(maxReplicas));
        }

        /**
         * @param metrics Configuration parameters of autoscaling based on a custom metric.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metrics(@Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>> metrics) {
            $.metrics = metrics;
            return this;
        }

        /**
         * @param metrics Configuration parameters of autoscaling based on a custom metric.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metrics(List<RegionAutoscalerAutoscalingPolicyMetricArgs> metrics) {
            return metrics(Output.of(metrics));
        }

        /**
         * @param metrics Configuration parameters of autoscaling based on a custom metric.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metrics(RegionAutoscalerAutoscalingPolicyMetricArgs... metrics) {
            return metrics(List.of(metrics));
        }

        /**
         * @param minReplicas The minimum number of replicas that the autoscaler can scale down
         * to. This cannot be less than 0. If not provided, autoscaler will
         * choose a default value depending on maximum number of instances
         * allowed.
         * 
         * @return builder
         * 
         */
        public Builder minReplicas(Output<Integer> minReplicas) {
            $.minReplicas = minReplicas;
            return this;
        }

        /**
         * @param minReplicas The minimum number of replicas that the autoscaler can scale down
         * to. This cannot be less than 0. If not provided, autoscaler will
         * choose a default value depending on maximum number of instances
         * allowed.
         * 
         * @return builder
         * 
         */
        public Builder minReplicas(Integer minReplicas) {
            return minReplicas(Output.of(minReplicas));
        }

        /**
         * @param mode Defines operating mode for this policy.
         * Default value is `ON`.
         * Possible values are `OFF`, `ONLY_UP`, and `ON`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Defines operating mode for this policy.
         * Default value is `ON`.
         * Possible values are `OFF`, `ONLY_UP`, and `ON`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param scaleDownControl Defines scale down controls to reduce the risk of response latency
         * and outages due to abrupt scale-in events
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownControl(@Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl) {
            $.scaleDownControl = scaleDownControl;
            return this;
        }

        /**
         * @param scaleDownControl Defines scale down controls to reduce the risk of response latency
         * and outages due to abrupt scale-in events
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownControl(RegionAutoscalerAutoscalingPolicyScaleDownControlArgs scaleDownControl) {
            return scaleDownControl(Output.of(scaleDownControl));
        }

        /**
         * @param scaleInControl Defines scale in controls to reduce the risk of response latency
         * and outages due to abrupt scale-in events
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scaleInControl(@Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl) {
            $.scaleInControl = scaleInControl;
            return this;
        }

        /**
         * @param scaleInControl Defines scale in controls to reduce the risk of response latency
         * and outages due to abrupt scale-in events
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scaleInControl(RegionAutoscalerAutoscalingPolicyScaleInControlArgs scaleInControl) {
            return scaleInControl(Output.of(scaleInControl));
        }

        /**
         * @param scalingSchedules Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scalingSchedules(@Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules) {
            $.scalingSchedules = scalingSchedules;
            return this;
        }

        /**
         * @param scalingSchedules Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scalingSchedules(List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs> scalingSchedules) {
            return scalingSchedules(Output.of(scalingSchedules));
        }

        /**
         * @param scalingSchedules Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scalingSchedules(RegionAutoscalerAutoscalingPolicyScalingScheduleArgs... scalingSchedules) {
            return scalingSchedules(List.of(scalingSchedules));
        }

        public RegionAutoscalerAutoscalingPolicyArgs build() {
            $.maxReplicas = Objects.requireNonNull($.maxReplicas, "expected parameter 'maxReplicas' to be non-null");
            $.minReplicas = Objects.requireNonNull($.minReplicas, "expected parameter 'minReplicas' to be non-null");
            return $;
        }
    }

}
