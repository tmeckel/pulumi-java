// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.AzurePowerShellScriptArgs;
import io.pulumi.azurenative.resources.outputs.ContainerConfigurationResponse;
import io.pulumi.azurenative.resources.outputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.resources.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.resources.outputs.ScriptStatusResponse;
import io.pulumi.azurenative.resources.outputs.StorageAccountConfigurationResponse;
import io.pulumi.azurenative.resources.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Object model for the Azure PowerShell script.
 * API Version: 2020-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:AzurePowerShellScript myresource1 /subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deploymentScripts/{scriptName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:AzurePowerShellScript")
public class AzurePowerShellScript extends io.pulumi.resources.CustomResource {
    /**
     * Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
     */
    @Export(name="arguments", type=String.class, parameters={})
    private Output</* @Nullable */ String> arguments;

    /**
     * @return Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
     */
    public Output</* @Nullable */ String> getArguments() {
        return this.arguments;
    }
    /**
     * Azure PowerShell module version to be used.
     * 
     */
    @Export(name="azPowerShellVersion", type=String.class, parameters={})
    private Output<String> azPowerShellVersion;

    /**
     * @return Azure PowerShell module version to be used.
     * 
     */
    public Output<String> getAzPowerShellVersion() {
        return this.azPowerShellVersion;
    }
    /**
     * The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
     */
    @Export(name="cleanupPreference", type=String.class, parameters={})
    private Output</* @Nullable */ String> cleanupPreference;

    /**
     * @return The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
     */
    public Output</* @Nullable */ String> getCleanupPreference() {
        return this.cleanupPreference;
    }
    /**
     * Container settings.
     * 
     */
    @Export(name="containerSettings", type=ContainerConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ ContainerConfigurationResponse> containerSettings;

    /**
     * @return Container settings.
     * 
     */
    public Output</* @Nullable */ ContainerConfigurationResponse> getContainerSettings() {
        return this.containerSettings;
    }
    /**
     * The environment variables to pass over to the script.
     * 
     */
    @Export(name="environmentVariables", type=List.class, parameters={EnvironmentVariableResponse.class})
    private Output</* @Nullable */ List<EnvironmentVariableResponse>> environmentVariables;

    /**
     * @return The environment variables to pass over to the script.
     * 
     */
    public Output</* @Nullable */ List<EnvironmentVariableResponse>> getEnvironmentVariables() {
        return this.environmentVariables;
    }
    /**
     * Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    @Export(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    public Output</* @Nullable */ String> getForceUpdateTag() {
        return this.forceUpdateTag;
    }
    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Type of the script.
     * Expected value is 'AzurePowerShell'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the script.
     * Expected value is 'AzurePowerShell'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the ACI and the storage account for the deployment script.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of script outputs.
     * 
     */
    @Export(name="outputs", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> outputs;

    /**
     * @return List of script outputs.
     * 
     */
    public Output<Map<String,Object>> getOutputs() {
        return this.outputs;
    }
    /**
     * Uri for the script. This is the entry point for the external script.
     * 
     */
    @Export(name="primaryScriptUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryScriptUri;

    /**
     * @return Uri for the script. This is the entry point for the external script.
     * 
     */
    public Output</* @Nullable */ String> getPrimaryScriptUri() {
        return this.primaryScriptUri;
    }
    /**
     * State of the script execution. This only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the script execution. This only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    @Export(name="retentionInterval", type=String.class, parameters={})
    private Output<String> retentionInterval;

    /**
     * @return Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    public Output<String> getRetentionInterval() {
        return this.retentionInterval;
    }
    /**
     * Script body.
     * 
     */
    @Export(name="scriptContent", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptContent;

    /**
     * @return Script body.
     * 
     */
    public Output</* @Nullable */ String> getScriptContent() {
        return this.scriptContent;
    }
    /**
     * Contains the results of script execution.
     * 
     */
    @Export(name="status", type=ScriptStatusResponse.class, parameters={})
    private Output<ScriptStatusResponse> status;

    /**
     * @return Contains the results of script execution.
     * 
     */
    public Output<ScriptStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * Storage Account settings.
     * 
     */
    @Export(name="storageAccountSettings", type=StorageAccountConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ StorageAccountConfigurationResponse> storageAccountSettings;

    /**
     * @return Storage Account settings.
     * 
     */
    public Output</* @Nullable */ StorageAccountConfigurationResponse> getStorageAccountSettings() {
        return this.storageAccountSettings;
    }
    /**
     * Supporting files for the external script.
     * 
     */
    @Export(name="supportingScriptUris", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportingScriptUris;

    /**
     * @return Supporting files for the external script.
     * 
     */
    public Output</* @Nullable */ List<String>> getSupportingScriptUris() {
        return this.supportingScriptUris;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeout;

    /**
     * @return Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    public Output</* @Nullable */ String> getTimeout() {
        return this.timeout;
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzurePowerShellScript(String name) {
        this(name, AzurePowerShellScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzurePowerShellScript(String name, AzurePowerShellScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzurePowerShellScript(String name, AzurePowerShellScriptArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:AzurePowerShellScript", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private AzurePowerShellScript(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:AzurePowerShellScript", name, null, makeResourceOptions(options, id));
    }

    private static AzurePowerShellScriptArgs makeArgs(AzurePowerShellScriptArgs args) {
        var builder = args == null ? AzurePowerShellScriptArgs.builder() : AzurePowerShellScriptArgs.builder(args);
        return builder
            .kind("AzurePowerShell")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20191001preview:AzurePowerShellScript").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20201001:AzurePowerShellScript").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AzurePowerShellScript get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AzurePowerShellScript(name, id, options);
    }
}
