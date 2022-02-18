// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.inputs.GetVersionArgs;
import io.pulumi.googlenative.ml_v1.outputs.GetVersionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVersion {
/**
 * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
 * 
 */
    public static CompletableFuture<GetVersionResult> invokeAsync(GetVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getVersion", TypeShape.of(GetVersionResult.class), args == null ? GetVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
