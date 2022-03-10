// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressAddressType;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressIpVersion;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressNetworkTier;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressPurpose;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalAddressArgs Empty = new GlobalAddressArgs();

    /**
     * The static IP address represented by this resource.
     * 
     */
    @InputImport(name="address")
      private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
     */
    @InputImport(name="addressType")
      private final @Nullable Input<GlobalAddressAddressType> addressType;

    public Input<GlobalAddressAddressType> getAddressType() {
        return this.addressType == null ? Input.empty() : this.addressType;
    }

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
     * 
     */
    @InputImport(name="ipVersion")
      private final @Nullable Input<GlobalAddressIpVersion> ipVersion;

    public Input<GlobalAddressIpVersion> getIpVersion() {
        return this.ipVersion == null ? Input.empty() : this.ipVersion;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    @InputImport(name="networkTier")
      private final @Nullable Input<GlobalAddressNetworkTier> networkTier;

    public Input<GlobalAddressNetworkTier> getNetworkTier() {
        return this.networkTier == null ? Input.empty() : this.networkTier;
    }

    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    @InputImport(name="prefixLength")
      private final @Nullable Input<Integer> prefixLength;

    public Input<Integer> getPrefixLength() {
        return this.prefixLength == null ? Input.empty() : this.prefixLength;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
     */
    @InputImport(name="purpose")
      private final @Nullable Input<GlobalAddressPurpose> purpose;

    public Input<GlobalAddressPurpose> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    public GlobalAddressArgs(
        @Nullable Input<String> address,
        @Nullable Input<GlobalAddressAddressType> addressType,
        @Nullable Input<String> description,
        @Nullable Input<GlobalAddressIpVersion> ipVersion,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<GlobalAddressNetworkTier> networkTier,
        @Nullable Input<Integer> prefixLength,
        @Nullable Input<String> project,
        @Nullable Input<GlobalAddressPurpose> purpose,
        @Nullable Input<String> requestId,
        @Nullable Input<String> subnetwork) {
        this.address = address;
        this.addressType = addressType;
        this.description = description;
        this.ipVersion = ipVersion;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.prefixLength = prefixLength;
        this.project = project;
        this.purpose = purpose;
        this.requestId = requestId;
        this.subnetwork = subnetwork;
    }

    private GlobalAddressArgs() {
        this.address = Input.empty();
        this.addressType = Input.empty();
        this.description = Input.empty();
        this.ipVersion = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.networkTier = Input.empty();
        this.prefixLength = Input.empty();
        this.project = Input.empty();
        this.purpose = Input.empty();
        this.requestId = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<GlobalAddressAddressType> addressType;
        private @Nullable Input<String> description;
        private @Nullable Input<GlobalAddressIpVersion> ipVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<GlobalAddressNetworkTier> networkTier;
        private @Nullable Input<Integer> prefixLength;
        private @Nullable Input<String> project;
        private @Nullable Input<GlobalAddressPurpose> purpose;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressType = defaults.addressType;
    	      this.description = defaults.description;
    	      this.ipVersion = defaults.ipVersion;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.prefixLength = defaults.prefixLength;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.requestId = defaults.requestId;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder address(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder address(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder addressType(@Nullable Input<GlobalAddressAddressType> addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder addressType(@Nullable GlobalAddressAddressType addressType) {
            this.addressType = Input.ofNullable(addressType);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder ipVersion(@Nullable Input<GlobalAddressIpVersion> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        public Builder ipVersion(@Nullable GlobalAddressIpVersion ipVersion) {
            this.ipVersion = Input.ofNullable(ipVersion);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder network(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder networkTier(@Nullable Input<GlobalAddressNetworkTier> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(@Nullable GlobalAddressNetworkTier networkTier) {
            this.networkTier = Input.ofNullable(networkTier);
            return this;
        }

        public Builder prefixLength(@Nullable Input<Integer> prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder prefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = Input.ofNullable(prefixLength);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder purpose(@Nullable Input<GlobalAddressPurpose> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder purpose(@Nullable GlobalAddressPurpose purpose) {
            this.purpose = Input.ofNullable(purpose);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder subnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }
        public GlobalAddressArgs build() {
            return new GlobalAddressArgs(address, addressType, description, ipVersion, name, network, networkTier, prefixLength, project, purpose, requestId, subnetwork);
        }
    }
}
