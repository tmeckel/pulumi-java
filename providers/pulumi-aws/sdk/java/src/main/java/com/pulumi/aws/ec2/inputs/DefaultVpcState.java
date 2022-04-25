// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultVpcState extends com.pulumi.resources.ResourceArgs {

    public static final DefaultVpcState Empty = new DefaultVpcState();

    /**
     * Amazon Resource Name (ARN) of VPC
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of VPC
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Whether or not an Amazon-provided IPv6 CIDR
     * block with a /56 prefix length for the VPC was assigned
     * 
     */
    @Import(name="assignGeneratedIpv6CidrBlock")
    private @Nullable Output<Boolean> assignGeneratedIpv6CidrBlock;

    /**
     * @return Whether or not an Amazon-provided IPv6 CIDR
     * block with a /56 prefix length for the VPC was assigned
     * 
     */
    public Optional<Output<Boolean>> assignGeneratedIpv6CidrBlock() {
        return Optional.ofNullable(this.assignGeneratedIpv6CidrBlock);
    }

    /**
     * The CIDR block of the VPC
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return The CIDR block of the VPC
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * The ID of the network ACL created by default on VPC creation
     * 
     */
    @Import(name="defaultNetworkAclId")
    private @Nullable Output<String> defaultNetworkAclId;

    /**
     * @return The ID of the network ACL created by default on VPC creation
     * 
     */
    public Optional<Output<String>> defaultNetworkAclId() {
        return Optional.ofNullable(this.defaultNetworkAclId);
    }

    /**
     * The ID of the route table created by default on VPC creation
     * 
     */
    @Import(name="defaultRouteTableId")
    private @Nullable Output<String> defaultRouteTableId;

    /**
     * @return The ID of the route table created by default on VPC creation
     * 
     */
    public Optional<Output<String>> defaultRouteTableId() {
        return Optional.ofNullable(this.defaultRouteTableId);
    }

    /**
     * The ID of the security group created by default on VPC creation
     * 
     */
    @Import(name="defaultSecurityGroupId")
    private @Nullable Output<String> defaultSecurityGroupId;

    /**
     * @return The ID of the security group created by default on VPC creation
     * 
     */
    public Optional<Output<String>> defaultSecurityGroupId() {
        return Optional.ofNullable(this.defaultSecurityGroupId);
    }

    @Import(name="dhcpOptionsId")
    private @Nullable Output<String> dhcpOptionsId;

    public Optional<Output<String>> dhcpOptionsId() {
        return Optional.ofNullable(this.dhcpOptionsId);
    }

    /**
     * A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    @Import(name="enableClassiclink")
    private @Nullable Output<Boolean> enableClassiclink;

    /**
     * @return A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    public Optional<Output<Boolean>> enableClassiclink() {
        return Optional.ofNullable(this.enableClassiclink);
    }

    @Import(name="enableClassiclinkDnsSupport")
    private @Nullable Output<Boolean> enableClassiclinkDnsSupport;

    public Optional<Output<Boolean>> enableClassiclinkDnsSupport() {
        return Optional.ofNullable(this.enableClassiclinkDnsSupport);
    }

    /**
     * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    @Import(name="enableDnsHostnames")
    private @Nullable Output<Boolean> enableDnsHostnames;

    /**
     * @return A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    public Optional<Output<Boolean>> enableDnsHostnames() {
        return Optional.ofNullable(this.enableDnsHostnames);
    }

    /**
     * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    @Import(name="enableDnsSupport")
    private @Nullable Output<Boolean> enableDnsSupport;

    /**
     * @return A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    public Optional<Output<Boolean>> enableDnsSupport() {
        return Optional.ofNullable(this.enableDnsSupport);
    }

    /**
     * Tenancy of instances spin up within VPC.
     * 
     */
    @Import(name="instanceTenancy")
    private @Nullable Output<String> instanceTenancy;

    /**
     * @return Tenancy of instances spin up within VPC.
     * 
     */
    public Optional<Output<String>> instanceTenancy() {
        return Optional.ofNullable(this.instanceTenancy);
    }

    @Import(name="ipv4IpamPoolId")
    private @Nullable Output<String> ipv4IpamPoolId;

    public Optional<Output<String>> ipv4IpamPoolId() {
        return Optional.ofNullable(this.ipv4IpamPoolId);
    }

    @Import(name="ipv4NetmaskLength")
    private @Nullable Output<Integer> ipv4NetmaskLength;

    public Optional<Output<Integer>> ipv4NetmaskLength() {
        return Optional.ofNullable(this.ipv4NetmaskLength);
    }

    /**
     * The association ID for the IPv6 CIDR block of the VPC
     * 
     */
    @Import(name="ipv6AssociationId")
    private @Nullable Output<String> ipv6AssociationId;

    /**
     * @return The association ID for the IPv6 CIDR block of the VPC
     * 
     */
    public Optional<Output<String>> ipv6AssociationId() {
        return Optional.ofNullable(this.ipv6AssociationId);
    }

    /**
     * The IPv6 CIDR block of the VPC
     * 
     */
    @Import(name="ipv6CidrBlock")
    private @Nullable Output<String> ipv6CidrBlock;

    /**
     * @return The IPv6 CIDR block of the VPC
     * 
     */
    public Optional<Output<String>> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }

    @Import(name="ipv6CidrBlockNetworkBorderGroup")
    private @Nullable Output<String> ipv6CidrBlockNetworkBorderGroup;

    public Optional<Output<String>> ipv6CidrBlockNetworkBorderGroup() {
        return Optional.ofNullable(this.ipv6CidrBlockNetworkBorderGroup);
    }

    @Import(name="ipv6IpamPoolId")
    private @Nullable Output<String> ipv6IpamPoolId;

    public Optional<Output<String>> ipv6IpamPoolId() {
        return Optional.ofNullable(this.ipv6IpamPoolId);
    }

    @Import(name="ipv6NetmaskLength")
    private @Nullable Output<Integer> ipv6NetmaskLength;

    public Optional<Output<Integer>> ipv6NetmaskLength() {
        return Optional.ofNullable(this.ipv6NetmaskLength);
    }

    /**
     * The ID of the main route table associated with
     * this VPC. Note that you can change a VPC&#39;s main route table by using an
     * `aws.ec2.MainRouteTableAssociation`
     * 
     */
    @Import(name="mainRouteTableId")
    private @Nullable Output<String> mainRouteTableId;

    /**
     * @return The ID of the main route table associated with
     * this VPC. Note that you can change a VPC&#39;s main route table by using an
     * `aws.ec2.MainRouteTableAssociation`
     * 
     */
    public Optional<Output<String>> mainRouteTableId() {
        return Optional.ofNullable(this.mainRouteTableId);
    }

    /**
     * The ID of the AWS account that owns the VPC.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the VPC.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private DefaultVpcState() {}

    private DefaultVpcState(DefaultVpcState $) {
        this.arn = $.arn;
        this.assignGeneratedIpv6CidrBlock = $.assignGeneratedIpv6CidrBlock;
        this.cidrBlock = $.cidrBlock;
        this.defaultNetworkAclId = $.defaultNetworkAclId;
        this.defaultRouteTableId = $.defaultRouteTableId;
        this.defaultSecurityGroupId = $.defaultSecurityGroupId;
        this.dhcpOptionsId = $.dhcpOptionsId;
        this.enableClassiclink = $.enableClassiclink;
        this.enableClassiclinkDnsSupport = $.enableClassiclinkDnsSupport;
        this.enableDnsHostnames = $.enableDnsHostnames;
        this.enableDnsSupport = $.enableDnsSupport;
        this.instanceTenancy = $.instanceTenancy;
        this.ipv4IpamPoolId = $.ipv4IpamPoolId;
        this.ipv4NetmaskLength = $.ipv4NetmaskLength;
        this.ipv6AssociationId = $.ipv6AssociationId;
        this.ipv6CidrBlock = $.ipv6CidrBlock;
        this.ipv6CidrBlockNetworkBorderGroup = $.ipv6CidrBlockNetworkBorderGroup;
        this.ipv6IpamPoolId = $.ipv6IpamPoolId;
        this.ipv6NetmaskLength = $.ipv6NetmaskLength;
        this.mainRouteTableId = $.mainRouteTableId;
        this.ownerId = $.ownerId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultVpcState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultVpcState $;

        public Builder() {
            $ = new DefaultVpcState();
        }

        public Builder(DefaultVpcState defaults) {
            $ = new DefaultVpcState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of VPC
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of VPC
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param assignGeneratedIpv6CidrBlock Whether or not an Amazon-provided IPv6 CIDR
         * block with a /56 prefix length for the VPC was assigned
         * 
         * @return builder
         * 
         */
        public Builder assignGeneratedIpv6CidrBlock(@Nullable Output<Boolean> assignGeneratedIpv6CidrBlock) {
            $.assignGeneratedIpv6CidrBlock = assignGeneratedIpv6CidrBlock;
            return this;
        }

        /**
         * @param assignGeneratedIpv6CidrBlock Whether or not an Amazon-provided IPv6 CIDR
         * block with a /56 prefix length for the VPC was assigned
         * 
         * @return builder
         * 
         */
        public Builder assignGeneratedIpv6CidrBlock(Boolean assignGeneratedIpv6CidrBlock) {
            return assignGeneratedIpv6CidrBlock(Output.of(assignGeneratedIpv6CidrBlock));
        }

        /**
         * @param cidrBlock The CIDR block of the VPC
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR block of the VPC
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param defaultNetworkAclId The ID of the network ACL created by default on VPC creation
         * 
         * @return builder
         * 
         */
        public Builder defaultNetworkAclId(@Nullable Output<String> defaultNetworkAclId) {
            $.defaultNetworkAclId = defaultNetworkAclId;
            return this;
        }

        /**
         * @param defaultNetworkAclId The ID of the network ACL created by default on VPC creation
         * 
         * @return builder
         * 
         */
        public Builder defaultNetworkAclId(String defaultNetworkAclId) {
            return defaultNetworkAclId(Output.of(defaultNetworkAclId));
        }

        /**
         * @param defaultRouteTableId The ID of the route table created by default on VPC creation
         * 
         * @return builder
         * 
         */
        public Builder defaultRouteTableId(@Nullable Output<String> defaultRouteTableId) {
            $.defaultRouteTableId = defaultRouteTableId;
            return this;
        }

        /**
         * @param defaultRouteTableId The ID of the route table created by default on VPC creation
         * 
         * @return builder
         * 
         */
        public Builder defaultRouteTableId(String defaultRouteTableId) {
            return defaultRouteTableId(Output.of(defaultRouteTableId));
        }

        /**
         * @param defaultSecurityGroupId The ID of the security group created by default on VPC creation
         * 
         * @return builder
         * 
         */
        public Builder defaultSecurityGroupId(@Nullable Output<String> defaultSecurityGroupId) {
            $.defaultSecurityGroupId = defaultSecurityGroupId;
            return this;
        }

        /**
         * @param defaultSecurityGroupId The ID of the security group created by default on VPC creation
         * 
         * @return builder
         * 
         */
        public Builder defaultSecurityGroupId(String defaultSecurityGroupId) {
            return defaultSecurityGroupId(Output.of(defaultSecurityGroupId));
        }

        public Builder dhcpOptionsId(@Nullable Output<String> dhcpOptionsId) {
            $.dhcpOptionsId = dhcpOptionsId;
            return this;
        }

        public Builder dhcpOptionsId(String dhcpOptionsId) {
            return dhcpOptionsId(Output.of(dhcpOptionsId));
        }

        /**
         * @param enableClassiclink A boolean flag to enable/disable ClassicLink
         * for the VPC. Only valid in regions and accounts that support EC2 Classic.
         * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableClassiclink(@Nullable Output<Boolean> enableClassiclink) {
            $.enableClassiclink = enableClassiclink;
            return this;
        }

        /**
         * @param enableClassiclink A boolean flag to enable/disable ClassicLink
         * for the VPC. Only valid in regions and accounts that support EC2 Classic.
         * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableClassiclink(Boolean enableClassiclink) {
            return enableClassiclink(Output.of(enableClassiclink));
        }

        public Builder enableClassiclinkDnsSupport(@Nullable Output<Boolean> enableClassiclinkDnsSupport) {
            $.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
            return this;
        }

        public Builder enableClassiclinkDnsSupport(Boolean enableClassiclinkDnsSupport) {
            return enableClassiclinkDnsSupport(Output.of(enableClassiclinkDnsSupport));
        }

        /**
         * @param enableDnsHostnames A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsHostnames(@Nullable Output<Boolean> enableDnsHostnames) {
            $.enableDnsHostnames = enableDnsHostnames;
            return this;
        }

        /**
         * @param enableDnsHostnames A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsHostnames(Boolean enableDnsHostnames) {
            return enableDnsHostnames(Output.of(enableDnsHostnames));
        }

        /**
         * @param enableDnsSupport A boolean flag to enable/disable DNS support in the VPC. Defaults true.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsSupport(@Nullable Output<Boolean> enableDnsSupport) {
            $.enableDnsSupport = enableDnsSupport;
            return this;
        }

        /**
         * @param enableDnsSupport A boolean flag to enable/disable DNS support in the VPC. Defaults true.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsSupport(Boolean enableDnsSupport) {
            return enableDnsSupport(Output.of(enableDnsSupport));
        }

        /**
         * @param instanceTenancy Tenancy of instances spin up within VPC.
         * 
         * @return builder
         * 
         */
        public Builder instanceTenancy(@Nullable Output<String> instanceTenancy) {
            $.instanceTenancy = instanceTenancy;
            return this;
        }

        /**
         * @param instanceTenancy Tenancy of instances spin up within VPC.
         * 
         * @return builder
         * 
         */
        public Builder instanceTenancy(String instanceTenancy) {
            return instanceTenancy(Output.of(instanceTenancy));
        }

        public Builder ipv4IpamPoolId(@Nullable Output<String> ipv4IpamPoolId) {
            $.ipv4IpamPoolId = ipv4IpamPoolId;
            return this;
        }

        public Builder ipv4IpamPoolId(String ipv4IpamPoolId) {
            return ipv4IpamPoolId(Output.of(ipv4IpamPoolId));
        }

        public Builder ipv4NetmaskLength(@Nullable Output<Integer> ipv4NetmaskLength) {
            $.ipv4NetmaskLength = ipv4NetmaskLength;
            return this;
        }

        public Builder ipv4NetmaskLength(Integer ipv4NetmaskLength) {
            return ipv4NetmaskLength(Output.of(ipv4NetmaskLength));
        }

        /**
         * @param ipv6AssociationId The association ID for the IPv6 CIDR block of the VPC
         * 
         * @return builder
         * 
         */
        public Builder ipv6AssociationId(@Nullable Output<String> ipv6AssociationId) {
            $.ipv6AssociationId = ipv6AssociationId;
            return this;
        }

        /**
         * @param ipv6AssociationId The association ID for the IPv6 CIDR block of the VPC
         * 
         * @return builder
         * 
         */
        public Builder ipv6AssociationId(String ipv6AssociationId) {
            return ipv6AssociationId(Output.of(ipv6AssociationId));
        }

        /**
         * @param ipv6CidrBlock The IPv6 CIDR block of the VPC
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            $.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * @param ipv6CidrBlock The IPv6 CIDR block of the VPC
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            return ipv6CidrBlock(Output.of(ipv6CidrBlock));
        }

        public Builder ipv6CidrBlockNetworkBorderGroup(@Nullable Output<String> ipv6CidrBlockNetworkBorderGroup) {
            $.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
            return this;
        }

        public Builder ipv6CidrBlockNetworkBorderGroup(String ipv6CidrBlockNetworkBorderGroup) {
            return ipv6CidrBlockNetworkBorderGroup(Output.of(ipv6CidrBlockNetworkBorderGroup));
        }

        public Builder ipv6IpamPoolId(@Nullable Output<String> ipv6IpamPoolId) {
            $.ipv6IpamPoolId = ipv6IpamPoolId;
            return this;
        }

        public Builder ipv6IpamPoolId(String ipv6IpamPoolId) {
            return ipv6IpamPoolId(Output.of(ipv6IpamPoolId));
        }

        public Builder ipv6NetmaskLength(@Nullable Output<Integer> ipv6NetmaskLength) {
            $.ipv6NetmaskLength = ipv6NetmaskLength;
            return this;
        }

        public Builder ipv6NetmaskLength(Integer ipv6NetmaskLength) {
            return ipv6NetmaskLength(Output.of(ipv6NetmaskLength));
        }

        /**
         * @param mainRouteTableId The ID of the main route table associated with
         * this VPC. Note that you can change a VPC&#39;s main route table by using an
         * `aws.ec2.MainRouteTableAssociation`
         * 
         * @return builder
         * 
         */
        public Builder mainRouteTableId(@Nullable Output<String> mainRouteTableId) {
            $.mainRouteTableId = mainRouteTableId;
            return this;
        }

        /**
         * @param mainRouteTableId The ID of the main route table associated with
         * this VPC. Note that you can change a VPC&#39;s main route table by using an
         * `aws.ec2.MainRouteTableAssociation`
         * 
         * @return builder
         * 
         */
        public Builder mainRouteTableId(String mainRouteTableId) {
            return mainRouteTableId(Output.of(mainRouteTableId));
        }

        /**
         * @param ownerId The ID of the AWS account that owns the VPC.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The ID of the AWS account that owns the VPC.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param tags A map of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public DefaultVpcState build() {
            return $;
        }
    }

}
