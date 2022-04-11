// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.DeploymentAtSubscriptionScopeArgs;
import io.pulumi.azurenative.resources.outputs.DeploymentPropertiesExtendedResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Deployment information.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:DeploymentAtSubscriptionScope my-deployment /subscriptions/00000000-0000-0000-0000-000000000001/providers/Microsoft.Resources/deployments/my-deployment 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:DeploymentAtSubscriptionScope")
public class DeploymentAtSubscriptionScope extends io.pulumi.resources.CustomResource {
    /**
     * the location of the deployment.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return the location of the deployment.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the deployment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the deployment.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Deployment properties.
     * 
     */
    @Export(name="properties", type=DeploymentPropertiesExtendedResponse.class, parameters={})
    private Output<DeploymentPropertiesExtendedResponse> properties;

    /**
     * @return Deployment properties.
     * 
     */
    public Output<DeploymentPropertiesExtendedResponse> getProperties() {
        return this.properties;
    }
    /**
     * Deployment tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Deployment tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the deployment.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the deployment.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentAtSubscriptionScope(String name) {
        this(name, DeploymentAtSubscriptionScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentAtSubscriptionScope(String name, DeploymentAtSubscriptionScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentAtSubscriptionScope(String name, DeploymentAtSubscriptionScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtSubscriptionScope", name, args == null ? DeploymentAtSubscriptionScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentAtSubscriptionScope(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtSubscriptionScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20180501:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190301:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190501:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190510:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190701:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190801:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20191001:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200601:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200801:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20201001:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210101:DeploymentAtSubscriptionScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210401:DeploymentAtSubscriptionScope").build())
            ))
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
    public static DeploymentAtSubscriptionScope get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentAtSubscriptionScope(name, id, options);
    }
}
