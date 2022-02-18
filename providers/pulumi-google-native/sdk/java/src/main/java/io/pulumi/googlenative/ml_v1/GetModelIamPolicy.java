// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.inputs.GetModelIamPolicyArgs;
import io.pulumi.googlenative.ml_v1.outputs.GetModelIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModelIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetModelIamPolicyResult> invokeAsync(GetModelIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getModelIamPolicy", TypeShape.of(GetModelIamPolicyResult.class), args == null ? GetModelIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
