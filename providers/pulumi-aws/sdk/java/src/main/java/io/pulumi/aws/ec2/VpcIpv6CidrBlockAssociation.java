// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcIpv6CidrBlockAssociationArgs;
import io.pulumi.aws.ec2.inputs.VpcIpv6CidrBlockAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to associate additional IPv6 CIDR blocks with a VPC.
 * 
 * The `aws.ec2.VpcIpv6CidrBlockAssociation` resource allows IPv6 CIDR blocks to be added to the VPC.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_vpc_ipv6_cidr_block_association` can be imported by using the VPC CIDR Association ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation example vpc-cidr-assoc-xxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation")
public class VpcIpv6CidrBlockAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The IPv6 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv6_netmask_length`. This parameter is required if `ipv6_netmask_length` is not set and he IPAM pool does not have `allocation_default_netmask` set.
     * 
     */
    @Export(name="ipv6CidrBlock", type=String.class, parameters={})
    private Output<String> ipv6CidrBlock;

    /**
     * @return The IPv6 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv6_netmask_length`. This parameter is required if `ipv6_netmask_length` is not set and he IPAM pool does not have `allocation_default_netmask` set.
     * 
     */
    public Output<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * The ID of an IPv6 IPAM pool you want to use for allocating this VPC's CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts.
     * 
     */
    @Export(name="ipv6IpamPoolId", type=String.class, parameters={})
    private Output<String> ipv6IpamPoolId;

    /**
     * @return The ID of an IPv6 IPAM pool you want to use for allocating this VPC's CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts.
     * 
     */
    public Output<String> getIpv6IpamPoolId() {
        return this.ipv6IpamPoolId;
    }
    /**
     * The netmask length of the IPv6 CIDR you want to allocate to this VPC. Requires specifying a `ipv6_ipam_pool_id`. This parameter is optional if the IPAM pool has `allocation_default_netmask` set, otherwise it or `cidr_block` are required
     * 
     */
    @Export(name="ipv6NetmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ipv6NetmaskLength;

    /**
     * @return The netmask length of the IPv6 CIDR you want to allocate to this VPC. Requires specifying a `ipv6_ipam_pool_id`. This parameter is optional if the IPAM pool has `allocation_default_netmask` set, otherwise it or `cidr_block` are required
     * 
     */
    public Output</* @Nullable */ Integer> getIpv6NetmaskLength() {
        return this.ipv6NetmaskLength;
    }
    /**
     * The ID of the VPC to make the association with.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC to make the association with.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpv6CidrBlockAssociation(String name) {
        this(name, VpcIpv6CidrBlockAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpv6CidrBlockAssociation(String name, VpcIpv6CidrBlockAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpv6CidrBlockAssociation(String name, VpcIpv6CidrBlockAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation", name, args == null ? VpcIpv6CidrBlockAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpv6CidrBlockAssociation(String name, Output<String> id, @Nullable VpcIpv6CidrBlockAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VpcIpv6CidrBlockAssociation get(String name, Output<String> id, @Nullable VpcIpv6CidrBlockAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpv6CidrBlockAssociation(name, id, state, options);
    }
}
