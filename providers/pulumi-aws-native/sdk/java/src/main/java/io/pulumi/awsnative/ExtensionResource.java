// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.ExtensionResourceArgs;
import io.pulumi.awsnative.Utilities;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A special resource that enables deploying CloudFormation Extensions (third-party resources). An extension has to be pre-registered in your AWS account in order to use this resource.
 * 
 */
@ResourceType(type="aws-native:index:ExtensionResource")
public class ExtensionResource extends io.pulumi.resources.CustomResource {
    /**
     * Dictionary of the extension resource attributes.
     * 
     */
    @Export(name="outputs", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> outputs;

    /**
     * @return Dictionary of the extension resource attributes.
     * 
     */
    public Output<Map<String,Object>> getOutputs() {
        return this.outputs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExtensionResource(String name) {
        this(name, ExtensionResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExtensionResource(String name, ExtensionResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExtensionResource(String name, ExtensionResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:index:ExtensionResource", name, args == null ? ExtensionResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExtensionResource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:index:ExtensionResource", name, null, makeResourceOptions(options, id));
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
    public static ExtensionResource get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExtensionResource(name, id, options);
    }
}
