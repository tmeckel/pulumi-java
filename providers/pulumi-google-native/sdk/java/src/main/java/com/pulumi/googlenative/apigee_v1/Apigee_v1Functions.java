// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee_v1.inputs.GetAliasArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetApiArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetApiProductArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetApicategoryArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetAppArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetArchiveDeploymentArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetCanaryEvaluationArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetDataCollectorArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetDatastoreArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetDebugSessionArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetDeveloperArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetEndpointAttachmentArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetEnvgroupArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetEnvgroupAttachmentArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetEnvironmentArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetExportArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetHostQueryArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetInstanceArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetInstanceAttachmentArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetKeyArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetKeystoreArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetNatAddressArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetOrganizationArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetOrganizationEnvironmentIamPolicyArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetOverrideArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetQueryArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetRatePlanArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetReferenceArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetReportArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetResourcefileArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetSharedflowArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetSubscriptionArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GetTargetServerArgs;
import com.pulumi.googlenative.apigee_v1.outputs.GetAliasResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetApiProductResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetApiResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetApicategoryResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetAppResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetArchiveDeploymentResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetCanaryEvaluationResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetDataCollectorResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetDatastoreResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetDebugSessionResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetDeveloperResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetEndpointAttachmentResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetEnvgroupAttachmentResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetEnvgroupResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetEnvironmentResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetExportResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetHostQueryResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetInstanceAttachmentResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetInstanceResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetKeyResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetKeystoreResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetNatAddressResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetOrganizationEnvironmentIamPolicyResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetOrganizationResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetOverrideResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetQueryResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetRatePlanResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetReferenceResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetReportResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetResourcefileResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetSharedflowResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetSubscriptionResult;
import com.pulumi.googlenative.apigee_v1.outputs.GetTargetServerResult;
import java.util.concurrent.CompletableFuture;

