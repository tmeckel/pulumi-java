// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.GetNodeArgs;
import io.pulumi.googlenative.tpu_v2alpha1.outputs.GetNodeResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNode {
/**
 * Gets the details of a node.
 * 
 */
    public static CompletableFuture<GetNodeResult> invokeAsync(GetNodeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:tpu/v2alpha1:getNode", TypeShape.of(GetNodeResult.class), args == null ? GetNodeArgs.Empty : args, Utilities.withVersion(options));
    }
}
