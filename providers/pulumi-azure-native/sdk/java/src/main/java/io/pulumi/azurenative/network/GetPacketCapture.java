// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetPacketCaptureArgs;
import io.pulumi.azurenative.network.outputs.GetPacketCaptureResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPacketCapture {
    public static CompletableFuture<GetPacketCaptureResult> invokeAsync(GetPacketCaptureArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getPacketCapture", TypeShape.of(GetPacketCaptureResult.class), args == null ? GetPacketCaptureArgs.Empty : args, Utilities.withVersion(options));
    }
}
