// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC.
 * 
 */
public final class ModelQualityJobDefinitionVpcConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionVpcConfigArgs Empty = new ModelQualityJobDefinitionVpcConfigArgs();

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
     * 
     */
    @Import(name="securityGroupIds", required=true)
      private final Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The ID of the subnets in the VPC to which you want to connect to your monitoring jobs.
     * 
     */
    @Import(name="subnets", required=true)
      private final Output<List<String>> subnets;

    public Output<List<String>> getSubnets() {
        return this.subnets;
    }

    public ModelQualityJobDefinitionVpcConfigArgs(
        Output<List<String>> securityGroupIds,
        Output<List<String>> subnets) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private ModelQualityJobDefinitionVpcConfigArgs() {
        this.securityGroupIds = Codegen.empty();
        this.subnets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> securityGroupIds;
        private Output<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionVpcConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Output.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnets(Output<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Output.of(Objects.requireNonNull(subnets));
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }        public ModelQualityJobDefinitionVpcConfigArgs build() {
            return new ModelQualityJobDefinitionVpcConfigArgs(securityGroupIds, subnets);
        }
    }
}
