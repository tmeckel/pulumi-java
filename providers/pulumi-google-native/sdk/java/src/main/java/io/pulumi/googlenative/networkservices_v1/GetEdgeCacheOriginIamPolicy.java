// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkservices_v1.inputs.GetEdgeCacheOriginIamPolicyArgs;
import io.pulumi.googlenative.networkservices_v1.outputs.GetEdgeCacheOriginIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEdgeCacheOriginIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetEdgeCacheOriginIamPolicyResult> invokeAsync(GetEdgeCacheOriginIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1:getEdgeCacheOriginIamPolicy", TypeShape.of(GetEdgeCacheOriginIamPolicyResult.class), args == null ? GetEdgeCacheOriginIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
