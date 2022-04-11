// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.CapacityProviderArgs;
import io.pulumi.awsnative.ecs.outputs.CapacityProviderAutoScalingGroupProvider;
import io.pulumi.awsnative.ecs.outputs.CapacityProviderTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ECS::CapacityProvider.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ecs:CapacityProvider")
public class CapacityProvider extends io.pulumi.resources.CustomResource {
    @Export(name="autoScalingGroupProvider", type=CapacityProviderAutoScalingGroupProvider.class, parameters={})
    private Output<CapacityProviderAutoScalingGroupProvider> autoScalingGroupProvider;

    public Output<CapacityProviderAutoScalingGroupProvider> getAutoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @Export(name="tags", type=List.class, parameters={CapacityProviderTag.class})
    private Output</* @Nullable */ List<CapacityProviderTag>> tags;

    public Output</* @Nullable */ List<CapacityProviderTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityProvider(String name) {
        this(name, CapacityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityProvider(String name, CapacityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityProvider(String name, CapacityProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:CapacityProvider", name, args == null ? CapacityProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CapacityProvider(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:CapacityProvider", name, null, makeResourceOptions(options, id));
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
    public static CapacityProvider get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CapacityProvider(name, id, options);
    }
}
