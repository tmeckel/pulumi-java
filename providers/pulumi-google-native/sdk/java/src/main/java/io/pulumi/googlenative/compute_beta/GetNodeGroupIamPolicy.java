// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetNodeGroupIamPolicyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetNodeGroupIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNodeGroupIamPolicy {
/**
 * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
 */
    public static CompletableFuture<GetNodeGroupIamPolicyResult> invokeAsync(GetNodeGroupIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getNodeGroupIamPolicy", TypeShape.of(GetNodeGroupIamPolicyResult.class), args == null ? GetNodeGroupIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
