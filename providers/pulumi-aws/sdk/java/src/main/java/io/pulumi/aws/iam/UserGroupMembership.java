// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.UserGroupMembershipArgs;
import io.pulumi.aws.iam.inputs.UserGroupMembershipState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource for adding an IAM User to IAM Groups. This
 * resource can be used multiple times with the same user for non-overlapping
 * groups.
 * 
 * To exclusively manage the users in a group, see the
 * `aws.iam.GroupMembership` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM user group membership can be imported using the user name and group names separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:iam/userGroupMembership:UserGroupMembership example1 user1/group1/group2
 * ```
 * 
 */
@ResourceType(type="aws:iam/userGroupMembership:UserGroupMembership")
public class UserGroupMembership extends io.pulumi.resources.CustomResource {
    /**
     * A list of IAM Groups to add the user to
     * 
     */
    @Export(name="groups", type=List.class, parameters={String.class})
    private Output<List<String>> groups;

    /**
     * @return A list of IAM Groups to add the user to
     * 
     */
    public Output<List<String>> getGroups() {
        return this.groups;
    }
    /**
     * The name of the IAM User to add to groups
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The name of the IAM User to add to groups
     * 
     */
    public Output<String> getUser() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroupMembership(String name) {
        this(name, UserGroupMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroupMembership(String name, UserGroupMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroupMembership(String name, UserGroupMembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userGroupMembership:UserGroupMembership", name, args == null ? UserGroupMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroupMembership(String name, Output<String> id, @Nullable UserGroupMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userGroupMembership:UserGroupMembership", name, state, makeResourceOptions(options, id));
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
    public static UserGroupMembership get(String name, Output<String> id, @Nullable UserGroupMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserGroupMembership(name, id, state, options);
    }
}
