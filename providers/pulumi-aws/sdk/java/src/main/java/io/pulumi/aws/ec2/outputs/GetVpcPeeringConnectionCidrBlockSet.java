// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetVpcPeeringConnectionCidrBlockSet {
    /**
     * The primary CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    private final String cidrBlock;

    @OutputCustomType.Constructor
    private GetVpcPeeringConnectionCidrBlockSet(@OutputCustomType.Parameter("cidrBlock") String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * The primary CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
     * 
    */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcPeeringConnectionCidrBlockSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcPeeringConnectionCidrBlockSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public GetVpcPeeringConnectionCidrBlockSet build() {
            return new GetVpcPeeringConnectionCidrBlockSet(cidrBlock);
        }
    }
}
