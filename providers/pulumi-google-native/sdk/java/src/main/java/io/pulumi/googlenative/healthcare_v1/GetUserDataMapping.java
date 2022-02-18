// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.inputs.GetUserDataMappingArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.GetUserDataMappingResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUserDataMapping {
/**
 * Gets the specified User data mapping.
 * 
 */
    public static CompletableFuture<GetUserDataMappingResult> invokeAsync(GetUserDataMappingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1:getUserDataMapping", TypeShape.of(GetUserDataMappingResult.class), args == null ? GetUserDataMappingArgs.Empty : args, Utilities.withVersion(options));
    }
}
