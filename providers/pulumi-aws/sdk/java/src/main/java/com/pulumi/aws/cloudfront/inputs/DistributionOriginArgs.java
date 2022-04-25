// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.DistributionOriginCustomHeaderArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOriginCustomOriginConfigArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOriginOriginShieldArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOriginS3OriginConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOriginArgs Empty = new DistributionOriginArgs();

    /**
     * The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    @Import(name="connectionAttempts")
    private @Nullable Output<Integer> connectionAttempts;

    /**
     * @return The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    public Optional<Output<Integer>> connectionAttempts() {
        return Optional.ofNullable(this.connectionAttempts);
    }

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    @Import(name="connectionTimeout")
    private @Nullable Output<Integer> connectionTimeout;

    /**
     * @return The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    public Optional<Output<Integer>> connectionTimeout() {
        return Optional.ofNullable(this.connectionTimeout);
    }

    /**
     * One or more sub-resources with `name` and
     * `value` parameters that specify header data that will be sent to the origin
     * (multiples allowed).
     * 
     */
    @Import(name="customHeaders")
    private @Nullable Output<List<DistributionOriginCustomHeaderArgs>> customHeaders;

    /**
     * @return One or more sub-resources with `name` and
     * `value` parameters that specify header data that will be sent to the origin
     * (multiples allowed).
     * 
     */
    public Optional<Output<List<DistributionOriginCustomHeaderArgs>>> customHeaders() {
        return Optional.ofNullable(this.customHeaders);
    }

    /**
     * The CloudFront custom
     * origin configuration information. If an S3
     * origin is required, use `s3_origin_config` instead.
     * 
     */
    @Import(name="customOriginConfig")
    private @Nullable Output<DistributionOriginCustomOriginConfigArgs> customOriginConfig;

    /**
     * @return The CloudFront custom
     * origin configuration information. If an S3
     * origin is required, use `s3_origin_config` instead.
     * 
     */
    public Optional<Output<DistributionOriginCustomOriginConfigArgs>> customOriginConfig() {
        return Optional.ofNullable(this.customOriginConfig);
    }

    /**
     * The DNS domain name of either the S3 bucket, or
     * web site of your custom origin.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The DNS domain name of either the S3 bucket, or
     * web site of your custom origin.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The unique identifier of the member origin
     * 
     */
    @Import(name="originId", required=true)
    private Output<String> originId;

    /**
     * @return The unique identifier of the member origin
     * 
     */
    public Output<String> originId() {
        return this.originId;
    }

    /**
     * An optional element that causes CloudFront to
     * request your content from a directory in your Amazon S3 bucket or your
     * custom origin.
     * 
     */
    @Import(name="originPath")
    private @Nullable Output<String> originPath;

    /**
     * @return An optional element that causes CloudFront to
     * request your content from a directory in your Amazon S3 bucket or your
     * custom origin.
     * 
     */
    public Optional<Output<String>> originPath() {
        return Optional.ofNullable(this.originPath);
    }

    /**
     * The CloudFront Origin Shield
     * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    @Import(name="originShield")
    private @Nullable Output<DistributionOriginOriginShieldArgs> originShield;

    /**
     * @return The CloudFront Origin Shield
     * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    public Optional<Output<DistributionOriginOriginShieldArgs>> originShield() {
        return Optional.ofNullable(this.originShield);
    }

    /**
     * The CloudFront S3 origin
     * configuration information. If a custom origin is required, use
     * `custom_origin_config` instead.
     * 
     */
    @Import(name="s3OriginConfig")
    private @Nullable Output<DistributionOriginS3OriginConfigArgs> s3OriginConfig;

    /**
     * @return The CloudFront S3 origin
     * configuration information. If a custom origin is required, use
     * `custom_origin_config` instead.
     * 
     */
    public Optional<Output<DistributionOriginS3OriginConfigArgs>> s3OriginConfig() {
        return Optional.ofNullable(this.s3OriginConfig);
    }

    private DistributionOriginArgs() {}

    private DistributionOriginArgs(DistributionOriginArgs $) {
        this.connectionAttempts = $.connectionAttempts;
        this.connectionTimeout = $.connectionTimeout;
        this.customHeaders = $.customHeaders;
        this.customOriginConfig = $.customOriginConfig;
        this.domainName = $.domainName;
        this.originId = $.originId;
        this.originPath = $.originPath;
        this.originShield = $.originShield;
        this.s3OriginConfig = $.s3OriginConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginArgs $;

        public Builder() {
            $ = new DistributionOriginArgs();
        }

        public Builder(DistributionOriginArgs defaults) {
            $ = new DistributionOriginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionAttempts The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
         * 
         * @return builder
         * 
         */
        public Builder connectionAttempts(@Nullable Output<Integer> connectionAttempts) {
            $.connectionAttempts = connectionAttempts;
            return this;
        }

        /**
         * @param connectionAttempts The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
         * 
         * @return builder
         * 
         */
        public Builder connectionAttempts(Integer connectionAttempts) {
            return connectionAttempts(Output.of(connectionAttempts));
        }

        /**
         * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
         * 
         * @return builder
         * 
         */
        public Builder connectionTimeout(@Nullable Output<Integer> connectionTimeout) {
            $.connectionTimeout = connectionTimeout;
            return this;
        }

        /**
         * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
         * 
         * @return builder
         * 
         */
        public Builder connectionTimeout(Integer connectionTimeout) {
            return connectionTimeout(Output.of(connectionTimeout));
        }

        /**
         * @param customHeaders One or more sub-resources with `name` and
         * `value` parameters that specify header data that will be sent to the origin
         * (multiples allowed).
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(@Nullable Output<List<DistributionOriginCustomHeaderArgs>> customHeaders) {
            $.customHeaders = customHeaders;
            return this;
        }

        /**
         * @param customHeaders One or more sub-resources with `name` and
         * `value` parameters that specify header data that will be sent to the origin
         * (multiples allowed).
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(List<DistributionOriginCustomHeaderArgs> customHeaders) {
            return customHeaders(Output.of(customHeaders));
        }

        /**
         * @param customHeaders One or more sub-resources with `name` and
         * `value` parameters that specify header data that will be sent to the origin
         * (multiples allowed).
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(DistributionOriginCustomHeaderArgs... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }

        /**
         * @param customOriginConfig The CloudFront custom
         * origin configuration information. If an S3
         * origin is required, use `s3_origin_config` instead.
         * 
         * @return builder
         * 
         */
        public Builder customOriginConfig(@Nullable Output<DistributionOriginCustomOriginConfigArgs> customOriginConfig) {
            $.customOriginConfig = customOriginConfig;
            return this;
        }

        /**
         * @param customOriginConfig The CloudFront custom
         * origin configuration information. If an S3
         * origin is required, use `s3_origin_config` instead.
         * 
         * @return builder
         * 
         */
        public Builder customOriginConfig(DistributionOriginCustomOriginConfigArgs customOriginConfig) {
            return customOriginConfig(Output.of(customOriginConfig));
        }

        /**
         * @param domainName The DNS domain name of either the S3 bucket, or
         * web site of your custom origin.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The DNS domain name of either the S3 bucket, or
         * web site of your custom origin.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param originId The unique identifier of the member origin
         * 
         * @return builder
         * 
         */
        public Builder originId(Output<String> originId) {
            $.originId = originId;
            return this;
        }

        /**
         * @param originId The unique identifier of the member origin
         * 
         * @return builder
         * 
         */
        public Builder originId(String originId) {
            return originId(Output.of(originId));
        }

        /**
         * @param originPath An optional element that causes CloudFront to
         * request your content from a directory in your Amazon S3 bucket or your
         * custom origin.
         * 
         * @return builder
         * 
         */
        public Builder originPath(@Nullable Output<String> originPath) {
            $.originPath = originPath;
            return this;
        }

        /**
         * @param originPath An optional element that causes CloudFront to
         * request your content from a directory in your Amazon S3 bucket or your
         * custom origin.
         * 
         * @return builder
         * 
         */
        public Builder originPath(String originPath) {
            return originPath(Output.of(originPath));
        }

        /**
         * @param originShield The CloudFront Origin Shield
         * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder originShield(@Nullable Output<DistributionOriginOriginShieldArgs> originShield) {
            $.originShield = originShield;
            return this;
        }

        /**
         * @param originShield The CloudFront Origin Shield
         * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder originShield(DistributionOriginOriginShieldArgs originShield) {
            return originShield(Output.of(originShield));
        }

        /**
         * @param s3OriginConfig The CloudFront S3 origin
         * configuration information. If a custom origin is required, use
         * `custom_origin_config` instead.
         * 
         * @return builder
         * 
         */
        public Builder s3OriginConfig(@Nullable Output<DistributionOriginS3OriginConfigArgs> s3OriginConfig) {
            $.s3OriginConfig = s3OriginConfig;
            return this;
        }

        /**
         * @param s3OriginConfig The CloudFront S3 origin
         * configuration information. If a custom origin is required, use
         * `custom_origin_config` instead.
         * 
         * @return builder
         * 
         */
        public Builder s3OriginConfig(DistributionOriginS3OriginConfigArgs s3OriginConfig) {
            return s3OriginConfig(Output.of(s3OriginConfig));
        }

        public DistributionOriginArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.originId = Objects.requireNonNull($.originId, "expected parameter 'originId' to be non-null");
            return $;
        }
    }

}
