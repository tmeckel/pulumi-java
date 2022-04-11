// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.athena.WorkGroupArgs;
import io.pulumi.awsnative.athena.enums.WorkGroupState;
import io.pulumi.awsnative.athena.outputs.WorkGroupConfiguration;
import io.pulumi.awsnative.athena.outputs.WorkGroupConfigurationUpdates;
import io.pulumi.awsnative.athena.outputs.WorkGroupTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Athena::WorkGroup
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:athena:WorkGroup")
public class WorkGroup extends io.pulumi.resources.CustomResource {
    /**
     * The date and time the workgroup was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The date and time the workgroup was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The workgroup description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The workgroup description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The workGroup name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The workGroup name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    @Export(name="recursiveDeleteOption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> recursiveDeleteOption;

    /**
     * @return The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    public Output</* @Nullable */ Boolean> getRecursiveDeleteOption() {
        return this.recursiveDeleteOption;
    }
    /**
     * The state of the workgroup: ENABLED or DISABLED.
     * 
     */
    @Export(name="state", type=WorkGroupState.class, parameters={})
    private Output</* @Nullable */ WorkGroupState> state;

    /**
     * @return The state of the workgroup: ENABLED or DISABLED.
     * 
     */
    public Output</* @Nullable */ WorkGroupState> getState() {
        return this.state;
    }
    /**
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it
     * 
     */
    @Export(name="tags", type=List.class, parameters={WorkGroupTag.class})
    private Output</* @Nullable */ List<WorkGroupTag>> tags;

    /**
     * @return One or more tags, separated by commas, that you want to attach to the workgroup as you create it
     * 
     */
    public Output</* @Nullable */ List<WorkGroupTag>> getTags() {
        return this.tags;
    }
    /**
     * The workgroup configuration
     * 
     */
    @Export(name="workGroupConfiguration", type=WorkGroupConfiguration.class, parameters={})
    private Output</* @Nullable */ WorkGroupConfiguration> workGroupConfiguration;

    /**
     * @return The workgroup configuration
     * 
     */
    public Output</* @Nullable */ WorkGroupConfiguration> getWorkGroupConfiguration() {
        return this.workGroupConfiguration;
    }
    /**
     * The workgroup configuration update object
     * 
     */
    @Export(name="workGroupConfigurationUpdates", type=WorkGroupConfigurationUpdates.class, parameters={})
    private Output</* @Nullable */ WorkGroupConfigurationUpdates> workGroupConfigurationUpdates;

    /**
     * @return The workgroup configuration update object
     * 
     */
    public Output</* @Nullable */ WorkGroupConfigurationUpdates> getWorkGroupConfigurationUpdates() {
        return this.workGroupConfigurationUpdates;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkGroup(String name) {
        this(name, WorkGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkGroup(String name, @Nullable WorkGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkGroup(String name, @Nullable WorkGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:WorkGroup", name, args == null ? WorkGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:WorkGroup", name, null, makeResourceOptions(options, id));
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
    public static WorkGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkGroup(name, id, options);
    }
}
