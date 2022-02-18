// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.GetAccessPolicyIamPolicyArgs;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.GetAccessPolicyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPolicyIamPolicy {
/**
 * Gets the IAM policy for the specified Access Context Manager access policy.
 * 
 */
    public static CompletableFuture<GetAccessPolicyIamPolicyResult> invokeAsync(GetAccessPolicyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:accesscontextmanager/v1:getAccessPolicyIamPolicy", TypeShape.of(GetAccessPolicyIamPolicyResult.class), args == null ? GetAccessPolicyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
