// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.LocationEFSArgs;
import io.pulumi.awsnative.datasync.outputs.LocationEFSEc2Config;
import io.pulumi.awsnative.datasync.outputs.LocationEFSTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::LocationEFS.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:datasync:LocationEFS")
public class LocationEFS extends io.pulumi.resources.CustomResource {
    @Export(name="ec2Config", type=LocationEFSEc2Config.class, parameters={})
    private Output<LocationEFSEc2Config> ec2Config;

    public Output<LocationEFSEc2Config> getEc2Config() {
        return this.ec2Config;
    }
    /**
     * The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * 
     */
    @Export(name="efsFilesystemArn", type=String.class, parameters={})
    private Output<String> efsFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * 
     */
    public Output<String> getEfsFilesystemArn() {
        return this.efsFilesystemArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    @Export(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    public Output<String> getLocationArn() {
        return this.locationArn;
    }
    /**
     * The URL of the EFS location that was described.
     * 
     */
    @Export(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return The URL of the EFS location that was described.
     * 
     */
    public Output<String> getLocationUri() {
        return this.locationUri;
    }
    /**
     * A subdirectory in the location's path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination.
     * 
     */
    @Export(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return A subdirectory in the location's path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination.
     * 
     */
    public Output</* @Nullable */ String> getSubdirectory() {
        return this.subdirectory;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={LocationEFSTag.class})
    private Output</* @Nullable */ List<LocationEFSTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<LocationEFSTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationEFS(String name) {
        this(name, LocationEFSArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationEFS(String name, LocationEFSArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationEFS(String name, LocationEFSArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationEFS", name, args == null ? LocationEFSArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationEFS(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationEFS", name, null, makeResourceOptions(options, id));
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
    public static LocationEFS get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocationEFS(name, id, options);
    }
}
