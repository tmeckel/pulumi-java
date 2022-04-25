// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterIpAllocationPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterIpAllocationPolicyGetArgs Empty = new ClusterIpAllocationPolicyGetArgs();

    /**
     * The IP address range for the cluster pod IPs.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
     */
    @Import(name="clusterIpv4CidrBlock")
    private @Nullable Output<String> clusterIpv4CidrBlock;

    /**
     * @return The IP address range for the cluster pod IPs.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
     */
    public Optional<Output<String>> clusterIpv4CidrBlock() {
        return Optional.ofNullable(this.clusterIpv4CidrBlock);
    }

    /**
     * The name of the existing secondary
     * range in the cluster&#39;s subnetwork to use for pod IP addresses. Alternatively,
     * `cluster_ipv4_cidr_block` can be used to automatically create a GKE-managed one.
     * 
     */
    @Import(name="clusterSecondaryRangeName")
    private @Nullable Output<String> clusterSecondaryRangeName;

    /**
     * @return The name of the existing secondary
     * range in the cluster&#39;s subnetwork to use for pod IP addresses. Alternatively,
     * `cluster_ipv4_cidr_block` can be used to automatically create a GKE-managed one.
     * 
     */
    public Optional<Output<String>> clusterSecondaryRangeName() {
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
    @Import(name="servicesIpv4CidrBlock")
    private @Nullable Output<String> servicesIpv4CidrBlock;

    /**
     * @return The IP address range of the services IPs in this cluster.
     * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
     * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
     * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
     * pick a specific range to use.
     * 
     */
    public Optional<Output<String>> servicesIpv4CidrBlock() {
        return Optional.ofNullable(this.servicesIpv4CidrBlock);
    }

    /**
     * The name of the existing
     * secondary range in the cluster&#39;s subnetwork to use for service `ClusterIP`s.
     * Alternatively, `services_ipv4_cidr_block` can be used to automatically create a
     * GKE-managed one.
     * 
     */
    @Import(name="servicesSecondaryRangeName")
    private @Nullable Output<String> servicesSecondaryRangeName;

    /**
     * @return The name of the existing
     * secondary range in the cluster&#39;s subnetwork to use for service `ClusterIP`s.
     * Alternatively, `services_ipv4_cidr_block` can be used to automatically create a
     * GKE-managed one.
     * 
     */
    public Optional<Output<String>> servicesSecondaryRangeName() {
        return Optional.ofNullable(this.servicesSecondaryRangeName);
    }

    private ClusterIpAllocationPolicyGetArgs() {}

    private ClusterIpAllocationPolicyGetArgs(ClusterIpAllocationPolicyGetArgs $) {
        this.clusterIpv4CidrBlock = $.clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = $.clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = $.servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = $.servicesSecondaryRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterIpAllocationPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterIpAllocationPolicyGetArgs $;

        public Builder() {
            $ = new ClusterIpAllocationPolicyGetArgs();
        }

        public Builder(ClusterIpAllocationPolicyGetArgs defaults) {
            $ = new ClusterIpAllocationPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterIpv4CidrBlock The IP address range for the cluster pod IPs.
         * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
         * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
         * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
         * pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder clusterIpv4CidrBlock(@Nullable Output<String> clusterIpv4CidrBlock) {
            $.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        /**
         * @param clusterIpv4CidrBlock The IP address range for the cluster pod IPs.
         * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
         * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
         * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
         * pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            return clusterIpv4CidrBlock(Output.of(clusterIpv4CidrBlock));
        }

        /**
         * @param clusterSecondaryRangeName The name of the existing secondary
         * range in the cluster&#39;s subnetwork to use for pod IP addresses. Alternatively,
         * `cluster_ipv4_cidr_block` can be used to automatically create a GKE-managed one.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecondaryRangeName(@Nullable Output<String> clusterSecondaryRangeName) {
            $.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        /**
         * @param clusterSecondaryRangeName The name of the existing secondary
         * range in the cluster&#39;s subnetwork to use for pod IP addresses. Alternatively,
         * `cluster_ipv4_cidr_block` can be used to automatically create a GKE-managed one.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecondaryRangeName(String clusterSecondaryRangeName) {
            return clusterSecondaryRangeName(Output.of(clusterSecondaryRangeName));
        }

        /**
         * @param servicesIpv4CidrBlock The IP address range of the services IPs in this cluster.
         * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
         * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
         * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
         * pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder servicesIpv4CidrBlock(@Nullable Output<String> servicesIpv4CidrBlock) {
            $.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        /**
         * @param servicesIpv4CidrBlock The IP address range of the services IPs in this cluster.
         * Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14)
         * to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14)
         * from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to
         * pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder servicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            return servicesIpv4CidrBlock(Output.of(servicesIpv4CidrBlock));
        }

        /**
         * @param servicesSecondaryRangeName The name of the existing
         * secondary range in the cluster&#39;s subnetwork to use for service `ClusterIP`s.
         * Alternatively, `services_ipv4_cidr_block` can be used to automatically create a
         * GKE-managed one.
         * 
         * @return builder
         * 
         */
        public Builder servicesSecondaryRangeName(@Nullable Output<String> servicesSecondaryRangeName) {
            $.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }

        /**
         * @param servicesSecondaryRangeName The name of the existing
         * secondary range in the cluster&#39;s subnetwork to use for service `ClusterIP`s.
         * Alternatively, `services_ipv4_cidr_block` can be used to automatically create a
         * GKE-managed one.
         * 
         * @return builder
         * 
         */
        public Builder servicesSecondaryRangeName(String servicesSecondaryRangeName) {
            return servicesSecondaryRangeName(Output.of(servicesSecondaryRangeName));
        }

        public ClusterIpAllocationPolicyGetArgs build() {
            return $;
        }
    }

}
