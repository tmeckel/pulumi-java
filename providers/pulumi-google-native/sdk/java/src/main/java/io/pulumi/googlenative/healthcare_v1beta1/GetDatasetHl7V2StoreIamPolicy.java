// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.GetDatasetHl7V2StoreIamPolicyArgs;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.GetDatasetHl7V2StoreIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatasetHl7V2StoreIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetDatasetHl7V2StoreIamPolicyResult> invokeAsync(GetDatasetHl7V2StoreIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1beta1:getDatasetHl7V2StoreIamPolicy", TypeShape.of(GetDatasetHl7V2StoreIamPolicyResult.class), args == null ? GetDatasetHl7V2StoreIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
