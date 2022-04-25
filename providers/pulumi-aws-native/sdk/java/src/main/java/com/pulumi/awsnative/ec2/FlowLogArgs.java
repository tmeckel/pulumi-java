// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.enums.FlowLogLogDestinationType;
import com.pulumi.awsnative.ec2.enums.FlowLogResourceType;
import com.pulumi.awsnative.ec2.enums.FlowLogTrafficType;
import com.pulumi.awsnative.ec2.inputs.DestinationOptionsPropertiesArgs;
import com.pulumi.awsnative.ec2.inputs.FlowLogTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowLogArgs Empty = new FlowLogArgs();

    /**
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    @Import(name="deliverLogsPermissionArn")
    private @Nullable Output<String> deliverLogsPermissionArn;

    /**
     * @return The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    public Optional<Output<String>> deliverLogsPermissionArn() {
        return Optional.ofNullable(this.deliverLogsPermissionArn);
    }

    @Import(name="destinationOptions")
    private @Nullable Output<DestinationOptionsPropertiesArgs> destinationOptions;

    public Optional<Output<DestinationOptionsPropertiesArgs>> destinationOptions() {
        return Optional.ofNullable(this.destinationOptions);
    }

    /**
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType.
     * 
     */
    @Import(name="logDestination")
    private @Nullable Output<String> logDestination;

    /**
     * @return Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType.
     * 
     */
    public Optional<Output<String>> logDestination() {
        return Optional.ofNullable(this.logDestination);
    }

    /**
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3.
     * 
     */
    @Import(name="logDestinationType")
    private @Nullable Output<FlowLogLogDestinationType> logDestinationType;

    /**
     * @return Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3.
     * 
     */
    public Optional<Output<FlowLogLogDestinationType>> logDestinationType() {
        return Optional.ofNullable(this.logDestinationType);
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    @Import(name="logFormat")
    private @Nullable Output<String> logFormat;

    /**
     * @return The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    public Optional<Output<String>> logFormat() {
        return Optional.ofNullable(this.logFormat);
    }

    /**
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    /**
     * @return The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
     * 
     */
    @Import(name="maxAggregationInterval")
    private @Nullable Output<Integer> maxAggregationInterval;

    /**
     * @return The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
     * 
     */
    public Optional<Output<Integer>> maxAggregationInterval() {
        return Optional.ofNullable(this.maxAggregationInterval);
    }

    /**
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<FlowLogResourceType> resourceType;

    /**
     * @return The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
     * 
     */
    public Output<FlowLogResourceType> resourceType() {
        return this.resourceType;
    }

    /**
     * The tags to apply to the flow logs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<FlowLogTagArgs>> tags;

    /**
     * @return The tags to apply to the flow logs.
     * 
     */
    public Optional<Output<List<FlowLogTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * 
     */
    @Import(name="trafficType", required=true)
    private Output<FlowLogTrafficType> trafficType;

    /**
     * @return The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * 
     */
    public Output<FlowLogTrafficType> trafficType() {
        return this.trafficType;
    }

    private FlowLogArgs() {}

    private FlowLogArgs(FlowLogArgs $) {
        this.deliverLogsPermissionArn = $.deliverLogsPermissionArn;
        this.destinationOptions = $.destinationOptions;
        this.logDestination = $.logDestination;
        this.logDestinationType = $.logDestinationType;
        this.logFormat = $.logFormat;
        this.logGroupName = $.logGroupName;
        this.maxAggregationInterval = $.maxAggregationInterval;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.tags = $.tags;
        this.trafficType = $.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowLogArgs $;

        public Builder() {
            $ = new FlowLogArgs();
        }

        public Builder(FlowLogArgs defaults) {
            $ = new FlowLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deliverLogsPermissionArn The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
         * 
         * @return builder
         * 
         */
        public Builder deliverLogsPermissionArn(@Nullable Output<String> deliverLogsPermissionArn) {
            $.deliverLogsPermissionArn = deliverLogsPermissionArn;
            return this;
        }

        /**
         * @param deliverLogsPermissionArn The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
         * 
         * @return builder
         * 
         */
        public Builder deliverLogsPermissionArn(String deliverLogsPermissionArn) {
            return deliverLogsPermissionArn(Output.of(deliverLogsPermissionArn));
        }

        public Builder destinationOptions(@Nullable Output<DestinationOptionsPropertiesArgs> destinationOptions) {
            $.destinationOptions = destinationOptions;
            return this;
        }

        public Builder destinationOptions(DestinationOptionsPropertiesArgs destinationOptions) {
            return destinationOptions(Output.of(destinationOptions));
        }

        /**
         * @param logDestination Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(@Nullable Output<String> logDestination) {
            $.logDestination = logDestination;
            return this;
        }

        /**
         * @param logDestination Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(String logDestination) {
            return logDestination(Output.of(logDestination));
        }

        /**
         * @param logDestinationType Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationType(@Nullable Output<FlowLogLogDestinationType> logDestinationType) {
            $.logDestinationType = logDestinationType;
            return this;
        }

        /**
         * @param logDestinationType Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationType(FlowLogLogDestinationType logDestinationType) {
            return logDestinationType(Output.of(logDestinationType));
        }

        /**
         * @param logFormat The fields to include in the flow log record, in the order in which they should appear.
         * 
         * @return builder
         * 
         */
        public Builder logFormat(@Nullable Output<String> logFormat) {
            $.logFormat = logFormat;
            return this;
        }

        /**
         * @param logFormat The fields to include in the flow log record, in the order in which they should appear.
         * 
         * @return builder
         * 
         */
        public Builder logFormat(String logFormat) {
            return logFormat(Output.of(logFormat));
        }

        /**
         * @param logGroupName The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        /**
         * @param maxAggregationInterval The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
         * 
         * @return builder
         * 
         */
        public Builder maxAggregationInterval(@Nullable Output<Integer> maxAggregationInterval) {
            $.maxAggregationInterval = maxAggregationInterval;
            return this;
        }

        /**
         * @param maxAggregationInterval The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
         * 
         * @return builder
         * 
         */
        public Builder maxAggregationInterval(Integer maxAggregationInterval) {
            return maxAggregationInterval(Output.of(maxAggregationInterval));
        }

        /**
         * @param resourceId The ID of the subnet, network interface, or VPC for which you want to create a flow log.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The ID of the subnet, network interface, or VPC for which you want to create a flow log.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceType The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<FlowLogResourceType> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(FlowLogResourceType resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param tags The tags to apply to the flow logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<FlowLogTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags to apply to the flow logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<FlowLogTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags to apply to the flow logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(FlowLogTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param trafficType The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
         * 
         * @return builder
         * 
         */
        public Builder trafficType(Output<FlowLogTrafficType> trafficType) {
            $.trafficType = trafficType;
            return this;
        }

        /**
         * @param trafficType The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
         * 
         * @return builder
         * 
         */
        public Builder trafficType(FlowLogTrafficType trafficType) {
            return trafficType(Output.of(trafficType));
        }

        public FlowLogArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.trafficType = Objects.requireNonNull($.trafficType, "expected parameter 'trafficType' to be non-null");
            return $;
        }
    }

}
