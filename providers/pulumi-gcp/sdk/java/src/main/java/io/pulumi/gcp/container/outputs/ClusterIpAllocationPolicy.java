// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterIpAllocationPolicy {
    /**
     * The IP address range for the cluster pod IPs.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
     */
    private final @Nullable String clusterIpv4CidrBlock;
    /**
     * The name of the existing secondary
     * range in the cluster's subnetwork to use for pod IP addresses. Alternatively,
     * `cluster_ipv4_cidr_block` can be used to automatically create a GKE-managed one.
     * 
     */
    private final @Nullable String clusterSecondaryRangeName;
    /**
     * The IP address range of the services IPs in this cluster.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
     */
    private final @Nullable String servicesIpv4CidrBlock;
    /**
     * The name of the existing
     * secondary range in the cluster's subnetwork to use for service `ClusterIP`s.
     * Alternatively, `services_ipv4_cidr_block` can be used to automatically create a
     * GKE-managed one.
     * 
     */
    private final @Nullable String servicesSecondaryRangeName;

    @OutputCustomType.Constructor
    private ClusterIpAllocationPolicy(
        @OutputCustomType.Parameter("clusterIpv4CidrBlock") @Nullable String clusterIpv4CidrBlock,
        @OutputCustomType.Parameter("clusterSecondaryRangeName") @Nullable String clusterSecondaryRangeName,
        @OutputCustomType.Parameter("servicesIpv4CidrBlock") @Nullable String servicesIpv4CidrBlock,
        @OutputCustomType.Parameter("servicesSecondaryRangeName") @Nullable String servicesSecondaryRangeName) {
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
    }

    /**
     * The IP address range for the cluster pod IPs.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
    */
    public Optional<String> getClusterIpv4CidrBlock() {
        return Optional.ofNullable(this.clusterIpv4CidrBlock);
    }
    /**
     * The name of the existing secondary
     * range in the cluster's subnetwork to use for pod IP addresses. Alternatively,
     * `cluster_ipv4_cidr_block` can be used to automatically create a GKE-managed one.
     * 
    */
    public Optional<String> getClusterSecondaryRangeName() {
        return Optional.ofNullable(this.clusterSecondaryRangeName);
    }
    /**
     * The IP address range of the services IPs in this cluster.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
    */
    public Optional<String> getServicesIpv4CidrBlock() {
        return Optional.ofNullable(this.servicesIpv4CidrBlock);
    }
    /**
     * The name of the existing
     * secondary range in the cluster's subnetwork to use for service `ClusterIP`s.
     * Alternatively, `services_ipv4_cidr_block` can be used to automatically create a
     * GKE-managed one.
     * 
    */
    public Optional<String> getServicesSecondaryRangeName() {
        return Optional.ofNullable(this.servicesSecondaryRangeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIpAllocationPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterIpv4CidrBlock;
        private @Nullable String clusterSecondaryRangeName;
        private @Nullable String servicesIpv4CidrBlock;
        private @Nullable String servicesSecondaryRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIpAllocationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
        }

        public Builder clusterIpv4CidrBlock(@Nullable String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        public Builder clusterSecondaryRangeName(@Nullable String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        public Builder servicesIpv4CidrBlock(@Nullable String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        public Builder servicesSecondaryRangeName(@Nullable String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }
        public ClusterIpAllocationPolicy build() {
            return new ClusterIpAllocationPolicy(clusterIpv4CidrBlock, clusterSecondaryRangeName, servicesIpv4CidrBlock, servicesSecondaryRangeName);
        }
    }
}
