// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointServiceAllowedPrincipleState extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceAllowedPrincipleState Empty = new VpcEndpointServiceAllowedPrincipleState();

    /**
     * The ARN of the principal to allow permissions.
     * 
     */
    @Import(name="principalArn")
      private final @Nullable Output<String> principalArn;

    public Output<String> getPrincipalArn() {
        return this.principalArn == null ? Codegen.empty() : this.principalArn;
    }

    /**
     * The ID of the VPC endpoint service to allow permission.
     * 
     */
    @Import(name="vpcEndpointServiceId")
      private final @Nullable Output<String> vpcEndpointServiceId;

    public Output<String> getVpcEndpointServiceId() {
        return this.vpcEndpointServiceId == null ? Codegen.empty() : this.vpcEndpointServiceId;
    }

    public VpcEndpointServiceAllowedPrincipleState(
        @Nullable Output<String> principalArn,
        @Nullable Output<String> vpcEndpointServiceId) {
        this.principalArn = principalArn;
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    private VpcEndpointServiceAllowedPrincipleState() {
        this.principalArn = Codegen.empty();
        this.vpcEndpointServiceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointServiceAllowedPrincipleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> principalArn;
        private @Nullable Output<String> vpcEndpointServiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointServiceAllowedPrincipleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalArn = defaults.principalArn;
    	      this.vpcEndpointServiceId = defaults.vpcEndpointServiceId;
        }

        public Builder principalArn(@Nullable Output<String> principalArn) {
            this.principalArn = principalArn;
            return this;
        }
        public Builder principalArn(@Nullable String principalArn) {
            this.principalArn = Codegen.ofNullable(principalArn);
            return this;
        }
        public Builder vpcEndpointServiceId(@Nullable Output<String> vpcEndpointServiceId) {
            this.vpcEndpointServiceId = vpcEndpointServiceId;
            return this;
        }
        public Builder vpcEndpointServiceId(@Nullable String vpcEndpointServiceId) {
            this.vpcEndpointServiceId = Codegen.ofNullable(vpcEndpointServiceId);
            return this;
        }        public VpcEndpointServiceAllowedPrincipleState build() {
            return new VpcEndpointServiceAllowedPrincipleState(principalArn, vpcEndpointServiceId);
        }
    }
}
