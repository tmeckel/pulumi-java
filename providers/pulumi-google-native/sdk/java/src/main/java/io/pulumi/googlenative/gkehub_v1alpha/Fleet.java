// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1alpha.FleetArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a fleet.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:gkehub/v1alpha:Fleet")
public class Fleet extends io.pulumi.resources.CustomResource {
    /**
     * When the Fleet was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return When the Fleet was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * When the Fleet was deleted.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return When the Fleet was deleted.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * Optional. A user-assigned display name of the Fleet. When present, it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `Production Fleet`
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. A user-assigned display name of the Fleet. When present, it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `Production Fleet`
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The name for the fleet. The name must meet the following constraints: + The name of a fleet should be unique within the organization; + It must consist of lower case alphanumeric characters or `-`; + The length of the name must be less than or equal to 63; + Unicode names must be expressed in Punycode format (rfc3492). Examples: + prod-fleet + xn--wlq33vhyw9jb （Punycode form for "生产环境")
     * 
     */
    @Export(name="fleetName", type=String.class, parameters={})
    private Output<String> fleetName;

    /**
     * @return The name for the fleet. The name must meet the following constraints: + The name of a fleet should be unique within the organization; + It must consist of lower case alphanumeric characters or `-`; + The length of the name must be less than or equal to 63; + Unicode names must be expressed in Punycode format (rfc3492). Examples: + prod-fleet + xn--wlq33vhyw9jb （Punycode form for "生产环境")
     * 
     */
    public Output<String> getFleetName() {
        return this.fleetName;
    }
    /**
     * The full, unique resource name of this fleet in the format of `projects/{project}/locations/{location}/fleets/{fleet}`. Each GCP project can have at most one fleet resource, named "default".
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The full, unique resource name of this fleet in the format of `projects/{project}/locations/{location}/fleets/{fleet}`. Each GCP project can have at most one fleet resource, named "default".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Google-generated UUID for this resource. This is unique across all Fleet resources. If a Fleet resource is deleted and another resource with the same name is created, it gets a different uid.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Google-generated UUID for this resource. This is unique across all Fleet resources. If a Fleet resource is deleted and another resource with the same name is created, it gets a different uid.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * When the Fleet was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return When the Fleet was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Fleet(String name) {
        this(name, FleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Fleet(String name, @Nullable FleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Fleet(String name, @Nullable FleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1alpha:Fleet", name, args == null ? FleetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Fleet(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1alpha:Fleet", name, null, makeResourceOptions(options, id));
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
    public static Fleet get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Fleet(name, id, options);
    }
}
