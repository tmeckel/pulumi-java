// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflows_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.workflows_v1beta.inputs.GetWorkflowArgs;
import io.pulumi.googlenative.workflows_v1beta.outputs.GetWorkflowResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkflow {
/**
 * Gets details of a single Workflow.
 * 
 */
    public static CompletableFuture<GetWorkflowResult> invokeAsync(GetWorkflowArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:workflows/v1beta:getWorkflow", TypeShape.of(GetWorkflowResult.class), args == null ? GetWorkflowArgs.Empty : args, Utilities.withVersion(options));
    }
}
