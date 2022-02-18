// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GetTriggerArgs;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GetTriggerResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTrigger {
/**
 * Returns information about a `BuildTrigger`. This API is experimental.
 * 
 */
    public static CompletableFuture<GetTriggerResult> invokeAsync(GetTriggerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbuild/v1:getTrigger", TypeShape.of(GetTriggerResult.class), args == null ? GetTriggerArgs.Empty : args, Utilities.withVersion(options));
    }
}
