// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.PrivateClusterMasterGlobalAccessConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for private clusters.
 * 
 */
public final class PrivateClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateClusterConfigArgs Empty = new PrivateClusterConfigArgs();

    /**
     * Whether the master's internal IP address is used as the cluster endpoint.
     * 
     */
    @InputImport(name="enablePrivateEndpoint")
    private final @Nullable Input<Boolean> enablePrivateEndpoint;

    public Input<Boolean> getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint == null ? Input.empty() : this.enablePrivateEndpoint;
    }

    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    @InputImport(name="enablePrivateNodes")
    private final @Nullable Input<Boolean> enablePrivateNodes;

    public Input<Boolean> getEnablePrivateNodes() {
        return this.enablePrivateNodes == null ? Input.empty() : this.enablePrivateNodes;
    }

    /**
     * Controls master global access settings.
     * 
     */
    @InputImport(name="masterGlobalAccessConfig")
    private final @Nullable Input<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig;

    public Input<PrivateClusterMasterGlobalAccessConfigArgs> getMasterGlobalAccessConfig() {
        return this.masterGlobalAccessConfig == null ? Input.empty() : this.masterGlobalAccessConfig;
    }

    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster's network.
     * 
     */
    @InputImport(name="masterIpv4CidrBlock")
    private final @Nullable Input<String> masterIpv4CidrBlock;

    public Input<String> getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock == null ? Input.empty() : this.masterIpv4CidrBlock;
    }

    public PrivateClusterConfigArgs(
        @Nullable Input<Boolean> enablePrivateEndpoint,
        @Nullable Input<Boolean> enablePrivateNodes,
        @Nullable Input<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig,
        @Nullable Input<String> masterIpv4CidrBlock) {
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.enablePrivateNodes = enablePrivateNodes;
        this.masterGlobalAccessConfig = masterGlobalAccessConfig;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
    }

    private PrivateClusterConfigArgs() {
        this.enablePrivateEndpoint = Input.empty();
        this.enablePrivateNodes = Input.empty();
        this.masterGlobalAccessConfig = Input.empty();
        this.masterIpv4CidrBlock = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enablePrivateEndpoint;
        private @Nullable Input<Boolean> enablePrivateNodes;
        private @Nullable Input<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig;
        private @Nullable Input<String> masterIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfig = defaults.masterGlobalAccessConfig;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
        }

        public Builder setEnablePrivateEndpoint(@Nullable Input<Boolean> enablePrivateEndpoint) {
            this.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }

        public Builder setEnablePrivateEndpoint(@Nullable Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Input.ofNullable(enablePrivateEndpoint);
            return this;
        }

        public Builder setEnablePrivateNodes(@Nullable Input<Boolean> enablePrivateNodes) {
            this.enablePrivateNodes = enablePrivateNodes;
            return this;
        }

        public Builder setEnablePrivateNodes(@Nullable Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Input.ofNullable(enablePrivateNodes);
            return this;
        }

        public Builder setMasterGlobalAccessConfig(@Nullable Input<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = masterGlobalAccessConfig;
            return this;
        }

        public Builder setMasterGlobalAccessConfig(@Nullable PrivateClusterMasterGlobalAccessConfigArgs masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = Input.ofNullable(masterGlobalAccessConfig);
            return this;
        }

        public Builder setMasterIpv4CidrBlock(@Nullable Input<String> masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }

        public Builder setMasterIpv4CidrBlock(@Nullable String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Input.ofNullable(masterIpv4CidrBlock);
            return this;
        }

        public PrivateClusterConfigArgs build() {
            return new PrivateClusterConfigArgs(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfig, masterIpv4CidrBlock);
        }
    }
}
