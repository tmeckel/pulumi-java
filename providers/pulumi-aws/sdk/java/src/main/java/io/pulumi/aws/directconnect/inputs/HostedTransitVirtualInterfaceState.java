// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedTransitVirtualInterfaceState extends io.pulumi.resources.ResourceArgs {

    public static final HostedTransitVirtualInterfaceState Empty = new HostedTransitVirtualInterfaceState();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @Import(name="addressFamily")
      private final @Nullable Output<String> addressFamily;

    public Output<String> getAddressFamily() {
        return this.addressFamily == null ? Codegen.empty() : this.addressFamily;
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="amazonAddress")
      private final @Nullable Output<String> amazonAddress;

    public Output<String> getAmazonAddress() {
        return this.amazonAddress == null ? Codegen.empty() : this.amazonAddress;
    }

    @Import(name="amazonSideAsn")
      private final @Nullable Output<String> amazonSideAsn;

    public Output<String> getAmazonSideAsn() {
        return this.amazonSideAsn == null ? Codegen.empty() : this.amazonSideAsn;
    }

    /**
     * The ARN of the virtual interface.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @Import(name="awsDevice")
      private final @Nullable Output<String> awsDevice;

    public Output<String> getAwsDevice() {
        return this.awsDevice == null ? Codegen.empty() : this.awsDevice;
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @Import(name="bgpAsn")
      private final @Nullable Output<Integer> bgpAsn;

    public Output<Integer> getBgpAsn() {
        return this.bgpAsn == null ? Codegen.empty() : this.bgpAsn;
    }

    /**
     * The authentication key for BGP configuration.
     * 
     */
    @Import(name="bgpAuthKey")
      private final @Nullable Output<String> bgpAuthKey;

    public Output<String> getBgpAuthKey() {
        return this.bgpAuthKey == null ? Codegen.empty() : this.bgpAuthKey;
    }

    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @Import(name="connectionId")
      private final @Nullable Output<String> connectionId;

    public Output<String> getConnectionId() {
        return this.connectionId == null ? Codegen.empty() : this.connectionId;
    }

    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="customerAddress")
      private final @Nullable Output<String> customerAddress;

    public Output<String> getCustomerAddress() {
        return this.customerAddress == null ? Codegen.empty() : this.customerAddress;
    }

    /**
     * Indicates whether jumbo frames (8500 MTU) are supported.
     * 
     */
    @Import(name="jumboFrameCapable")
      private final @Nullable Output<Boolean> jumboFrameCapable;

    public Output<Boolean> getJumboFrameCapable() {
        return this.jumboFrameCapable == null ? Codegen.empty() : this.jumboFrameCapable;
    }

    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
     * 
     */
    @Import(name="mtu")
      private final @Nullable Output<Integer> mtu;

    public Output<Integer> getMtu() {
        return this.mtu == null ? Codegen.empty() : this.mtu;
    }

    /**
     * The name for the virtual interface.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The AWS account that will own the new virtual interface.
     * 
     */
    @Import(name="ownerAccountId")
      private final @Nullable Output<String> ownerAccountId;

    public Output<String> getOwnerAccountId() {
        return this.ownerAccountId == null ? Codegen.empty() : this.ownerAccountId;
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlan")
      private final @Nullable Output<Integer> vlan;

    public Output<Integer> getVlan() {
        return this.vlan == null ? Codegen.empty() : this.vlan;
    }

    public HostedTransitVirtualInterfaceState(
        @Nullable Output<String> addressFamily,
        @Nullable Output<String> amazonAddress,
        @Nullable Output<String> amazonSideAsn,
        @Nullable Output<String> arn,
        @Nullable Output<String> awsDevice,
        @Nullable Output<Integer> bgpAsn,
        @Nullable Output<String> bgpAuthKey,
        @Nullable Output<String> connectionId,
        @Nullable Output<String> customerAddress,
        @Nullable Output<Boolean> jumboFrameCapable,
        @Nullable Output<Integer> mtu,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerAccountId,
        @Nullable Output<Integer> vlan) {
        this.addressFamily = addressFamily;
        this.amazonAddress = amazonAddress;
        this.amazonSideAsn = amazonSideAsn;
        this.arn = arn;
        this.awsDevice = awsDevice;
        this.bgpAsn = bgpAsn;
        this.bgpAuthKey = bgpAuthKey;
        this.connectionId = connectionId;
        this.customerAddress = customerAddress;
        this.jumboFrameCapable = jumboFrameCapable;
        this.mtu = mtu;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
        this.vlan = vlan;
    }

    private HostedTransitVirtualInterfaceState() {
        this.addressFamily = Codegen.empty();
        this.amazonAddress = Codegen.empty();
        this.amazonSideAsn = Codegen.empty();
        this.arn = Codegen.empty();
        this.awsDevice = Codegen.empty();
        this.bgpAsn = Codegen.empty();
        this.bgpAuthKey = Codegen.empty();
        this.connectionId = Codegen.empty();
        this.customerAddress = Codegen.empty();
        this.jumboFrameCapable = Codegen.empty();
        this.mtu = Codegen.empty();
        this.name = Codegen.empty();
        this.ownerAccountId = Codegen.empty();
        this.vlan = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedTransitVirtualInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addressFamily;
        private @Nullable Output<String> amazonAddress;
        private @Nullable Output<String> amazonSideAsn;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> awsDevice;
        private @Nullable Output<Integer> bgpAsn;
        private @Nullable Output<String> bgpAuthKey;
        private @Nullable Output<String> connectionId;
        private @Nullable Output<String> customerAddress;
        private @Nullable Output<Boolean> jumboFrameCapable;
        private @Nullable Output<Integer> mtu;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerAccountId;
        private @Nullable Output<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedTransitVirtualInterfaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.amazonAddress = defaults.amazonAddress;
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.arn = defaults.arn;
    	      this.awsDevice = defaults.awsDevice;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.bgpAuthKey = defaults.bgpAuthKey;
    	      this.connectionId = defaults.connectionId;
    	      this.customerAddress = defaults.customerAddress;
    	      this.jumboFrameCapable = defaults.jumboFrameCapable;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.vlan = defaults.vlan;
        }

        public Builder addressFamily(@Nullable Output<String> addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public Builder addressFamily(@Nullable String addressFamily) {
            this.addressFamily = Codegen.ofNullable(addressFamily);
            return this;
        }
        public Builder amazonAddress(@Nullable Output<String> amazonAddress) {
            this.amazonAddress = amazonAddress;
            return this;
        }
        public Builder amazonAddress(@Nullable String amazonAddress) {
            this.amazonAddress = Codegen.ofNullable(amazonAddress);
            return this;
        }
        public Builder amazonSideAsn(@Nullable Output<String> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }
        public Builder amazonSideAsn(@Nullable String amazonSideAsn) {
            this.amazonSideAsn = Codegen.ofNullable(amazonSideAsn);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder awsDevice(@Nullable Output<String> awsDevice) {
            this.awsDevice = awsDevice;
            return this;
        }
        public Builder awsDevice(@Nullable String awsDevice) {
            this.awsDevice = Codegen.ofNullable(awsDevice);
            return this;
        }
        public Builder bgpAsn(@Nullable Output<Integer> bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }
        public Builder bgpAsn(@Nullable Integer bgpAsn) {
            this.bgpAsn = Codegen.ofNullable(bgpAsn);
            return this;
        }
        public Builder bgpAuthKey(@Nullable Output<String> bgpAuthKey) {
            this.bgpAuthKey = bgpAuthKey;
            return this;
        }
        public Builder bgpAuthKey(@Nullable String bgpAuthKey) {
            this.bgpAuthKey = Codegen.ofNullable(bgpAuthKey);
            return this;
        }
        public Builder connectionId(@Nullable Output<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = Codegen.ofNullable(connectionId);
            return this;
        }
        public Builder customerAddress(@Nullable Output<String> customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }
        public Builder customerAddress(@Nullable String customerAddress) {
            this.customerAddress = Codegen.ofNullable(customerAddress);
            return this;
        }
        public Builder jumboFrameCapable(@Nullable Output<Boolean> jumboFrameCapable) {
            this.jumboFrameCapable = jumboFrameCapable;
            return this;
        }
        public Builder jumboFrameCapable(@Nullable Boolean jumboFrameCapable) {
            this.jumboFrameCapable = Codegen.ofNullable(jumboFrameCapable);
            return this;
        }
        public Builder mtu(@Nullable Output<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = Codegen.ofNullable(mtu);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ownerAccountId(@Nullable Output<String> ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Builder ownerAccountId(@Nullable String ownerAccountId) {
            this.ownerAccountId = Codegen.ofNullable(ownerAccountId);
            return this;
        }
        public Builder vlan(@Nullable Output<Integer> vlan) {
            this.vlan = vlan;
            return this;
        }
        public Builder vlan(@Nullable Integer vlan) {
            this.vlan = Codegen.ofNullable(vlan);
            return this;
        }        public HostedTransitVirtualInterfaceState build() {
            return new HostedTransitVirtualInterfaceState(addressFamily, amazonAddress, amazonSideAsn, arn, awsDevice, bgpAsn, bgpAuthKey, connectionId, customerAddress, jumboFrameCapable, mtu, name, ownerAccountId, vlan);
        }
    }
}
