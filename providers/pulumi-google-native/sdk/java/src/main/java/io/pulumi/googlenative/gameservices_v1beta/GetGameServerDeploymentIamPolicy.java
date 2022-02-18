// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GetGameServerDeploymentIamPolicyArgs;
import io.pulumi.googlenative.gameservices_v1beta.outputs.GetGameServerDeploymentIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGameServerDeploymentIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetGameServerDeploymentIamPolicyResult> invokeAsync(GetGameServerDeploymentIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gameservices/v1beta:getGameServerDeploymentIamPolicy", TypeShape.of(GetGameServerDeploymentIamPolicyResult.class), args == null ? GetGameServerDeploymentIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
