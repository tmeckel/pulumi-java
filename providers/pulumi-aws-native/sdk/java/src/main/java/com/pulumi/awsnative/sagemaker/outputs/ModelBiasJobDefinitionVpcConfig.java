// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ModelBiasJobDefinitionVpcConfig {
    /**
     * @return The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * @return The ID of the subnets in the VPC to which you want to connect to your monitoring jobs.
     * 
     */
    private final List<String> subnets;

    @CustomType.Constructor
    private ModelBiasJobDefinitionVpcConfig(
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnets") List<String> subnets) {
        this.securityGroupIds = securityGroupIds;
        this.subnets = subnets;
    }

    /**
     * @return The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return The ID of the subnets in the VPC to which you want to connect to your monitoring jobs.
     * 
     */
    public List<String> subnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }        public ModelBiasJobDefinitionVpcConfig build() {
            return new ModelBiasJobDefinitionVpcConfig(securityGroupIds, subnets);
        }
    }
}
