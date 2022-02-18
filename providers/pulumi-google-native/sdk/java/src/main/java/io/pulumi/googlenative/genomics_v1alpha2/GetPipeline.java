// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.GetPipelineArgs;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.GetPipelineResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPipeline {
/**
 * Retrieves a pipeline based on ID. Caller must have READ permission to the project.
 * 
 */
    public static CompletableFuture<GetPipelineResult> invokeAsync(GetPipelineArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:genomics/v1alpha2:getPipeline", TypeShape.of(GetPipelineResult.class), args == null ? GetPipelineArgs.Empty : args, Utilities.withVersion(options));
    }
}
