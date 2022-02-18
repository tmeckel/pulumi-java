// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetNatAddressArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetNatAddressResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNatAddress {
/**
 * Gets the details of a NAT address. **Note:** Not supported for Apigee hybrid.
 * 
 */
    public static CompletableFuture<GetNatAddressResult> invokeAsync(GetNatAddressArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getNatAddress", TypeShape.of(GetNatAddressResult.class), args == null ? GetNatAddressArgs.Empty : args, Utilities.withVersion(options));
    }
}
