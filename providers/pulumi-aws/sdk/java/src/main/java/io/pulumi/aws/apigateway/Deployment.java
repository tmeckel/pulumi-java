// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.DeploymentArgs;
import io.pulumi.aws.apigateway.inputs.DeploymentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an API Gateway REST Deployment. A deployment is a snapshot of the REST API configuration. The deployment can then be published to callable endpoints via the `aws.apigateway.Stage` resource and optionally managed further with the `aws.apigateway.BasePathMapping` resource, `aws.apigateway.DomainName` resource, and `aws_api_method_settings` resource. For more information, see the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html).
 * 
 * To properly capture all REST API configuration in a deployment, this resource must have dependencies on all prior resources that manage resources/paths, methods, integrations, etc.
 * 
 * * For REST APIs that are configured via OpenAPI specification (`aws.apigateway.RestApi` resource `body` argument), no special dependency setup is needed beyond referencing the  `id` attribute of that resource unless additional resources have further customized the REST API.
 * * When the REST API configuration involves other resources (`aws.apigateway.Integration` resource), the dependency setup can be done with implicit resource references in the `triggers` argument or explicit resource references using the [resource `dependsOn` custom option](https://www.pulumi.com/docs/intro/concepts/resources/#dependson). The `triggers` argument should be preferred over `depends_on`, since `depends_on` can only capture dependency ordering and will not cause the resource to recreate (redeploy the REST API) with upstream configuration changes.
 * 
 * !> **WARNING:** It is recommended to use the `aws.apigateway.Stage` resource instead of managing an API Gateway Stage via the `stage_name` argument of this resource. When this resource is recreated (REST API redeployment) with the `stage_name` configured, the stage is deleted and recreated. This will cause a temporary service interruption, increase provide plan differences, and can require a second apply to recreate any downstream stage configuration such as associated `aws_api_method_settings` resources.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:apigateway/deployment:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of the deployment
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the deployment
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Description of the deployment
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the deployment
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The execution ARN to be used in `lambda_permission` resource's `source_arn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     * 
     */
    @Export(name="executionArn", type=String.class, parameters={})
    private Output<String> executionArn;

    /**
     * @return The execution ARN to be used in `lambda_permission` resource's `source_arn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     * 
     */
    public Output<String> getExecutionArn() {
        return this.executionArn;
    }
    /**
     * The URL to invoke the API pointing to the stage,
     * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     * 
     */
    @Export(name="invokeUrl", type=String.class, parameters={})
    private Output<String> invokeUrl;

    /**
     * @return The URL to invoke the API pointing to the stage,
     * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     * 
     */
    public Output<String> getInvokeUrl() {
        return this.invokeUrl;
    }
    /**
     * REST API identifier.
     * 
     */
    @Export(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return REST API identifier.
     * 
     */
    public Output<String> getRestApi() {
        return this.restApi;
    }
    /**
     * Description to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Export(name="stageDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> stageDescription;

    /**
     * @return Description to set on the stage managed by the `stage_name` argument.
     * 
     */
    public Output</* @Nullable */ String> getStageDescription() {
        return this.stageDescription;
    }
    /**
     * Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. It is recommended to use the `aws.apigateway.Stage` resource instead to manage stages.
     * 
     */
    @Export(name="stageName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stageName;

    /**
     * @return Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. It is recommended to use the `aws.apigateway.Stage` resource instead to manage stages.
     * 
     */
    public Output</* @Nullable */ String> getStageName() {
        return this.stageName;
    }
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    @Export(name="triggers", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> triggers;

    /**
     * @return Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTriggers() {
        return this.triggers;
    }
    /**
     * Map to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Export(name="variables", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> variables;

    /**
     * @return Map to set on the stage managed by the `stage_name` argument.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getVariables() {
        return this.variables;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
