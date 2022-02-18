// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for controlling how IPs are allocated in the GKE cluster running the Apache Airflow software.
 * 
 */
public final class IPAllocationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAllocationPolicyArgs Empty = new IPAllocationPolicyArgs();

    /**
     * Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @InputImport(name="clusterIpv4CidrBlock")
    private final @Nullable Input<String> clusterIpv4CidrBlock;

    public Input<String> getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock == null ? Input.empty() : this.clusterIpv4CidrBlock;
    }

    /**
     * Optional. The name of the GKE cluster's secondary range used to allocate IP addresses to pods. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    @InputImport(name="clusterSecondaryRangeName")
    private final @Nullable Input<String> clusterSecondaryRangeName;

    public Input<String> getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName == null ? Input.empty() : this.clusterSecondaryRangeName;
    }

    /**
     * Optional. The IP address range of the services IP addresses in this GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @InputImport(name="servicesIpv4CidrBlock")
    private final @Nullable Input<String> servicesIpv4CidrBlock;

    public Input<String> getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock == null ? Input.empty() : this.servicesIpv4CidrBlock;
    }

    /**
     * Optional. The name of the services' secondary range used to allocate IP addresses to the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    @InputImport(name="servicesSecondaryRangeName")
    private final @Nullable Input<String> servicesSecondaryRangeName;

    public Input<String> getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName == null ? Input.empty() : this.servicesSecondaryRangeName;
    }

    /**
     * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
     * 
     */
    @InputImport(name="useIpAliases")
    private final @Nullable Input<Boolean> useIpAliases;

    public Input<Boolean> getUseIpAliases() {
        return this.useIpAliases == null ? Input.empty() : this.useIpAliases;
    }

    public IPAllocationPolicyArgs(
        @Nullable Input<String> clusterIpv4CidrBlock,
        @Nullable Input<String> clusterSecondaryRangeName,
        @Nullable Input<String> servicesIpv4CidrBlock,
        @Nullable Input<String> servicesSecondaryRangeName,
        @Nullable Input<Boolean> useIpAliases) {
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
        this.useIpAliases = useIpAliases;
    }

    private IPAllocationPolicyArgs() {
        this.clusterIpv4CidrBlock = Input.empty();
        this.clusterSecondaryRangeName = Input.empty();
        this.servicesIpv4CidrBlock = Input.empty();
        this.servicesSecondaryRangeName = Input.empty();
        this.useIpAliases = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAllocationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterIpv4CidrBlock;
        private @Nullable Input<String> clusterSecondaryRangeName;
        private @Nullable Input<String> servicesIpv4CidrBlock;
        private @Nullable Input<String> servicesSecondaryRangeName;
        private @Nullable Input<Boolean> useIpAliases;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAllocationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
    	      this.useIpAliases = defaults.useIpAliases;
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

        public Builder setUseIpAliases(@Nullable Input<Boolean> useIpAliases) {
            this.useIpAliases = useIpAliases;
            return this;
        }

        public Builder setUseIpAliases(@Nullable Boolean useIpAliases) {
            this.useIpAliases = Input.ofNullable(useIpAliases);
            return this;
        }

        public IPAllocationPolicyArgs build() {
            return new IPAllocationPolicyArgs(clusterIpv4CidrBlock, clusterSecondaryRangeName, servicesIpv4CidrBlock, servicesSecondaryRangeName, useIpAliases);
        }
    }
}
