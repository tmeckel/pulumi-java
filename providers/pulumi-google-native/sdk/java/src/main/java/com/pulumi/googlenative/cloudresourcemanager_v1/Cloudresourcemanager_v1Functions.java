// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudresourcemanager_v1.inputs.GetLienArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1.inputs.GetOrganizationIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1.inputs.GetProjectArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1.inputs.GetProjectIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1.outputs.GetLienResult;
import com.pulumi.googlenative.cloudresourcemanager_v1.outputs.GetOrganizationIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v1.outputs.GetProjectIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v1.outputs.GetProjectResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudresourcemanager_v1Functions {
    /**
     * Retrieve a Lien by `name`. Callers of this method will require permission on the `parent` resource. For example, a Lien with a `parent` of `projects/1234` requires permission `resourcemanager.projects.get`
     * 
     */
    public static CompletableFuture<GetLienResult> getLien(GetLienArgs args) {
        return getLien(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve a Lien by `name`. Callers of this method will require permission on the `parent` resource. For example, a Lien with a `parent` of `projects/1234` requires permission `resourcemanager.projects.get`
     * 
     */
    public static CompletableFuture<GetLienResult> getLien(GetLienArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1:getLien", TypeShape.of(GetLienResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for an Organization resource. May be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, e.g. &#34;organizations/123&#34;. Authorization requires the Google IAM permission `resourcemanager.organizations.getIamPolicy` on the specified organization
     * 
     */
    public static CompletableFuture<GetOrganizationIamPolicyResult> getOrganizationIamPolicy(GetOrganizationIamPolicyArgs args) {
        return getOrganizationIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for an Organization resource. May be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, e.g. &#34;organizations/123&#34;. Authorization requires the Google IAM permission `resourcemanager.organizations.getIamPolicy` on the specified organization
     * 
     */
    public static CompletableFuture<GetOrganizationIamPolicyResult> getOrganizationIamPolicy(GetOrganizationIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1:getOrganizationIamPolicy", TypeShape.of(GetOrganizationIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject() {
        return getProject(GetProjectArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. Authorization requires the Google IAM permission `resourcemanager.projects.getIamPolicy` on the project. For additional information about `resource` (e.g. my-project-id) structure and identification, see [Resource Names](https://cloud.google.com/apis/design/resource_names).
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> getProjectIamPolicy(GetProjectIamPolicyArgs args) {
        return getProjectIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. Authorization requires the Google IAM permission `resourcemanager.projects.getIamPolicy` on the project. For additional information about `resource` (e.g. my-project-id) structure and identification, see [Resource Names](https://cloud.google.com/apis/design/resource_names).
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> getProjectIamPolicy(GetProjectIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1:getProjectIamPolicy", TypeShape.of(GetProjectIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
