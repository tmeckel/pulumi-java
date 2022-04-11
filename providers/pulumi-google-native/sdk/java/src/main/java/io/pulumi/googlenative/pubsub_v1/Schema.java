// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.pubsub_v1.SchemaArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a schema.
 * 
 */
@ResourceType(type="google-native:pubsub/v1:Schema")
public class Schema extends io.pulumi.resources.CustomResource {
    /**
     * The definition of the schema. This should contain a string representing the full definition of the schema that is a valid schema definition of the type specified in `type`.
     * 
     */
    @Export(name="definition", type=String.class, parameters={})
    private Output<String> definition;

    /**
     * @return The definition of the schema. This should contain a string representing the full definition of the schema that is a valid schema definition of the type specified in `type`.
     * 
     */
    public Output<String> getDefinition() {
        return this.definition;
    }
    /**
     * Name of the schema. Format is `projects/{project}/schemas/{schema}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the schema. Format is `projects/{project}/schemas/{schema}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of the schema definition.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the schema definition.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, @Nullable SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, @Nullable SchemaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schema(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1:Schema", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Schema get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, options);
    }
}
