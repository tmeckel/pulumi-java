// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetInstantSnapshotArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetInstantSnapshotResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstantSnapshot {
/**
 * Returns the specified InstantSnapshot resource in the specified zone.
 * 
 */
    public static CompletableFuture<GetInstantSnapshotResult> invokeAsync(GetInstantSnapshotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getInstantSnapshot", TypeShape.of(GetInstantSnapshotResult.class), args == null ? GetInstantSnapshotArgs.Empty : args, Utilities.withVersion(options));
    }
}
