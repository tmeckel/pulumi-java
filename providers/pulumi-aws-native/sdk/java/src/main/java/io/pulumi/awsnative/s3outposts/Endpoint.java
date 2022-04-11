// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3outposts.EndpointArgs;
import io.pulumi.awsnative.s3outposts.enums.EndpointAccessType;
import io.pulumi.awsnative.s3outposts.enums.EndpointStatus;
import io.pulumi.awsnative.s3outposts.outputs.EndpointNetworkInterface;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type Definition for AWS::S3Outposts::Endpoint
 * 
 */
@ResourceType(type="aws-native:s3outposts:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    /**
     * The type of access for the on-premise network connectivity for the Outpost endpoint. To access endpoint from an on-premises network, you must specify the access type and provide the customer owned Ipv4 pool.
     * 
     */
    @Export(name="accessType", type=EndpointAccessType.class, parameters={})
    private Output</* @Nullable */ EndpointAccessType> accessType;

    /**
     * @return The type of access for the on-premise network connectivity for the Outpost endpoint. To access endpoint from an on-premises network, you must specify the access type and provide the customer owned Ipv4 pool.
     * 
     */
    public Output</* @Nullable */ EndpointAccessType> getAccessType() {
        return this.accessType;
    }
    /**
     * The Amazon Resource Name (ARN) of the endpoint.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the endpoint.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The VPC CIDR committed by this endpoint.
     * 
     */
    @Export(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return The VPC CIDR committed by this endpoint.
     * 
     */
    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The time the endpoint was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the endpoint was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The ID of the customer-owned IPv4 pool for the Endpoint. IP addresses will be allocated from this pool for the endpoint.
     * 
     */
    @Export(name="customerOwnedIpv4Pool", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    /**
     * @return The ID of the customer-owned IPv4 pool for the Endpoint. IP addresses will be allocated from this pool for the endpoint.
     * 
     */
    public Output</* @Nullable */ String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    /**
     * The network interfaces of the endpoint.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={EndpointNetworkInterface.class})
    private Output<List<EndpointNetworkInterface>> networkInterfaces;

    /**
     * @return The network interfaces of the endpoint.
     * 
     */
    public Output<List<EndpointNetworkInterface>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * The id of the customer outpost on which the bucket resides.
     * 
     */
    @Export(name="outpostId", type=String.class, parameters={})
    private Output<String> outpostId;

    /**
     * @return The id of the customer outpost on which the bucket resides.
     * 
     */
    public Output<String> getOutpostId() {
        return this.outpostId;
    }
    /**
     * The ID of the security group to use with the endpoint.
     * 
     */
    @Export(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group to use with the endpoint.
     * 
     */
    public Output<String> getSecurityGroupId() {
        return this.securityGroupId;
    }
    @Export(name="status", type=EndpointStatus.class, parameters={})
    private Output<EndpointStatus> status;

    public Output<EndpointStatus> getStatus() {
        return this.status;
    }
    /**
     * The ID of the subnet in the selected VPC. The subnet must belong to the Outpost.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet in the selected VPC. The subnet must belong to the Outpost.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3outposts:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3outposts:Endpoint", name, null, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, options);
    }
}
