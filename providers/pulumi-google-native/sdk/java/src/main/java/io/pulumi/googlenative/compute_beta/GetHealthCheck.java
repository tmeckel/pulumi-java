// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetHealthCheckArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetHealthCheckResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHealthCheck {
/**
 * Returns the specified HealthCheck resource. Gets a list of available health checks by making a list() request.
 * 
 */
    public static CompletableFuture<GetHealthCheckResult> invokeAsync(GetHealthCheckArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getHealthCheck", TypeShape.of(GetHealthCheckResult.class), args == null ? GetHealthCheckArgs.Empty : args, Utilities.withVersion(options));
    }
}
