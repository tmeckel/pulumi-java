// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.billing.BillingRoleAssignmentByDepartmentArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The role assignment
 * API Version: 2019-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:billing:BillingRoleAssignmentByDepartment 9dfd08c2-62a3-4d47-85bd-1cdba1408402 /providers/Microsoft.Billing/billingAccounts/7898901/departments/97603/billingRoleAssignments/9dfd08c2-62a3-4d47-85bd-1cdba1408402 
 * ```
 * 
 */
@ResourceType(type="azure-native:billing:BillingRoleAssignmentByDepartment")
public class BillingRoleAssignmentByDepartment extends io.pulumi.resources.CustomResource {
    /**
     * The principal Id of the user who created the role assignment.
     * 
     */
    @Export(name="createdByPrincipalId", type=String.class, parameters={})
    private Output<String> createdByPrincipalId;

    /**
     * @return The principal Id of the user who created the role assignment.
     * 
     */
    public Output<String> getCreatedByPrincipalId() {
        return this.createdByPrincipalId;
    }
    /**
     * The tenant Id of the user who created the role assignment.
     * 
     */
    @Export(name="createdByPrincipalTenantId", type=String.class, parameters={})
    private Output<String> createdByPrincipalTenantId;

    /**
     * @return The tenant Id of the user who created the role assignment.
     * 
     */
    public Output<String> getCreatedByPrincipalTenantId() {
        return this.createdByPrincipalTenantId;
    }
    /**
     * The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Export(name="createdByUserEmailAddress", type=String.class, parameters={})
    private Output<String> createdByUserEmailAddress;

    /**
     * @return The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output<String> getCreatedByUserEmailAddress() {
        return this.createdByUserEmailAddress;
    }
    /**
     * The date the role assignment was created.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The date the role assignment was created.
     * 
     */
    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalId;

    /**
     * @return The principal id of the user to whom the role was assigned.
     * 
     */
    public Output</* @Nullable */ String> getPrincipalId() {
        return this.principalId;
    }
    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    @Export(name="principalTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalTenantId;

    /**
     * @return The principal tenant id of the user to whom the role was assigned.
     * 
     */
    public Output</* @Nullable */ String> getPrincipalTenantId() {
        return this.principalTenantId;
    }
    /**
     * The ID of the role definition.
     * 
     */
    @Export(name="roleDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleDefinitionId;

    /**
     * @return The ID of the role definition.
     * 
     */
    public Output</* @Nullable */ String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The scope at which the role was assigned.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The scope at which the role was assigned.
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Export(name="userAuthenticationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> userAuthenticationType;

    /**
     * @return The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output</* @Nullable */ String> getUserAuthenticationType() {
        return this.userAuthenticationType;
    }
    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Export(name="userEmailAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> userEmailAddress;

    /**
     * @return The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output</* @Nullable */ String> getUserEmailAddress() {
        return this.userEmailAddress;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingRoleAssignmentByDepartment(String name) {
        this(name, BillingRoleAssignmentByDepartmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingRoleAssignmentByDepartment(String name, BillingRoleAssignmentByDepartmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingRoleAssignmentByDepartment(String name, BillingRoleAssignmentByDepartmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:billing:BillingRoleAssignmentByDepartment", name, args == null ? BillingRoleAssignmentByDepartmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BillingRoleAssignmentByDepartment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:billing:BillingRoleAssignmentByDepartment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:billing/v20191001preview:BillingRoleAssignmentByDepartment").build())
            ))
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
    public static BillingRoleAssignmentByDepartment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BillingRoleAssignmentByDepartment(name, id, options);
    }
}
