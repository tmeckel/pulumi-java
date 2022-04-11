// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.GroupArgs;
import io.pulumi.azurenative.migrate.outputs.GroupPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A group created in a Migration project.
 * API Version: 2019-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:migrate:Group Group2 /subscriptions/6393a73f-8d55-47ef-b6dd-179b3e0c7910/resourceGroups/abgoyal-westeurope/providers/Microsoft.Migrate/assessmentprojects/abgoyalWEselfhostb72bproject/groups/Group2 
 * ```
 * 
 */
@ResourceType(type="azure-native:migrate:Group")
public class Group extends io.pulumi.resources.CustomResource {
    /**
     * For optimistic concurrency control.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return For optimistic concurrency control.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Name of the group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the group.
     * 
     */
    @Export(name="properties", type=GroupPropertiesResponse.class, parameters={})
    private Output<GroupPropertiesResponse> properties;

    /**
     * @return Properties of the group.
     * 
     */
    public Output<GroupPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects/groups].
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the object = [Microsoft.Migrate/assessmentProjects/groups].
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Group(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:Group", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:migrate/v20191001:Group").build())
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
    public static Group get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, options);
    }
}
