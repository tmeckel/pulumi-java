// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters for node pool-level network config.
 * 
 */
public final class NodeNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeNetworkConfigArgs Empty = new NodeNetworkConfigArgs();

    /**
     * Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @Import(name="createPodRange")
    private @Nullable Output<Boolean> createPodRange;

    /**
     * @return Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    public Optional<Output<Boolean>> createPodRange() {
        return Optional.ofNullable(this.createPodRange);
    }

    /**
     * The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @Import(name="podIpv4CidrBlock")
    private @Nullable Output<String> podIpv4CidrBlock;

    /**
     * @return The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    public Optional<Output<String>> podIpv4CidrBlock() {
        return Optional.ofNullable(this.podIpv4CidrBlock);
    }

    /**
     * The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @Import(name="podRange")
    private @Nullable Output<String> podRange;

    /**
     * @return The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    public Optional<Output<String>> podRange() {
        return Optional.ofNullable(this.podRange);
    }

    private NodeNetworkConfigArgs() {}

    private NodeNetworkConfigArgs(NodeNetworkConfigArgs $) {
        this.createPodRange = $.createPodRange;
        this.podIpv4CidrBlock = $.podIpv4CidrBlock;
        this.podRange = $.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeNetworkConfigArgs $;

        public Builder() {
            $ = new NodeNetworkConfigArgs();
        }

        public Builder(NodeNetworkConfigArgs defaults) {
            $ = new NodeNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createPodRange Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
         * 
         * @return builder
         * 
         */
        public Builder createPodRange(@Nullable Output<Boolean> createPodRange) {
            $.createPodRange = createPodRange;
            return this;
        }

        /**
         * @param createPodRange Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
         * 
         * @return builder
         * 
         */
        public Builder createPodRange(Boolean createPodRange) {
            return createPodRange(Output.of(createPodRange));
        }

        /**
         * @param podIpv4CidrBlock The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
         * 
         * @return builder
         * 
         */
        public Builder podIpv4CidrBlock(@Nullable Output<String> podIpv4CidrBlock) {
            $.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }

        /**
         * @param podIpv4CidrBlock The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
         * 
         * @return builder
         * 
         */
        public Builder podIpv4CidrBlock(String podIpv4CidrBlock) {
            return podIpv4CidrBlock(Output.of(podIpv4CidrBlock));
        }

        /**
         * @param podRange The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
         * 
         * @return builder
         * 
         */
        public Builder podRange(@Nullable Output<String> podRange) {
            $.podRange = podRange;
            return this;
        }

        /**
         * @param podRange The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
         * 
         * @return builder
         * 
         */
        public Builder podRange(String podRange) {
            return podRange(Output.of(podRange));
        }

        public NodeNetworkConfigArgs build() {
            return $;
        }
    }

}
