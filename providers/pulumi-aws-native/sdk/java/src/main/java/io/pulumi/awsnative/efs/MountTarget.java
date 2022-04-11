// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.efs.MountTargetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EFS::MountTarget
 * 
 */
@ResourceType(type="aws-native:efs:MountTarget")
public class MountTarget extends io.pulumi.resources.CustomResource {
    @Export(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipAddress;

    public Output</* @Nullable */ String> getIpAddress() {
        return this.ipAddress;
    }
    @Export(name="securityGroups", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups;
    }
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MountTarget(String name) {
        this(name, MountTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MountTarget(String name, MountTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MountTarget(String name, MountTargetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:efs:MountTarget", name, args == null ? MountTargetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MountTarget(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:efs:MountTarget", name, null, makeResourceOptions(options, id));
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
    public static MountTarget get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MountTarget(name, id, options);
    }
}
