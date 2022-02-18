// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebase_v1beta1.inputs.GetWebAppArgs;
import io.pulumi.googlenative.firebase_v1beta1.outputs.GetWebAppResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebApp {
/**
 * Gets the specified WebApp.
 * 
 */
    public static CompletableFuture<GetWebAppResult> invokeAsync(GetWebAppArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebase/v1beta1:getWebApp", TypeShape.of(GetWebAppResult.class), args == null ? GetWebAppArgs.Empty : args, Utilities.withVersion(options));
    }
}
