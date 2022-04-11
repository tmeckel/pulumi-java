// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3objectlambda;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3objectlambda.AccessPointArgs;
import io.pulumi.awsnative.s3objectlambda.outputs.AccessPointObjectLambdaConfiguration;
import io.pulumi.awsnative.s3objectlambda.outputs.AccessPointPublicAccessBlockConfiguration;
import io.pulumi.awsnative.s3objectlambda.outputs.PolicyStatusProperties;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::S3ObjectLambda::AccessPoint resource is an Amazon S3ObjectLambda resource type that you can use to add computation to S3 actions
 * 
 */
@ResourceType(type="aws-native:s3objectlambda:AccessPoint")
public class AccessPoint extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The date and time when the Object lambda Access Point was created.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The date and time when the Object lambda Access Point was created.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The name you want to assign to this Object lambda Access Point.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name you want to assign to this Object lambda Access Point.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
     * 
     */
    @Export(name="objectLambdaConfiguration", type=AccessPointObjectLambdaConfiguration.class, parameters={})
    private Output<AccessPointObjectLambdaConfiguration> objectLambdaConfiguration;

    /**
     * @return The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
     * 
     */
    public Output<AccessPointObjectLambdaConfiguration> getObjectLambdaConfiguration() {
        return this.objectLambdaConfiguration;
    }
    @Export(name="policyStatus", type=PolicyStatusProperties.class, parameters={})
    private Output<PolicyStatusProperties> policyStatus;

    public Output<PolicyStatusProperties> getPolicyStatus() {
        return this.policyStatus;
    }
    /**
     * The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status 'The Meaning of Public' in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    @Export(name="publicAccessBlockConfiguration", type=AccessPointPublicAccessBlockConfiguration.class, parameters={})
    private Output<AccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration;

    /**
     * @return The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status 'The Meaning of Public' in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    public Output<AccessPointPublicAccessBlockConfiguration> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessPoint(String name) {
        this(name, AccessPointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessPoint(String name, AccessPointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPoint(String name, AccessPointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3objectlambda:AccessPoint", name, args == null ? AccessPointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessPoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3objectlambda:AccessPoint", name, null, makeResourceOptions(options, id));
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
    public static AccessPoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessPoint(name, id, options);
    }
}
