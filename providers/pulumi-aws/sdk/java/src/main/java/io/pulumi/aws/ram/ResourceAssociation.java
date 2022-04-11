// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ram.ResourceAssociationArgs;
import io.pulumi.aws.ram.inputs.ResourceAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Resource Access Manager (RAM) Resource Association.
 * 
 * > *NOTE:* Certain AWS resources (e.g., EC2 Subnets) can only be shared in an AWS account that is a member of an AWS Organizations organization with organization-wide Resource Access Manager functionality enabled. See the [Resource Access Manager User Guide](https://docs.aws.amazon.com/ram/latest/userguide/what-is.html) and AWS service specific documentation for additional information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RAM Resource Associations can be imported using their Resource Share ARN and Resource ARN separated by a comma, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ram/resourceAssociation:ResourceAssociation example arn:aws:ram:eu-west-1:123456789012:resource-share/73da1ab9-b94a-4ba3-8eb4-45917f7f4b12,arn:aws:ec2:eu-west-1:123456789012:subnet/subnet-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ram/resourceAssociation:ResourceAssociation")
public class ResourceAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
     * 
     */
    public Output<String> getResourceArn() {
        return this.resourceArn;
    }
    /**
     * Amazon Resource Name (ARN) of the RAM Resource Share.
     * 
     */
    @Export(name="resourceShareArn", type=String.class, parameters={})
    private Output<String> resourceShareArn;

    /**
     * @return Amazon Resource Name (ARN) of the RAM Resource Share.
     * 
     */
    public Output<String> getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceAssociation(String name) {
        this(name, ResourceAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceAssociation(String name, ResourceAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceAssociation(String name, ResourceAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceAssociation:ResourceAssociation", name, args == null ? ResourceAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceAssociation(String name, Output<String> id, @Nullable ResourceAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceAssociation:ResourceAssociation", name, state, makeResourceOptions(options, id));
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
    public static ResourceAssociation get(String name, Output<String> id, @Nullable ResourceAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceAssociation(name, id, state, options);
    }
}
