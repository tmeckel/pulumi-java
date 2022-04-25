// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs();

    /**
     * The ARN of the S3 bucket
     * 
     */
    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    /**
     * @return The ARN of the S3 bucket
     * 
     */
    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    @Import(name="bufferInterval")
    private @Nullable Output<Integer> bufferInterval;

    /**
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    public Optional<Output<Integer>> bufferInterval() {
        return Optional.ofNullable(this.bufferInterval);
    }

    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    @Import(name="bufferSize")
    private @Nullable Output<Integer> bufferSize;

    /**
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    public Optional<Output<Integer>> bufferSize() {
        return Optional.ofNullable(this.bufferSize);
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
    private @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    public Optional<Output<FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs>> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }

    /**
     * The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
     * 
     */
    @Import(name="compressionFormat")
    private @Nullable Output<String> compressionFormat;

    /**
     * @return The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
     * 
     */
    public Optional<Output<String>> compressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }

    /**
     * Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    @Import(name="errorOutputPrefix")
    private @Nullable Output<String> errorOutputPrefix;

    /**
     * @return Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    public Optional<Output<String>> errorOutputPrefix() {
        return Optional.ofNullable(this.errorOutputPrefix);
    }

    /**
     * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs() {}

    private FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs(FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs $) {
        this.bucketArn = $.bucketArn;
        this.bufferInterval = $.bufferInterval;
        this.bufferSize = $.bufferSize;
        this.cloudwatchLoggingOptions = $.cloudwatchLoggingOptions;
        this.compressionFormat = $.compressionFormat;
        this.errorOutputPrefix = $.errorOutputPrefix;
        this.kmsKeyArn = $.kmsKeyArn;
        this.prefix = $.prefix;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs();
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs defaults) {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketArn The ARN of the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        /**
         * @param bucketArn The ARN of the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        /**
         * @param bufferInterval Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
         * 
         * @return builder
         * 
         */
        public Builder bufferInterval(@Nullable Output<Integer> bufferInterval) {
            $.bufferInterval = bufferInterval;
            return this;
        }

        /**
         * @param bufferInterval Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
         * 
         * @return builder
         * 
         */
        public Builder bufferInterval(Integer bufferInterval) {
            return bufferInterval(Output.of(bufferInterval));
        }

        /**
         * @param bufferSize Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
         * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
         * 
         * @return builder
         * 
         */
        public Builder bufferSize(@Nullable Output<Integer> bufferSize) {
            $.bufferSize = bufferSize;
            return this;
        }

        /**
         * @param bufferSize Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
         * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
         * 
         * @return builder
         * 
         */
        public Builder bufferSize(Integer bufferSize) {
            return bufferSize(Output.of(bufferSize));
        }

        /**
         * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLoggingOptions(@Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            $.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        /**
         * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLoggingOptions(FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            return cloudwatchLoggingOptions(Output.of(cloudwatchLoggingOptions));
        }

        /**
         * @param compressionFormat The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
         * 
         * @return builder
         * 
         */
        public Builder compressionFormat(@Nullable Output<String> compressionFormat) {
            $.compressionFormat = compressionFormat;
            return this;
        }

        /**
         * @param compressionFormat The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
         * 
         * @return builder
         * 
         */
        public Builder compressionFormat(String compressionFormat) {
            return compressionFormat(Output.of(compressionFormat));
        }

        /**
         * @param errorOutputPrefix Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
         * 
         * @return builder
         * 
         */
        public Builder errorOutputPrefix(@Nullable Output<String> errorOutputPrefix) {
            $.errorOutputPrefix = errorOutputPrefix;
            return this;
        }

        /**
         * @param errorOutputPrefix Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
         * 
         * @return builder
         * 
         */
        public Builder errorOutputPrefix(String errorOutputPrefix) {
            return errorOutputPrefix(Output.of(errorOutputPrefix));
        }

        /**
         * @param kmsKeyArn Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
         * be used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
         * be used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        /**
         * @param prefix The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param roleArn The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs build() {
            $.bucketArn = Objects.requireNonNull($.bucketArn, "expected parameter 'bucketArn' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
