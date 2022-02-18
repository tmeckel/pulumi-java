// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.inputs.GetDatasetConsentStoreIamPolicyArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.GetDatasetConsentStoreIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatasetConsentStoreIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetDatasetConsentStoreIamPolicyResult> invokeAsync(GetDatasetConsentStoreIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:healthcare/v1:getDatasetConsentStoreIamPolicy", TypeShape.of(GetDatasetConsentStoreIamPolicyResult.class), args == null ? GetDatasetConsentStoreIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
