// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storage_v1.inputs.GetDefaultObjectAccessControlArgs;
import io.pulumi.googlenative.storage_v1.outputs.GetDefaultObjectAccessControlResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDefaultObjectAccessControl {
/**
 * Returns the default object ACL entry for the specified entity on the specified bucket.
 * 
 */
    public static CompletableFuture<GetDefaultObjectAccessControlResult> invokeAsync(GetDefaultObjectAccessControlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getDefaultObjectAccessControl", TypeShape.of(GetDefaultObjectAccessControlResult.class), args == null ? GetDefaultObjectAccessControlArgs.Empty : args, Utilities.withVersion(options));
    }
}
