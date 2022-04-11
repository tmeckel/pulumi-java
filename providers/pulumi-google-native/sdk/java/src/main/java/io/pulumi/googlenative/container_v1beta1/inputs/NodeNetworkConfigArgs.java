// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for node pool-level network config.
 * 
 */
public final class NodeNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeNetworkConfigArgs Empty = new NodeNetworkConfigArgs();

    /**
     * Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @Import(name="createPodRange")
      private final @Nullable Output<Boolean> createPodRange;

    public Output<Boolean> getCreatePodRange() {
        return this.createPodRange == null ? Codegen.empty() : this.createPodRange;
    }

    /**
     * The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @Import(name="podIpv4CidrBlock")
      private final @Nullable Output<String> podIpv4CidrBlock;

    public Output<String> getPodIpv4CidrBlock() {
        return this.podIpv4CidrBlock == null ? Codegen.empty() : this.podIpv4CidrBlock;
    }

    /**
     * The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @Import(name="podRange")
      private final @Nullable Output<String> podRange;

    public Output<String> getPodRange() {
        return this.podRange == null ? Codegen.empty() : this.podRange;
    }

    public NodeNetworkConfigArgs(
        @Nullable Output<Boolean> createPodRange,
        @Nullable Output<String> podIpv4CidrBlock,
        @Nullable Output<String> podRange) {
        this.createPodRange = createPodRange;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = podRange;
    }

    private NodeNetworkConfigArgs() {
        this.createPodRange = Codegen.empty();
        this.podIpv4CidrBlock = Codegen.empty();
        this.podRange = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> createPodRange;
        private @Nullable Output<String> podIpv4CidrBlock;
        private @Nullable Output<String> podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder createPodRange(@Nullable Output<Boolean> createPodRange) {
            this.createPodRange = createPodRange;
            return this;
        }
        public Builder createPodRange(@Nullable Boolean createPodRange) {
            this.createPodRange = Codegen.ofNullable(createPodRange);
            return this;
        }
        public Builder podIpv4CidrBlock(@Nullable Output<String> podIpv4CidrBlock) {
            this.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }
        public Builder podIpv4CidrBlock(@Nullable String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = Codegen.ofNullable(podIpv4CidrBlock);
            return this;
        }
        public Builder podRange(@Nullable Output<String> podRange) {
            this.podRange = podRange;
            return this;
        }
        public Builder podRange(@Nullable String podRange) {
            this.podRange = Codegen.ofNullable(podRange);
            return this;
        }        public NodeNetworkConfigArgs build() {
            return new NodeNetworkConfigArgs(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}
