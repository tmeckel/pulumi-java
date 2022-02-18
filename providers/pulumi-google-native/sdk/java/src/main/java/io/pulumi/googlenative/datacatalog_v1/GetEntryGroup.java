// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1.inputs.GetEntryGroupArgs;
import io.pulumi.googlenative.datacatalog_v1.outputs.GetEntryGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntryGroup {
/**
 * Gets an entry group.
 * 
 */
    public static CompletableFuture<GetEntryGroupResult> invokeAsync(GetEntryGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datacatalog/v1:getEntryGroup", TypeShape.of(GetEntryGroupResult.class), args == null ? GetEntryGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
