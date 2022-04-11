// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ZoneAssociationArgs;
import io.pulumi.aws.route53.inputs.ZoneAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Route53 Hosted Zone VPC association. VPC associations can only be made on private zones. See the `aws.route53.VpcAssociationAuthorization` resource for setting up cross-account associations.
 * 
 * > **NOTE:** Unless explicit association ordering is required (e.g. a separate cross-account association authorization), usage of this resource is not recommended. Use the `vpc` configuration blocks available within the `aws.route53.Zone` resource instead.
 * 
 * > **NOTE:** This provider provides both this standalone Zone VPC Association resource and exclusive VPC associations defined in-line in the `aws.route53.Zone` resource via `vpc` configuration blocks. At this time, you cannot use those in-line VPC associations in conjunction with this resource and the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) in the `aws.route53.Zone` resource to manage additional associations via this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route 53 Hosted Zone Associations can be imported via the Hosted Zone ID and VPC ID, separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678
 * ```
 * 
 *  If the VPC is in a different region than the provider region configuration, the VPC Region can be added to the end. e.g.
 * 
 * ```sh
 *  $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678:us-east-2
 * ```
 * 
 */
@ResourceType(type="aws:route53/zoneAssociation:ZoneAssociation")
public class ZoneAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The account ID of the account that created the hosted zone.
     * 
     */
    @Export(name="owningAccount", type=String.class, parameters={})
    private Output<String> owningAccount;

    /**
     * @return The account ID of the account that created the hosted zone.
     * 
     */
    public Output<String> getOwningAccount() {
        return this.owningAccount;
    }
    /**
     * The VPC to associate with the private hosted zone.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC to associate with the private hosted zone.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }
    /**
     * The VPC's region. Defaults to the region of the AWS provider.
     * 
     */
    @Export(name="vpcRegion", type=String.class, parameters={})
    private Output<String> vpcRegion;

    /**
     * @return The VPC's region. Defaults to the region of the AWS provider.
     * 
     */
    public Output<String> getVpcRegion() {
        return this.vpcRegion;
    }
    /**
     * The private hosted zone to associate.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The private hosted zone to associate.
     * 
     */
    public Output<String> getZoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZoneAssociation(String name) {
        this(name, ZoneAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZoneAssociation(String name, ZoneAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZoneAssociation(String name, ZoneAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zoneAssociation:ZoneAssociation", name, args == null ? ZoneAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ZoneAssociation(String name, Output<String> id, @Nullable ZoneAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zoneAssociation:ZoneAssociation", name, state, makeResourceOptions(options, id));
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
    public static ZoneAssociation get(String name, Output<String> id, @Nullable ZoneAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ZoneAssociation(name, id, state, options);
    }
}
