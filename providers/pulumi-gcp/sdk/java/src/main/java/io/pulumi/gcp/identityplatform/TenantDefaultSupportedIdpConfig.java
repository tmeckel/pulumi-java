// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.identityplatform.TenantDefaultSupportedIdpConfigArgs;
import io.pulumi.gcp.identityplatform.inputs.TenantDefaultSupportedIdpConfigState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Configurations options for the tenant for authenticating with a the standard set of Identity Toolkit-trusted IDPs.
 * 
 * You must enable the
 * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
 * the marketplace prior to using this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TenantDefaultSupportedIdpConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantDefaultSupportedIdpConfig:TenantDefaultSupportedIdpConfig default projects/{{project}}/tenants/{{tenant}}/defaultSupportedIdpConfigs/{{idp_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantDefaultSupportedIdpConfig:TenantDefaultSupportedIdpConfig default {{project}}/{{tenant}}/{{idp_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantDefaultSupportedIdpConfig:TenantDefaultSupportedIdpConfig default {{tenant}}/{{idp_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:identityplatform/tenantDefaultSupportedIdpConfig:TenantDefaultSupportedIdpConfig")
public class TenantDefaultSupportedIdpConfig extends io.pulumi.resources.CustomResource {
    /**
     * OAuth client ID
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return OAuth client ID
     * 
     */
    public Output<String> getClientId() {
        return this.clientId;
    }
    /**
     * OAuth client secret
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return OAuth client secret
     * 
     */
    public Output<String> getClientSecret() {
        return this.clientSecret;
    }
    /**
     * If this IDP allows the user to sign in
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If this IDP allows the user to sign in
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * ID of the IDP. Possible values include:
     * * `apple.com`
     * * `facebook.com`
     * * `gc.apple.com`
     * * `github.com`
     * * `google.com`
     * * `linkedin.com`
     * * `microsoft.com`
     * * `playgames.google.com`
     * * `twitter.com`
     * * `yahoo.com`
     * 
     */
    @Export(name="idpId", type=String.class, parameters={})
    private Output<String> idpId;

    /**
     * @return ID of the IDP. Possible values include:
     * * `apple.com`
     * * `facebook.com`
     * * `gc.apple.com`
     * * `github.com`
     * * `google.com`
     * * `linkedin.com`
     * * `microsoft.com`
     * * `playgames.google.com`
     * * `twitter.com`
     * * `yahoo.com`
     * 
     */
    public Output<String> getIdpId() {
        return this.idpId;
    }
    /**
     * The name of the default supported IDP config resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the default supported IDP config resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The name of the tenant where this DefaultSupportedIdpConfig resource exists
     * 
     */
    @Export(name="tenant", type=String.class, parameters={})
    private Output<String> tenant;

    /**
     * @return The name of the tenant where this DefaultSupportedIdpConfig resource exists
     * 
     */
    public Output<String> getTenant() {
        return this.tenant;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TenantDefaultSupportedIdpConfig(String name) {
        this(name, TenantDefaultSupportedIdpConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TenantDefaultSupportedIdpConfig(String name, TenantDefaultSupportedIdpConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TenantDefaultSupportedIdpConfig(String name, TenantDefaultSupportedIdpConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantDefaultSupportedIdpConfig:TenantDefaultSupportedIdpConfig", name, args == null ? TenantDefaultSupportedIdpConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TenantDefaultSupportedIdpConfig(String name, Output<String> id, @Nullable TenantDefaultSupportedIdpConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantDefaultSupportedIdpConfig:TenantDefaultSupportedIdpConfig", name, state, makeResourceOptions(options, id));
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
    public static TenantDefaultSupportedIdpConfig get(String name, Output<String> id, @Nullable TenantDefaultSupportedIdpConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TenantDefaultSupportedIdpConfig(name, id, state, options);
    }
}
