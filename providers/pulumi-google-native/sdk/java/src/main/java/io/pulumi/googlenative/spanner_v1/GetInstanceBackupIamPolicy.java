// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.spanner_v1.inputs.GetInstanceBackupIamPolicyArgs;
import io.pulumi.googlenative.spanner_v1.outputs.GetInstanceBackupIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceBackupIamPolicy {
/**
 * Gets the access control policy for a database or backup resource. Returns an empty policy if a database or backup exists but does not have a policy set. Authorization requires `spanner.databases.getIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.getIamPolicy` permission on resource.
 * 
 */
    public static CompletableFuture<GetInstanceBackupIamPolicyResult> invokeAsync(GetInstanceBackupIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:spanner/v1:getInstanceBackupIamPolicy", TypeShape.of(GetInstanceBackupIamPolicyResult.class), args == null ? GetInstanceBackupIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
