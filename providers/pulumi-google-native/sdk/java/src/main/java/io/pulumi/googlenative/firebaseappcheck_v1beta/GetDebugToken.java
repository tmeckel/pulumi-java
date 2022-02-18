// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseappcheck_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebaseappcheck_v1beta.inputs.GetDebugTokenArgs;
import io.pulumi.googlenative.firebaseappcheck_v1beta.outputs.GetDebugTokenResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDebugToken {
/**
 * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
 * 
 */
    public static CompletableFuture<GetDebugTokenResult> invokeAsync(GetDebugTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebaseappcheck/v1beta:getDebugToken", TypeShape.of(GetDebugTokenResult.class), args == null ? GetDebugTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
