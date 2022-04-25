// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowLogState extends com.pulumi.resources.ResourceArgs {

    public static final FlowLogState Empty = new FlowLogState();

    /**
     * The ARN of the Flow Log.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the Flow Log.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Describes the destination options for a flow log. More details below.
     * 
     */
    @Import(name="destinationOptions")
    private @Nullable Output<FlowLogDestinationOptionsGetArgs> destinationOptions;

    /**
     * @return Describes the destination options for a flow log. More details below.
     * 
     */
    public Optional<Output<FlowLogDestinationOptionsGetArgs>> destinationOptions() {
        return Optional.ofNullable(this.destinationOptions);
    }

    /**
     * Elastic Network Interface ID to attach to
     * 
     */
    @Import(name="eniId")
    private @Nullable Output<String> eniId;

    /**
     * @return Elastic Network Interface ID to attach to
     * 
     */
    public Optional<Output<String>> eniId() {
        return Optional.ofNullable(this.eniId);
    }

    /**
     * The ARN for the IAM role that&#39;s used to post flow logs to a CloudWatch Logs log group
     * 
     */
    @Import(name="iamRoleArn")
    private @Nullable Output<String> iamRoleArn;

    /**
     * @return The ARN for the IAM role that&#39;s used to post flow logs to a CloudWatch Logs log group
     * 
     */
    public Optional<Output<String>> iamRoleArn() {
        return Optional.ofNullable(this.iamRoleArn);
    }

    /**
     * The ARN of the logging destination.
     * 
     */
    @Import(name="logDestination")
    private @Nullable Output<String> logDestination;

    /**
     * @return The ARN of the logging destination.
     * 
     */
    public Optional<Output<String>> logDestination() {
        return Optional.ofNullable(this.logDestination);
    }

    /**
     * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
     * 
     */
    @Import(name="logDestinationType")
    private @Nullable Output<String> logDestinationType;

    /**
     * @return The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
     * 
     */
    public Optional<Output<String>> logDestinationType() {
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
     * *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
     * 
     * @deprecated
     * use &#39;log_destination&#39; argument instead
     * 
     */
    @Deprecated /* use 'log_destination' argument instead */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    /**
     * @return *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
     * 
     * @deprecated
     * use &#39;log_destination&#39; argument instead
     * 
     */
    @Deprecated /* use 'log_destination' argument instead */
    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`.
     * 
     */
    @Import(name="maxAggregationInterval")
    private @Nullable Output<Integer> maxAggregationInterval;

    /**
     * @return The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`.
     * 
     */
    public Optional<Output<Integer>> maxAggregationInterval() {
        return Optional.ofNullable(this.maxAggregationInterval);
    }

    /**
     * Subnet ID to attach to
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return Subnet ID to attach to
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    @Import(name="trafficType")
    private @Nullable Output<String> trafficType;

    /**
     * @return The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    public Optional<Output<String>> trafficType() {
        return Optional.ofNullable(this.trafficType);
    }

    /**
     * VPC ID to attach to
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return VPC ID to attach to
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private FlowLogState() {}

    private FlowLogState(FlowLogState $) {
        this.arn = $.arn;
        this.destinationOptions = $.destinationOptions;
        this.eniId = $.eniId;
        this.iamRoleArn = $.iamRoleArn;
        this.logDestination = $.logDestination;
        this.logDestinationType = $.logDestinationType;
        this.logFormat = $.logFormat;
        this.logGroupName = $.logGroupName;
        this.maxAggregationInterval = $.maxAggregationInterval;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.trafficType = $.trafficType;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowLogState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowLogState $;

        public Builder() {
            $ = new FlowLogState();
        }

        public Builder(FlowLogState defaults) {
            $ = new FlowLogState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the Flow Log.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the Flow Log.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param destinationOptions Describes the destination options for a flow log. More details below.
         * 
         * @return builder
         * 
         */
        public Builder destinationOptions(@Nullable Output<FlowLogDestinationOptionsGetArgs> destinationOptions) {
            $.destinationOptions = destinationOptions;
            return this;
        }

        /**
         * @param destinationOptions Describes the destination options for a flow log. More details below.
         * 
         * @return builder
         * 
         */
        public Builder destinationOptions(FlowLogDestinationOptionsGetArgs destinationOptions) {
            return destinationOptions(Output.of(destinationOptions));
        }

        /**
         * @param eniId Elastic Network Interface ID to attach to
         * 
         * @return builder
         * 
         */
        public Builder eniId(@Nullable Output<String> eniId) {
            $.eniId = eniId;
            return this;
        }

        /**
         * @param eniId Elastic Network Interface ID to attach to
         * 
         * @return builder
         * 
         */
        public Builder eniId(String eniId) {
            return eniId(Output.of(eniId));
        }

        /**
         * @param iamRoleArn The ARN for the IAM role that&#39;s used to post flow logs to a CloudWatch Logs log group
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            $.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * @param iamRoleArn The ARN for the IAM role that&#39;s used to post flow logs to a CloudWatch Logs log group
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(String iamRoleArn) {
            return iamRoleArn(Output.of(iamRoleArn));
        }

        /**
         * @param logDestination The ARN of the logging destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(@Nullable Output<String> logDestination) {
            $.logDestination = logDestination;
            return this;
        }

        /**
         * @param logDestination The ARN of the logging destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(String logDestination) {
            return logDestination(Output.of(logDestination));
        }

        /**
         * @param logDestinationType The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationType(@Nullable Output<String> logDestinationType) {
            $.logDestinationType = logDestinationType;
            return this;
        }

        /**
         * @param logDestinationType The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationType(String logDestinationType) {
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
         * @param logGroupName *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
         * 
         * @return builder
         * 
         * @deprecated
         * use &#39;log_destination&#39; argument instead
         * 
         */
        @Deprecated /* use 'log_destination' argument instead */
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
         * 
         * @return builder
         * 
         * @deprecated
         * use &#39;log_destination&#39; argument instead
         * 
         */
        @Deprecated /* use 'log_destination' argument instead */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        /**
         * @param maxAggregationInterval The maximum interval of time
         * during which a flow of packets is captured and aggregated into a flow
         * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
         * minutes). Default: `600`.
         * 
         * @return builder
         * 
         */
        public Builder maxAggregationInterval(@Nullable Output<Integer> maxAggregationInterval) {
            $.maxAggregationInterval = maxAggregationInterval;
            return this;
        }

        /**
         * @param maxAggregationInterval The maximum interval of time
         * during which a flow of packets is captured and aggregated into a flow
         * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
         * minutes). Default: `600`.
         * 
         * @return builder
         * 
         */
        public Builder maxAggregationInterval(Integer maxAggregationInterval) {
            return maxAggregationInterval(Output.of(maxAggregationInterval));
        }

        /**
         * @param subnetId Subnet ID to attach to
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId Subnet ID to attach to
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param trafficType The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
         * 
         * @return builder
         * 
         */
        public Builder trafficType(@Nullable Output<String> trafficType) {
            $.trafficType = trafficType;
            return this;
        }

        /**
         * @param trafficType The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
         * 
         * @return builder
         * 
         */
        public Builder trafficType(String trafficType) {
            return trafficType(Output.of(trafficType));
        }

        /**
         * @param vpcId VPC ID to attach to
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId VPC ID to attach to
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public FlowLogState build() {
            return $;
        }
    }

}
