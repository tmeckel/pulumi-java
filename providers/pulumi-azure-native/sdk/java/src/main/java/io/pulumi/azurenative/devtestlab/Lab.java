// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.LabArgs;
import io.pulumi.azurenative.devtestlab.outputs.LabAnnouncementPropertiesResponse;
import io.pulumi.azurenative.devtestlab.outputs.LabSupportPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A lab.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devtestlab:Lab {labName} /subscriptions/{subscriptionId}/resourcegroups/resourceGroupName/providers/microsoft.devtestlab/labs/{labName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:Lab")
public class Lab extends io.pulumi.resources.CustomResource {
    /**
     * The properties of any lab announcement associated with this lab
     * 
     */
    @Export(name="announcement", type=LabAnnouncementPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LabAnnouncementPropertiesResponse> announcement;

    /**
     * @return The properties of any lab announcement associated with this lab
     * 
     */
    public Output</* @Nullable */ LabAnnouncementPropertiesResponse> getAnnouncement() {
        return this.announcement;
    }
    /**
     * The lab's artifact storage account.
     * 
     */
    @Export(name="artifactsStorageAccount", type=String.class, parameters={})
    private Output<String> artifactsStorageAccount;

    /**
     * @return The lab's artifact storage account.
     * 
     */
    public Output<String> getArtifactsStorageAccount() {
        return this.artifactsStorageAccount;
    }
    /**
     * The creation date of the lab.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the lab.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The lab's default premium storage account.
     * 
     */
    @Export(name="defaultPremiumStorageAccount", type=String.class, parameters={})
    private Output<String> defaultPremiumStorageAccount;

    /**
     * @return The lab's default premium storage account.
     * 
     */
    public Output<String> getDefaultPremiumStorageAccount() {
        return this.defaultPremiumStorageAccount;
    }
    /**
     * The lab's default storage account.
     * 
     */
    @Export(name="defaultStorageAccount", type=String.class, parameters={})
    private Output<String> defaultStorageAccount;

    /**
     * @return The lab's default storage account.
     * 
     */
    public Output<String> getDefaultStorageAccount() {
        return this.defaultStorageAccount;
    }
    /**
     * The access rights to be granted to the user when provisioning an environment
     * 
     */
    @Export(name="environmentPermission", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentPermission;

    /**
     * @return The access rights to be granted to the user when provisioning an environment
     * 
     */
    public Output</* @Nullable */ String> getEnvironmentPermission() {
        return this.environmentPermission;
    }
    /**
     * Extended properties of the lab used for experimental features
     * 
     */
    @Export(name="extendedProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> extendedProperties;

    /**
     * @return Extended properties of the lab used for experimental features
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getExtendedProperties() {
        return this.extendedProperties;
    }
    /**
     * Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
     */
    @Export(name="labStorageType", type=String.class, parameters={})
    private Output</* @Nullable */ String> labStorageType;

    /**
     * @return Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
     */
    public Output</* @Nullable */ String> getLabStorageType() {
        return this.labStorageType;
    }
    /**
     * The load balancer used to for lab VMs that use shared IP address.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The load balancer used to for lab VMs that use shared IP address.
     * 
     */
    public Output<String> getLoadBalancerId() {
        return this.loadBalancerId;
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
     * The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @Export(name="mandatoryArtifactsResourceIdsLinux", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsLinux;

    /**
     * @return The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    public Output</* @Nullable */ List<String>> getMandatoryArtifactsResourceIdsLinux() {
        return this.mandatoryArtifactsResourceIdsLinux;
    }
    /**
     * The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @Export(name="mandatoryArtifactsResourceIdsWindows", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsWindows;

    /**
     * @return The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    public Output</* @Nullable */ List<String>> getMandatoryArtifactsResourceIdsWindows() {
        return this.mandatoryArtifactsResourceIdsWindows;
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
     * The Network Security Group attached to the lab VMs Network interfaces to restrict open ports.
     * 
     */
    @Export(name="networkSecurityGroupId", type=String.class, parameters={})
    private Output<String> networkSecurityGroupId;

    /**
     * @return The Network Security Group attached to the lab VMs Network interfaces to restrict open ports.
     * 
     */
    public Output<String> getNetworkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }
    /**
     * The lab's premium data disk storage account.
     * 
     */
    @Export(name="premiumDataDiskStorageAccount", type=String.class, parameters={})
    private Output<String> premiumDataDiskStorageAccount;

    /**
     * @return The lab's premium data disk storage account.
     * 
     */
    public Output<String> getPremiumDataDiskStorageAccount() {
        return this.premiumDataDiskStorageAccount;
    }
    /**
     * The setting to enable usage of premium data disks.
     * When its value is 'Enabled', creation of standard or premium data disks is allowed.
     * When its value is 'Disabled', only creation of standard data disks is allowed.
     * 
     */
    @Export(name="premiumDataDisks", type=String.class, parameters={})
    private Output</* @Nullable */ String> premiumDataDisks;

    /**
     * @return The setting to enable usage of premium data disks.
     * When its value is 'Enabled', creation of standard or premium data disks is allowed.
     * When its value is 'Disabled', only creation of standard data disks is allowed.
     * 
     */
    public Output</* @Nullable */ String> getPremiumDataDisks() {
        return this.premiumDataDisks;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The public IP address for the lab's load balancer.
     * 
     */
    @Export(name="publicIpId", type=String.class, parameters={})
    private Output<String> publicIpId;

    /**
     * @return The public IP address for the lab's load balancer.
     * 
     */
    public Output<String> getPublicIpId() {
        return this.publicIpId;
    }
    /**
     * The properties of any lab support message associated with this lab
     * 
     */
    @Export(name="support", type=LabSupportPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LabSupportPropertiesResponse> support;

    /**
     * @return The properties of any lab support message associated with this lab
     * 
     */
    public Output</* @Nullable */ LabSupportPropertiesResponse> getSupport() {
        return this.support;
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
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * The lab's Key vault.
     * 
     */
    @Export(name="vaultName", type=String.class, parameters={})
    private Output<String> vaultName;

    /**
     * @return The lab's Key vault.
     * 
     */
    public Output<String> getVaultName() {
        return this.vaultName;
    }
    /**
     * The resource group in which all new lab virtual machines will be created. To let DevTest Labs manage resource group creation, set this value to null.
     * 
     */
    @Export(name="vmCreationResourceGroup", type=String.class, parameters={})
    private Output<String> vmCreationResourceGroup;

    /**
     * @return The resource group in which all new lab virtual machines will be created. To let DevTest Labs manage resource group creation, set this value to null.
     * 
     */
    public Output<String> getVmCreationResourceGroup() {
        return this.vmCreationResourceGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lab(String name) {
        this(name, LabArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lab(String name, LabArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lab(String name, LabArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Lab", name, args == null ? LabArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Lab(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Lab", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:devtestlab/v20150521preview:Lab").build()),
                Output.of(Alias.builder().type("azure-native:devtestlab/v20160515:Lab").build()),
                Output.of(Alias.builder().type("azure-native:devtestlab/v20180915:Lab").build())
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
    public static Lab get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Lab(name, id, options);
    }
}
