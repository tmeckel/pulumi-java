// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dns_v1.inputs.GetResourceRecordSetArgs;
import io.pulumi.googlenative.dns_v1.outputs.GetResourceRecordSetResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceRecordSet {
/**
 * Fetches the representation of an existing ResourceRecordSet.
 * 
 */
    public static CompletableFuture<GetResourceRecordSetResult> invokeAsync(GetResourceRecordSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getResourceRecordSet", TypeShape.of(GetResourceRecordSetResult.class), args == null ? GetResourceRecordSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
