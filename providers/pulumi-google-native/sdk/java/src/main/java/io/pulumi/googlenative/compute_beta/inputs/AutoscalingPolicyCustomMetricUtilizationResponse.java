// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Custom utilization metric policy.
 * 
 */
public final class AutoscalingPolicyCustomMetricUtilizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyCustomMetricUtilizationResponse Empty = new AutoscalingPolicyCustomMetricUtilizationResponse();

    /**
     * A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of autoscaling and to determine whether the metric is exporting per-instance or per-group data. For the filter to be valid for autoscaling purposes, the following rules apply: - You can only use the AND operator for joining selectors. - You can only use direct equality comparison operator (=) without any functions for each selector. - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical. - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries for each instance in a group. In such a case, you cannot filter on resource labels. If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be performed to point autoscaler at the correct TimeSeries to scale upon. This is called a *per-group metric* for the purpose of autoscaling. If not specified, the type defaults to gce_instance. Try to provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type). If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
     * 
     */
    @InputImport(name="filter", required=true)
    private final String filter;

    public String getFilter() {
        return this.filter;
    }

    /**
     * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values. The metric must have a value type of INT64 or DOUBLE.
     * 
     */
    @InputImport(name="metric", required=true)
    private final String metric;

    public String getMetric() {
        return this.metric;
    }

    /**
     * If scaling is based on a per-group metric value that represents the total amount of work to be done or resource usage, set this value to an amount assigned for a single instance of the scaled group. Autoscaler keeps the number of instances proportional to the value of this metric. The metric itself does not change value due to group resizing. A good metric to use with the target is for example pubsub.googleapis.com/subscription/num_undelivered_messages or a custom metric exporting the total number of requests coming to your instances. A bad example would be a metric exporting an average or median latency, since this value can't include a chunk assignable to a single instance, it could be better used with utilization_target instead.
     * 
     */
    @InputImport(name="singleInstanceAssignment", required=true)
    private final Double singleInstanceAssignment;

    public Double getSingleInstanceAssignment() {
        return this.singleInstanceAssignment;
    }

    /**
     * The target value of the metric that autoscaler maintains. This must be a positive value. A utilization metric scales number of virtual machines handling requests to increase or decrease proportionally to the metric. For example, a good metric to use as a utilization_target is https://www.googleapis.com/compute/v1/instance/network/received_bytes_count. The autoscaler works to keep this value constant for each of the instances.
     * 
     */
    @InputImport(name="utilizationTarget", required=true)
    private final Double utilizationTarget;

    public Double getUtilizationTarget() {
        return this.utilizationTarget;
    }

    /**
     * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
     * 
     */
    @InputImport(name="utilizationTargetType", required=true)
    private final String utilizationTargetType;

    public String getUtilizationTargetType() {
        return this.utilizationTargetType;
    }

    public AutoscalingPolicyCustomMetricUtilizationResponse(
        String filter,
        String metric,
        Double singleInstanceAssignment,
        Double utilizationTarget,
        String utilizationTargetType) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.singleInstanceAssignment = Objects.requireNonNull(singleInstanceAssignment, "expected parameter 'singleInstanceAssignment' to be non-null");
        this.utilizationTarget = Objects.requireNonNull(utilizationTarget, "expected parameter 'utilizationTarget' to be non-null");
        this.utilizationTargetType = Objects.requireNonNull(utilizationTargetType, "expected parameter 'utilizationTargetType' to be non-null");
    }

    private AutoscalingPolicyCustomMetricUtilizationResponse() {
        this.filter = null;
        this.metric = null;
        this.singleInstanceAssignment = null;
        this.utilizationTarget = null;
        this.utilizationTargetType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyCustomMetricUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String metric;
        private Double singleInstanceAssignment;
        private Double utilizationTarget;
        private String utilizationTargetType;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyCustomMetricUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.metric = defaults.metric;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.utilizationTarget = defaults.utilizationTarget;
    	      this.utilizationTargetType = defaults.utilizationTargetType;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setSingleInstanceAssignment(Double singleInstanceAssignment) {
            this.singleInstanceAssignment = Objects.requireNonNull(singleInstanceAssignment);
            return this;
        }

        public Builder setUtilizationTarget(Double utilizationTarget) {
            this.utilizationTarget = Objects.requireNonNull(utilizationTarget);
            return this;
        }

        public Builder setUtilizationTargetType(String utilizationTargetType) {
            this.utilizationTargetType = Objects.requireNonNull(utilizationTargetType);
            return this;
        }

        public AutoscalingPolicyCustomMetricUtilizationResponse build() {
            return new AutoscalingPolicyCustomMetricUtilizationResponse(filter, metric, singleInstanceAssignment, utilizationTarget, utilizationTargetType);
        }
    }
}
