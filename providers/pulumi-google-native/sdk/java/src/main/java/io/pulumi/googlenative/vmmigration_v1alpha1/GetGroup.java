// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.GetGroupArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.GetGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGroup {
/**
 * Gets details of a single Group.
 * 
 */
    public static CompletableFuture<GetGroupResult> invokeAsync(GetGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1alpha1:getGroup", TypeShape.of(GetGroupResult.class), args == null ? GetGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
