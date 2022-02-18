// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbilling_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbilling_v1.inputs.GetBillingAccountIamPolicyArgs;
import io.pulumi.googlenative.cloudbilling_v1.outputs.GetBillingAccountIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBillingAccountIamPolicy {
/**
 * Gets the access control policy for a billing account. The caller must have the `billing.accounts.getIamPolicy` permission on the account, which is often given to billing account [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
 * 
 */
    public static CompletableFuture<GetBillingAccountIamPolicyResult> invokeAsync(GetBillingAccountIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbilling/v1:getBillingAccountIamPolicy", TypeShape.of(GetBillingAccountIamPolicyResult.class), args == null ? GetBillingAccountIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
