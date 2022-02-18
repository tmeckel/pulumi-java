// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.inputs.GetModelArgs;
import io.pulumi.googlenative.ml_v1.outputs.GetModelResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModel {
/**
 * Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed).
 * 
 */
    public static CompletableFuture<GetModelResult> invokeAsync(GetModelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getModel", TypeShape.of(GetModelResult.class), args == null ? GetModelArgs.Empty : args, Utilities.withVersion(options));
    }
}
