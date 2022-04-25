// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigMasterGlobalAccessConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterPrivateClusterConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterPrivateClusterConfigGetArgs Empty = new ClusterPrivateClusterConfigGetArgs();

    /**
     * When `true`, the cluster&#39;s private
     * endpoint is used as the cluster endpoint and access through the public endpoint
     * is disabled. When `false`, either endpoint can be used. This field only applies
     * to private clusters, when `enable_private_nodes` is `true`.
     * 
     */
    @Import(name="enablePrivateEndpoint", required=true)
    private Output<Boolean> enablePrivateEndpoint;

    /**
     * @return When `true`, the cluster&#39;s private
     * endpoint is used as the cluster endpoint and access through the public endpoint
     * is disabled. When `false`, either endpoint can be used. This field only applies
     * to private clusters, when `enable_private_nodes` is `true`.
     * 
     */
    public Output<Boolean> enablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }

    /**
     * Enables the private cluster feature,
     * creating a private endpoint on the cluster. In a private cluster, nodes only
     * have RFC 1918 private addresses and communicate with the master&#39;s private
     * endpoint via private networking.
     * 
     */
    @Import(name="enablePrivateNodes")
    private @Nullable Output<Boolean> enablePrivateNodes;

    /**
     * @return Enables the private cluster feature,
     * creating a private endpoint on the cluster. In a private cluster, nodes only
     * have RFC 1918 private addresses and communicate with the master&#39;s private
     * endpoint via private networking.
     * 
     */
    public Optional<Output<Boolean>> enablePrivateNodes() {
        return Optional.ofNullable(this.enablePrivateNodes);
    }

    /**
     * Controls cluster master global
     * access settings. If unset, the provider will no longer manage this field and will
     * not modify the previously-set value. Structure is documented below.
     * 
     */
    @Import(name="masterGlobalAccessConfig")
    private @Nullable Output<ClusterPrivateClusterConfigMasterGlobalAccessConfigGetArgs> masterGlobalAccessConfig;

    /**
     * @return Controls cluster master global
     * access settings. If unset, the provider will no longer manage this field and will
     * not modify the previously-set value. Structure is documented below.
     * 
     */
    public Optional<Output<ClusterPrivateClusterConfigMasterGlobalAccessConfigGetArgs>> masterGlobalAccessConfig() {
        return Optional.ofNullable(this.masterGlobalAccessConfig);
    }

    /**
     * The IP range in CIDR notation to use for
     * the hosted master network. This range will be used for assigning private IP
     * addresses to the cluster master(s) and the ILB VIP. This range must not overlap
     * with any other ranges in use within the cluster&#39;s network, and it must be a /28
     * subnet. See [Private Cluster Limitations](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters#req_res_lim)
     * for more details. This field only applies to private clusters, when
     * `enable_private_nodes` is `true`.
     * 
     */
    @Import(name="masterIpv4CidrBlock")
    private @Nullable Output<String> masterIpv4CidrBlock;

    /**
     * @return The IP range in CIDR notation to use for
     * the hosted master network. This range will be used for assigning private IP
     * addresses to the cluster master(s) and the ILB VIP. This range must not overlap
     * with any other ranges in use within the cluster&#39;s network, and it must be a /28
     * subnet. See [Private Cluster Limitations](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters#req_res_lim)
     * for more details. This field only applies to private clusters, when
     * `enable_private_nodes` is `true`.
     * 
     */
    public Optional<Output<String>> masterIpv4CidrBlock() {
        return Optional.ofNullable(this.masterIpv4CidrBlock);
    }

    /**
     * The name of the peering between this cluster and the Google owned VPC.
     * 
     */
    @Import(name="peeringName")
    private @Nullable Output<String> peeringName;

    /**
     * @return The name of the peering between this cluster and the Google owned VPC.
     * 
     */
    public Optional<Output<String>> peeringName() {
        return Optional.ofNullable(this.peeringName);
    }

    /**
     * The internal IP address of this cluster&#39;s master endpoint.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable Output<String> privateEndpoint;

    /**
     * @return The internal IP address of this cluster&#39;s master endpoint.
     * 
     */
    public Optional<Output<String>> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * The external IP address of this cluster&#39;s master endpoint.
     * 
     */
    @Import(name="publicEndpoint")
    private @Nullable Output<String> publicEndpoint;

    /**
     * @return The external IP address of this cluster&#39;s master endpoint.
     * 
     */
    public Optional<Output<String>> publicEndpoint() {
        return Optional.ofNullable(this.publicEndpoint);
    }

    private ClusterPrivateClusterConfigGetArgs() {}

    private ClusterPrivateClusterConfigGetArgs(ClusterPrivateClusterConfigGetArgs $) {
        this.enablePrivateEndpoint = $.enablePrivateEndpoint;
        this.enablePrivateNodes = $.enablePrivateNodes;
        this.masterGlobalAccessConfig = $.masterGlobalAccessConfig;
        this.masterIpv4CidrBlock = $.masterIpv4CidrBlock;
        this.peeringName = $.peeringName;
        this.privateEndpoint = $.privateEndpoint;
        this.publicEndpoint = $.publicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterPrivateClusterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterPrivateClusterConfigGetArgs $;

        public Builder() {
            $ = new ClusterPrivateClusterConfigGetArgs();
        }

        public Builder(ClusterPrivateClusterConfigGetArgs defaults) {
            $ = new ClusterPrivateClusterConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enablePrivateEndpoint When `true`, the cluster&#39;s private
         * endpoint is used as the cluster endpoint and access through the public endpoint
         * is disabled. When `false`, either endpoint can be used. This field only applies
         * to private clusters, when `enable_private_nodes` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEndpoint(Output<Boolean> enablePrivateEndpoint) {
            $.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }

        /**
         * @param enablePrivateEndpoint When `true`, the cluster&#39;s private
         * endpoint is used as the cluster endpoint and access through the public endpoint
         * is disabled. When `false`, either endpoint can be used. This field only applies
         * to private clusters, when `enable_private_nodes` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            return enablePrivateEndpoint(Output.of(enablePrivateEndpoint));
        }

        /**
         * @param enablePrivateNodes Enables the private cluster feature,
         * creating a private endpoint on the cluster. In a private cluster, nodes only
         * have RFC 1918 private addresses and communicate with the master&#39;s private
         * endpoint via private networking.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateNodes(@Nullable Output<Boolean> enablePrivateNodes) {
            $.enablePrivateNodes = enablePrivateNodes;
            return this;
        }

        /**
         * @param enablePrivateNodes Enables the private cluster feature,
         * creating a private endpoint on the cluster. In a private cluster, nodes only
         * have RFC 1918 private addresses and communicate with the master&#39;s private
         * endpoint via private networking.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateNodes(Boolean enablePrivateNodes) {
            return enablePrivateNodes(Output.of(enablePrivateNodes));
        }

        /**
         * @param masterGlobalAccessConfig Controls cluster master global
         * access settings. If unset, the provider will no longer manage this field and will
         * not modify the previously-set value. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder masterGlobalAccessConfig(@Nullable Output<ClusterPrivateClusterConfigMasterGlobalAccessConfigGetArgs> masterGlobalAccessConfig) {
            $.masterGlobalAccessConfig = masterGlobalAccessConfig;
            return this;
        }

        /**
         * @param masterGlobalAccessConfig Controls cluster master global
         * access settings. If unset, the provider will no longer manage this field and will
         * not modify the previously-set value. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder masterGlobalAccessConfig(ClusterPrivateClusterConfigMasterGlobalAccessConfigGetArgs masterGlobalAccessConfig) {
            return masterGlobalAccessConfig(Output.of(masterGlobalAccessConfig));
        }

        /**
         * @param masterIpv4CidrBlock The IP range in CIDR notation to use for
         * the hosted master network. This range will be used for assigning private IP
         * addresses to the cluster master(s) and the ILB VIP. This range must not overlap
         * with any other ranges in use within the cluster&#39;s network, and it must be a /28
         * subnet. See [Private Cluster Limitations](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters#req_res_lim)
         * for more details. This field only applies to private clusters, when
         * `enable_private_nodes` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder masterIpv4CidrBlock(@Nullable Output<String> masterIpv4CidrBlock) {
            $.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }

        /**
         * @param masterIpv4CidrBlock The IP range in CIDR notation to use for
         * the hosted master network. This range will be used for assigning private IP
         * addresses to the cluster master(s) and the ILB VIP. This range must not overlap
         * with any other ranges in use within the cluster&#39;s network, and it must be a /28
         * subnet. See [Private Cluster Limitations](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters#req_res_lim)
         * for more details. This field only applies to private clusters, when
         * `enable_private_nodes` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            return masterIpv4CidrBlock(Output.of(masterIpv4CidrBlock));
        }

        /**
         * @param peeringName The name of the peering between this cluster and the Google owned VPC.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(@Nullable Output<String> peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        /**
         * @param peeringName The name of the peering between this cluster and the Google owned VPC.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            return peeringName(Output.of(peeringName));
        }

        /**
         * @param privateEndpoint The internal IP address of this cluster&#39;s master endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable Output<String> privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateEndpoint The internal IP address of this cluster&#39;s master endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(String privateEndpoint) {
            return privateEndpoint(Output.of(privateEndpoint));
        }

        /**
         * @param publicEndpoint The external IP address of this cluster&#39;s master endpoint.
         * 
         * @return builder
         * 
         */
        public Builder publicEndpoint(@Nullable Output<String> publicEndpoint) {
            $.publicEndpoint = publicEndpoint;
            return this;
        }

        /**
         * @param publicEndpoint The external IP address of this cluster&#39;s master endpoint.
         * 
         * @return builder
         * 
         */
        public Builder publicEndpoint(String publicEndpoint) {
            return publicEndpoint(Output.of(publicEndpoint));
        }

        public ClusterPrivateClusterConfigGetArgs build() {
            $.enablePrivateEndpoint = Objects.requireNonNull($.enablePrivateEndpoint, "expected parameter 'enablePrivateEndpoint' to be non-null");
            return $;
        }
    }

}
