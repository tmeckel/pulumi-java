// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apprunner.VpcConnectorArgs;
import io.pulumi.awsnative.apprunner.outputs.VpcConnectorTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::AppRunner::VpcConnector resource specifies an App Runner VpcConnector.
 * 
 */
@ResourceType(type="aws-native:apprunner:VpcConnector")
public class VpcConnector extends io.pulumi.resources.CustomResource {
    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
     * 
     */
    @Export(name="securityGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroups;

    /**
     * @return A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={String.class})
    private Output<List<String>> subnets;

    /**
     * @return A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * 
     */
    public Output<List<String>> getSubnets() {
        return this.subnets;
    }
    /**
     * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * 
     */
    @Export(name="tags", type=List.class, parameters={VpcConnectorTag.class})
    private Output</* @Nullable */ List<VpcConnectorTag>> tags;

    /**
     * @return A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * 
     */
    public Output</* @Nullable */ List<VpcConnectorTag>> getTags() {
        return this.tags;
    }
    /**
     * The Amazon Resource Name (ARN) of this VPC connector.
     * 
     */
    @Export(name="vpcConnectorArn", type=String.class, parameters={})
    private Output<String> vpcConnectorArn;

    /**
     * @return The Amazon Resource Name (ARN) of this VPC connector.
     * 
     */
    public Output<String> getVpcConnectorArn() {
        return this.vpcConnectorArn;
    }
    /**
     * A name for the VPC connector. If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
     * 
     */
    @Export(name="vpcConnectorName", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcConnectorName;

    /**
     * @return A name for the VPC connector. If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
     * 
     */
    public Output</* @Nullable */ String> getVpcConnectorName() {
        return this.vpcConnectorName;
    }
    /**
     * The revision of this VPC connector. It's unique among all the active connectors ("Status": "ACTIVE") that share the same Name.
     * 
     */
    @Export(name="vpcConnectorRevision", type=Integer.class, parameters={})
    private Output<Integer> vpcConnectorRevision;

    /**
     * @return The revision of this VPC connector. It's unique among all the active connectors ("Status": "ACTIVE") that share the same Name.
     * 
     */
    public Output<Integer> getVpcConnectorRevision() {
        return this.vpcConnectorRevision;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcConnector(String name) {
        this(name, VpcConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcConnector(String name, VpcConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcConnector(String name, VpcConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apprunner:VpcConnector", name, args == null ? VpcConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcConnector(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apprunner:VpcConnector", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VpcConnector get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcConnector(name, id, options);
    }
}
