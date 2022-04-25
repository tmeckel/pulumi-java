// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3;

import com.pulumi.awsnative.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.AccessPointVpcConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.PolicyStatusPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    /**
     * The name of the bucket that you want to associate this Access Point with.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket that you want to associate this Access Point with.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The Access Point Policy you want to apply to this access point.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<Object> policy;

    /**
     * @return The Access Point Policy you want to apply to this access point.
     * 
     */
    public Optional<Output<Object>> policy() {
        return Optional.ofNullable(this.policy);
    }

    @Import(name="policyStatus")
    private @Nullable Output<PolicyStatusPropertiesArgs> policyStatus;

    public Optional<Output<PolicyStatusPropertiesArgs>> policyStatus() {
        return Optional.ofNullable(this.policyStatus);
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status &#39;The Meaning of Public&#39; in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    @Import(name="publicAccessBlockConfiguration")
    private @Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    /**
     * @return The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status &#39;The Meaning of Public&#39; in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    public Optional<Output<AccessPointPublicAccessBlockConfigurationArgs>> publicAccessBlockConfiguration() {
        return Optional.ofNullable(this.publicAccessBlockConfiguration);
    }

    /**
     * If you include this field, Amazon S3 restricts access to this Access Point to requests from the specified Virtual Private Cloud (VPC).
     * 
     */
    @Import(name="vpcConfiguration")
    private @Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration;

    /**
     * @return If you include this field, Amazon S3 restricts access to this Access Point to requests from the specified Virtual Private Cloud (VPC).
     * 
     */
    public Optional<Output<AccessPointVpcConfigurationArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private AccessPointArgs() {}

    private AccessPointArgs(AccessPointArgs $) {
        this.bucket = $.bucket;
        this.policy = $.policy;
        this.policyStatus = $.policyStatus;
        this.publicAccessBlockConfiguration = $.publicAccessBlockConfiguration;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointArgs $;

        public Builder() {
            $ = new AccessPointArgs();
        }

        public Builder(AccessPointArgs defaults) {
            $ = new AccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket that you want to associate this Access Point with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket that you want to associate this Access Point with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param policy The Access Point Policy you want to apply to this access point.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<Object> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The Access Point Policy you want to apply to this access point.
         * 
         * @return builder
         * 
         */
        public Builder policy(Object policy) {
            return policy(Output.of(policy));
        }

        public Builder policyStatus(@Nullable Output<PolicyStatusPropertiesArgs> policyStatus) {
            $.policyStatus = policyStatus;
            return this;
        }

        public Builder policyStatus(PolicyStatusPropertiesArgs policyStatus) {
            return policyStatus(Output.of(policyStatus));
        }

        /**
         * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status &#39;The Meaning of Public&#39; in the Amazon Simple Storage Service Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlockConfiguration(@Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            $.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        /**
         * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status &#39;The Meaning of Public&#39; in the Amazon Simple Storage Service Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlockConfiguration(AccessPointPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            return publicAccessBlockConfiguration(Output.of(publicAccessBlockConfiguration));
        }

        /**
         * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this Access Point to requests from the specified Virtual Private Cloud (VPC).
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(@Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        /**
         * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this Access Point to requests from the specified Virtual Private Cloud (VPC).
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(AccessPointVpcConfigurationArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public AccessPointArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
