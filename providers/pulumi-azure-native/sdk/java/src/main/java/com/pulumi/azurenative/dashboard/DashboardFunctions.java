// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dashboard;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dashboard.inputs.GetGrafanaArgs;
import com.pulumi.azurenative.dashboard.outputs.GetGrafanaResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DashboardFunctions {
    /**
     * The grafana resource type.
     * API Version: 2021-09-01-preview.
     * 
     */
    public static CompletableFuture<GetGrafanaResult> getGrafana(GetGrafanaArgs args) {
        return getGrafana(args, InvokeOptions.Empty);
    }
    /**
     * The grafana resource type.
     * API Version: 2021-09-01-preview.
     * 
     */
    public static CompletableFuture<GetGrafanaResult> getGrafana(GetGrafanaArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dashboard:getGrafana", TypeShape.of(GetGrafanaResult.class), args, Utilities.withVersion(options));
    }
}
