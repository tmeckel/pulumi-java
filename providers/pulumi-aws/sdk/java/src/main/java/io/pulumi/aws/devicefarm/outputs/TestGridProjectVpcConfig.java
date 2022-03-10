// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TestGridProjectVpcConfig {
    /**
     * A list of VPC security group IDs in your Amazon VPC.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * A list of VPC subnet IDs in your Amazon VPC.
     * 
     */
    private final List<String> subnetIds;
    /**
     * The ID of the Amazon VPC.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor
    private TestGridProjectVpcConfig(
        @OutputCustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @OutputCustomType.Parameter("subnetIds") List<String> subnetIds,
        @OutputCustomType.Parameter("vpcId") String vpcId) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * A list of VPC security group IDs in your Amazon VPC.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * A list of VPC subnet IDs in your Amazon VPC.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * The ID of the Amazon VPC.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestGridProjectVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TestGridProjectVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public TestGridProjectVpcConfig build() {
            return new TestGridProjectVpcConfig(securityGroupIds, subnetIds, vpcId);
        }
    }
}
