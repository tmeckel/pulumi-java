// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetSecurityPolicyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetSecurityPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecurityPolicy {
/**
 * List all of the ordered rules present in a single specified policy.
 * 
 */
    public static CompletableFuture<GetSecurityPolicyResult> invokeAsync(GetSecurityPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getSecurityPolicy", TypeShape.of(GetSecurityPolicyResult.class), args == null ? GetSecurityPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
