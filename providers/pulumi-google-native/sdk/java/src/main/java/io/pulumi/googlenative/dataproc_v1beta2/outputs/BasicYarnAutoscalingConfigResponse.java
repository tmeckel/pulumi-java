// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BasicYarnAutoscalingConfigResponse {
    /**
     * Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to wait for jobs to complete before forcefully removing workers (and potentially interrupting jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    private final String gracefulDecommissionTimeout;
    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to remove workers. A scale-down factor of 1 will result in scaling down so that there is no available memory remaining after the update (more aggressive scaling). A scale-down factor of 0 disables removing workers, which can be beneficial for autoscaling a single job. See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    private final Double scaleDownFactor;
    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    private final Double scaleDownMinWorkerFraction;
    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to add workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    private final Double scaleUpFactor;
    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    private final Double scaleUpMinWorkerFraction;

    @OutputCustomType.Constructor({"gracefulDecommissionTimeout","scaleDownFactor","scaleDownMinWorkerFraction","scaleUpFactor","scaleUpMinWorkerFraction"})
    private BasicYarnAutoscalingConfigResponse(
        String gracefulDecommissionTimeout,
        Double scaleDownFactor,
        Double scaleDownMinWorkerFraction,
        Double scaleUpFactor,
        Double scaleUpMinWorkerFraction) {
        this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
        this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
        this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction);
        this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
        this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction);
    }

    /**
     * Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to wait for jobs to complete before forcefully removing workers (and potentially interrupting jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    public String getGracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }
    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to remove workers. A scale-down factor of 1 will result in scaling down so that there is no available memory remaining after the update (more aggressive scaling). A scale-down factor of 0 disables removing workers, which can be beneficial for autoscaling a single job. See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    public Double getScaleDownFactor() {
        return this.scaleDownFactor;
    }
    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Double getScaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction;
    }
    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to add workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    public Double getScaleUpFactor() {
        return this.scaleUpFactor;
    }
    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Double getScaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicYarnAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gracefulDecommissionTimeout;
        private Double scaleDownFactor;
        private Double scaleDownMinWorkerFraction;
        private Double scaleUpFactor;
        private Double scaleUpMinWorkerFraction;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicYarnAutoscalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.scaleDownFactor = defaults.scaleDownFactor;
    	      this.scaleDownMinWorkerFraction = defaults.scaleDownMinWorkerFraction;
    	      this.scaleUpFactor = defaults.scaleUpFactor;
    	      this.scaleUpMinWorkerFraction = defaults.scaleUpMinWorkerFraction;
        }

        public Builder setGracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
            return this;
        }

        public Builder setScaleDownFactor(Double scaleDownFactor) {
            this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
            return this;
        }

        public Builder setScaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction);
            return this;
        }

        public Builder setScaleUpFactor(Double scaleUpFactor) {
            this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
            return this;
        }

        public Builder setScaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction);
            return this;
        }

        public BasicYarnAutoscalingConfigResponse build() {
            return new BasicYarnAutoscalingConfigResponse(gracefulDecommissionTimeout, scaleDownFactor, scaleDownMinWorkerFraction, scaleUpFactor, scaleUpMinWorkerFraction);
        }
    }
}
