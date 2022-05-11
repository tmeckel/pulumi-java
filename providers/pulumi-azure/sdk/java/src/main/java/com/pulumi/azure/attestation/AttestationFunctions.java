// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.attestation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.attestation.inputs.GetProviderArgs;
import com.pulumi.azure.attestation.outputs.GetProviderResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AttestationFunctions {
    /**
     * Use this data source to access information about an existing Attestation Provider.
     * 
     */
    public static CompletableFuture<GetProviderResult> getProvider(GetProviderArgs args) {
        return getProvider(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Attestation Provider.
     * 
     */
    public static CompletableFuture<GetProviderResult> getProvider(GetProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:attestation/getProvider:getProvider", TypeShape.of(GetProviderResult.class), args, Utilities.withVersion(options));
    }
}
