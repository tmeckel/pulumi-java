// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1beta1.inputs.GetTagTemplateArgs;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GetTagTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTagTemplate {
/**
 * Gets a tag template.
 * 
 */
    public static CompletableFuture<GetTagTemplateResult> invokeAsync(GetTagTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datacatalog/v1beta1:getTagTemplate", TypeShape.of(GetTagTemplateResult.class), args == null ? GetTagTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
