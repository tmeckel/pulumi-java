// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iap_v1.BrandArgs;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Constructs a new OAuth brand for the project if one does not exist. The created brand is "internal only", meaning that OAuth clients created under it only accept requests from users who belong to the same Google Workspace organization as the project. The brand is created in an un-reviewed status. NOTE: The "internal only" status can be manually changed in the Google Cloud Console. Requires that a brand does not already exist for the project, and that the specified support email is owned by the caller.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:iap/v1:Brand")
public class Brand extends io.pulumi.resources.CustomResource {
    /**
     * Application name displayed on OAuth consent screen.
     * 
     */
    @OutputExport(name="applicationTitle", type=String.class, parameters={})
    private Output<String> applicationTitle;

    /**
     * @return Application name displayed on OAuth consent screen.
     * 
     */
    public Output<String> getApplicationTitle() {
        return this.applicationTitle;
    }
    /**
     * Identifier of the brand. NOTE: GCP project number achieves the same brand identification purpose as only one brand per project can be created.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Identifier of the brand. NOTE: GCP project number achieves the same brand identification purpose as only one brand per project can be created.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Whether the brand is only intended for usage inside the G Suite organization only.
     * 
     */
    @OutputExport(name="orgInternalOnly", type=Boolean.class, parameters={})
    private Output<Boolean> orgInternalOnly;

    /**
     * @return Whether the brand is only intended for usage inside the G Suite organization only.
     * 
     */
    public Output<Boolean> getOrgInternalOnly() {
        return this.orgInternalOnly;
    }
    /**
     * Support email displayed on the OAuth consent screen.
     * 
     */
    @OutputExport(name="supportEmail", type=String.class, parameters={})
    private Output<String> supportEmail;

    /**
     * @return Support email displayed on the OAuth consent screen.
     * 
     */
    public Output<String> getSupportEmail() {
        return this.supportEmail;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Brand(String name, @Nullable BrandArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iap/v1:Brand", name, args == null ? BrandArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Brand(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iap/v1:Brand", name, null, makeResourceOptions(options, id));
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
    public static Brand get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Brand(name, id, options);
    }
}
