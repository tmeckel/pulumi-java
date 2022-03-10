// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkConfigurationArgs Empty = new ServiceNetworkConfigurationArgs();

    /**
     * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    @InputImport(name="assignPublicIp")
      private final @Nullable Input<Boolean> assignPublicIp;

    public Input<Boolean> getAssignPublicIp() {
        return this.assignPublicIp == null ? Input.empty() : this.assignPublicIp;
    }

    /**
     * Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    @InputImport(name="securityGroups")
      private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * Subnets associated with the task or service.
     * 
     */
    @InputImport(name="subnets", required=true)
      private final Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets;
    }

    public ServiceNetworkConfigurationArgs(
        @Nullable Input<Boolean> assignPublicIp,
        @Nullable Input<List<String>> securityGroups,
        Input<List<String>> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private ServiceNetworkConfigurationArgs() {
        this.assignPublicIp = Input.empty();
        this.securityGroups = Input.empty();
        this.subnets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> assignPublicIp;
        private @Nullable Input<List<String>> securityGroups;
        private Input<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable Input<Boolean> assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {
            this.assignPublicIp = Input.ofNullable(assignPublicIp);
            return this;
        }

        public Builder securityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder subnets(Input<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder subnets(List<String> subnets) {
            this.subnets = Input.of(Objects.requireNonNull(subnets));
            return this;
        }
        public ServiceNetworkConfigurationArgs build() {
            return new ServiceNetworkConfigurationArgs(assignPublicIp, securityGroups, subnets);
        }
    }
}
