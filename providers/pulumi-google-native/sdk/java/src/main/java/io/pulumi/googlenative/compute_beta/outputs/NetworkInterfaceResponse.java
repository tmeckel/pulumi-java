// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.AccessConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.AliasIpRangeResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NetworkInterfaceResponse {
    /**
     * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    private final List<AccessConfigResponse> accessConfigs;
    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    private final List<AliasIpRangeResponse> aliasIpRanges;
    /**
     * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
     * 
     */
    private final String fingerprint;
    /**
     * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    private final List<AccessConfigResponse> ipv6AccessConfigs;
    /**
     * One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
     * 
     */
    private final String ipv6AccessType;
    /**
     * An IPv6 internal network address for this network interface.
     * 
     */
    private final String ipv6Address;
    /**
     * Type of the resource. Always compute#networkInterface for network interfaces.
     * 
     */
    private final String kind;
    /**
     * The name of the network interface, which is generated by the server. For network devices, these are eth0, eth1, etc.
     * 
     */
    private final String name;
    /**
     * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn't have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    private final String network;
    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    private final String networkIP;
    /**
     * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    private final String nicType;
    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It'll be empty if not specified by the users.
     * 
     */
    private final Integer queueCount;
    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    private final String stackType;
    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    private final String subnetwork;

    @OutputCustomType.Constructor
    private NetworkInterfaceResponse(
        @OutputCustomType.Parameter("accessConfigs") List<AccessConfigResponse> accessConfigs,
        @OutputCustomType.Parameter("aliasIpRanges") List<AliasIpRangeResponse> aliasIpRanges,
        @OutputCustomType.Parameter("fingerprint") String fingerprint,
        @OutputCustomType.Parameter("ipv6AccessConfigs") List<AccessConfigResponse> ipv6AccessConfigs,
        @OutputCustomType.Parameter("ipv6AccessType") String ipv6AccessType,
        @OutputCustomType.Parameter("ipv6Address") String ipv6Address,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("networkIP") String networkIP,
        @OutputCustomType.Parameter("nicType") String nicType,
        @OutputCustomType.Parameter("queueCount") Integer queueCount,
        @OutputCustomType.Parameter("stackType") String stackType,
        @OutputCustomType.Parameter("subnetwork") String subnetwork) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.fingerprint = fingerprint;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.ipv6Address = ipv6Address;
        this.kind = kind;
        this.name = name;
        this.network = network;
        this.networkIP = networkIP;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
    }

    /**
     * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
    */
    public List<AccessConfigResponse> getAccessConfigs() {
        return this.accessConfigs;
    }
    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
    */
    public List<AliasIpRangeResponse> getAliasIpRanges() {
        return this.aliasIpRanges;
    }
    /**
     * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
    */
    public List<AccessConfigResponse> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs;
    }
    /**
     * One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
     * 
    */
    public String getIpv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * An IPv6 internal network address for this network interface.
     * 
    */
    public String getIpv6Address() {
        return this.ipv6Address;
    }
    /**
     * Type of the resource. Always compute#networkInterface for network interfaces.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the network interface, which is generated by the server. For network devices, these are eth0, eth1, etc.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn't have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
    */
    public String getNetworkIP() {
        return this.networkIP;
    }
    /**
     * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
    */
    public String getNicType() {
        return this.nicType;
    }
    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It'll be empty if not specified by the users.
     * 
    */
    public Integer getQueueCount() {
        return this.queueCount;
    }
    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
    */
    public String getStackType() {
        return this.stackType;
    }
    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
    */
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AccessConfigResponse> accessConfigs;
        private List<AliasIpRangeResponse> aliasIpRanges;
        private String fingerprint;
        private List<AccessConfigResponse> ipv6AccessConfigs;
        private String ipv6AccessType;
        private String ipv6Address;
        private String kind;
        private String name;
        private String network;
        private String networkIP;
        private String nicType;
        private Integer queueCount;
        private String stackType;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIP = defaults.networkIP;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder accessConfigs(List<AccessConfigResponse> accessConfigs) {
            this.accessConfigs = Objects.requireNonNull(accessConfigs);
            return this;
        }

        public Builder aliasIpRanges(List<AliasIpRangeResponse> aliasIpRanges) {
            this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges);
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder ipv6AccessConfigs(List<AccessConfigResponse> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs);
            return this;
        }

        public Builder ipv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }

        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder networkIP(String networkIP) {
            this.networkIP = Objects.requireNonNull(networkIP);
            return this;
        }

        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }

        public Builder queueCount(Integer queueCount) {
            this.queueCount = Objects.requireNonNull(queueCount);
            return this;
        }

        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(accessConfigs, aliasIpRanges, fingerprint, ipv6AccessConfigs, ipv6AccessType, ipv6Address, kind, name, network, networkIP, nicType, queueCount, stackType, subnetwork);
        }
    }
}
