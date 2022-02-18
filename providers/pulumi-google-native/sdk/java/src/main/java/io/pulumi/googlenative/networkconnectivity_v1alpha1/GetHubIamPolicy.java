// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.inputs.GetHubIamPolicyArgs;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.outputs.GetHubIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHubIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetHubIamPolicyResult> invokeAsync(GetHubIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getHubIamPolicy", TypeShape.of(GetHubIamPolicyResult.class), args == null ? GetHubIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
