// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.TagByProductArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Tag Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:TagByProduct tagId1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/tags/tagId1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:TagByProduct")
public class TagByProduct extends io.pulumi.resources.CustomResource {
    /**
     * Tag name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Tag name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagByProduct(String name) {
        this(name, TagByProductArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagByProduct(String name, TagByProductArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagByProduct(String name, TagByProductArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:TagByProduct", name, args == null ? TagByProductArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagByProduct(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:TagByProduct", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:TagByProduct").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:TagByProduct").build())
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
    public static TagByProduct get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagByProduct(name, id, options);
    }
}
