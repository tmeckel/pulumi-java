// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vision_v1.inputs.GetProductArgs;
import io.pulumi.googlenative.vision_v1.outputs.GetProductResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProduct {
/**
 * Gets information associated with a Product. Possible errors: * Returns NOT_FOUND if the Product does not exist.
 * 
 */
    public static CompletableFuture<GetProductResult> invokeAsync(GetProductArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vision/v1:getProduct", TypeShape.of(GetProductResult.class), args == null ? GetProductArgs.Empty : args, Utilities.withVersion(options));
    }
}
