// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.osconfig.GuestPoliciesArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesState;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesAssignment;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesPackage;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepository;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipe;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An OS Config resource representing a guest configuration policy. These policies represent
 * the desired state for VM instance guest environments including packages to install or remove,
 * package repository configurations, and software to install.
 * 
 * To get more information about GuestPolicies, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/osconfig/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/os-config-management)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuestPolicies can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/guestPolicies:GuestPolicies default projects/{{project}}/guestPolicies/{{guest_policy_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/guestPolicies:GuestPolicies default {{project}}/{{guest_policy_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/guestPolicies:GuestPolicies default {{guest_policy_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:osconfig/guestPolicies:GuestPolicies")
public class GuestPolicies extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets
     * or groups of VM instances by different parameters such as labels, names, OS, or zones.
     * If left empty, all VM instances underneath this policy are targeted.
     * At the same level in the resource hierarchy (that is within a project), the service prevents
     * the creation of multiple policies that conflict with each other.
     * For more information, see how the service
     * [handles assignment conflicts](https://cloud.google.com/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * Structure is documented below.
     * 
     */
    @Export(name="assignment", type=GuestPoliciesAssignment.class, parameters={})
    private Output<GuestPoliciesAssignment> assignment;

    /**
     * @return Specifies the VM instances that are assigned to this policy. This allows you to target sets
     * or groups of VM instances by different parameters such as labels, names, OS, or zones.
     * If left empty, all VM instances underneath this policy are targeted.
     * At the same level in the resource hierarchy (that is within a project), the service prevents
     * the creation of multiple policies that conflict with each other.
     * For more information, see how the service
     * [handles assignment conflicts](https://cloud.google.com/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * Structure is documented below.
     * 
     */
    public Output<GuestPoliciesAssignment> getAssignment() {
        return this.assignment;
    }
    /**
     * Time this guest policy was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
     * "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time this guest policy was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
     * "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The etag for this guest policy. If this is provided on update, it must match the server's etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag for this guest policy. If this is provided on update, it must match the server's etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The logical name of the guest policy in the project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @Export(name="guestPolicyId", type=String.class, parameters={})
    private Output<String> guestPolicyId;

    /**
     * @return The logical name of the guest policy in the project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    public Output<String> getGuestPolicyId() {
        return this.guestPolicyId;
    }
    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of package repositories to configure on the VM instance.
     * This is done before any other configs are applied so they can use these repos.
     * Package repositories are only configured if the corresponding package manager(s) are available.
     * Structure is documented below.
     * 
     */
    @Export(name="packageRepositories", type=List.class, parameters={GuestPoliciesPackageRepository.class})
    private Output</* @Nullable */ List<GuestPoliciesPackageRepository>> packageRepositories;

    /**
     * @return A list of package repositories to configure on the VM instance.
     * This is done before any other configs are applied so they can use these repos.
     * Package repositories are only configured if the corresponding package manager(s) are available.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<GuestPoliciesPackageRepository>> getPackageRepositories() {
        return this.packageRepositories;
    }
    /**
     * The software packages to be managed by this policy.
     * Structure is documented below.
     * 
     */
    @Export(name="packages", type=List.class, parameters={GuestPoliciesPackage.class})
    private Output</* @Nullable */ List<GuestPoliciesPackage>> packages;

    /**
     * @return The software packages to be managed by this policy.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<GuestPoliciesPackage>> getPackages() {
        return this.packages;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * A list of Recipes to install on the VM instance.
     * Structure is documented below.
     * 
     */
    @Export(name="recipes", type=List.class, parameters={GuestPoliciesRecipe.class})
    private Output</* @Nullable */ List<GuestPoliciesRecipe>> recipes;

    /**
     * @return A list of Recipes to install on the VM instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<GuestPoliciesRecipe>> getRecipes() {
        return this.recipes;
    }
    /**
     * Last time this guest policy was updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
     * "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Last time this guest policy was updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
     * "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestPolicies(String name) {
        this(name, GuestPoliciesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestPolicies(String name, GuestPoliciesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestPolicies(String name, GuestPoliciesArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/guestPolicies:GuestPolicies", name, args == null ? GuestPoliciesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestPolicies(String name, Output<String> id, @Nullable GuestPoliciesState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/guestPolicies:GuestPolicies", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GuestPolicies get(String name, Output<String> id, @Nullable GuestPoliciesState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GuestPolicies(name, id, state, options);
    }
}
