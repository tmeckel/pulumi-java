// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.appengine_v1beta.inputs.GetDomainMappingArgs;
import io.pulumi.googlenative.appengine_v1beta.outputs.GetDomainMappingResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDomainMapping {
/**
 * Gets the specified domain mapping.
 * 
 */
    public static CompletableFuture<GetDomainMappingResult> invokeAsync(GetDomainMappingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1beta:getDomainMapping", TypeShape.of(GetDomainMappingResult.class), args == null ? GetDomainMappingArgs.Empty : args, Utilities.withVersion(options));
    }
}
