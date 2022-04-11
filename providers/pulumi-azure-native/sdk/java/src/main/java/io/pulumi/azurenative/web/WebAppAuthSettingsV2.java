// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppAuthSettingsV2Args;
import io.pulumi.azurenative.web.outputs.AuthPlatformResponse;
import io.pulumi.azurenative.web.outputs.GlobalValidationResponse;
import io.pulumi.azurenative.web.outputs.HttpSettingsResponse;
import io.pulumi.azurenative.web.outputs.IdentityProvidersResponse;
import io.pulumi.azurenative.web.outputs.LoginResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Configuration settings for the Azure App Service Authentication / Authorization V2 feature.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppAuthSettingsV2 myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/authsettingsV2 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppAuthSettingsV2")
public class WebAppAuthSettingsV2 extends io.pulumi.resources.CustomResource {
    /**
     * The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
     * 
     */
    @Export(name="globalValidation", type=GlobalValidationResponse.class, parameters={})
    private Output</* @Nullable */ GlobalValidationResponse> globalValidation;

    /**
     * @return The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
     * 
     */
    public Output</* @Nullable */ GlobalValidationResponse> getGlobalValidation() {
        return this.globalValidation;
    }
    /**
     * The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
     * 
     */
    @Export(name="httpSettings", type=HttpSettingsResponse.class, parameters={})
    private Output</* @Nullable */ HttpSettingsResponse> httpSettings;

    /**
     * @return The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
     * 
     */
    public Output</* @Nullable */ HttpSettingsResponse> getHttpSettings() {
        return this.httpSettings;
    }
    /**
     * The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
     * 
     */
    @Export(name="identityProviders", type=IdentityProvidersResponse.class, parameters={})
    private Output</* @Nullable */ IdentityProvidersResponse> identityProviders;

    /**
     * @return The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
     * 
     */
    public Output</* @Nullable */ IdentityProvidersResponse> getIdentityProviders() {
        return this.identityProviders;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The configuration settings of the login flow of users using App Service Authentication/Authorization.
     * 
     */
    @Export(name="login", type=LoginResponse.class, parameters={})
    private Output</* @Nullable */ LoginResponse> login;

    /**
     * @return The configuration settings of the login flow of users using App Service Authentication/Authorization.
     * 
     */
    public Output</* @Nullable */ LoginResponse> getLogin() {
        return this.login;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The configuration settings of the platform of App Service Authentication/Authorization.
     * 
     */
    @Export(name="platform", type=AuthPlatformResponse.class, parameters={})
    private Output</* @Nullable */ AuthPlatformResponse> platform;

    /**
     * @return The configuration settings of the platform of App Service Authentication/Authorization.
     * 
     */
    public Output</* @Nullable */ AuthPlatformResponse> getPlatform() {
        return this.platform;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppAuthSettingsV2(String name) {
        this(name, WebAppAuthSettingsV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppAuthSettingsV2(String name, WebAppAuthSettingsV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppAuthSettingsV2(String name, WebAppAuthSettingsV2Args args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettingsV2", name, args == null ? WebAppAuthSettingsV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppAuthSettingsV2(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettingsV2", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppAuthSettingsV2").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppAuthSettingsV2").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppAuthSettingsV2").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppAuthSettingsV2").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppAuthSettingsV2").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppAuthSettingsV2").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppAuthSettingsV2").build())
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
    public static WebAppAuthSettingsV2 get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppAuthSettingsV2(name, id, options);
    }
}
