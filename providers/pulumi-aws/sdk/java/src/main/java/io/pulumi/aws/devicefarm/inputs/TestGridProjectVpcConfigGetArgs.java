// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TestGridProjectVpcConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestGridProjectVpcConfigGetArgs Empty = new TestGridProjectVpcConfigGetArgs();

    /**
     * A list of VPC security group IDs in your Amazon VPC.
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
      private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * A list of VPC subnet IDs in your Amazon VPC.
     * 
     */
    @InputImport(name="subnetIds", required=true)
      private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * The ID of the Amazon VPC.
     * 
     */
    @InputImport(name="vpcId", required=true)
      private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public TestGridProjectVpcConfigGetArgs(
        Input<List<String>> securityGroupIds,
        Input<List<String>> subnetIds,
        Input<String> vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private TestGridProjectVpcConfigGetArgs() {
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestGridProjectVpcConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroupIds;
        private Input<List<String>> subnetIds;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TestGridProjectVpcConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder subnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder vpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public TestGridProjectVpcConfigGetArgs build() {
            return new TestGridProjectVpcConfigGetArgs(securityGroupIds, subnetIds, vpcId);
        }
    }
}
