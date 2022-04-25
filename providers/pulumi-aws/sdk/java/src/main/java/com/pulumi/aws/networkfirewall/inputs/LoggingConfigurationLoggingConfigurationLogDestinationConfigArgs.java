// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs Empty = new LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs();

    /**
     * A map describing the logging destination for the chosen `log_destination_type`.
     * * For an Amazon S3 bucket, specify the key `bucketName` with the name of the bucket and optionally specify the key `prefix` with a path.
     * * For a CloudWatch log group, specify the key `logGroup` with the name of the CloudWatch log group.
     * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the name of the delivery stream.
     * 
     */
    @Import(name="logDestination", required=true)
    private Output<Map<String,String>> logDestination;

    /**
     * @return A map describing the logging destination for the chosen `log_destination_type`.
     * * For an Amazon S3 bucket, specify the key `bucketName` with the name of the bucket and optionally specify the key `prefix` with a path.
     * * For a CloudWatch log group, specify the key `logGroup` with the name of the CloudWatch log group.
     * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the name of the delivery stream.
     * 
     */
    public Output<Map<String,String>> logDestination() {
        return this.logDestination;
    }

    /**
     * The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
     * 
     */
    @Import(name="logDestinationType", required=true)
    private Output<String> logDestinationType;

    /**
     * @return The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
     * 
     */
    public Output<String> logDestinationType() {
        return this.logDestinationType;
    }

    /**
     * The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
     * 
     */
    @Import(name="logType", required=true)
    private Output<String> logType;

    /**
     * @return The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
     * 
     */
    public Output<String> logType() {
        return this.logType;
    }

    private LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs() {}

    private LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs(LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs $) {
        this.logDestination = $.logDestination;
        this.logDestinationType = $.logDestinationType;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs $;

        public Builder() {
            $ = new LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs();
        }

        public Builder(LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs defaults) {
            $ = new LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logDestination A map describing the logging destination for the chosen `log_destination_type`.
         * * For an Amazon S3 bucket, specify the key `bucketName` with the name of the bucket and optionally specify the key `prefix` with a path.
         * * For a CloudWatch log group, specify the key `logGroup` with the name of the CloudWatch log group.
         * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the name of the delivery stream.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(Output<Map<String,String>> logDestination) {
            $.logDestination = logDestination;
            return this;
        }

        /**
         * @param logDestination A map describing the logging destination for the chosen `log_destination_type`.
         * * For an Amazon S3 bucket, specify the key `bucketName` with the name of the bucket and optionally specify the key `prefix` with a path.
         * * For a CloudWatch log group, specify the key `logGroup` with the name of the CloudWatch log group.
         * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the name of the delivery stream.
         * 
         * @return builder
         * 
         */
        public Builder logDestination(Map<String,String> logDestination) {
            return logDestination(Output.of(logDestination));
        }

        /**
         * @param logDestinationType The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationType(Output<String> logDestinationType) {
            $.logDestinationType = logDestinationType;
            return this;
        }

        /**
         * @param logDestinationType The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationType(String logDestinationType) {
            return logDestinationType(Output.of(logDestinationType));
        }

        /**
         * @param logType The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
         * 
         * @return builder
         * 
         */
        public Builder logType(Output<String> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            return logType(Output.of(logType));
        }

        public LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs build() {
            $.logDestination = Objects.requireNonNull($.logDestination, "expected parameter 'logDestination' to be non-null");
            $.logDestinationType = Objects.requireNonNull($.logDestinationType, "expected parameter 'logDestinationType' to be non-null");
            $.logType = Objects.requireNonNull($.logType, "expected parameter 'logType' to be non-null");
            return $;
        }
    }

}
