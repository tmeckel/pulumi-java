// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetVersionArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetVersionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVersion {
/**
 * Retrieves the specified Version.
 * 
 */
    public static CompletableFuture<GetVersionResult> invokeAsync(GetVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getVersion", TypeShape.of(GetVersionResult.class), args == null ? GetVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
