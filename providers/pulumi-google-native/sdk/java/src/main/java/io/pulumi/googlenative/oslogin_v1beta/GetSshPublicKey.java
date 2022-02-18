// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.oslogin_v1beta.inputs.GetSshPublicKeyArgs;
import io.pulumi.googlenative.oslogin_v1beta.outputs.GetSshPublicKeyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSshPublicKey {
/**
 * Retrieves an SSH public key.
 * 
 */
    public static CompletableFuture<GetSshPublicKeyResult> invokeAsync(GetSshPublicKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:oslogin/v1beta:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args == null ? GetSshPublicKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
