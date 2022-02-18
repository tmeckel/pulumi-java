// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetRegionBackendServiceArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetRegionBackendServiceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionBackendService {
/**
 * Returns the specified regional BackendService resource.
 * 
 */
    public static CompletableFuture<GetRegionBackendServiceResult> invokeAsync(GetRegionBackendServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getRegionBackendService", TypeShape.of(GetRegionBackendServiceResult.class), args == null ? GetRegionBackendServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
