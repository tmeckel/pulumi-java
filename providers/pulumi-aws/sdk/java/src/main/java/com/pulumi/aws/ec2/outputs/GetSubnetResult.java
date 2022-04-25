// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetSubnetFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSubnetResult {
    /**
     * @return ARN of the subnet.
     * 
     */
    private final String arn;
    /**
     * @return Whether an IPv6 address is assigned on creation.
     * 
     */
    private final Boolean assignIpv6AddressOnCreation;
    private final String availabilityZone;
    private final String availabilityZoneId;
    /**
     * @return Available IP addresses of the subnet.
     * 
     */
    private final Integer availableIpAddressCount;
    private final String cidrBlock;
    /**
     * @return Identifier of customer owned IPv4 address pool.
     * 
     */
    private final String customerOwnedIpv4Pool;
    private final Boolean defaultForAz;
    /**
     * @return Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet return synthetic IPv6 addresses for IPv4-only destinations.
     * 
     */
    private final Boolean enableDns64;
    /**
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * 
     */
    private final Boolean enableResourceNameDnsARecordOnLaunch;
    /**
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * 
     */
    private final Boolean enableResourceNameDnsAaaaRecordOnLaunch;
    private final @Nullable List<GetSubnetFilter> filters;
    private final String id;
    private final String ipv6CidrBlock;
    /**
     * @return Association ID of the IPv6 CIDR block.
     * 
     */
    private final String ipv6CidrBlockAssociationId;
    /**
     * @return Indicates whether this is an IPv6-only subnet.
     * 
     */
    private final Boolean ipv6Native;
    /**
     * @return Whether customer owned IP addresses are assigned on network interface creation.
     * 
     */
    private final Boolean mapCustomerOwnedIpOnLaunch;
    /**
     * @return Whether public IP addresses are assigned on instance launch.
     * 
     */
    private final Boolean mapPublicIpOnLaunch;
    /**
     * @return ARN of the Outpost.
     * 
     */
    private final String outpostArn;
    /**
     * @return ID of the AWS account that owns the subnet.
     * 
     */
    private final String ownerId;
    /**
     * @return The type of hostnames assigned to instances in the subnet at launch.
     * 
     */
    private final String privateDnsHostnameTypeOnLaunch;
    private final String state;
    private final Map<String,String> tags;
    private final String vpcId;

    @CustomType.Constructor
    private GetSubnetResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("assignIpv6AddressOnCreation") Boolean assignIpv6AddressOnCreation,
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("availabilityZoneId") String availabilityZoneId,
        @CustomType.Parameter("availableIpAddressCount") Integer availableIpAddressCount,
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("customerOwnedIpv4Pool") String customerOwnedIpv4Pool,
        @CustomType.Parameter("defaultForAz") Boolean defaultForAz,
        @CustomType.Parameter("enableDns64") Boolean enableDns64,
        @CustomType.Parameter("enableResourceNameDnsARecordOnLaunch") Boolean enableResourceNameDnsARecordOnLaunch,
        @CustomType.Parameter("enableResourceNameDnsAaaaRecordOnLaunch") Boolean enableResourceNameDnsAaaaRecordOnLaunch,
        @CustomType.Parameter("filters") @Nullable List<GetSubnetFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipv6CidrBlock") String ipv6CidrBlock,
        @CustomType.Parameter("ipv6CidrBlockAssociationId") String ipv6CidrBlockAssociationId,
        @CustomType.Parameter("ipv6Native") Boolean ipv6Native,
        @CustomType.Parameter("mapCustomerOwnedIpOnLaunch") Boolean mapCustomerOwnedIpOnLaunch,
        @CustomType.Parameter("mapPublicIpOnLaunch") Boolean mapPublicIpOnLaunch,
        @CustomType.Parameter("outpostArn") String outpostArn,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("privateDnsHostnameTypeOnLaunch") String privateDnsHostnameTypeOnLaunch,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.arn = arn;
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        this.availabilityZone = availabilityZone;
        this.availabilityZoneId = availabilityZoneId;
        this.availableIpAddressCount = availableIpAddressCount;
        this.cidrBlock = cidrBlock;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.defaultForAz = defaultForAz;
        this.enableDns64 = enableDns64;
        this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
        this.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
        this.filters = filters;
        this.id = id;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId;
        this.ipv6Native = ipv6Native;
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        this.outpostArn = outpostArn;
        this.ownerId = ownerId;
        this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
        this.state = state;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    /**
     * @return ARN of the subnet.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Whether an IPv6 address is assigned on creation.
     * 
     */
    public Boolean assignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }
    public String availabilityZone() {
        return this.availabilityZone;
    }
    public String availabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * @return Available IP addresses of the subnet.
     * 
     */
    public Integer availableIpAddressCount() {
        return this.availableIpAddressCount;
    }
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return Identifier of customer owned IPv4 address pool.
     * 
     */
    public String customerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    public Boolean defaultForAz() {
        return this.defaultForAz;
    }
    /**
     * @return Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet return synthetic IPv6 addresses for IPv4-only destinations.
     * 
     */
    public Boolean enableDns64() {
        return this.enableDns64;
    }
    /**
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * 
     */
    public Boolean enableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch;
    }
    /**
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * 
     */
    public Boolean enableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch;
    }
    public List<GetSubnetFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    public String ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * @return Association ID of the IPv6 CIDR block.
     * 
     */
    public String ipv6CidrBlockAssociationId() {
        return this.ipv6CidrBlockAssociationId;
    }
    /**
     * @return Indicates whether this is an IPv6-only subnet.
     * 
     */
    public Boolean ipv6Native() {
        return this.ipv6Native;
    }
    /**
     * @return Whether customer owned IP addresses are assigned on network interface creation.
     * 
     */
    public Boolean mapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }
    /**
     * @return Whether public IP addresses are assigned on instance launch.
     * 
     */
    public Boolean mapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }
    /**
     * @return ARN of the Outpost.
     * 
     */
    public String outpostArn() {
        return this.outpostArn;
    }
    /**
     * @return ID of the AWS account that owns the subnet.
     * 
     */
    public String ownerId() {
        return this.ownerId;
    }
    /**
     * @return The type of hostnames assigned to instances in the subnet at launch.
     * 
     */
    public String privateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch;
    }
    public String state() {
        return this.state;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean assignIpv6AddressOnCreation;
        private String availabilityZone;
        private String availabilityZoneId;
        private Integer availableIpAddressCount;
        private String cidrBlock;
        private String customerOwnedIpv4Pool;
        private Boolean defaultForAz;
        private Boolean enableDns64;
        private Boolean enableResourceNameDnsARecordOnLaunch;
        private Boolean enableResourceNameDnsAaaaRecordOnLaunch;
        private @Nullable List<GetSubnetFilter> filters;
        private String id;
        private String ipv6CidrBlock;
        private String ipv6CidrBlockAssociationId;
        private Boolean ipv6Native;
        private Boolean mapCustomerOwnedIpOnLaunch;
        private Boolean mapPublicIpOnLaunch;
        private String outpostArn;
        private String ownerId;
        private String privateDnsHostnameTypeOnLaunch;
        private String state;
        private Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assignIpv6AddressOnCreation = defaults.assignIpv6AddressOnCreation;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.availableIpAddressCount = defaults.availableIpAddressCount;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.defaultForAz = defaults.defaultForAz;
    	      this.enableDns64 = defaults.enableDns64;
    	      this.enableResourceNameDnsARecordOnLaunch = defaults.enableResourceNameDnsARecordOnLaunch;
    	      this.enableResourceNameDnsAaaaRecordOnLaunch = defaults.enableResourceNameDnsAaaaRecordOnLaunch;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6CidrBlockAssociationId = defaults.ipv6CidrBlockAssociationId;
    	      this.ipv6Native = defaults.ipv6Native;
    	      this.mapCustomerOwnedIpOnLaunch = defaults.mapCustomerOwnedIpOnLaunch;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.privateDnsHostnameTypeOnLaunch = defaults.privateDnsHostnameTypeOnLaunch;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder assignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = Objects.requireNonNull(assignIpv6AddressOnCreation);
            return this;
        }
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder availabilityZoneId(String availabilityZoneId) {
            this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
            return this;
        }
        public Builder availableIpAddressCount(Integer availableIpAddressCount) {
            this.availableIpAddressCount = Objects.requireNonNull(availableIpAddressCount);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
            return this;
        }
        public Builder defaultForAz(Boolean defaultForAz) {
            this.defaultForAz = Objects.requireNonNull(defaultForAz);
            return this;
        }
        public Builder enableDns64(Boolean enableDns64) {
            this.enableDns64 = Objects.requireNonNull(enableDns64);
            return this;
        }
        public Builder enableResourceNameDnsARecordOnLaunch(Boolean enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = Objects.requireNonNull(enableResourceNameDnsARecordOnLaunch);
            return this;
        }
        public Builder enableResourceNameDnsAaaaRecordOnLaunch(Boolean enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = Objects.requireNonNull(enableResourceNameDnsAaaaRecordOnLaunch);
            return this;
        }
        public Builder filters(@Nullable List<GetSubnetFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSubnetFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = Objects.requireNonNull(ipv6CidrBlock);
            return this;
        }
        public Builder ipv6CidrBlockAssociationId(String ipv6CidrBlockAssociationId) {
            this.ipv6CidrBlockAssociationId = Objects.requireNonNull(ipv6CidrBlockAssociationId);
            return this;
        }
        public Builder ipv6Native(Boolean ipv6Native) {
            this.ipv6Native = Objects.requireNonNull(ipv6Native);
            return this;
        }
        public Builder mapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = Objects.requireNonNull(mapCustomerOwnedIpOnLaunch);
            return this;
        }
        public Builder mapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = Objects.requireNonNull(mapPublicIpOnLaunch);
            return this;
        }
        public Builder outpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        public Builder privateDnsHostnameTypeOnLaunch(String privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = Objects.requireNonNull(privateDnsHostnameTypeOnLaunch);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetSubnetResult build() {
            return new GetSubnetResult(arn, assignIpv6AddressOnCreation, availabilityZone, availabilityZoneId, availableIpAddressCount, cidrBlock, customerOwnedIpv4Pool, defaultForAz, enableDns64, enableResourceNameDnsARecordOnLaunch, enableResourceNameDnsAaaaRecordOnLaunch, filters, id, ipv6CidrBlock, ipv6CidrBlockAssociationId, ipv6Native, mapCustomerOwnedIpOnLaunch, mapPublicIpOnLaunch, outpostArn, ownerId, privateDnsHostnameTypeOnLaunch, state, tags, vpcId);
        }
    }
}
