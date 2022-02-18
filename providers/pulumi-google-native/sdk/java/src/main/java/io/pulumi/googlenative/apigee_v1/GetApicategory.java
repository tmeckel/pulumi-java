// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetApicategoryArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetApicategoryResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApicategory {
/**
 * Gets a category on the portal.
 * 
 */
    public static CompletableFuture<GetApicategoryResult> invokeAsync(GetApicategoryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getApicategory", TypeShape.of(GetApicategoryResult.class), args == null ? GetApicategoryArgs.Empty : args, Utilities.withVersion(options));
    }
}
