// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamKinesisSourceConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamServerSideEncryptionArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamArgs Empty = new FirehoseDeliveryStreamArgs();

    /**
     * The Amazon Resource Name (ARN) specifying the Stream
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, `splunk`, and `http_endpoint`.
     * 
     */
    @InputImport(name="destination", required=true)
      private final Input<String> destination;

    public Input<String> getDestination() {
        return this.destination;
    }

    @InputImport(name="destinationId")
      private final @Nullable Input<String> destinationId;

    public Input<String> getDestinationId() {
        return this.destinationId == null ? Input.empty() : this.destinationId;
    }

    /**
     * Configuration options if elasticsearch is the destination. More details are given below.
     * 
     */
    @InputImport(name="elasticsearchConfiguration")
      private final @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationArgs> elasticsearchConfiguration;

    public Input<FirehoseDeliveryStreamElasticsearchConfigurationArgs> getElasticsearchConfiguration() {
        return this.elasticsearchConfiguration == null ? Input.empty() : this.elasticsearchConfiguration;
    }

    /**
     * Enhanced configuration options for the s3 destination. More details are given below.
     * 
     */
    @InputImport(name="extendedS3Configuration")
      private final @Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationArgs> extendedS3Configuration;

    public Input<FirehoseDeliveryStreamExtendedS3ConfigurationArgs> getExtendedS3Configuration() {
        return this.extendedS3Configuration == null ? Input.empty() : this.extendedS3Configuration;
    }

    /**
     * Configuration options if http_endpoint is the destination. requires the user to also specify a `s3_configuration` block.  More details are given below.
     * 
     */
    @InputImport(name="httpEndpointConfiguration")
      private final @Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationArgs> httpEndpointConfiguration;

    public Input<FirehoseDeliveryStreamHttpEndpointConfigurationArgs> getHttpEndpointConfiguration() {
        return this.httpEndpointConfiguration == null ? Input.empty() : this.httpEndpointConfiguration;
    }

    /**
     * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
     * 
     */
    @InputImport(name="kinesisSourceConfiguration")
      private final @Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationArgs> kinesisSourceConfiguration;

    public Input<FirehoseDeliveryStreamKinesisSourceConfigurationArgs> getKinesisSourceConfiguration() {
        return this.kinesisSourceConfiguration == null ? Input.empty() : this.kinesisSourceConfiguration;
    }

    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration options if redshift is the destination.
     * Using `redshift_configuration` requires the user to also specify a
     * `s3_configuration` block. More details are given below.
     * 
     */
    @InputImport(name="redshiftConfiguration")
      private final @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationArgs> redshiftConfiguration;

    public Input<FirehoseDeliveryStreamRedshiftConfigurationArgs> getRedshiftConfiguration() {
        return this.redshiftConfiguration == null ? Input.empty() : this.redshiftConfiguration;
    }

    /**
     * Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
     * is redshift). More details are given below.
     * 
     */
    @InputImport(name="s3Configuration")
      private final @Nullable Input<FirehoseDeliveryStreamS3ConfigurationArgs> s3Configuration;

    public Input<FirehoseDeliveryStreamS3ConfigurationArgs> getS3Configuration() {
        return this.s3Configuration == null ? Input.empty() : this.s3Configuration;
    }

    /**
     * Encrypt at rest options.
     * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * 
     */
    @InputImport(name="serverSideEncryption")
      private final @Nullable Input<FirehoseDeliveryStreamServerSideEncryptionArgs> serverSideEncryption;

    public Input<FirehoseDeliveryStreamServerSideEncryptionArgs> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Input.empty() : this.serverSideEncryption;
    }

    /**
     * Configuration options if splunk is the destination. More details are given below.
     * 
     */
    @InputImport(name="splunkConfiguration")
      private final @Nullable Input<FirehoseDeliveryStreamSplunkConfigurationArgs> splunkConfiguration;

    public Input<FirehoseDeliveryStreamSplunkConfigurationArgs> getSplunkConfiguration() {
        return this.splunkConfiguration == null ? Input.empty() : this.splunkConfiguration;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specifies the table version for the output data schema. Defaults to `LATEST`.
     * 
     */
    @InputImport(name="versionId")
      private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    public FirehoseDeliveryStreamArgs(
        @Nullable Input<String> arn,
        Input<String> destination,
        @Nullable Input<String> destinationId,
        @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationArgs> elasticsearchConfiguration,
        @Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationArgs> extendedS3Configuration,
        @Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationArgs> httpEndpointConfiguration,
        @Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationArgs> kinesisSourceConfiguration,
        @Nullable Input<String> name,
        @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationArgs> redshiftConfiguration,
        @Nullable Input<FirehoseDeliveryStreamS3ConfigurationArgs> s3Configuration,
        @Nullable Input<FirehoseDeliveryStreamServerSideEncryptionArgs> serverSideEncryption,
        @Nullable Input<FirehoseDeliveryStreamSplunkConfigurationArgs> splunkConfiguration,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> versionId) {
        this.arn = arn;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.destinationId = destinationId;
        this.elasticsearchConfiguration = elasticsearchConfiguration;
        this.extendedS3Configuration = extendedS3Configuration;
        this.httpEndpointConfiguration = httpEndpointConfiguration;
        this.kinesisSourceConfiguration = kinesisSourceConfiguration;
        this.name = name;
        this.redshiftConfiguration = redshiftConfiguration;
        this.s3Configuration = s3Configuration;
        this.serverSideEncryption = serverSideEncryption;
        this.splunkConfiguration = splunkConfiguration;
        this.tags = tags;
        this.versionId = versionId;
    }

    private FirehoseDeliveryStreamArgs() {
        this.arn = Input.empty();
        this.destination = Input.empty();
        this.destinationId = Input.empty();
        this.elasticsearchConfiguration = Input.empty();
        this.extendedS3Configuration = Input.empty();
        this.httpEndpointConfiguration = Input.empty();
        this.kinesisSourceConfiguration = Input.empty();
        this.name = Input.empty();
        this.redshiftConfiguration = Input.empty();
        this.s3Configuration = Input.empty();
        this.serverSideEncryption = Input.empty();
        this.splunkConfiguration = Input.empty();
        this.tags = Input.empty();
        this.versionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private Input<String> destination;
        private @Nullable Input<String> destinationId;
        private @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationArgs> elasticsearchConfiguration;
        private @Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationArgs> extendedS3Configuration;
        private @Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationArgs> httpEndpointConfiguration;
        private @Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationArgs> kinesisSourceConfiguration;
        private @Nullable Input<String> name;
        private @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationArgs> redshiftConfiguration;
        private @Nullable Input<FirehoseDeliveryStreamS3ConfigurationArgs> s3Configuration;
        private @Nullable Input<FirehoseDeliveryStreamServerSideEncryptionArgs> serverSideEncryption;
        private @Nullable Input<FirehoseDeliveryStreamSplunkConfigurationArgs> splunkConfiguration;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destination = defaults.destination;
    	      this.destinationId = defaults.destinationId;
    	      this.elasticsearchConfiguration = defaults.elasticsearchConfiguration;
    	      this.extendedS3Configuration = defaults.extendedS3Configuration;
    	      this.httpEndpointConfiguration = defaults.httpEndpointConfiguration;
    	      this.kinesisSourceConfiguration = defaults.kinesisSourceConfiguration;
    	      this.name = defaults.name;
    	      this.redshiftConfiguration = defaults.redshiftConfiguration;
    	      this.s3Configuration = defaults.s3Configuration;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.splunkConfiguration = defaults.splunkConfiguration;
    	      this.tags = defaults.tags;
    	      this.versionId = defaults.versionId;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder destination(Input<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder destination(String destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder destinationId(@Nullable Input<String> destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        public Builder destinationId(@Nullable String destinationId) {
            this.destinationId = Input.ofNullable(destinationId);
            return this;
        }

        public Builder elasticsearchConfiguration(@Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationArgs> elasticsearchConfiguration) {
            this.elasticsearchConfiguration = elasticsearchConfiguration;
            return this;
        }

        public Builder elasticsearchConfiguration(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationArgs elasticsearchConfiguration) {
            this.elasticsearchConfiguration = Input.ofNullable(elasticsearchConfiguration);
            return this;
        }

        public Builder extendedS3Configuration(@Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationArgs> extendedS3Configuration) {
            this.extendedS3Configuration = extendedS3Configuration;
            return this;
        }

        public Builder extendedS3Configuration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationArgs extendedS3Configuration) {
            this.extendedS3Configuration = Input.ofNullable(extendedS3Configuration);
            return this;
        }

        public Builder httpEndpointConfiguration(@Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationArgs> httpEndpointConfiguration) {
            this.httpEndpointConfiguration = httpEndpointConfiguration;
            return this;
        }

        public Builder httpEndpointConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationArgs httpEndpointConfiguration) {
            this.httpEndpointConfiguration = Input.ofNullable(httpEndpointConfiguration);
            return this;
        }

        public Builder kinesisSourceConfiguration(@Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationArgs> kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = kinesisSourceConfiguration;
            return this;
        }

        public Builder kinesisSourceConfiguration(@Nullable FirehoseDeliveryStreamKinesisSourceConfigurationArgs kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = Input.ofNullable(kinesisSourceConfiguration);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder redshiftConfiguration(@Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationArgs> redshiftConfiguration) {
            this.redshiftConfiguration = redshiftConfiguration;
            return this;
        }

        public Builder redshiftConfiguration(@Nullable FirehoseDeliveryStreamRedshiftConfigurationArgs redshiftConfiguration) {
            this.redshiftConfiguration = Input.ofNullable(redshiftConfiguration);
            return this;
        }

        public Builder s3Configuration(@Nullable Input<FirehoseDeliveryStreamS3ConfigurationArgs> s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }

        public Builder s3Configuration(@Nullable FirehoseDeliveryStreamS3ConfigurationArgs s3Configuration) {
            this.s3Configuration = Input.ofNullable(s3Configuration);
            return this;
        }

        public Builder serverSideEncryption(@Nullable Input<FirehoseDeliveryStreamServerSideEncryptionArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder serverSideEncryption(@Nullable FirehoseDeliveryStreamServerSideEncryptionArgs serverSideEncryption) {
            this.serverSideEncryption = Input.ofNullable(serverSideEncryption);
            return this;
        }

        public Builder splunkConfiguration(@Nullable Input<FirehoseDeliveryStreamSplunkConfigurationArgs> splunkConfiguration) {
            this.splunkConfiguration = splunkConfiguration;
            return this;
        }

        public Builder splunkConfiguration(@Nullable FirehoseDeliveryStreamSplunkConfigurationArgs splunkConfiguration) {
            this.splunkConfiguration = Input.ofNullable(splunkConfiguration);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder versionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }
        public FirehoseDeliveryStreamArgs build() {
            return new FirehoseDeliveryStreamArgs(arn, destination, destinationId, elasticsearchConfiguration, extendedS3Configuration, httpEndpointConfiguration, kinesisSourceConfiguration, name, redshiftConfiguration, s3Configuration, serverSideEncryption, splunkConfiguration, tags, versionId);
        }
    }
}
