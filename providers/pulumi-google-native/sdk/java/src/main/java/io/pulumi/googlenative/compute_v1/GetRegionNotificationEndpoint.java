// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetRegionNotificationEndpointArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetRegionNotificationEndpointResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionNotificationEndpoint {
/**
 * Returns the specified NotificationEndpoint resource in the given region.
 * 
 */
    public static CompletableFuture<GetRegionNotificationEndpointResult> invokeAsync(GetRegionNotificationEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getRegionNotificationEndpoint", TypeShape.of(GetRegionNotificationEndpointResult.class), args == null ? GetRegionNotificationEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
