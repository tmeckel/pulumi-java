// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.GetClientTlsPolicyArgs;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.GetClientTlsPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetClientTlsPolicy {
/**
 * Gets details of a single ClientTlsPolicy.
 * 
 */
    public static CompletableFuture<GetClientTlsPolicyResult> invokeAsync(GetClientTlsPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getClientTlsPolicy", TypeShape.of(GetClientTlsPolicyResult.class), args == null ? GetClientTlsPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
