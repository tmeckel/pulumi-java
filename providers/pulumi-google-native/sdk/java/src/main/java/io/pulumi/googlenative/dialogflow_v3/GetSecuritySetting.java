// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3.inputs.GetSecuritySettingArgs;
import io.pulumi.googlenative.dialogflow_v3.outputs.GetSecuritySettingResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecuritySetting {
/**
 * Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
 * 
 */
    public static CompletableFuture<GetSecuritySettingResult> invokeAsync(GetSecuritySettingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3:getSecuritySetting", TypeShape.of(GetSecuritySettingResult.class), args == null ? GetSecuritySettingArgs.Empty : args, Utilities.withVersion(options));
    }
}
