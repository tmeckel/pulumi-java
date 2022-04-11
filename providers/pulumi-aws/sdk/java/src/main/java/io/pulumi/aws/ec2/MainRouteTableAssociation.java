// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.MainRouteTableAssociationArgs;
import io.pulumi.aws.ec2.inputs.MainRouteTableAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws:ec2/mainRouteTableAssociation:MainRouteTableAssociation")
public class MainRouteTableAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Used internally, see __Notes__ below
     * 
     */
    @Export(name="originalRouteTableId", type=String.class, parameters={})
    private Output<String> originalRouteTableId;

    /**
     * @return Used internally, see __Notes__ below
     * 
     */
    public Output<String> getOriginalRouteTableId() {
        return this.originalRouteTableId;
    }
    /**
     * The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    @Export(name="routeTableId", type=String.class, parameters={})
    private Output<String> routeTableId;

    /**
     * @return The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    public Output<String> getRouteTableId() {
        return this.routeTableId;
    }
    /**
     * The ID of the VPC whose main route table should be set
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC whose main route table should be set
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MainRouteTableAssociation(String name) {
        this(name, MainRouteTableAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MainRouteTableAssociation(String name, MainRouteTableAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MainRouteTableAssociation(String name, MainRouteTableAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/mainRouteTableAssociation:MainRouteTableAssociation", name, args == null ? MainRouteTableAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MainRouteTableAssociation(String name, Output<String> id, @Nullable MainRouteTableAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/mainRouteTableAssociation:MainRouteTableAssociation", name, state, makeResourceOptions(options, id));
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
    public static MainRouteTableAssociation get(String name, Output<String> id, @Nullable MainRouteTableAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MainRouteTableAssociation(name, id, state, options);
    }
}
