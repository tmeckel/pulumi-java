// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta1a;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.pubsub_v1beta1a.inputs.GetSubscriptionArgs;
import io.pulumi.googlenative.pubsub_v1beta1a.outputs.GetSubscriptionResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubscription {
/**
 * Gets the configuration details of a subscription.
 * 
 */
    public static CompletableFuture<GetSubscriptionResult> invokeAsync(GetSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta1a:getSubscription", TypeShape.of(GetSubscriptionResult.class), args == null ? GetSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
