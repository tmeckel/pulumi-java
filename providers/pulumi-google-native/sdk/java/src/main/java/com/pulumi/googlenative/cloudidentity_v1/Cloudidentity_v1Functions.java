// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudidentity_v1.inputs.GetDeviceArgs;
import com.pulumi.googlenative.cloudidentity_v1.inputs.GetGroupArgs;
import com.pulumi.googlenative.cloudidentity_v1.inputs.GetMembershipArgs;
import com.pulumi.googlenative.cloudidentity_v1.outputs.GetDeviceResult;
import com.pulumi.googlenative.cloudidentity_v1.outputs.GetGroupResult;
import com.pulumi.googlenative.cloudidentity_v1.outputs.GetMembershipResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudidentity_v1Functions {
    /**
     * Retrieves the specified device.
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args) {
        return getDevice(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified device.
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudidentity/v1:getDevice", TypeShape.of(GetDeviceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a `Group`.
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a `Group`.
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudidentity/v1:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a `Membership`.
     * 
     */
    public static CompletableFuture<GetMembershipResult> getMembership(GetMembershipArgs args) {
        return getMembership(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a `Membership`.
     * 
     */
    public static CompletableFuture<GetMembershipResult> getMembership(GetMembershipArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudidentity/v1:getMembership", TypeShape.of(GetMembershipResult.class), args, Utilities.withVersion(options));
    }
}
