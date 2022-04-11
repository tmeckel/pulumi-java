// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.SecurityGroupArgs;
import io.pulumi.aws.ec2.inputs.SecurityGroupState;
import io.pulumi.aws.ec2.outputs.SecurityGroupEgress;
import io.pulumi.aws.ec2.outputs.SecurityGroupIngress;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a security group resource.
 * 
 * > **NOTE on Security Groups and Security Group Rules:** This provider currently
 * provides both a standalone Security Group Rule resource (a single `ingress` or
 * `egress` rule), and a Security Group resource with `ingress` and `egress` rules
 * defined in-line. At this time you cannot use a Security Group with in-line rules
 * in conjunction with any Security Group Rule resources. Doing so will cause
 * a conflict of rule settings and will overwrite rules.
 * 
 * > **NOTE:** Referencing Security Groups across VPC peering has certain restrictions. More information is available in the [VPC Peering User Guide](https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-security-groups.html).
 * 
 * > **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), security groups associated with Lambda Functions can take up to 45 minutes to successfully delete.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Security Groups can be imported using the `security group id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/securityGroup:SecurityGroup elb_sg sg-903004f8
 * ```
 * 
 */
@ResourceType(type="aws:ec2/securityGroup:SecurityGroup")
public class SecurityGroup extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the security group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the security group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of this egress rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of this egress rule.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
     * 
     */
    @Export(name="egress", type=List.class, parameters={SecurityGroupEgress.class})
    private Output<List<SecurityGroupEgress>> egress;

    /**
     * @return Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
     * 
     */
    public Output<List<SecurityGroupEgress>> getEgress() {
        return this.egress;
    }
    /**
     * Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
     * 
     */
    @Export(name="ingress", type=List.class, parameters={SecurityGroupIngress.class})
    private Output<List<SecurityGroupIngress>> ingress;

    /**
     * @return Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
     * 
     */
    public Output<List<SecurityGroupIngress>> getIngress() {
        return this.ingress;
    }
    /**
     * Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * Owner ID.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return Owner ID.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    @Export(name="revokeRulesOnDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> revokeRulesOnDelete;

    /**
     * @return Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getRevokeRulesOnDelete() {
        return this.revokeRulesOnDelete;
    }
    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * VPC ID.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VPC ID.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityGroup(String name) {
        this(name, SecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityGroup(String name, @Nullable SecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityGroup(String name, @Nullable SecurityGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/securityGroup:SecurityGroup", name, args == null ? SecurityGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityGroup(String name, Output<String> id, @Nullable SecurityGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/securityGroup:SecurityGroup", name, state, makeResourceOptions(options, id));
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
    public static SecurityGroup get(String name, Output<String> id, @Nullable SecurityGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityGroup(name, id, state, options);
    }
}
