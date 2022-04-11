// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.EnvironmentArgs;
import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.azurenative.labservices.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.labservices.outputs.ResourceSetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents an environment instance
 * API Version: 2018-10-15.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:Environment myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.LabServices/labaccounts/{labAccountName}/labs/{labName}/environmentsettings/{environmentSettingName}/environments/{environmentName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * The name or email address of the user who has claimed the environment
     * 
     */
    @Export(name="claimedByUserName", type=String.class, parameters={})
    private Output<String> claimedByUserName;

    /**
     * @return The name or email address of the user who has claimed the environment
     * 
     */
    public Output<String> getClaimedByUserName() {
        return this.claimedByUserName;
    }
    /**
     * The AAD object Id of the user who has claimed the environment
     * 
     */
    @Export(name="claimedByUserObjectId", type=String.class, parameters={})
    private Output<String> claimedByUserObjectId;

    /**
     * @return The AAD object Id of the user who has claimed the environment
     * 
     */
    public Output<String> getClaimedByUserObjectId() {
        return this.claimedByUserObjectId;
    }
    /**
     * The user principal Id of the user who has claimed the environment
     * 
     */
    @Export(name="claimedByUserPrincipalId", type=String.class, parameters={})
    private Output<String> claimedByUserPrincipalId;

    /**
     * @return The user principal Id of the user who has claimed the environment
     * 
     */
    public Output<String> getClaimedByUserPrincipalId() {
        return this.claimedByUserPrincipalId;
    }
    /**
     * Is the environment claimed or not
     * 
     */
    @Export(name="isClaimed", type=Boolean.class, parameters={})
    private Output<Boolean> isClaimed;

    /**
     * @return Is the environment claimed or not
     * 
     */
    public Output<Boolean> getIsClaimed() {
        return this.isClaimed;
    }
    /**
     * Last known power state of the environment
     * 
     */
    @Export(name="lastKnownPowerState", type=String.class, parameters={})
    private Output<String> lastKnownPowerState;

    /**
     * @return Last known power state of the environment
     * 
     */
    public Output<String> getLastKnownPowerState() {
        return this.lastKnownPowerState;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    @Export(name="latestOperationResult", type=LatestOperationResultResponse.class, parameters={})
    private Output<LatestOperationResultResponse> latestOperationResult;

    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    public Output<LatestOperationResultResponse> getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Network details of the environment
     * 
     */
    @Export(name="networkInterface", type=NetworkInterfaceResponse.class, parameters={})
    private Output<NetworkInterfaceResponse> networkInterface;

    /**
     * @return Network details of the environment
     * 
     */
    public Output<NetworkInterfaceResponse> getNetworkInterface() {
        return this.networkInterface;
    }
    /**
     * When the password was last reset on the environment.
     * 
     */
    @Export(name="passwordLastReset", type=String.class, parameters={})
    private Output<String> passwordLastReset;

    /**
     * @return When the password was last reset on the environment.
     * 
     */
    public Output<String> getPasswordLastReset() {
        return this.passwordLastReset;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The set of a VM and the setting id it was created for
     * 
     */
    @Export(name="resourceSets", type=ResourceSetResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetResponse> resourceSets;

    /**
     * @return The set of a VM and the setting id it was created for
     * 
     */
    public Output</* @Nullable */ ResourceSetResponse> getResourceSets() {
        return this.resourceSets;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * How long the environment has been used by a lab user
     * 
     */
    @Export(name="totalUsage", type=String.class, parameters={})
    private Output<String> totalUsage;

    /**
     * @return How long the environment has been used by a lab user
     * 
     */
    public Output<String> getTotalUsage() {
        return this.totalUsage;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Export(name="uniqueIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output</* @Nullable */ String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(String name, EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Environment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Environment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:labservices/v20181015:Environment").build())
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
    public static Environment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, options);
    }
}
