// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublicVirtualInterfaceState extends io.pulumi.resources.ResourceArgs {

    public static final PublicVirtualInterfaceState Empty = new PublicVirtualInterfaceState();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @InputImport(name="addressFamily")
      private final @Nullable Input<String> addressFamily;

    public Input<String> getAddressFamily() {
        return this.addressFamily == null ? Input.empty() : this.addressFamily;
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @InputImport(name="amazonAddress")
      private final @Nullable Input<String> amazonAddress;

    public Input<String> getAmazonAddress() {
        return this.amazonAddress == null ? Input.empty() : this.amazonAddress;
    }

    @InputImport(name="amazonSideAsn")
      private final @Nullable Input<String> amazonSideAsn;

    public Input<String> getAmazonSideAsn() {
        return this.amazonSideAsn == null ? Input.empty() : this.amazonSideAsn;
    }

    /**
     * The ARN of the virtual interface.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @InputImport(name="awsDevice")
      private final @Nullable Input<String> awsDevice;

    public Input<String> getAwsDevice() {
        return this.awsDevice == null ? Input.empty() : this.awsDevice;
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @InputImport(name="bgpAsn")
      private final @Nullable Input<Integer> bgpAsn;

    public Input<Integer> getBgpAsn() {
        return this.bgpAsn == null ? Input.empty() : this.bgpAsn;
    }

    /**
     * The authentication key for BGP configuration.
     * 
     */
    @InputImport(name="bgpAuthKey")
      private final @Nullable Input<String> bgpAuthKey;

    public Input<String> getBgpAuthKey() {
        return this.bgpAuthKey == null ? Input.empty() : this.bgpAuthKey;
    }

    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @InputImport(name="connectionId")
      private final @Nullable Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId == null ? Input.empty() : this.connectionId;
    }

    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @InputImport(name="customerAddress")
      private final @Nullable Input<String> customerAddress;

    public Input<String> getCustomerAddress() {
        return this.customerAddress == null ? Input.empty() : this.customerAddress;
    }

    /**
     * The name for the virtual interface.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of routes to be advertised to the AWS network in this region.
     * 
     */
    @InputImport(name="routeFilterPrefixes")
      private final @Nullable Input<List<String>> routeFilterPrefixes;

    public Input<List<String>> getRouteFilterPrefixes() {
        return this.routeFilterPrefixes == null ? Input.empty() : this.routeFilterPrefixes;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The VLAN ID.
     * 
     */
    @InputImport(name="vlan")
      private final @Nullable Input<Integer> vlan;

    public Input<Integer> getVlan() {
        return this.vlan == null ? Input.empty() : this.vlan;
    }

    public PublicVirtualInterfaceState(
        @Nullable Input<String> addressFamily,
        @Nullable Input<String> amazonAddress,
        @Nullable Input<String> amazonSideAsn,
        @Nullable Input<String> arn,
        @Nullable Input<String> awsDevice,
        @Nullable Input<Integer> bgpAsn,
        @Nullable Input<String> bgpAuthKey,
        @Nullable Input<String> connectionId,
        @Nullable Input<String> customerAddress,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> routeFilterPrefixes,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Integer> vlan) {
        this.addressFamily = addressFamily;
        this.amazonAddress = amazonAddress;
        this.amazonSideAsn = amazonSideAsn;
        this.arn = arn;
        this.awsDevice = awsDevice;
        this.bgpAsn = bgpAsn;
        this.bgpAuthKey = bgpAuthKey;
        this.connectionId = connectionId;
        this.customerAddress = customerAddress;
        this.name = name;
        this.routeFilterPrefixes = routeFilterPrefixes;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vlan = vlan;
    }

    private PublicVirtualInterfaceState() {
        this.addressFamily = Input.empty();
        this.amazonAddress = Input.empty();
        this.amazonSideAsn = Input.empty();
        this.arn = Input.empty();
        this.awsDevice = Input.empty();
        this.bgpAsn = Input.empty();
        this.bgpAuthKey = Input.empty();
        this.connectionId = Input.empty();
        this.customerAddress = Input.empty();
        this.name = Input.empty();
        this.routeFilterPrefixes = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vlan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicVirtualInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressFamily;
        private @Nullable Input<String> amazonAddress;
        private @Nullable Input<String> amazonSideAsn;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> awsDevice;
        private @Nullable Input<Integer> bgpAsn;
        private @Nullable Input<String> bgpAuthKey;
        private @Nullable Input<String> connectionId;
        private @Nullable Input<String> customerAddress;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> routeFilterPrefixes;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicVirtualInterfaceState defaults) {
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
    	      this.name = defaults.name;
    	      this.routeFilterPrefixes = defaults.routeFilterPrefixes;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vlan = defaults.vlan;
        }

        public Builder addressFamily(@Nullable Input<String> addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }

        public Builder addressFamily(@Nullable String addressFamily) {
            this.addressFamily = Input.ofNullable(addressFamily);
            return this;
        }

        public Builder amazonAddress(@Nullable Input<String> amazonAddress) {
            this.amazonAddress = amazonAddress;
            return this;
        }

        public Builder amazonAddress(@Nullable String amazonAddress) {
            this.amazonAddress = Input.ofNullable(amazonAddress);
            return this;
        }

        public Builder amazonSideAsn(@Nullable Input<String> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }

        public Builder amazonSideAsn(@Nullable String amazonSideAsn) {
            this.amazonSideAsn = Input.ofNullable(amazonSideAsn);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder awsDevice(@Nullable Input<String> awsDevice) {
            this.awsDevice = awsDevice;
            return this;
        }

        public Builder awsDevice(@Nullable String awsDevice) {
            this.awsDevice = Input.ofNullable(awsDevice);
            return this;
        }

        public Builder bgpAsn(@Nullable Input<Integer> bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }

        public Builder bgpAsn(@Nullable Integer bgpAsn) {
            this.bgpAsn = Input.ofNullable(bgpAsn);
            return this;
        }

        public Builder bgpAuthKey(@Nullable Input<String> bgpAuthKey) {
            this.bgpAuthKey = bgpAuthKey;
            return this;
        }

        public Builder bgpAuthKey(@Nullable String bgpAuthKey) {
            this.bgpAuthKey = Input.ofNullable(bgpAuthKey);
            return this;
        }

        public Builder connectionId(@Nullable Input<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = Input.ofNullable(connectionId);
            return this;
        }

        public Builder customerAddress(@Nullable Input<String> customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        public Builder customerAddress(@Nullable String customerAddress) {
            this.customerAddress = Input.ofNullable(customerAddress);
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

        public Builder routeFilterPrefixes(@Nullable Input<List<String>> routeFilterPrefixes) {
            this.routeFilterPrefixes = routeFilterPrefixes;
            return this;
        }

        public Builder routeFilterPrefixes(@Nullable List<String> routeFilterPrefixes) {
            this.routeFilterPrefixes = Input.ofNullable(routeFilterPrefixes);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder vlan(@Nullable Input<Integer> vlan) {
            this.vlan = vlan;
            return this;
        }

        public Builder vlan(@Nullable Integer vlan) {
            this.vlan = Input.ofNullable(vlan);
            return this;
        }
        public PublicVirtualInterfaceState build() {
            return new PublicVirtualInterfaceState(addressFamily, amazonAddress, amazonSideAsn, arn, awsDevice, bgpAsn, bgpAuthKey, connectionId, customerAddress, name, routeFilterPrefixes, tags, tagsAll, vlan);
        }
    }
}
