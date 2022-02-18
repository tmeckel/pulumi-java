// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.servicedirectory_v1beta1.inputs.GetEndpointArgs;
import io.pulumi.googlenative.servicedirectory_v1beta1.outputs.GetEndpointResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEndpoint {
/**
 * Gets an endpoint.
 * 
 */
    public static CompletableFuture<GetEndpointResult> invokeAsync(GetEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicedirectory/v1beta1:getEndpoint", TypeShape.of(GetEndpointResult.class), args == null ? GetEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
