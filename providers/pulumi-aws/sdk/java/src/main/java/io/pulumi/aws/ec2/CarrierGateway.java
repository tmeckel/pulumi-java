// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.CarrierGatewayArgs;
import io.pulumi.aws.ec2.inputs.CarrierGatewayState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Carrier Gateway. See the AWS [documentation](https://docs.aws.amazon.com/vpc/latest/userguide/Carrier_Gateway.html) for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_carrier_gateway` can be imported using the carrier gateway's ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/carrierGateway:CarrierGateway example cgw-12345
 * ```
 * 
 */
@ResourceType(type="aws:ec2/carrierGateway:CarrierGateway")
public class CarrierGateway extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the carrier gateway.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the carrier gateway.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The AWS account ID of the owner of the carrier gateway.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the owner of the carrier gateway.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the VPC to associate with the carrier gateway.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC to associate with the carrier gateway.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CarrierGateway(String name) {
        this(name, CarrierGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CarrierGateway(String name, CarrierGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CarrierGateway(String name, CarrierGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/carrierGateway:CarrierGateway", name, args == null ? CarrierGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CarrierGateway(String name, Output<String> id, @Nullable CarrierGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/carrierGateway:CarrierGateway", name, state, makeResourceOptions(options, id));
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
    public static CarrierGateway get(String name, Output<String> id, @Nullable CarrierGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CarrierGateway(name, id, state, options);
    }
}
