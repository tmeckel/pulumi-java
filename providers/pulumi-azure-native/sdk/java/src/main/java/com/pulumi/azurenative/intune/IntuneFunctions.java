// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.intune;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.intune.inputs.GetAndroidMAMPolicyByNameArgs;
import com.pulumi.azurenative.intune.inputs.GetIoMAMPolicyByNameArgs;
import com.pulumi.azurenative.intune.outputs.GetAndroidMAMPolicyByNameResult;
import com.pulumi.azurenative.intune.outputs.GetIoMAMPolicyByNameResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IntuneFunctions {
    /**
     * Android Policy entity for Intune MAM.
     * API Version: 2015-01-14-preview.
     * 
     */
    public static CompletableFuture<GetAndroidMAMPolicyByNameResult> getAndroidMAMPolicyByName(GetAndroidMAMPolicyByNameArgs args) {
        return getAndroidMAMPolicyByName(args, InvokeOptions.Empty);
    }
    /**
     * Android Policy entity for Intune MAM.
     * API Version: 2015-01-14-preview.
     * 
     */
    public static CompletableFuture<GetAndroidMAMPolicyByNameResult> getAndroidMAMPolicyByName(GetAndroidMAMPolicyByNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:intune:getAndroidMAMPolicyByName", TypeShape.of(GetAndroidMAMPolicyByNameResult.class), args, Utilities.withVersion(options));
    }
    /**
     * iOS Policy entity for Intune MAM.
     * API Version: 2015-01-14-preview.
     * 
     */
    public static CompletableFuture<GetIoMAMPolicyByNameResult> getIoMAMPolicyByName(GetIoMAMPolicyByNameArgs args) {
        return getIoMAMPolicyByName(args, InvokeOptions.Empty);
    }
    /**
     * iOS Policy entity for Intune MAM.
     * API Version: 2015-01-14-preview.
     * 
     */
    public static CompletableFuture<GetIoMAMPolicyByNameResult> getIoMAMPolicyByName(GetIoMAMPolicyByNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:intune:getIoMAMPolicyByName", TypeShape.of(GetIoMAMPolicyByNameResult.class), args, Utilities.withVersion(options));
    }
}
