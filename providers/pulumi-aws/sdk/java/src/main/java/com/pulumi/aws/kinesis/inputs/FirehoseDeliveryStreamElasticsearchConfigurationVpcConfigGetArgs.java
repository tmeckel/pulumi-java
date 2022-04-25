// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs Empty = new FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs();

    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon EC2 configuration API and for creating network interfaces. Make sure role has necessary [IAM permissions](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-es-vpc)
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM role to be assumed by Firehose for calling the Amazon EC2 configuration API and for creating network interfaces. Make sure role has necessary [IAM permissions](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-es-vpc)
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A list of security group IDs to associate with Kinesis Firehose.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    /**
     * @return A list of security group IDs to associate with Kinesis Firehose.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * A list of subnet IDs to associate with Kinesis Firehose.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return A list of subnet IDs to associate with Kinesis Firehose.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs() {}

    private FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs(FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs $) {
        this.roleArn = $.roleArn;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs();
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs defaults) {
            $ = new FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roleArn The ARN of the IAM role to be assumed by Firehose for calling the Amazon EC2 configuration API and for creating network interfaces. Make sure role has necessary [IAM permissions](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-es-vpc)
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM role to be assumed by Firehose for calling the Amazon EC2 configuration API and for creating network interfaces. Make sure role has necessary [IAM permissions](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-es-vpc)
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param securityGroupIds A list of security group IDs to associate with Kinesis Firehose.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of security group IDs to associate with Kinesis Firehose.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of security group IDs to associate with Kinesis Firehose.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds A list of subnet IDs to associate with Kinesis Firehose.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of subnet IDs to associate with Kinesis Firehose.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of subnet IDs to associate with Kinesis Firehose.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigGetArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            return $;
        }
    }

}
