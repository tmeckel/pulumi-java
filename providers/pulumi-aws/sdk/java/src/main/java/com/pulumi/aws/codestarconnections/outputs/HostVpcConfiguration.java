// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarconnections.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostVpcConfiguration {
    /**
     * @return he ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * @return The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    private final List<String> subnetIds;
    /**
     * @return The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
     * 
     */
    private final @Nullable String tlsCertificate;
    /**
     * @return The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private HostVpcConfiguration(
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("tlsCertificate") @Nullable String tlsCertificate,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.tlsCertificate = tlsCertificate;
        this.vpcId = vpcId;
    }

    /**
     * @return he ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
     * 
     */
    public Optional<String> tlsCertificate() {
        return Optional.ofNullable(this.tlsCertificate);
    }
    /**
     * @return The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String tlsCertificate;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(HostVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tlsCertificate = defaults.tlsCertificate;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tlsCertificate(@Nullable String tlsCertificate) {
            this.tlsCertificate = tlsCertificate;
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public HostVpcConfiguration build() {
            return new HostVpcConfiguration(securityGroupIds, subnetIds, tlsCertificate, vpcId);
        }
    }
}
