// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetRegionHealthCheckArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetRegionHealthCheckResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionHealthCheck {
/**
 * Returns the specified HealthCheck resource. Gets a list of available health checks by making a list() request.
 * 
 */
    public static CompletableFuture<GetRegionHealthCheckResult> invokeAsync(GetRegionHealthCheckArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getRegionHealthCheck", TypeShape.of(GetRegionHealthCheckResult.class), args == null ? GetRegionHealthCheckArgs.Empty : args, Utilities.withVersion(options));
    }
}
