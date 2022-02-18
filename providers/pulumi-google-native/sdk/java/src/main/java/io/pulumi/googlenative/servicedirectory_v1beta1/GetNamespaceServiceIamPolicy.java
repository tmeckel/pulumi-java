// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.servicedirectory_v1beta1.inputs.GetNamespaceServiceIamPolicyArgs;
import io.pulumi.googlenative.servicedirectory_v1beta1.outputs.GetNamespaceServiceIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNamespaceServiceIamPolicy {
/**
 * Gets the IAM Policy for a resource (namespace or service only).
 * 
 */
    public static CompletableFuture<GetNamespaceServiceIamPolicyResult> invokeAsync(GetNamespaceServiceIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicedirectory/v1beta1:getNamespaceServiceIamPolicy", TypeShape.of(GetNamespaceServiceIamPolicyResult.class), args == null ? GetNamespaceServiceIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
