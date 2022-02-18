// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.jobs_v4.TenantArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new tenant entity.
 * 
 */
@ResourceType(type="google-native:jobs/v4:Tenant")
public class Tenant extends io.pulumi.resources.CustomResource {
    /**
     * Client side tenant identifier, used to uniquely identify the tenant. The maximum number of allowed characters is 255.
     * 
     */
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    /**
     * @return Client side tenant identifier, used to uniquely identify the tenant. The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> getExternalId() {
        return this.externalId;
    }
    /**
     * Required during tenant update. The resource name for a tenant. This is generated by the service when a tenant is created. The format is "projects/{project_id}/tenants/{tenant_id}", for example, "projects/foo/tenants/bar".
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required during tenant update. The resource name for a tenant. This is generated by the service when a tenant is created. The format is "projects/{project_id}/tenants/{tenant_id}", for example, "projects/foo/tenants/bar".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tenant(String name, TenantArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v4:Tenant", name, args == null ? TenantArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Tenant(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:jobs/v4:Tenant", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Tenant get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Tenant(name, id, options);
    }
}
