// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs;
import io.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringConnectionOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringConnectionOptionsArgs Empty = new PeeringConnectionOptionsArgs();

    /**
     * An optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     * 
     */
    @Import(name="accepter")
      private final @Nullable Output<PeeringConnectionOptionsAccepterArgs> accepter;

    public Output<PeeringConnectionOptionsAccepterArgs> getAccepter() {
        return this.accepter == null ? Codegen.empty() : this.accepter;
    }

    /**
     * A optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     * 
     */
    @Import(name="requester")
      private final @Nullable Output<PeeringConnectionOptionsRequesterArgs> requester;

    public Output<PeeringConnectionOptionsRequesterArgs> getRequester() {
        return this.requester == null ? Codegen.empty() : this.requester;
    }

    /**
     * The ID of the requester VPC peering connection.
     * 
     */
    @Import(name="vpcPeeringConnectionId", required=true)
      private final Output<String> vpcPeeringConnectionId;

    public Output<String> getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    public PeeringConnectionOptionsArgs(
        @Nullable Output<PeeringConnectionOptionsAccepterArgs> accepter,
        @Nullable Output<PeeringConnectionOptionsRequesterArgs> requester,
        Output<String> vpcPeeringConnectionId) {
        this.accepter = accepter;
        this.requester = requester;
        this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId, "expected parameter 'vpcPeeringConnectionId' to be non-null");
    }

    private PeeringConnectionOptionsArgs() {
        this.accepter = Codegen.empty();
        this.requester = Codegen.empty();
        this.vpcPeeringConnectionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringConnectionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PeeringConnectionOptionsAccepterArgs> accepter;
        private @Nullable Output<PeeringConnectionOptionsRequesterArgs> requester;
        private Output<String> vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringConnectionOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepter = defaults.accepter;
    	      this.requester = defaults.requester;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder accepter(@Nullable Output<PeeringConnectionOptionsAccepterArgs> accepter) {
            this.accepter = accepter;
            return this;
        }
        public Builder accepter(@Nullable PeeringConnectionOptionsAccepterArgs accepter) {
            this.accepter = Codegen.ofNullable(accepter);
            return this;
        }
        public Builder requester(@Nullable Output<PeeringConnectionOptionsRequesterArgs> requester) {
            this.requester = requester;
            return this;
        }
        public Builder requester(@Nullable PeeringConnectionOptionsRequesterArgs requester) {
            this.requester = Codegen.ofNullable(requester);
            return this;
        }
        public Builder vpcPeeringConnectionId(Output<String> vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId);
            return this;
        }
        public Builder vpcPeeringConnectionId(String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Output.of(Objects.requireNonNull(vpcPeeringConnectionId));
            return this;
        }        public PeeringConnectionOptionsArgs build() {
            return new PeeringConnectionOptionsArgs(accepter, requester, vpcPeeringConnectionId);
        }
    }
}
