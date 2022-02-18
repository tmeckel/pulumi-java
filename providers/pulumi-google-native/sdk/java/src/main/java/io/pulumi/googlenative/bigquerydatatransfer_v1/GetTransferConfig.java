// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigquerydatatransfer_v1.inputs.GetTransferConfigArgs;
import io.pulumi.googlenative.bigquerydatatransfer_v1.outputs.GetTransferConfigResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTransferConfig {
/**
 * Returns information about a data transfer config.
 * 
 */
    public static CompletableFuture<GetTransferConfigResult> invokeAsync(GetTransferConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigquerydatatransfer/v1:getTransferConfig", TypeShape.of(GetTransferConfigResult.class), args == null ? GetTransferConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
