// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.inputs.GetActionGroupArgs;
import com.pulumi.azurenative.insights.inputs.GetActivityLogAlertArgs;
import com.pulumi.azurenative.insights.inputs.GetAlertRuleArgs;
import com.pulumi.azurenative.insights.inputs.GetAnalyticsItemArgs;
import com.pulumi.azurenative.insights.inputs.GetAutoscaleSettingArgs;
import com.pulumi.azurenative.insights.inputs.GetComponentArgs;
import com.pulumi.azurenative.insights.inputs.GetComponentCurrentBillingFeatureArgs;
import com.pulumi.azurenative.insights.inputs.GetComponentLinkedStorageAccountArgs;
import com.pulumi.azurenative.insights.inputs.GetDataCollectionEndpointArgs;
import com.pulumi.azurenative.insights.inputs.GetDataCollectionRuleArgs;
import com.pulumi.azurenative.insights.inputs.GetDataCollectionRuleAssociationArgs;
import com.pulumi.azurenative.insights.inputs.GetDiagnosticServiceTokenReadOnlyArgs;
import com.pulumi.azurenative.insights.inputs.GetDiagnosticServiceTokenReadWriteArgs;
import com.pulumi.azurenative.insights.inputs.GetDiagnosticSettingArgs;
import com.pulumi.azurenative.insights.inputs.GetExportConfigurationArgs;
import com.pulumi.azurenative.insights.inputs.GetFavoriteArgs;
import com.pulumi.azurenative.insights.inputs.GetGuestDiagnosticsSettingsAssociationArgs;
import com.pulumi.azurenative.insights.inputs.GetLiveTokenArgs;
import com.pulumi.azurenative.insights.inputs.GetLogProfileArgs;
import com.pulumi.azurenative.insights.inputs.GetManagementGroupDiagnosticSettingArgs;
import com.pulumi.azurenative.insights.inputs.GetMetricAlertArgs;
import com.pulumi.azurenative.insights.inputs.GetMyWorkbookArgs;
import com.pulumi.azurenative.insights.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.insights.inputs.GetPrivateLinkScopeArgs;
import com.pulumi.azurenative.insights.inputs.GetPrivateLinkScopedResourceArgs;
import com.pulumi.azurenative.insights.inputs.GetProactiveDetectionConfigurationArgs;
import com.pulumi.azurenative.insights.inputs.GetScheduledQueryRuleArgs;
import com.pulumi.azurenative.insights.inputs.GetSubscriptionDiagnosticSettingArgs;
import com.pulumi.azurenative.insights.inputs.GetTestResultFileArgs;
import com.pulumi.azurenative.insights.inputs.GetWebTestArgs;
import com.pulumi.azurenative.insights.inputs.GetWorkbookArgs;
import com.pulumi.azurenative.insights.inputs.GetWorkbookTemplateArgs;
import com.pulumi.azurenative.insights.inputs.GetguestDiagnosticsSettingArgs;
import com.pulumi.azurenative.insights.inputs.ListEASubscriptionListMigrationDatePostArgs;
import com.pulumi.azurenative.insights.outputs.GetActionGroupResult;
import com.pulumi.azurenative.insights.outputs.GetActivityLogAlertResult;
import com.pulumi.azurenative.insights.outputs.GetAlertRuleResult;
import com.pulumi.azurenative.insights.outputs.GetAnalyticsItemResult;
import com.pulumi.azurenative.insights.outputs.GetAutoscaleSettingResult;
import com.pulumi.azurenative.insights.outputs.GetComponentCurrentBillingFeatureResult;
import com.pulumi.azurenative.insights.outputs.GetComponentLinkedStorageAccountResult;
import com.pulumi.azurenative.insights.outputs.GetComponentResult;
import com.pulumi.azurenative.insights.outputs.GetDataCollectionEndpointResult;
import com.pulumi.azurenative.insights.outputs.GetDataCollectionRuleAssociationResult;
import com.pulumi.azurenative.insights.outputs.GetDataCollectionRuleResult;
import com.pulumi.azurenative.insights.outputs.GetDiagnosticServiceTokenReadOnlyResult;
import com.pulumi.azurenative.insights.outputs.GetDiagnosticServiceTokenReadWriteResult;
import com.pulumi.azurenative.insights.outputs.GetDiagnosticSettingResult;
import com.pulumi.azurenative.insights.outputs.GetExportConfigurationResult;
import com.pulumi.azurenative.insights.outputs.GetFavoriteResult;
import com.pulumi.azurenative.insights.outputs.GetGuestDiagnosticsSettingsAssociationResult;
import com.pulumi.azurenative.insights.outputs.GetLiveTokenResult;
import com.pulumi.azurenative.insights.outputs.GetLogProfileResult;
import com.pulumi.azurenative.insights.outputs.GetManagementGroupDiagnosticSettingResult;
import com.pulumi.azurenative.insights.outputs.GetMetricAlertResult;
import com.pulumi.azurenative.insights.outputs.GetMyWorkbookResult;
import com.pulumi.azurenative.insights.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.insights.outputs.GetPrivateLinkScopeResult;
import com.pulumi.azurenative.insights.outputs.GetPrivateLinkScopedResourceResult;
import com.pulumi.azurenative.insights.outputs.GetProactiveDetectionConfigurationResult;
import com.pulumi.azurenative.insights.outputs.GetScheduledQueryRuleResult;
import com.pulumi.azurenative.insights.outputs.GetSubscriptionDiagnosticSettingResult;
import com.pulumi.azurenative.insights.outputs.GetTestResultFileResult;
import com.pulumi.azurenative.insights.outputs.GetWebTestResult;
import com.pulumi.azurenative.insights.outputs.GetWorkbookResult;
import com.pulumi.azurenative.insights.outputs.GetWorkbookTemplateResult;
import com.pulumi.azurenative.insights.outputs.GetguestDiagnosticsSettingResult;
import com.pulumi.azurenative.insights.outputs.ListEASubscriptionListMigrationDatePostResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class InsightsFunctions {
    /**
     * An action group resource.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetActionGroupResult> getActionGroup(GetActionGroupArgs args) {
        return getActionGroup(args, InvokeOptions.Empty);
    }
    /**
     * An action group resource.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetActionGroupResult> getActionGroup(GetActionGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getActionGroup", TypeShape.of(GetActionGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Activity Log Alert rule resource.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetActivityLogAlertResult> getActivityLogAlert(GetActivityLogAlertArgs args) {
        return getActivityLogAlert(args, InvokeOptions.Empty);
    }
    /**
     * An Activity Log Alert rule resource.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetActivityLogAlertResult> getActivityLogAlert(GetActivityLogAlertArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getActivityLogAlert", TypeShape.of(GetActivityLogAlertResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The alert rule resource.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetAlertRuleResult> getAlertRule(GetAlertRuleArgs args) {
        return getAlertRule(args, InvokeOptions.Empty);
    }
    /**
     * The alert rule resource.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetAlertRuleResult> getAlertRule(GetAlertRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getAlertRule", TypeShape.of(GetAlertRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Properties that define an Analytics item that is associated to an Application Insights component.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetAnalyticsItemResult> getAnalyticsItem(GetAnalyticsItemArgs args) {
        return getAnalyticsItem(args, InvokeOptions.Empty);
    }
    /**
     * Properties that define an Analytics item that is associated to an Application Insights component.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetAnalyticsItemResult> getAnalyticsItem(GetAnalyticsItemArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getAnalyticsItem", TypeShape.of(GetAnalyticsItemResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The autoscale setting resource.
     * API Version: 2015-04-01.
     * 
     */
    public static CompletableFuture<GetAutoscaleSettingResult> getAutoscaleSetting(GetAutoscaleSettingArgs args) {
        return getAutoscaleSetting(args, InvokeOptions.Empty);
    }
    /**
     * The autoscale setting resource.
     * API Version: 2015-04-01.
     * 
     */
    public static CompletableFuture<GetAutoscaleSettingResult> getAutoscaleSetting(GetAutoscaleSettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getAutoscaleSetting", TypeShape.of(GetAutoscaleSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Application Insights component definition.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetComponentResult> getComponent(GetComponentArgs args) {
        return getComponent(args, InvokeOptions.Empty);
    }
    /**
     * An Application Insights component definition.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetComponentResult> getComponent(GetComponentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getComponent", TypeShape.of(GetComponentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Application Insights component billing features
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetComponentCurrentBillingFeatureResult> getComponentCurrentBillingFeature(GetComponentCurrentBillingFeatureArgs args) {
        return getComponentCurrentBillingFeature(args, InvokeOptions.Empty);
    }
    /**
     * An Application Insights component billing features
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetComponentCurrentBillingFeatureResult> getComponentCurrentBillingFeature(GetComponentCurrentBillingFeatureArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getComponentCurrentBillingFeature", TypeShape.of(GetComponentCurrentBillingFeatureResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Application Insights component linked storage accounts
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetComponentLinkedStorageAccountResult> getComponentLinkedStorageAccount(GetComponentLinkedStorageAccountArgs args) {
        return getComponentLinkedStorageAccount(args, InvokeOptions.Empty);
    }
    /**
     * An Application Insights component linked storage accounts
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetComponentLinkedStorageAccountResult> getComponentLinkedStorageAccount(GetComponentLinkedStorageAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getComponentLinkedStorageAccount", TypeShape.of(GetComponentLinkedStorageAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of ARM tracked top level resource.
     * API Version: 2021-09-01-preview.
     * 
     */
    public static CompletableFuture<GetDataCollectionEndpointResult> getDataCollectionEndpoint(GetDataCollectionEndpointArgs args) {
        return getDataCollectionEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Definition of ARM tracked top level resource.
     * API Version: 2021-09-01-preview.
     * 
     */
    public static CompletableFuture<GetDataCollectionEndpointResult> getDataCollectionEndpoint(GetDataCollectionEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDataCollectionEndpoint", TypeShape.of(GetDataCollectionEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of ARM tracked top level resource.
     * API Version: 2019-11-01-preview.
     * 
     */
    public static CompletableFuture<GetDataCollectionRuleResult> getDataCollectionRule(GetDataCollectionRuleArgs args) {
        return getDataCollectionRule(args, InvokeOptions.Empty);
    }
    /**
     * Definition of ARM tracked top level resource.
     * API Version: 2019-11-01-preview.
     * 
     */
    public static CompletableFuture<GetDataCollectionRuleResult> getDataCollectionRule(GetDataCollectionRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDataCollectionRule", TypeShape.of(GetDataCollectionRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of generic ARM proxy resource.
     * API Version: 2019-11-01-preview.
     * 
     */
    public static CompletableFuture<GetDataCollectionRuleAssociationResult> getDataCollectionRuleAssociation(GetDataCollectionRuleAssociationArgs args) {
        return getDataCollectionRuleAssociation(args, InvokeOptions.Empty);
    }
    /**
     * Definition of generic ARM proxy resource.
     * API Version: 2019-11-01-preview.
     * 
     */
    public static CompletableFuture<GetDataCollectionRuleAssociationResult> getDataCollectionRuleAssociation(GetDataCollectionRuleAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDataCollectionRuleAssociation", TypeShape.of(GetDataCollectionRuleAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response to a diagnostic services token query.
     * API Version: 2021-03-03-preview.
     * 
     */
    public static CompletableFuture<GetDiagnosticServiceTokenReadOnlyResult> getDiagnosticServiceTokenReadOnly(GetDiagnosticServiceTokenReadOnlyArgs args) {
        return getDiagnosticServiceTokenReadOnly(args, InvokeOptions.Empty);
    }
    /**
     * The response to a diagnostic services token query.
     * API Version: 2021-03-03-preview.
     * 
     */
    public static CompletableFuture<GetDiagnosticServiceTokenReadOnlyResult> getDiagnosticServiceTokenReadOnly(GetDiagnosticServiceTokenReadOnlyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDiagnosticServiceTokenReadOnly", TypeShape.of(GetDiagnosticServiceTokenReadOnlyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response to a diagnostic services token query.
     * API Version: 2021-03-03-preview.
     * 
     */
    public static CompletableFuture<GetDiagnosticServiceTokenReadWriteResult> getDiagnosticServiceTokenReadWrite(GetDiagnosticServiceTokenReadWriteArgs args) {
        return getDiagnosticServiceTokenReadWrite(args, InvokeOptions.Empty);
    }
    /**
     * The response to a diagnostic services token query.
     * API Version: 2021-03-03-preview.
     * 
     */
    public static CompletableFuture<GetDiagnosticServiceTokenReadWriteResult> getDiagnosticServiceTokenReadWrite(GetDiagnosticServiceTokenReadWriteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDiagnosticServiceTokenReadWrite", TypeShape.of(GetDiagnosticServiceTokenReadWriteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The diagnostic setting resource.
     * API Version: 2017-05-01-preview.
     * 
     */
    public static CompletableFuture<GetDiagnosticSettingResult> getDiagnosticSetting(GetDiagnosticSettingArgs args) {
        return getDiagnosticSetting(args, InvokeOptions.Empty);
    }
    /**
     * The diagnostic setting resource.
     * API Version: 2017-05-01-preview.
     * 
     */
    public static CompletableFuture<GetDiagnosticSettingResult> getDiagnosticSetting(GetDiagnosticSettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDiagnosticSetting", TypeShape.of(GetDiagnosticSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Properties that define a Continuous Export configuration.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetExportConfigurationResult> getExportConfiguration(GetExportConfigurationArgs args) {
        return getExportConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Properties that define a Continuous Export configuration.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetExportConfigurationResult> getExportConfiguration(GetExportConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getExportConfiguration", TypeShape.of(GetExportConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Properties that define a favorite that is associated to an Application Insights component.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetFavoriteResult> getFavorite(GetFavoriteArgs args) {
        return getFavorite(args, InvokeOptions.Empty);
    }
    /**
     * Properties that define a favorite that is associated to an Application Insights component.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetFavoriteResult> getFavorite(GetFavoriteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getFavorite", TypeShape.of(GetFavoriteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Virtual machine guest diagnostic settings resource.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetGuestDiagnosticsSettingsAssociationResult> getGuestDiagnosticsSettingsAssociation(GetGuestDiagnosticsSettingsAssociationArgs args) {
        return getGuestDiagnosticsSettingsAssociation(args, InvokeOptions.Empty);
    }
    /**
     * Virtual machine guest diagnostic settings resource.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetGuestDiagnosticsSettingsAssociationResult> getGuestDiagnosticsSettingsAssociation(GetGuestDiagnosticsSettingsAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getGuestDiagnosticsSettingsAssociation", TypeShape.of(GetGuestDiagnosticsSettingsAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response to a live token query.
     * API Version: 2020-06-02-preview.
     * 
     */
    public static CompletableFuture<GetLiveTokenResult> getLiveToken(GetLiveTokenArgs args) {
        return getLiveToken(args, InvokeOptions.Empty);
    }
    /**
     * The response to a live token query.
     * API Version: 2020-06-02-preview.
     * 
     */
    public static CompletableFuture<GetLiveTokenResult> getLiveToken(GetLiveTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getLiveToken", TypeShape.of(GetLiveTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The log profile resource.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetLogProfileResult> getLogProfile(GetLogProfileArgs args) {
        return getLogProfile(args, InvokeOptions.Empty);
    }
    /**
     * The log profile resource.
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetLogProfileResult> getLogProfile(GetLogProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getLogProfile", TypeShape.of(GetLogProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The management group diagnostic setting resource.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetManagementGroupDiagnosticSettingResult> getManagementGroupDiagnosticSetting(GetManagementGroupDiagnosticSettingArgs args) {
        return getManagementGroupDiagnosticSetting(args, InvokeOptions.Empty);
    }
    /**
     * The management group diagnostic setting resource.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetManagementGroupDiagnosticSettingResult> getManagementGroupDiagnosticSetting(GetManagementGroupDiagnosticSettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getManagementGroupDiagnosticSetting", TypeShape.of(GetManagementGroupDiagnosticSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The metric alert resource.
     * API Version: 2018-03-01.
     * 
     */
    public static CompletableFuture<GetMetricAlertResult> getMetricAlert(GetMetricAlertArgs args) {
        return getMetricAlert(args, InvokeOptions.Empty);
    }
    /**
     * The metric alert resource.
     * API Version: 2018-03-01.
     * 
     */
    public static CompletableFuture<GetMetricAlertResult> getMetricAlert(GetMetricAlertArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getMetricAlert", TypeShape.of(GetMetricAlertResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Application Insights private workbook definition.
     * API Version: 2020-10-20.
     * 
     */
    public static CompletableFuture<GetMyWorkbookResult> getMyWorkbook(GetMyWorkbookArgs args) {
        return getMyWorkbook(args, InvokeOptions.Empty);
    }
    /**
     * An Application Insights private workbook definition.
     * API Version: 2020-10-20.
     * 
     */
    public static CompletableFuture<GetMyWorkbookResult> getMyWorkbook(GetMyWorkbookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getMyWorkbook", TypeShape.of(GetMyWorkbookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * A private endpoint connection
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Azure Monitor PrivateLinkScope definition.
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetPrivateLinkScopeResult> getPrivateLinkScope(GetPrivateLinkScopeArgs args) {
        return getPrivateLinkScope(args, InvokeOptions.Empty);
    }
    /**
     * An Azure Monitor PrivateLinkScope definition.
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetPrivateLinkScopeResult> getPrivateLinkScope(GetPrivateLinkScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getPrivateLinkScope", TypeShape.of(GetPrivateLinkScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private link scoped resource
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetPrivateLinkScopedResourceResult> getPrivateLinkScopedResource(GetPrivateLinkScopedResourceArgs args) {
        return getPrivateLinkScopedResource(args, InvokeOptions.Empty);
    }
    /**
     * A private link scoped resource
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetPrivateLinkScopedResourceResult> getPrivateLinkScopedResource(GetPrivateLinkScopedResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getPrivateLinkScopedResource", TypeShape.of(GetPrivateLinkScopedResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Properties that define a ProactiveDetection configuration.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetProactiveDetectionConfigurationResult> getProactiveDetectionConfiguration(GetProactiveDetectionConfigurationArgs args) {
        return getProactiveDetectionConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Properties that define a ProactiveDetection configuration.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetProactiveDetectionConfigurationResult> getProactiveDetectionConfiguration(GetProactiveDetectionConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getProactiveDetectionConfiguration", TypeShape.of(GetProactiveDetectionConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Log Search Rule resource.
     * API Version: 2018-04-16.
     * 
     */
    public static CompletableFuture<GetScheduledQueryRuleResult> getScheduledQueryRule(GetScheduledQueryRuleArgs args) {
        return getScheduledQueryRule(args, InvokeOptions.Empty);
    }
    /**
     * The Log Search Rule resource.
     * API Version: 2018-04-16.
     * 
     */
    public static CompletableFuture<GetScheduledQueryRuleResult> getScheduledQueryRule(GetScheduledQueryRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getScheduledQueryRule", TypeShape.of(GetScheduledQueryRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The subscription diagnostic setting resource.
     * API Version: 2017-05-01-preview.
     * 
     */
    public static CompletableFuture<GetSubscriptionDiagnosticSettingResult> getSubscriptionDiagnosticSetting(GetSubscriptionDiagnosticSettingArgs args) {
        return getSubscriptionDiagnosticSetting(args, InvokeOptions.Empty);
    }
    /**
     * The subscription diagnostic setting resource.
     * API Version: 2017-05-01-preview.
     * 
     */
    public static CompletableFuture<GetSubscriptionDiagnosticSettingResult> getSubscriptionDiagnosticSetting(GetSubscriptionDiagnosticSettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getSubscriptionDiagnosticSetting", TypeShape.of(GetSubscriptionDiagnosticSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Test result.
     * API Version: 2020-02-10-preview.
     * 
     */
    public static CompletableFuture<GetTestResultFileResult> getTestResultFile(GetTestResultFileArgs args) {
        return getTestResultFile(args, InvokeOptions.Empty);
    }
    /**
     * Test result.
     * API Version: 2020-02-10-preview.
     * 
     */
    public static CompletableFuture<GetTestResultFileResult> getTestResultFile(GetTestResultFileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getTestResultFile", TypeShape.of(GetTestResultFileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Application Insights web test definition.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetWebTestResult> getWebTest(GetWebTestArgs args) {
        return getWebTest(args, InvokeOptions.Empty);
    }
    /**
     * An Application Insights web test definition.
     * API Version: 2015-05-01.
     * 
     */
    public static CompletableFuture<GetWebTestResult> getWebTest(GetWebTestArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getWebTest", TypeShape.of(GetWebTestResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Application Insights workbook definition.
     * API Version: 2020-10-20.
     * 
     */
    public static CompletableFuture<GetWorkbookResult> getWorkbook(GetWorkbookArgs args) {
        return getWorkbook(args, InvokeOptions.Empty);
    }
    /**
     * An Application Insights workbook definition.
     * API Version: 2020-10-20.
     * 
     */
    public static CompletableFuture<GetWorkbookResult> getWorkbook(GetWorkbookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getWorkbook", TypeShape.of(GetWorkbookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Application Insights workbook template definition.
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkbookTemplateResult> getWorkbookTemplate(GetWorkbookTemplateArgs args) {
        return getWorkbookTemplate(args, InvokeOptions.Empty);
    }
    /**
     * An Application Insights workbook template definition.
     * API Version: 2019-10-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkbookTemplateResult> getWorkbookTemplate(GetWorkbookTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getWorkbookTemplate", TypeShape.of(GetWorkbookTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Virtual machine guest diagnostics settings resource.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetguestDiagnosticsSettingResult> getguestDiagnosticsSetting(GetguestDiagnosticsSettingArgs args) {
        return getguestDiagnosticsSetting(args, InvokeOptions.Empty);
    }
    /**
     * Virtual machine guest diagnostics settings resource.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetguestDiagnosticsSettingResult> getguestDiagnosticsSetting(GetguestDiagnosticsSettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getguestDiagnosticsSetting", TypeShape.of(GetguestDiagnosticsSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Subscription migrate date information properties
     * API Version: 2017-10-01.
     * 
     */
    public static CompletableFuture<ListEASubscriptionListMigrationDatePostResult> listEASubscriptionListMigrationDatePost() {
        return listEASubscriptionListMigrationDatePost(ListEASubscriptionListMigrationDatePostArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Subscription migrate date information properties
     * API Version: 2017-10-01.
     * 
     */
    public static CompletableFuture<ListEASubscriptionListMigrationDatePostResult> listEASubscriptionListMigrationDatePost(ListEASubscriptionListMigrationDatePostArgs args) {
        return listEASubscriptionListMigrationDatePost(args, InvokeOptions.Empty);
    }
    /**
     * Subscription migrate date information properties
     * API Version: 2017-10-01.
     * 
     */
    public static CompletableFuture<ListEASubscriptionListMigrationDatePostResult> listEASubscriptionListMigrationDatePost(ListEASubscriptionListMigrationDatePostArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:listEASubscriptionListMigrationDatePost", TypeShape.of(ListEASubscriptionListMigrationDatePostResult.class), args, Utilities.withVersion(options));
    }
}
