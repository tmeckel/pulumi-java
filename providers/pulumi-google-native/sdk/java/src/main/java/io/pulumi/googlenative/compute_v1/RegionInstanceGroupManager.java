// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.RegionInstanceGroupManagerArgs;
import io.pulumi.googlenative.compute_v1.outputs.DistributionPolicyResponse;
import io.pulumi.googlenative.compute_v1.outputs.InstanceGroupManagerActionsSummaryResponse;
import io.pulumi.googlenative.compute_v1.outputs.InstanceGroupManagerAutoHealingPolicyResponse;
import io.pulumi.googlenative.compute_v1.outputs.InstanceGroupManagerStatusResponse;
import io.pulumi.googlenative.compute_v1.outputs.InstanceGroupManagerUpdatePolicyResponse;
import io.pulumi.googlenative.compute_v1.outputs.InstanceGroupManagerVersionResponse;
import io.pulumi.googlenative.compute_v1.outputs.NamedPortResponse;
import io.pulumi.googlenative.compute_v1.outputs.StatefulPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a managed instance group using the information that you specify in the request. After the group is created, instances in the group are created using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method. A regional managed instance group can contain up to 2000 instances.
 * 
 */
@ResourceType(type="google-native:compute/v1:RegionInstanceGroupManager")
public class RegionInstanceGroupManager extends io.pulumi.resources.CustomResource {
    /**
     * The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    @OutputExport(name="autoHealingPolicies", type=List.class, parameters={InstanceGroupManagerAutoHealingPolicyResponse.class})
    private Output<List<InstanceGroupManagerAutoHealingPolicyResponse>> autoHealingPolicies;

    /**
     * @return The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    public Output<List<InstanceGroupManagerAutoHealingPolicyResponse>> getAutoHealingPolicies() {
        return this.autoHealingPolicies;
    }
    /**
     * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    @OutputExport(name="baseInstanceName", type=String.class, parameters={})
    private Output<String> baseInstanceName;

    /**
     * @return The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    public Output<String> getBaseInstanceName() {
        return this.baseInstanceName;
    }
    /**
     * The creation timestamp for this managed instance group in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return The creation timestamp for this managed instance group in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
     * 
     */
    @OutputExport(name="currentActions", type=InstanceGroupManagerActionsSummaryResponse.class, parameters={})
    private Output<InstanceGroupManagerActionsSummaryResponse> currentActions;

    /**
     * @return The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
     * 
     */
    public Output<InstanceGroupManagerActionsSummaryResponse> getCurrentActions() {
        return this.currentActions;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    @OutputExport(name="distributionPolicy", type=DistributionPolicyResponse.class, parameters={})
    private Output<DistributionPolicyResponse> distributionPolicy;

    /**
     * @return Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    public Output<DistributionPolicyResponse> getDistributionPolicy() {
        return this.distributionPolicy;
    }
    /**
     * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The URL of the Instance Group resource.
     * 
     */
    @OutputExport(name="instanceGroup", type=String.class, parameters={})
    private Output<String> instanceGroup;

    /**
     * @return The URL of the Instance Group resource.
     * 
     */
    public Output<String> getInstanceGroup() {
        return this.instanceGroup;
    }
    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
     * 
     */
    @OutputExport(name="instanceTemplate", type=String.class, parameters={})
    private Output<String> instanceTemplate;

    /**
     * @return The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
     * 
     */
    public Output<String> getInstanceTemplate() {
        return this.instanceTemplate;
    }
    /**
     * The resource type, which is always compute#instanceGroupManager for managed instance groups.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The resource type, which is always compute#instanceGroupManager for managed instance groups.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    @OutputExport(name="namedPorts", type=List.class, parameters={NamedPortResponse.class})
    private Output<List<NamedPortResponse>> namedPorts;

    /**
     * @return Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    public Output<List<NamedPortResponse>> getNamedPorts() {
        return this.namedPorts;
    }
    /**
     * The URL of the region where the managed instance group resides (for regional resources).
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The URL of the region where the managed instance group resides (for regional resources).
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URL for this managed instance group. The server defines this URL.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URL for this managed instance group. The server defines this URL.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Stateful configuration for this Instanced Group Manager
     * 
     */
    @OutputExport(name="statefulPolicy", type=StatefulPolicyResponse.class, parameters={})
    private Output<StatefulPolicyResponse> statefulPolicy;

    /**
     * @return Stateful configuration for this Instanced Group Manager
     * 
     */
    public Output<StatefulPolicyResponse> getStatefulPolicy() {
        return this.statefulPolicy;
    }
    /**
     * The status of this managed instance group.
     * 
     */
    @OutputExport(name="status", type=InstanceGroupManagerStatusResponse.class, parameters={})
    private Output<InstanceGroupManagerStatusResponse> status;

    /**
     * @return The status of this managed instance group.
     * 
     */
    public Output<InstanceGroupManagerStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    @OutputExport(name="targetPools", type=List.class, parameters={String.class})
    private Output<List<String>> targetPools;

    /**
     * @return The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    public Output<List<String>> getTargetPools() {
        return this.targetPools;
    }
    /**
     * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    @OutputExport(name="targetSize", type=Integer.class, parameters={})
    private Output<Integer> targetSize;

    /**
     * @return The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    public Output<Integer> getTargetSize() {
        return this.targetSize;
    }
    /**
     * The update policy for this managed instance group.
     * 
     */
    @OutputExport(name="updatePolicy", type=InstanceGroupManagerUpdatePolicyResponse.class, parameters={})
    private Output<InstanceGroupManagerUpdatePolicyResponse> updatePolicy;

    /**
     * @return The update policy for this managed instance group.
     * 
     */
    public Output<InstanceGroupManagerUpdatePolicyResponse> getUpdatePolicy() {
        return this.updatePolicy;
    }
    /**
     * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    @OutputExport(name="versions", type=List.class, parameters={InstanceGroupManagerVersionResponse.class})
    private Output<List<InstanceGroupManagerVersionResponse>> versions;

    /**
     * @return Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    public Output<List<InstanceGroupManagerVersionResponse>> getVersions() {
        return this.versions;
    }
    /**
     * The URL of a zone where the managed instance group is located (for zonal resources).
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The URL of a zone where the managed instance group is located (for zonal resources).
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionInstanceGroupManager(String name, RegionInstanceGroupManagerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionInstanceGroupManager", name, args == null ? RegionInstanceGroupManagerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionInstanceGroupManager(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionInstanceGroupManager", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static RegionInstanceGroupManager get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionInstanceGroupManager(name, id, options);
    }
}
