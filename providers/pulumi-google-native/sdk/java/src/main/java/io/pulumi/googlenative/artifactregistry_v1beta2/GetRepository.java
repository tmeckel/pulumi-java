// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.artifactregistry_v1beta2.inputs.GetRepositoryArgs;
import io.pulumi.googlenative.artifactregistry_v1beta2.outputs.GetRepositoryResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRepository {
/**
 * Gets a repository.
 * 
 */
    public static CompletableFuture<GetRepositoryResult> invokeAsync(GetRepositoryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1beta2:getRepository", TypeShape.of(GetRepositoryResult.class), args == null ? GetRepositoryArgs.Empty : args, Utilities.withVersion(options));
    }
}
