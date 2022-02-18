// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GetWorkflowTemplateArgs;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.GetWorkflowTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkflowTemplate {
/**
 * Retrieves the latest workflow template.Can retrieve previously instantiated template by specifying optional version parameter.
 * 
 */
    public static CompletableFuture<GetWorkflowTemplateResult> invokeAsync(GetWorkflowTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataproc/v1beta2:getWorkflowTemplate", TypeShape.of(GetWorkflowTemplateResult.class), args == null ? GetWorkflowTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
