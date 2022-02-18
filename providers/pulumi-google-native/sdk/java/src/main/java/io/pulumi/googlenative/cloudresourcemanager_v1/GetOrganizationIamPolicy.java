// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v1.inputs.GetOrganizationIamPolicyArgs;
import io.pulumi.googlenative.cloudresourcemanager_v1.outputs.GetOrganizationIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationIamPolicy {
/**
 * Gets the access control policy for an Organization resource. May be empty if no such policy or resource exists. The `resource` field should be the organization's resource name, e.g. "organizations/123". Authorization requires the Google IAM permission `resourcemanager.organizations.getIamPolicy` on the specified organization
 * 
 */
    public static CompletableFuture<GetOrganizationIamPolicyResult> invokeAsync(GetOrganizationIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1:getOrganizationIamPolicy", TypeShape.of(GetOrganizationIamPolicyResult.class), args == null ? GetOrganizationIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
