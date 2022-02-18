// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetBackendBucketArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetBackendBucketResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackendBucket {
/**
 * Returns the specified BackendBucket resource. Gets a list of available backend buckets by making a list() request.
 * 
 */
    public static CompletableFuture<GetBackendBucketResult> invokeAsync(GetBackendBucketArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getBackendBucket", TypeShape.of(GetBackendBucketResult.class), args == null ? GetBackendBucketArgs.Empty : args, Utilities.withVersion(options));
    }
}
