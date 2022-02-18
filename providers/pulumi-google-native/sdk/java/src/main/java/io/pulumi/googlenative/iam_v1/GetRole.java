// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iam_v1.inputs.GetRoleArgs;
import io.pulumi.googlenative.iam_v1.outputs.GetRoleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRole {
/**
 * Gets the definition of a Role.
 * 
 */
    public static CompletableFuture<GetRoleResult> invokeAsync(GetRoleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getRole", TypeShape.of(GetRoleResult.class), args == null ? GetRoleArgs.Empty : args, Utilities.withVersion(options));
    }
}
