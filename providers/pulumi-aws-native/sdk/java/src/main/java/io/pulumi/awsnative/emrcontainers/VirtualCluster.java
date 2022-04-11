// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.emrcontainers.VirtualClusterArgs;
import io.pulumi.awsnative.emrcontainers.outputs.VirtualClusterContainerProvider;
import io.pulumi.awsnative.emrcontainers.outputs.VirtualClusterTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Schema of AWS::EMRContainers::VirtualCluster Type
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:emrcontainers:VirtualCluster")
public class VirtualCluster extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Container provider of the virtual cluster.
     * 
     */
    @Export(name="containerProvider", type=VirtualClusterContainerProvider.class, parameters={})
    private Output<VirtualClusterContainerProvider> containerProvider;

    /**
     * @return Container provider of the virtual cluster.
     * 
     */
    public Output<VirtualClusterContainerProvider> getContainerProvider() {
        return this.containerProvider;
    }
    /**
     * Name of the virtual cluster.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the virtual cluster.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of key-value pairs to apply to this virtual cluster.
     * 
     */
    @Export(name="tags", type=List.class, parameters={VirtualClusterTag.class})
    private Output</* @Nullable */ List<VirtualClusterTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this virtual cluster.
     * 
     */
    public Output</* @Nullable */ List<VirtualClusterTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualCluster(String name) {
        this(name, VirtualClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualCluster(String name, VirtualClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualCluster(String name, VirtualClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:emrcontainers:VirtualCluster", name, args == null ? VirtualClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualCluster(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:emrcontainers:VirtualCluster", name, null, makeResourceOptions(options, id));
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
    public static VirtualCluster get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualCluster(name, id, options);
    }
}
