// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.HybridRunbookWorkerGroupArgs;
import io.pulumi.azurenative.automation.outputs.HybridRunbookWorkerLegacyResponse;
import io.pulumi.azurenative.automation.outputs.RunAsCredentialAssociationPropertyResponse;
import io.pulumi.azurenative.automation.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of hybrid runbook worker group.
 * API Version: 2021-06-22.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:HybridRunbookWorkerGroup TestHybridGroup /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/testaccount/hybridRunbookWorkerGroups/TestHybridGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:HybridRunbookWorkerGroup")
public class HybridRunbookWorkerGroup extends io.pulumi.resources.CustomResource {
    /**
     * Sets the credential of a worker group.
     * 
     */
    @Export(name="credential", type=RunAsCredentialAssociationPropertyResponse.class, parameters={})
    private Output</* @Nullable */ RunAsCredentialAssociationPropertyResponse> credential;

    /**
     * @return Sets the credential of a worker group.
     * 
     */
    public Output</* @Nullable */ RunAsCredentialAssociationPropertyResponse> getCredential() {
        return this.credential;
    }
    /**
     * Type of the HybridWorkerGroup.
     * 
     */
    @Export(name="groupType", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupType;

    /**
     * @return Type of the HybridWorkerGroup.
     * 
     */
    public Output</* @Nullable */ String> getGroupType() {
        return this.groupType;
    }
    /**
     * Gets or sets the list of hybrid runbook workers.
     * 
     */
    @Export(name="hybridRunbookWorkers", type=List.class, parameters={HybridRunbookWorkerLegacyResponse.class})
    private Output</* @Nullable */ List<HybridRunbookWorkerLegacyResponse>> hybridRunbookWorkers;

    /**
     * @return Gets or sets the list of hybrid runbook workers.
     * 
     */
    public Output</* @Nullable */ List<HybridRunbookWorkerLegacyResponse>> getHybridRunbookWorkers() {
        return this.hybridRunbookWorkers;
    }
    /**
     * Gets or sets the name of the group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Gets or sets the name of the group.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Resource system metadata.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Resource system metadata.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridRunbookWorkerGroup(String name) {
        this(name, HybridRunbookWorkerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridRunbookWorkerGroup(String name, HybridRunbookWorkerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridRunbookWorkerGroup(String name, HybridRunbookWorkerGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:HybridRunbookWorkerGroup", name, args == null ? HybridRunbookWorkerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HybridRunbookWorkerGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:HybridRunbookWorkerGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20210622:HybridRunbookWorkerGroup").build())
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
    public static HybridRunbookWorkerGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HybridRunbookWorkerGroup(name, id, options);
    }
}
