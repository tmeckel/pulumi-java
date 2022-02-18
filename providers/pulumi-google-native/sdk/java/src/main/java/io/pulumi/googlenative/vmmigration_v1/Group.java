// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1.GroupArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Group in a given project and location.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1:Group")
public class Group extends io.pulumi.resources.CustomResource {
    /**
     * The create time timestamp.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time timestamp.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the group.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description of the group.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Display name is a user defined name for this group which can be updated.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name is a user defined name for this group which can be updated.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The Group name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Group name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The update time timestamp.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time timestamp.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Group(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:Group", name, null, makeResourceOptions(options, id));
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
    public static Group get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, options);
    }
}
