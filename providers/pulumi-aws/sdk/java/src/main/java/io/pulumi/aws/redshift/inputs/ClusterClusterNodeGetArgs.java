// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterNodeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterNodeGetArgs Empty = new ClusterClusterNodeGetArgs();

    /**
     * Whether the node is a leader node or a compute node
     * 
     */
    @InputImport(name="nodeRole")
      private final @Nullable Input<String> nodeRole;

    public Input<String> getNodeRole() {
        return this.nodeRole == null ? Input.empty() : this.nodeRole;
    }

    /**
     * The private IP address of a node within a cluster
     * 
     */
    @InputImport(name="privateIpAddress")
      private final @Nullable Input<String> privateIpAddress;

    public Input<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Input.empty() : this.privateIpAddress;
    }

    /**
     * The public IP address of a node within a cluster
     * 
     */
    @InputImport(name="publicIpAddress")
      private final @Nullable Input<String> publicIpAddress;

    public Input<String> getPublicIpAddress() {
        return this.publicIpAddress == null ? Input.empty() : this.publicIpAddress;
    }

    public ClusterClusterNodeGetArgs(
        @Nullable Input<String> nodeRole,
        @Nullable Input<String> privateIpAddress,
        @Nullable Input<String> publicIpAddress) {
        this.nodeRole = nodeRole;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
    }

    private ClusterClusterNodeGetArgs() {
        this.nodeRole = Input.empty();
        this.privateIpAddress = Input.empty();
        this.publicIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterNodeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> nodeRole;
        private @Nullable Input<String> privateIpAddress;
        private @Nullable Input<String> publicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterNodeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeRole = defaults.nodeRole;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        public Builder nodeRole(@Nullable Input<String> nodeRole) {
            this.nodeRole = nodeRole;
            return this;
        }

        public Builder nodeRole(@Nullable String nodeRole) {
            this.nodeRole = Input.ofNullable(nodeRole);
            return this;
        }

        public Builder privateIpAddress(@Nullable Input<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Input.ofNullable(privateIpAddress);
            return this;
        }

        public Builder publicIpAddress(@Nullable Input<String> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        public Builder publicIpAddress(@Nullable String publicIpAddress) {
            this.publicIpAddress = Input.ofNullable(publicIpAddress);
            return this;
        }
        public ClusterClusterNodeGetArgs build() {
            return new ClusterClusterNodeGetArgs(nodeRole, privateIpAddress, publicIpAddress);
        }
    }
}
