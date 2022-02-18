// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetRegionTargetHttpsProxyArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetRegionTargetHttpsProxyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionTargetHttpsProxy {
/**
 * Returns the specified TargetHttpsProxy resource in the specified region. Gets a list of available target HTTP proxies by making a list() request.
 * 
 */
    public static CompletableFuture<GetRegionTargetHttpsProxyResult> invokeAsync(GetRegionTargetHttpsProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getRegionTargetHttpsProxy", TypeShape.of(GetRegionTargetHttpsProxyResult.class), args == null ? GetRegionTargetHttpsProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}
