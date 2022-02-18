// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.container_v1.inputs.GetNodePoolArgs;
import io.pulumi.googlenative.container_v1.outputs.GetNodePoolResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNodePool {
/**
 * Retrieves the requested node pool.
 * 
 */
    public static CompletableFuture<GetNodePoolResult> invokeAsync(GetNodePoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:container/v1:getNodePool", TypeShape.of(GetNodePoolResult.class), args == null ? GetNodePoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
