// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.container_v1.inputs.GetClusterArgs;
import com.pulumi.googlenative.container_v1.inputs.GetNodePoolArgs;
import com.pulumi.googlenative.container_v1.outputs.GetClusterResult;
import com.pulumi.googlenative.container_v1.outputs.GetNodePoolResult;
import java.util.concurrent.CompletableFuture;

public final class Container_v1Functions {
    /**
     * Gets the details of a specific cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a specific cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:container/v1:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the requested node pool.
     * 
     */
    public static CompletableFuture<GetNodePoolResult> getNodePool(GetNodePoolArgs args) {
        return getNodePool(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the requested node pool.
     * 
     */
    public static CompletableFuture<GetNodePoolResult> getNodePool(GetNodePoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:container/v1:getNodePool", TypeShape.of(GetNodePoolResult.class), args, Utilities.withVersion(options));
    }
}
