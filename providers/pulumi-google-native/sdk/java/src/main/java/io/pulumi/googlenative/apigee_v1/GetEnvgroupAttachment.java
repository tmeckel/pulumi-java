// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetEnvgroupAttachmentArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetEnvgroupAttachmentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEnvgroupAttachment {
/**
 * Gets an environment group attachment.
 * 
 */
    public static CompletableFuture<GetEnvgroupAttachmentResult> invokeAsync(GetEnvgroupAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getEnvgroupAttachment", TypeShape.of(GetEnvgroupAttachmentResult.class), args == null ? GetEnvgroupAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
