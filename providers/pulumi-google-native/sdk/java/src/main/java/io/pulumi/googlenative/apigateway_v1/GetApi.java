// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1.inputs.GetApiArgs;
import io.pulumi.googlenative.apigateway_v1.outputs.GetApiResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApi {
/**
 * Gets details of a single Api.
 * 
 */
    public static CompletableFuture<GetApiResult> invokeAsync(GetApiArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getApi", TypeShape.of(GetApiResult.class), args == null ? GetApiArgs.Empty : args, Utilities.withVersion(options));
    }
}