public final class Apigee_v1Functions {
    /**
     * Gets an alias.
     * 
     */
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args) {
        return getAlias(args, InvokeOptions.Empty);
    }
    /**
     * Gets an alias.
     * 
     */
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getAlias", TypeShape.of(GetAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an API proxy including a list of existing revisions.
     * 
     */
    public static CompletableFuture<GetApiResult> getApi(GetApiArgs args) {
        return getApi(args, InvokeOptions.Empty);
    }
    /**
     * Gets an API proxy including a list of existing revisions.
     * 
     */
    public static CompletableFuture<GetApiResult> getApi(GetApiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getApi", TypeShape.of(GetApiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets configuration details for an API product. The API product name required in the request URL is the internal name of the product, not the display name. While they may be the same, it depends on whether the API product was created via the UI or the API. View the list of API products to verify the internal name.
     * 
     */
    public static CompletableFuture<GetApiProductResult> getApiProduct(GetApiProductArgs args) {
        return getApiProduct(args, InvokeOptions.Empty);
    }
    /**
     * Gets configuration details for an API product. The API product name required in the request URL is the internal name of the product, not the display name. While they may be the same, it depends on whether the API product was created via the UI or the API. View the list of API products to verify the internal name.
     * 
     */
    public static CompletableFuture<GetApiProductResult> getApiProduct(GetApiProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getApiProduct", TypeShape.of(GetApiProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a category on the portal.
     * 
     */
    public static CompletableFuture<GetApicategoryResult> getApicategory(GetApicategoryArgs args) {
        return getApicategory(args, InvokeOptions.Empty);
    }
    /**
     * Gets a category on the portal.
     * 
     */
    public static CompletableFuture<GetApicategoryResult> getApicategory(GetApicategoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getApicategory", TypeShape.of(GetApicategoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the details for a developer app.
     * 
     */
    public static CompletableFuture<GetAppResult> getApp(GetAppArgs args) {
        return getApp(args, InvokeOptions.Empty);
    }
    /**
     * Returns the details for a developer app.
     * 
     */
    public static CompletableFuture<GetAppResult> getApp(GetAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getApp", TypeShape.of(GetAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified ArchiveDeployment.
     * 
     */
    public static CompletableFuture<GetArchiveDeploymentResult> getArchiveDeployment(GetArchiveDeploymentArgs args) {
        return getArchiveDeployment(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified ArchiveDeployment.
     * 
     */
    public static CompletableFuture<GetArchiveDeploymentResult> getArchiveDeployment(GetArchiveDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getArchiveDeployment", TypeShape.of(GetArchiveDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a CanaryEvaluation for an organization.
     * 
     */
    public static CompletableFuture<GetCanaryEvaluationResult> getCanaryEvaluation(GetCanaryEvaluationArgs args) {
        return getCanaryEvaluation(args, InvokeOptions.Empty);
    }
    /**
     * Gets a CanaryEvaluation for an organization.
     * 
     */
    public static CompletableFuture<GetCanaryEvaluationResult> getCanaryEvaluation(GetCanaryEvaluationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getCanaryEvaluation", TypeShape.of(GetCanaryEvaluationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a data collector.
     * 
     */
    public static CompletableFuture<GetDataCollectorResult> getDataCollector(GetDataCollectorArgs args) {
        return getDataCollector(args, InvokeOptions.Empty);
    }
    /**
     * Gets a data collector.
     * 
     */
    public static CompletableFuture<GetDataCollectorResult> getDataCollector(GetDataCollectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getDataCollector", TypeShape.of(GetDataCollectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a Datastore
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastore(GetDatastoreArgs args) {
        return getDatastore(args, InvokeOptions.Empty);
    }
    /**
     * Get a Datastore
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastore(GetDatastoreArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getDatastore", TypeShape.of(GetDatastoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a debug session.
     * 
     */
    public static CompletableFuture<GetDebugSessionResult> getDebugSession(GetDebugSessionArgs args) {
        return getDebugSession(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a debug session.
     * 
     */
    public static CompletableFuture<GetDebugSessionResult> getDebugSession(GetDebugSessionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getDebugSession", TypeShape.of(GetDebugSessionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the developer details, including the developer&#39;s name, email address, apps, and other information. **Note**: The response includes only the first 100 developer apps.
     * 
     */
    public static CompletableFuture<GetDeveloperResult> getDeveloper(GetDeveloperArgs args) {
        return getDeveloper(args, InvokeOptions.Empty);
    }
    /**
     * Returns the developer details, including the developer&#39;s name, email address, apps, and other information. **Note**: The response includes only the first 100 developer apps.
     * 
     */
    public static CompletableFuture<GetDeveloperResult> getDeveloper(GetDeveloperArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getDeveloper", TypeShape.of(GetDeveloperResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the endpoint attachment.
     * 
     */
    public static CompletableFuture<GetEndpointAttachmentResult> getEndpointAttachment(GetEndpointAttachmentArgs args) {
        return getEndpointAttachment(args, InvokeOptions.Empty);
    }
    /**
     * Gets the endpoint attachment.
     * 
     */
    public static CompletableFuture<GetEndpointAttachmentResult> getEndpointAttachment(GetEndpointAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getEndpointAttachment", TypeShape.of(GetEndpointAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an environment group.
     * 
     */
    public static CompletableFuture<GetEnvgroupResult> getEnvgroup(GetEnvgroupArgs args) {
        return getEnvgroup(args, InvokeOptions.Empty);
    }
    /**
     * Gets an environment group.
     * 
     */
    public static CompletableFuture<GetEnvgroupResult> getEnvgroup(GetEnvgroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getEnvgroup", TypeShape.of(GetEnvgroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an environment group attachment.
     * 
     */
    public static CompletableFuture<GetEnvgroupAttachmentResult> getEnvgroupAttachment(GetEnvgroupAttachmentArgs args) {
        return getEnvgroupAttachment(args, InvokeOptions.Empty);
    }
    /**
     * Gets an environment group attachment.
     * 
     */
    public static CompletableFuture<GetEnvgroupAttachmentResult> getEnvgroupAttachment(GetEnvgroupAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getEnvgroupAttachment", TypeShape.of(GetEnvgroupAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets environment details.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Gets environment details.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details and status of an analytics export job. If the export job is still in progress, its `state` is set to &#34;running&#34;. After the export job has completed successfully, its `state` is set to &#34;completed&#34;. If the export job fails, its `state` is set to `failed`.
     * 
     */
    public static CompletableFuture<GetExportResult> getExport(GetExportArgs args) {
        return getExport(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details and status of an analytics export job. If the export job is still in progress, its `state` is set to &#34;running&#34;. After the export job has completed successfully, its `state` is set to &#34;completed&#34;. If the export job fails, its `state` is set to `failed`.
     * 
     */
    public static CompletableFuture<GetExportResult> getExport(GetExportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getExport", TypeShape.of(GetExportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get status of a query submitted at host level. If the query is still in progress, the `state` is set to &#34;running&#34; After the query has completed successfully, `state` is set to &#34;completed&#34;
     * 
     */
    public static CompletableFuture<GetHostQueryResult> getHostQuery(GetHostQueryArgs args) {
        return getHostQuery(args, InvokeOptions.Empty);
    }
    /**
     * Get status of a query submitted at host level. If the query is still in progress, the `state` is set to &#34;running&#34; After the query has completed successfully, `state` is set to &#34;completed&#34;
     * 
     */
    public static CompletableFuture<GetHostQueryResult> getHostQuery(GetHostQueryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getHostQuery", TypeShape.of(GetHostQueryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details for an Apigee runtime instance. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details for an Apigee runtime instance. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an attachment. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public static CompletableFuture<GetInstanceAttachmentResult> getInstanceAttachment(GetInstanceAttachmentArgs args) {
        return getInstanceAttachment(args, InvokeOptions.Empty);
    }
    /**
     * Gets an attachment. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public static CompletableFuture<GetInstanceAttachmentResult> getInstanceAttachment(GetInstanceAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getInstanceAttachment", TypeShape.of(GetInstanceAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details for a consumer key for a developer app, including the key and secret value, associated API products, and other information.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    /**
     * Gets details for a consumer key for a developer app, including the key and secret value, associated API products, and other information.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a keystore or truststore.
     * 
     */
    public static CompletableFuture<GetKeystoreResult> getKeystore(GetKeystoreArgs args) {
        return getKeystore(args, InvokeOptions.Empty);
    }
    /**
     * Gets a keystore or truststore.
     * 
     */
    public static CompletableFuture<GetKeystoreResult> getKeystore(GetKeystoreArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getKeystore", TypeShape.of(GetKeystoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a NAT address. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public static CompletableFuture<GetNatAddressResult> getNatAddress(GetNatAddressArgs args) {
        return getNatAddress(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a NAT address. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public static CompletableFuture<GetNatAddressResult> getNatAddress(GetNatAddressArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getNatAddress", TypeShape.of(GetNatAddressResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the profile for an Apigee organization. See [Understanding organizations](https://cloud.google.com/apigee/docs/api-platform/fundamentals/organization-structure).
     * 
     */
    public static CompletableFuture<GetOrganizationResult> getOrganization(GetOrganizationArgs args) {
        return getOrganization(args, InvokeOptions.Empty);
    }
    /**
     * Gets the profile for an Apigee organization. See [Understanding organizations](https://cloud.google.com/apigee/docs/api-platform/fundamentals/organization-structure).
     * 
     */
    public static CompletableFuture<GetOrganizationResult> getOrganization(GetOrganizationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getOrganization", TypeShape.of(GetOrganizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy on an environment. For more information, see [Manage users, roles, and permissions using the API](https://cloud.google.com/apigee/docs/api-platform/system-administration/manage-users-roles). You must have the `apigee.environments.getIamPolicy` permission to call this API.
     * 
     */
    public static CompletableFuture<GetOrganizationEnvironmentIamPolicyResult> getOrganizationEnvironmentIamPolicy(GetOrganizationEnvironmentIamPolicyArgs args) {
        return getOrganizationEnvironmentIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy on an environment. For more information, see [Manage users, roles, and permissions using the API](https://cloud.google.com/apigee/docs/api-platform/system-administration/manage-users-roles). You must have the `apigee.environments.getIamPolicy` permission to call this API.
     * 
     */
    public static CompletableFuture<GetOrganizationEnvironmentIamPolicyResult> getOrganizationEnvironmentIamPolicy(GetOrganizationEnvironmentIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getOrganizationEnvironmentIamPolicy", TypeShape.of(GetOrganizationEnvironmentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a trace configuration override.
     * 
     */
    public static CompletableFuture<GetOverrideResult> getOverride(GetOverrideArgs args) {
        return getOverride(args, InvokeOptions.Empty);
    }
    /**
     * Gets a trace configuration override.
     * 
     */
    public static CompletableFuture<GetOverrideResult> getOverride(GetOverrideArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getOverride", TypeShape.of(GetOverrideResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get query status If the query is still in progress, the `state` is set to &#34;running&#34; After the query has completed successfully, `state` is set to &#34;completed&#34;
     * 
     */
    public static CompletableFuture<GetQueryResult> getQuery(GetQueryArgs args) {
        return getQuery(args, InvokeOptions.Empty);
    }
    /**
     * Get query status If the query is still in progress, the `state` is set to &#34;running&#34; After the query has completed successfully, `state` is set to &#34;completed&#34;
     * 
     */
    public static CompletableFuture<GetQueryResult> getQuery(GetQueryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getQuery", TypeShape.of(GetQueryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a rate plan.
     * 
     */
    public static CompletableFuture<GetRatePlanResult> getRatePlan(GetRatePlanArgs args) {
        return getRatePlan(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a rate plan.
     * 
     */
    public static CompletableFuture<GetRatePlanResult> getRatePlan(GetRatePlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getRatePlan", TypeShape.of(GetRatePlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a Reference resource.
     * 
     */
    public static CompletableFuture<GetReferenceResult> getReference(GetReferenceArgs args) {
        return getReference(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Reference resource.
     * 
     */
    public static CompletableFuture<GetReferenceResult> getReference(GetReferenceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getReference", TypeShape.of(GetReferenceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve a custom report definition.
     * 
     */
    public static CompletableFuture<GetReportResult> getReport(GetReportArgs args) {
        return getReport(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve a custom report definition.
     * 
     */
    public static CompletableFuture<GetReportResult> getReport(GetReportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getReport", TypeShape.of(GetReportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the contents of a resource file. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
     * 
     */
    public static CompletableFuture<GetResourcefileResult> getResourcefile(GetResourcefileArgs args) {
        return getResourcefile(args, InvokeOptions.Empty);
    }
    /**
     * Gets the contents of a resource file. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
     * 
     */
    public static CompletableFuture<GetResourcefileResult> getResourcefile(GetResourcefileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getResourcefile", TypeShape.of(GetResourcefileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a shared flow by name, including a list of its revisions.
     * 
     */
    public static CompletableFuture<GetSharedflowResult> getSharedflow(GetSharedflowArgs args) {
        return getSharedflow(args, InvokeOptions.Empty);
    }
    /**
     * Gets a shared flow by name, including a list of its revisions.
     * 
     */
    public static CompletableFuture<GetSharedflowResult> getSharedflow(GetSharedflowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getSharedflow", TypeShape.of(GetSharedflowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details for an API product subscription.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args) {
        return getSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Gets details for an API product subscription.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getSubscription", TypeShape.of(GetSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a TargetServer resource.
     * 
     */
    public static CompletableFuture<GetTargetServerResult> getTargetServer(GetTargetServerArgs args) {
        return getTargetServer(args, InvokeOptions.Empty);
    }
    /**
     * Gets a TargetServer resource.
     * 
     */
    public static CompletableFuture<GetTargetServerResult> getTargetServer(GetTargetServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getTargetServer", TypeShape.of(GetTargetServerResult.class), args, Utilities.withVersion(options));
    }
}
