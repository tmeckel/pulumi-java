// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateAuthorityCertificateRevocationListIamPolicyArgs;
import io.pulumi.googlenative.privateca_v1beta1.outputs.GetCertificateAuthorityCertificateRevocationListIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificateAuthorityCertificateRevocationListIamPolicy {
/**
 * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
 */
    public static CompletableFuture<GetCertificateAuthorityCertificateRevocationListIamPolicyResult> invokeAsync(GetCertificateAuthorityCertificateRevocationListIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1beta1:getCertificateAuthorityCertificateRevocationListIamPolicy", TypeShape.of(GetCertificateAuthorityCertificateRevocationListIamPolicyResult.class), args == null ? GetCertificateAuthorityCertificateRevocationListIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
