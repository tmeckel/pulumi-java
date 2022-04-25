// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TestGridProjectVpcConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestGridProjectVpcConfigGetArgs Empty = new TestGridProjectVpcConfigGetArgs();

    /**
     * A list of VPC security group IDs in your Amazon VPC.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    /**
     * @return A list of VPC security group IDs in your Amazon VPC.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * A list of VPC subnet IDs in your Amazon VPC.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return A list of VPC subnet IDs in your Amazon VPC.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * The ID of the Amazon VPC.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the Amazon VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private TestGridProjectVpcConfigGetArgs() {}

    private TestGridProjectVpcConfigGetArgs(TestGridProjectVpcConfigGetArgs $) {
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestGridProjectVpcConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestGridProjectVpcConfigGetArgs $;

        public Builder() {
            $ = new TestGridProjectVpcConfigGetArgs();
        }

        public Builder(TestGridProjectVpcConfigGetArgs defaults) {
            $ = new TestGridProjectVpcConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityGroupIds A list of VPC security group IDs in your Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of VPC security group IDs in your Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of VPC security group IDs in your Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds A list of VPC subnet IDs in your Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of VPC subnet IDs in your Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of VPC subnet IDs in your Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param vpcId The ID of the Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the Amazon VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public TestGridProjectVpcConfigGetArgs build() {
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
