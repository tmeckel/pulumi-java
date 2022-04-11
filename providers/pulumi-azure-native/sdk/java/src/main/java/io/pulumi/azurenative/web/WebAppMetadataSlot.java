// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppMetadataSlotArgs;
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
 * String dictionary resource.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppMetadataSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/metadata 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppMetadataSlot")
public class WebAppMetadataSlot extends io.pulumi.resources.CustomResource {
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
     * Settings.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> properties;

    /**
     * @return Settings.
     * 
     */
    public Output<Map<String,String>> getProperties() {
        return this.properties;
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
    public WebAppMetadataSlot(String name) {
        this(name, WebAppMetadataSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppMetadataSlot(String name, WebAppMetadataSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppMetadataSlot(String name, WebAppMetadataSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppMetadataSlot", name, args == null ? WebAppMetadataSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppMetadataSlot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppMetadataSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppMetadataSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppMetadataSlot").build())
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
    public static WebAppMetadataSlot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppMetadataSlot(name, id, options);
    }
}
