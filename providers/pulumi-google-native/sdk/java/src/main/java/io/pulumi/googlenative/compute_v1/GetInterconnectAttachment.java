// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetInterconnectAttachmentArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetInterconnectAttachmentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInterconnectAttachment {
/**
 * Returns the specified interconnect attachment.
 * 
 */
    public static CompletableFuture<GetInterconnectAttachmentResult> invokeAsync(GetInterconnectAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getInterconnectAttachment", TypeShape.of(GetInterconnectAttachmentResult.class), args == null ? GetInterconnectAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
