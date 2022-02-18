// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vision_v1.inputs.GetReferenceImageArgs;
import io.pulumi.googlenative.vision_v1.outputs.GetReferenceImageResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReferenceImage {
/**
 * Gets information associated with a ReferenceImage. Possible errors: * Returns NOT_FOUND if the specified image does not exist.
 * 
 */
    public static CompletableFuture<GetReferenceImageResult> invokeAsync(GetReferenceImageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vision/v1:getReferenceImage", TypeShape.of(GetReferenceImageResult.class), args == null ? GetReferenceImageArgs.Empty : args, Utilities.withVersion(options));
    }
}
