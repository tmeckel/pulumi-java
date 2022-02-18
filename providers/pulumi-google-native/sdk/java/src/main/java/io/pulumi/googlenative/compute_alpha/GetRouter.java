// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetRouterArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetRouterResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRouter {
/**
 * Returns the specified Router resource. Gets a list of available routers by making a list() request.
 * 
 */
    public static CompletableFuture<GetRouterResult> invokeAsync(GetRouterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getRouter", TypeShape.of(GetRouterResult.class), args == null ? GetRouterArgs.Empty : args, Utilities.withVersion(options));
    }
}
