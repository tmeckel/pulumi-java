// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.windowsiot;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.windowsiot.inputs.GetServiceArgs;
import com.pulumi.azurenative.windowsiot.outputs.GetServiceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WindowsiotFunctions {
    /**
     * The description of the Windows IoT Device Service.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * The description of the Windows IoT Device Service.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:windowsiot:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
}
