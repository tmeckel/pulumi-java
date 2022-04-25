// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.AutoscalerStatusDetailsResponse;
import com.pulumi.googlenative.compute_v1.outputs.AutoscalingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAutoscalerResult {
    /**
     * @return The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    private final AutoscalingPolicyResponse autoscalingPolicy;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Type of the resource. Always compute#autoscaler for autoscalers.
     * 
     */
    private final String kind;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
     * 
     */
    private final Integer recommendedSize;
    /**
     * @return URL of the region where the instance group resides (for autoscalers living in regional scope).
     * 
     */
    private final String region;
    /**
     * @return Status information of existing scaling schedules.
     * 
     */
    private final Map<String,String> scalingScheduleStatus;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn&#39;t read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
     * 
     */
    private final String status;
    /**
     * @return Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
     * 
     */
    private final List<AutoscalerStatusDetailsResponse> statusDetails;
    /**
     * @return URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    private final String target;
    /**
     * @return URL of the zone where the instance group resides (for autoscalers living in zonal scope).
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetAutoscalerResult(
        @CustomType.Parameter("autoscalingPolicy") AutoscalingPolicyResponse autoscalingPolicy,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recommendedSize") Integer recommendedSize,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("scalingScheduleStatus") Map<String,String> scalingScheduleStatus,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusDetails") List<AutoscalerStatusDetailsResponse> statusDetails,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("zone") String zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.kind = kind;
        this.name = name;
        this.recommendedSize = recommendedSize;
        this.region = region;
        this.scalingScheduleStatus = scalingScheduleStatus;
        this.selfLink = selfLink;
        this.status = status;
        this.statusDetails = statusDetails;
        this.target = target;
        this.zone = zone;
    }

    /**
     * @return The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    public AutoscalingPolicyResponse autoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Type of the resource. Always compute#autoscaler for autoscalers.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
     * 
     */
    public Integer recommendedSize() {
        return this.recommendedSize;
    }
    /**
     * @return URL of the region where the instance group resides (for autoscalers living in regional scope).
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Status information of existing scaling schedules.
     * 
     */
    public Map<String,String> scalingScheduleStatus() {
        return this.scalingScheduleStatus;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn&#39;t read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
     * 
     */
    public List<AutoscalerStatusDetailsResponse> statusDetails() {
        return this.statusDetails;
    }
    /**
     * @return URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return URL of the zone where the instance group resides (for autoscalers living in zonal scope).
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoscalerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyResponse autoscalingPolicy;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private Integer recommendedSize;
        private String region;
        private Map<String,String> scalingScheduleStatus;
        private String selfLink;
        private String status;
        private List<AutoscalerStatusDetailsResponse> statusDetails;
        private String target;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoscalerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.recommendedSize = defaults.recommendedSize;
    	      this.region = defaults.region;
    	      this.scalingScheduleStatus = defaults.scalingScheduleStatus;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.target = defaults.target;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingPolicy(AutoscalingPolicyResponse autoscalingPolicy) {
            this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recommendedSize(Integer recommendedSize) {
            this.recommendedSize = Objects.requireNonNull(recommendedSize);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder scalingScheduleStatus(Map<String,String> scalingScheduleStatus) {
            this.scalingScheduleStatus = Objects.requireNonNull(scalingScheduleStatus);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetails(List<AutoscalerStatusDetailsResponse> statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }
        public Builder statusDetails(AutoscalerStatusDetailsResponse... statusDetails) {
            return statusDetails(List.of(statusDetails));
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetAutoscalerResult build() {
            return new GetAutoscalerResult(autoscalingPolicy, creationTimestamp, description, kind, name, recommendedSize, region, scalingScheduleStatus, selfLink, status, statusDetails, target, zone);
        }
    }
}
