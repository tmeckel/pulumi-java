// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GetEntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GetEntityTypeResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntityType {
/**
 * Retrieves the specified entity type.
 * 
 */
    public static CompletableFuture<GetEntityTypeResult> invokeAsync(GetEntityTypeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v2beta1:getEntityType", TypeShape.of(GetEntityTypeResult.class), args == null ? GetEntityTypeArgs.Empty : args, Utilities.withVersion(options));
    }
}
