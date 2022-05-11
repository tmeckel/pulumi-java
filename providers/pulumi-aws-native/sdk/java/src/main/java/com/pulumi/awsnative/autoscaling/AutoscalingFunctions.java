// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.autoscaling;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.autoscaling.inputs.GetLaunchConfigurationArgs;
import com.pulumi.awsnative.autoscaling.inputs.GetLifecycleHookArgs;
import com.pulumi.awsnative.autoscaling.inputs.GetWarmPoolArgs;
import com.pulumi.awsnative.autoscaling.outputs.GetLaunchConfigurationResult;
import com.pulumi.awsnative.autoscaling.outputs.GetLifecycleHookResult;
import com.pulumi.awsnative.autoscaling.outputs.GetWarmPoolResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AutoscalingFunctions {
    /**
     * The AWS::AutoScaling::LaunchConfiguration resource specifies the launch configuration that can be used by an Auto Scaling group to configure Amazon EC2 instances.
     * 
     */
    public static CompletableFuture<GetLaunchConfigurationResult> getLaunchConfiguration(GetLaunchConfigurationArgs args) {
        return getLaunchConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::AutoScaling::LaunchConfiguration resource specifies the launch configuration that can be used by an Auto Scaling group to configure Amazon EC2 instances.
     * 
     */
    public static CompletableFuture<GetLaunchConfigurationResult> getLaunchConfiguration(GetLaunchConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:autoscaling:getLaunchConfiguration", TypeShape.of(GetLaunchConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::AutoScaling::LifecycleHook
     * 
     */
    public static CompletableFuture<GetLifecycleHookResult> getLifecycleHook(GetLifecycleHookArgs args) {
        return getLifecycleHook(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::AutoScaling::LifecycleHook
     * 
     */
    public static CompletableFuture<GetLifecycleHookResult> getLifecycleHook(GetLifecycleHookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:autoscaling:getLifecycleHook", TypeShape.of(GetLifecycleHookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::AutoScaling::WarmPool.
     * 
     */
    public static CompletableFuture<GetWarmPoolResult> getWarmPool(GetWarmPoolArgs args) {
        return getWarmPool(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::AutoScaling::WarmPool.
     * 
     */
    public static CompletableFuture<GetWarmPoolResult> getWarmPool(GetWarmPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:autoscaling:getWarmPool", TypeShape.of(GetWarmPoolResult.class), args, Utilities.withVersion(options));
    }
}
