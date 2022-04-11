// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.serviceAccount.IAMBindingArgs;
import io.pulumi.gcp.serviceAccount.inputs.IAMBindingState;
import io.pulumi.gcp.serviceAccount.outputs.IAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * When managing IAM roles, you can treat a service account either as a resource or as an identity. This resource is to add iam policy bindings to a service account resource, such as allowing the members to run operations as or modify the service account. To configure permissions for a service account on other GCP resources, use the google_project_iam set of resources.
 * 
 * Three different resources help you manage your IAM policy for a service account. Each of these resources serves a different use case:
 * 
 * * `gcp.serviceAccount.IAMPolicy`: Authoritative. Sets the IAM policy for the service account and replaces any existing policy already attached.
 * * `gcp.serviceAccount.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service account are preserved.
 * * `gcp.serviceAccount.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service account are preserved.
 * 
 * > **Note:** `gcp.serviceAccount.IAMPolicy` **cannot** be used in conjunction with `gcp.serviceAccount.IAMBinding` and `gcp.serviceAccount.IAMMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.serviceAccount.IAMBinding` resources **can be** used in conjunction with `gcp.serviceAccount.IAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_service\_account\_iam\_policy
 * 
 * ## google\_service\_account\_iam\_binding
 * 
 * With IAM Conditions:
 * 
 * ## google\_service\_account\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * Service account IAM resources can be imported using the project, service account email, role, member identity, and condition (beta).
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMBinding:IAMBinding admin-account-iam projects/{your-project-id}/serviceAccounts/{your-service-account-email}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMBinding:IAMBinding admin-account-iam "projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/iam.serviceAccountUser"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMBinding:IAMBinding admin-account-iam "projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/editor user:foo@example.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`. With conditions
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMBinding:IAMBinding admin-account-iam "projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/iam.serviceAccountUser expires_after_2019_12_31"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMBinding:IAMBinding admin-account-iam "projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/iam.serviceAccountUser user:foo@example.com expires_after_2019_12_31"
 * ```
 * 
 */
@ResourceType(type="gcp:serviceAccount/iAMBinding:IAMBinding")
public class IAMBinding extends io.pulumi.resources.CustomResource {
    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Export(name="condition", type=IAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ IAMBindingCondition> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ IAMBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the service account IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the service account IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.serviceAccount.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.serviceAccount.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @Export(name="serviceAccountId", type=String.class, parameters={})
    private Output<String> serviceAccountId;

    /**
     * @return The fully-qualified name of the service account to apply policy to.
     * 
     */
    public Output<String> getServiceAccountId() {
        return this.serviceAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMBinding(String name) {
        this(name, IAMBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMBinding(String name, IAMBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMBinding(String name, IAMBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceAccount/iAMBinding:IAMBinding", name, args == null ? IAMBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMBinding(String name, Output<String> id, @Nullable IAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceAccount/iAMBinding:IAMBinding", name, state, makeResourceOptions(options, id));
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
    public static IAMBinding get(String name, Output<String> id, @Nullable IAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IAMBinding(name, id, state, options);
    }
}
