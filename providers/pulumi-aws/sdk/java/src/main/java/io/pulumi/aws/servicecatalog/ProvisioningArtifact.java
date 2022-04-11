// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.ProvisioningArtifactArgs;
import io.pulumi.aws.servicecatalog.inputs.ProvisioningArtifactState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Provisioning Artifact for a specified product.
 * 
 * > A "provisioning artifact" is also referred to as a "version."
 * 
 * > **NOTE:** You cannot create a provisioning artifact for a product that was shared with you.
 * 
 * > **NOTE:** The user or role that use this resource must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_servicecatalog_provisioning_artifact` can be imported using the provisioning artifact ID and product ID separated by a colon, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/provisioningArtifact:ProvisioningArtifact example pa-ij2b6lusy6dec:prod-el3an0rma3
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/provisioningArtifact:ProvisioningArtifact")
public class ProvisioningArtifact extends io.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
     * 
     */
    @Export(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
     * 
     */
    public Output</* @Nullable */ String> getAcceptLanguage() {
        return this.acceptLanguage;
    }
    /**
     * Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getActive() {
        return this.active;
    }
    /**
     * Time when the provisioning artifact was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Time when the provisioning artifact was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
     */
    @Export(name="disableTemplateValidation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableTemplateValidation;

    /**
     * @return Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableTemplateValidation() {
        return this.disableTemplateValidation;
    }
    /**
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
     * 
     */
    @Export(name="guidance", type=String.class, parameters={})
    private Output</* @Nullable */ String> guidance;

    /**
     * @return Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
     * 
     */
    public Output</* @Nullable */ String> getGuidance() {
        return this.guidance;
    }
    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Identifier of the product.
     * 
     */
    @Export(name="productId", type=String.class, parameters={})
    private Output<String> productId;

    /**
     * @return Identifier of the product.
     * 
     */
    public Output<String> getProductId() {
        return this.productId;
    }
    /**
     * Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
     */
    @Export(name="templatePhysicalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templatePhysicalId;

    /**
     * @return Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
     */
    public Output</* @Nullable */ String> getTemplatePhysicalId() {
        return this.templatePhysicalId;
    }
    /**
     * Template source as URL of the CloudFormation template in Amazon S3.
     * 
     */
    @Export(name="templateUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateUrl;

    /**
     * @return Template source as URL of the CloudFormation template in Amazon S3.
     * 
     */
    public Output</* @Nullable */ String> getTemplateUrl() {
        return this.templateUrl;
    }
    /**
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProvisioningArtifact(String name) {
        this(name, ProvisioningArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProvisioningArtifact(String name, ProvisioningArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProvisioningArtifact(String name, ProvisioningArtifactArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/provisioningArtifact:ProvisioningArtifact", name, args == null ? ProvisioningArtifactArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProvisioningArtifact(String name, Output<String> id, @Nullable ProvisioningArtifactState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/provisioningArtifact:ProvisioningArtifact", name, state, makeResourceOptions(options, id));
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
    public static ProvisioningArtifact get(String name, Output<String> id, @Nullable ProvisioningArtifactState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProvisioningArtifact(name, id, state, options);
    }
}
