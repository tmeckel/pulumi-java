// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2.inputs.GetConversationArgs;
import io.pulumi.googlenative.dialogflow_v2.outputs.GetConversationResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConversation {
/**
 * Retrieves the specific conversation.
 * 
 */
    public static CompletableFuture<GetConversationResult> invokeAsync(GetConversationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v2:getConversation", TypeShape.of(GetConversationResult.class), args == null ? GetConversationArgs.Empty : args, Utilities.withVersion(options));
    }
}
