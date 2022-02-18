// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storagetransfer_v1.inputs.GetTransferJobArgs;
import io.pulumi.googlenative.storagetransfer_v1.outputs.GetTransferJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTransferJob {
/**
 * Gets a transfer job.
 * 
 */
    public static CompletableFuture<GetTransferJobResult> invokeAsync(GetTransferJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storagetransfer/v1:getTransferJob", TypeShape.of(GetTransferJobResult.class), args == null ? GetTransferJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
