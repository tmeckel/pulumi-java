// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dax.SubnetGroupArgs;
import io.pulumi.aws.dax.inputs.SubnetGroupState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a DAX Subnet Group resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DAX Subnet Group can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:dax/subnetGroup:SubnetGroup example my_dax_sg
 * ```
 * 
 */
@ResourceType(type="aws:dax/subnetGroup:SubnetGroup")
public class SubnetGroup extends io.pulumi.resources.CustomResource {
    /**
     * A description of the subnet group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the subnet group.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the subnet group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the subnet group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of VPC subnet IDs for the subnet group.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return A list of VPC subnet IDs for the subnet group.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * VPC ID of the subnet group.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VPC ID of the subnet group.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubnetGroup(String name) {
        this(name, SubnetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubnetGroup(String name, SubnetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetGroup(String name, SubnetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dax/subnetGroup:SubnetGroup", name, args == null ? SubnetGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SubnetGroup(String name, Output<String> id, @Nullable SubnetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dax/subnetGroup:SubnetGroup", name, state, makeResourceOptions(options, id));
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
    public static SubnetGroup get(String name, Output<String> id, @Nullable SubnetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetGroup(name, id, state, options);
    }
}
