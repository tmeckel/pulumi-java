// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetPeeringArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetPeeringResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPeering {
/**
 * Gets details of a single Peering.
 * 
 */
    public static CompletableFuture<GetPeeringResult> invokeAsync(GetPeeringArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getPeering", TypeShape.of(GetPeeringResult.class), args == null ? GetPeeringArgs.Empty : args, Utilities.withVersion(options));
    }
}
