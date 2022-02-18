// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for controlling how IPs are allocated in the cluster.
 * 
 */
public final class IPAllocationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAllocationPolicyArgs Empty = new IPAllocationPolicyArgs();

    /**
     * If true, allow allocation of cluster CIDR ranges that overlap with certain kinds of network routes. By default we do not allow cluster CIDR ranges to intersect with any user declared routes. With allow_route_overlap == true, we allow overlapping with CIDR ranges that are larger than the cluster CIDR range. If this field is set to true, then cluster and services CIDRs must be fully-specified (e.g. `10.96.0.0/14`, but not `/14`), which means: 1) When `use_ip_aliases` is true, `cluster_ipv4_cidr_block` and `services_ipv4_cidr_block` must be fully-specified. 2) When `use_ip_aliases` is false, `cluster.cluster_ipv4_cidr` muse be fully-specified.
     * 
     */
    @InputImport(name="allowRouteOverlap")
    private final @Nullable Input<Boolean> allowRouteOverlap;

    public Input<Boolean> getAllowRouteOverlap() {
        return this.allowRouteOverlap == null ? Input.empty() : this.allowRouteOverlap;
    }

    /**
     * The IP address range for the cluster pod IPs. If this field is set, then `cluster.cluster_ipv4_cidr` must be left blank. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @InputImport(name="clusterIpv4CidrBlock")
    private final @Nullable Input<String> clusterIpv4CidrBlock;

    public Input<String> getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock == null ? Input.empty() : this.clusterIpv4CidrBlock;
    }

    /**
     * The name of the secondary range to be used for the cluster CIDR block. The secondary range will be used for pod IP addresses. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases and create_subnetwork is false.
     * 
     */
    @InputImport(name="clusterSecondaryRangeName")
    private final @Nullable Input<String> clusterSecondaryRangeName;

    public Input<String> getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName == null ? Input.empty() : this.clusterSecondaryRangeName;
    }

    /**
     * Whether a new subnetwork will be created automatically for the cluster. This field is only applicable when `use_ip_aliases` is true.
     * 
     */
    @InputImport(name="createSubnetwork")
    private final @Nullable Input<Boolean> createSubnetwork;

    public Input<Boolean> getCreateSubnetwork() {
        return this.createSubnetwork == null ? Input.empty() : this.createSubnetwork;
    }

    /**
     * The IP address range of the instance IPs in this cluster. This is applicable only if `create_subnetwork` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @InputImport(name="nodeIpv4CidrBlock")
    private final @Nullable Input<String> nodeIpv4CidrBlock;

    public Input<String> getNodeIpv4CidrBlock() {
        return this.nodeIpv4CidrBlock == null ? Input.empty() : this.nodeIpv4CidrBlock;
    }

    /**
     * The IP address range of the services IPs in this cluster. If blank, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @InputImport(name="servicesIpv4CidrBlock")
    private final @Nullable Input<String> servicesIpv4CidrBlock;

    public Input<String> getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock == null ? Input.empty() : this.servicesIpv4CidrBlock;
    }

    /**
     * The name of the secondary range to be used as for the services CIDR block. The secondary range will be used for service ClusterIPs. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases and create_subnetwork is false.
     * 
     */
    @InputImport(name="servicesSecondaryRangeName")
    private final @Nullable Input<String> servicesSecondaryRangeName;

    public Input<String> getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName == null ? Input.empty() : this.servicesSecondaryRangeName;
    }

    /**
     * A custom subnetwork name to be used if `create_subnetwork` is true. If this field is empty, then an automatic name will be chosen for the new subnetwork.
     * 
     */
    @InputImport(name="subnetworkName")
    private final @Nullable Input<String> subnetworkName;

    public Input<String> getSubnetworkName() {
        return this.subnetworkName == null ? Input.empty() : this.subnetworkName;
    }

    /**
     * Whether alias IPs will be used for pod IPs in the cluster. This is used in conjunction with use_routes. It cannot be true if use_routes is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    @InputImport(name="useIpAliases")
    private final @Nullable Input<Boolean> useIpAliases;

    public Input<Boolean> getUseIpAliases() {
        return this.useIpAliases == null ? Input.empty() : this.useIpAliases;
    }

    /**
     * Whether routes will be used for pod IPs in the cluster. This is used in conjunction with use_ip_aliases. It cannot be true if use_ip_aliases is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    @InputImport(name="useRoutes")
    private final @Nullable Input<Boolean> useRoutes;

    public Input<Boolean> getUseRoutes() {
        return this.useRoutes == null ? Input.empty() : this.useRoutes;
    }

    public IPAllocationPolicyArgs(
        @Nullable Input<Boolean> allowRouteOverlap,
        @Nullable Input<String> clusterIpv4CidrBlock,
        @Nullable Input<String> clusterSecondaryRangeName,
        @Nullable Input<Boolean> createSubnetwork,
        @Nullable Input<String> nodeIpv4CidrBlock,
        @Nullable Input<String> servicesIpv4CidrBlock,
        @Nullable Input<String> servicesSecondaryRangeName,
        @Nullable Input<String> subnetworkName,
        @Nullable Input<Boolean> useIpAliases,
        @Nullable Input<Boolean> useRoutes) {
        this.allowRouteOverlap = allowRouteOverlap;
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.createSubnetwork = createSubnetwork;
        this.nodeIpv4CidrBlock = nodeIpv4CidrBlock;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
        this.subnetworkName = subnetworkName;
        this.useIpAliases = useIpAliases;
        this.useRoutes = useRoutes;
    }

    private IPAllocationPolicyArgs() {
        this.allowRouteOverlap = Input.empty();
        this.clusterIpv4CidrBlock = Input.empty();
        this.clusterSecondaryRangeName = Input.empty();
        this.createSubnetwork = Input.empty();
        this.nodeIpv4CidrBlock = Input.empty();
        this.servicesIpv4CidrBlock = Input.empty();
        this.servicesSecondaryRangeName = Input.empty();
        this.subnetworkName = Input.empty();
        this.useIpAliases = Input.empty();
        this.useRoutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAllocationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowRouteOverlap;
        private @Nullable Input<String> clusterIpv4CidrBlock;
        private @Nullable Input<String> clusterSecondaryRangeName;
        private @Nullable Input<Boolean> createSubnetwork;
        private @Nullable Input<String> nodeIpv4CidrBlock;
        private @Nullable Input<String> servicesIpv4CidrBlock;
        private @Nullable Input<String> servicesSecondaryRangeName;
        private @Nullable Input<String> subnetworkName;
        private @Nullable Input<Boolean> useIpAliases;
        private @Nullable Input<Boolean> useRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAllocationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowRouteOverlap = defaults.allowRouteOverlap;
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.createSubnetwork = defaults.createSubnetwork;
    	      this.nodeIpv4CidrBlock = defaults.nodeIpv4CidrBlock;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
    	      this.subnetworkName = defaults.subnetworkName;
    	      this.useIpAliases = defaults.useIpAliases;
    	      this.useRoutes = defaults.useRoutes;
        }

        public Builder setAllowRouteOverlap(@Nullable Input<Boolean> allowRouteOverlap) {
            this.allowRouteOverlap = allowRouteOverlap;
            return this;
        }

        public Builder setAllowRouteOverlap(@Nullable Boolean allowRouteOverlap) {
            this.allowRouteOverlap = Input.ofNullable(allowRouteOverlap);
            return this;
        }

        public Builder setClusterIpv4CidrBlock(@Nullable Input<String> clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        public Builder setClusterIpv4CidrBlock(@Nullable String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Input.ofNullable(clusterIpv4CidrBlock);
            return this;
        }

        public Builder setClusterSecondaryRangeName(@Nullable Input<String> clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        public Builder setClusterSecondaryRangeName(@Nullable String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Input.ofNullable(clusterSecondaryRangeName);
            return this;
        }

        public Builder setCreateSubnetwork(@Nullable Input<Boolean> createSubnetwork) {
            this.createSubnetwork = createSubnetwork;
            return this;
        }

        public Builder setCreateSubnetwork(@Nullable Boolean createSubnetwork) {
            this.createSubnetwork = Input.ofNullable(createSubnetwork);
            return this;
        }

        public Builder setNodeIpv4CidrBlock(@Nullable Input<String> nodeIpv4CidrBlock) {
            this.nodeIpv4CidrBlock = nodeIpv4CidrBlock;
            return this;
        }

        public Builder setNodeIpv4CidrBlock(@Nullable String nodeIpv4CidrBlock) {
            this.nodeIpv4CidrBlock = Input.ofNullable(nodeIpv4CidrBlock);
            return this;
        }

        public Builder setServicesIpv4CidrBlock(@Nullable Input<String> servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        public Builder setServicesIpv4CidrBlock(@Nullable String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Input.ofNullable(servicesIpv4CidrBlock);
            return this;
        }

        public Builder setServicesSecondaryRangeName(@Nullable Input<String> servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }

        public Builder setServicesSecondaryRangeName(@Nullable String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Input.ofNullable(servicesSecondaryRangeName);
            return this;
        }

        public Builder setSubnetworkName(@Nullable Input<String> subnetworkName) {
            this.subnetworkName = subnetworkName;
            return this;
        }

        public Builder setSubnetworkName(@Nullable String subnetworkName) {
            this.subnetworkName = Input.ofNullable(subnetworkName);
            return this;
        }

        public Builder setUseIpAliases(@Nullable Input<Boolean> useIpAliases) {
            this.useIpAliases = useIpAliases;
            return this;
        }

        public Builder setUseIpAliases(@Nullable Boolean useIpAliases) {
            this.useIpAliases = Input.ofNullable(useIpAliases);
            return this;
        }

        public Builder setUseRoutes(@Nullable Input<Boolean> useRoutes) {
            this.useRoutes = useRoutes;
            return this;
        }

        public Builder setUseRoutes(@Nullable Boolean useRoutes) {
            this.useRoutes = Input.ofNullable(useRoutes);
            return this;
        }

        public IPAllocationPolicyArgs build() {
            return new IPAllocationPolicyArgs(allowRouteOverlap, clusterIpv4CidrBlock, clusterSecondaryRangeName, createSubnetwork, nodeIpv4CidrBlock, servicesIpv4CidrBlock, servicesSecondaryRangeName, subnetworkName, useIpAliases, useRoutes);
        }
    }
}
