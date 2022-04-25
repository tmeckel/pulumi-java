// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityGroupIngress {
    /**
     * @return The CIDR block to accept
     * 
     */
    private final @Nullable String cidr;
    /**
     * @return The name of the security group to authorize
     * 
     */
    private final @Nullable String securityGroupName;
    /**
     * @return The owner Id of the security group provided
     * by `security_group_name`.
     * 
     */
    private final @Nullable String securityGroupOwnerId;

    @CustomType.Constructor
    private SecurityGroupIngress(
        @CustomType.Parameter("cidr") @Nullable String cidr,
        @CustomType.Parameter("securityGroupName") @Nullable String securityGroupName,
        @CustomType.Parameter("securityGroupOwnerId") @Nullable String securityGroupOwnerId) {
        this.cidr = cidr;
        this.securityGroupName = securityGroupName;
        this.securityGroupOwnerId = securityGroupOwnerId;
    }

    /**
     * @return The CIDR block to accept
     * 
     */
    public Optional<String> cidr() {
        return Optional.ofNullable(this.cidr);
    }
    /**
     * @return The name of the security group to authorize
     * 
     */
    public Optional<String> securityGroupName() {
        return Optional.ofNullable(this.securityGroupName);
    }
    /**
     * @return The owner Id of the security group provided
     * by `security_group_name`.
     * 
     */
    public Optional<String> securityGroupOwnerId() {
        return Optional.ofNullable(this.securityGroupOwnerId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupIngress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidr;
        private @Nullable String securityGroupName;
        private @Nullable String securityGroupOwnerId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.securityGroupName = defaults.securityGroupName;
    	      this.securityGroupOwnerId = defaults.securityGroupOwnerId;
        }

        public Builder cidr(@Nullable String cidr) {
            this.cidr = cidr;
            return this;
        }
        public Builder securityGroupName(@Nullable String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public Builder securityGroupOwnerId(@Nullable String securityGroupOwnerId) {
            this.securityGroupOwnerId = securityGroupOwnerId;
            return this;
        }        public SecurityGroupIngress build() {
            return new SecurityGroupIngress(cidr, securityGroupName, securityGroupOwnerId);
        }
    }
}
