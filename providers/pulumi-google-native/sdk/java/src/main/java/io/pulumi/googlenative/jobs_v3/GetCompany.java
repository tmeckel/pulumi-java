// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.jobs_v3.inputs.GetCompanyArgs;
import io.pulumi.googlenative.jobs_v3.outputs.GetCompanyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCompany {
/**
 * Retrieves specified company.
 * 
 */
    public static CompletableFuture<GetCompanyResult> invokeAsync(GetCompanyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:jobs/v3:getCompany", TypeShape.of(GetCompanyResult.class), args == null ? GetCompanyArgs.Empty : args, Utilities.withVersion(options));
    }
}
