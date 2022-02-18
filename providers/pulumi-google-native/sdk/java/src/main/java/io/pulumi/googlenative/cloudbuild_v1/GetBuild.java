// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GetBuildArgs;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GetBuildResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBuild {
/**
 * Returns information about a previously requested build. The `Build` that is returned includes its status (such as `SUCCESS`, `FAILURE`, or `WORKING`), and timing information.
 * 
 */
    public static CompletableFuture<GetBuildResult> invokeAsync(GetBuildArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbuild/v1:getBuild", TypeShape.of(GetBuildResult.class), args == null ? GetBuildArgs.Empty : args, Utilities.withVersion(options));
    }
}
