// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetPacketMirroringArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetPacketMirroringResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPacketMirroring {
/**
 * Returns the specified PacketMirroring resource.
 * 
 */
    public static CompletableFuture<GetPacketMirroringResult> invokeAsync(GetPacketMirroringArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getPacketMirroring", TypeShape.of(GetPacketMirroringResult.class), args == null ? GetPacketMirroringArgs.Empty : args, Utilities.withVersion(options));
    }
}
