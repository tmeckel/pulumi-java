// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GetWorkflowTemplateIamPolicyArgs;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.GetWorkflowTemplateIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkflowTemplateIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetWorkflowTemplateIamPolicyResult> invokeAsync(GetWorkflowTemplateIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataproc/v1beta2:getWorkflowTemplateIamPolicy", TypeShape.of(GetWorkflowTemplateIamPolicyResult.class), args == null ? GetWorkflowTemplateIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
