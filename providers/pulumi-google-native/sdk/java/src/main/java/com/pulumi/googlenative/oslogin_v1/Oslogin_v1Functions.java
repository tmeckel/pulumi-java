// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.oslogin_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.oslogin_v1.inputs.GetSshPublicKeyArgs;
import com.pulumi.googlenative.oslogin_v1.outputs.GetSshPublicKeyResult;
import java.util.concurrent.CompletableFuture;

public final class Oslogin_v1Functions {
    /**
     * Retrieves an SSH public key.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args) {
        return getSshPublicKey(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an SSH public key.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:oslogin/v1:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args, Utilities.withVersion(options));
    }
}
