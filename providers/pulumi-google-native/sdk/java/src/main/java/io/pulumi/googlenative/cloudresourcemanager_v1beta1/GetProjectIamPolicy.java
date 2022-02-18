// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs.GetProjectIamPolicyArgs;
import io.pulumi.googlenative.cloudresourcemanager_v1beta1.outputs.GetProjectIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProjectIamPolicy {
/**
 * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. For additional information about resource structure and identification, see [Resource Names](/apis/design/resource_names).
 * 
 */
    public static CompletableFuture<GetProjectIamPolicyResult> invokeAsync(GetProjectIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1beta1:getProjectIamPolicy", TypeShape.of(GetProjectIamPolicyResult.class), args == null ? GetProjectIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
