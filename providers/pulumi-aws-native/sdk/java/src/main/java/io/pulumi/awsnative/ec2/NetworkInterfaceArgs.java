// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.NetworkInterfaceInstanceIpv6AddressArgs;
import io.pulumi.awsnative.ec2.inputs.NetworkInterfacePrivateIpAddressSpecificationArgs;
import io.pulumi.awsnative.ec2.inputs.NetworkInterfaceTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * A description for the network interface.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A list of security group IDs associated with this network interface.
     * 
     */
    @InputImport(name="groupSet")
      private final @Nullable Input<List<String>> groupSet;

    public Input<List<String>> getGroupSet() {
        return this.groupSet == null ? Input.empty() : this.groupSet;
    }

    /**
     * Indicates the type of network interface.
     * 
     */
    @InputImport(name="interfaceType")
      private final @Nullable Input<String> interfaceType;

    public Input<String> getInterfaceType() {
        return this.interfaceType == null ? Input.empty() : this.interfaceType;
    }

    /**
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify specific IPv6 addresses, use the Ipv6Addresses property and don't specify this property.
     * 
     */
    @InputImport(name="ipv6AddressCount")
      private final @Nullable Input<Integer> ipv6AddressCount;

    public Input<Integer> getIpv6AddressCount() {
        return this.ipv6AddressCount == null ? Input.empty() : this.ipv6AddressCount;
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate with the network interface. If you're specifying a number of IPv6 addresses, use the Ipv6AddressCount property and don't specify this property.
     * 
     */
    @InputImport(name="ipv6Addresses")
      private final @Nullable Input<List<NetworkInterfaceInstanceIpv6AddressArgs>> ipv6Addresses;

    public Input<List<NetworkInterfaceInstanceIpv6AddressArgs>> getIpv6Addresses() {
        return this.ipv6Addresses == null ? Input.empty() : this.ipv6Addresses;
    }

    /**
     * Assigns a single private IP address to the network interface, which is used as the primary private IP address. If you want to specify multiple private IP address, use the PrivateIpAddresses property.
     * 
     */
    @InputImport(name="privateIpAddress")
      private final @Nullable Input<String> privateIpAddress;

    public Input<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Input.empty() : this.privateIpAddress;
    }

    /**
     * Assigns a list of private IP addresses to the network interface. You can specify a primary private IP address by setting the value of the Primary property to true in the PrivateIpAddressSpecification property. If you want EC2 to automatically assign private IP addresses, use the SecondaryPrivateIpAddressCount property and do not specify this property.
     * 
     */
    @InputImport(name="privateIpAddresses")
      private final @Nullable Input<List<NetworkInterfacePrivateIpAddressSpecificationArgs>> privateIpAddresses;

    public Input<List<NetworkInterfacePrivateIpAddressSpecificationArgs>> getPrivateIpAddresses() {
        return this.privateIpAddresses == null ? Input.empty() : this.privateIpAddresses;
    }

    /**
     * The number of secondary private IPv4 addresses to assign to a network interface. When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one private IP address using privateIpAddresses
     * 
     */
    @InputImport(name="secondaryPrivateIpAddressCount")
      private final @Nullable Input<Integer> secondaryPrivateIpAddressCount;

    public Input<Integer> getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount == null ? Input.empty() : this.secondaryPrivateIpAddressCount;
    }

    /**
     * Indicates whether traffic to or from the instance is validated.
     * 
     */
    @InputImport(name="sourceDestCheck")
      private final @Nullable Input<Boolean> sourceDestCheck;

    public Input<Boolean> getSourceDestCheck() {
        return this.sourceDestCheck == null ? Input.empty() : this.sourceDestCheck;
    }

    /**
     * The ID of the subnet to associate with the network interface.
     * 
     */
    @InputImport(name="subnetId", required=true)
      private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<NetworkInterfaceTagArgs>> tags;

    public Input<List<NetworkInterfaceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public NetworkInterfaceArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> groupSet,
        @Nullable Input<String> interfaceType,
        @Nullable Input<Integer> ipv6AddressCount,
        @Nullable Input<List<NetworkInterfaceInstanceIpv6AddressArgs>> ipv6Addresses,
        @Nullable Input<String> privateIpAddress,
        @Nullable Input<List<NetworkInterfacePrivateIpAddressSpecificationArgs>> privateIpAddresses,
        @Nullable Input<Integer> secondaryPrivateIpAddressCount,
        @Nullable Input<Boolean> sourceDestCheck,
        Input<String> subnetId,
        @Nullable Input<List<NetworkInterfaceTagArgs>> tags) {
        this.description = description;
        this.groupSet = groupSet;
        this.interfaceType = interfaceType;
        this.ipv6AddressCount = ipv6AddressCount;
        this.ipv6Addresses = ipv6Addresses;
        this.privateIpAddress = privateIpAddress;
        this.privateIpAddresses = privateIpAddresses;
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        this.sourceDestCheck = sourceDestCheck;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.tags = tags;
    }

    private NetworkInterfaceArgs() {
        this.description = Input.empty();
        this.groupSet = Input.empty();
        this.interfaceType = Input.empty();
        this.ipv6AddressCount = Input.empty();
        this.ipv6Addresses = Input.empty();
        this.privateIpAddress = Input.empty();
        this.privateIpAddresses = Input.empty();
        this.secondaryPrivateIpAddressCount = Input.empty();
        this.sourceDestCheck = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> groupSet;
        private @Nullable Input<String> interfaceType;
        private @Nullable Input<Integer> ipv6AddressCount;
        private @Nullable Input<List<NetworkInterfaceInstanceIpv6AddressArgs>> ipv6Addresses;
        private @Nullable Input<String> privateIpAddress;
        private @Nullable Input<List<NetworkInterfacePrivateIpAddressSpecificationArgs>> privateIpAddresses;
        private @Nullable Input<Integer> secondaryPrivateIpAddressCount;
        private @Nullable Input<Boolean> sourceDestCheck;
        private Input<String> subnetId;
        private @Nullable Input<List<NetworkInterfaceTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groupSet = defaults.groupSet;
    	      this.interfaceType = defaults.interfaceType;
    	      this.ipv6AddressCount = defaults.ipv6AddressCount;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.secondaryPrivateIpAddressCount = defaults.secondaryPrivateIpAddressCount;
    	      this.sourceDestCheck = defaults.sourceDestCheck;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder groupSet(@Nullable Input<List<String>> groupSet) {
            this.groupSet = groupSet;
            return this;
        }

        public Builder groupSet(@Nullable List<String> groupSet) {
            this.groupSet = Input.ofNullable(groupSet);
            return this;
        }

        public Builder interfaceType(@Nullable Input<String> interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }

        public Builder interfaceType(@Nullable String interfaceType) {
            this.interfaceType = Input.ofNullable(interfaceType);
            return this;
        }

        public Builder ipv6AddressCount(@Nullable Input<Integer> ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        public Builder ipv6AddressCount(@Nullable Integer ipv6AddressCount) {
            this.ipv6AddressCount = Input.ofNullable(ipv6AddressCount);
            return this;
        }

        public Builder ipv6Addresses(@Nullable Input<List<NetworkInterfaceInstanceIpv6AddressArgs>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder ipv6Addresses(@Nullable List<NetworkInterfaceInstanceIpv6AddressArgs> ipv6Addresses) {
            this.ipv6Addresses = Input.ofNullable(ipv6Addresses);
            return this;
        }

        public Builder privateIpAddress(@Nullable Input<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Input.ofNullable(privateIpAddress);
            return this;
        }

        public Builder privateIpAddresses(@Nullable Input<List<NetworkInterfacePrivateIpAddressSpecificationArgs>> privateIpAddresses) {
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }

        public Builder privateIpAddresses(@Nullable List<NetworkInterfacePrivateIpAddressSpecificationArgs> privateIpAddresses) {
            this.privateIpAddresses = Input.ofNullable(privateIpAddresses);
            return this;
        }

        public Builder secondaryPrivateIpAddressCount(@Nullable Input<Integer> secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        public Builder secondaryPrivateIpAddressCount(@Nullable Integer secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = Input.ofNullable(secondaryPrivateIpAddressCount);
            return this;
        }

        public Builder sourceDestCheck(@Nullable Input<Boolean> sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        public Builder sourceDestCheck(@Nullable Boolean sourceDestCheck) {
            this.sourceDestCheck = Input.ofNullable(sourceDestCheck);
            return this;
        }

        public Builder subnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }

        public Builder tags(@Nullable Input<List<NetworkInterfaceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<NetworkInterfaceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(description, groupSet, interfaceType, ipv6AddressCount, ipv6Addresses, privateIpAddress, privateIpAddresses, secondaryPrivateIpAddressCount, sourceDestCheck, subnetId, tags);
        }
    }
}
