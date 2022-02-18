// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.orgpolicy_v2.inputs.GetOrganizationPolicyArgs;
import io.pulumi.googlenative.orgpolicy_v2.outputs.GetOrganizationPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationPolicy {
/**
 * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
 * 
 */
    public static CompletableFuture<GetOrganizationPolicyResult> invokeAsync(GetOrganizationPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:orgpolicy/v2:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args == null ? GetOrganizationPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
