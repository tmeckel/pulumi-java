// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.jobs_v4.inputs.GetTenantArgs;
import io.pulumi.googlenative.jobs_v4.outputs.GetTenantResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTenant {
/**
 * Retrieves specified tenant.
 * 
 */
    public static CompletableFuture<GetTenantResult> invokeAsync(GetTenantArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:jobs/v4:getTenant", TypeShape.of(GetTenantResult.class), args == null ? GetTenantArgs.Empty : args, Utilities.withVersion(options));
    }
}
