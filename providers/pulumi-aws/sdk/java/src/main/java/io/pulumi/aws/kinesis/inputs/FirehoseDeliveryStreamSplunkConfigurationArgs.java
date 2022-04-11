// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamSplunkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamSplunkConfigurationArgs Empty = new FirehoseDeliveryStreamSplunkConfigurationArgs();

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
      private final @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Output<FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Codegen.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * The amount of time, in seconds between 180 and 600, that Kinesis Firehose waits to receive an acknowledgment from Splunk after it sends it data.
     * 
     */
    @Import(name="hecAcknowledgmentTimeout")
      private final @Nullable Output<Integer> hecAcknowledgmentTimeout;

    public Output<Integer> getHecAcknowledgmentTimeout() {
        return this.hecAcknowledgmentTimeout == null ? Codegen.empty() : this.hecAcknowledgmentTimeout;
    }

    /**
     * The HTTP Event Collector (HEC) endpoint to which Kinesis Firehose sends your data.
     * 
     */
    @Import(name="hecEndpoint", required=true)
      private final Output<String> hecEndpoint;

    public Output<String> getHecEndpoint() {
        return this.hecEndpoint;
    }

    /**
     * The HEC endpoint type. Valid values are `Raw` or `Event`. The default value is `Raw`.
     * 
     */
    @Import(name="hecEndpointType")
      private final @Nullable Output<String> hecEndpointType;

    public Output<String> getHecEndpointType() {
        return this.hecEndpointType == null ? Codegen.empty() : this.hecEndpointType;
    }

    /**
     * The GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * 
     */
    @Import(name="hecToken", required=true)
      private final Output<String> hecToken;

    public Output<String> getHecToken() {
        return this.hecToken;
    }

    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    @Import(name="processingConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs> processingConfiguration;

    public Output<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Codegen.empty() : this.processingConfiguration;
    }

    /**
     * After an initial failure to deliver to Splunk, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    @Import(name="retryDuration")
      private final @Nullable Output<Integer> retryDuration;

    public Output<Integer> getRetryDuration() {
        return this.retryDuration == null ? Codegen.empty() : this.retryDuration;
    }

    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
     * 
     */
    @Import(name="s3BackupMode")
      private final @Nullable Output<String> s3BackupMode;

    public Output<String> getS3BackupMode() {
        return this.s3BackupMode == null ? Codegen.empty() : this.s3BackupMode;
    }

    public FirehoseDeliveryStreamSplunkConfigurationArgs(
        @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions,
        @Nullable Output<Integer> hecAcknowledgmentTimeout,
        Output<String> hecEndpoint,
        @Nullable Output<String> hecEndpointType,
        Output<String> hecToken,
        @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs> processingConfiguration,
        @Nullable Output<Integer> retryDuration,
        @Nullable Output<String> s3BackupMode) {
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.hecAcknowledgmentTimeout = hecAcknowledgmentTimeout;
        this.hecEndpoint = Objects.requireNonNull(hecEndpoint, "expected parameter 'hecEndpoint' to be non-null");
        this.hecEndpointType = hecEndpointType;
        this.hecToken = Objects.requireNonNull(hecToken, "expected parameter 'hecToken' to be non-null");
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.s3BackupMode = s3BackupMode;
    }

    private FirehoseDeliveryStreamSplunkConfigurationArgs() {
        this.cloudwatchLoggingOptions = Codegen.empty();
        this.hecAcknowledgmentTimeout = Codegen.empty();
        this.hecEndpoint = Codegen.empty();
        this.hecEndpointType = Codegen.empty();
        this.hecToken = Codegen.empty();
        this.processingConfiguration = Codegen.empty();
        this.retryDuration = Codegen.empty();
        this.s3BackupMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamSplunkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;
        private @Nullable Output<Integer> hecAcknowledgmentTimeout;
        private Output<String> hecEndpoint;
        private @Nullable Output<String> hecEndpointType;
        private Output<String> hecToken;
        private @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Output<Integer> retryDuration;
        private @Nullable Output<String> s3BackupMode;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamSplunkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.hecAcknowledgmentTimeout = defaults.hecAcknowledgmentTimeout;
    	      this.hecEndpoint = defaults.hecEndpoint;
    	      this.hecEndpointType = defaults.hecEndpointType;
    	      this.hecToken = defaults.hecToken;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.s3BackupMode = defaults.s3BackupMode;
        }

        public Builder cloudwatchLoggingOptions(@Nullable Output<FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Codegen.ofNullable(cloudwatchLoggingOptions);
            return this;
        }
        public Builder hecAcknowledgmentTimeout(@Nullable Output<Integer> hecAcknowledgmentTimeout) {
            this.hecAcknowledgmentTimeout = hecAcknowledgmentTimeout;
            return this;
        }
        public Builder hecAcknowledgmentTimeout(@Nullable Integer hecAcknowledgmentTimeout) {
            this.hecAcknowledgmentTimeout = Codegen.ofNullable(hecAcknowledgmentTimeout);
            return this;
        }
        public Builder hecEndpoint(Output<String> hecEndpoint) {
            this.hecEndpoint = Objects.requireNonNull(hecEndpoint);
            return this;
        }
        public Builder hecEndpoint(String hecEndpoint) {
            this.hecEndpoint = Output.of(Objects.requireNonNull(hecEndpoint));
            return this;
        }
        public Builder hecEndpointType(@Nullable Output<String> hecEndpointType) {
            this.hecEndpointType = hecEndpointType;
            return this;
        }
        public Builder hecEndpointType(@Nullable String hecEndpointType) {
            this.hecEndpointType = Codegen.ofNullable(hecEndpointType);
            return this;
        }
        public Builder hecToken(Output<String> hecToken) {
            this.hecToken = Objects.requireNonNull(hecToken);
            return this;
        }
        public Builder hecToken(String hecToken) {
            this.hecToken = Output.of(Objects.requireNonNull(hecToken));
            return this;
        }
        public Builder processingConfiguration(@Nullable Output<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder processingConfiguration(@Nullable FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Codegen.ofNullable(processingConfiguration);
            return this;
        }
        public Builder retryDuration(@Nullable Output<Integer> retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }
        public Builder retryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = Codegen.ofNullable(retryDuration);
            return this;
        }
        public Builder s3BackupMode(@Nullable Output<String> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public Builder s3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = Codegen.ofNullable(s3BackupMode);
            return this;
        }        public FirehoseDeliveryStreamSplunkConfigurationArgs build() {
            return new FirehoseDeliveryStreamSplunkConfigurationArgs(cloudwatchLoggingOptions, hecAcknowledgmentTimeout, hecEndpoint, hecEndpointType, hecToken, processingConfiguration, retryDuration, s3BackupMode);
        }
    }
}
