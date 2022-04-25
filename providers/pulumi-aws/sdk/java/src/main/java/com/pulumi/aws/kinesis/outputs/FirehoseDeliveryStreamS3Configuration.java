// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamS3Configuration {
    /**
     * @return The ARN of the S3 bucket
     * 
     */
    private final String bucketArn;
    /**
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    private final @Nullable Integer bufferInterval;
    /**
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    private final @Nullable Integer bufferSize;
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * @return The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
     * 
     */
    private final @Nullable String compressionFormat;
    /**
     * @return Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    private final @Nullable String errorOutputPrefix;
    /**
     * @return Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * @return The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    private final @Nullable String prefix;
    /**
     * @return The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private FirehoseDeliveryStreamS3Configuration(
        @CustomType.Parameter("bucketArn") String bucketArn,
        @CustomType.Parameter("bufferInterval") @Nullable Integer bufferInterval,
        @CustomType.Parameter("bufferSize") @Nullable Integer bufferSize,
        @CustomType.Parameter("cloudwatchLoggingOptions") @Nullable FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @CustomType.Parameter("compressionFormat") @Nullable String compressionFormat,
        @CustomType.Parameter("errorOutputPrefix") @Nullable String errorOutputPrefix,
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.bucketArn = bucketArn;
        this.bufferInterval = bufferInterval;
        this.bufferSize = bufferSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.errorOutputPrefix = errorOutputPrefix;
        this.kmsKeyArn = kmsKeyArn;
        this.prefix = prefix;
        this.roleArn = roleArn;
    }

    /**
     * @return The ARN of the S3 bucket
     * 
     */
    public String bucketArn() {
        return this.bucketArn;
    }
    /**
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    public Optional<Integer> bufferInterval() {
        return Optional.ofNullable(this.bufferInterval);
    }
    /**
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    public Optional<Integer> bufferSize() {
        return Optional.ofNullable(this.bufferSize);
    }
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    public Optional<FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * @return The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
     * 
     */
    public Optional<String> compressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }
    /**
     * @return Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    public Optional<String> errorOutputPrefix() {
        return Optional.ofNullable(this.errorOutputPrefix);
    }
    /**
     * @return Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamS3Configuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketArn;
        private @Nullable Integer bufferInterval;
        private @Nullable Integer bufferSize;
        private @Nullable FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String compressionFormat;
        private @Nullable String errorOutputPrefix;
        private @Nullable String kmsKeyArn;
        private @Nullable String prefix;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamS3Configuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.bufferInterval = defaults.bufferInterval;
    	      this.bufferSize = defaults.bufferSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.prefix = defaults.prefix;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder bufferInterval(@Nullable Integer bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Builder bufferSize(@Nullable Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder compressionFormat(@Nullable String compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }
        public Builder errorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public FirehoseDeliveryStreamS3Configuration build() {
            return new FirehoseDeliveryStreamS3Configuration(bucketArn, bufferInterval, bufferSize, cloudwatchLoggingOptions, compressionFormat, errorOutputPrefix, kmsKeyArn, prefix, roleArn);
        }
    }
}
