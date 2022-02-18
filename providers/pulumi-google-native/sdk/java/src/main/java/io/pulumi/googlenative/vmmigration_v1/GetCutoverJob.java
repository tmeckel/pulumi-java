// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1.inputs.GetCutoverJobArgs;
import io.pulumi.googlenative.vmmigration_v1.outputs.GetCutoverJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCutoverJob {
/**
 * Gets details of a single CutoverJob.
 * 
 */
    public static CompletableFuture<GetCutoverJobResult> invokeAsync(GetCutoverJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1:getCutoverJob", TypeShape.of(GetCutoverJobResult.class), args == null ? GetCutoverJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
