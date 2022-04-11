// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.EnvgroupArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new environment group.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Envgroup")
public class Envgroup extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the environment group was created as milliseconds since epoch.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time at which the environment group was created as milliseconds since epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Host names for this environment group.
     * 
     */
    @Export(name="hostnames", type=List.class, parameters={String.class})
    private Output<List<String>> hostnames;

    /**
     * @return Host names for this environment group.
     * 
     */
    public Output<List<String>> getHostnames() {
        return this.hostnames;
    }
    /**
     * The time at which the environment group was last updated as milliseconds since epoch.
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return The time at which the environment group was last updated as milliseconds since epoch.
     * 
     */
    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * ID of the environment group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return ID of the environment group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the environment group. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the environment group. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Envgroup(String name) {
        this(name, EnvgroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Envgroup(String name, EnvgroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Envgroup(String name, EnvgroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Envgroup", name, args == null ? EnvgroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Envgroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Envgroup", name, null, makeResourceOptions(options, id));
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
    public static Envgroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Envgroup(name, id, options);
    }
}
