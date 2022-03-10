// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupSecurityDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataflowEndpointGroupSecurityDetailsArgs Empty = new DataflowEndpointGroupSecurityDetailsArgs();

    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    public DataflowEndpointGroupSecurityDetailsArgs(
        @Nullable Input<String> roleArn,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<List<String>> subnetIds) {
        this.roleArn = roleArn;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    private DataflowEndpointGroupSecurityDetailsArgs() {
        this.roleArn = Input.empty();
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupSecurityDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> roleArn;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupSecurityDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder roleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder securityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder subnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }
        public DataflowEndpointGroupSecurityDetailsArgs build() {
            return new DataflowEndpointGroupSecurityDetailsArgs(roleArn, securityGroupIds, subnetIds);
        }
    }
}
