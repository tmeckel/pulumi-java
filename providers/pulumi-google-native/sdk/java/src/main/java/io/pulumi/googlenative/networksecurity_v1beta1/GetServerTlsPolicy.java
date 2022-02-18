// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.GetServerTlsPolicyArgs;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.GetServerTlsPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerTlsPolicy {
/**
 * Gets details of a single ServerTlsPolicy.
 * 
 */
    public static CompletableFuture<GetServerTlsPolicyResult> invokeAsync(GetServerTlsPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getServerTlsPolicy", TypeShape.of(GetServerTlsPolicyResult.class), args == null ? GetServerTlsPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
