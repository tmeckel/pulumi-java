// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcIpamPoolCidrAllocationArgs;
import io.pulumi.aws.ec2.inputs.VpcIpamPoolCidrAllocationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Allocates (reserves) a CIDR from an IPAM address pool, preventing usage by IPAM. Only works for private IPv4.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IPAMs can be imported using the `allocation id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation example
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation")
public class VpcIpamPoolCidrAllocation extends io.pulumi.resources.CustomResource {
    /**
     * The CIDR you want to assign to the pool.
     * 
     */
    @Export(name="cidr", type=String.class, parameters={})
    private Output<String> cidr;

    /**
     * @return The CIDR you want to assign to the pool.
     * 
     */
    public Output<String> getCidr() {
        return this.cidr;
    }
    /**
     * The description for the allocation.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the allocation.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    @Export(name="disallowedCidrs", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> disallowedCidrs;

    /**
     * @return Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    public Output</* @Nullable */ List<String>> getDisallowedCidrs() {
        return this.disallowedCidrs;
    }
    @Export(name="ipamPoolAllocationId", type=String.class, parameters={})
    private Output<String> ipamPoolAllocationId;

    public Output<String> getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }
    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @Export(name="ipamPoolId", type=String.class, parameters={})
    private Output<String> ipamPoolId;

    /**
     * @return The ID of the pool to which you want to assign a CIDR.
     * 
     */
    public Output<String> getIpamPoolId() {
        return this.ipamPoolId;
    }
    /**
     * The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
     * 
     */
    @Export(name="netmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> netmaskLength;

    /**
     * @return The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
     * 
     */
    public Output</* @Nullable */ Integer> getNetmaskLength() {
        return this.netmaskLength;
    }
    /**
     * The ID of the resource.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the resource.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The owner of the resource.
     * 
     */
    @Export(name="resourceOwner", type=String.class, parameters={})
    private Output<String> resourceOwner;

    /**
     * @return The owner of the resource.
     * 
     */
    public Output<String> getResourceOwner() {
        return this.resourceOwner;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getPropResourceType() {
        return this.resourceType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpamPoolCidrAllocation(String name) {
        this(name, VpcIpamPoolCidrAllocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpamPoolCidrAllocation(String name, VpcIpamPoolCidrAllocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamPoolCidrAllocation(String name, VpcIpamPoolCidrAllocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation", name, args == null ? VpcIpamPoolCidrAllocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpamPoolCidrAllocation(String name, Output<String> id, @Nullable VpcIpamPoolCidrAllocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation", name, state, makeResourceOptions(options, id));
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
    public static VpcIpamPoolCidrAllocation get(String name, Output<String> id, @Nullable VpcIpamPoolCidrAllocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamPoolCidrAllocation(name, id, state, options);
    }
}
