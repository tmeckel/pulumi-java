// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetRegionDiskIamPolicyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetRegionDiskIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionDiskIamPolicy {
/**
 * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
 * 
 */
    public static CompletableFuture<GetRegionDiskIamPolicyResult> invokeAsync(GetRegionDiskIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getRegionDiskIamPolicy", TypeShape.of(GetRegionDiskIamPolicyResult.class), args == null ? GetRegionDiskIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
