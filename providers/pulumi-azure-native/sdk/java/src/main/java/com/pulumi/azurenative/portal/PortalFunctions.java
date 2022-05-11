// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.portal.inputs.GetConsoleArgs;
import com.pulumi.azurenative.portal.inputs.GetConsoleWithLocationArgs;
import com.pulumi.azurenative.portal.inputs.GetDashboardArgs;
import com.pulumi.azurenative.portal.inputs.GetTenantConfigurationArgs;
import com.pulumi.azurenative.portal.inputs.GetUserSettingsArgs;
import com.pulumi.azurenative.portal.inputs.GetUserSettingsWithLocationArgs;
import com.pulumi.azurenative.portal.inputs.ListListTenantConfigurationViolationArgs;
import com.pulumi.azurenative.portal.outputs.GetConsoleResult;
import com.pulumi.azurenative.portal.outputs.GetConsoleWithLocationResult;
import com.pulumi.azurenative.portal.outputs.GetDashboardResult;
import com.pulumi.azurenative.portal.outputs.GetTenantConfigurationResult;
import com.pulumi.azurenative.portal.outputs.GetUserSettingsResult;
import com.pulumi.azurenative.portal.outputs.GetUserSettingsWithLocationResult;
import com.pulumi.azurenative.portal.outputs.ListListTenantConfigurationViolationResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class PortalFunctions {
    /**
     * Cloud shell console
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetConsoleResult> getConsole(GetConsoleArgs args) {
        return getConsole(args, InvokeOptions.Empty);
    }
    /**
     * Cloud shell console
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetConsoleResult> getConsole(GetConsoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getConsole", TypeShape.of(GetConsoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Cloud shell console
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetConsoleWithLocationResult> getConsoleWithLocation(GetConsoleWithLocationArgs args) {
        return getConsoleWithLocation(args, InvokeOptions.Empty);
    }
    /**
     * Cloud shell console
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetConsoleWithLocationResult> getConsoleWithLocation(GetConsoleWithLocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getConsoleWithLocation", TypeShape.of(GetConsoleWithLocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The shared dashboard resource definition.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<GetDashboardResult> getDashboard(GetDashboardArgs args) {
        return getDashboard(args, InvokeOptions.Empty);
    }
    /**
     * The shared dashboard resource definition.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<GetDashboardResult> getDashboard(GetDashboardArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getDashboard", TypeShape.of(GetDashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Tenant configuration.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<GetTenantConfigurationResult> getTenantConfiguration(GetTenantConfigurationArgs args) {
        return getTenantConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Tenant configuration.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<GetTenantConfigurationResult> getTenantConfiguration(GetTenantConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getTenantConfiguration", TypeShape.of(GetTenantConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response to get user settings
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetUserSettingsResult> getUserSettings(GetUserSettingsArgs args) {
        return getUserSettings(args, InvokeOptions.Empty);
    }
    /**
     * Response to get user settings
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetUserSettingsResult> getUserSettings(GetUserSettingsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getUserSettings", TypeShape.of(GetUserSettingsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response to get user settings
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetUserSettingsWithLocationResult> getUserSettingsWithLocation(GetUserSettingsWithLocationArgs args) {
        return getUserSettingsWithLocation(args, InvokeOptions.Empty);
    }
    /**
     * Response to get user settings
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetUserSettingsWithLocationResult> getUserSettingsWithLocation(GetUserSettingsWithLocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getUserSettingsWithLocation", TypeShape.of(GetUserSettingsWithLocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * List of list of items that violate tenant&#39;s configuration.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<ListListTenantConfigurationViolationResult> listListTenantConfigurationViolation() {
        return listListTenantConfigurationViolation(ListListTenantConfigurationViolationArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * List of list of items that violate tenant&#39;s configuration.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<ListListTenantConfigurationViolationResult> listListTenantConfigurationViolation(ListListTenantConfigurationViolationArgs args) {
        return listListTenantConfigurationViolation(args, InvokeOptions.Empty);
    }
    /**
     * List of list of items that violate tenant&#39;s configuration.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<ListListTenantConfigurationViolationResult> listListTenantConfigurationViolation(ListListTenantConfigurationViolationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:listListTenantConfigurationViolation", TypeShape.of(ListListTenantConfigurationViolationResult.class), args, Utilities.withVersion(options));
    }
}
