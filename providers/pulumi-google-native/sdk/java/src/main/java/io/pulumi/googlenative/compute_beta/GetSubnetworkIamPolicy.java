// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetSubnetworkIamPolicyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetSubnetworkIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubnetworkIamPolicy {
/**
 * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
 */
    public static CompletableFuture<GetSubnetworkIamPolicyResult> invokeAsync(GetSubnetworkIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getSubnetworkIamPolicy", TypeShape.of(GetSubnetworkIamPolicyResult.class), args == null ? GetSubnetworkIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
