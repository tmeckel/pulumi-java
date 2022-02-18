// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.domains_v1beta1.inputs.GetRegistrationIamPolicyArgs;
import io.pulumi.googlenative.domains_v1beta1.outputs.GetRegistrationIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistrationIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetRegistrationIamPolicyResult> invokeAsync(GetRegistrationIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:domains/v1beta1:getRegistrationIamPolicy", TypeShape.of(GetRegistrationIamPolicyResult.class), args == null ? GetRegistrationIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
