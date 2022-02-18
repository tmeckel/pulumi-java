// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.notebooks_v1.inputs.GetScheduleArgs;
import io.pulumi.googlenative.notebooks_v1.outputs.GetScheduleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSchedule {
/**
 * Gets details of schedule
 * 
 */
    public static CompletableFuture<GetScheduleResult> invokeAsync(GetScheduleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getSchedule", TypeShape.of(GetScheduleResult.class), args == null ? GetScheduleArgs.Empty : args, Utilities.withVersion(options));
    }
}
