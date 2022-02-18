// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetImageArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetImageResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImage {
/**
 * Returns the specified image. Gets a list of available images by making a list() request.
 * 
 */
    public static CompletableFuture<GetImageResult> invokeAsync(GetImageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getImage", TypeShape.of(GetImageResult.class), args == null ? GetImageArgs.Empty : args, Utilities.withVersion(options));
    }
}
